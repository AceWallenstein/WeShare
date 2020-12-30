package com.pinnoocle.weshare.bean;

import java.util.List;

public class OrderDetailsBean {

    /**
     * status : true
     * msg : 获取成功
     * data : {"order_id":"16041374576851","goods_amount":"11.00","payed":"0.00","order_amount":11,"balance_amount":"10.90","pay_status":1,"ship_status":1,"status":3,"order_type":1,"payment_code":null,"payment_time":null,"logistics_id":"1","logistics_name":"申通快递","cost_freight":"0.00","user_id":4,"seller_id":null,"confirm":1,"confirm_time":null,"store_id":0,"ship_area_id":110101,"ship_address":"哦弄了8","ship_name":"测雷龙","ship_mobile":"18326949252","weight":0,"tax_type":1,"tax_content":"商品明细","tax_code":"","tax_title":"","point":0,"point_money":"0.00","order_pmt":"0.00","goods_pmt":"0.00","coupon_pmt":"0.00","coupon":[],"promotion_list":[],"memo":"","ip":"117.136.117.246","mark":null,"source":2,"is_comment":1,"ctime":1604137457,"utime":1604223901,"isdel":null,"is_tqm":1,"end_time":null,"success":1,"store":false,"logistics":{"id":1,"name":"申通快递","has_cod":1,"firstunit":1000,"continueunit":1000,"def_area_fee":1,"type":2,"firstunit_price":"0.00","continueunit_price":"0.00","exp":"0 + (ceil((w-1000)/1000) * 0)","logi_name":"申通快递","logi_code":"shentong","is_def":1,"sort":1,"status":1,"free_postage":2,"area_fee":"[{\"area_value\":\"[{\\\"id\\\":\\\"150000\\\",\\\"pid\\\":\\\"-1\\\",\\\"name\\\":\\\"\\u5185\\u8499\\u53e4\\u81ea\\u6cbb\\u533a\\\",\\\"ischecked\\\":\\\"1\\\"},{\\\"id\\\":\\\"540000\\\",\\\"pid\\\":\\\"-1\\\",\\\"name\\\":\\\"\\u897f\\u85cf\\u81ea\\u6cbb\\u533a\\\",\\\"ischecked\\\":\\\"1\\\"},{\\\"id\\\":\\\"650000\\\",\\\"pid\\\":\\\"-1\\\",\\\"name\\\":\\\"\\u65b0\\u7586\\u7ef4\\u543e\\u5c14\\u81ea\\u6cbb\\u533a\\\",\\\"ischecked\\\":\\\"1\\\"},{\\\"id\\\":\\\"710000\\\",\\\"pid\\\":\\\"-1\\\",\\\"name\\\":\\\"\\u53f0\\u6e7e\\u7701\\\",\\\"ischecked\\\":\\\"1\\\"},{\\\"id\\\":\\\"810000\\\",\\\"pid\\\":\\\"-1\\\",\\\"name\\\":\\\"\\u9999\\u6e2f\\u7279\\u522b\\u884c\\u653f\\u533a\\\",\\\"ischecked\\\":\\\"1\\\"},{\\\"id\\\":\\\"820000\\\",\\\"pid\\\":\\\"-1\\\",\\\"name\\\":\\\"\\u6fb3\\u95e8\\u7279\\u522b\\u884c\\u653f\\u533a\\\",\\\"ischecked\\\":\\\"1\\\"}]\",\"area\":\"150000,150100,150101,150102,150103,150104,150105,150121,150122,150123,150124,150125,150200,150201,150202,150203,150204,150205,150206,150207,150221,150222,150223,150300,150301,150302,150303,150304,150400,150401,150402,150403,150404,150421,150422,150423,150424,150425,150426,150428,150429,150430,150500,150501,150502,150521,150522,150523,150524,150525,150526,150581,150600,150601,150602,150603,150621,150622,150623,150624,150625,150626,150627,150700,150701,150702,150703,150721,150722,150723,150724,150725,150726,150727,150781,150782,150783,150784,150785,150800,150801,150802,150821,150822,150823,150824,150825,150826,150900,150901,150902,150921,150922,150923,150924,150925,150926,150927,150928,150929,150981,152200,152201,152202,152221,152222,152223,152224,152500,152501,152502,152522,152523,152524,152525,152526,152527,152528,152529,152530,152531,152900,152921,152922,152923,540000,540100,540101,540102,540103,540121,540122,540123,540124,540126,540127,540200,540202,540221,540222,540223,540224,540225,540226,540227,540228,540229,540230,540231,540232,540233,540234,540235,540236,540237,540300,540302,540321,540322,540323,540324,540325,540326,540327,540328,540329,540330,540400,540402,540421,540422,540423,540424,540425,540426,540500,540501,540502,540521,540522,540523,540524,540525,540526,540527,540528,540529,540530,540531,542400,542421,542422,542423,542424,542425,542426,542427,542428,542429,542430,542431,542500,542521,542522,542523,542524,542525,542526,542527,650000,650100,650101,650102,650103,650104,650105,650106,650107,650109,650121,650200,650201,650202,650203,650204,650205,650400,650402,650421,650422,650500,650502,650521,650522,652300,652301,652302,652323,652324,652325,652327,652328,652700,652701,652702,652722,652723,652800,652801,652822,652823,652824,652825,652826,652827,652828,652829,652900,652901,652922,652923,652924,652925,652926,652927,652928,652929,653000,653001,653022,653023,653024,653100,653101,653121,653122,653123,653124,653125,653126,653127,653128,653129,653130,653131,653200,653201,653221,653222,653223,653224,653225,653226,653227,654000,654002,654003,654004,654021,654022,654023,654024,654025,654026,654027,654028,654200,654201,654202,654221,654223,654224,654225,654226,654300,654301,654321,654322,654323,654324,654325,654326,659000,659001,659002,659003,659004,659006,710000,920066,920086,920067,920087,920068,920088,920069,920089,920070,920090,920071,920091,920072,920092,920073,920093,920074,920094,920075,920095,920076,920096,920077,920097,920078,920098,920079,920099,920080,920100,920081,920101,920082,920102,920083,920103,920084,920104,920085,920105,810000,920042,920043,920044,920045,920046,920047,920048,920049,920050,920051,920052,920053,920054,920055,920056,920057,920058,920059,920060,820000,920061,920062,920063,920064,920065\",\"firstunit_area_price\":\"60\",\"continueunit_area_price\":\"20\",\"exp\":\"60 + (ceil((w-1000)\\/1000) * 20)\"}]","goodsmoney":"0.00"},"text_status":7,"ship_area_name":"北京市 北京市 东城区 ","payment_name":"未知支付方式","remaining":false,"remaining_time":false,"bill_aftersales_id":false,"canshouhou":1,"real_amount":"0.10","items":[{"id":1441,"order_id":"16041374576851","goods_id":1080,"product_id":7649,"sn":"P6034507125332","bn":"G6034507125270","name":"3斤食品级冷水去油洗洁精1.5kg 洗涤灵餐具清洁剂瓜果蔬菜一洗净","price":"11.00","costprice":"9.80","mktprice":"0.00","image_url":"http://img.ywzyit.com/static/uploads/images/2020/10/23/16034504875f92b6770b337.jpg","nums":1,"amount":"11.00","promotion_amount":"0.00","promotion_list":"[]","weight":"0.00","sendnums":0,"addon":"规格2:3斤1.5kg实惠装","utime":1604137457}],"user":{"id":4,"username":"测试","teacher_id":0,"mobile":"18326949252","sex":1,"birthday":null,"city":"芜湖市","avatar":"https://thirdwx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTLFwxibqpIE8xNicbKyuIQ5Y6ebNr17DvSfPeRa5H5OVAF1ibWUXVJEvtIOsVy5GmtKSiayY3Qv4ibgkoQ/132","nickname":"996.ICU","balance":"10.90","point":8320,"grade":3,"commission":"24.20","ctime":1573711566,"utime":1606965265,"status":1,"pid":7,"coupon_num":0,"type":0,"act_time":1609295417},"paymentRelItem":[],"refundItem":[],"delivery":[],"ladingItem":[],"returnItem":[],"aftersalesItem":[]}
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
         * order_id : 16041374576851
         * goods_amount : 11.00
         * payed : 0.00
         * order_amount : 11
         * balance_amount : 10.90
         * pay_status : 1
         * ship_status : 1
         * status : 3
         * order_type : 1
         * payment_code : null
         * payment_time : null
         * logistics_id : 1
         * logistics_name : 申通快递
         * cost_freight : 0.00
         * user_id : 4
         * seller_id : null
         * confirm : 1
         * confirm_time : null
         * store_id : 0
         * ship_area_id : 110101
         * ship_address : 哦弄了8
         * ship_name : 测雷龙
         * ship_mobile : 18326949252
         * weight : 0
         * tax_type : 1
         * tax_content : 商品明细
         * tax_code :
         * tax_title :
         * point : 0
         * point_money : 0.00
         * order_pmt : 0.00
         * goods_pmt : 0.00
         * coupon_pmt : 0.00
         * coupon : []
         * promotion_list : []
         * memo :
         * ip : 117.136.117.246
         * mark : null
         * source : 2
         * is_comment : 1
         * ctime : 1604137457
         * utime : 1604223901
         * isdel : null
         * is_tqm : 1
         * end_time : null
         * success : 1
         * store : false
         * logistics : {"id":1,"name":"申通快递","has_cod":1,"firstunit":1000,"continueunit":1000,"def_area_fee":1,"type":2,"firstunit_price":"0.00","continueunit_price":"0.00","exp":"0 + (ceil((w-1000)/1000) * 0)","logi_name":"申通快递","logi_code":"shentong","is_def":1,"sort":1,"status":1,"free_postage":2,"area_fee":"[{\"area_value\":\"[{\\\"id\\\":\\\"150000\\\",\\\"pid\\\":\\\"-1\\\",\\\"name\\\":\\\"\\u5185\\u8499\\u53e4\\u81ea\\u6cbb\\u533a\\\",\\\"ischecked\\\":\\\"1\\\"},{\\\"id\\\":\\\"540000\\\",\\\"pid\\\":\\\"-1\\\",\\\"name\\\":\\\"\\u897f\\u85cf\\u81ea\\u6cbb\\u533a\\\",\\\"ischecked\\\":\\\"1\\\"},{\\\"id\\\":\\\"650000\\\",\\\"pid\\\":\\\"-1\\\",\\\"name\\\":\\\"\\u65b0\\u7586\\u7ef4\\u543e\\u5c14\\u81ea\\u6cbb\\u533a\\\",\\\"ischecked\\\":\\\"1\\\"},{\\\"id\\\":\\\"710000\\\",\\\"pid\\\":\\\"-1\\\",\\\"name\\\":\\\"\\u53f0\\u6e7e\\u7701\\\",\\\"ischecked\\\":\\\"1\\\"},{\\\"id\\\":\\\"810000\\\",\\\"pid\\\":\\\"-1\\\",\\\"name\\\":\\\"\\u9999\\u6e2f\\u7279\\u522b\\u884c\\u653f\\u533a\\\",\\\"ischecked\\\":\\\"1\\\"},{\\\"id\\\":\\\"820000\\\",\\\"pid\\\":\\\"-1\\\",\\\"name\\\":\\\"\\u6fb3\\u95e8\\u7279\\u522b\\u884c\\u653f\\u533a\\\",\\\"ischecked\\\":\\\"1\\\"}]\",\"area\":\"150000,150100,150101,150102,150103,150104,150105,150121,150122,150123,150124,150125,150200,150201,150202,150203,150204,150205,150206,150207,150221,150222,150223,150300,150301,150302,150303,150304,150400,150401,150402,150403,150404,150421,150422,150423,150424,150425,150426,150428,150429,150430,150500,150501,150502,150521,150522,150523,150524,150525,150526,150581,150600,150601,150602,150603,150621,150622,150623,150624,150625,150626,150627,150700,150701,150702,150703,150721,150722,150723,150724,150725,150726,150727,150781,150782,150783,150784,150785,150800,150801,150802,150821,150822,150823,150824,150825,150826,150900,150901,150902,150921,150922,150923,150924,150925,150926,150927,150928,150929,150981,152200,152201,152202,152221,152222,152223,152224,152500,152501,152502,152522,152523,152524,152525,152526,152527,152528,152529,152530,152531,152900,152921,152922,152923,540000,540100,540101,540102,540103,540121,540122,540123,540124,540126,540127,540200,540202,540221,540222,540223,540224,540225,540226,540227,540228,540229,540230,540231,540232,540233,540234,540235,540236,540237,540300,540302,540321,540322,540323,540324,540325,540326,540327,540328,540329,540330,540400,540402,540421,540422,540423,540424,540425,540426,540500,540501,540502,540521,540522,540523,540524,540525,540526,540527,540528,540529,540530,540531,542400,542421,542422,542423,542424,542425,542426,542427,542428,542429,542430,542431,542500,542521,542522,542523,542524,542525,542526,542527,650000,650100,650101,650102,650103,650104,650105,650106,650107,650109,650121,650200,650201,650202,650203,650204,650205,650400,650402,650421,650422,650500,650502,650521,650522,652300,652301,652302,652323,652324,652325,652327,652328,652700,652701,652702,652722,652723,652800,652801,652822,652823,652824,652825,652826,652827,652828,652829,652900,652901,652922,652923,652924,652925,652926,652927,652928,652929,653000,653001,653022,653023,653024,653100,653101,653121,653122,653123,653124,653125,653126,653127,653128,653129,653130,653131,653200,653201,653221,653222,653223,653224,653225,653226,653227,654000,654002,654003,654004,654021,654022,654023,654024,654025,654026,654027,654028,654200,654201,654202,654221,654223,654224,654225,654226,654300,654301,654321,654322,654323,654324,654325,654326,659000,659001,659002,659003,659004,659006,710000,920066,920086,920067,920087,920068,920088,920069,920089,920070,920090,920071,920091,920072,920092,920073,920093,920074,920094,920075,920095,920076,920096,920077,920097,920078,920098,920079,920099,920080,920100,920081,920101,920082,920102,920083,920103,920084,920104,920085,920105,810000,920042,920043,920044,920045,920046,920047,920048,920049,920050,920051,920052,920053,920054,920055,920056,920057,920058,920059,920060,820000,920061,920062,920063,920064,920065\",\"firstunit_area_price\":\"60\",\"continueunit_area_price\":\"20\",\"exp\":\"60 + (ceil((w-1000)\\/1000) * 20)\"}]","goodsmoney":"0.00"}
         * text_status : 7
         * ship_area_name : 北京市 北京市 东城区
         * payment_name : 未知支付方式
         * remaining : false
         * remaining_time : false
         * bill_aftersales_id : false
         * canshouhou : 1
         * real_amount : 0.10
         * items : [{"id":1441,"order_id":"16041374576851","goods_id":1080,"product_id":7649,"sn":"P6034507125332","bn":"G6034507125270","name":"3斤食品级冷水去油洗洁精1.5kg 洗涤灵餐具清洁剂瓜果蔬菜一洗净","price":"11.00","costprice":"9.80","mktprice":"0.00","image_url":"http://img.ywzyit.com/static/uploads/images/2020/10/23/16034504875f92b6770b337.jpg","nums":1,"amount":"11.00","promotion_amount":"0.00","promotion_list":"[]","weight":"0.00","sendnums":0,"addon":"规格2:3斤1.5kg实惠装","utime":1604137457}]
         * user : {"id":4,"username":"测试","teacher_id":0,"mobile":"18326949252","sex":1,"birthday":null,"city":"芜湖市","avatar":"https://thirdwx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTLFwxibqpIE8xNicbKyuIQ5Y6ebNr17DvSfPeRa5H5OVAF1ibWUXVJEvtIOsVy5GmtKSiayY3Qv4ibgkoQ/132","nickname":"996.ICU","balance":"10.90","point":8320,"grade":3,"commission":"24.20","ctime":1573711566,"utime":1606965265,"status":1,"pid":7,"coupon_num":0,"type":0,"act_time":1609295417}
         * paymentRelItem : []
         * refundItem : []
         * delivery : []
         * ladingItem : []
         * returnItem : []
         * aftersalesItem : []
         */

