package bytehack.xyz.gitpull;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import bytehack.xyz.gitpull.models.PullRequestModel;

public class PRListAdapter extends RecyclerView.Adapter<PRViewHolder> {

    private List<PullRequestModel> mDataList = new ArrayList<>();

    @NonNull
    @Override
    public PRViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_pull_request, parent, false);
        return new PRViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PRViewHolder holder, int position) {
        holder.bind(mDataList.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public void addItems(List<PullRequestModel> prList) {
        int currentSize = mDataList.size();
        mDataList.addAll(prList);
        notifyItemRangeInserted(currentSize, prList.size());
    }

    public void setDataList(List<PullRequestModel> dataList) {
        this.mDataList = dataList;
        notifyDataSetChanged();
    }

    public void clear() {
        mDataList.clear();
        notifyDataSetChanged();
    }

    public void setLoading(boolean isLoading) {

    }
}
