package com.zjp.mvp.presenter;

import com.zjp.mvp.bean.DataBean;
import com.zjp.mvp.model.IModel;
import com.zjp.mvp.model.ModelImpl;
import com.zjp.mvp.view.IView;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by zjp on 2018/6/5.
 *
 * @author zjp
 * @date 2018/6/5
 */
public class MainPresenter< T extends IView> {

    WeakReference<T> mView;
    IModel mModel = new ModelImpl();

    public MainPresenter(T view){
        this.mView = new WeakReference<T>(view);
    }

    public void fetch(){
        if(mView != null && mModel != null){
            mModel.loadModel(new IModel.LoadModelListener() {
                @Override
                public void onComplete(List<DataBean> data) {
                    mView.get().showView(data);
                }
            });
        }
    }

}
