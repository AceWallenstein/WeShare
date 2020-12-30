package com.pinnoocle.weshare.bean;

import java.util.List;

public class TopCatBean {

    /**
     * status : true
     * msg :
     * data : [{"id":14,"name":"食品","sort":1,"image_id":"dc756d5fcf9274597d2a2721706d7d36","image_url":"https://huzhu.meiliancheng.cn/static/uploads/images/2019/12/20/15768098995dfc35ab51e15.png"},{"id":47,"name":"洗护","sort":2,"image_id":""},{"id":45,"name":"百货","sort":3,"image_id":""},{"id":15,"name":"儿童母婴","sort":4,"image_id":"0b61a7354d7ff71fc746cecea4c3a5aa","image_url":"https://huzhu.meiliancheng.cn/static/uploads/images/2019/12/20/15768101635dfc36b34a53f.png"},{"id":65,"name":"家居","sort":5,"image_id":""},{"id":12,"name":"美妆","sort":6,"image_id":""},{"id":66,"name":"饰品","sort":7,"image_id":""},{"id":1,"name":"女装","sort":8,"image_id":"5d43e0e993e30d21ef69dd4b043dea5f","image_url":"http://huzhu.meiliancheng.cn/static/uploads/images/2019/11/09/15732805755dc65b3f1c2a5.jpeg"},{"id":4,"name":"男装","sort":9,"image_id":""},{"id":5,"name":"鞋靴","sort":10,"image_id":""},{"id":6,"name":"箱包","sort":11,"image_id":""},{"id":69,"name":"数码家电","sort":12,"image_id":""},{"id":32,"name":"服务","sort":13,"image_id":""}]
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
         * id : 14
         * name : 食品
         * sort : 1
         * image_id : dc756d5fcf9274597d2a2721706d7d36
         * image_url : https://huzhu.meiliancheng.cn/static/uploads/images/2019/12/20/15768098995dfc35ab51e15.png
         */

        private int id;
        private String name;
        private int sort;
        private String image_id;
        private String image_url;

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

        public int getSort() {
            return sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }

        public String getImage_id() {
            return image_id;
        }

        public void setImage_id(String image_id) {
            this.image_id = image_id;
        }

        public String getImage_url() {
            return image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }
    }
}
