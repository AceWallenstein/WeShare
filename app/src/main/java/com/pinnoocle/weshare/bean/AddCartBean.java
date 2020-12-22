package com.pinnoocle.weshare.bean;

public class AddCartBean {

    /**
     * status : true
     * data : 4186
     * msg : 加入成功
     */

    private boolean status;
    private String data;
    private String msg;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
