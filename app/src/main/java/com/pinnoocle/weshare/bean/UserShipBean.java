package com.pinnoocle.weshare.bean;

import java.util.List;

public class UserShipBean {

    /**
     * status : true
     * msg : 获取用户收货地址成功
     * data : [{"id":15,"user_id":4,"area_id":440105,"address":"新港中路397号","name":"张三","mobile":"18326949252","utime":1577348825,"is_def":2,"area_name":"广东省 广州市 海珠区 "},{"id":528,"user_id":4,"area_id":340181,"address":"详细地址","name":"我","mobile":"16312341234","utime":1607947235,"is_def":2,"area_name":"安徽省 合肥市 巢湖市 "},{"id":529,"user_id":4,"area_id":340181,"address":"西湖国际","name":"测试","mobile":"18312341234","utime":1607947314,"is_def":1,"area_name":"安徽省 合肥市 巢湖市 "}]
     */

    private boolean status;
    private String msg;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 15
         * user_id : 4
         * area_id : 440105
         * address : 新港中路397号
         * name : 张三
         * mobile : 18326949252
         * utime : 1577348825
         * is_def : 2
         * area_name : 广东省 广州市 海珠区
         */

        private int id;
        private int user_id;
        private int area_id;
        private String address;
        private String name;
        private String mobile;
        private int utime;
        private int is_def;
        private String area_name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public int getArea_id() {
            return area_id;
        }

        public void setArea_id(int area_id) {
            this.area_id = area_id;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public int getUtime() {
            return utime;
        }

        public void setUtime(int utime) {
            this.utime = utime;
        }

        public int getIs_def() {
            return is_def;
        }

        public void setIs_def(int is_def) {
            this.is_def = is_def;
        }

        public String getArea_name() {
            return area_name;
        }

        public void setArea_name(String area_name) {
            this.area_name = area_name;
        }
    }
}
