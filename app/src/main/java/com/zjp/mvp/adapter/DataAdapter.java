package com.zjp.mvp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.zjp.mvp.R;
import com.zjp.mvp.bean.DataBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zjp on 2018/6/7.
 *
 * @author zjp
 * @date 2018/6/7
 */
public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MyRecycleHodler> {

    private Context mContext;
    private List<DataBean> mList = new ArrayList<>();
    private onRecyclerItemClickerListener mListener;

    public DataAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<DataBean> list){
        if(list != null){
            this.mList.clear();
            this.mList.addAll(list);
            notifyDataSetChanged();
        }
    }

    public List<DataBean> getList() {
        return mList;
    }

    public void setOnRecyclerItemClick(onRecyclerItemClickerListener listener){
        this.mListener = listener;
    }

    @Override
    public MyRecycleHodler onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_data_show,parent,false);
        return new MyRecycleHodler(view);
    }

    @Override
    public void onBindViewHolder(MyRecycleHodler holder, int position) {
        holder.iv.setImageResource(mList.get(position).getImageUrl());
        holder.tvTitle.setText(mList.get(position).getTitle());
        holder.tvDescription.setText(mList.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class MyRecycleHodler extends RecyclerView.ViewHolder{

        ImageView iv;
        TextView tvTitle;
        TextView tvDescription;

        public MyRecycleHodler(View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.iv_item_icon);
            tvTitle = itemView.findViewById(R.id.tv_item_title);
            tvDescription = itemView.findViewById(R.id.tv_item_description);

        }
    }

    public interface  onRecyclerItemClickerListener {
        void onItemClickListener(View view, Object data, int position);
    }
}
