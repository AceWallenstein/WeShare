package com.pinnoocle.weshare.bean;

import java.util.List;

public class ShoppingCartListBean {

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

    /**
     * status : true
     * data : {"user_id":4,"type":1,"list":[{"id":3904,"user_id":4,"product_id":6574,"nums":1,"type":1,"weight":"0.00","products":{"id":6574,"goods_id":859,"barcode":null,"sn":"P6002461138375","price":"588.00","costprice":"488.00","mktprice":"0.00","marketable":1,"stock":232,"freeze_stock":2,"spes_desc":"规格:共14只【10母蟹3.2两/只，4公蟹4.3两/只】","is_defalut":1,"image_id":"","isdel":null,"name":"阳澄湖大闸蟹鲜活清水3.5两公蟹、2.3两母蟹14只礼盒","buy_limit":0,"bn":"G6002461138311","image_path":"http://img.ywzyit.com/static/uploads/images/2020/09/16/16002458185f61d03ad0799.png","total_stock":234,"grade_price":[],"grade_info":{"id":1},"default_spes_desc":{"规格":{"共14只【10母蟹3.2两/只，4公蟹4.3两/只】":{"name":"共14只【10母蟹3.2两/只，4公蟹4.3两/只】","is_default":true}}},"amount":"588.00","promotion_list":[],"promotion_amount":0},"is_select":false,"isCollection":false},{"id":742,"user_id":4,"product_id":430,"nums":1,"type":1,"weight":"0.00","products":{"id":430,"goods_id":55,"barcode":null,"sn":"P5758787297164","price":"7.90","costprice":"5.80","mktprice":"8.90","marketable":1,"stock":-21,"freeze_stock":21,"spes_desc":"净含量:140g","is_defalut":1,"image_id":"f89049b06d0ab5b73aabab45209ac8d4","isdel":null,"name":"联合利华中华牙膏双钙防蛀缤纷鲜果味140g （新老包装随机发货）","buy_limit":0,"bn":"G5758787297080","image_path":"https://huzhu.meiliancheng.cn/static/uploads/images/2019/12/09/15758787265dee0046d126c.png","total_stock":0,"grade_price":[],"grade_info":{"id":1},"default_spes_desc":{"净含量":{"140g":{"name":"140g","is_default":true}}},"amount":"7.90","promotion_list":[],"promotion_amount":0},"is_select":false,"isCollection":false}],"goods_amount":0,"amount":0,"order_pmt":0,"goods_pmt":0,"coupon_pmt":0,"promotion_list":[],"cost_freight":0,"weight":0,"coupon":[],"point":0,"point_money":0,"params":[],"order_point":0}
     * msg :
     */

    private boolean status;
    private DataBean data;
    private String msg;

    public static class DataBean {
        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getGoods_amount() {
            return goods_amount;
        }

