package com.pinnoocle.weshare.bean;

public class UserInfoBean {

    /**
     * status : true
     * data : {"id":4,"username":"测试","mobile":"18326949252","sex":1,"birthday":null,"avatar":"https://thirdwx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTLFwxibqpIE8xNicbKyuIQ5Y6ebNr17DvSfPeRa5H5OVAF1ibWUXVJEvtIOsVy5GmtKSiayY3Qv4ibgkoQ/132","nickname":"996.ICU","balance":"10.90","point":8320,"grade":3,"status":1,"commission":34.1,"city":"芜湖市","ctime":1573711566,"grade_name":"VIP会员","child_num":1,"ice_money":9.9,"commission2":34.1,"duihuan":8.32,"point_to_cash":1000,"choujiang_money_min":50,"choujiang_point_min":50000,"total_num":35967,"online_num":1,"vip_order":{"id":11387,"order_no":"16059448054231","pid":0,"user_id":4,"name":"测","phone":"15212883620","price":"9.86","status":0,"getCoupon":0,"create_time":1605944805,"delete_time":null,"is_check":0},"is_new_user":0}
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
         * id : 4
         * username : 测试
         * mobile : 18326949252
         * sex : 1
         * birthday : null
         * avatar : https://thirdwx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTLFwxibqpIE8xNicbKyuIQ5Y6ebNr17DvSfPeRa5H5OVAF1ibWUXVJEvtIOsVy5GmtKSiayY3Qv4ibgkoQ/132
         * nickname : 996.ICU
         * balance : 10.90
         * point : 8320
         * grade : 3
         * status : 1
         * commission : 34.1
         * city : 芜湖市
         * ctime : 1573711566
         * grade_name : VIP会员
         * child_num : 1
         * ice_money : 9.9
         * commission2 : 34.1
         * duihuan : 8.32
         * point_to_cash : 1000
         * choujiang_money_min : 50
         * choujiang_point_min : 50000
         * total_num : 35967
         * online_num : 1
         * vip_order : {"id":11387,"order_no":"16059448054231","pid":0,"user_id":4,"name":"测","phone":"15212883620","price":"9.86","status":0,"getCoupon":0,"create_time":1605944805,"delete_time":null,"is_check":0}
         * is_new_user : 0
         */

        private int id;
        private String username;
        private String mobile;
        private int sex;
        private Object birthday;
        private String avatar;
        private String nickname;
        private String balance;
        private int point;
        private int grade;
        private int status;
        private double commission;
        private String city;
        private int ctime;
        private String grade_name;
        private int child_num;
        private double ice_money;
        private double commission2;
        private double duihuan;
        private int point_to_cash;
        private int choujiang_money_min;
        private int choujiang_point_min;
        private int total_num;
        private int online_num;
        private VipOrderBean vip_order;
        private int is_new_user;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public Object getBirthday() {
            return birthday;
        }

        public void setBirthday(Object birthday) {
            this.birthday = birthday;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getBalance() {
            return balance;
        }

        public void setBalance(String balance) {
            this.balance = balance;
        }

        public int getPoint() {
            return point;
        }

        public void setPoint(int point) {
            this.point = point;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public double getCommission() {
            return commission;
        }

        public void setCommission(double commission) {
            this.commission = commission;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getCtime() {
            return ctime;
        }

        public void setCtime(int ctime) {
            this.ctime = ctime;
        }

        public String getGrade_name() {
            return grade_name;
        }

        public void setGrade_name(String grade_name) {
            this.grade_name = grade_name;
        }

        public int getChild_num() {
            return child_num;
        }

        public void setChild_num(int child_num) {
            this.child_num = child_num;
        }

        public double getIce_money() {
            return ice_money;
        }

        public void setIce_money(double ice_money) {
            this.ice_money = ice_money;
        }

        public double getCommission2() {
            return commission2;
        }

        public void setCommission2(double commission2) {
            this.commission2 = commission2;
        }

        public double getDuihuan() {
            return duihuan;
        }

        public void setDuihuan(double duihuan) {
            this.duihuan = duihuan;
        }

        public int getPoint_to_cash() {
            return point_to_cash;
        }

        public void setPoint_to_cash(int point_to_cash) {
            this.point_to_cash = point_to_cash;
        }

        public int getChoujiang_money_min() {
            return choujiang_money_min;
        }

        public void setChoujiang_money_min(int choujiang_money_min) {
            this.choujiang_money_min = choujiang_money_min;
        }

        public int getChoujiang_point_min() {
            return choujiang_point_min;
        }

        public void setChoujiang_point_min(int choujiang_point_min) {
            this.choujiang_point_min = choujiang_point_min;
        }

        public int getTotal_num() {
            return total_num;
        }

        public void setTotal_num(int total_num) {
            this.total_num = total_num;
        }

        public int getOnline_num() {
            return online_num;
        }

        public void setOnline_num(int online_num) {
            this.online_num = online_num;
        }

        public VipOrderBean getVip_order() {
            return vip_order;
        }

        public void setVip_order(VipOrderBean vip_order) {
            this.vip_order = vip_order;
        }

        public int getIs_new_user() {
            return is_new_user;
        }

        public void setIs_new_user(int is_new_user) {
            this.is_new_user = is_new_user;
        }

        public static class VipOrderBean {
            /**
             * id : 11387
             * order_no : 16059448054231
             * pid : 0
             * user_id : 4
             * name : 测
             * phone : 15212883620
             * price : 9.86
             * status : 0
             * getCoupon : 0
             * create_time : 1605944805
             * delete_time : null
             * is_check : 0
             */

            private int id;
            private String order_no;
            private int pid;
            private int user_id;
            private String name;
            private String phone;
            private String price;
            private int status;
            private int getCoupon;
            private int create_time;
            private Object delete_time;
            private int is_check;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getOrder_no() {
                return order_no;
            }

            public void setOrder_no(String order_no) {
                this.order_no = order_no;
            }

            public int getPid() {
                return pid;
            }

            public void setPid(int pid) {
                this.pid = pid;
            }

            public int getUser_id() {
                return user_id;
            }

            public void setUser_id(int user_id) {
                this.user_id = user_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getGetCoupon() {
                return getCoupon;
            }

            public void setGetCoupon(int getCoupon) {
                this.getCoupon = getCoupon;
            }

            public int getCreate_time() {
                return create_time;
            }

            public void setCreate_time(int create_time) {
                this.create_time = create_time;
            }

            public Object getDelete_time() {
                return delete_time;
            }

            public void setDelete_time(Object delete_time) {
                this.delete_time = delete_time;
            }

            public int getIs_check() {
                return is_check;
            }

            public void setIs_check(int is_check) {
                this.is_check = is_check;
            }
        }
    }
}
