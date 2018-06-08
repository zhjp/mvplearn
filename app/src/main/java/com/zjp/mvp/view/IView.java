package com.zjp.mvp.view;

import com.zjp.mvp.bean.DataBean;

import java.util.List;

/**
 * Created by zjp on 2018/6/5.
 *
 * @author zjp
 * @date 2018/6/5
 */
public interface IView {

    /**
     * 展示界面
     */
    void showView(List<DataBean> data);

    void closeLoading();


}
