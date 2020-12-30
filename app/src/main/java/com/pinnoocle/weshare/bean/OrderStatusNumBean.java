package com.pinnoocle.weshare.bean;

import com.google.gson.annotations.SerializedName;

public class OrderStatusNumBean {

    /**
     * status : true
     * msg : 获取成功
     * data : {"1":0,"2":0,"3":0,"4":0,"isAfterSale":0,"tuan":0,"tqz":0,"tqcg":0}
     */

    private boolean status;
    private String msg;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * 1 : 0
         * 2 : 0
         * 3 : 0
         * 4 : 0
         * isAfterSale : 0
         * tuan : 0
         * tqz : 0
         * tqcg : 0
         */

        @SerializedName("1")
        private int _$1;
        @SerializedName("2")
        private int _$2;
        @SerializedName("3")
        private int _$3;
        @SerializedName("4")
        private int _$4;
        private int isAfterSale;
        private int tuan;
        private int tqz;
        private int tqcg;

        public int get_$1() {
            return _$1;
        }

        public void set_$1(int _$1) {
            this._$1 = _$1;
        }

        public int get_$2() {
            return _$2;
        }

        public void set_$2(int _$2) {
            this._$2 = _$2;
        }

        public int get_$3() {
            return _$3;
        }

        public void set_$3(int _$3) {
            this._$3 = _$3;
        }

        public int get_$4() {
            return _$4;
        }

        public void set_$4(int _$4) {
            this._$4 = _$4;
        }

        public int getIsAfterSale() {
            return isAfterSale;
        }

        public void setIsAfterSale(int isAfterSale) {
            this.isAfterSale = isAfterSale;
        }

        public int getTuan() {
            return tuan;
        }

        public void setTuan(int tuan) {
            this.tuan = tuan;
        }

        public int getTqz() {
            return tqz;
        }

        public void setTqz(int tqz) {
            this.tqz = tqz;
        }

        public int getTqcg() {
            return tqcg;
        }

        public void setTqcg(int tqcg) {
            this.tqcg = tqcg;
        }
    }
}