        public void setGoods_amount(int goods_amount) {
            this.goods_amount = goods_amount;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public int getOrder_pmt() {
            return order_pmt;
        }

        public void setOrder_pmt(int order_pmt) {
            this.order_pmt = order_pmt;
        }

        public int getGoods_pmt() {
            return goods_pmt;
        }

        public void setGoods_pmt(int goods_pmt) {
            this.goods_pmt = goods_pmt;
        }

        public int getCoupon_pmt() {
            return coupon_pmt;
        }

        public void setCoupon_pmt(int coupon_pmt) {
            this.coupon_pmt = coupon_pmt;
        }

        public int getCost_freight() {
            return cost_freight;
        }

        public void setCost_freight(int cost_freight) {
            this.cost_freight = cost_freight;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getPoint() {
            return point;
        }

        public void setPoint(int point) {
            this.point = point;
        }

        public int getPoint_money() {
            return point_money;
        }

        public void setPoint_money(int point_money) {
            this.point_money = point_money;
        }

        public int getOrder_point() {
            return order_point;
        }

        public void setOrder_point(int order_point) {
            this.order_point = order_point;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public List<?> getPromotion_list() {
            return promotion_list;
        }

        public void setPromotion_list(List<?> promotion_list) {
            this.promotion_list = promotion_list;
        }

        public List<?> getCoupon() {
            return coupon;
        }

        public void setCoupon(List<?> coupon) {
            this.coupon = coupon;
        }

        public List<?> getParams() {
            return params;
        }

        public void setParams(List<?> params) {
            this.params = params;
        }

        /**
         * user_id : 4
         * type : 1
         * list : [{"id":3904,"user_id":4,"product_id":6574,"nums":1,"type":1,"weight":"0.00","products":{"id":6574,"goods_id":859,"barcode":null,"sn":"P6002461138375","price":"588.00","costprice":"488.00","mktprice":"0.00","marketable":1,"stock":232,"freeze_stock":2,"spes_desc":"规格:共14只【10母蟹3.2两/只，4公蟹4.3两/只】","is_defalut":1,"image_id":"","isdel":null,"name":"阳澄湖大闸蟹鲜活清水3.5两公蟹、2.3两母蟹14只礼盒","buy_limit":0,"bn":"G6002461138311","image_path":"http://img.ywzyit.com/static/uploads/images/2020/09/16/16002458185f61d03ad0799.png","total_stock":234,"grade_price":[],"grade_info":{"id":1},"default_spes_desc":{"规格":{"共14只【10母蟹3.2两/只，4公蟹4.3两/只】":{"name":"共14只【10母蟹3.2两/只，4公蟹4.3两/只】","is_default":true}}},"amount":"588.00","promotion_list":[],"promotion_amount":0},"is_select":false,"isCollection":false},{"id":742,"user_id":4,"product_id":430,"nums":1,"type":1,"weight":"0.00","products":{"id":430,"goods_id":55,"barcode":null,"sn":"P5758787297164","price":"7.90","costprice":"5.80","mktprice":"8.90","marketable":1,"stock":-21,"freeze_stock":21,"spes_desc":"净含量:140g","is_defalut":1,"image_id":"f89049b06d0ab5b73aabab45209ac8d4","isdel":null,"name":"联合利华中华牙膏双钙防蛀缤纷鲜果味140g （新老包装随机发货）","buy_limit":0,"bn":"G5758787297080","image_path":"https://huzhu.meiliancheng.cn/static/uploads/images/2019/12/09/15758787265dee0046d126c.png","total_stock":0,"grade_price":[],"grade_info":{"id":1},"default_spes_desc":{"净含量":{"140g":{"name":"140g","is_default":true}}},"amount":"7.90","promotion_list":[],"promotion_amount":0},"is_select":false,"isCollection":false}]
         * goods_amount : 0
         * amount : 0
         * order_pmt : 0
         * goods_pmt : 0
         * coupon_pmt : 0
         * promotion_list : []
         * cost_freight : 0
         * weight : 0
         * coupon : []
         * point : 0
         * point_money : 0
         * params : []
         * order_point : 0
         */

        private int user_id;
        private int type;
        private int goods_amount;
        private int amount;
        private int order_pmt;
        private int goods_pmt;
        private int coupon_pmt;
        private int cost_freight;
        private int weight;
        private int point;
        private int point_money;
        private int order_point;
        private java.util.List<ListBean> list;
        private java.util.List<?> promotion_list;
        private java.util.List<?> coupon;
        private java.util.List<?> params;

        public static class ListBean {
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

            public int getProduct_id() {
                return product_id;
            }

            public void setProduct_id(int product_id) {
                this.product_id = product_id;
            }

            public int getNums() {
                return nums;
            }

            public void setNums(int nums) {
                this.nums = nums;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getWeight() {
                return weight;
            }

            public void setWeight(String weight) {
                this.weight = weight;
            }

            public ProductsBean getProducts() {
                return products;
            }

            public void setProducts(ProductsBean products) {
                this.products = products;
            }

            public boolean isIs_select() {
                return is_select;
            }

            public void setIs_select(boolean is_select) {
                this.is_select = is_select;
            }

            public boolean isCollection() {
                return isCollection;
            }

            public void setCollection(boolean collection) {
                isCollection = collection;
            }

            /**
             * id : 3904
             * user_id : 4
             * product_id : 6574
             * nums : 1
             * type : 1
             * weight : 0.00
             * products : {"id":6574,"goods_id":859,"barcode":null,"sn":"P6002461138375","price":"588.00","costprice":"488.00","mktprice":"0.00","marketable":1,"stock":232,"freeze_stock":2,"spes_desc":"规格:共14只【10母蟹3.2两/只，4公蟹4.3两/只】","is_defalut":1,"image_id":"","isdel":null,"name":"阳澄湖大闸蟹鲜活清水3.5两公蟹、2.3两母蟹14只礼盒","buy_limit":0,"bn":"G6002461138311","image_path":"http://img.ywzyit.com/static/uploads/images/2020/09/16/16002458185f61d03ad0799.png","total_stock":234,"grade_price":[],"grade_info":{"id":1},"default_spes_desc":{"规格":{"共14只【10母蟹3.2两/只，4公蟹4.3两/只】":{"name":"共14只【10母蟹3.2两/只，4公蟹4.3两/只】","is_default":true}}},"amount":"588.00","promotion_list":[],"promotion_amount":0}
             * is_select : false
             * isCollection : false
             */

            private int id;
            private int user_id;
            private int product_id;
            private int nums;
            private int type;
            private String weight;
            private ProductsBean products;
            private boolean is_select;
            private boolean isCollection;

            public static class ProductsBean {
                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getGoods_id() {
                    return goods_id;
                }

                public void setGoods_id(int goods_id) {
                    this.goods_id = goods_id;
                }

                public Object getBarcode() {
                    return barcode;
                }

                public void setBarcode(Object barcode) {
                    this.barcode = barcode;
                }

                public String getSn() {
                    return sn;
                }

                public void setSn(String sn) {
                    this.sn = sn;
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

                public int getMarketable() {
                    return marketable;
                }

                public void setMarketable(int marketable) {
                    this.marketable = marketable;
                }

                public int getStock() {
                    return stock;
                }

                public void setStock(int stock) {
                    this.stock = stock;
                }

                public int getFreeze_stock() {
                    return freeze_stock;
                }

                public void setFreeze_stock(int freeze_stock) {
                    this.freeze_stock = freeze_stock;
                }

                public String getSpes_desc() {
                    return spes_desc;
                }

                public void setSpes_desc(String spes_desc) {
                    this.spes_desc = spes_desc;
                }

                public int getIs_defalut() {
                    return is_defalut;
                }

                public void setIs_defalut(int is_defalut) {
                    this.is_defalut = is_defalut;
                }

                public String getImage_id() {
                    return image_id;
                }

                public void setImage_id(String image_id) {
                    this.image_id = image_id;
                }

                public Object getIsdel() {
                    return isdel;
                }

                public void setIsdel(Object isdel) {
                    this.isdel = isdel;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getBuy_limit() {
                    return buy_limit;
                }

                public void setBuy_limit(int buy_limit) {
                    this.buy_limit = buy_limit;
                }

                public String getBn() {
                    return bn;
                }

                public void setBn(String bn) {
                    this.bn = bn;
                }

                public String getImage_path() {
                    return image_path;
                }

                public void setImage_path(String image_path) {
                    this.image_path = image_path;
                }

                public int getTotal_stock() {
                    return total_stock;
                }

                public void setTotal_stock(int total_stock) {
                    this.total_stock = total_stock;
                }

                public GradeInfoBean getGrade_info() {
                    return grade_info;
                }

                public void setGrade_info(GradeInfoBean grade_info) {
                    this.grade_info = grade_info;
                }

                public DefaultSpesDescBean getDefault_spes_desc() {
                    return default_spes_desc;
                }

                public void setDefault_spes_desc(DefaultSpesDescBean default_spes_desc) {
                    this.default_spes_desc = default_spes_desc;
                }

                public String getAmount() {
                    return amount;
                }

                public void setAmount(String amount) {
                    this.amount = amount;
                }

                public int getPromotion_amount() {
                    return promotion_amount;
                }

                public void setPromotion_amount(int promotion_amount) {
                    this.promotion_amount = promotion_amount;
                }

                public List<?> getGrade_price() {
                    return grade_price;
                }

                public void setGrade_price(List<?> grade_price) {
                    this.grade_price = grade_price;
                }

                public List<?> getPromotion_list() {
                    return promotion_list;
                }

                public void setPromotion_list(List<?> promotion_list) {
                    this.promotion_list = promotion_list;
                }

                /**
                 * id : 6574
                 * goods_id : 859
                 * barcode : null
                 * sn : P6002461138375
                 * price : 588.00
                 * costprice : 488.00
                 * mktprice : 0.00
                 * marketable : 1
                 * stock : 232
                 * freeze_stock : 2
                 * spes_desc : 规格:共14只【10母蟹3.2两/只，4公蟹4.3两/只】
                 * is_defalut : 1
                 * image_id :
                 * isdel : null
                 * name : 阳澄湖大闸蟹鲜活清水3.5两公蟹、2.3两母蟹14只礼盒
                 * buy_limit : 0
                 * bn : G6002461138311
                 * image_path : http://img.ywzyit.com/static/uploads/images/2020/09/16/16002458185f61d03ad0799.png
                 * total_stock : 234
                 * grade_price : []
                 * grade_info : {"id":1}
                 * default_spes_desc : {"规格":{"共14只【10母蟹3.2两/只，4公蟹4.3两/只】":{"name":"共14只【10母蟹3.2两/只，4公蟹4.3两/只】","is_default":true}}}
                 * amount : 588.00
                 * promotion_list : []
                 * promotion_amount : 0
                 */

                private int id;
                private int goods_id;
                private Object barcode;
                private String sn;
                private String price;
                private String costprice;
                private String mktprice;
                private int marketable;
                private int stock;
                private int freeze_stock;
                private String spes_desc;
                private int is_defalut;
                private String image_id;
                private Object isdel;
                private String name;
                private int buy_limit;
                private String bn;
                private String image_path;
                private int total_stock;
                private GradeInfoBean grade_info;
                private DefaultSpesDescBean default_spes_desc;
                private String amount;
                private int promotion_amount;
                private java.util.List<?> grade_price;
                private java.util.List<?> promotion_list;

                public static class GradeInfoBean {
                    /**
                     * id : 1
                     */

                    private int id;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }
                }

                public static class DefaultSpesDescBean {

                    /**
                     * 规格 : {"共14只【10母蟹3.2两/只，4公蟹4.3两/只】":{"name":"共14只【10母蟹3.2两/只，4公蟹4.3两/只】","is_default":true}}
                     */

                    private 规格Bean 规格;

                    // FIXME generate failure  field _$141032443291
                    public static class 规格Bean {
                        public static class 共14只 {
                            /**
                             * name : 共14只【10母蟹3.2两/只，4公蟹4.3两/只】
                             * is_default : true
                             */

                            private String name;
                            private boolean is_default;

                            public String getName() {
                                return name;
                            }

                            public void setName(String name) {
                                this.name = name;
                            }

                            public boolean isIs_default() {
                                return is_default;
                            }

                            public void setIs_default(boolean is_default) {
                                this.is_default = is_default;
                            }
                        }
                    }
                }
            }
        }
    }
}
