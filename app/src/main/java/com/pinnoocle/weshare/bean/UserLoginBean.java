package com.pinnoocle.weshare.bean;

public class UserLoginBean {


    /**
     * status : true
     * data : {"token":"c676a680c19c17b959357ca2f2f4b4b4"}
     * msg :
     */

    private boolean status;
    private DataBean data;
    private String msg;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class DataBean {
        /**
         * token : c676a680c19c17b959357ca2f2f4b4b4
         */

        private String token;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }
}
