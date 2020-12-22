package com.pinnoocle.weshare.event;

import com.pinnoocle.weshare.bean.UserShipBean;

public class SelectAddressEvent {
    public UserShipBean.DataBean getDataBean() {
        return dataBean;
    }

    private UserShipBean.DataBean dataBean;

    public SelectAddressEvent(UserShipBean.DataBean dataBean) {
        this.dataBean = dataBean;
    }
}