        private String order_id;
        private String goods_amount;
        private String payed;
        private double order_amount;
        private String balance_amount;
        private int pay_status;
        private int ship_status;
        private int status;
        private int order_type;
        private Object payment_code;
        private Object payment_time;
        private String logistics_id;
        private String logistics_name;
        private String cost_freight;
        private int user_id;
        private Object seller_id;
        private int confirm;
        private Object confirm_time;
        private int store_id;
        private int ship_area_id;
        private String ship_address;
        private String ship_name;
        private String ship_mobile;
        private double weight;
        private int tax_type;
        private String tax_content;
        private String tax_code;
        private String tax_title;
        private int point;
        private String point_money;
        private String order_pmt;
        private String goods_pmt;
        private String coupon_pmt;
        private String memo;
        private String ip;
        private Object mark;
        private int source;
        private int is_comment;
        private int ctime;
        private int utime;
        private Object isdel;
        private int is_tqm;
        private Object end_time;
        private int success;
        private boolean store;
        private LogisticsBean logistics;
        private int text_status;
        private String ship_area_name;
        private String payment_name;
        private boolean remaining;
        private boolean remaining_time;
        private boolean bill_aftersales_id;
        private int canshouhou;
        private String real_amount;
        private UserBean user;
        private List<?> coupon;
        private List<?> promotion_list;
        private List<ItemsBean> items;
        private List<?> paymentRelItem;
        private List<?> refundItem;
        private List<?> delivery;
        private List<?> ladingItem;
        private List<?> returnItem;
        private List<?> aftersalesItem;

