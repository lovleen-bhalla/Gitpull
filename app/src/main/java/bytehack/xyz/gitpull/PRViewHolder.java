package bytehack.xyz.gitpull;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;

import bytehack.xyz.gitpull.models.PullRequestModel;
import bytehack.xyz.gitpull.views.ListItemVH;

public class PRViewHolder extends ListItemVH<PullRequestModel> {

    private TextView prTitle, textCreatedOn, textClosedOn, textUserName;
    private LinearLayout layoutCreatedOn, layoutClosedOn;
    private ImageView userImageView;

    public PRViewHolder(View view) {
        super(view);
        prTitle = view.findViewById(R.id.text_pr_title);
        textCreatedOn = view.findViewById(R.id.text_created_on);
        textClosedOn = view.findViewById(R.id.text_closed_on);
        textUserName = view.findViewById(R.id.text_user_name);
        userImageView = view.findViewById(R.id.image_user);

        layoutCreatedOn = view.findViewById(R.id.layout_created_on);
        layoutClosedOn = view.findViewById(R.id.layout_closed_on);
    }

    public void bind(PullRequestModel pullRequestModel) {

        Picasso.get().load(pullRequestModel.getUserImage()).transform(new Transformation() {
            @Override
            public Bitmap transform(Bitmap source) {
                Resources res = userImageView.getContext().getResources();
                RoundedBitmapDrawable dr =
                        RoundedBitmapDrawableFactory.create(res, source);
                dr.setAntiAlias(true);
                dr.setCircular(true);
                Bitmap output = Bitmap.createBitmap(dr.getIntrinsicWidth(), dr.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(output);
                dr.setBounds(0, 0, canvas.getHeight(), canvas.getWidth());
                dr.draw(canvas);
                source.recycle();
                return output;
            }

            @Override
            public String key() {
                return "roundedCorner";
            }
        }).into(userImageView);

        prTitle.setText(pullRequestModel.getTitle());

        textUserName.setText(pullRequestModel.getUserName());


        if (!TextUtils.isEmpty(pullRequestModel.getCreatedDate())) {
            String createdDate = Utils.convertFormat(pullRequestModel.getCreatedDate(),
                    Utils.TIME_FORMAT_GITHUB,
                    Utils.TIME_FORMAT_DD_MM_YY);
            layoutCreatedOn.setVisibility(View.VISIBLE);
            textCreatedOn.setText(createdDate);
        } else {
            layoutCreatedOn.setVisibility(View.GONE);
        }


        if (!TextUtils.isEmpty(pullRequestModel.getClosedDate())) {
            String closedDate = Utils.convertFormat(pullRequestModel.getClosedDate(),
                    Utils.TIME_FORMAT_GITHUB,
                    Utils.TIME_FORMAT_DD_MM_YY);
            layoutClosedOn.setVisibility(View.VISIBLE);
            textClosedOn.setText(closedDate);
        } else {
            layoutClosedOn.setVisibility(View.GONE);
        }
    }
}
