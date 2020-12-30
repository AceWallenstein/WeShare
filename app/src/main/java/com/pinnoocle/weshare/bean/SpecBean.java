package com.pinnoocle.weshare.bean;

import java.util.List;

public class SpecBean {

    /**
     * status : true
     * msg : 获取成功
     * data : {"id":9298,"goods_id":1484,"barcode":null,"sn":"P6079284369573","price":"22.90","costprice":"21.90","mktprice":"0.00","marketable":2,"stock":199,"freeze_stock":0,"spes_desc":"颜色:米色小熊围巾","is_defalut":2,"image_id":"1cfdc110550bd8ebda3c97d52271911d","isdel":null,"name":"冬季可爱超萌小熊帽子围巾一体两件套加厚毛绒保暖围脖","buy_limit":0,"bn":"G6079284369405","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079283865fd70a421550f.jpg","total_stock":199,"grade_price":[],"grade_info":{"id":1},"default_spes_desc":{"颜色":{"咖色小熊围巾":{"name":"咖色小熊围巾","product_id":9297},"米色小熊围巾":{"name":"米色小熊围巾","is_default":true},"灰色小熊围巾":{"name":"灰色小熊围巾","product_id":9299},"白色小熊围巾":{"name":"白色小熊围巾","product_id":9300}}},"amount":"22.90","promotion_list":[],"promotion_amount":0}
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
         * id : 9298
         * goods_id : 1484
         * barcode : null
         * sn : P6079284369573
         * price : 22.90
         * costprice : 21.90
         * mktprice : 0.00
         * marketable : 2
         * stock : 199
         * freeze_stock : 0
         * spes_desc : 颜色:米色小熊围巾
         * is_defalut : 2
         * image_id : 1cfdc110550bd8ebda3c97d52271911d
         * isdel : null
         * name : 冬季可爱超萌小熊帽子围巾一体两件套加厚毛绒保暖围脖
         * buy_limit : 0
         * bn : G6079284369405
         * image_path : http://img.ywzyit.com/static/uploads/images/2020/12/14/16079283865fd70a421550f.jpg
         * total_stock : 199
         * grade_price : []
         * grade_info : {"id":1}
         * default_spes_desc : {"颜色":{"咖色小熊围巾":{"name":"咖色小熊围巾","product_id":9297},"米色小熊围巾":{"name":"米色小熊围巾","is_default":true},"灰色小熊围巾":{"name":"灰色小熊围巾","product_id":9299},"白色小熊围巾":{"name":"白色小熊围巾","product_id":9300}}}
         * amount : 22.90
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
        private List<GradeInfoBean> grade_info;
        private DefaultSpesDescBean default_spes_desc;
        private String amount;
        private int promotion_amount;
        private List<?> grade_price;
        private List<?> promotion_list;

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

        public List<GradeInfoBean> getGrade_info() {
            return grade_info;
        }

        public void setGrade_info(List<GradeInfoBean> grade_info) {
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
             * 颜色 : {"咖色小熊围巾":{"name":"咖色小熊围巾","product_id":9297},"米色小熊围巾":{"name":"米色小熊围巾","is_default":true},"灰色小熊围巾":{"name":"灰色小熊围巾","product_id":9299},"白色小熊围巾":{"name":"白色小熊围巾","product_id":9300}}
             */

            private 颜色Bean 颜色;

            public 颜色Bean get颜色() {
                return 颜色;
            }

            public void set颜色(颜色Bean 颜色) {
                this.颜色 = 颜色;
            }

            public static class 颜色Bean {
                /**
                 * 咖色小熊围巾 : {"name":"咖色小熊围巾","product_id":9297}
                 * 米色小熊围巾 : {"name":"米色小熊围巾","is_default":true}
                 * 灰色小熊围巾 : {"name":"灰色小熊围巾","product_id":9299}
                 * 白色小熊围巾 : {"name":"白色小熊围巾","product_id":9300}
                 */

                private 咖色小熊围巾Bean 咖色小熊围巾;
                private 米色小熊围巾Bean 米色小熊围巾;
                private 灰色小熊围巾Bean 灰色小熊围巾;
                private 白色小熊围巾Bean 白色小熊围巾;

                public 咖色小熊围巾Bean get咖色小熊围巾() {
                    return 咖色小熊围巾;
                }

                public void set咖色小熊围巾(咖色小熊围巾Bean 咖色小熊围巾) {
                    this.咖色小熊围巾 = 咖色小熊围巾;
                }

                public 米色小熊围巾Bean get米色小熊围巾() {
                    return 米色小熊围巾;
                }

                public void set米色小熊围巾(米色小熊围巾Bean 米色小熊围巾) {
                    this.米色小熊围巾 = 米色小熊围巾;
                }

                public 灰色小熊围巾Bean get灰色小熊围巾() {
                    return 灰色小熊围巾;
                }

                public void set灰色小熊围巾(灰色小熊围巾Bean 灰色小熊围巾) {
                    this.灰色小熊围巾 = 灰色小熊围巾;
                }

                public 白色小熊围巾Bean get白色小熊围巾() {
                    return 白色小熊围巾;
                }

                public void set白色小熊围巾(白色小熊围巾Bean 白色小熊围巾) {
                    this.白色小熊围巾 = 白色小熊围巾;
                }

                public static class 咖色小熊围巾Bean {
                    /**
                     * name : 咖色小熊围巾
                     * product_id : 9297
                     */

                    private String name;
                    private int product_id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public int getProduct_id() {
                        return product_id;
                    }

                    public void setProduct_id(int product_id) {
                        this.product_id = product_id;
                    }
                }

                public static class 米色小熊围巾Bean {
                    /**
                     * name : 米色小熊围巾
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

                public static class 灰色小熊围巾Bean {
                    /**
                     * name : 灰色小熊围巾
                     * product_id : 9299
                     */

                    private String name;
                    private int product_id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public int getProduct_id() {
                        return product_id;
                    }

                    public void setProduct_id(int product_id) {
                        this.product_id = product_id;
                    }
                }

                public static class 白色小熊围巾Bean {
                    /**
                     * name : 白色小熊围巾
                     * product_id : 9300
                     */

                    private String name;
                    private int product_id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public int getProduct_id() {
                        return product_id;
                    }

                    public void setProduct_id(int product_id) {
                        this.product_id = product_id;
                    }
                }
            }
        }
    }
}
