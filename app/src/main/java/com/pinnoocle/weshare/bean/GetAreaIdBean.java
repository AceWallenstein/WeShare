package com.pinnoocle.weshare.bean;

public class GetAreaIdBean {

    /**
     * status : true
     * msg : 获取成功
     * data : 340181
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
