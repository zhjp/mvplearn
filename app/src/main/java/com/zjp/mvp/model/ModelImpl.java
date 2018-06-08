package com.zjp.mvp.model;

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
public class ModelImpl implements IModel {
    @Override
    public void loadModel(LoadModelListener modelListener) {
        List<DataBean> list = new ArrayList<>();
        list.add(new DataBean("鞠神最美丽！","鞠神好漂漂！", R.mipmap.p1));
        list.add(new DataBean("鞠神普通装束，应该也很好看！","鞠神是真的好漂量！", R.mipmap.p2));
        list.add(new DataBean("鞠神3","鞠婧祎这张也不错的样子！", R.mipmap.p3));
        list.add(new DataBean("鞠神的照片最终版！","鞠婧祎  哦你啊私有！", R.mipmap.p4));
        modelListener.onComplete(list);
    }
}
