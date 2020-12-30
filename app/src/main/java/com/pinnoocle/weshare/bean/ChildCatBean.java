package com.pinnoocle.weshare.bean;

import java.util.List;

public class ChildCatBean {

    /**
     * status : true
     * msg :
     * data : [{"id":112,"name":"休闲零食","sort":100,"image_id":"fc7d78cb3f7dca8e03ca694bec6037bc","image_url":"https://huzhu.meiliancheng.cn/static/uploads/images/2019/12/20/15768099145dfc35ba6a963.png"},{"id":114,"name":"坚果","sort":100,"image_id":"8d7bb972b6255af5e19024e9500ddbff","image_url":"https://huzhu.meiliancheng.cn/static/uploads/images/2019/12/20/15768099265dfc35c624ac6.png"},{"id":116,"name":"冲饮","sort":100,"image_id":"cfc453566a0be32e1aecf31636fa3ec7","image_url":"https://huzhu.meiliancheng.cn/static/uploads/images/2019/12/20/15768099365dfc35d03be7c.png"},{"id":118,"name":"粮油副食","sort":100,"image_id":"1d068c18bb57cba6f08e8877adf13c95","image_url":"https://huzhu.meiliancheng.cn/static/uploads/images/2019/12/20/15768106345dfc388a3fe73.png"},{"id":119,"name":"速食","sort":100,"image_id":"835b5dc121f622410c537206d3a5707b","image_url":"https://huzhu.meiliancheng.cn/static/uploads/images/2019/12/20/15768100255dfc3629ea359.png"},{"id":166,"name":"生鲜","sort":100,"image_id":"4bfe413efd01d88ddbe63c8a2ab105f8","image_url":"http://img.ywzyit.com/static/uploads/images/2020/11/24/16062100705fbcd216f2811.jpg"}]
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
         * id : 112
         * name : 休闲零食
         * sort : 100
         * image_id : fc7d78cb3f7dca8e03ca694bec6037bc
         * image_url : https://huzhu.meiliancheng.cn/static/uploads/images/2019/12/20/15768099145dfc35ba6a963.png
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
