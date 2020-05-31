package bytehack.xyz.gitpull.views;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public abstract class ListItemVH<T> extends RecyclerView.ViewHolder {

    public ListItemVH(@NonNull View itemView) {
        super(itemView);
    }

    public abstract void bind(T t);
}