        public String getOrder_id() {
            return order_id;
        }

        public void setOrder_id(String order_id) {
            this.order_id = order_id;
        }

        public String getGoods_amount() {
            return goods_amount;
        }

        public void setGoods_amount(String goods_amount) {
            this.goods_amount = goods_amount;
        }

        public String getPayed() {
            return payed;
        }

        public void setPayed(String payed) {
            this.payed = payed;
        }

        public double getOrder_amount() {
            return order_amount;
        }

        public void setOrder_amount(double order_amount) {
            this.order_amount = order_amount;
        }

        public String getBalance_amount() {
            return balance_amount;
        }

        public void setBalance_amount(String balance_amount) {
            this.balance_amount = balance_amount;
        }

        public int getPay_status() {
            return pay_status;
        }

        public void setPay_status(int pay_status) {
            this.pay_status = pay_status;
        }

        public int getShip_status() {
            return ship_status;
        }

        public void setShip_status(int ship_status) {
            this.ship_status = ship_status;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getOrder_type() {
            return order_type;
        }

        public void setOrder_type(int order_type) {
            this.order_type = order_type;
        }

        public Object getPayment_code() {
            return payment_code;
        }

        public void setPayment_code(Object payment_code) {
            this.payment_code = payment_code;
        }

        public Object getPayment_time() {
            return payment_time;
        }

        public void setPayment_time(Object payment_time) {
            this.payment_time = payment_time;
        }

        public String getLogistics_id() {
            return logistics_id;
        }

        public void setLogistics_id(String logistics_id) {
            this.logistics_id = logistics_id;
        }

        public String getLogistics_name() {
            return logistics_name;
        }

        public void setLogistics_name(String logistics_name) {
            this.logistics_name = logistics_name;
        }

        public String getCost_freight() {
            return cost_freight;
        }

        public void setCost_freight(String cost_freight) {
            this.cost_freight = cost_freight;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public Object getSeller_id() {
            return seller_id;
        }

        public void setSeller_id(Object seller_id) {
            this.seller_id = seller_id;
        }

        public int getConfirm() {
            return confirm;
        }

        public void setConfirm(int confirm) {
            this.confirm = confirm;
        }

        public Object getConfirm_time() {
            return confirm_time;
        }

        public void setConfirm_time(Object confirm_time) {
            this.confirm_time = confirm_time;
        }

        public int getStore_id() {
            return store_id;
        }

        public void setStore_id(int store_id) {
            this.store_id = store_id;
        }

        public int getShip_area_id() {
            return ship_area_id;
        }

        public void setShip_area_id(int ship_area_id) {
            this.ship_area_id = ship_area_id;
        }

        public String getShip_address() {
            return ship_address;
        }

        public void setShip_address(String ship_address) {
            this.ship_address = ship_address;
        }

        public String getShip_name() {
            return ship_name;
        }

        public void setShip_name(String ship_name) {
            this.ship_name = ship_name;
        }

        public String getShip_mobile() {
            return ship_mobile;
        }

        public void setShip_mobile(String ship_mobile) {
            this.ship_mobile = ship_mobile;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public int getTax_type() {
            return tax_type;
        }

        public void setTax_type(int tax_type) {
            this.tax_type = tax_type;
        }

        public String getTax_content() {
            return tax_content;
        }

        public void setTax_content(String tax_content) {
            this.tax_content = tax_content;
        }

        public String getTax_code() {
            return tax_code;
        }

        public void setTax_code(String tax_code) {
            this.tax_code = tax_code;
        }

        public String getTax_title() {
            return tax_title;
        }

        public void setTax_title(String tax_title) {
            this.tax_title = tax_title;
        }

        public int getPoint() {
            return point;
        }

        public void setPoint(int point) {
            this.point = point;
        }

        public String getPoint_money() {
            return point_money;
        }

        public void setPoint_money(String point_money) {
            this.point_money = point_money;
        }

        public String getOrder_pmt() {
            return order_pmt;
        }

        public void setOrder_pmt(String order_pmt) {
            this.order_pmt = order_pmt;
        }

        public String getGoods_pmt() {
            return goods_pmt;
        }

        public void setGoods_pmt(String goods_pmt) {
            this.goods_pmt = goods_pmt;
        }

        public String getCoupon_pmt() {
            return coupon_pmt;
        }

        public void setCoupon_pmt(String coupon_pmt) {
            this.coupon_pmt = coupon_pmt;
        }

        public String getMemo() {
            return memo;
        }

        public void setMemo(String memo) {
            this.memo = memo;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public Object getMark() {
            return mark;
        }

        public void setMark(Object mark) {
            this.mark = mark;
        }

        public int getSource() {
            return source;
        }

        public void setSource(int source) {
            this.source = source;
        }

        public int getIs_comment() {
            return is_comment;
        }

        public void setIs_comment(int is_comment) {
            this.is_comment = is_comment;
        }

        public int getCtime() {
            return ctime;
        }

        public void setCtime(int ctime) {
            this.ctime = ctime;
        }

        public int getUtime() {
            return utime;
        }

        public void setUtime(int utime) {
            this.utime = utime;
        }

        public Object getIsdel() {
            return isdel;
        }

        public void setIsdel(Object isdel) {
            this.isdel = isdel;
        }

        public int getIs_tqm() {
            return is_tqm;
        }

        public void setIs_tqm(int is_tqm) {
            this.is_tqm = is_tqm;
        }

        public Object getEnd_time() {
            return end_time;
        }

        public void setEnd_time(Object end_time) {
            this.end_time = end_time;
        }

        public int getSuccess() {
            return success;
        }

        public void setSuccess(int success) {
            this.success = success;
        }

        public boolean isStore() {
            return store;
        }

        public void setStore(boolean store) {
            this.store = store;
        }

        public LogisticsBean getLogistics() {
            return logistics;
        }

        public void setLogistics(LogisticsBean logistics) {
            this.logistics = logistics;
        }

        public int getText_status() {
            return text_status;
        }

        public void setText_status(int text_status) {
            this.text_status = text_status;
        }

        public String getShip_area_name() {
            return ship_area_name;
        }

        public void setShip_area_name(String ship_area_name) {
            this.ship_area_name = ship_area_name;
        }

        public String getPayment_name() {
            return payment_name;
        }

        public void setPayment_name(String payment_name) {
            this.payment_name = payment_name;
        }

        public boolean isRemaining() {
            return remaining;
        }

        public void setRemaining(boolean remaining) {
            this.remaining = remaining;
        }

        public boolean isRemaining_time() {
            return remaining_time;
        }

        public void setRemaining_time(boolean remaining_time) {
            this.remaining_time = remaining_time;
        }

        public boolean isBill_aftersales_id() {
            return bill_aftersales_id;
        }

        public void setBill_aftersales_id(boolean bill_aftersales_id) {
            this.bill_aftersales_id = bill_aftersales_id;
        }

        public int getCanshouhou() {
            return canshouhou;
        }

        public void setCanshouhou(int canshouhou) {
            this.canshouhou = canshouhou;
        }

        public String getReal_amount() {
            return real_amount;
        }

        public void setReal_amount(String real_amount) {
            this.real_amount = real_amount;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public List<?> getCoupon() {
            return coupon;
        }

        public void setCoupon(List<?> coupon) {
            this.coupon = coupon;
        }

        public List<?> getPromotion_list() {
            return promotion_list;
        }

        public void setPromotion_list(List<?> promotion_list) {
            this.promotion_list = promotion_list;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public List<?> getPaymentRelItem() {
            return paymentRelItem;
        }

        public void setPaymentRelItem(List<?> paymentRelItem) {
            this.paymentRelItem = paymentRelItem;
        }

        public List<?> getRefundItem() {
            return refundItem;
        }

        public void setRefundItem(List<?> refundItem) {
            this.refundItem = refundItem;
        }

        public List<?> getDelivery() {
            return delivery;
        }

        public void setDelivery(List<?> delivery) {
            this.delivery = delivery;
        }

        public List<?> getLadingItem() {
            return ladingItem;
        }

        public void setLadingItem(List<?> ladingItem) {
            this.ladingItem = ladingItem;
        }

        public List<?> getReturnItem() {
            return returnItem;
        }

        public void setReturnItem(List<?> returnItem) {
            this.returnItem = returnItem;
        }

        public List<?> getAftersalesItem() {
            return aftersalesItem;
        }

        public void setAftersalesItem(List<?> aftersalesItem) {
            this.aftersalesItem = aftersalesItem;
        }

        public static class LogisticsBean {
            /**
             * id : 1
             * name : 申通快递
             * has_cod : 1
             * firstunit : 1000
             * continueunit : 1000
             * def_area_fee : 1
             * type : 2
             * firstunit_price : 0.00
             * continueunit_price : 0.00
             * exp : 0 + (ceil((w-1000)/1000) * 0)
             * logi_name : 申通快递
             * logi_code : shentong
             * is_def : 1
             * sort : 1
             * status : 1
             * free_postage : 2
             * area_fee : [{"area_value":"[{\"id\":\"150000\",\"pid\":\"-1\",\"name\":\"\u5185\u8499\u53e4\u81ea\u6cbb\u533a\",\"ischecked\":\"1\"},{\"id\":\"540000\",\"pid\":\"-1\",\"name\":\"\u897f\u85cf\u81ea\u6cbb\u533a\",\"ischecked\":\"1\"},{\"id\":\"650000\",\"pid\":\"-1\",\"name\":\"\u65b0\u7586\u7ef4\u543e\u5c14\u81ea\u6cbb\u533a\",\"ischecked\":\"1\"},{\"id\":\"710000\",\"pid\":\"-1\",\"name\":\"\u53f0\u6e7e\u7701\",\"ischecked\":\"1\"},{\"id\":\"810000\",\"pid\":\"-1\",\"name\":\"\u9999\u6e2f\u7279\u522b\u884c\u653f\u533a\",\"ischecked\":\"1\"},{\"id\":\"820000\",\"pid\":\"-1\",\"name\":\"\u6fb3\u95e8\u7279\u522b\u884c\u653f\u533a\",\"ischecked\":\"1\"}]","area":"150000,150100,150101,150102,150103,150104,150105,150121,150122,150123,150124,150125,150200,150201,150202,150203,150204,150205,150206,150207,150221,150222,150223,150300,150301,150302,150303,150304,150400,150401,150402,150403,150404,150421,150422,150423,150424,150425,150426,150428,150429,150430,150500,150501,150502,150521,150522,150523,150524,150525,150526,150581,150600,150601,150602,150603,150621,150622,150623,150624,150625,150626,150627,150700,150701,150702,150703,150721,150722,150723,150724,150725,150726,150727,150781,150782,150783,150784,150785,150800,150801,150802,150821,150822,150823,150824,150825,150826,150900,150901,150902,150921,150922,150923,150924,150925,150926,150927,150928,150929,150981,152200,152201,152202,152221,152222,152223,152224,152500,152501,152502,152522,152523,152524,152525,152526,152527,152528,152529,152530,152531,152900,152921,152922,152923,540000,540100,540101,540102,540103,540121,540122,540123,540124,540126,540127,540200,540202,540221,540222,540223,540224,540225,540226,540227,540228,540229,540230,540231,540232,540233,540234,540235,540236,540237,540300,540302,540321,540322,540323,540324,540325,540326,540327,540328,540329,540330,540400,540402,540421,540422,540423,540424,540425,540426,540500,540501,540502,540521,540522,540523,540524,540525,540526,540527,540528,540529,540530,540531,542400,542421,542422,542423,542424,542425,542426,542427,542428,542429,542430,542431,542500,542521,542522,542523,542524,542525,542526,542527,650000,650100,650101,650102,650103,650104,650105,650106,650107,650109,650121,650200,650201,650202,650203,650204,650205,650400,650402,650421,650422,650500,650502,650521,650522,652300,652301,652302,652323,652324,652325,652327,652328,652700,652701,652702,652722,652723,652800,652801,652822,652823,652824,652825,652826,652827,652828,652829,652900,652901,652922,652923,652924,652925,652926,652927,652928,652929,653000,653001,653022,653023,653024,653100,653101,653121,653122,653123,653124,653125,653126,653127,653128,653129,653130,653131,653200,653201,653221,653222,653223,653224,653225,653226,653227,654000,654002,654003,654004,654021,654022,654023,654024,654025,654026,654027,654028,654200,654201,654202,654221,654223,654224,654225,654226,654300,654301,654321,654322,654323,654324,654325,654326,659000,659001,659002,659003,659004,659006,710000,920066,920086,920067,920087,920068,920088,920069,920089,920070,920090,920071,920091,920072,920092,920073,920093,920074,920094,920075,920095,920076,920096,920077,920097,920078,920098,920079,920099,920080,920100,920081,920101,920082,920102,920083,920103,920084,920104,920085,920105,810000,920042,920043,920044,920045,920046,920047,920048,920049,920050,920051,920052,920053,920054,920055,920056,920057,920058,920059,920060,820000,920061,920062,920063,920064,920065","firstunit_area_price":"60","continueunit_area_price":"20","exp":"60 + (ceil((w-1000)\/1000) * 20)"}]
             * goodsmoney : 0.00
             */

            private int id;
            private String name;
            private int has_cod;
            private int firstunit;
            private int continueunit;
            private int def_area_fee;
            private int type;
            private String firstunit_price;
            private String continueunit_price;
            private String exp;
            private String logi_name;
            private String logi_code;
            private int is_def;
            private int sort;
            private int status;
            private int free_postage;
            private String area_fee;
            private String goodsmoney;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getHas_cod() {
                return has_cod;
            }

            public void setHas_cod(int has_cod) {
                this.has_cod = has_cod;
            }

            public int getFirstunit() {
                return firstunit;
            }

            public void setFirstunit(int firstunit) {
                this.firstunit = firstunit;
            }

            public int getContinueunit() {
                return continueunit;
            }

            public void setContinueunit(int continueunit) {
                this.continueunit = continueunit;
            }

            public int getDef_area_fee() {
                return def_area_fee;
            }

            public void setDef_area_fee(int def_area_fee) {
                this.def_area_fee = def_area_fee;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getFirstunit_price() {
                return firstunit_price;
            }

            public void setFirstunit_price(String firstunit_price) {
                this.firstunit_price = firstunit_price;
            }

            public String getContinueunit_price() {
                return continueunit_price;
            }

            public void setContinueunit_price(String continueunit_price) {
                this.continueunit_price = continueunit_price;
            }

            public String getExp() {
                return exp;
            }

            public void setExp(String exp) {
                this.exp = exp;
            }

            public String getLogi_name() {
                return logi_name;
            }

            public void setLogi_name(String logi_name) {
                this.logi_name = logi_name;
            }

            public String getLogi_code() {
                return logi_code;
            }

            public void setLogi_code(String logi_code) {
                this.logi_code = logi_code;
            }

            public int getIs_def() {
                return is_def;
            }

            public void setIs_def(int is_def) {
                this.is_def = is_def;
            }

            public int getSort() {
                return sort;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getFree_postage() {
                return free_postage;
            }

            public void setFree_postage(int free_postage) {
                this.free_postage = free_postage;
            }

            public String getArea_fee() {
                return area_fee;
            }

            public void setArea_fee(String area_fee) {
                this.area_fee = area_fee;
            }

            public String getGoodsmoney() {
                return goodsmoney;
            }

            public void setGoodsmoney(String goodsmoney) {
                this.goodsmoney = goodsmoney;
            }
        }

        public static class UserBean {
            /**
             * id : 4
             * username : 测试
             * teacher_id : 0
             * mobile : 18326949252
             * sex : 1
             * birthday : null
             * city : 芜湖市
             * avatar : https://thirdwx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTLFwxibqpIE8xNicbKyuIQ5Y6ebNr17DvSfPeRa5H5OVAF1ibWUXVJEvtIOsVy5GmtKSiayY3Qv4ibgkoQ/132
             * nickname : 996.ICU
             * balance : 10.90
             * point : 8320
             * grade : 3
             * commission : 24.20
             * ctime : 1573711566
             * utime : 1606965265
             * status : 1
             * pid : 7
             * coupon_num : 0
             * type : 0
             * act_time : 1609295417
             */

            private int id;
            private String username;
            private int teacher_id;
            private String mobile;
            private int sex;
            private Object birthday;
            private String city;
            private String avatar;
            private String nickname;
            private String balance;
            private int point;
            private int grade;
            private String commission;
            private int ctime;
            private int utime;
            private int status;
            private int pid;
            private int coupon_num;
            private int type;
            private int act_time;

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

            public int getTeacher_id() {
                return teacher_id;
            }

            public void setTeacher_id(int teacher_id) {
                this.teacher_id = teacher_id;
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

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
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

            public String getCommission() {
                return commission;
            }

            public void setCommission(String commission) {
                this.commission = commission;
            }

            public int getCtime() {
                return ctime;
            }

            public void setCtime(int ctime) {
                this.ctime = ctime;
            }

            public int getUtime() {
                return utime;
            }

            public void setUtime(int utime) {
                this.utime = utime;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getPid() {
                return pid;
            }

            public void setPid(int pid) {
                this.pid = pid;
            }

            public int getCoupon_num() {
                return coupon_num;
            }

            public void setCoupon_num(int coupon_num) {
                this.coupon_num = coupon_num;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getAct_time() {
                return act_time;
            }

            public void setAct_time(int act_time) {
                this.act_time = act_time;
            }
        }

        public static class ItemsBean {
            /**
             * id : 1441
             * order_id : 16041374576851
             * goods_id : 1080
             * product_id : 7649
             * sn : P6034507125332
             * bn : G6034507125270
             * name : 3斤食品级冷水去油洗洁精1.5kg 洗涤灵餐具清洁剂瓜果蔬菜一洗净
             * price : 11.00
             * costprice : 9.80
             * mktprice : 0.00
             * image_url : http://img.ywzyit.com/static/uploads/images/2020/10/23/16034504875f92b6770b337.jpg
             * nums : 1
             * amount : 11.00
             * promotion_amount : 0.00
             * promotion_list : []
             * weight : 0.00
             * sendnums : 0
             * addon : 规格2:3斤1.5kg实惠装
             * utime : 1604137457
             */

            private int id;
            private String order_id;
            private int goods_id;
            private int product_id;
            private String sn;
            private String bn;
            private String name;
            private String price;
            private String costprice;
            private String mktprice;
            private String image_url;
            private int nums;
            private String amount;
            private String promotion_amount;
            private String promotion_list;
            private String weight;
            private int sendnums;
            private String addon;
            private long utime;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getOrder_id() {
                return order_id;
            }

            public void setOrder_id(String order_id) {
                this.order_id = order_id;
            }

            public int getGoods_id() {
                return goods_id;
            }

            public void setGoods_id(int goods_id) {
                this.goods_id = goods_id;
            }

            public int getProduct_id() {
                return product_id;
            }

            public void setProduct_id(int product_id) {
                this.product_id = product_id;
            }

            public String getSn() {
                return sn;
            }

            public void setSn(String sn) {
                this.sn = sn;
            }

            public String getBn() {
                return bn;
            }

            public void setBn(String bn) {
                this.bn = bn;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getCostprice() {
                return costprice;
            }

            public void setCostprice(String costprice) {
                this.costprice = costprice;
            }

            public String getMktprice() {
                return mktprice;
            }

            public void setMktprice(String mktprice) {
                this.mktprice = mktprice;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public int getNums() {
                return nums;
            }

            public void setNums(int nums) {
                this.nums = nums;
            }

            public String getAmount() {
                return amount;
            }

            public void setAmount(String amount) {
                this.amount = amount;
            }

            public String getPromotion_amount() {
                return promotion_amount;
            }

            public void setPromotion_amount(String promotion_amount) {
                this.promotion_amount = promotion_amount;
            }

            public String getPromotion_list() {
                return promotion_list;
            }

            public void setPromotion_list(String promotion_list) {
                this.promotion_list = promotion_list;
            }

            public String getWeight() {
                return weight;
            }

            public void setWeight(String weight) {
                this.weight = weight;
            }

            public int getSendnums() {
                return sendnums;
            }

            public void setSendnums(int sendnums) {
                this.sendnums = sendnums;
            }

            public String getAddon() {
                return addon;
            }

            public void setAddon(String addon) {
                this.addon = addon;
            }

            public long getUtime() {
                return utime;
            }

            public void setUtime(long utime) {
                this.utime = utime;
            }
        }
    }
}
