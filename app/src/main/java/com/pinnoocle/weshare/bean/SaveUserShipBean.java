package com.pinnoocle.weshare.bean;

public class SaveUserShipBean {

    /**
     * status : true
     * msg : 存储收货地址成功
     * data : 573
     */

    private boolean status;
    private String msg;
    private String data;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
