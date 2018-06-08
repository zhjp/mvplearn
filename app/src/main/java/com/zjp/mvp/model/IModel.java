package com.zjp.mvp.model;

import com.zjp.mvp.bean.DataBean;

import java.util.List;

/**
 * Created by zjp on 2018/6/7.
 *
 * @author zjp
 * @date 2018/6/7
 */
public interface IModel {

    void loadModel(LoadModelListener modelListener);

    interface LoadModelListener {
        void onComplete(List<DataBean> data);
    }

}
