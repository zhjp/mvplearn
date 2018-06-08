package com.zjp.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.zjp.mvp.adapter.DataAdapter;
import com.zjp.mvp.bean.DataBean;
import com.zjp.mvp.presenter.MainPresenter;
import com.zjp.mvp.view.IView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IView {

    private RecyclerView rv_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        new MainPresenter(this).fetch();
    }

    @Override
    public void showView(List<DataBean> data) {
        rv_list.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        DataAdapter adapter = new DataAdapter(this);
        adapter.setData(data);
        rv_list.setAdapter(adapter);

    }

    @Override
    public void closeLoading() {

    }

    private void initView() {
        rv_list = (RecyclerView) findViewById(R.id.rv_list);
    }
}
