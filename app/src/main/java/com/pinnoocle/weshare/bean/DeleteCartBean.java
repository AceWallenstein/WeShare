package com.pinnoocle.weshare.bean;

public class DeleteCartBean {

    /**
     * status : false
     * msg : 移除购物车失败
     * data : 0
     */

    private boolean status;
    private String msg;
    private int data;

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

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
