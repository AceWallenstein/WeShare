package com.pinnoocle.weshare.bean;

import java.util.List;

public class UserPointLogBean {

    /**
     * status : true
     * msg : 金元记录获取成功
     * data : [{"id":533998,"type":null,"num":-1,"balance":8408,"remarks":"金元提现","ctime":"2020-12-15 18:20:00"},{"id":533993,"type":null,"num":-1,"balance":8409,"remarks":"金元提现","ctime":"2020-12-15 18:19:28"},{"id":456652,"type":null,"num":45,"balance":8410,"remarks":"观看广告奖励","ctime":"2020-12-10 13:49:22"},{"id":452828,"type":null,"num":45,"balance":8365,"remarks":"观看广告奖励","ctime":"2020-12-09 16:57:23"},{"id":360928,"type":null,"num":50,"balance":8320,"remarks":"观看广告奖励","ctime":"2020-12-04 22:31:37"},{"id":296291,"type":null,"num":-20,"balance":8270,"remarks":"金元提现","ctime":"2020-12-01 19:11:05"},{"id":296286,"type":null,"num":-15,"balance":8290,"remarks":"金元提现","ctime":"2020-12-01 19:10:45"},{"id":296209,"type":null,"num":-15,"balance":8305,"remarks":"金元提现","ctime":"2020-12-01 19:02:45"},{"id":236873,"type":"消费送积分","num":15,"balance":8320,"remarks":"订单：15970394791109 金元奖励","ctime":"2020-11-23 10:00:17"},{"id":236841,"type":"消费送积分","num":1,"balance":8305,"remarks":"订单：15948695998062 金元奖励","ctime":"2020-11-23 10:00:05"}]
     * total : 108
     * count : 1079
     */

    private boolean status;
    private String msg;
    private int total;
    private int count;
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 533998
         * type : null
         * num : -1
         * balance : 8408
         * remarks : 金元提现
         * ctime : 2020-12-15 18:20:00
         */

        private int id;
        private Object type;
        private int num;
        private int balance;
        private String remarks;
        private String ctime;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Object getType() {
            return type;
        }

        public void setType(Object type) {
            this.type = type;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public String getRemarks() {
            return remarks;
        }

        public void setRemarks(String remarks) {
            this.remarks = remarks;
        }

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }
    }
}
