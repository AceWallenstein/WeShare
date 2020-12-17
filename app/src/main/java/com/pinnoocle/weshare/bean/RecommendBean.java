package com.pinnoocle.weshare.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RecommendBean {

    /**
     * status : true
     * msg : 查询成功
     * data : {"list":[{"id":1505,"bn":"G6081932808665","name":"龙王豆浆480g速溶原味/甜味豆奶粉营养早餐无蔗糖无渣","brief":"","price":"16.60","costprice":"15.60","mktprice":"0.00","image_id":"39d9b34170446b8a439be6617382689b","goods_cat_id":116,"goods_type_id":25,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":285,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'>全国包邮，除部分地区包括内蒙古,甘肃,宁夏，海南，青海，西藏，新疆等地区需另加邮费，下单请联系客服。<\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081932605fdb14ec413b5.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081932605fdb14ece4474.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081932605fdb14ec3780d.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081932615fdb14edd5e77.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081932615fdb14ed61a53.png\"/><\/p><p style='overflow:hidden'><br/><\/p>","spes_desc":{"净含量":{"195841":"480g"}},"params":"","service":"1,4,6","comments_count":0,"view_count":0,"buy_count":15,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":2,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:56:{i:195840;a:1:{i:0;s:4:\"140g\";}i:195841;a:1:{i:0;s:4:\"480g\";}i:195842;a:1:{i:0;s:10:\"100g核桃\";}i:195843;a:1:{i:0;s:10:\"250g核桃\";}i:195844;a:1:{i:0;s:10:\"500g核桃\";}i:195845;a:1:{i:0;s:4:\"150g\";}i:195846;a:1:{i:0;s:4:\"800g\";}i:195847;a:1:{i:0;s:8:\"400g/瓶\";}i:195848;a:1:{i:0;s:3:\"13g\";}i:195849;a:1:{i:0;s:3:\"60g\";}i:195850;a:1:{i:0;s:4:\"500g\";}i:195851;a:1:{i:0;s:5:\"1000g\";}i:195852;a:1:{i:0;s:9:\"420g*6袋\";}i:195853;a:1:{i:0;s:4:\"1袋\";}i:195854;a:1:{i:0;s:11:\"2袋赠1袋\";}i:195855;a:1:{i:0;s:11:\"3袋赠2袋\";}i:195856;a:1:{i:0;s:3:\"80g\";}i:195857;a:1:{i:0;s:28:\"100g（白芝麻猪肉脯）\";}i:195858;a:1:{i:0;s:4:\"120g\";}i:195859;a:1:{i:0;s:4:\"160g\";}i:195860;a:1:{i:0;s:4:\"900g\";}i:195861;a:1:{i:0;s:3:\"1KG\";}i:195862;a:1:{i:0;s:4:\"658g\";}i:195863;a:1:{i:0;s:3:\"50g\";}i:195864;a:1:{i:0;s:4:\"185g\";}i:195865;a:1:{i:0;s:15:\"750g(家庭版)\";}i:195866;a:1:{i:0;s:19:\"750g（年货版）\";}i:195867;a:1:{i:0;s:25:\"100g（精制猪肉脯）\";}i:195868;a:1:{i:0;s:4:\"100g\";}i:195869;a:1:{i:0;s:18:\"80g（烧烤味）\";}i:195870;a:1:{i:0;s:14:\"80g(麻辣味)\";}i:195871;a:1:{i:0;s:16:\"100g( 蔓越莓)\";}i:195872;a:1:{i:0;s:16:\"100g（抹茶）\";}i:195873;a:1:{i:0;s:4:\"600g\";}i:195874;a:1:{i:0;s:3:\"90g\";}i:195875;a:1:{i:0;s:4:\"180g\";}i:195876;a:1:{i:0;s:11:\"50g(五香)\";}i:195877;a:1:{i:0;s:10:\"50g(XO酱)\";}i:195878;a:1:{i:0;s:15:\"50g（香辣）\";}i:195879;a:1:{i:0;s:15:\"100g(五香味)\";}i:195880;a:1:{i:0;s:15:\"100g(甜辣味)\";}i:195881;a:1:{i:0;s:15:\"185g(五香味)\";}i:195882;a:1:{i:0;s:15:\"185g(香辣味)\";}i:195883;a:1:{i:0;s:15:\"185g(烧烤味)\";}i:195884;a:1:{i:0;s:9:\"一支60g\";}i:195885;a:1:{i:0;s:13:\"两支共120g\";}i:195886;a:1:{i:0;s:20:\"4支牙膏1支牙刷\";}i:195887;a:1:{i:0;s:16:\"五支装共550g\";}i:195888;a:1:{i:0;s:4:\"330g\";}i:195889;a:1:{i:0;s:4:\"200g\";}i:195890;a:1:{i:0;s:3:\"2KG\";}i:195891;a:1:{i:0;s:9:\"115g*3块\";}i:195892;a:1:{i:0;s:10:\"1.1kg*1瓶\";}i:195893;a:1:{i:0;s:10:\"1.1kg*2瓶\";}i:195894;a:1:{i:0;s:5:\"20片\";}i:195895;a:1:{i:0;s:5:\"30片\";}}","ctime":null,"utime":1608193288,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"冲饮","products":[{"id":9711,"goods_id":1505,"barcode":null,"sn":"P6081932808722","price":"16.60","costprice":"15.60","mktprice":"0.00","marketable":2,"stock":285,"freeze_stock":0,"spes_desc":"净含量:480g","is_defalut":1,"image_id":"","isdel":null,"name":"龙王豆浆480g速溶原味/甜味豆奶粉营养早餐无蔗糖无渣","buy_limit":0,"bn":"G6081932808665","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931865fdb14a25f0dd.jpg","total_stock":285,"grade_price":[],"grade_info":[],"default_spes_desc":{"净含量":{"480g":{"name":"480g","is_default":true}}},"amount":"16.60","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931865fdb14a25f0dd.jpg","default":{"id":9711,"goods_id":1505,"barcode":null,"sn":"P6081932808722","price":"16.60","costprice":"15.60","mktprice":"0.00","marketable":2,"stock":285,"freeze_stock":0,"spes_desc":"净含量:480g","is_defalut":1,"image_id":"","isdel":null,"name":"龙王豆浆480g速溶原味/甜味豆奶粉营养早餐无蔗糖无渣","buy_limit":0,"bn":"G6081932808665","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931865fdb14a25f0dd.jpg","total_stock":285,"grade_price":[],"grade_info":[],"default_spes_desc":{"净含量":{"480g":{"name":"480g","is_default":true}}},"amount":"16.60","promotion_list":[],"promotion_amount":0},"product":{"id":9711,"goods_id":1505,"barcode":null,"sn":"P6081932808722","price":"16.60","costprice":"15.60","mktprice":"0.00","marketable":2,"stock":285,"spes_desc":"净含量:480g","is_defalut":1,"image_id":"","isdel":null,"name":"龙王豆浆480g速溶原味/甜味豆奶粉营养早餐无蔗糖无渣","buy_limit":0,"bn":"G6081932808665","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931865fdb14a25f0dd.jpg","total_stock":285,"grade_price":[],"grade_info":[],"default_spes_desc":{"净含量":{"480g":{"name":"480g","is_default":true}}},"amount":"16.60","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931865fdb14a25f0dd.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931865fdb14a2125ae.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931865fdb14a221980.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931875fdb14a310666.jpg"],"total_stock":285,"is_buy_num":15,"isfav":"false","can_buy":"ok","vip_price":16.6,"is_notice":0},{"id":1502,"bn":"G6081834950845","name":"正宗朝族韩式辣白菜500克每袋东北延边泡菜","brief":"不免邮区域:海外,台湾,澳门,\n香港,西藏,新疆,青海,内蒙古","price":"10.90","costprice":"9.85","mktprice":"0.00","image_id":"62ca973617351545a3d3fb096e2e337d","goods_cat_id":119,"goods_type_id":98,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":177,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081834775fdaeeb5d1357.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081834785fdaeeb6577d9.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081834785fdaeeb67f067.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081834795fdaeeb715602.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081834795fdaeeb7c3aa8.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081834805fdaeeb80cfa0.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081834805fdaeeb8182c4.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081059325fd9bfccd145a.png\" alt=\"16081059325fd9bfccd145a.png\"/><\/p>","spes_desc":{"口味":{"195453":"辣白菜500g"}},"params":"","service":"1,4,6,7","comments_count":0,"view_count":0,"buy_count":23,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":1,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:18:{i:195452;a:1:{i:0;s:17:\"山核桃98g*3袋\";}i:195453;a:1:{i:0;s:13:\"辣白菜500g\";}i:195454;a:1:{i:0;s:27:\"原味150克/袋（15枚）\";}i:195455;a:1:{i:0;s:27:\"香辣150克/袋（15枚）\";}i:195456;a:1:{i:0;s:29:\"1.26千克/桶【约120支】\";}i:195457;a:1:{i:0;s:22:\"香辣铁蛋15g*30包\t\";}i:195458;a:1:{i:0;s:19:\"盐焗味15g*30包\t\";}i:195459;a:1:{i:0;s:22:\"知心卤味20g*30包\t\";}i:195460;a:1:{i:0;s:19:\"泡椒味20g*30包\t\";}i:195461;a:1:{i:0;s:18:\"混合口味30包\t\";}i:195462;a:1:{i:0;s:10:\"520g桶装\";}i:195463;a:1:{i:0;s:15:\"原味98g*3袋\t\";}i:195464;a:1:{i:0;s:18:\"海盐味98g*3袋\t\";}i:195465;a:1:{i:0;s:24:\"蜂蜜黄油味98g*3袋\t\";}i:195466;a:1:{i:0;s:18:\"焦糖味98g*3袋\t\";}i:195467;a:1:{i:0;s:18:\"芝士味98g*3袋\t\";}i:195468;a:1:{i:0;s:18:\"藤椒味98g*3袋\t\";}i:195469;a:1:{i:0;s:64:\"3袋不同口味（请备注口味，没备注口味随机发）\";}}","ctime":null,"utime":1608183516,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"速食","products":[{"id":9355,"goods_id":1502,"barcode":null,"sn":"P6081834950911","price":"10.90","costprice":"9.85","mktprice":"0.00","marketable":2,"stock":177,"freeze_stock":0,"spes_desc":"口味:辣白菜500g","is_defalut":1,"image_id":"","isdel":null,"name":"正宗朝族韩式辣白菜500克每袋东北延边泡菜","buy_limit":0,"bn":"G6081834950845","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081833645fdaee44af888.jpg","total_stock":177,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"辣白菜500g":{"name":"辣白菜500g","is_default":true}}},"amount":"10.90","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081833645fdaee44af888.jpg","default":{"id":9355,"goods_id":1502,"barcode":null,"sn":"P6081834950911","price":"10.90","costprice":"9.85","mktprice":"0.00","marketable":2,"stock":177,"freeze_stock":0,"spes_desc":"口味:辣白菜500g","is_defalut":1,"image_id":"","isdel":null,"name":"正宗朝族韩式辣白菜500克每袋东北延边泡菜","buy_limit":0,"bn":"G6081834950845","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081833645fdaee44af888.jpg","total_stock":177,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"辣白菜500g":{"name":"辣白菜500g","is_default":true}}},"amount":"10.90","promotion_list":[],"promotion_amount":0},"product":{"id":9355,"goods_id":1502,"barcode":null,"sn":"P6081834950911","price":"10.90","costprice":"9.85","mktprice":"0.00","marketable":2,"stock":177,"spes_desc":"口味:辣白菜500g","is_defalut":1,"image_id":"","isdel":null,"name":"正宗朝族韩式辣白菜500克每袋东北延边泡菜","buy_limit":0,"bn":"G6081834950845","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081833645fdaee44af888.jpg","total_stock":177,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"辣白菜500g":{"name":"辣白菜500g","is_default":true}}},"amount":"10.90","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/17/16081833645fdaee44af888.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/17/16081833645fdaee44d7033.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/17/16081833645fdaee44b9f67.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/17/16081833645fdaee44968d3.jpg"],"total_stock":177,"is_buy_num":23,"isfav":"false","can_buy":"ok","vip_price":10.9,"is_notice":0},{"id":1499,"bn":"G6081051071151","name":"8味 30克*30包 泡脚中药包艾草艾叶红花生姜草本泡脚包女去湿气祛濕足浴粉包","brief":"","price":"26.80","costprice":"25.80","mktprice":"0.00","image_id":"20a988e0ffafb9556e28673b7e1512c1","goods_cat_id":135,"goods_type_id":95,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":187,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050905fd9bc82b6ddd.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050905fd9bc82c1820.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050905fd9bc82ccb30.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050905fd9bc82da5ce.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050905fd9bc82e5cf3.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050905fd9bc82ef6f5.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050915fd9bc8307bb5.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050915fd9bc8312e64.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050915fd9bc8346767.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050915fd9bc835210d.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050925fd9bc840e6d6.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050915fd9bc83908f8.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050925fd9bc844a492.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050925fd9bc84895d6.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050925fd9bc84c7595.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050925fd9bc84d1eef.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080987735fd9a3d5799cb.png\" alt=\"16080987735fd9a3d5799cb.png\"/><\/p>","spes_desc":{"规格":{"194976":"8味 30克*30包"}},"params":"","service":"1,4,6,7","comments_count":0,"view_count":0,"buy_count":13,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":1,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:45:{i:194975;a:1:{i:0;s:8:\"1个头\t\";}i:194976;a:1:{i:0;s:16:\"8味 30克*30包\";}i:194977;a:1:{i:0;s:6:\"200g*5\";}i:194978;a:1:{i:0;s:6:\"100只\";}i:194979;a:1:{i:0;s:51:\"1个蓝丝带小鸭+1个粉丝带小鸭+20粒电池\";}i:194980;a:1:{i:0;s:35:\"蓝丝带小鸭-充电款（1个）\";}i:194981;a:1:{i:0;s:35:\"粉丝带小鸭-充电款（1个）\";}i:194982;a:1:{i:0;s:33:\"咸肉松小贝【3包】约12枚\";}i:194983;a:1:{i:0;s:33:\"咸肉松小贝【6包】约24枚\";}i:194984;a:1:{i:0;s:33:\"咸肉松小贝 2kg/原装整箱\t\";}i:194985;a:1:{i:0;s:21:\"黑色（主驾驶）\";}i:194986;a:1:{i:0;s:21:\"黑色（副驾驶）\";}i:194987;a:1:{i:0;s:21:\"棕色（主驾驶）\";}i:194988;a:1:{i:0;s:21:\"棕色（副驾驶）\";}i:194989;a:1:{i:0;s:21:\"米色（主驾驶）\";}i:194990;a:1:{i:0;s:21:\"米色（副驾驶）\";}i:194991;a:1:{i:0;s:30:\"塑胶无皮款（主驾驶）\";}i:194992;a:1:{i:0;s:30:\"塑胶无皮款（副驾驶）\";}i:194993;a:1:{i:0;s:20:\"黑色主+副2个装\";}i:194994;a:1:{i:0;s:20:\"棕色主+副2个装\";}i:194995;a:1:{i:0;s:20:\"米色主+副2个装\";}i:194996;a:1:{i:0;s:29:\"塑胶无皮款主+副2个装\";}i:194997;a:1:{i:0;s:6:\"大号\";}i:194998;a:1:{i:0;s:6:\"小号\";}i:194999;a:1:{i:0;s:9:\"折叠款\";}i:195000;a:1:{i:0;s:12:\"折叠圆形\";}i:195001;a:1:{i:0;s:7:\"30包*2\";}i:195002;a:1:{i:0;s:5:\"50g*8\";}i:195003;a:1:{i:0;s:24:\"4个500ml高档水晶杯\";}i:195004;a:1:{i:0;s:23:\"S925银针耳钉一对 \";}i:195005;a:1:{i:0;s:25:\" 三角软垫耳夹一对\";}i:195006;a:1:{i:0;s:13:\"龙猫-小草\";}i:195007;a:1:{i:0;s:13:\"龙猫-萝卜\";}i:195008;a:1:{i:0;s:11:\"哆啦A梦1\";}i:195009;a:1:{i:0;s:11:\"哆啦A梦2\";}i:195010;a:1:{i:0;s:14:\"10支蓝桥opp\";}i:195011;a:1:{i:0;s:17:\"10支蓝桥+pu包\";}i:195012;a:1:{i:0;s:7:\"5个头\";}i:195013;a:1:{i:0;s:10:\"带1片布\";}i:195014;a:1:{i:0;s:10:\"带3片布\";}i:195015;a:1:{i:0;s:10:\"带7片布\";}i:195016;a:1:{i:0;s:30:\"美规电源（国内通用）\";}i:195017;a:1:{i:0;s:8:\"2个头\t\";}i:195018;a:1:{i:0;s:8:\"3个头\t\";}i:195019;a:1:{i:0;s:7:\"4个头\";}}","ctime":null,"utime":1608105121,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"居家用品","products":[{"id":9351,"goods_id":1499,"barcode":null,"sn":"P6081051071213","price":"26.80","costprice":"25.80","mktprice":"0.00","marketable":2,"stock":187,"freeze_stock":0,"spes_desc":"规格:8味 30克*30包","is_defalut":1,"image_id":"815df709678fa75afd5fde7d0240e681","isdel":null,"name":"8味 30克*30包 泡脚中药包艾草艾叶红花生姜草本泡脚包女去湿气祛濕足浴粉包","buy_limit":0,"bn":"G6081051071151","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050015fd9bc29a1f40.jpg","total_stock":187,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"8味 30克*30包":{"name":"8味 30克*30包","is_default":true}}},"amount":"26.80","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081049685fd9bc08b2da3.jpg","default":{"id":9351,"goods_id":1499,"barcode":null,"sn":"P6081051071213","price":"26.80","costprice":"25.80","mktprice":"0.00","marketable":2,"stock":187,"freeze_stock":0,"spes_desc":"规格:8味 30克*30包","is_defalut":1,"image_id":"815df709678fa75afd5fde7d0240e681","isdel":null,"name":"8味 30克*30包 泡脚中药包艾草艾叶红花生姜草本泡脚包女去湿气祛濕足浴粉包","buy_limit":0,"bn":"G6081051071151","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050015fd9bc29a1f40.jpg","total_stock":187,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"8味 30克*30包":{"name":"8味 30克*30包","is_default":true}}},"amount":"26.80","promotion_list":[],"promotion_amount":0},"product":{"id":9351,"goods_id":1499,"barcode":null,"sn":"P6081051071213","price":"26.80","costprice":"25.80","mktprice":"0.00","marketable":2,"stock":187,"spes_desc":"规格:8味 30克*30包","is_defalut":1,"image_id":"815df709678fa75afd5fde7d0240e681","isdel":null,"name":"8味 30克*30包 泡脚中药包艾草艾叶红花生姜草本泡脚包女去湿气祛濕足浴粉包","buy_limit":0,"bn":"G6081051071151","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050015fd9bc29a1f40.jpg","total_stock":187,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"8味 30克*30包":{"name":"8味 30克*30包","is_default":true}}},"amount":"26.80","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/16/16081049685fd9bc08b2da3.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16081049685fd9bc08a3012.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16081049685fd9bc08bd1bf.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16081049685fd9bc08cd184.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16081049685fd9bc08d69bd.jpg"],"total_stock":187,"is_buy_num":13,"isfav":"false","can_buy":"ok","vip_price":26.8,"is_notice":0},{"id":1497,"bn":"G6080987751265","name":"回忆杀火锅川粉200g*5袋麻辣烫粉皮速食免泡手工鲜粉火锅宽粉粉条","brief":"","price":"17.80","costprice":"15.80","mktprice":"0.00","image_id":"0082c2ed4ff4a1cabcc1f7dba719746c","goods_cat_id":119,"goods_type_id":95,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":297,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'><strong><span style=\"font-size: 20px;\">全国包邮，除部分地区包括内蒙古,甘肃,宁夏，海南，青海，西藏，新疆等地区需另加邮费，下单请联系客服哦。<\/span><\/strong><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080993585fd9a61e9353c.PNG\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080987675fd9a3cf94052.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080987705fd9a3d22ab8a.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080987705fd9a3d29c300.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080987715fd9a3d3b0cf7.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080987715fd9a3d3ef100.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080987735fd9a3d5799cb.png\"/><\/p><p style='overflow:hidden'><br/><\/p>","spes_desc":{"规格":{"194589":"200g*5"}},"params":"","service":"1,4,6","comments_count":0,"view_count":0,"buy_count":3,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":2,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:44:{i:194588;a:1:{i:0;s:8:\"1个头\t\";}i:194589;a:1:{i:0;s:6:\"200g*5\";}i:194590;a:1:{i:0;s:6:\"100只\";}i:194591;a:1:{i:0;s:51:\"1个蓝丝带小鸭+1个粉丝带小鸭+20粒电池\";}i:194592;a:1:{i:0;s:35:\"蓝丝带小鸭-充电款（1个）\";}i:194593;a:1:{i:0;s:35:\"粉丝带小鸭-充电款（1个）\";}i:194594;a:1:{i:0;s:33:\"咸肉松小贝【3包】约12枚\";}i:194595;a:1:{i:0;s:33:\"咸肉松小贝【6包】约24枚\";}i:194596;a:1:{i:0;s:33:\"咸肉松小贝 2kg/原装整箱\t\";}i:194597;a:1:{i:0;s:21:\"黑色（主驾驶）\";}i:194598;a:1:{i:0;s:21:\"黑色（副驾驶）\";}i:194599;a:1:{i:0;s:21:\"棕色（主驾驶）\";}i:194600;a:1:{i:0;s:21:\"棕色（副驾驶）\";}i:194601;a:1:{i:0;s:21:\"米色（主驾驶）\";}i:194602;a:1:{i:0;s:21:\"米色（副驾驶）\";}i:194603;a:1:{i:0;s:30:\"塑胶无皮款（主驾驶）\";}i:194604;a:1:{i:0;s:30:\"塑胶无皮款（副驾驶）\";}i:194605;a:1:{i:0;s:20:\"黑色主+副2个装\";}i:194606;a:1:{i:0;s:20:\"棕色主+副2个装\";}i:194607;a:1:{i:0;s:20:\"米色主+副2个装\";}i:194608;a:1:{i:0;s:29:\"塑胶无皮款主+副2个装\";}i:194609;a:1:{i:0;s:6:\"大号\";}i:194610;a:1:{i:0;s:6:\"小号\";}i:194611;a:1:{i:0;s:9:\"折叠款\";}i:194612;a:1:{i:0;s:12:\"折叠圆形\";}i:194613;a:1:{i:0;s:7:\"30包*2\";}i:194614;a:1:{i:0;s:5:\"50g*8\";}i:194615;a:1:{i:0;s:24:\"4个500ml高档水晶杯\";}i:194616;a:1:{i:0;s:23:\"S925银针耳钉一对 \";}i:194617;a:1:{i:0;s:25:\" 三角软垫耳夹一对\";}i:194618;a:1:{i:0;s:13:\"龙猫-小草\";}i:194619;a:1:{i:0;s:13:\"龙猫-萝卜\";}i:194620;a:1:{i:0;s:11:\"哆啦A梦1\";}i:194621;a:1:{i:0;s:11:\"哆啦A梦2\";}i:194622;a:1:{i:0;s:14:\"10支蓝桥opp\";}i:194623;a:1:{i:0;s:17:\"10支蓝桥+pu包\";}i:194624;a:1:{i:0;s:7:\"5个头\";}i:194625;a:1:{i:0;s:10:\"带1片布\";}i:194626;a:1:{i:0;s:10:\"带3片布\";}i:194627;a:1:{i:0;s:10:\"带7片布\";}i:194628;a:1:{i:0;s:30:\"美规电源（国内通用）\";}i:194629;a:1:{i:0;s:8:\"2个头\t\";}i:194630;a:1:{i:0;s:8:\"3个头\t\";}i:194631;a:1:{i:0;s:7:\"4个头\";}}","ctime":null,"utime":1608112557,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"速食","products":[{"id":9349,"goods_id":1497,"barcode":null,"sn":"P6080987751331","price":"17.80","costprice":"15.80","mktprice":"0.00","marketable":1,"stock":297,"freeze_stock":0,"spes_desc":"规格:200g*5","is_defalut":1,"image_id":"","isdel":null,"name":"回忆杀火锅川粉200g*5袋麻辣烫粉皮速食免泡手工鲜粉火锅宽粉粉条","buy_limit":0,"bn":"G6080987751265","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080986975fd9a3897692e.jpg","total_stock":297,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"200g*5":{"name":"200g*5","is_default":true}}},"amount":"17.80","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080986975fd9a3897692e.jpg","default":{"id":9349,"goods_id":1497,"barcode":null,"sn":"P6080987751331","price":"17.80","costprice":"15.80","mktprice":"0.00","marketable":1,"stock":297,"freeze_stock":0,"spes_desc":"规格:200g*5","is_defalut":1,"image_id":"","isdel":null,"name":"回忆杀火锅川粉200g*5袋麻辣烫粉皮速食免泡手工鲜粉火锅宽粉粉条","buy_limit":0,"bn":"G6080987751265","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080986975fd9a3897692e.jpg","total_stock":297,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"200g*5":{"name":"200g*5","is_default":true}}},"amount":"17.80","promotion_list":[],"promotion_amount":0},"product":{"id":9349,"goods_id":1497,"barcode":null,"sn":"P6080987751331","price":"17.80","costprice":"15.80","mktprice":"0.00","marketable":1,"stock":297,"spes_desc":"规格:200g*5","is_defalut":1,"image_id":"","isdel":null,"name":"回忆杀火锅川粉200g*5袋麻辣烫粉皮速食免泡手工鲜粉火锅宽粉粉条","buy_limit":0,"bn":"G6080987751265","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080986975fd9a3897692e.jpg","total_stock":297,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"200g*5":{"name":"200g*5","is_default":true}}},"amount":"17.80","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/16/16080986975fd9a3897692e.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16080986975fd9a389833d7.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16080986975fd9a3898daca.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16080986975fd9a3899db46.jpg"],"total_stock":297,"is_buy_num":3,"isfav":"false","can_buy":"ok","vip_price":17.8,"is_notice":0},{"id":1496,"bn":"G6080973578343","name":"一次性纸杯家用商用加厚杯子100只饮水热饮杯210ml","brief":"","price":"10.90","costprice":"9.90","mktprice":"0.00","image_id":"7f5b5a33a3163c523016fa47378785f5","goods_cat_id":99,"goods_type_id":95,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":293,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'>全国包邮，除部分地区包括内蒙古,甘肃,宁夏，海南，青海，西藏，新疆等地区需另加邮费，下单请联系客服。<\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080973555fd99e4b3f22c.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080973555fd99e4b6bd0c.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080973555fd99e4b584e9.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080973555fd99e4bc3cb8.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080973555fd99e4bdbbe8.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080973555fd99e4be5486.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080973555fd99e4bf2438.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080973565fd99e4c0dd44.png\"/><\/p><p style='overflow:hidden'><br/><\/p>","spes_desc":{"规格":{"194546":"100只"}},"params":"","service":"1,4,6","comments_count":0,"view_count":0,"buy_count":7,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":2,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:43:{i:194545;a:1:{i:0;s:8:\"1个头\t\";}i:194546;a:1:{i:0;s:6:\"100只\";}i:194547;a:1:{i:0;s:51:\"1个蓝丝带小鸭+1个粉丝带小鸭+20粒电池\";}i:194548;a:1:{i:0;s:35:\"蓝丝带小鸭-充电款（1个）\";}i:194549;a:1:{i:0;s:35:\"粉丝带小鸭-充电款（1个）\";}i:194550;a:1:{i:0;s:33:\"咸肉松小贝【3包】约12枚\";}i:194551;a:1:{i:0;s:33:\"咸肉松小贝【6包】约24枚\";}i:194552;a:1:{i:0;s:33:\"咸肉松小贝 2kg/原装整箱\t\";}i:194553;a:1:{i:0;s:21:\"黑色（主驾驶）\";}i:194554;a:1:{i:0;s:21:\"黑色（副驾驶）\";}i:194555;a:1:{i:0;s:21:\"棕色（主驾驶）\";}i:194556;a:1:{i:0;s:21:\"棕色（副驾驶）\";}i:194557;a:1:{i:0;s:21:\"米色（主驾驶）\";}i:194558;a:1:{i:0;s:21:\"米色（副驾驶）\";}i:194559;a:1:{i:0;s:30:\"塑胶无皮款（主驾驶）\";}i:194560;a:1:{i:0;s:30:\"塑胶无皮款（副驾驶）\";}i:194561;a:1:{i:0;s:20:\"黑色主+副2个装\";}i:194562;a:1:{i:0;s:20:\"棕色主+副2个装\";}i:194563;a:1:{i:0;s:20:\"米色主+副2个装\";}i:194564;a:1:{i:0;s:29:\"塑胶无皮款主+副2个装\";}i:194565;a:1:{i:0;s:6:\"大号\";}i:194566;a:1:{i:0;s:6:\"小号\";}i:194567;a:1:{i:0;s:9:\"折叠款\";}i:194568;a:1:{i:0;s:12:\"折叠圆形\";}i:194569;a:1:{i:0;s:7:\"30包*2\";}i:194570;a:1:{i:0;s:5:\"50g*8\";}i:194571;a:1:{i:0;s:24:\"4个500ml高档水晶杯\";}i:194572;a:1:{i:0;s:23:\"S925银针耳钉一对 \";}i:194573;a:1:{i:0;s:25:\" 三角软垫耳夹一对\";}i:194574;a:1:{i:0;s:13:\"龙猫-小草\";}i:194575;a:1:{i:0;s:13:\"龙猫-萝卜\";}i:194576;a:1:{i:0;s:11:\"哆啦A梦1\";}i:194577;a:1:{i:0;s:11:\"哆啦A梦2\";}i:194578;a:1:{i:0;s:14:\"10支蓝桥opp\";}i:194579;a:1:{i:0;s:17:\"10支蓝桥+pu包\";}i:194580;a:1:{i:0;s:7:\"5个头\";}i:194581;a:1:{i:0;s:10:\"带1片布\";}i:194582;a:1:{i:0;s:10:\"带3片布\";}i:194583;a:1:{i:0;s:10:\"带7片布\";}i:194584;a:1:{i:0;s:30:\"美规电源（国内通用）\";}i:194585;a:1:{i:0;s:8:\"2个头\t\";}i:194586;a:1:{i:0;s:8:\"3个头\t\";}i:194587;a:1:{i:0;s:7:\"4个头\";}}","ctime":null,"utime":1608112490,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"杯子","products":[{"id":9348,"goods_id":1496,"barcode":null,"sn":"P6080973578411","price":"10.90","costprice":"9.90","mktprice":"0.00","marketable":2,"stock":293,"freeze_stock":0,"spes_desc":"规格:100只","is_defalut":1,"image_id":"","isdel":null,"name":"一次性纸杯家用商用加厚杯子100只饮水热饮杯210ml","buy_limit":0,"bn":"G6080973578343","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080971945fd99daa8cda8.jpg","total_stock":293,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"100只":{"name":"100只","is_default":true}}},"amount":"10.90","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080971945fd99daa8cda8.jpg","default":{"id":9348,"goods_id":1496,"barcode":null,"sn":"P6080973578411","price":"10.90","costprice":"9.90","mktprice":"0.00","marketable":2,"stock":293,"freeze_stock":0,"spes_desc":"规格:100只","is_defalut":1,"image_id":"","isdel":null,"name":"一次性纸杯家用商用加厚杯子100只饮水热饮杯210ml","buy_limit":0,"bn":"G6080973578343","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080971945fd99daa8cda8.jpg","total_stock":293,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"100只":{"name":"100只","is_default":true}}},"amount":"10.90","promotion_list":[],"promotion_amount":0},"product":{"id":9348,"goods_id":1496,"barcode":null,"sn":"P6080973578411","price":"10.90","costprice":"9.90","mktprice":"0.00","marketable":2,"stock":293,"spes_desc":"规格:100只","is_defalut":1,"image_id":"","isdel":null,"name":"一次性纸杯家用商用加厚杯子100只饮水热饮杯210ml","buy_limit":0,"bn":"G6080973578343","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080971945fd99daa8cda8.jpg","total_stock":293,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"100只":{"name":"100只","is_default":true}}},"amount":"10.90","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/16/16080971945fd99daa8cda8.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16080971955fd99dab1363b.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16080971945fd99daae703d.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16080971955fd99dab20d7f.jpg"],"total_stock":293,"is_buy_num":7,"isfav":"false","can_buy":"ok","vip_price":10.9,"is_notice":0},{"id":1495,"bn":"G6080853273903","name":"2双 东北零下40°加绒保暖袜子加厚毛圈羊毛袜女","brief":"不免邮区域:海外,台湾,澳门,\n香港,西藏,新疆,宁夏,青海,内蒙古","price":"21.00","costprice":"19.88","mktprice":"0.00","image_id":"8830484ce4df9b2cdd7fc13293249981","goods_cat_id":135,"goods_type_id":92,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":841,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080853085fd96f3cd09b1.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080853095fd96f3d7e46d.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080853105fd96f3e2ef28.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080853105fd96f3ea1b71.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080853115fd96f3f56268.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080853115fd96f3f941eb.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080853115fd96f3fd9cc9.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080192945fd86d5e4cd86.png\" alt=\"16080192945fd86d5e4cd86.png\"/><\/p>","spes_desc":{"颜色":{"194503":"橘黄+默认随机【共2双，指定搭配色请自行备注！】","194504":"黑+默认随机【共2双，指定搭配色请自行备注！】","194505":"灰色+默认随机【共2双，指定搭配色请自行备注！】","194506":"粉色+默认随机【共2双，指定搭配色请自行备注！】","194507":"砖红+默认随机【共2双，指定搭配色请自行备注！】"}},"params":"","service":"1,4,6,7","comments_count":0,"view_count":0,"buy_count":21,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":1,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:43:{i:194502;a:1:{i:0;s:6:\"白色\";}i:194503;a:1:{i:0;s:68:\"橘黄+默认随机【共2双，指定搭配色请自行备注！】\";}i:194504;a:1:{i:0;s:65:\"黑+默认随机【共2双，指定搭配色请自行备注！】\";}i:194505;a:1:{i:0;s:68:\"灰色+默认随机【共2双，指定搭配色请自行备注！】\";}i:194506;a:1:{i:0;s:68:\"粉色+默认随机【共2双，指定搭配色请自行备注！】\";}i:194507;a:1:{i:0;s:68:\"砖红+默认随机【共2双，指定搭配色请自行备注！】\";}i:194508;a:1:{i:0;s:53:\"圣诞发卡10对【款式随机，介意者慎拍】\";}i:194509;a:1:{i:0;s:18:\"01#黑灰色红杆\";}i:194510;a:1:{i:0;s:18:\"02#深棕色红杆\";}i:194511;a:1:{i:0;s:18:\"03#灰棕色红杆\";}i:194512;a:1:{i:0;s:18:\"04#茶棕色红杆\";}i:194513;a:1:{i:0;s:4:\"2551\";}i:194514;a:1:{i:0;s:4:\"2521\";}i:194515;a:1:{i:0;s:4:\"2518\";}i:194516;a:1:{i:0;s:4:\"2519\";}i:194517;a:1:{i:0;s:4:\"2517\";}i:194518;a:1:{i:0;s:21:\"【一口袋礼物】\";}i:194519;a:1:{i:0;s:21:\"【神奇的袜子】\";}i:194520;a:1:{i:0;s:21:\"【吉祥的麋鹿】\";}i:194521;a:1:{i:0;s:9:\"咖啡色\";}i:194522;a:1:{i:0;s:6:\"浅灰\";}i:194523;a:1:{i:0;s:6:\"卡其\";}i:194524;a:1:{i:0;s:9:\"牛仔蓝\";}i:194525;a:1:{i:0;s:6:\"姜黄\";}i:194526;a:1:{i:0;s:6:\"焦糖\";}i:194527;a:1:{i:0;s:6:\"军绿\";}i:194528;a:1:{i:0;s:6:\"深灰\";}i:194529;a:1:{i:0;s:6:\"黑色\";}i:194530;a:1:{i:0;s:22:\"双杆【5色混搭】\";}i:194531;a:1:{i:0;s:22:\"恐龙【5色混搭】\";}i:194532;a:1:{i:0;s:22:\"猫咪【5色混搭】\";}i:194533;a:1:{i:0;s:22:\"英伦【5色混搭】\";}i:194534;a:1:{i:0;s:9:\"北欧米\";}i:194535;a:1:{i:0;s:9:\"北欧粉\";}i:194536;a:1:{i:0;s:9:\"北欧绿\";}i:194537;a:1:{i:0;s:9:\"北欧蓝\";}i:194538;a:1:{i:0;s:9:\"牛头绿\";}i:194539;a:1:{i:0;s:9:\"牛头咖\";}i:194540;a:1:{i:0;s:9:\"牛头粉\";}i:194541;a:1:{i:0;s:9:\"牛头灰\";}i:194542;a:1:{i:0;s:6:\"蓝色\";}i:194543;a:1:{i:0;s:6:\"粉色\";}i:194544;a:1:{i:0;s:6:\"灰色\";}}","ctime":null,"utime":1608085454,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"居家用品","products":[{"id":9343,"goods_id":1495,"barcode":null,"sn":"P6080853273995","price":"21.00","costprice":"19.88","mktprice":"0.00","marketable":2,"stock":163,"freeze_stock":0,"spes_desc":"颜色:橘黄+默认随机【共2双，指定搭配色请自行备注！】","is_defalut":1,"image_id":"4e0cc57bc548b53cb0c19222b0be79f2","isdel":null,"name":"2双 东北零下40°加绒保暖袜子加厚毛圈羊毛袜女","buy_limit":0,"bn":"G6080853273903","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080852135fd96edda6396.jpg","total_stock":163,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"橘黄+默认随机【共2双，指定搭配色请自行备注！】":{"name":"橘黄+默认随机【共2双，指定搭配色请自行备注！】","is_default":true},"黑+默认随机【共2双，指定搭配色请自行备注！】":{"name":"黑+默认随机【共2双，指定搭配色请自行备注！】","product_id":9344},"灰色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"灰色+默认随机【共2双，指定搭配色请自行备注！】","product_id":9345},"粉色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"粉色+默认随机【共2双，指定搭配色请自行备注！】","product_id":9346},"砖红+默认随机【共2双，指定搭配色请自行备注！】":{"name":"砖红+默认随机【共2双，指定搭配色请自行备注！】","product_id":9347}}},"amount":"21.00","promotion_list":[],"promotion_amount":0},{"id":9344,"goods_id":1495,"barcode":null,"sn":"P6080853274043","price":"21.00","costprice":"19.88","mktprice":"0.00","marketable":2,"stock":172,"freeze_stock":0,"spes_desc":"颜色:黑+默认随机【共2双，指定搭配色请自行备注！】","is_defalut":2,"image_id":"80b0caae52c2afd8b5f6eb6106ef3142","isdel":null,"name":"2双 东北零下40°加绒保暖袜子加厚毛圈羊毛袜女","buy_limit":0,"bn":"G6080853273903","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080852235fd96ee7d2dda.jpg","total_stock":172,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"橘黄+默认随机【共2双，指定搭配色请自行备注！】":{"name":"橘黄+默认随机【共2双，指定搭配色请自行备注！】","product_id":9343},"黑+默认随机【共2双，指定搭配色请自行备注！】":{"name":"黑+默认随机【共2双，指定搭配色请自行备注！】","is_default":true},"灰色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"灰色+默认随机【共2双，指定搭配色请自行备注！】","product_id":9345},"粉色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"粉色+默认随机【共2双，指定搭配色请自行备注！】","product_id":9346},"砖红+默认随机【共2双，指定搭配色请自行备注！】":{"name":"砖红+默认随机【共2双，指定搭配色请自行备注！】","product_id":9347}}},"amount":"21.00","promotion_list":[],"promotion_amount":0},{"id":9345,"goods_id":1495,"barcode":null,"sn":"P6080853274081","price":"21.00","costprice":"19.88","mktprice":"0.00","marketable":2,"stock":169,"freeze_stock":0,"spes_desc":"颜色:灰色+默认随机【共2双，指定搭配色请自行备注！】","is_defalut":2,"image_id":"c8bf342c2aebbfa2bf47dd8fb9449ccd","isdel":null,"name":"2双 东北零下40°加绒保暖袜子加厚毛圈羊毛袜女","buy_limit":0,"bn":"G6080853273903","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080852335fd96ef184879.jpg","total_stock":169,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"橘黄+默认随机【共2双，指定搭配色请自行备注！】":{"name":"橘黄+默认随机【共2双，指定搭配色请自行备注！】","product_id":9343},"黑+默认随机【共2双，指定搭配色请自行备注！】":{"name":"黑+默认随机【共2双，指定搭配色请自行备注！】","product_id":9344},"灰色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"灰色+默认随机【共2双，指定搭配色请自行备注！】","is_default":true},"粉色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"粉色+默认随机【共2双，指定搭配色请自行备注！】","product_id":9346},"砖红+默认随机【共2双，指定搭配色请自行备注！】":{"name":"砖红+默认随机【共2双，指定搭配色请自行备注！】","product_id":9347}}},"amount":"21.00","promotion_list":[],"promotion_amount":0},{"id":9346,"goods_id":1495,"barcode":null,"sn":"P6080853274112","price":"21.00","costprice":"19.88","mktprice":"0.00","marketable":2,"stock":171,"freeze_stock":0,"spes_desc":"颜色:粉色+默认随机【共2双，指定搭配色请自行备注！】","is_defalut":2,"image_id":"eaa6202c07960f488f2b5b463ecf897e","isdel":null,"name":"2双 东北零下40°加绒保暖袜子加厚毛圈羊毛袜女","buy_limit":0,"bn":"G6080853273903","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080852435fd96efb249f5.jpg","total_stock":171,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"橘黄+默认随机【共2双，指定搭配色请自行备注！】":{"name":"橘黄+默认随机【共2双，指定搭配色请自行备注！】","product_id":9343},"黑+默认随机【共2双，指定搭配色请自行备注！】":{"name":"黑+默认随机【共2双，指定搭配色请自行备注！】","product_id":9344},"灰色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"灰色+默认随机【共2双，指定搭配色请自行备注！】","product_id":9345},"粉色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"粉色+默认随机【共2双，指定搭配色请自行备注！】","is_default":true},"砖红+默认随机【共2双，指定搭配色请自行备注！】":{"name":"砖红+默认随机【共2双，指定搭配色请自行备注！】","product_id":9347}}},"amount":"21.00","promotion_list":[],"promotion_amount":0},{"id":9347,"goods_id":1495,"barcode":null,"sn":"P6080853274151","price":"21.00","costprice":"19.88","mktprice":"0.00","marketable":2,"stock":166,"freeze_stock":0,"spes_desc":"颜色:砖红+默认随机【共2双，指定搭配色请自行备注！】","is_defalut":2,"image_id":"6ea47205280e8aff63ccb19f1ea60b25","isdel":null,"name":"2双 东北零下40°加绒保暖袜子加厚毛圈羊毛袜女","buy_limit":0,"bn":"G6080853273903","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080852535fd96f054a7a8.jpg","total_stock":166,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"橘黄+默认随机【共2双，指定搭配色请自行备注！】":{"name":"橘黄+默认随机【共2双，指定搭配色请自行备注！】","product_id":9343},"黑+默认随机【共2双，指定搭配色请自行备注！】":{"name":"黑+默认随机【共2双，指定搭配色请自行备注！】","product_id":9344},"灰色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"灰色+默认随机【共2双，指定搭配色请自行备注！】","product_id":9345},"粉色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"粉色+默认随机【共2双，指定搭配色请自行备注！】","product_id":9346},"砖红+默认随机【共2双，指定搭配色请自行备注！】":{"name":"砖红+默认随机【共2双，指定搭配色请自行备注！】","is_default":true}}},"amount":"21.00","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080851435fd96e97cad9d.jpg","default":{"id":9343,"goods_id":1495,"barcode":null,"sn":"P6080853273995","price":"21.00","costprice":"19.88","mktprice":"0.00","marketable":2,"stock":163,"freeze_stock":0,"spes_desc":"颜色:橘黄+默认随机【共2双，指定搭配色请自行备注！】","is_defalut":1,"image_id":"4e0cc57bc548b53cb0c19222b0be79f2","isdel":null,"name":"2双 东北零下40°加绒保暖袜子加厚毛圈羊毛袜女","buy_limit":0,"bn":"G6080853273903","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080852135fd96edda6396.jpg","total_stock":163,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"橘黄+默认随机【共2双，指定搭配色请自行备注！】":{"name":"橘黄+默认随机【共2双，指定搭配色请自行备注！】","is_default":true},"黑+默认随机【共2双，指定搭配色请自行备注！】":{"name":"黑+默认随机【共2双，指定搭配色请自行备注！】","product_id":9344},"灰色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"灰色+默认随机【共2双，指定搭配色请自行备注！】","product_id":9345},"粉色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"粉色+默认随机【共2双，指定搭配色请自行备注！】","product_id":9346},"砖红+默认随机【共2双，指定搭配色请自行备注！】":{"name":"砖红+默认随机【共2双，指定搭配色请自行备注！】","product_id":9347}}},"amount":"21.00","promotion_list":[],"promotion_amount":0},"product":{"id":9343,"goods_id":1495,"barcode":null,"sn":"P6080853273995","price":"21.00","costprice":"19.88","mktprice":"0.00","marketable":2,"stock":163,"spes_desc":"颜色:橘黄+默认随机【共2双，指定搭配色请自行备注！】","is_defalut":1,"image_id":"4e0cc57bc548b53cb0c19222b0be79f2","isdel":null,"name":"2双 东北零下40°加绒保暖袜子加厚毛圈羊毛袜女","buy_limit":0,"bn":"G6080853273903","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080852135fd96edda6396.jpg","total_stock":163,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"橘黄+默认随机【共2双，指定搭配色请自行备注！】":{"name":"橘黄+默认随机【共2双，指定搭配色请自行备注！】","is_default":true},"黑+默认随机【共2双，指定搭配色请自行备注！】":{"name":"黑+默认随机【共2双，指定搭配色请自行备注！】","product_id":9344},"灰色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"灰色+默认随机【共2双，指定搭配色请自行备注！】","product_id":9345},"粉色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"粉色+默认随机【共2双，指定搭配色请自行备注！】","product_id":9346},"砖红+默认随机【共2双，指定搭配色请自行备注！】":{"name":"砖红+默认随机【共2双，指定搭配色请自行备注！】","product_id":9347}}},"amount":"21.00","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/16/16080851435fd96e97cad9d.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16080851435fd96e97b4462.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16080851435fd96e97c1bea.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16080851435fd96e97da061.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16080851435fd96e97e4405.jpg"],"total_stock":841,"is_buy_num":21,"isfav":"false","can_buy":"ok","vip_price":21,"is_notice":0},{"id":1494,"bn":"G6080213972163","name":"10对 圣诞节鹿角发夹女韩国ins网红简约小麋鹿发卡","brief":"不免邮区域:海外,台湾,澳门\n,香港,西藏,新疆,宁夏,青海,内蒙古","price":"13.80","costprice":"12.80","mktprice":"0.00","image_id":"35dac65b7e5cee1897baf40aa155ea18","goods_cat_id":131,"goods_type_id":92,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":299,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080213835fd87587adad9.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080213835fd875870b04b.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080213825fd8758700e96.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080213845fd875885b5c0.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080213845fd87588cd355.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080213855fd8758916d02.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080213865fd8758a37277.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080213855fd8758988606.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080213865fd8758aa7bb9.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080192945fd86d5e4cd86.png\" alt=\"16080192945fd86d5e4cd86.png\"/><\/p>","spes_desc":{"颜色":{"195065":"圣诞发卡2对【款式随机，介意者慎拍！】","195071":"圣诞发卡10对【款式随机，介意者慎拍】"}},"params":"","service":"1,4,6,7","comments_count":0,"view_count":0,"buy_count":27,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":1,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:44:{i:195064;a:1:{i:0;s:6:\"白色\";}i:195065;a:1:{i:0;s:55:\"圣诞发卡2对【款式随机，介意者慎拍！】\";}i:195066;a:1:{i:0;s:68:\"橘黄+默认随机【共2双，指定搭配色请自行备注！】\";}i:195067;a:1:{i:0;s:65:\"黑+默认随机【共2双，指定搭配色请自行备注！】\";}i:195068;a:1:{i:0;s:68:\"灰色+默认随机【共2双，指定搭配色请自行备注！】\";}i:195069;a:1:{i:0;s:68:\"粉色+默认随机【共2双，指定搭配色请自行备注！】\";}i:195070;a:1:{i:0;s:68:\"砖红+默认随机【共2双，指定搭配色请自行备注！】\";}i:195071;a:1:{i:0;s:53:\"圣诞发卡10对【款式随机，介意者慎拍】\";}i:195072;a:1:{i:0;s:18:\"01#黑灰色红杆\";}i:195073;a:1:{i:0;s:18:\"02#深棕色红杆\";}i:195074;a:1:{i:0;s:18:\"03#灰棕色红杆\";}i:195075;a:1:{i:0;s:18:\"04#茶棕色红杆\";}i:195076;a:1:{i:0;s:4:\"2551\";}i:195077;a:1:{i:0;s:4:\"2521\";}i:195078;a:1:{i:0;s:4:\"2518\";}i:195079;a:1:{i:0;s:4:\"2519\";}i:195080;a:1:{i:0;s:4:\"2517\";}i:195081;a:1:{i:0;s:21:\"【一口袋礼物】\";}i:195082;a:1:{i:0;s:21:\"【神奇的袜子】\";}i:195083;a:1:{i:0;s:21:\"【吉祥的麋鹿】\";}i:195084;a:1:{i:0;s:9:\"咖啡色\";}i:195085;a:1:{i:0;s:6:\"浅灰\";}i:195086;a:1:{i:0;s:6:\"卡其\";}i:195087;a:1:{i:0;s:9:\"牛仔蓝\";}i:195088;a:1:{i:0;s:6:\"姜黄\";}i:195089;a:1:{i:0;s:6:\"焦糖\";}i:195090;a:1:{i:0;s:6:\"军绿\";}i:195091;a:1:{i:0;s:6:\"深灰\";}i:195092;a:1:{i:0;s:6:\"黑色\";}i:195093;a:1:{i:0;s:22:\"双杆【5色混搭】\";}i:195094;a:1:{i:0;s:22:\"恐龙【5色混搭】\";}i:195095;a:1:{i:0;s:22:\"猫咪【5色混搭】\";}i:195096;a:1:{i:0;s:22:\"英伦【5色混搭】\";}i:195097;a:1:{i:0;s:9:\"北欧米\";}i:195098;a:1:{i:0;s:9:\"北欧粉\";}i:195099;a:1:{i:0;s:9:\"北欧绿\";}i:195100;a:1:{i:0;s:9:\"北欧蓝\";}i:195101;a:1:{i:0;s:9:\"牛头绿\";}i:195102;a:1:{i:0;s:9:\"牛头咖\";}i:195103;a:1:{i:0;s:9:\"牛头粉\";}i:195104;a:1:{i:0;s:9:\"牛头灰\";}i:195105;a:1:{i:0;s:6:\"蓝色\";}i:195106;a:1:{i:0;s:6:\"粉色\";}i:195107;a:1:{i:0;s:6:\"灰色\";}}","ctime":null,"utime":1608112627,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"头饰","products":[{"id":9342,"goods_id":1494,"barcode":null,"sn":"P6080213972224","price":"43.00","costprice":"39.80","mktprice":"0.00","marketable":1,"stock":163,"freeze_stock":0,"spes_desc":"颜色:圣诞发卡10对【款式随机，介意者慎拍】","is_defalut":2,"image_id":"40cf2d2607701c5167bb0e65768cb46b","isdel":null,"name":"10对 圣诞节鹿角发夹女韩国ins网红简约小麋鹿发卡","buy_limit":0,"bn":"G6080213972163","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080213495fd875657444e.jpg","total_stock":163,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞发卡2对【款式随机，介意者慎拍！】":{"name":"圣诞发卡2对【款式随机，介意者慎拍！】","product_id":9353},"圣诞发卡10对【款式随机，介意者慎拍】":{"name":"圣诞发卡10对【款式随机，介意者慎拍】","is_default":true}}},"amount":"43.00","promotion_list":[],"promotion_amount":0},{"id":9353,"goods_id":1494,"barcode":null,"sn":"P6081126272601","price":"13.80","costprice":"12.80","mktprice":"0.00","marketable":1,"stock":136,"freeze_stock":0,"spes_desc":"颜色:圣诞发卡2对【款式随机，介意者慎拍！】","is_defalut":1,"image_id":"bf2026b14ad9b3180f65c702623094a4","isdel":null,"name":"10对 圣诞节鹿角发夹女韩国ins网红简约小麋鹿发卡","buy_limit":0,"bn":"G6080213972163","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081119165fd9d72cad40f.png","total_stock":136,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞发卡2对【款式随机，介意者慎拍！】":{"name":"圣诞发卡2对【款式随机，介意者慎拍！】","is_default":true},"圣诞发卡10对【款式随机，介意者慎拍】":{"name":"圣诞发卡10对【款式随机，介意者慎拍】","product_id":9342}}},"amount":"13.80","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080212705fd8751644b47.jpg","default":{"id":9342,"goods_id":1494,"barcode":null,"sn":"P6080213972224","price":"43.00","costprice":"39.80","mktprice":"0.00","marketable":1,"stock":163,"freeze_stock":0,"spes_desc":"颜色:圣诞发卡10对【款式随机，介意者慎拍】","is_defalut":2,"image_id":"40cf2d2607701c5167bb0e65768cb46b","isdel":null,"name":"10对 圣诞节鹿角发夹女韩国ins网红简约小麋鹿发卡","buy_limit":0,"bn":"G6080213972163","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080213495fd875657444e.jpg","total_stock":163,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞发卡2对【款式随机，介意者慎拍！】":{"name":"圣诞发卡2对【款式随机，介意者慎拍！】","product_id":9353},"圣诞发卡10对【款式随机，介意者慎拍】":{"name":"圣诞发卡10对【款式随机，介意者慎拍】","is_default":true}}},"amount":"43.00","promotion_list":[],"promotion_amount":0},"product":{"id":9353,"goods_id":1494,"barcode":null,"sn":"P6081126272601","price":"13.80","costprice":"12.80","mktprice":"0.00","marketable":1,"stock":136,"spes_desc":"颜色:圣诞发卡2对【款式随机，介意者慎拍！】","is_defalut":1,"image_id":"bf2026b14ad9b3180f65c702623094a4","isdel":null,"name":"10对 圣诞节鹿角发夹女韩国ins网红简约小麋鹿发卡","buy_limit":0,"bn":"G6080213972163","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081119165fd9d72cad40f.png","total_stock":136,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞发卡2对【款式随机，介意者慎拍！】":{"name":"圣诞发卡2对【款式随机，介意者慎拍！】","is_default":true},"圣诞发卡10对【款式随机，介意者慎拍】":{"name":"圣诞发卡10对【款式随机，介意者慎拍】","product_id":9342}}},"amount":"13.80","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/15/16080212705fd8751644b47.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080212705fd8751673cd5.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080212705fd875167d2bb.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080212815fd875218d523.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080212815fd875217c90d.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080212815fd8752185456.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080212815fd87521a347d.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080212705fd875162df15.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080212705fd875163c003.jpg"],"total_stock":299,"is_buy_num":27,"isfav":"false","can_buy":"ok","vip_price":13.8,"is_notice":0},{"id":1491,"bn":"G6080142664775","name":"凉温两用石墨烯遮光旅行睡眠眼罩","brief":"","price":"11.80","costprice":"10.50","mktprice":"0.00","image_id":"ecbca1c20a2a4717cac72fc954f0edd0","goods_cat_id":135,"goods_type_id":88,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":488,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'>全国包邮，除部分地区包括内蒙古,甘肃,宁夏，海南，青海，西藏，新疆等地区需另加邮费，下单请联系客服。<\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080143155fd859eb0cdcb.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080143155fd859eb1623a.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080143155fd859eb1f76c.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080143155fd859eb2fb79.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080143155fd859eb3a24c.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080143155fd859eb44a0c.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080143155fd859eb52241.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080143155fd859eb5c905.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080143155fd859eb66960.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080143155fd859eb77dfc.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080143155fd859eb87e18.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080143155fd859eb91b66.png\"/><\/p><p style='overflow:hidden'><br/><\/p><p style='overflow:hidden'><br/><\/p>","spes_desc":{"颜色":{"193940":"凉感泰坦紫/温感胭脂粉","193941":"凉感橡牙棕/温感活力橙","193942":"凉感深空灰/温感商务灰","193943":"凉感浅灰蓝/温感藕粉色","193944":"凉感中国红/温感酒红"}},"params":"","service":"1,4,6","comments_count":0,"view_count":0,"buy_count":12,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":2,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:183:{i:193939;a:1:{i:0;s:40:\"牛仔蓝+紫色+咖啡色+姜黄+绿色\";}i:193940;a:1:{i:0;s:31:\"凉感泰坦紫/温感胭脂粉\";}i:193941;a:1:{i:0;s:31:\"凉感橡牙棕/温感活力橙\";}i:193942;a:1:{i:0;s:31:\"凉感深空灰/温感商务灰\";}i:193943;a:1:{i:0;s:31:\"凉感浅灰蓝/温感藕粉色\";}i:193944;a:1:{i:0;s:28:\"凉感中国红/温感酒红\";}i:193945;a:1:{i:0;s:18:\"圣诞麋鹿1000ml\";}i:193946;a:1:{i:0;s:21:\"橘色长脚鹿1000ml\";}i:193947;a:1:{i:0;s:12:\"驯鹿1000ml\";}i:193948;a:1:{i:0;s:15:\"鹿宝宝1000ml\";}i:193949;a:1:{i:0;s:21:\"红底围巾熊1000ml\";}i:193950;a:1:{i:0;s:18:\"蓝博士熊1000ml\";}i:193951;a:1:{i:0;s:21:\"灰蓝猫头鹰1000ml\";}i:193952;a:1:{i:0;s:15:\"独角兽1000ml\";}i:193953;a:1:{i:0;s:24:\"法兰绒粉爱心1000ml\";}i:193954;a:1:{i:0;s:24:\"法兰绒灰爱心1000ml\";}i:193955;a:1:{i:0;s:18:\"溜冰企鹅1000ml\";}i:193956;a:1:{i:0;s:18:\"粉猫头鹰1000ml\";}i:193957;a:1:{i:0;s:18:\"红色小鹿1000ml\";}i:193958;a:1:{i:0;s:15:\"蓝企鹅1000ml\";}i:193959;a:1:{i:0;s:15:\"鹿宝宝2000ml\";}i:193960;a:1:{i:0;s:12:\"驯鹿2000ml\";}i:193961;a:1:{i:0;s:18:\"紫丁香鹿2000ml\";}i:193962;a:1:{i:0;s:15:\"抱心熊2000ml\";}i:193963;a:1:{i:0;s:15:\"独角兽2000ml\";}i:193964;a:1:{i:0;s:24:\"插手款粉猫咪2000ml\";}i:193965;a:1:{i:0;s:24:\"插手款粉小猪2000ml\";}i:193966;a:1:{i:0;s:21:\"灰蓝猫头鹰2000ml\";}i:193967;a:1:{i:0;s:21:\"黄底可爱狗2000ml\";}i:193968;a:1:{i:0;s:15:\"蓝企鹅2000ml\";}i:193969;a:1:{i:0;s:18:\"咖色小熊围巾\";}i:193970;a:1:{i:0;s:18:\"米色小熊围巾\";}i:193971;a:1:{i:0;s:18:\"灰色小熊围巾\";}i:193972;a:1:{i:0;s:18:\"白色小熊围巾\";}i:193973;a:1:{i:0;s:25:\"四叉眉笔1号浅棕色\";}i:193974;a:1:{i:0;s:25:\"四叉眉笔2号深棕色\";}i:193975;a:1:{i:0;s:25:\"四叉眉笔3号红棕色\";}i:193976;a:1:{i:0;s:25:\"四叉眉笔4号灰棕色\";}i:193977;a:1:{i:0;s:22:\"四叉眉笔5号黑色\";}i:193978;a:1:{i:0;s:16:\"双头1号黑色\";}i:193979;a:1:{i:0;s:19:\"双头2号亚麻色\";}i:193980;a:1:{i:0;s:19:\"双头3号浅咖色\";}i:193981;a:1:{i:0;s:16:\"双头4号灰色\";}i:193982;a:1:{i:0;s:16:\"双头5号深咖\";}i:193983;a:1:{i:0;s:16:\"双头6号棕色\";}i:193984;a:1:{i:0;s:11:\"B2045黑色\";}i:193985;a:1:{i:0;s:11:\"B2045灰色\";}i:193986;a:1:{i:0;s:11:\"B2045褐色\";}i:193987;a:1:{i:0;s:14:\"B2045灰棕色\";}i:193988;a:1:{i:0;s:14:\"B2045浅咖色\";}i:193989;a:1:{i:0;s:14:\"B2045深咖色\";}i:193990;a:1:{i:0;s:11:\"B2045棕色\";}i:193991;a:1:{i:0;s:15:\"小奥丁黑色\";}i:193992;a:1:{i:0;s:18:\"小奥丁浅咖色\";}i:193993;a:1:{i:0;s:18:\"小奥丁咖啡色\";}i:193994;a:1:{i:0;s:15:\"小奥丁灰色\";}i:193995;a:1:{i:0;s:18:\"小奥丁深咖色\";}i:193996;a:1:{i:0;s:13:\"纯真黑+白\";}i:193997;a:1:{i:0;s:10:\"海洋蓝A\";}i:193998;a:1:{i:0;s:10:\"海洋蓝B\";}i:193999;a:1:{i:0;s:13:\"深空灰+蓝\";}i:194000;a:1:{i:0;s:13:\"象牙白+蓝\";}i:194001;a:1:{i:0;s:13:\"樱花粉+白\";}i:194002;a:1:{i:0;s:9:\"冰川白\";}i:194003;a:1:{i:0;s:9:\"幻影黑\";}i:194004;a:1:{i:0;s:9:\"深空灰\";}i:194005;a:1:{i:0;s:15:\"粉色充电款\";}i:194006;a:1:{i:0;s:25:\"2双纯色款（0-5岁）\";}i:194007;a:1:{i:0;s:28:\"2双绣花鸭梨（5-8岁）\";}i:194008;a:1:{i:0;s:28:\"2双我爱妈咪（0-5岁）\";}i:194009;a:1:{i:0;s:28:\"2双绣花狗狗（0-5岁）\";}i:194010;a:1:{i:0;s:28:\"2双猫咪系列（0-5岁）\";}i:194011;a:1:{i:0;s:25:\"2双小恐龙（0-5岁）\";}i:194012;a:1:{i:0;s:22:\"2双小熊（0-5岁）\";}i:194013;a:1:{i:0;s:25:\"2双热气球（0-5岁）\";}i:194014;a:1:{i:0;s:28:\"2双长腰猫咪（0-5岁）\";}i:194015;a:1:{i:0;s:20:\"2双M标（5-8岁）\";}i:194016;a:1:{i:0;s:25:\"2双奶牛款（0-5岁）\";}i:194017;a:1:{i:0;s:25:\"2双帽子猪（5-8岁）\";}i:194018;a:1:{i:0;s:25:\"2双雏菊款（0-5岁）\";}i:194019;a:1:{i:0;s:21:\"2双YOUME（0-5岁）\";}i:194020;a:1:{i:0;s:25:\"2双松鼠款（0-5岁）\";}i:194021;a:1:{i:0;s:25:\"2双爱心款（0-5岁）\";}i:194022;a:1:{i:0;s:25:\"2双王冠猪（5-8岁）\";}i:194023;a:1:{i:0;s:14:\"01反叛天真\";}i:194024;a:1:{i:0;s:14:\"02离谱可爱\";}i:194025;a:1:{i:0;s:14:\"03确实很酷\";}i:194026;a:1:{i:0;s:14:\"04天生有趣\";}i:194027;a:1:{i:0;s:12:\"05女团c位\";}i:194028;a:1:{i:0;s:14:\"06碳酸少女\";}i:194029;a:1:{i:0;s:13:\"2个北欧粉\";}i:194030;a:1:{i:0;s:13:\"2个北欧蓝\";}i:194031;a:1:{i:0;s:13:\"2个北欧绿\";}i:194032;a:1:{i:0;s:13:\"2个北欧米\";}i:194033;a:1:{i:0;s:13:\"2个北欧灰\";}i:194034;a:1:{i:0;s:19:\"2个双色雅灰粉\";}i:194035;a:1:{i:0;s:19:\"2个双色雅灰蓝\";}i:194036;a:1:{i:0;s:19:\"2个双色雅灰绿\";}i:194037;a:1:{i:0;s:19:\"2个双色雅灰米\";}i:194038;a:1:{i:0;s:34:\"2个【手提款】双色雅灰粉\";}i:194039;a:1:{i:0;s:34:\"2个【手提款】双色雅灰蓝\";}i:194040;a:1:{i:0;s:34:\"2个【手提款】双色雅灰绿\";}i:194041;a:1:{i:0;s:34:\"2个【手提款】双色雅灰米\";}i:194042;a:1:{i:0;s:52:\"2个无手提款（颜色可备注，默认随机）\";}i:194043;a:1:{i:0;s:49:\"2个手提款（颜色可备注，默认随机）\";}i:194044;a:1:{i:0;s:24:\"黑色（一年保修）\";}i:194045;a:1:{i:0;s:12:\"短筒黑色\";}i:194046;a:1:{i:0;s:18:\"短筒巧克力色\";}i:194047;a:1:{i:0;s:12:\"短筒灰色\";}i:194048;a:1:{i:0;s:12:\"短筒栗色\";}i:194049;a:1:{i:0;s:15:\"短筒暮粉色\";}i:194050;a:1:{i:0;s:15:\"短筒奶茶色\";}i:194051;a:1:{i:0;s:15:\"皮带扣黑色\";}i:194052;a:1:{i:0;s:21:\"皮带扣巧克力色\";}i:194053;a:1:{i:0;s:15:\"皮带扣灰色\";}i:194054;a:1:{i:0;s:15:\"皮带扣栗色\";}i:194055;a:1:{i:0;s:18:\"硅胶版索菲蓝\";}i:194056;a:1:{i:0;s:18:\"硅胶版樱柠粉\";}i:194057;a:1:{i:0;s:18:\"硅胶版校园蓝\";}i:194058;a:1:{i:0;s:18:\"硅胶版校园粉\";}i:194059;a:1:{i:0;s:18:\"无硅胶校园蓝\";}i:194060;a:1:{i:0;s:18:\"无硅胶校园粉\";}i:194061;a:1:{i:0;s:14:\"01怦然心动\";}i:194062;a:1:{i:0;s:14:\"02冰河时代\";}i:194063;a:1:{i:0;s:14:\"03金色琉璃\";}i:194064;a:1:{i:0;s:14:\"04海王星辰\";}i:194065;a:1:{i:0;s:15:\"黄色加内里\";}i:194066;a:1:{i:0;s:15:\"粉色加内里\";}i:194067;a:1:{i:0;s:18:\"咖啡色加内里\";}i:194068;a:1:{i:0;s:15:\"红色加内里\";}i:194069;a:1:{i:0;s:15:\"米色加内里\";}i:194070;a:1:{i:0;s:12:\"黄色鹿角\";}i:194071;a:1:{i:0;s:12:\"绿色鹿角\";}i:194072;a:1:{i:0;s:15:\"咖啡色鹿角\";}i:194073;a:1:{i:0;s:12:\"粉色鹿角\";}i:194074;a:1:{i:0;s:12:\"红色鹿角\";}i:194075;a:1:{i:0;s:18:\"绿色青蛙单层\";}i:194076;a:1:{i:0;s:18:\"红色青蛙单层\";}i:194077;a:1:{i:0;s:18:\"黄色青蛙单层\";}i:194078;a:1:{i:0;s:18:\"米色青蛙单层\";}i:194079;a:1:{i:0;s:21:\"咖啡色青蛙单层\";}i:194080;a:1:{i:0;s:18:\"绿色青蛙加绒\";}i:194081;a:1:{i:0;s:21:\"咖啡色青蛙加绒\";}i:194082;a:1:{i:0;s:18:\"红色青蛙加绒\";}i:194083;a:1:{i:0;s:18:\"黄色青蛙加绒\";}i:194084;a:1:{i:0;s:18:\"米色青蛙加绒\";}i:194085;a:1:{i:0;s:12:\"玻璃糖纸\";}i:194086;a:1:{i:0;s:9:\"小星钻\";}i:194087;a:1:{i:0;s:9:\"金水晶\";}i:194088;a:1:{i:0;s:9:\"香芋紫\";}i:194089;a:1:{i:0;s:9:\"青草绿\";}i:194090;a:1:{i:0;s:9:\"赤陶红\";}i:194091;a:1:{i:0;s:9:\"树莓色\";}i:194092;a:1:{i:0;s:9:\"蓝灰色\";}i:194093;a:1:{i:0;s:9:\"蜜糖棕\";}i:194094;a:1:{i:0;s:9:\"黑色男\";}i:194095;a:1:{i:0;s:9:\"深灰男\";}i:194096;a:1:{i:0;s:9:\"浅灰男\";}i:194097;a:1:{i:0;s:9:\"酒红男\";}i:194098;a:1:{i:0;s:9:\"藏青男\";}i:194099;a:1:{i:0;s:9:\"黑色女\";}i:194100;a:1:{i:0;s:9:\"卡其女\";}i:194101;a:1:{i:0;s:9:\"藕紫女\";}i:194102;a:1:{i:0;s:9:\"粉色女\";}i:194103;a:1:{i:0;s:9:\"紫红女\";}i:194104;a:1:{i:0;s:39:\"黑红色+金属篮+加强杆+塑料盘\";}i:194105;a:1:{i:0;s:42:\"黑红色+金属篮+加强杆+不锈钢盘\";}i:194106;a:1:{i:0;s:10:\"3双黑色\";}i:194107;a:1:{i:0;s:13:\"3双咖啡色\";}i:194108;a:1:{i:0;s:10:\"3双灰色\";}i:194109;a:1:{i:0;s:13:\"3双卡其色\";}i:194110;a:1:{i:0;s:13:\"3双深灰色\";}i:194111;a:1:{i:0;s:31:\"3双混色（颜色可备注）\";}i:194112;a:1:{i:0;s:28:\"蓝球发白光（4英寸）\";}i:194113;a:1:{i:0;s:28:\"金球发白光（4英寸）\";}i:194114;a:1:{i:0;s:31:\"蓝球发变色光（4英寸）\";}i:194115;a:1:{i:0;s:31:\"米白球发白光（4英寸）\";}i:194116;a:1:{i:0;s:15:\"灰色标准杆\";}i:194117;a:1:{i:0;s:24:\"灰色可伸缩加强杆\";}i:194118;a:1:{i:0;s:28:\"灰色伸缩杆+清洁小桶\";}i:194119;a:1:{i:0;s:37:\"黑色+白色+灰色+橘色+枚红色\";}i:194120;a:1:{i:0;s:37:\"灰色+蓝色+紫色+玫红+姜黄色\";}i:194121;a:1:{i:0;s:45:\"5双自选颜色（10色可选，请备注）\";}}","ctime":null,"utime":1608112496,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"居家用品","products":[{"id":9335,"goods_id":1491,"barcode":null,"sn":"P6080142664845","price":"11.80","costprice":"10.50","mktprice":"0.00","marketable":1,"stock":97,"freeze_stock":0,"spes_desc":"颜色:凉感泰坦紫/温感胭脂粉","is_defalut":1,"image_id":"717537488d9b36c83fe1e3446ae7bc61","isdel":null,"name":"凉温两用石墨烯遮光旅行睡眠眼罩","buy_limit":0,"bn":"G6080142664775","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080142015fd859796da5c.jpg","total_stock":97,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"凉感泰坦紫/温感胭脂粉":{"name":"凉感泰坦紫/温感胭脂粉","is_default":true},"凉感橡牙棕/温感活力橙":{"name":"凉感橡牙棕/温感活力橙","product_id":9336},"凉感深空灰/温感商务灰":{"name":"凉感深空灰/温感商务灰","product_id":9337},"凉感浅灰蓝/温感藕粉色":{"name":"凉感浅灰蓝/温感藕粉色","product_id":9338},"凉感中国红/温感酒红":{"name":"凉感中国红/温感酒红","product_id":9339}}},"amount":"11.80","promotion_list":[],"promotion_amount":0},{"id":9336,"goods_id":1491,"barcode":null,"sn":"P6080142664895","price":"11.80","costprice":"10.50","mktprice":"0.00","marketable":1,"stock":99,"freeze_stock":0,"spes_desc":"颜色:凉感橡牙棕/温感活力橙","is_defalut":2,"image_id":"7ca696a272732fb005e19e881651292a","isdel":null,"name":"凉温两用石墨烯遮光旅行睡眠眼罩","buy_limit":0,"bn":"G6080142664775","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080142085fd859808ca64.jpg","total_stock":99,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"凉感泰坦紫/温感胭脂粉":{"name":"凉感泰坦紫/温感胭脂粉","product_id":9335},"凉感橡牙棕/温感活力橙":{"name":"凉感橡牙棕/温感活力橙","is_default":true},"凉感深空灰/温感商务灰":{"name":"凉感深空灰/温感商务灰","product_id":9337},"凉感浅灰蓝/温感藕粉色":{"name":"凉感浅灰蓝/温感藕粉色","product_id":9338},"凉感中国红/温感酒红":{"name":"凉感中国红/温感酒红","product_id":9339}}},"amount":"11.80","promotion_list":[],"promotion_amount":0},{"id":9337,"goods_id":1491,"barcode":null,"sn":"P6080142664923","price":"11.80","costprice":"10.50","mktprice":"0.00","marketable":1,"stock":95,"freeze_stock":0,"spes_desc":"颜色:凉感深空灰/温感商务灰","is_defalut":2,"image_id":"eaddbbdd89535fe5662936de924b4834","isdel":null,"name":"凉温两用石墨烯遮光旅行睡眠眼罩","buy_limit":0,"bn":"G6080142664775","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080142155fd85987d1d9b.jpg","total_stock":95,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"凉感泰坦紫/温感胭脂粉":{"name":"凉感泰坦紫/温感胭脂粉","product_id":9335},"凉感橡牙棕/温感活力橙":{"name":"凉感橡牙棕/温感活力橙","product_id":9336},"凉感深空灰/温感商务灰":{"name":"凉感深空灰/温感商务灰","is_default":true},"凉感浅灰蓝/温感藕粉色":{"name":"凉感浅灰蓝/温感藕粉色","product_id":9338},"凉感中国红/温感酒红":{"name":"凉感中国红/温感酒红","product_id":9339}}},"amount":"11.80","promotion_list":[],"promotion_amount":0},{"id":9338,"goods_id":1491,"barcode":null,"sn":"P6080142664951","price":"11.80","costprice":"10.50","mktprice":"0.00","marketable":1,"stock":98,"freeze_stock":0,"spes_desc":"颜色:凉感浅灰蓝/温感藕粉色","is_defalut":2,"image_id":"4384b9a64ba8d7340821de6754e70db6","isdel":null,"name":"凉温两用石墨烯遮光旅行睡眠眼罩","buy_limit":0,"bn":"G6080142664775","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080142225fd8598e5549e.jpg","total_stock":98,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"凉感泰坦紫/温感胭脂粉":{"name":"凉感泰坦紫/温感胭脂粉","product_id":9335},"凉感橡牙棕/温感活力橙":{"name":"凉感橡牙棕/温感活力橙","product_id":9336},"凉感深空灰/温感商务灰":{"name":"凉感深空灰/温感商务灰","product_id":9337},"凉感浅灰蓝/温感藕粉色":{"name":"凉感浅灰蓝/温感藕粉色","is_default":true},"凉感中国红/温感酒红":{"name":"凉感中国红/温感酒红","product_id":9339}}},"amount":"11.80","promotion_list":[],"promotion_amount":0},{"id":9339,"goods_id":1491,"barcode":null,"sn":"P6080142664982","price":"11.80","costprice":"10.50","mktprice":"0.00","marketable":1,"stock":99,"freeze_stock":0,"spes_desc":"颜色:凉感中国红/温感酒红","is_defalut":2,"image_id":"a1e1e1407d206f75e2204b129360c46c","isdel":null,"name":"凉温两用石墨烯遮光旅行睡眠眼罩","buy_limit":0,"bn":"G6080142664775","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080142415fd859a1aac83.jpg","total_stock":99,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"凉感泰坦紫/温感胭脂粉":{"name":"凉感泰坦紫/温感胭脂粉","product_id":9335},"凉感橡牙棕/温感活力橙":{"name":"凉感橡牙棕/温感活力橙","product_id":9336},"凉感深空灰/温感商务灰":{"name":"凉感深空灰/温感商务灰","product_id":9337},"凉感浅灰蓝/温感藕粉色":{"name":"凉感浅灰蓝/温感藕粉色","product_id":9338},"凉感中国红/温感酒红":{"name":"凉感中国红/温感酒红","is_default":true}}},"amount":"11.80","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080141715fd8595b023ef.jpg","default":{"id":9335,"goods_id":1491,"barcode":null,"sn":"P6080142664845","price":"11.80","costprice":"10.50","mktprice":"0.00","marketable":1,"stock":97,"freeze_stock":0,"spes_desc":"颜色:凉感泰坦紫/温感胭脂粉","is_defalut":1,"image_id":"717537488d9b36c83fe1e3446ae7bc61","isdel":null,"name":"凉温两用石墨烯遮光旅行睡眠眼罩","buy_limit":0,"bn":"G6080142664775","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080142015fd859796da5c.jpg","total_stock":97,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"凉感泰坦紫/温感胭脂粉":{"name":"凉感泰坦紫/温感胭脂粉","is_default":true},"凉感橡牙棕/温感活力橙":{"name":"凉感橡牙棕/温感活力橙","product_id":9336},"凉感深空灰/温感商务灰":{"name":"凉感深空灰/温感商务灰","product_id":9337},"凉感浅灰蓝/温感藕粉色":{"name":"凉感浅灰蓝/温感藕粉色","product_id":9338},"凉感中国红/温感酒红":{"name":"凉感中国红/温感酒红","product_id":9339}}},"amount":"11.80","promotion_list":[],"promotion_amount":0},"product":{"id":9335,"goods_id":1491,"barcode":null,"sn":"P6080142664845","price":"11.80","costprice":"10.50","mktprice":"0.00","marketable":1,"stock":97,"spes_desc":"颜色:凉感泰坦紫/温感胭脂粉","is_defalut":1,"image_id":"717537488d9b36c83fe1e3446ae7bc61","isdel":null,"name":"凉温两用石墨烯遮光旅行睡眠眼罩","buy_limit":0,"bn":"G6080142664775","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080142015fd859796da5c.jpg","total_stock":97,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"凉感泰坦紫/温感胭脂粉":{"name":"凉感泰坦紫/温感胭脂粉","is_default":true},"凉感橡牙棕/温感活力橙":{"name":"凉感橡牙棕/温感活力橙","product_id":9336},"凉感深空灰/温感商务灰":{"name":"凉感深空灰/温感商务灰","product_id":9337},"凉感浅灰蓝/温感藕粉色":{"name":"凉感浅灰蓝/温感藕粉色","product_id":9338},"凉感中国红/温感酒红":{"name":"凉感中国红/温感酒红","product_id":9339}}},"amount":"11.80","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/15/16080141715fd8595b023ef.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080141705fd8595ac8628.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080141705fd8595aea82d.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080141715fd8595b0c3d4.jpg"],"total_stock":488,"is_buy_num":12,"isfav":"false","can_buy":"ok","vip_price":11.8,"is_notice":0},{"id":1489,"bn":"G6080118335930","name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","brief":"","price":"15.80","costprice":"13.80","mktprice":"0.00","image_id":"cd5aacb90fc26b27fc7ecde7ccc36403","goods_cat_id":135,"goods_type_id":88,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":1187,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'>全国包邮，除部分地区包括内蒙古,甘肃,宁夏，海南，青海，西藏，新疆等地区需另加邮费，下单请联系客服哦<\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118275fd85033da14f.PNG\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118275fd85033ed508.PNG\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd8503404ab1.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd850340e069.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd850341c5ad.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd850342681f.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd850345d69f.PNG\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd8503472f39.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd850346a602.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd850347d53c.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd850348d264.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd85034964c7.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd85034a16f2.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd85034b4d5f.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd85034bdab1.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd85034cdcba.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118295fd8503516a33.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118295fd850351fc25.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118295fd850353b67d.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118295fd850355ce86.png\"/><\/p><p style='overflow:hidden'><br/><\/p>","spes_desc":{"颜色":{"193421":"圣诞麋鹿1000ml","193422":"橘色长脚鹿1000ml","193423":"驯鹿1000ml","193424":"鹿宝宝1000ml","193425":"红底围巾熊1000ml","193426":"蓝博士熊1000ml","193427":"灰蓝猫头鹰1000ml","193428":"独角兽1000ml","193429":"法兰绒粉爱心1000ml","193430":"法兰绒灰爱心1000ml","193431":"溜冰企鹅1000ml","193432":"粉猫头鹰1000ml","193433":"红色小鹿1000ml","193434":"蓝企鹅1000ml","193435":"鹿宝宝2000ml","193436":"驯鹿2000ml","193437":"紫丁香鹿2000ml","193438":"抱心熊2000ml","193439":"独角兽2000ml","193440":"插手款粉猫咪2000ml","193441":"插手款粉小猪2000ml","193442":"灰蓝猫头鹰2000ml","193443":"黄底可爱狗2000ml","193444":"蓝企鹅2000ml"}},"params":"","service":"1,4,6","comments_count":0,"view_count":0,"buy_count":13,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":2,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:178:{i:193420;a:1:{i:0;s:40:\"牛仔蓝+紫色+咖啡色+姜黄+绿色\";}i:193421;a:1:{i:0;s:18:\"圣诞麋鹿1000ml\";}i:193422;a:1:{i:0;s:21:\"橘色长脚鹿1000ml\";}i:193423;a:1:{i:0;s:12:\"驯鹿1000ml\";}i:193424;a:1:{i:0;s:15:\"鹿宝宝1000ml\";}i:193425;a:1:{i:0;s:21:\"红底围巾熊1000ml\";}i:193426;a:1:{i:0;s:18:\"蓝博士熊1000ml\";}i:193427;a:1:{i:0;s:21:\"灰蓝猫头鹰1000ml\";}i:193428;a:1:{i:0;s:15:\"独角兽1000ml\";}i:193429;a:1:{i:0;s:24:\"法兰绒粉爱心1000ml\";}i:193430;a:1:{i:0;s:24:\"法兰绒灰爱心1000ml\";}i:193431;a:1:{i:0;s:18:\"溜冰企鹅1000ml\";}i:193432;a:1:{i:0;s:18:\"粉猫头鹰1000ml\";}i:193433;a:1:{i:0;s:18:\"红色小鹿1000ml\";}i:193434;a:1:{i:0;s:15:\"蓝企鹅1000ml\";}i:193435;a:1:{i:0;s:15:\"鹿宝宝2000ml\";}i:193436;a:1:{i:0;s:12:\"驯鹿2000ml\";}i:193437;a:1:{i:0;s:18:\"紫丁香鹿2000ml\";}i:193438;a:1:{i:0;s:15:\"抱心熊2000ml\";}i:193439;a:1:{i:0;s:15:\"独角兽2000ml\";}i:193440;a:1:{i:0;s:24:\"插手款粉猫咪2000ml\";}i:193441;a:1:{i:0;s:24:\"插手款粉小猪2000ml\";}i:193442;a:1:{i:0;s:21:\"灰蓝猫头鹰2000ml\";}i:193443;a:1:{i:0;s:21:\"黄底可爱狗2000ml\";}i:193444;a:1:{i:0;s:15:\"蓝企鹅2000ml\";}i:193445;a:1:{i:0;s:18:\"咖色小熊围巾\";}i:193446;a:1:{i:0;s:18:\"米色小熊围巾\";}i:193447;a:1:{i:0;s:18:\"灰色小熊围巾\";}i:193448;a:1:{i:0;s:18:\"白色小熊围巾\";}i:193449;a:1:{i:0;s:25:\"四叉眉笔1号浅棕色\";}i:193450;a:1:{i:0;s:25:\"四叉眉笔2号深棕色\";}i:193451;a:1:{i:0;s:25:\"四叉眉笔3号红棕色\";}i:193452;a:1:{i:0;s:25:\"四叉眉笔4号灰棕色\";}i:193453;a:1:{i:0;s:22:\"四叉眉笔5号黑色\";}i:193454;a:1:{i:0;s:16:\"双头1号黑色\";}i:193455;a:1:{i:0;s:19:\"双头2号亚麻色\";}i:193456;a:1:{i:0;s:19:\"双头3号浅咖色\";}i:193457;a:1:{i:0;s:16:\"双头4号灰色\";}i:193458;a:1:{i:0;s:16:\"双头5号深咖\";}i:193459;a:1:{i:0;s:16:\"双头6号棕色\";}i:193460;a:1:{i:0;s:11:\"B2045黑色\";}i:193461;a:1:{i:0;s:11:\"B2045灰色\";}i:193462;a:1:{i:0;s:11:\"B2045褐色\";}i:193463;a:1:{i:0;s:14:\"B2045灰棕色\";}i:193464;a:1:{i:0;s:14:\"B2045浅咖色\";}i:193465;a:1:{i:0;s:14:\"B2045深咖色\";}i:193466;a:1:{i:0;s:11:\"B2045棕色\";}i:193467;a:1:{i:0;s:15:\"小奥丁黑色\";}i:193468;a:1:{i:0;s:18:\"小奥丁浅咖色\";}i:193469;a:1:{i:0;s:18:\"小奥丁咖啡色\";}i:193470;a:1:{i:0;s:15:\"小奥丁灰色\";}i:193471;a:1:{i:0;s:18:\"小奥丁深咖色\";}i:193472;a:1:{i:0;s:13:\"纯真黑+白\";}i:193473;a:1:{i:0;s:10:\"海洋蓝A\";}i:193474;a:1:{i:0;s:10:\"海洋蓝B\";}i:193475;a:1:{i:0;s:13:\"深空灰+蓝\";}i:193476;a:1:{i:0;s:13:\"象牙白+蓝\";}i:193477;a:1:{i:0;s:13:\"樱花粉+白\";}i:193478;a:1:{i:0;s:9:\"冰川白\";}i:193479;a:1:{i:0;s:9:\"幻影黑\";}i:193480;a:1:{i:0;s:9:\"深空灰\";}i:193481;a:1:{i:0;s:15:\"粉色充电款\";}i:193482;a:1:{i:0;s:25:\"2双纯色款（0-5岁）\";}i:193483;a:1:{i:0;s:28:\"2双绣花鸭梨（5-8岁）\";}i:193484;a:1:{i:0;s:28:\"2双我爱妈咪（0-5岁）\";}i:193485;a:1:{i:0;s:28:\"2双绣花狗狗（0-5岁）\";}i:193486;a:1:{i:0;s:28:\"2双猫咪系列（0-5岁）\";}i:193487;a:1:{i:0;s:25:\"2双小恐龙（0-5岁）\";}i:193488;a:1:{i:0;s:22:\"2双小熊（0-5岁）\";}i:193489;a:1:{i:0;s:25:\"2双热气球（0-5岁）\";}i:193490;a:1:{i:0;s:28:\"2双长腰猫咪（0-5岁）\";}i:193491;a:1:{i:0;s:20:\"2双M标（5-8岁）\";}i:193492;a:1:{i:0;s:25:\"2双奶牛款（0-5岁）\";}i:193493;a:1:{i:0;s:25:\"2双帽子猪（5-8岁）\";}i:193494;a:1:{i:0;s:25:\"2双雏菊款（0-5岁）\";}i:193495;a:1:{i:0;s:21:\"2双YOUME（0-5岁）\";}i:193496;a:1:{i:0;s:25:\"2双松鼠款（0-5岁）\";}i:193497;a:1:{i:0;s:25:\"2双爱心款（0-5岁）\";}i:193498;a:1:{i:0;s:25:\"2双王冠猪（5-8岁）\";}i:193499;a:1:{i:0;s:14:\"01反叛天真\";}i:193500;a:1:{i:0;s:14:\"02离谱可爱\";}i:193501;a:1:{i:0;s:14:\"03确实很酷\";}i:193502;a:1:{i:0;s:14:\"04天生有趣\";}i:193503;a:1:{i:0;s:12:\"05女团c位\";}i:193504;a:1:{i:0;s:14:\"06碳酸少女\";}i:193505;a:1:{i:0;s:13:\"2个北欧粉\";}i:193506;a:1:{i:0;s:13:\"2个北欧蓝\";}i:193507;a:1:{i:0;s:13:\"2个北欧绿\";}i:193508;a:1:{i:0;s:13:\"2个北欧米\";}i:193509;a:1:{i:0;s:13:\"2个北欧灰\";}i:193510;a:1:{i:0;s:19:\"2个双色雅灰粉\";}i:193511;a:1:{i:0;s:19:\"2个双色雅灰蓝\";}i:193512;a:1:{i:0;s:19:\"2个双色雅灰绿\";}i:193513;a:1:{i:0;s:19:\"2个双色雅灰米\";}i:193514;a:1:{i:0;s:34:\"2个【手提款】双色雅灰粉\";}i:193515;a:1:{i:0;s:34:\"2个【手提款】双色雅灰蓝\";}i:193516;a:1:{i:0;s:34:\"2个【手提款】双色雅灰绿\";}i:193517;a:1:{i:0;s:34:\"2个【手提款】双色雅灰米\";}i:193518;a:1:{i:0;s:52:\"2个无手提款（颜色可备注，默认随机）\";}i:193519;a:1:{i:0;s:49:\"2个手提款（颜色可备注，默认随机）\";}i:193520;a:1:{i:0;s:24:\"黑色（一年保修）\";}i:193521;a:1:{i:0;s:12:\"短筒黑色\";}i:193522;a:1:{i:0;s:18:\"短筒巧克力色\";}i:193523;a:1:{i:0;s:12:\"短筒灰色\";}i:193524;a:1:{i:0;s:12:\"短筒栗色\";}i:193525;a:1:{i:0;s:15:\"短筒暮粉色\";}i:193526;a:1:{i:0;s:15:\"短筒奶茶色\";}i:193527;a:1:{i:0;s:15:\"皮带扣黑色\";}i:193528;a:1:{i:0;s:21:\"皮带扣巧克力色\";}i:193529;a:1:{i:0;s:15:\"皮带扣灰色\";}i:193530;a:1:{i:0;s:15:\"皮带扣栗色\";}i:193531;a:1:{i:0;s:18:\"硅胶版索菲蓝\";}i:193532;a:1:{i:0;s:18:\"硅胶版樱柠粉\";}i:193533;a:1:{i:0;s:18:\"硅胶版校园蓝\";}i:193534;a:1:{i:0;s:18:\"硅胶版校园粉\";}i:193535;a:1:{i:0;s:18:\"无硅胶校园蓝\";}i:193536;a:1:{i:0;s:18:\"无硅胶校园粉\";}i:193537;a:1:{i:0;s:14:\"01怦然心动\";}i:193538;a:1:{i:0;s:14:\"02冰河时代\";}i:193539;a:1:{i:0;s:14:\"03金色琉璃\";}i:193540;a:1:{i:0;s:14:\"04海王星辰\";}i:193541;a:1:{i:0;s:15:\"黄色加内里\";}i:193542;a:1:{i:0;s:15:\"粉色加内里\";}i:193543;a:1:{i:0;s:18:\"咖啡色加内里\";}i:193544;a:1:{i:0;s:15:\"红色加内里\";}i:193545;a:1:{i:0;s:15:\"米色加内里\";}i:193546;a:1:{i:0;s:12:\"黄色鹿角\";}i:193547;a:1:{i:0;s:12:\"绿色鹿角\";}i:193548;a:1:{i:0;s:15:\"咖啡色鹿角\";}i:193549;a:1:{i:0;s:12:\"粉色鹿角\";}i:193550;a:1:{i:0;s:12:\"红色鹿角\";}i:193551;a:1:{i:0;s:18:\"绿色青蛙单层\";}i:193552;a:1:{i:0;s:18:\"红色青蛙单层\";}i:193553;a:1:{i:0;s:18:\"黄色青蛙单层\";}i:193554;a:1:{i:0;s:18:\"米色青蛙单层\";}i:193555;a:1:{i:0;s:21:\"咖啡色青蛙单层\";}i:193556;a:1:{i:0;s:18:\"绿色青蛙加绒\";}i:193557;a:1:{i:0;s:21:\"咖啡色青蛙加绒\";}i:193558;a:1:{i:0;s:18:\"红色青蛙加绒\";}i:193559;a:1:{i:0;s:18:\"黄色青蛙加绒\";}i:193560;a:1:{i:0;s:18:\"米色青蛙加绒\";}i:193561;a:1:{i:0;s:12:\"玻璃糖纸\";}i:193562;a:1:{i:0;s:9:\"小星钻\";}i:193563;a:1:{i:0;s:9:\"金水晶\";}i:193564;a:1:{i:0;s:9:\"香芋紫\";}i:193565;a:1:{i:0;s:9:\"青草绿\";}i:193566;a:1:{i:0;s:9:\"赤陶红\";}i:193567;a:1:{i:0;s:9:\"树莓色\";}i:193568;a:1:{i:0;s:9:\"蓝灰色\";}i:193569;a:1:{i:0;s:9:\"蜜糖棕\";}i:193570;a:1:{i:0;s:9:\"黑色男\";}i:193571;a:1:{i:0;s:9:\"深灰男\";}i:193572;a:1:{i:0;s:9:\"浅灰男\";}i:193573;a:1:{i:0;s:9:\"酒红男\";}i:193574;a:1:{i:0;s:9:\"藏青男\";}i:193575;a:1:{i:0;s:9:\"黑色女\";}i:193576;a:1:{i:0;s:9:\"卡其女\";}i:193577;a:1:{i:0;s:9:\"藕紫女\";}i:193578;a:1:{i:0;s:9:\"粉色女\";}i:193579;a:1:{i:0;s:9:\"紫红女\";}i:193580;a:1:{i:0;s:39:\"黑红色+金属篮+加强杆+塑料盘\";}i:193581;a:1:{i:0;s:42:\"黑红色+金属篮+加强杆+不锈钢盘\";}i:193582;a:1:{i:0;s:10:\"3双黑色\";}i:193583;a:1:{i:0;s:13:\"3双咖啡色\";}i:193584;a:1:{i:0;s:10:\"3双灰色\";}i:193585;a:1:{i:0;s:13:\"3双卡其色\";}i:193586;a:1:{i:0;s:13:\"3双深灰色\";}i:193587;a:1:{i:0;s:31:\"3双混色（颜色可备注）\";}i:193588;a:1:{i:0;s:28:\"蓝球发白光（4英寸）\";}i:193589;a:1:{i:0;s:28:\"金球发白光（4英寸）\";}i:193590;a:1:{i:0;s:31:\"蓝球发变色光（4英寸）\";}i:193591;a:1:{i:0;s:31:\"米白球发白光（4英寸）\";}i:193592;a:1:{i:0;s:15:\"灰色标准杆\";}i:193593;a:1:{i:0;s:24:\"灰色可伸缩加强杆\";}i:193594;a:1:{i:0;s:28:\"灰色伸缩杆+清洁小桶\";}i:193595;a:1:{i:0;s:37:\"黑色+白色+灰色+橘色+枚红色\";}i:193596;a:1:{i:0;s:37:\"灰色+蓝色+紫色+玫红+姜黄色\";}i:193597;a:1:{i:0;s:45:\"5双自选颜色（10色可选，请备注）\";}}","ctime":null,"utime":1608097370,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"居家用品","products":[{"id":9310,"goods_id":1489,"barcode":null,"sn":"P6080118336003","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:圣诞麋鹿1000ml","is_defalut":1,"image_id":"d6393bac2f713f4993bda9c0e3e36c04","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080111595fd84d9737525.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","is_default":true},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9311,"goods_id":1489,"barcode":null,"sn":"P6080118336042","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:橘色长脚鹿1000ml","is_defalut":2,"image_id":"7f2c3223a992317dcb30121be2eff2b1","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080111695fd84da182edb.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","is_default":true},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9312,"goods_id":1489,"barcode":null,"sn":"P6080118336074","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:驯鹿1000ml","is_defalut":2,"image_id":"d63cbd5b5c5bfdb5024453805cb376e9","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080111755fd84da7dafb7.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","is_default":true},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9313,"goods_id":1489,"barcode":null,"sn":"P6080118336101","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":49,"freeze_stock":0,"spes_desc":"颜色:鹿宝宝1000ml","is_defalut":2,"image_id":"90d432c2d4006cb87b12c711a65d86db","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080111835fd84daf67d35.jpg","total_stock":49,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","is_default":true},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9314,"goods_id":1489,"barcode":null,"sn":"P6080118336135","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:红底围巾熊1000ml","is_defalut":2,"image_id":"283c11b083704fddb0b223432720922d","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080111905fd84db671cf3.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","is_default":true},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9315,"goods_id":1489,"barcode":null,"sn":"P6080118336165","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":49,"freeze_stock":0,"spes_desc":"颜色:蓝博士熊1000ml","is_defalut":2,"image_id":"4f0d2b32db912d8dc1df679984cf9293","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080111965fd84dbc7f6ec.jpg","total_stock":49,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","is_default":true},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9316,"goods_id":1489,"barcode":null,"sn":"P6080118336193","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:灰蓝猫头鹰1000ml","is_defalut":2,"image_id":"fde6dd4788a34cc5a989333a8c3aaa7c","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080112035fd84dc33fec4.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","is_default":true},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9317,"goods_id":1489,"barcode":null,"sn":"P6080118336221","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":48,"freeze_stock":0,"spes_desc":"颜色:独角兽1000ml","is_defalut":2,"image_id":"674a5ece7bed2cdc3645a7d0829b4569","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080112105fd84dca0a381.jpg","total_stock":48,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","is_default":true},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9318,"goods_id":1489,"barcode":null,"sn":"P6080118336250","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":48,"freeze_stock":0,"spes_desc":"颜色:法兰绒粉爱心1000ml","is_defalut":2,"image_id":"db66d7adc3e1df7809aad44eb0dcff05","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080112305fd84dde618ea.jpg","total_stock":48,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","is_default":true},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9319,"goods_id":1489,"barcode":null,"sn":"P6080118336281","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:法兰绒灰爱心1000ml","is_defalut":2,"image_id":"f7c6aeffccb8793ee9a0eb484b84d3b6","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080112485fd84df0d0559.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","is_default":true},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9320,"goods_id":1489,"barcode":null,"sn":"P6080118336315","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:溜冰企鹅1000ml","is_defalut":2,"image_id":"fc7a4d8da912213012b94e2a54333e81","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080112565fd84df88bb50.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","is_default":true},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9321,"goods_id":1489,"barcode":null,"sn":"P6080118336344","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:粉猫头鹰1000ml","is_defalut":2,"image_id":"3adab0f662ef5962802dd78517a482ed","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080116235fd84f67c007b.PNG","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","is_default":true},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9322,"goods_id":1489,"barcode":null,"sn":"P6080118336373","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:红色小鹿1000ml","is_defalut":2,"image_id":"13eb9c25d46e033f584fe57ff359bfd0","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080116535fd84f858a7ea.PNG","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","is_default":true},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9323,"goods_id":1489,"barcode":null,"sn":"P6080118336405","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":49,"freeze_stock":0,"spes_desc":"颜色:蓝企鹅1000ml","is_defalut":2,"image_id":"c44a8b03bd9c2d8785abcbe7959a792c","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080116885fd84fa8f2c5a.PNG","total_stock":49,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","is_default":true},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9324,"goods_id":1489,"barcode":null,"sn":"P6080118336433","price":"19.60","costprice":"17.60","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:鹿宝宝2000ml","is_defalut":2,"image_id":"eb03f89fecf8aadca1ba704f2f5b21a4","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080113945fd84e82503a0.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","is_default":true},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"19.60","promotion_list":[],"promotion_amount":0},{"id":9325,"goods_id":1489,"barcode":null,"sn":"P6080118336465","price":"19.60","costprice":"17.60","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:驯鹿2000ml","is_defalut":2,"image_id":"cb8c60e537b5d737c7e89361816723ce","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080114005fd84e882a23b.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","is_default":true},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"19.60","promotion_list":[],"promotion_amount":0},{"id":9326,"goods_id":1489,"barcode":null,"sn":"P6080118336480","price":"19.60","costprice":"17.60","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:紫丁香鹿2000ml","is_defalut":2,"image_id":"2aac2e19ed18c78887df5c8a4e8f18ed","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080114065fd84e8e61956.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","is_default":true},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"19.60","promotion_list":[],"promotion_amount":0},{"id":9327,"goods_id":1489,"barcode":null,"sn":"P6080118336513","price":"19.60","costprice":"17.60","mktprice":"0.00","marketable":1,"stock":49,"freeze_stock":0,"spes_desc":"颜色:抱心熊2000ml","is_defalut":2,"image_id":"9a84f199405dee46b5aee658a5a1bca7","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080114165fd84e984829e.jpg","total_stock":49,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","is_default":true},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"19.60","promotion_list":[],"promotion_amount":0},{"id":9328,"goods_id":1489,"barcode":null,"sn":"P6080118336543","price":"19.60","costprice":"17.60","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:独角兽2000ml","is_defalut":2,"image_id":"ae2e2e7bc386ef619aa289f18e0abaa2","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080114245fd84ea02b858.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","is_default":true},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"19.60","promotion_list":[],"promotion_amount":0},{"id":9329,"goods_id":1489,"barcode":null,"sn":"P6080118336570","price":"19.60","costprice":"17.60","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:插手款粉猫咪2000ml","is_defalut":2,"image_id":"2327439ca24b082a5b7a51a8286bcc62","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080114335fd84ea9de449.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","is_default":true},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"19.60","promotion_list":[],"promotion_amount":0},{"id":9330,"goods_id":1489,"barcode":null,"sn":"P6080118336604","price":"19.60","costprice":"17.60","mktprice":"0.00","marketable":1,"stock":49,"freeze_stock":0,"spes_desc":"颜色:插手款粉小猪2000ml","is_defalut":2,"image_id":"44bd32ada24605c2be954dd916e1be02","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080114395fd84eaf72134.jpg","total_stock":49,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","is_default":true},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"19.60","promotion_list":[],"promotion_amount":0},{"id":9331,"goods_id":1489,"barcode":null,"sn":"P6080118336635","price":"19.60","costprice":"17.60","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:灰蓝猫头鹰2000ml","is_defalut":2,"image_id":"df3d1759dbd5d6657c2d59a9862abdbb","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080122095fd851b1aa99e.PNG","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","is_default":true},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"19.60","promotion_list":[],"promotion_amount":0},{"id":9332,"goods_id":1489,"barcode":null,"sn":"P6080118336664","price":"19.60","costprice":"17.60","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:黄底可爱狗2000ml","is_defalut":2,"image_id":"fd6b0349cf873aef0bf497234cce27e0","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080121335fd85165ce967.PNG","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","is_default":true},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"19.60","promotion_list":[],"promotion_amount":0},{"id":9333,"goods_id":1489,"barcode":null,"sn":"P6080118336695","price":"19.60","costprice":"17.60","mktprice":"0.00","marketable":1,"stock":46,"freeze_stock":0,"spes_desc":"颜色:蓝企鹅2000ml","is_defalut":2,"image_id":"068775e1e6c0e2fe9d1b15dfc91147c3","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080120475fd8510fabd97.PNG","total_stock":46,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","is_default":true}}},"amount":"19.60","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080110185fd84d0a0b107.jpg","default":{"id":9310,"goods_id":1489,"barcode":null,"sn":"P6080118336003","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:圣诞麋鹿1000ml","is_defalut":1,"image_id":"d6393bac2f713f4993bda9c0e3e36c04","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080111595fd84d9737525.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","is_default":true},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},"product":{"id":9310,"goods_id":1489,"barcode":null,"sn":"P6080118336003","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":50,"spes_desc":"颜色:圣诞麋鹿1000ml","is_defalut":1,"image_id":"d6393bac2f713f4993bda9c0e3e36c04","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080111595fd84d9737525.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","is_default":true},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/15/16080110185fd84d0a0b107.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080110195fd84d0b90cc6.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080110195fd84d0ba5991.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080110195fd84d0b9b7d3.jpg"],"total_stock":1187,"is_buy_num":13,"isfav":"false","can_buy":"ok","vip_price":15.8,"is_notice":0},{"id":1488,"bn":"G6080002227674","name":"原画师砍眉刀眉笔防水自然不易晕染刀削式方芯眉笔初学","brief":"","price":"31.00","costprice":"29.80","mktprice":"0.00","image_id":"f5d1dc862fb4aa0020383191472411cf","goods_cat_id":79,"goods_type_id":92,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":455,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001775fd822b15935c.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001705fd822aae498f.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001785fd822b2a1472.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001785fd822b2e249d.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001805fd822b40d6a8.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001795fd822b391e57.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001805fd822b44b286.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001805fd822b4ef70e.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001815fd822b50469d.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001815fd822b5433d7.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001815fd822b5e667e.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001825fd822b69618d.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001835fd822b747c24.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001835fd822b7b82a2.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001845fd822b8ceced.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001855fd822b9190b8.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001855fd822b954f05.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079348955fd723af492b8.png\" alt=\"16079348955fd723af492b8.png\"/><\/p>","spes_desc":{"颜色":{"193384":"01#黑灰色红杆","193385":"02#深棕色红杆","193386":"03#灰棕色红杆","193387":"04#茶棕色红杆"}},"params":"","service":"1,4,6,7","comments_count":0,"view_count":0,"buy_count":19,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":1,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:37:{i:193383;a:1:{i:0;s:6:\"白色\";}i:193384;a:1:{i:0;s:18:\"01#黑灰色红杆\";}i:193385;a:1:{i:0;s:18:\"02#深棕色红杆\";}i:193386;a:1:{i:0;s:18:\"03#灰棕色红杆\";}i:193387;a:1:{i:0;s:18:\"04#茶棕色红杆\";}i:193388;a:1:{i:0;s:4:\"2551\";}i:193389;a:1:{i:0;s:4:\"2521\";}i:193390;a:1:{i:0;s:4:\"2518\";}i:193391;a:1:{i:0;s:4:\"2519\";}i:193392;a:1:{i:0;s:4:\"2517\";}i:193393;a:1:{i:0;s:21:\"【一口袋礼物】\";}i:193394;a:1:{i:0;s:21:\"【神奇的袜子】\";}i:193395;a:1:{i:0;s:21:\"【吉祥的麋鹿】\";}i:193396;a:1:{i:0;s:9:\"咖啡色\";}i:193397;a:1:{i:0;s:6:\"浅灰\";}i:193398;a:1:{i:0;s:6:\"卡其\";}i:193399;a:1:{i:0;s:9:\"牛仔蓝\";}i:193400;a:1:{i:0;s:6:\"姜黄\";}i:193401;a:1:{i:0;s:6:\"焦糖\";}i:193402;a:1:{i:0;s:6:\"军绿\";}i:193403;a:1:{i:0;s:6:\"深灰\";}i:193404;a:1:{i:0;s:6:\"黑色\";}i:193405;a:1:{i:0;s:22:\"双杆【5色混搭】\";}i:193406;a:1:{i:0;s:22:\"恐龙【5色混搭】\";}i:193407;a:1:{i:0;s:22:\"猫咪【5色混搭】\";}i:193408;a:1:{i:0;s:22:\"英伦【5色混搭】\";}i:193409;a:1:{i:0;s:9:\"北欧米\";}i:193410;a:1:{i:0;s:9:\"北欧粉\";}i:193411;a:1:{i:0;s:9:\"北欧绿\";}i:193412;a:1:{i:0;s:9:\"北欧蓝\";}i:193413;a:1:{i:0;s:9:\"牛头绿\";}i:193414;a:1:{i:0;s:9:\"牛头咖\";}i:193415;a:1:{i:0;s:9:\"牛头粉\";}i:193416;a:1:{i:0;s:9:\"牛头灰\";}i:193417;a:1:{i:0;s:6:\"蓝色\";}i:193418;a:1:{i:0;s:6:\"粉色\";}i:193419;a:1:{i:0;s:6:\"灰色\";}}","ctime":null,"utime":1608000546,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"彩妆","products":[{"id":9306,"goods_id":1488,"barcode":null,"sn":"P6080002227743","price":"31.00","costprice":"29.80","mktprice":"0.00","marketable":2,"stock":121,"freeze_stock":0,"spes_desc":"颜色:01#黑灰色红杆","is_defalut":1,"image_id":"5f3f0cba84f70626ed8da68c0d45ff2e","isdel":null,"name":"原画师砍眉刀眉笔防水自然不易晕染刀削式方芯眉笔初学","buy_limit":0,"bn":"G6080002227674","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080000755fd8224be9c54.jpg","total_stock":121,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"01#黑灰色红杆":{"name":"01#黑灰色红杆","is_default":true},"02#深棕色红杆":{"name":"02#深棕色红杆","product_id":9307},"03#灰棕色红杆":{"name":"03#灰棕色红杆","product_id":9308},"04#茶棕色红杆":{"name":"04#茶棕色红杆","product_id":9309}}},"amount":"31.00","promotion_list":[],"promotion_amount":0},{"id":9307,"goods_id":1488,"barcode":null,"sn":"P6080002227784","price":"31.00","costprice":"29.80","mktprice":"0.00","marketable":2,"stock":126,"freeze_stock":0,"spes_desc":"颜色:02#深棕色红杆","is_defalut":2,"image_id":"568c1bf213033085e26931bcff678b45","isdel":null,"name":"原画师砍眉刀眉笔防水自然不易晕染刀削式方芯眉笔初学","buy_limit":0,"bn":"G6080002227674","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080000925fd8225c20a8c.jpg","total_stock":126,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"01#黑灰色红杆":{"name":"01#黑灰色红杆","product_id":9306},"02#深棕色红杆":{"name":"02#深棕色红杆","is_default":true},"03#灰棕色红杆":{"name":"03#灰棕色红杆","product_id":9308},"04#茶棕色红杆":{"name":"04#茶棕色红杆","product_id":9309}}},"amount":"31.00","promotion_list":[],"promotion_amount":0},{"id":9308,"goods_id":1488,"barcode":null,"sn":"P6080002227811","price":"31.00","costprice":"29.80","mktprice":"0.00","marketable":2,"stock":112,"freeze_stock":0,"spes_desc":"颜色:03#灰棕色红杆","is_defalut":2,"image_id":"7a782a5371e0ecc3577bf3e9a641e8ea","isdel":null,"name":"原画师砍眉刀眉笔防水自然不易晕染刀削式方芯眉笔初学","buy_limit":0,"bn":"G6080002227674","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001045fd8226816fbb.jpg","total_stock":112,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"01#黑灰色红杆":{"name":"01#黑灰色红杆","product_id":9306},"02#深棕色红杆":{"name":"02#深棕色红杆","product_id":9307},"03#灰棕色红杆":{"name":"03#灰棕色红杆","is_default":true},"04#茶棕色红杆":{"name":"04#茶棕色红杆","product_id":9309}}},"amount":"31.00","promotion_list":[],"promotion_amount":0},{"id":9309,"goods_id":1488,"barcode":null,"sn":"P6080002227871","price":"31.00","costprice":"29.80","mktprice":"0.00","marketable":2,"stock":96,"freeze_stock":0,"spes_desc":"颜色:04#茶棕色红杆","is_defalut":2,"image_id":"87df497eca0aa373e79ebe1dc103c5fa","isdel":null,"name":"原画师砍眉刀眉笔防水自然不易晕染刀削式方芯眉笔初学","buy_limit":0,"bn":"G6080002227674","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001165fd822741b35a.jpg","total_stock":96,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"01#黑灰色红杆":{"name":"01#黑灰色红杆","product_id":9306},"02#深棕色红杆":{"name":"02#深棕色红杆","product_id":9307},"03#灰棕色红杆":{"name":"03#灰棕色红杆","product_id":9308},"04#茶棕色红杆":{"name":"04#茶棕色红杆","is_default":true}}},"amount":"31.00","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16079999775fd821e913e3e.jpg","default":{"id":9306,"goods_id":1488,"barcode":null,"sn":"P6080002227743","price":"31.00","costprice":"29.80","mktprice":"0.00","marketable":2,"stock":121,"freeze_stock":0,"spes_desc":"颜色:01#黑灰色红杆","is_defalut":1,"image_id":"5f3f0cba84f70626ed8da68c0d45ff2e","isdel":null,"name":"原画师砍眉刀眉笔防水自然不易晕染刀削式方芯眉笔初学","buy_limit":0,"bn":"G6080002227674","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080000755fd8224be9c54.jpg","total_stock":121,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"01#黑灰色红杆":{"name":"01#黑灰色红杆","is_default":true},"02#深棕色红杆":{"name":"02#深棕色红杆","product_id":9307},"03#灰棕色红杆":{"name":"03#灰棕色红杆","product_id":9308},"04#茶棕色红杆":{"name":"04#茶棕色红杆","product_id":9309}}},"amount":"31.00","promotion_list":[],"promotion_amount":0},"product":{"id":9306,"goods_id":1488,"barcode":null,"sn":"P6080002227743","price":"31.00","costprice":"29.80","mktprice":"0.00","marketable":2,"stock":121,"spes_desc":"颜色:01#黑灰色红杆","is_defalut":1,"image_id":"5f3f0cba84f70626ed8da68c0d45ff2e","isdel":null,"name":"原画师砍眉刀眉笔防水自然不易晕染刀削式方芯眉笔初学","buy_limit":0,"bn":"G6080002227674","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080000755fd8224be9c54.jpg","total_stock":121,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"01#黑灰色红杆":{"name":"01#黑灰色红杆","is_default":true},"02#深棕色红杆":{"name":"02#深棕色红杆","product_id":9307},"03#灰棕色红杆":{"name":"03#灰棕色红杆","product_id":9308},"04#茶棕色红杆":{"name":"04#茶棕色红杆","product_id":9309}}},"amount":"31.00","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/15/16079999775fd821e913e3e.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16079999765fd821e8e42aa.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16079999765fd821e8dabf6.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16079999775fd821e90231e.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16079999765fd821e8cb30e.jpg"],"total_stock":455,"is_buy_num":19,"isfav":"false","can_buy":"ok","vip_price":31,"is_notice":0}],"total_page":21,"filter":{"label_ids":[],"brand_ids":[{"brand_id":13,"name":"超能"}],"goods_cat":[{"goods_cat_id":23,"name":"女士单鞋"},{"goods_cat_id":24,"name":"女士运动鞋"},{"goods_cat_id":51,"name":"打底裤"},{"goods_cat_id":54,"name":"袜子"},{"goods_cat_id":57,"name":"内衣"},{"goods_cat_id":62,"name":"休闲裤"},{"goods_cat_id":72,"name":"拖鞋"},{"goods_cat_id":75,"name":"男士皮靴"},{"goods_cat_id":78,"name":"车品"},{"goods_cat_id":79,"name":"彩妆"},{"goods_cat_id":80,"name":"护肤"},{"goods_cat_id":82,"name":"洁面"},{"goods_cat_id":83,"name":"美妆工具"},{"goods_cat_id":84,"name":"润唇膏/护手霜"},{"goods_cat_id":85,"name":"居家清洁"},{"goods_cat_id":86,"name":"口腔清洁"},{"goods_cat_id":87,"name":"头发洗护"},{"goods_cat_id":88,"name":"身体洗护"},{"goods_cat_id":89,"name":"摆件"},{"goods_cat_id":92,"name":"床上用品"},{"goods_cat_id":95,"name":"纸品"},{"goods_cat_id":96,"name":"首饰"},{"goods_cat_id":99,"name":"杯子"},{"goods_cat_id":100,"name":"配件"},{"goods_cat_id":103,"name":"围巾"},{"goods_cat_id":104,"name":"女士双肩包"},{"goods_cat_id":106,"name":"女士手提包"},{"goods_cat_id":112,"name":"休闲零食"},{"goods_cat_id":114,"name":"坚果"},{"goods_cat_id":116,"name":"冲饮"},{"goods_cat_id":119,"name":"速食"},{"goods_cat_id":120,"name":"儿童鞋服"},{"goods_cat_id":121,"name":"母婴用品"},{"goods_cat_id":126,"name":"五金电子"},{"goods_cat_id":128,"name":"小家电"},{"goods_cat_id":130,"name":"帽子"},{"goods_cat_id":131,"name":"头饰"},{"goods_cat_id":132,"name":"腰带"},{"goods_cat_id":133,"name":"手套"},{"goods_cat_id":134,"name":"餐厨"},{"goods_cat_id":135,"name":"居家用品"},{"goods_cat_id":136,"name":"毛巾/浴巾"},{"goods_cat_id":137,"name":"伞具"},{"goods_cat_id":138,"name":"文体"},{"goods_cat_id":143,"name":"儿童包"}]},"page":1,"limit":10,"where":{"hot":1,"is_tqm":1},"order":"sort asc","class_name":""}
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
         * list : [{"id":1505,"bn":"G6081932808665","name":"龙王豆浆480g速溶原味/甜味豆奶粉营养早餐无蔗糖无渣","brief":"","price":"16.60","costprice":"15.60","mktprice":"0.00","image_id":"39d9b34170446b8a439be6617382689b","goods_cat_id":116,"goods_type_id":25,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":285,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'>全国包邮，除部分地区包括内蒙古,甘肃,宁夏，海南，青海，西藏，新疆等地区需另加邮费，下单请联系客服。<\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081932605fdb14ec413b5.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081932605fdb14ece4474.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081932605fdb14ec3780d.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081932615fdb14edd5e77.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081932615fdb14ed61a53.png\"/><\/p><p style='overflow:hidden'><br/><\/p>","spes_desc":{"净含量":{"195841":"480g"}},"params":"","service":"1,4,6","comments_count":0,"view_count":0,"buy_count":15,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":2,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:56:{i:195840;a:1:{i:0;s:4:\"140g\";}i:195841;a:1:{i:0;s:4:\"480g\";}i:195842;a:1:{i:0;s:10:\"100g核桃\";}i:195843;a:1:{i:0;s:10:\"250g核桃\";}i:195844;a:1:{i:0;s:10:\"500g核桃\";}i:195845;a:1:{i:0;s:4:\"150g\";}i:195846;a:1:{i:0;s:4:\"800g\";}i:195847;a:1:{i:0;s:8:\"400g/瓶\";}i:195848;a:1:{i:0;s:3:\"13g\";}i:195849;a:1:{i:0;s:3:\"60g\";}i:195850;a:1:{i:0;s:4:\"500g\";}i:195851;a:1:{i:0;s:5:\"1000g\";}i:195852;a:1:{i:0;s:9:\"420g*6袋\";}i:195853;a:1:{i:0;s:4:\"1袋\";}i:195854;a:1:{i:0;s:11:\"2袋赠1袋\";}i:195855;a:1:{i:0;s:11:\"3袋赠2袋\";}i:195856;a:1:{i:0;s:3:\"80g\";}i:195857;a:1:{i:0;s:28:\"100g（白芝麻猪肉脯）\";}i:195858;a:1:{i:0;s:4:\"120g\";}i:195859;a:1:{i:0;s:4:\"160g\";}i:195860;a:1:{i:0;s:4:\"900g\";}i:195861;a:1:{i:0;s:3:\"1KG\";}i:195862;a:1:{i:0;s:4:\"658g\";}i:195863;a:1:{i:0;s:3:\"50g\";}i:195864;a:1:{i:0;s:4:\"185g\";}i:195865;a:1:{i:0;s:15:\"750g(家庭版)\";}i:195866;a:1:{i:0;s:19:\"750g（年货版）\";}i:195867;a:1:{i:0;s:25:\"100g（精制猪肉脯）\";}i:195868;a:1:{i:0;s:4:\"100g\";}i:195869;a:1:{i:0;s:18:\"80g（烧烤味）\";}i:195870;a:1:{i:0;s:14:\"80g(麻辣味)\";}i:195871;a:1:{i:0;s:16:\"100g( 蔓越莓)\";}i:195872;a:1:{i:0;s:16:\"100g（抹茶）\";}i:195873;a:1:{i:0;s:4:\"600g\";}i:195874;a:1:{i:0;s:3:\"90g\";}i:195875;a:1:{i:0;s:4:\"180g\";}i:195876;a:1:{i:0;s:11:\"50g(五香)\";}i:195877;a:1:{i:0;s:10:\"50g(XO酱)\";}i:195878;a:1:{i:0;s:15:\"50g（香辣）\";}i:195879;a:1:{i:0;s:15:\"100g(五香味)\";}i:195880;a:1:{i:0;s:15:\"100g(甜辣味)\";}i:195881;a:1:{i:0;s:15:\"185g(五香味)\";}i:195882;a:1:{i:0;s:15:\"185g(香辣味)\";}i:195883;a:1:{i:0;s:15:\"185g(烧烤味)\";}i:195884;a:1:{i:0;s:9:\"一支60g\";}i:195885;a:1:{i:0;s:13:\"两支共120g\";}i:195886;a:1:{i:0;s:20:\"4支牙膏1支牙刷\";}i:195887;a:1:{i:0;s:16:\"五支装共550g\";}i:195888;a:1:{i:0;s:4:\"330g\";}i:195889;a:1:{i:0;s:4:\"200g\";}i:195890;a:1:{i:0;s:3:\"2KG\";}i:195891;a:1:{i:0;s:9:\"115g*3块\";}i:195892;a:1:{i:0;s:10:\"1.1kg*1瓶\";}i:195893;a:1:{i:0;s:10:\"1.1kg*2瓶\";}i:195894;a:1:{i:0;s:5:\"20片\";}i:195895;a:1:{i:0;s:5:\"30片\";}}","ctime":null,"utime":1608193288,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"冲饮","products":[{"id":9711,"goods_id":1505,"barcode":null,"sn":"P6081932808722","price":"16.60","costprice":"15.60","mktprice":"0.00","marketable":2,"stock":285,"freeze_stock":0,"spes_desc":"净含量:480g","is_defalut":1,"image_id":"","isdel":null,"name":"龙王豆浆480g速溶原味/甜味豆奶粉营养早餐无蔗糖无渣","buy_limit":0,"bn":"G6081932808665","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931865fdb14a25f0dd.jpg","total_stock":285,"grade_price":[],"grade_info":[],"default_spes_desc":{"净含量":{"480g":{"name":"480g","is_default":true}}},"amount":"16.60","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931865fdb14a25f0dd.jpg","default":{"id":9711,"goods_id":1505,"barcode":null,"sn":"P6081932808722","price":"16.60","costprice":"15.60","mktprice":"0.00","marketable":2,"stock":285,"freeze_stock":0,"spes_desc":"净含量:480g","is_defalut":1,"image_id":"","isdel":null,"name":"龙王豆浆480g速溶原味/甜味豆奶粉营养早餐无蔗糖无渣","buy_limit":0,"bn":"G6081932808665","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931865fdb14a25f0dd.jpg","total_stock":285,"grade_price":[],"grade_info":[],"default_spes_desc":{"净含量":{"480g":{"name":"480g","is_default":true}}},"amount":"16.60","promotion_list":[],"promotion_amount":0},"product":{"id":9711,"goods_id":1505,"barcode":null,"sn":"P6081932808722","price":"16.60","costprice":"15.60","mktprice":"0.00","marketable":2,"stock":285,"spes_desc":"净含量:480g","is_defalut":1,"image_id":"","isdel":null,"name":"龙王豆浆480g速溶原味/甜味豆奶粉营养早餐无蔗糖无渣","buy_limit":0,"bn":"G6081932808665","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931865fdb14a25f0dd.jpg","total_stock":285,"grade_price":[],"grade_info":[],"default_spes_desc":{"净含量":{"480g":{"name":"480g","is_default":true}}},"amount":"16.60","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931865fdb14a25f0dd.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931865fdb14a2125ae.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931865fdb14a221980.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931875fdb14a310666.jpg"],"total_stock":285,"is_buy_num":15,"isfav":"false","can_buy":"ok","vip_price":16.6,"is_notice":0},{"id":1502,"bn":"G6081834950845","name":"正宗朝族韩式辣白菜500克每袋东北延边泡菜","brief":"不免邮区域:海外,台湾,澳门,\n香港,西藏,新疆,青海,内蒙古","price":"10.90","costprice":"9.85","mktprice":"0.00","image_id":"62ca973617351545a3d3fb096e2e337d","goods_cat_id":119,"goods_type_id":98,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":177,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081834775fdaeeb5d1357.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081834785fdaeeb6577d9.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081834785fdaeeb67f067.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081834795fdaeeb715602.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081834795fdaeeb7c3aa8.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081834805fdaeeb80cfa0.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081834805fdaeeb8182c4.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081059325fd9bfccd145a.png\" alt=\"16081059325fd9bfccd145a.png\"/><\/p>","spes_desc":{"口味":{"195453":"辣白菜500g"}},"params":"","service":"1,4,6,7","comments_count":0,"view_count":0,"buy_count":23,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":1,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:18:{i:195452;a:1:{i:0;s:17:\"山核桃98g*3袋\";}i:195453;a:1:{i:0;s:13:\"辣白菜500g\";}i:195454;a:1:{i:0;s:27:\"原味150克/袋（15枚）\";}i:195455;a:1:{i:0;s:27:\"香辣150克/袋（15枚）\";}i:195456;a:1:{i:0;s:29:\"1.26千克/桶【约120支】\";}i:195457;a:1:{i:0;s:22:\"香辣铁蛋15g*30包\t\";}i:195458;a:1:{i:0;s:19:\"盐焗味15g*30包\t\";}i:195459;a:1:{i:0;s:22:\"知心卤味20g*30包\t\";}i:195460;a:1:{i:0;s:19:\"泡椒味20g*30包\t\";}i:195461;a:1:{i:0;s:18:\"混合口味30包\t\";}i:195462;a:1:{i:0;s:10:\"520g桶装\";}i:195463;a:1:{i:0;s:15:\"原味98g*3袋\t\";}i:195464;a:1:{i:0;s:18:\"海盐味98g*3袋\t\";}i:195465;a:1:{i:0;s:24:\"蜂蜜黄油味98g*3袋\t\";}i:195466;a:1:{i:0;s:18:\"焦糖味98g*3袋\t\";}i:195467;a:1:{i:0;s:18:\"芝士味98g*3袋\t\";}i:195468;a:1:{i:0;s:18:\"藤椒味98g*3袋\t\";}i:195469;a:1:{i:0;s:64:\"3袋不同口味（请备注口味，没备注口味随机发）\";}}","ctime":null,"utime":1608183516,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"速食","products":[{"id":9355,"goods_id":1502,"barcode":null,"sn":"P6081834950911","price":"10.90","costprice":"9.85","mktprice":"0.00","marketable":2,"stock":177,"freeze_stock":0,"spes_desc":"口味:辣白菜500g","is_defalut":1,"image_id":"","isdel":null,"name":"正宗朝族韩式辣白菜500克每袋东北延边泡菜","buy_limit":0,"bn":"G6081834950845","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081833645fdaee44af888.jpg","total_stock":177,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"辣白菜500g":{"name":"辣白菜500g","is_default":true}}},"amount":"10.90","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081833645fdaee44af888.jpg","default":{"id":9355,"goods_id":1502,"barcode":null,"sn":"P6081834950911","price":"10.90","costprice":"9.85","mktprice":"0.00","marketable":2,"stock":177,"freeze_stock":0,"spes_desc":"口味:辣白菜500g","is_defalut":1,"image_id":"","isdel":null,"name":"正宗朝族韩式辣白菜500克每袋东北延边泡菜","buy_limit":0,"bn":"G6081834950845","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081833645fdaee44af888.jpg","total_stock":177,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"辣白菜500g":{"name":"辣白菜500g","is_default":true}}},"amount":"10.90","promotion_list":[],"promotion_amount":0},"product":{"id":9355,"goods_id":1502,"barcode":null,"sn":"P6081834950911","price":"10.90","costprice":"9.85","mktprice":"0.00","marketable":2,"stock":177,"spes_desc":"口味:辣白菜500g","is_defalut":1,"image_id":"","isdel":null,"name":"正宗朝族韩式辣白菜500克每袋东北延边泡菜","buy_limit":0,"bn":"G6081834950845","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081833645fdaee44af888.jpg","total_stock":177,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"辣白菜500g":{"name":"辣白菜500g","is_default":true}}},"amount":"10.90","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/17/16081833645fdaee44af888.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/17/16081833645fdaee44d7033.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/17/16081833645fdaee44b9f67.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/17/16081833645fdaee44968d3.jpg"],"total_stock":177,"is_buy_num":23,"isfav":"false","can_buy":"ok","vip_price":10.9,"is_notice":0},{"id":1499,"bn":"G6081051071151","name":"8味 30克*30包 泡脚中药包艾草艾叶红花生姜草本泡脚包女去湿气祛濕足浴粉包","brief":"","price":"26.80","costprice":"25.80","mktprice":"0.00","image_id":"20a988e0ffafb9556e28673b7e1512c1","goods_cat_id":135,"goods_type_id":95,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":187,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050905fd9bc82b6ddd.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050905fd9bc82c1820.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050905fd9bc82ccb30.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050905fd9bc82da5ce.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050905fd9bc82e5cf3.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050905fd9bc82ef6f5.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050915fd9bc8307bb5.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050915fd9bc8312e64.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050915fd9bc8346767.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050915fd9bc835210d.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050925fd9bc840e6d6.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050915fd9bc83908f8.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050925fd9bc844a492.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050925fd9bc84895d6.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050925fd9bc84c7595.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050925fd9bc84d1eef.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080987735fd9a3d5799cb.png\" alt=\"16080987735fd9a3d5799cb.png\"/><\/p>","spes_desc":{"规格":{"194976":"8味 30克*30包"}},"params":"","service":"1,4,6,7","comments_count":0,"view_count":0,"buy_count":13,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":1,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:45:{i:194975;a:1:{i:0;s:8:\"1个头\t\";}i:194976;a:1:{i:0;s:16:\"8味 30克*30包\";}i:194977;a:1:{i:0;s:6:\"200g*5\";}i:194978;a:1:{i:0;s:6:\"100只\";}i:194979;a:1:{i:0;s:51:\"1个蓝丝带小鸭+1个粉丝带小鸭+20粒电池\";}i:194980;a:1:{i:0;s:35:\"蓝丝带小鸭-充电款（1个）\";}i:194981;a:1:{i:0;s:35:\"粉丝带小鸭-充电款（1个）\";}i:194982;a:1:{i:0;s:33:\"咸肉松小贝【3包】约12枚\";}i:194983;a:1:{i:0;s:33:\"咸肉松小贝【6包】约24枚\";}i:194984;a:1:{i:0;s:33:\"咸肉松小贝 2kg/原装整箱\t\";}i:194985;a:1:{i:0;s:21:\"黑色（主驾驶）\";}i:194986;a:1:{i:0;s:21:\"黑色（副驾驶）\";}i:194987;a:1:{i:0;s:21:\"棕色（主驾驶）\";}i:194988;a:1:{i:0;s:21:\"棕色（副驾驶）\";}i:194989;a:1:{i:0;s:21:\"米色（主驾驶）\";}i:194990;a:1:{i:0;s:21:\"米色（副驾驶）\";}i:194991;a:1:{i:0;s:30:\"塑胶无皮款（主驾驶）\";}i:194992;a:1:{i:0;s:30:\"塑胶无皮款（副驾驶）\";}i:194993;a:1:{i:0;s:20:\"黑色主+副2个装\";}i:194994;a:1:{i:0;s:20:\"棕色主+副2个装\";}i:194995;a:1:{i:0;s:20:\"米色主+副2个装\";}i:194996;a:1:{i:0;s:29:\"塑胶无皮款主+副2个装\";}i:194997;a:1:{i:0;s:6:\"大号\";}i:194998;a:1:{i:0;s:6:\"小号\";}i:194999;a:1:{i:0;s:9:\"折叠款\";}i:195000;a:1:{i:0;s:12:\"折叠圆形\";}i:195001;a:1:{i:0;s:7:\"30包*2\";}i:195002;a:1:{i:0;s:5:\"50g*8\";}i:195003;a:1:{i:0;s:24:\"4个500ml高档水晶杯\";}i:195004;a:1:{i:0;s:23:\"S925银针耳钉一对 \";}i:195005;a:1:{i:0;s:25:\" 三角软垫耳夹一对\";}i:195006;a:1:{i:0;s:13:\"龙猫-小草\";}i:195007;a:1:{i:0;s:13:\"龙猫-萝卜\";}i:195008;a:1:{i:0;s:11:\"哆啦A梦1\";}i:195009;a:1:{i:0;s:11:\"哆啦A梦2\";}i:195010;a:1:{i:0;s:14:\"10支蓝桥opp\";}i:195011;a:1:{i:0;s:17:\"10支蓝桥+pu包\";}i:195012;a:1:{i:0;s:7:\"5个头\";}i:195013;a:1:{i:0;s:10:\"带1片布\";}i:195014;a:1:{i:0;s:10:\"带3片布\";}i:195015;a:1:{i:0;s:10:\"带7片布\";}i:195016;a:1:{i:0;s:30:\"美规电源（国内通用）\";}i:195017;a:1:{i:0;s:8:\"2个头\t\";}i:195018;a:1:{i:0;s:8:\"3个头\t\";}i:195019;a:1:{i:0;s:7:\"4个头\";}}","ctime":null,"utime":1608105121,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"居家用品","products":[{"id":9351,"goods_id":1499,"barcode":null,"sn":"P6081051071213","price":"26.80","costprice":"25.80","mktprice":"0.00","marketable":2,"stock":187,"freeze_stock":0,"spes_desc":"规格:8味 30克*30包","is_defalut":1,"image_id":"815df709678fa75afd5fde7d0240e681","isdel":null,"name":"8味 30克*30包 泡脚中药包艾草艾叶红花生姜草本泡脚包女去湿气祛濕足浴粉包","buy_limit":0,"bn":"G6081051071151","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050015fd9bc29a1f40.jpg","total_stock":187,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"8味 30克*30包":{"name":"8味 30克*30包","is_default":true}}},"amount":"26.80","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081049685fd9bc08b2da3.jpg","default":{"id":9351,"goods_id":1499,"barcode":null,"sn":"P6081051071213","price":"26.80","costprice":"25.80","mktprice":"0.00","marketable":2,"stock":187,"freeze_stock":0,"spes_desc":"规格:8味 30克*30包","is_defalut":1,"image_id":"815df709678fa75afd5fde7d0240e681","isdel":null,"name":"8味 30克*30包 泡脚中药包艾草艾叶红花生姜草本泡脚包女去湿气祛濕足浴粉包","buy_limit":0,"bn":"G6081051071151","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050015fd9bc29a1f40.jpg","total_stock":187,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"8味 30克*30包":{"name":"8味 30克*30包","is_default":true}}},"amount":"26.80","promotion_list":[],"promotion_amount":0},"product":{"id":9351,"goods_id":1499,"barcode":null,"sn":"P6081051071213","price":"26.80","costprice":"25.80","mktprice":"0.00","marketable":2,"stock":187,"spes_desc":"规格:8味 30克*30包","is_defalut":1,"image_id":"815df709678fa75afd5fde7d0240e681","isdel":null,"name":"8味 30克*30包 泡脚中药包艾草艾叶红花生姜草本泡脚包女去湿气祛濕足浴粉包","buy_limit":0,"bn":"G6081051071151","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081050015fd9bc29a1f40.jpg","total_stock":187,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"8味 30克*30包":{"name":"8味 30克*30包","is_default":true}}},"amount":"26.80","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/16/16081049685fd9bc08b2da3.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16081049685fd9bc08a3012.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16081049685fd9bc08bd1bf.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16081049685fd9bc08cd184.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16081049685fd9bc08d69bd.jpg"],"total_stock":187,"is_buy_num":13,"isfav":"false","can_buy":"ok","vip_price":26.8,"is_notice":0},{"id":1497,"bn":"G6080987751265","name":"回忆杀火锅川粉200g*5袋麻辣烫粉皮速食免泡手工鲜粉火锅宽粉粉条","brief":"","price":"17.80","costprice":"15.80","mktprice":"0.00","image_id":"0082c2ed4ff4a1cabcc1f7dba719746c","goods_cat_id":119,"goods_type_id":95,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":297,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'><strong><span style=\"font-size: 20px;\">全国包邮，除部分地区包括内蒙古,甘肃,宁夏，海南，青海，西藏，新疆等地区需另加邮费，下单请联系客服哦。<\/span><\/strong><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080993585fd9a61e9353c.PNG\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080987675fd9a3cf94052.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080987705fd9a3d22ab8a.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080987705fd9a3d29c300.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080987715fd9a3d3b0cf7.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080987715fd9a3d3ef100.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080987735fd9a3d5799cb.png\"/><\/p><p style='overflow:hidden'><br/><\/p>","spes_desc":{"规格":{"194589":"200g*5"}},"params":"","service":"1,4,6","comments_count":0,"view_count":0,"buy_count":3,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":2,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:44:{i:194588;a:1:{i:0;s:8:\"1个头\t\";}i:194589;a:1:{i:0;s:6:\"200g*5\";}i:194590;a:1:{i:0;s:6:\"100只\";}i:194591;a:1:{i:0;s:51:\"1个蓝丝带小鸭+1个粉丝带小鸭+20粒电池\";}i:194592;a:1:{i:0;s:35:\"蓝丝带小鸭-充电款（1个）\";}i:194593;a:1:{i:0;s:35:\"粉丝带小鸭-充电款（1个）\";}i:194594;a:1:{i:0;s:33:\"咸肉松小贝【3包】约12枚\";}i:194595;a:1:{i:0;s:33:\"咸肉松小贝【6包】约24枚\";}i:194596;a:1:{i:0;s:33:\"咸肉松小贝 2kg/原装整箱\t\";}i:194597;a:1:{i:0;s:21:\"黑色（主驾驶）\";}i:194598;a:1:{i:0;s:21:\"黑色（副驾驶）\";}i:194599;a:1:{i:0;s:21:\"棕色（主驾驶）\";}i:194600;a:1:{i:0;s:21:\"棕色（副驾驶）\";}i:194601;a:1:{i:0;s:21:\"米色（主驾驶）\";}i:194602;a:1:{i:0;s:21:\"米色（副驾驶）\";}i:194603;a:1:{i:0;s:30:\"塑胶无皮款（主驾驶）\";}i:194604;a:1:{i:0;s:30:\"塑胶无皮款（副驾驶）\";}i:194605;a:1:{i:0;s:20:\"黑色主+副2个装\";}i:194606;a:1:{i:0;s:20:\"棕色主+副2个装\";}i:194607;a:1:{i:0;s:20:\"米色主+副2个装\";}i:194608;a:1:{i:0;s:29:\"塑胶无皮款主+副2个装\";}i:194609;a:1:{i:0;s:6:\"大号\";}i:194610;a:1:{i:0;s:6:\"小号\";}i:194611;a:1:{i:0;s:9:\"折叠款\";}i:194612;a:1:{i:0;s:12:\"折叠圆形\";}i:194613;a:1:{i:0;s:7:\"30包*2\";}i:194614;a:1:{i:0;s:5:\"50g*8\";}i:194615;a:1:{i:0;s:24:\"4个500ml高档水晶杯\";}i:194616;a:1:{i:0;s:23:\"S925银针耳钉一对 \";}i:194617;a:1:{i:0;s:25:\" 三角软垫耳夹一对\";}i:194618;a:1:{i:0;s:13:\"龙猫-小草\";}i:194619;a:1:{i:0;s:13:\"龙猫-萝卜\";}i:194620;a:1:{i:0;s:11:\"哆啦A梦1\";}i:194621;a:1:{i:0;s:11:\"哆啦A梦2\";}i:194622;a:1:{i:0;s:14:\"10支蓝桥opp\";}i:194623;a:1:{i:0;s:17:\"10支蓝桥+pu包\";}i:194624;a:1:{i:0;s:7:\"5个头\";}i:194625;a:1:{i:0;s:10:\"带1片布\";}i:194626;a:1:{i:0;s:10:\"带3片布\";}i:194627;a:1:{i:0;s:10:\"带7片布\";}i:194628;a:1:{i:0;s:30:\"美规电源（国内通用）\";}i:194629;a:1:{i:0;s:8:\"2个头\t\";}i:194630;a:1:{i:0;s:8:\"3个头\t\";}i:194631;a:1:{i:0;s:7:\"4个头\";}}","ctime":null,"utime":1608112557,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"速食","products":[{"id":9349,"goods_id":1497,"barcode":null,"sn":"P6080987751331","price":"17.80","costprice":"15.80","mktprice":"0.00","marketable":1,"stock":297,"freeze_stock":0,"spes_desc":"规格:200g*5","is_defalut":1,"image_id":"","isdel":null,"name":"回忆杀火锅川粉200g*5袋麻辣烫粉皮速食免泡手工鲜粉火锅宽粉粉条","buy_limit":0,"bn":"G6080987751265","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080986975fd9a3897692e.jpg","total_stock":297,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"200g*5":{"name":"200g*5","is_default":true}}},"amount":"17.80","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080986975fd9a3897692e.jpg","default":{"id":9349,"goods_id":1497,"barcode":null,"sn":"P6080987751331","price":"17.80","costprice":"15.80","mktprice":"0.00","marketable":1,"stock":297,"freeze_stock":0,"spes_desc":"规格:200g*5","is_defalut":1,"image_id":"","isdel":null,"name":"回忆杀火锅川粉200g*5袋麻辣烫粉皮速食免泡手工鲜粉火锅宽粉粉条","buy_limit":0,"bn":"G6080987751265","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080986975fd9a3897692e.jpg","total_stock":297,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"200g*5":{"name":"200g*5","is_default":true}}},"amount":"17.80","promotion_list":[],"promotion_amount":0},"product":{"id":9349,"goods_id":1497,"barcode":null,"sn":"P6080987751331","price":"17.80","costprice":"15.80","mktprice":"0.00","marketable":1,"stock":297,"spes_desc":"规格:200g*5","is_defalut":1,"image_id":"","isdel":null,"name":"回忆杀火锅川粉200g*5袋麻辣烫粉皮速食免泡手工鲜粉火锅宽粉粉条","buy_limit":0,"bn":"G6080987751265","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080986975fd9a3897692e.jpg","total_stock":297,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"200g*5":{"name":"200g*5","is_default":true}}},"amount":"17.80","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/16/16080986975fd9a3897692e.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16080986975fd9a389833d7.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16080986975fd9a3898daca.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16080986975fd9a3899db46.jpg"],"total_stock":297,"is_buy_num":3,"isfav":"false","can_buy":"ok","vip_price":17.8,"is_notice":0},{"id":1496,"bn":"G6080973578343","name":"一次性纸杯家用商用加厚杯子100只饮水热饮杯210ml","brief":"","price":"10.90","costprice":"9.90","mktprice":"0.00","image_id":"7f5b5a33a3163c523016fa47378785f5","goods_cat_id":99,"goods_type_id":95,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":293,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'>全国包邮，除部分地区包括内蒙古,甘肃,宁夏，海南，青海，西藏，新疆等地区需另加邮费，下单请联系客服。<\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080973555fd99e4b3f22c.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080973555fd99e4b6bd0c.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080973555fd99e4b584e9.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080973555fd99e4bc3cb8.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080973555fd99e4bdbbe8.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080973555fd99e4be5486.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080973555fd99e4bf2438.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080973565fd99e4c0dd44.png\"/><\/p><p style='overflow:hidden'><br/><\/p>","spes_desc":{"规格":{"194546":"100只"}},"params":"","service":"1,4,6","comments_count":0,"view_count":0,"buy_count":7,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":2,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:43:{i:194545;a:1:{i:0;s:8:\"1个头\t\";}i:194546;a:1:{i:0;s:6:\"100只\";}i:194547;a:1:{i:0;s:51:\"1个蓝丝带小鸭+1个粉丝带小鸭+20粒电池\";}i:194548;a:1:{i:0;s:35:\"蓝丝带小鸭-充电款（1个）\";}i:194549;a:1:{i:0;s:35:\"粉丝带小鸭-充电款（1个）\";}i:194550;a:1:{i:0;s:33:\"咸肉松小贝【3包】约12枚\";}i:194551;a:1:{i:0;s:33:\"咸肉松小贝【6包】约24枚\";}i:194552;a:1:{i:0;s:33:\"咸肉松小贝 2kg/原装整箱\t\";}i:194553;a:1:{i:0;s:21:\"黑色（主驾驶）\";}i:194554;a:1:{i:0;s:21:\"黑色（副驾驶）\";}i:194555;a:1:{i:0;s:21:\"棕色（主驾驶）\";}i:194556;a:1:{i:0;s:21:\"棕色（副驾驶）\";}i:194557;a:1:{i:0;s:21:\"米色（主驾驶）\";}i:194558;a:1:{i:0;s:21:\"米色（副驾驶）\";}i:194559;a:1:{i:0;s:30:\"塑胶无皮款（主驾驶）\";}i:194560;a:1:{i:0;s:30:\"塑胶无皮款（副驾驶）\";}i:194561;a:1:{i:0;s:20:\"黑色主+副2个装\";}i:194562;a:1:{i:0;s:20:\"棕色主+副2个装\";}i:194563;a:1:{i:0;s:20:\"米色主+副2个装\";}i:194564;a:1:{i:0;s:29:\"塑胶无皮款主+副2个装\";}i:194565;a:1:{i:0;s:6:\"大号\";}i:194566;a:1:{i:0;s:6:\"小号\";}i:194567;a:1:{i:0;s:9:\"折叠款\";}i:194568;a:1:{i:0;s:12:\"折叠圆形\";}i:194569;a:1:{i:0;s:7:\"30包*2\";}i:194570;a:1:{i:0;s:5:\"50g*8\";}i:194571;a:1:{i:0;s:24:\"4个500ml高档水晶杯\";}i:194572;a:1:{i:0;s:23:\"S925银针耳钉一对 \";}i:194573;a:1:{i:0;s:25:\" 三角软垫耳夹一对\";}i:194574;a:1:{i:0;s:13:\"龙猫-小草\";}i:194575;a:1:{i:0;s:13:\"龙猫-萝卜\";}i:194576;a:1:{i:0;s:11:\"哆啦A梦1\";}i:194577;a:1:{i:0;s:11:\"哆啦A梦2\";}i:194578;a:1:{i:0;s:14:\"10支蓝桥opp\";}i:194579;a:1:{i:0;s:17:\"10支蓝桥+pu包\";}i:194580;a:1:{i:0;s:7:\"5个头\";}i:194581;a:1:{i:0;s:10:\"带1片布\";}i:194582;a:1:{i:0;s:10:\"带3片布\";}i:194583;a:1:{i:0;s:10:\"带7片布\";}i:194584;a:1:{i:0;s:30:\"美规电源（国内通用）\";}i:194585;a:1:{i:0;s:8:\"2个头\t\";}i:194586;a:1:{i:0;s:8:\"3个头\t\";}i:194587;a:1:{i:0;s:7:\"4个头\";}}","ctime":null,"utime":1608112490,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"杯子","products":[{"id":9348,"goods_id":1496,"barcode":null,"sn":"P6080973578411","price":"10.90","costprice":"9.90","mktprice":"0.00","marketable":2,"stock":293,"freeze_stock":0,"spes_desc":"规格:100只","is_defalut":1,"image_id":"","isdel":null,"name":"一次性纸杯家用商用加厚杯子100只饮水热饮杯210ml","buy_limit":0,"bn":"G6080973578343","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080971945fd99daa8cda8.jpg","total_stock":293,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"100只":{"name":"100只","is_default":true}}},"amount":"10.90","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080971945fd99daa8cda8.jpg","default":{"id":9348,"goods_id":1496,"barcode":null,"sn":"P6080973578411","price":"10.90","costprice":"9.90","mktprice":"0.00","marketable":2,"stock":293,"freeze_stock":0,"spes_desc":"规格:100只","is_defalut":1,"image_id":"","isdel":null,"name":"一次性纸杯家用商用加厚杯子100只饮水热饮杯210ml","buy_limit":0,"bn":"G6080973578343","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080971945fd99daa8cda8.jpg","total_stock":293,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"100只":{"name":"100只","is_default":true}}},"amount":"10.90","promotion_list":[],"promotion_amount":0},"product":{"id":9348,"goods_id":1496,"barcode":null,"sn":"P6080973578411","price":"10.90","costprice":"9.90","mktprice":"0.00","marketable":2,"stock":293,"spes_desc":"规格:100只","is_defalut":1,"image_id":"","isdel":null,"name":"一次性纸杯家用商用加厚杯子100只饮水热饮杯210ml","buy_limit":0,"bn":"G6080973578343","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080971945fd99daa8cda8.jpg","total_stock":293,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"100只":{"name":"100只","is_default":true}}},"amount":"10.90","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/16/16080971945fd99daa8cda8.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16080971955fd99dab1363b.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16080971945fd99daae703d.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16080971955fd99dab20d7f.jpg"],"total_stock":293,"is_buy_num":7,"isfav":"false","can_buy":"ok","vip_price":10.9,"is_notice":0},{"id":1495,"bn":"G6080853273903","name":"2双 东北零下40°加绒保暖袜子加厚毛圈羊毛袜女","brief":"不免邮区域:海外,台湾,澳门,\n香港,西藏,新疆,宁夏,青海,内蒙古","price":"21.00","costprice":"19.88","mktprice":"0.00","image_id":"8830484ce4df9b2cdd7fc13293249981","goods_cat_id":135,"goods_type_id":92,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":841,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080853085fd96f3cd09b1.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080853095fd96f3d7e46d.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080853105fd96f3e2ef28.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080853105fd96f3ea1b71.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080853115fd96f3f56268.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080853115fd96f3f941eb.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080853115fd96f3fd9cc9.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080192945fd86d5e4cd86.png\" alt=\"16080192945fd86d5e4cd86.png\"/><\/p>","spes_desc":{"颜色":{"194503":"橘黄+默认随机【共2双，指定搭配色请自行备注！】","194504":"黑+默认随机【共2双，指定搭配色请自行备注！】","194505":"灰色+默认随机【共2双，指定搭配色请自行备注！】","194506":"粉色+默认随机【共2双，指定搭配色请自行备注！】","194507":"砖红+默认随机【共2双，指定搭配色请自行备注！】"}},"params":"","service":"1,4,6,7","comments_count":0,"view_count":0,"buy_count":21,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":1,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:43:{i:194502;a:1:{i:0;s:6:\"白色\";}i:194503;a:1:{i:0;s:68:\"橘黄+默认随机【共2双，指定搭配色请自行备注！】\";}i:194504;a:1:{i:0;s:65:\"黑+默认随机【共2双，指定搭配色请自行备注！】\";}i:194505;a:1:{i:0;s:68:\"灰色+默认随机【共2双，指定搭配色请自行备注！】\";}i:194506;a:1:{i:0;s:68:\"粉色+默认随机【共2双，指定搭配色请自行备注！】\";}i:194507;a:1:{i:0;s:68:\"砖红+默认随机【共2双，指定搭配色请自行备注！】\";}i:194508;a:1:{i:0;s:53:\"圣诞发卡10对【款式随机，介意者慎拍】\";}i:194509;a:1:{i:0;s:18:\"01#黑灰色红杆\";}i:194510;a:1:{i:0;s:18:\"02#深棕色红杆\";}i:194511;a:1:{i:0;s:18:\"03#灰棕色红杆\";}i:194512;a:1:{i:0;s:18:\"04#茶棕色红杆\";}i:194513;a:1:{i:0;s:4:\"2551\";}i:194514;a:1:{i:0;s:4:\"2521\";}i:194515;a:1:{i:0;s:4:\"2518\";}i:194516;a:1:{i:0;s:4:\"2519\";}i:194517;a:1:{i:0;s:4:\"2517\";}i:194518;a:1:{i:0;s:21:\"【一口袋礼物】\";}i:194519;a:1:{i:0;s:21:\"【神奇的袜子】\";}i:194520;a:1:{i:0;s:21:\"【吉祥的麋鹿】\";}i:194521;a:1:{i:0;s:9:\"咖啡色\";}i:194522;a:1:{i:0;s:6:\"浅灰\";}i:194523;a:1:{i:0;s:6:\"卡其\";}i:194524;a:1:{i:0;s:9:\"牛仔蓝\";}i:194525;a:1:{i:0;s:6:\"姜黄\";}i:194526;a:1:{i:0;s:6:\"焦糖\";}i:194527;a:1:{i:0;s:6:\"军绿\";}i:194528;a:1:{i:0;s:6:\"深灰\";}i:194529;a:1:{i:0;s:6:\"黑色\";}i:194530;a:1:{i:0;s:22:\"双杆【5色混搭】\";}i:194531;a:1:{i:0;s:22:\"恐龙【5色混搭】\";}i:194532;a:1:{i:0;s:22:\"猫咪【5色混搭】\";}i:194533;a:1:{i:0;s:22:\"英伦【5色混搭】\";}i:194534;a:1:{i:0;s:9:\"北欧米\";}i:194535;a:1:{i:0;s:9:\"北欧粉\";}i:194536;a:1:{i:0;s:9:\"北欧绿\";}i:194537;a:1:{i:0;s:9:\"北欧蓝\";}i:194538;a:1:{i:0;s:9:\"牛头绿\";}i:194539;a:1:{i:0;s:9:\"牛头咖\";}i:194540;a:1:{i:0;s:9:\"牛头粉\";}i:194541;a:1:{i:0;s:9:\"牛头灰\";}i:194542;a:1:{i:0;s:6:\"蓝色\";}i:194543;a:1:{i:0;s:6:\"粉色\";}i:194544;a:1:{i:0;s:6:\"灰色\";}}","ctime":null,"utime":1608085454,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"居家用品","products":[{"id":9343,"goods_id":1495,"barcode":null,"sn":"P6080853273995","price":"21.00","costprice":"19.88","mktprice":"0.00","marketable":2,"stock":163,"freeze_stock":0,"spes_desc":"颜色:橘黄+默认随机【共2双，指定搭配色请自行备注！】","is_defalut":1,"image_id":"4e0cc57bc548b53cb0c19222b0be79f2","isdel":null,"name":"2双 东北零下40°加绒保暖袜子加厚毛圈羊毛袜女","buy_limit":0,"bn":"G6080853273903","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080852135fd96edda6396.jpg","total_stock":163,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"橘黄+默认随机【共2双，指定搭配色请自行备注！】":{"name":"橘黄+默认随机【共2双，指定搭配色请自行备注！】","is_default":true},"黑+默认随机【共2双，指定搭配色请自行备注！】":{"name":"黑+默认随机【共2双，指定搭配色请自行备注！】","product_id":9344},"灰色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"灰色+默认随机【共2双，指定搭配色请自行备注！】","product_id":9345},"粉色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"粉色+默认随机【共2双，指定搭配色请自行备注！】","product_id":9346},"砖红+默认随机【共2双，指定搭配色请自行备注！】":{"name":"砖红+默认随机【共2双，指定搭配色请自行备注！】","product_id":9347}}},"amount":"21.00","promotion_list":[],"promotion_amount":0},{"id":9344,"goods_id":1495,"barcode":null,"sn":"P6080853274043","price":"21.00","costprice":"19.88","mktprice":"0.00","marketable":2,"stock":172,"freeze_stock":0,"spes_desc":"颜色:黑+默认随机【共2双，指定搭配色请自行备注！】","is_defalut":2,"image_id":"80b0caae52c2afd8b5f6eb6106ef3142","isdel":null,"name":"2双 东北零下40°加绒保暖袜子加厚毛圈羊毛袜女","buy_limit":0,"bn":"G6080853273903","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080852235fd96ee7d2dda.jpg","total_stock":172,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"橘黄+默认随机【共2双，指定搭配色请自行备注！】":{"name":"橘黄+默认随机【共2双，指定搭配色请自行备注！】","product_id":9343},"黑+默认随机【共2双，指定搭配色请自行备注！】":{"name":"黑+默认随机【共2双，指定搭配色请自行备注！】","is_default":true},"灰色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"灰色+默认随机【共2双，指定搭配色请自行备注！】","product_id":9345},"粉色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"粉色+默认随机【共2双，指定搭配色请自行备注！】","product_id":9346},"砖红+默认随机【共2双，指定搭配色请自行备注！】":{"name":"砖红+默认随机【共2双，指定搭配色请自行备注！】","product_id":9347}}},"amount":"21.00","promotion_list":[],"promotion_amount":0},{"id":9345,"goods_id":1495,"barcode":null,"sn":"P6080853274081","price":"21.00","costprice":"19.88","mktprice":"0.00","marketable":2,"stock":169,"freeze_stock":0,"spes_desc":"颜色:灰色+默认随机【共2双，指定搭配色请自行备注！】","is_defalut":2,"image_id":"c8bf342c2aebbfa2bf47dd8fb9449ccd","isdel":null,"name":"2双 东北零下40°加绒保暖袜子加厚毛圈羊毛袜女","buy_limit":0,"bn":"G6080853273903","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080852335fd96ef184879.jpg","total_stock":169,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"橘黄+默认随机【共2双，指定搭配色请自行备注！】":{"name":"橘黄+默认随机【共2双，指定搭配色请自行备注！】","product_id":9343},"黑+默认随机【共2双，指定搭配色请自行备注！】":{"name":"黑+默认随机【共2双，指定搭配色请自行备注！】","product_id":9344},"灰色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"灰色+默认随机【共2双，指定搭配色请自行备注！】","is_default":true},"粉色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"粉色+默认随机【共2双，指定搭配色请自行备注！】","product_id":9346},"砖红+默认随机【共2双，指定搭配色请自行备注！】":{"name":"砖红+默认随机【共2双，指定搭配色请自行备注！】","product_id":9347}}},"amount":"21.00","promotion_list":[],"promotion_amount":0},{"id":9346,"goods_id":1495,"barcode":null,"sn":"P6080853274112","price":"21.00","costprice":"19.88","mktprice":"0.00","marketable":2,"stock":171,"freeze_stock":0,"spes_desc":"颜色:粉色+默认随机【共2双，指定搭配色请自行备注！】","is_defalut":2,"image_id":"eaa6202c07960f488f2b5b463ecf897e","isdel":null,"name":"2双 东北零下40°加绒保暖袜子加厚毛圈羊毛袜女","buy_limit":0,"bn":"G6080853273903","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080852435fd96efb249f5.jpg","total_stock":171,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"橘黄+默认随机【共2双，指定搭配色请自行备注！】":{"name":"橘黄+默认随机【共2双，指定搭配色请自行备注！】","product_id":9343},"黑+默认随机【共2双，指定搭配色请自行备注！】":{"name":"黑+默认随机【共2双，指定搭配色请自行备注！】","product_id":9344},"灰色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"灰色+默认随机【共2双，指定搭配色请自行备注！】","product_id":9345},"粉色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"粉色+默认随机【共2双，指定搭配色请自行备注！】","is_default":true},"砖红+默认随机【共2双，指定搭配色请自行备注！】":{"name":"砖红+默认随机【共2双，指定搭配色请自行备注！】","product_id":9347}}},"amount":"21.00","promotion_list":[],"promotion_amount":0},{"id":9347,"goods_id":1495,"barcode":null,"sn":"P6080853274151","price":"21.00","costprice":"19.88","mktprice":"0.00","marketable":2,"stock":166,"freeze_stock":0,"spes_desc":"颜色:砖红+默认随机【共2双，指定搭配色请自行备注！】","is_defalut":2,"image_id":"6ea47205280e8aff63ccb19f1ea60b25","isdel":null,"name":"2双 东北零下40°加绒保暖袜子加厚毛圈羊毛袜女","buy_limit":0,"bn":"G6080853273903","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080852535fd96f054a7a8.jpg","total_stock":166,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"橘黄+默认随机【共2双，指定搭配色请自行备注！】":{"name":"橘黄+默认随机【共2双，指定搭配色请自行备注！】","product_id":9343},"黑+默认随机【共2双，指定搭配色请自行备注！】":{"name":"黑+默认随机【共2双，指定搭配色请自行备注！】","product_id":9344},"灰色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"灰色+默认随机【共2双，指定搭配色请自行备注！】","product_id":9345},"粉色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"粉色+默认随机【共2双，指定搭配色请自行备注！】","product_id":9346},"砖红+默认随机【共2双，指定搭配色请自行备注！】":{"name":"砖红+默认随机【共2双，指定搭配色请自行备注！】","is_default":true}}},"amount":"21.00","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080851435fd96e97cad9d.jpg","default":{"id":9343,"goods_id":1495,"barcode":null,"sn":"P6080853273995","price":"21.00","costprice":"19.88","mktprice":"0.00","marketable":2,"stock":163,"freeze_stock":0,"spes_desc":"颜色:橘黄+默认随机【共2双，指定搭配色请自行备注！】","is_defalut":1,"image_id":"4e0cc57bc548b53cb0c19222b0be79f2","isdel":null,"name":"2双 东北零下40°加绒保暖袜子加厚毛圈羊毛袜女","buy_limit":0,"bn":"G6080853273903","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080852135fd96edda6396.jpg","total_stock":163,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"橘黄+默认随机【共2双，指定搭配色请自行备注！】":{"name":"橘黄+默认随机【共2双，指定搭配色请自行备注！】","is_default":true},"黑+默认随机【共2双，指定搭配色请自行备注！】":{"name":"黑+默认随机【共2双，指定搭配色请自行备注！】","product_id":9344},"灰色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"灰色+默认随机【共2双，指定搭配色请自行备注！】","product_id":9345},"粉色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"粉色+默认随机【共2双，指定搭配色请自行备注！】","product_id":9346},"砖红+默认随机【共2双，指定搭配色请自行备注！】":{"name":"砖红+默认随机【共2双，指定搭配色请自行备注！】","product_id":9347}}},"amount":"21.00","promotion_list":[],"promotion_amount":0},"product":{"id":9343,"goods_id":1495,"barcode":null,"sn":"P6080853273995","price":"21.00","costprice":"19.88","mktprice":"0.00","marketable":2,"stock":163,"spes_desc":"颜色:橘黄+默认随机【共2双，指定搭配色请自行备注！】","is_defalut":1,"image_id":"4e0cc57bc548b53cb0c19222b0be79f2","isdel":null,"name":"2双 东北零下40°加绒保暖袜子加厚毛圈羊毛袜女","buy_limit":0,"bn":"G6080853273903","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16080852135fd96edda6396.jpg","total_stock":163,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"橘黄+默认随机【共2双，指定搭配色请自行备注！】":{"name":"橘黄+默认随机【共2双，指定搭配色请自行备注！】","is_default":true},"黑+默认随机【共2双，指定搭配色请自行备注！】":{"name":"黑+默认随机【共2双，指定搭配色请自行备注！】","product_id":9344},"灰色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"灰色+默认随机【共2双，指定搭配色请自行备注！】","product_id":9345},"粉色+默认随机【共2双，指定搭配色请自行备注！】":{"name":"粉色+默认随机【共2双，指定搭配色请自行备注！】","product_id":9346},"砖红+默认随机【共2双，指定搭配色请自行备注！】":{"name":"砖红+默认随机【共2双，指定搭配色请自行备注！】","product_id":9347}}},"amount":"21.00","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/16/16080851435fd96e97cad9d.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16080851435fd96e97b4462.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16080851435fd96e97c1bea.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16080851435fd96e97da061.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/16/16080851435fd96e97e4405.jpg"],"total_stock":841,"is_buy_num":21,"isfav":"false","can_buy":"ok","vip_price":21,"is_notice":0},{"id":1494,"bn":"G6080213972163","name":"10对 圣诞节鹿角发夹女韩国ins网红简约小麋鹿发卡","brief":"不免邮区域:海外,台湾,澳门\n,香港,西藏,新疆,宁夏,青海,内蒙古","price":"13.80","costprice":"12.80","mktprice":"0.00","image_id":"35dac65b7e5cee1897baf40aa155ea18","goods_cat_id":131,"goods_type_id":92,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":299,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080213835fd87587adad9.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080213835fd875870b04b.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080213825fd8758700e96.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080213845fd875885b5c0.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080213845fd87588cd355.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080213855fd8758916d02.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080213865fd8758a37277.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080213855fd8758988606.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080213865fd8758aa7bb9.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080192945fd86d5e4cd86.png\" alt=\"16080192945fd86d5e4cd86.png\"/><\/p>","spes_desc":{"颜色":{"195065":"圣诞发卡2对【款式随机，介意者慎拍！】","195071":"圣诞发卡10对【款式随机，介意者慎拍】"}},"params":"","service":"1,4,6,7","comments_count":0,"view_count":0,"buy_count":27,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":1,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:44:{i:195064;a:1:{i:0;s:6:\"白色\";}i:195065;a:1:{i:0;s:55:\"圣诞发卡2对【款式随机，介意者慎拍！】\";}i:195066;a:1:{i:0;s:68:\"橘黄+默认随机【共2双，指定搭配色请自行备注！】\";}i:195067;a:1:{i:0;s:65:\"黑+默认随机【共2双，指定搭配色请自行备注！】\";}i:195068;a:1:{i:0;s:68:\"灰色+默认随机【共2双，指定搭配色请自行备注！】\";}i:195069;a:1:{i:0;s:68:\"粉色+默认随机【共2双，指定搭配色请自行备注！】\";}i:195070;a:1:{i:0;s:68:\"砖红+默认随机【共2双，指定搭配色请自行备注！】\";}i:195071;a:1:{i:0;s:53:\"圣诞发卡10对【款式随机，介意者慎拍】\";}i:195072;a:1:{i:0;s:18:\"01#黑灰色红杆\";}i:195073;a:1:{i:0;s:18:\"02#深棕色红杆\";}i:195074;a:1:{i:0;s:18:\"03#灰棕色红杆\";}i:195075;a:1:{i:0;s:18:\"04#茶棕色红杆\";}i:195076;a:1:{i:0;s:4:\"2551\";}i:195077;a:1:{i:0;s:4:\"2521\";}i:195078;a:1:{i:0;s:4:\"2518\";}i:195079;a:1:{i:0;s:4:\"2519\";}i:195080;a:1:{i:0;s:4:\"2517\";}i:195081;a:1:{i:0;s:21:\"【一口袋礼物】\";}i:195082;a:1:{i:0;s:21:\"【神奇的袜子】\";}i:195083;a:1:{i:0;s:21:\"【吉祥的麋鹿】\";}i:195084;a:1:{i:0;s:9:\"咖啡色\";}i:195085;a:1:{i:0;s:6:\"浅灰\";}i:195086;a:1:{i:0;s:6:\"卡其\";}i:195087;a:1:{i:0;s:9:\"牛仔蓝\";}i:195088;a:1:{i:0;s:6:\"姜黄\";}i:195089;a:1:{i:0;s:6:\"焦糖\";}i:195090;a:1:{i:0;s:6:\"军绿\";}i:195091;a:1:{i:0;s:6:\"深灰\";}i:195092;a:1:{i:0;s:6:\"黑色\";}i:195093;a:1:{i:0;s:22:\"双杆【5色混搭】\";}i:195094;a:1:{i:0;s:22:\"恐龙【5色混搭】\";}i:195095;a:1:{i:0;s:22:\"猫咪【5色混搭】\";}i:195096;a:1:{i:0;s:22:\"英伦【5色混搭】\";}i:195097;a:1:{i:0;s:9:\"北欧米\";}i:195098;a:1:{i:0;s:9:\"北欧粉\";}i:195099;a:1:{i:0;s:9:\"北欧绿\";}i:195100;a:1:{i:0;s:9:\"北欧蓝\";}i:195101;a:1:{i:0;s:9:\"牛头绿\";}i:195102;a:1:{i:0;s:9:\"牛头咖\";}i:195103;a:1:{i:0;s:9:\"牛头粉\";}i:195104;a:1:{i:0;s:9:\"牛头灰\";}i:195105;a:1:{i:0;s:6:\"蓝色\";}i:195106;a:1:{i:0;s:6:\"粉色\";}i:195107;a:1:{i:0;s:6:\"灰色\";}}","ctime":null,"utime":1608112627,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"头饰","products":[{"id":9342,"goods_id":1494,"barcode":null,"sn":"P6080213972224","price":"43.00","costprice":"39.80","mktprice":"0.00","marketable":1,"stock":163,"freeze_stock":0,"spes_desc":"颜色:圣诞发卡10对【款式随机，介意者慎拍】","is_defalut":2,"image_id":"40cf2d2607701c5167bb0e65768cb46b","isdel":null,"name":"10对 圣诞节鹿角发夹女韩国ins网红简约小麋鹿发卡","buy_limit":0,"bn":"G6080213972163","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080213495fd875657444e.jpg","total_stock":163,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞发卡2对【款式随机，介意者慎拍！】":{"name":"圣诞发卡2对【款式随机，介意者慎拍！】","product_id":9353},"圣诞发卡10对【款式随机，介意者慎拍】":{"name":"圣诞发卡10对【款式随机，介意者慎拍】","is_default":true}}},"amount":"43.00","promotion_list":[],"promotion_amount":0},{"id":9353,"goods_id":1494,"barcode":null,"sn":"P6081126272601","price":"13.80","costprice":"12.80","mktprice":"0.00","marketable":1,"stock":136,"freeze_stock":0,"spes_desc":"颜色:圣诞发卡2对【款式随机，介意者慎拍！】","is_defalut":1,"image_id":"bf2026b14ad9b3180f65c702623094a4","isdel":null,"name":"10对 圣诞节鹿角发夹女韩国ins网红简约小麋鹿发卡","buy_limit":0,"bn":"G6080213972163","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081119165fd9d72cad40f.png","total_stock":136,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞发卡2对【款式随机，介意者慎拍！】":{"name":"圣诞发卡2对【款式随机，介意者慎拍！】","is_default":true},"圣诞发卡10对【款式随机，介意者慎拍】":{"name":"圣诞发卡10对【款式随机，介意者慎拍】","product_id":9342}}},"amount":"13.80","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080212705fd8751644b47.jpg","default":{"id":9342,"goods_id":1494,"barcode":null,"sn":"P6080213972224","price":"43.00","costprice":"39.80","mktprice":"0.00","marketable":1,"stock":163,"freeze_stock":0,"spes_desc":"颜色:圣诞发卡10对【款式随机，介意者慎拍】","is_defalut":2,"image_id":"40cf2d2607701c5167bb0e65768cb46b","isdel":null,"name":"10对 圣诞节鹿角发夹女韩国ins网红简约小麋鹿发卡","buy_limit":0,"bn":"G6080213972163","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080213495fd875657444e.jpg","total_stock":163,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞发卡2对【款式随机，介意者慎拍！】":{"name":"圣诞发卡2对【款式随机，介意者慎拍！】","product_id":9353},"圣诞发卡10对【款式随机，介意者慎拍】":{"name":"圣诞发卡10对【款式随机，介意者慎拍】","is_default":true}}},"amount":"43.00","promotion_list":[],"promotion_amount":0},"product":{"id":9353,"goods_id":1494,"barcode":null,"sn":"P6081126272601","price":"13.80","costprice":"12.80","mktprice":"0.00","marketable":1,"stock":136,"spes_desc":"颜色:圣诞发卡2对【款式随机，介意者慎拍！】","is_defalut":1,"image_id":"bf2026b14ad9b3180f65c702623094a4","isdel":null,"name":"10对 圣诞节鹿角发夹女韩国ins网红简约小麋鹿发卡","buy_limit":0,"bn":"G6080213972163","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/16/16081119165fd9d72cad40f.png","total_stock":136,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞发卡2对【款式随机，介意者慎拍！】":{"name":"圣诞发卡2对【款式随机，介意者慎拍！】","is_default":true},"圣诞发卡10对【款式随机，介意者慎拍】":{"name":"圣诞发卡10对【款式随机，介意者慎拍】","product_id":9342}}},"amount":"13.80","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/15/16080212705fd8751644b47.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080212705fd8751673cd5.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080212705fd875167d2bb.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080212815fd875218d523.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080212815fd875217c90d.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080212815fd8752185456.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080212815fd87521a347d.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080212705fd875162df15.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080212705fd875163c003.jpg"],"total_stock":299,"is_buy_num":27,"isfav":"false","can_buy":"ok","vip_price":13.8,"is_notice":0},{"id":1491,"bn":"G6080142664775","name":"凉温两用石墨烯遮光旅行睡眠眼罩","brief":"","price":"11.80","costprice":"10.50","mktprice":"0.00","image_id":"ecbca1c20a2a4717cac72fc954f0edd0","goods_cat_id":135,"goods_type_id":88,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":488,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'>全国包邮，除部分地区包括内蒙古,甘肃,宁夏，海南，青海，西藏，新疆等地区需另加邮费，下单请联系客服。<\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080143155fd859eb0cdcb.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080143155fd859eb1623a.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080143155fd859eb1f76c.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080143155fd859eb2fb79.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080143155fd859eb3a24c.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080143155fd859eb44a0c.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080143155fd859eb52241.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080143155fd859eb5c905.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080143155fd859eb66960.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080143155fd859eb77dfc.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080143155fd859eb87e18.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080143155fd859eb91b66.png\"/><\/p><p style='overflow:hidden'><br/><\/p><p style='overflow:hidden'><br/><\/p>","spes_desc":{"颜色":{"193940":"凉感泰坦紫/温感胭脂粉","193941":"凉感橡牙棕/温感活力橙","193942":"凉感深空灰/温感商务灰","193943":"凉感浅灰蓝/温感藕粉色","193944":"凉感中国红/温感酒红"}},"params":"","service":"1,4,6","comments_count":0,"view_count":0,"buy_count":12,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":2,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:183:{i:193939;a:1:{i:0;s:40:\"牛仔蓝+紫色+咖啡色+姜黄+绿色\";}i:193940;a:1:{i:0;s:31:\"凉感泰坦紫/温感胭脂粉\";}i:193941;a:1:{i:0;s:31:\"凉感橡牙棕/温感活力橙\";}i:193942;a:1:{i:0;s:31:\"凉感深空灰/温感商务灰\";}i:193943;a:1:{i:0;s:31:\"凉感浅灰蓝/温感藕粉色\";}i:193944;a:1:{i:0;s:28:\"凉感中国红/温感酒红\";}i:193945;a:1:{i:0;s:18:\"圣诞麋鹿1000ml\";}i:193946;a:1:{i:0;s:21:\"橘色长脚鹿1000ml\";}i:193947;a:1:{i:0;s:12:\"驯鹿1000ml\";}i:193948;a:1:{i:0;s:15:\"鹿宝宝1000ml\";}i:193949;a:1:{i:0;s:21:\"红底围巾熊1000ml\";}i:193950;a:1:{i:0;s:18:\"蓝博士熊1000ml\";}i:193951;a:1:{i:0;s:21:\"灰蓝猫头鹰1000ml\";}i:193952;a:1:{i:0;s:15:\"独角兽1000ml\";}i:193953;a:1:{i:0;s:24:\"法兰绒粉爱心1000ml\";}i:193954;a:1:{i:0;s:24:\"法兰绒灰爱心1000ml\";}i:193955;a:1:{i:0;s:18:\"溜冰企鹅1000ml\";}i:193956;a:1:{i:0;s:18:\"粉猫头鹰1000ml\";}i:193957;a:1:{i:0;s:18:\"红色小鹿1000ml\";}i:193958;a:1:{i:0;s:15:\"蓝企鹅1000ml\";}i:193959;a:1:{i:0;s:15:\"鹿宝宝2000ml\";}i:193960;a:1:{i:0;s:12:\"驯鹿2000ml\";}i:193961;a:1:{i:0;s:18:\"紫丁香鹿2000ml\";}i:193962;a:1:{i:0;s:15:\"抱心熊2000ml\";}i:193963;a:1:{i:0;s:15:\"独角兽2000ml\";}i:193964;a:1:{i:0;s:24:\"插手款粉猫咪2000ml\";}i:193965;a:1:{i:0;s:24:\"插手款粉小猪2000ml\";}i:193966;a:1:{i:0;s:21:\"灰蓝猫头鹰2000ml\";}i:193967;a:1:{i:0;s:21:\"黄底可爱狗2000ml\";}i:193968;a:1:{i:0;s:15:\"蓝企鹅2000ml\";}i:193969;a:1:{i:0;s:18:\"咖色小熊围巾\";}i:193970;a:1:{i:0;s:18:\"米色小熊围巾\";}i:193971;a:1:{i:0;s:18:\"灰色小熊围巾\";}i:193972;a:1:{i:0;s:18:\"白色小熊围巾\";}i:193973;a:1:{i:0;s:25:\"四叉眉笔1号浅棕色\";}i:193974;a:1:{i:0;s:25:\"四叉眉笔2号深棕色\";}i:193975;a:1:{i:0;s:25:\"四叉眉笔3号红棕色\";}i:193976;a:1:{i:0;s:25:\"四叉眉笔4号灰棕色\";}i:193977;a:1:{i:0;s:22:\"四叉眉笔5号黑色\";}i:193978;a:1:{i:0;s:16:\"双头1号黑色\";}i:193979;a:1:{i:0;s:19:\"双头2号亚麻色\";}i:193980;a:1:{i:0;s:19:\"双头3号浅咖色\";}i:193981;a:1:{i:0;s:16:\"双头4号灰色\";}i:193982;a:1:{i:0;s:16:\"双头5号深咖\";}i:193983;a:1:{i:0;s:16:\"双头6号棕色\";}i:193984;a:1:{i:0;s:11:\"B2045黑色\";}i:193985;a:1:{i:0;s:11:\"B2045灰色\";}i:193986;a:1:{i:0;s:11:\"B2045褐色\";}i:193987;a:1:{i:0;s:14:\"B2045灰棕色\";}i:193988;a:1:{i:0;s:14:\"B2045浅咖色\";}i:193989;a:1:{i:0;s:14:\"B2045深咖色\";}i:193990;a:1:{i:0;s:11:\"B2045棕色\";}i:193991;a:1:{i:0;s:15:\"小奥丁黑色\";}i:193992;a:1:{i:0;s:18:\"小奥丁浅咖色\";}i:193993;a:1:{i:0;s:18:\"小奥丁咖啡色\";}i:193994;a:1:{i:0;s:15:\"小奥丁灰色\";}i:193995;a:1:{i:0;s:18:\"小奥丁深咖色\";}i:193996;a:1:{i:0;s:13:\"纯真黑+白\";}i:193997;a:1:{i:0;s:10:\"海洋蓝A\";}i:193998;a:1:{i:0;s:10:\"海洋蓝B\";}i:193999;a:1:{i:0;s:13:\"深空灰+蓝\";}i:194000;a:1:{i:0;s:13:\"象牙白+蓝\";}i:194001;a:1:{i:0;s:13:\"樱花粉+白\";}i:194002;a:1:{i:0;s:9:\"冰川白\";}i:194003;a:1:{i:0;s:9:\"幻影黑\";}i:194004;a:1:{i:0;s:9:\"深空灰\";}i:194005;a:1:{i:0;s:15:\"粉色充电款\";}i:194006;a:1:{i:0;s:25:\"2双纯色款（0-5岁）\";}i:194007;a:1:{i:0;s:28:\"2双绣花鸭梨（5-8岁）\";}i:194008;a:1:{i:0;s:28:\"2双我爱妈咪（0-5岁）\";}i:194009;a:1:{i:0;s:28:\"2双绣花狗狗（0-5岁）\";}i:194010;a:1:{i:0;s:28:\"2双猫咪系列（0-5岁）\";}i:194011;a:1:{i:0;s:25:\"2双小恐龙（0-5岁）\";}i:194012;a:1:{i:0;s:22:\"2双小熊（0-5岁）\";}i:194013;a:1:{i:0;s:25:\"2双热气球（0-5岁）\";}i:194014;a:1:{i:0;s:28:\"2双长腰猫咪（0-5岁）\";}i:194015;a:1:{i:0;s:20:\"2双M标（5-8岁）\";}i:194016;a:1:{i:0;s:25:\"2双奶牛款（0-5岁）\";}i:194017;a:1:{i:0;s:25:\"2双帽子猪（5-8岁）\";}i:194018;a:1:{i:0;s:25:\"2双雏菊款（0-5岁）\";}i:194019;a:1:{i:0;s:21:\"2双YOUME（0-5岁）\";}i:194020;a:1:{i:0;s:25:\"2双松鼠款（0-5岁）\";}i:194021;a:1:{i:0;s:25:\"2双爱心款（0-5岁）\";}i:194022;a:1:{i:0;s:25:\"2双王冠猪（5-8岁）\";}i:194023;a:1:{i:0;s:14:\"01反叛天真\";}i:194024;a:1:{i:0;s:14:\"02离谱可爱\";}i:194025;a:1:{i:0;s:14:\"03确实很酷\";}i:194026;a:1:{i:0;s:14:\"04天生有趣\";}i:194027;a:1:{i:0;s:12:\"05女团c位\";}i:194028;a:1:{i:0;s:14:\"06碳酸少女\";}i:194029;a:1:{i:0;s:13:\"2个北欧粉\";}i:194030;a:1:{i:0;s:13:\"2个北欧蓝\";}i:194031;a:1:{i:0;s:13:\"2个北欧绿\";}i:194032;a:1:{i:0;s:13:\"2个北欧米\";}i:194033;a:1:{i:0;s:13:\"2个北欧灰\";}i:194034;a:1:{i:0;s:19:\"2个双色雅灰粉\";}i:194035;a:1:{i:0;s:19:\"2个双色雅灰蓝\";}i:194036;a:1:{i:0;s:19:\"2个双色雅灰绿\";}i:194037;a:1:{i:0;s:19:\"2个双色雅灰米\";}i:194038;a:1:{i:0;s:34:\"2个【手提款】双色雅灰粉\";}i:194039;a:1:{i:0;s:34:\"2个【手提款】双色雅灰蓝\";}i:194040;a:1:{i:0;s:34:\"2个【手提款】双色雅灰绿\";}i:194041;a:1:{i:0;s:34:\"2个【手提款】双色雅灰米\";}i:194042;a:1:{i:0;s:52:\"2个无手提款（颜色可备注，默认随机）\";}i:194043;a:1:{i:0;s:49:\"2个手提款（颜色可备注，默认随机）\";}i:194044;a:1:{i:0;s:24:\"黑色（一年保修）\";}i:194045;a:1:{i:0;s:12:\"短筒黑色\";}i:194046;a:1:{i:0;s:18:\"短筒巧克力色\";}i:194047;a:1:{i:0;s:12:\"短筒灰色\";}i:194048;a:1:{i:0;s:12:\"短筒栗色\";}i:194049;a:1:{i:0;s:15:\"短筒暮粉色\";}i:194050;a:1:{i:0;s:15:\"短筒奶茶色\";}i:194051;a:1:{i:0;s:15:\"皮带扣黑色\";}i:194052;a:1:{i:0;s:21:\"皮带扣巧克力色\";}i:194053;a:1:{i:0;s:15:\"皮带扣灰色\";}i:194054;a:1:{i:0;s:15:\"皮带扣栗色\";}i:194055;a:1:{i:0;s:18:\"硅胶版索菲蓝\";}i:194056;a:1:{i:0;s:18:\"硅胶版樱柠粉\";}i:194057;a:1:{i:0;s:18:\"硅胶版校园蓝\";}i:194058;a:1:{i:0;s:18:\"硅胶版校园粉\";}i:194059;a:1:{i:0;s:18:\"无硅胶校园蓝\";}i:194060;a:1:{i:0;s:18:\"无硅胶校园粉\";}i:194061;a:1:{i:0;s:14:\"01怦然心动\";}i:194062;a:1:{i:0;s:14:\"02冰河时代\";}i:194063;a:1:{i:0;s:14:\"03金色琉璃\";}i:194064;a:1:{i:0;s:14:\"04海王星辰\";}i:194065;a:1:{i:0;s:15:\"黄色加内里\";}i:194066;a:1:{i:0;s:15:\"粉色加内里\";}i:194067;a:1:{i:0;s:18:\"咖啡色加内里\";}i:194068;a:1:{i:0;s:15:\"红色加内里\";}i:194069;a:1:{i:0;s:15:\"米色加内里\";}i:194070;a:1:{i:0;s:12:\"黄色鹿角\";}i:194071;a:1:{i:0;s:12:\"绿色鹿角\";}i:194072;a:1:{i:0;s:15:\"咖啡色鹿角\";}i:194073;a:1:{i:0;s:12:\"粉色鹿角\";}i:194074;a:1:{i:0;s:12:\"红色鹿角\";}i:194075;a:1:{i:0;s:18:\"绿色青蛙单层\";}i:194076;a:1:{i:0;s:18:\"红色青蛙单层\";}i:194077;a:1:{i:0;s:18:\"黄色青蛙单层\";}i:194078;a:1:{i:0;s:18:\"米色青蛙单层\";}i:194079;a:1:{i:0;s:21:\"咖啡色青蛙单层\";}i:194080;a:1:{i:0;s:18:\"绿色青蛙加绒\";}i:194081;a:1:{i:0;s:21:\"咖啡色青蛙加绒\";}i:194082;a:1:{i:0;s:18:\"红色青蛙加绒\";}i:194083;a:1:{i:0;s:18:\"黄色青蛙加绒\";}i:194084;a:1:{i:0;s:18:\"米色青蛙加绒\";}i:194085;a:1:{i:0;s:12:\"玻璃糖纸\";}i:194086;a:1:{i:0;s:9:\"小星钻\";}i:194087;a:1:{i:0;s:9:\"金水晶\";}i:194088;a:1:{i:0;s:9:\"香芋紫\";}i:194089;a:1:{i:0;s:9:\"青草绿\";}i:194090;a:1:{i:0;s:9:\"赤陶红\";}i:194091;a:1:{i:0;s:9:\"树莓色\";}i:194092;a:1:{i:0;s:9:\"蓝灰色\";}i:194093;a:1:{i:0;s:9:\"蜜糖棕\";}i:194094;a:1:{i:0;s:9:\"黑色男\";}i:194095;a:1:{i:0;s:9:\"深灰男\";}i:194096;a:1:{i:0;s:9:\"浅灰男\";}i:194097;a:1:{i:0;s:9:\"酒红男\";}i:194098;a:1:{i:0;s:9:\"藏青男\";}i:194099;a:1:{i:0;s:9:\"黑色女\";}i:194100;a:1:{i:0;s:9:\"卡其女\";}i:194101;a:1:{i:0;s:9:\"藕紫女\";}i:194102;a:1:{i:0;s:9:\"粉色女\";}i:194103;a:1:{i:0;s:9:\"紫红女\";}i:194104;a:1:{i:0;s:39:\"黑红色+金属篮+加强杆+塑料盘\";}i:194105;a:1:{i:0;s:42:\"黑红色+金属篮+加强杆+不锈钢盘\";}i:194106;a:1:{i:0;s:10:\"3双黑色\";}i:194107;a:1:{i:0;s:13:\"3双咖啡色\";}i:194108;a:1:{i:0;s:10:\"3双灰色\";}i:194109;a:1:{i:0;s:13:\"3双卡其色\";}i:194110;a:1:{i:0;s:13:\"3双深灰色\";}i:194111;a:1:{i:0;s:31:\"3双混色（颜色可备注）\";}i:194112;a:1:{i:0;s:28:\"蓝球发白光（4英寸）\";}i:194113;a:1:{i:0;s:28:\"金球发白光（4英寸）\";}i:194114;a:1:{i:0;s:31:\"蓝球发变色光（4英寸）\";}i:194115;a:1:{i:0;s:31:\"米白球发白光（4英寸）\";}i:194116;a:1:{i:0;s:15:\"灰色标准杆\";}i:194117;a:1:{i:0;s:24:\"灰色可伸缩加强杆\";}i:194118;a:1:{i:0;s:28:\"灰色伸缩杆+清洁小桶\";}i:194119;a:1:{i:0;s:37:\"黑色+白色+灰色+橘色+枚红色\";}i:194120;a:1:{i:0;s:37:\"灰色+蓝色+紫色+玫红+姜黄色\";}i:194121;a:1:{i:0;s:45:\"5双自选颜色（10色可选，请备注）\";}}","ctime":null,"utime":1608112496,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"居家用品","products":[{"id":9335,"goods_id":1491,"barcode":null,"sn":"P6080142664845","price":"11.80","costprice":"10.50","mktprice":"0.00","marketable":1,"stock":97,"freeze_stock":0,"spes_desc":"颜色:凉感泰坦紫/温感胭脂粉","is_defalut":1,"image_id":"717537488d9b36c83fe1e3446ae7bc61","isdel":null,"name":"凉温两用石墨烯遮光旅行睡眠眼罩","buy_limit":0,"bn":"G6080142664775","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080142015fd859796da5c.jpg","total_stock":97,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"凉感泰坦紫/温感胭脂粉":{"name":"凉感泰坦紫/温感胭脂粉","is_default":true},"凉感橡牙棕/温感活力橙":{"name":"凉感橡牙棕/温感活力橙","product_id":9336},"凉感深空灰/温感商务灰":{"name":"凉感深空灰/温感商务灰","product_id":9337},"凉感浅灰蓝/温感藕粉色":{"name":"凉感浅灰蓝/温感藕粉色","product_id":9338},"凉感中国红/温感酒红":{"name":"凉感中国红/温感酒红","product_id":9339}}},"amount":"11.80","promotion_list":[],"promotion_amount":0},{"id":9336,"goods_id":1491,"barcode":null,"sn":"P6080142664895","price":"11.80","costprice":"10.50","mktprice":"0.00","marketable":1,"stock":99,"freeze_stock":0,"spes_desc":"颜色:凉感橡牙棕/温感活力橙","is_defalut":2,"image_id":"7ca696a272732fb005e19e881651292a","isdel":null,"name":"凉温两用石墨烯遮光旅行睡眠眼罩","buy_limit":0,"bn":"G6080142664775","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080142085fd859808ca64.jpg","total_stock":99,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"凉感泰坦紫/温感胭脂粉":{"name":"凉感泰坦紫/温感胭脂粉","product_id":9335},"凉感橡牙棕/温感活力橙":{"name":"凉感橡牙棕/温感活力橙","is_default":true},"凉感深空灰/温感商务灰":{"name":"凉感深空灰/温感商务灰","product_id":9337},"凉感浅灰蓝/温感藕粉色":{"name":"凉感浅灰蓝/温感藕粉色","product_id":9338},"凉感中国红/温感酒红":{"name":"凉感中国红/温感酒红","product_id":9339}}},"amount":"11.80","promotion_list":[],"promotion_amount":0},{"id":9337,"goods_id":1491,"barcode":null,"sn":"P6080142664923","price":"11.80","costprice":"10.50","mktprice":"0.00","marketable":1,"stock":95,"freeze_stock":0,"spes_desc":"颜色:凉感深空灰/温感商务灰","is_defalut":2,"image_id":"eaddbbdd89535fe5662936de924b4834","isdel":null,"name":"凉温两用石墨烯遮光旅行睡眠眼罩","buy_limit":0,"bn":"G6080142664775","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080142155fd85987d1d9b.jpg","total_stock":95,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"凉感泰坦紫/温感胭脂粉":{"name":"凉感泰坦紫/温感胭脂粉","product_id":9335},"凉感橡牙棕/温感活力橙":{"name":"凉感橡牙棕/温感活力橙","product_id":9336},"凉感深空灰/温感商务灰":{"name":"凉感深空灰/温感商务灰","is_default":true},"凉感浅灰蓝/温感藕粉色":{"name":"凉感浅灰蓝/温感藕粉色","product_id":9338},"凉感中国红/温感酒红":{"name":"凉感中国红/温感酒红","product_id":9339}}},"amount":"11.80","promotion_list":[],"promotion_amount":0},{"id":9338,"goods_id":1491,"barcode":null,"sn":"P6080142664951","price":"11.80","costprice":"10.50","mktprice":"0.00","marketable":1,"stock":98,"freeze_stock":0,"spes_desc":"颜色:凉感浅灰蓝/温感藕粉色","is_defalut":2,"image_id":"4384b9a64ba8d7340821de6754e70db6","isdel":null,"name":"凉温两用石墨烯遮光旅行睡眠眼罩","buy_limit":0,"bn":"G6080142664775","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080142225fd8598e5549e.jpg","total_stock":98,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"凉感泰坦紫/温感胭脂粉":{"name":"凉感泰坦紫/温感胭脂粉","product_id":9335},"凉感橡牙棕/温感活力橙":{"name":"凉感橡牙棕/温感活力橙","product_id":9336},"凉感深空灰/温感商务灰":{"name":"凉感深空灰/温感商务灰","product_id":9337},"凉感浅灰蓝/温感藕粉色":{"name":"凉感浅灰蓝/温感藕粉色","is_default":true},"凉感中国红/温感酒红":{"name":"凉感中国红/温感酒红","product_id":9339}}},"amount":"11.80","promotion_list":[],"promotion_amount":0},{"id":9339,"goods_id":1491,"barcode":null,"sn":"P6080142664982","price":"11.80","costprice":"10.50","mktprice":"0.00","marketable":1,"stock":99,"freeze_stock":0,"spes_desc":"颜色:凉感中国红/温感酒红","is_defalut":2,"image_id":"a1e1e1407d206f75e2204b129360c46c","isdel":null,"name":"凉温两用石墨烯遮光旅行睡眠眼罩","buy_limit":0,"bn":"G6080142664775","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080142415fd859a1aac83.jpg","total_stock":99,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"凉感泰坦紫/温感胭脂粉":{"name":"凉感泰坦紫/温感胭脂粉","product_id":9335},"凉感橡牙棕/温感活力橙":{"name":"凉感橡牙棕/温感活力橙","product_id":9336},"凉感深空灰/温感商务灰":{"name":"凉感深空灰/温感商务灰","product_id":9337},"凉感浅灰蓝/温感藕粉色":{"name":"凉感浅灰蓝/温感藕粉色","product_id":9338},"凉感中国红/温感酒红":{"name":"凉感中国红/温感酒红","is_default":true}}},"amount":"11.80","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080141715fd8595b023ef.jpg","default":{"id":9335,"goods_id":1491,"barcode":null,"sn":"P6080142664845","price":"11.80","costprice":"10.50","mktprice":"0.00","marketable":1,"stock":97,"freeze_stock":0,"spes_desc":"颜色:凉感泰坦紫/温感胭脂粉","is_defalut":1,"image_id":"717537488d9b36c83fe1e3446ae7bc61","isdel":null,"name":"凉温两用石墨烯遮光旅行睡眠眼罩","buy_limit":0,"bn":"G6080142664775","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080142015fd859796da5c.jpg","total_stock":97,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"凉感泰坦紫/温感胭脂粉":{"name":"凉感泰坦紫/温感胭脂粉","is_default":true},"凉感橡牙棕/温感活力橙":{"name":"凉感橡牙棕/温感活力橙","product_id":9336},"凉感深空灰/温感商务灰":{"name":"凉感深空灰/温感商务灰","product_id":9337},"凉感浅灰蓝/温感藕粉色":{"name":"凉感浅灰蓝/温感藕粉色","product_id":9338},"凉感中国红/温感酒红":{"name":"凉感中国红/温感酒红","product_id":9339}}},"amount":"11.80","promotion_list":[],"promotion_amount":0},"product":{"id":9335,"goods_id":1491,"barcode":null,"sn":"P6080142664845","price":"11.80","costprice":"10.50","mktprice":"0.00","marketable":1,"stock":97,"spes_desc":"颜色:凉感泰坦紫/温感胭脂粉","is_defalut":1,"image_id":"717537488d9b36c83fe1e3446ae7bc61","isdel":null,"name":"凉温两用石墨烯遮光旅行睡眠眼罩","buy_limit":0,"bn":"G6080142664775","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080142015fd859796da5c.jpg","total_stock":97,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"凉感泰坦紫/温感胭脂粉":{"name":"凉感泰坦紫/温感胭脂粉","is_default":true},"凉感橡牙棕/温感活力橙":{"name":"凉感橡牙棕/温感活力橙","product_id":9336},"凉感深空灰/温感商务灰":{"name":"凉感深空灰/温感商务灰","product_id":9337},"凉感浅灰蓝/温感藕粉色":{"name":"凉感浅灰蓝/温感藕粉色","product_id":9338},"凉感中国红/温感酒红":{"name":"凉感中国红/温感酒红","product_id":9339}}},"amount":"11.80","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/15/16080141715fd8595b023ef.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080141705fd8595ac8628.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080141705fd8595aea82d.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080141715fd8595b0c3d4.jpg"],"total_stock":488,"is_buy_num":12,"isfav":"false","can_buy":"ok","vip_price":11.8,"is_notice":0},{"id":1489,"bn":"G6080118335930","name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","brief":"","price":"15.80","costprice":"13.80","mktprice":"0.00","image_id":"cd5aacb90fc26b27fc7ecde7ccc36403","goods_cat_id":135,"goods_type_id":88,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":1187,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'>全国包邮，除部分地区包括内蒙古,甘肃,宁夏，海南，青海，西藏，新疆等地区需另加邮费，下单请联系客服哦<\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118275fd85033da14f.PNG\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118275fd85033ed508.PNG\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd8503404ab1.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd850340e069.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd850341c5ad.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd850342681f.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd850345d69f.PNG\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd8503472f39.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd850346a602.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd850347d53c.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd850348d264.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd85034964c7.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd85034a16f2.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd85034b4d5f.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd85034bdab1.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118285fd85034cdcba.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118295fd8503516a33.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118295fd850351fc25.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118295fd850353b67d.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080118295fd850355ce86.png\"/><\/p><p style='overflow:hidden'><br/><\/p>","spes_desc":{"颜色":{"193421":"圣诞麋鹿1000ml","193422":"橘色长脚鹿1000ml","193423":"驯鹿1000ml","193424":"鹿宝宝1000ml","193425":"红底围巾熊1000ml","193426":"蓝博士熊1000ml","193427":"灰蓝猫头鹰1000ml","193428":"独角兽1000ml","193429":"法兰绒粉爱心1000ml","193430":"法兰绒灰爱心1000ml","193431":"溜冰企鹅1000ml","193432":"粉猫头鹰1000ml","193433":"红色小鹿1000ml","193434":"蓝企鹅1000ml","193435":"鹿宝宝2000ml","193436":"驯鹿2000ml","193437":"紫丁香鹿2000ml","193438":"抱心熊2000ml","193439":"独角兽2000ml","193440":"插手款粉猫咪2000ml","193441":"插手款粉小猪2000ml","193442":"灰蓝猫头鹰2000ml","193443":"黄底可爱狗2000ml","193444":"蓝企鹅2000ml"}},"params":"","service":"1,4,6","comments_count":0,"view_count":0,"buy_count":13,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":2,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:178:{i:193420;a:1:{i:0;s:40:\"牛仔蓝+紫色+咖啡色+姜黄+绿色\";}i:193421;a:1:{i:0;s:18:\"圣诞麋鹿1000ml\";}i:193422;a:1:{i:0;s:21:\"橘色长脚鹿1000ml\";}i:193423;a:1:{i:0;s:12:\"驯鹿1000ml\";}i:193424;a:1:{i:0;s:15:\"鹿宝宝1000ml\";}i:193425;a:1:{i:0;s:21:\"红底围巾熊1000ml\";}i:193426;a:1:{i:0;s:18:\"蓝博士熊1000ml\";}i:193427;a:1:{i:0;s:21:\"灰蓝猫头鹰1000ml\";}i:193428;a:1:{i:0;s:15:\"独角兽1000ml\";}i:193429;a:1:{i:0;s:24:\"法兰绒粉爱心1000ml\";}i:193430;a:1:{i:0;s:24:\"法兰绒灰爱心1000ml\";}i:193431;a:1:{i:0;s:18:\"溜冰企鹅1000ml\";}i:193432;a:1:{i:0;s:18:\"粉猫头鹰1000ml\";}i:193433;a:1:{i:0;s:18:\"红色小鹿1000ml\";}i:193434;a:1:{i:0;s:15:\"蓝企鹅1000ml\";}i:193435;a:1:{i:0;s:15:\"鹿宝宝2000ml\";}i:193436;a:1:{i:0;s:12:\"驯鹿2000ml\";}i:193437;a:1:{i:0;s:18:\"紫丁香鹿2000ml\";}i:193438;a:1:{i:0;s:15:\"抱心熊2000ml\";}i:193439;a:1:{i:0;s:15:\"独角兽2000ml\";}i:193440;a:1:{i:0;s:24:\"插手款粉猫咪2000ml\";}i:193441;a:1:{i:0;s:24:\"插手款粉小猪2000ml\";}i:193442;a:1:{i:0;s:21:\"灰蓝猫头鹰2000ml\";}i:193443;a:1:{i:0;s:21:\"黄底可爱狗2000ml\";}i:193444;a:1:{i:0;s:15:\"蓝企鹅2000ml\";}i:193445;a:1:{i:0;s:18:\"咖色小熊围巾\";}i:193446;a:1:{i:0;s:18:\"米色小熊围巾\";}i:193447;a:1:{i:0;s:18:\"灰色小熊围巾\";}i:193448;a:1:{i:0;s:18:\"白色小熊围巾\";}i:193449;a:1:{i:0;s:25:\"四叉眉笔1号浅棕色\";}i:193450;a:1:{i:0;s:25:\"四叉眉笔2号深棕色\";}i:193451;a:1:{i:0;s:25:\"四叉眉笔3号红棕色\";}i:193452;a:1:{i:0;s:25:\"四叉眉笔4号灰棕色\";}i:193453;a:1:{i:0;s:22:\"四叉眉笔5号黑色\";}i:193454;a:1:{i:0;s:16:\"双头1号黑色\";}i:193455;a:1:{i:0;s:19:\"双头2号亚麻色\";}i:193456;a:1:{i:0;s:19:\"双头3号浅咖色\";}i:193457;a:1:{i:0;s:16:\"双头4号灰色\";}i:193458;a:1:{i:0;s:16:\"双头5号深咖\";}i:193459;a:1:{i:0;s:16:\"双头6号棕色\";}i:193460;a:1:{i:0;s:11:\"B2045黑色\";}i:193461;a:1:{i:0;s:11:\"B2045灰色\";}i:193462;a:1:{i:0;s:11:\"B2045褐色\";}i:193463;a:1:{i:0;s:14:\"B2045灰棕色\";}i:193464;a:1:{i:0;s:14:\"B2045浅咖色\";}i:193465;a:1:{i:0;s:14:\"B2045深咖色\";}i:193466;a:1:{i:0;s:11:\"B2045棕色\";}i:193467;a:1:{i:0;s:15:\"小奥丁黑色\";}i:193468;a:1:{i:0;s:18:\"小奥丁浅咖色\";}i:193469;a:1:{i:0;s:18:\"小奥丁咖啡色\";}i:193470;a:1:{i:0;s:15:\"小奥丁灰色\";}i:193471;a:1:{i:0;s:18:\"小奥丁深咖色\";}i:193472;a:1:{i:0;s:13:\"纯真黑+白\";}i:193473;a:1:{i:0;s:10:\"海洋蓝A\";}i:193474;a:1:{i:0;s:10:\"海洋蓝B\";}i:193475;a:1:{i:0;s:13:\"深空灰+蓝\";}i:193476;a:1:{i:0;s:13:\"象牙白+蓝\";}i:193477;a:1:{i:0;s:13:\"樱花粉+白\";}i:193478;a:1:{i:0;s:9:\"冰川白\";}i:193479;a:1:{i:0;s:9:\"幻影黑\";}i:193480;a:1:{i:0;s:9:\"深空灰\";}i:193481;a:1:{i:0;s:15:\"粉色充电款\";}i:193482;a:1:{i:0;s:25:\"2双纯色款（0-5岁）\";}i:193483;a:1:{i:0;s:28:\"2双绣花鸭梨（5-8岁）\";}i:193484;a:1:{i:0;s:28:\"2双我爱妈咪（0-5岁）\";}i:193485;a:1:{i:0;s:28:\"2双绣花狗狗（0-5岁）\";}i:193486;a:1:{i:0;s:28:\"2双猫咪系列（0-5岁）\";}i:193487;a:1:{i:0;s:25:\"2双小恐龙（0-5岁）\";}i:193488;a:1:{i:0;s:22:\"2双小熊（0-5岁）\";}i:193489;a:1:{i:0;s:25:\"2双热气球（0-5岁）\";}i:193490;a:1:{i:0;s:28:\"2双长腰猫咪（0-5岁）\";}i:193491;a:1:{i:0;s:20:\"2双M标（5-8岁）\";}i:193492;a:1:{i:0;s:25:\"2双奶牛款（0-5岁）\";}i:193493;a:1:{i:0;s:25:\"2双帽子猪（5-8岁）\";}i:193494;a:1:{i:0;s:25:\"2双雏菊款（0-5岁）\";}i:193495;a:1:{i:0;s:21:\"2双YOUME（0-5岁）\";}i:193496;a:1:{i:0;s:25:\"2双松鼠款（0-5岁）\";}i:193497;a:1:{i:0;s:25:\"2双爱心款（0-5岁）\";}i:193498;a:1:{i:0;s:25:\"2双王冠猪（5-8岁）\";}i:193499;a:1:{i:0;s:14:\"01反叛天真\";}i:193500;a:1:{i:0;s:14:\"02离谱可爱\";}i:193501;a:1:{i:0;s:14:\"03确实很酷\";}i:193502;a:1:{i:0;s:14:\"04天生有趣\";}i:193503;a:1:{i:0;s:12:\"05女团c位\";}i:193504;a:1:{i:0;s:14:\"06碳酸少女\";}i:193505;a:1:{i:0;s:13:\"2个北欧粉\";}i:193506;a:1:{i:0;s:13:\"2个北欧蓝\";}i:193507;a:1:{i:0;s:13:\"2个北欧绿\";}i:193508;a:1:{i:0;s:13:\"2个北欧米\";}i:193509;a:1:{i:0;s:13:\"2个北欧灰\";}i:193510;a:1:{i:0;s:19:\"2个双色雅灰粉\";}i:193511;a:1:{i:0;s:19:\"2个双色雅灰蓝\";}i:193512;a:1:{i:0;s:19:\"2个双色雅灰绿\";}i:193513;a:1:{i:0;s:19:\"2个双色雅灰米\";}i:193514;a:1:{i:0;s:34:\"2个【手提款】双色雅灰粉\";}i:193515;a:1:{i:0;s:34:\"2个【手提款】双色雅灰蓝\";}i:193516;a:1:{i:0;s:34:\"2个【手提款】双色雅灰绿\";}i:193517;a:1:{i:0;s:34:\"2个【手提款】双色雅灰米\";}i:193518;a:1:{i:0;s:52:\"2个无手提款（颜色可备注，默认随机）\";}i:193519;a:1:{i:0;s:49:\"2个手提款（颜色可备注，默认随机）\";}i:193520;a:1:{i:0;s:24:\"黑色（一年保修）\";}i:193521;a:1:{i:0;s:12:\"短筒黑色\";}i:193522;a:1:{i:0;s:18:\"短筒巧克力色\";}i:193523;a:1:{i:0;s:12:\"短筒灰色\";}i:193524;a:1:{i:0;s:12:\"短筒栗色\";}i:193525;a:1:{i:0;s:15:\"短筒暮粉色\";}i:193526;a:1:{i:0;s:15:\"短筒奶茶色\";}i:193527;a:1:{i:0;s:15:\"皮带扣黑色\";}i:193528;a:1:{i:0;s:21:\"皮带扣巧克力色\";}i:193529;a:1:{i:0;s:15:\"皮带扣灰色\";}i:193530;a:1:{i:0;s:15:\"皮带扣栗色\";}i:193531;a:1:{i:0;s:18:\"硅胶版索菲蓝\";}i:193532;a:1:{i:0;s:18:\"硅胶版樱柠粉\";}i:193533;a:1:{i:0;s:18:\"硅胶版校园蓝\";}i:193534;a:1:{i:0;s:18:\"硅胶版校园粉\";}i:193535;a:1:{i:0;s:18:\"无硅胶校园蓝\";}i:193536;a:1:{i:0;s:18:\"无硅胶校园粉\";}i:193537;a:1:{i:0;s:14:\"01怦然心动\";}i:193538;a:1:{i:0;s:14:\"02冰河时代\";}i:193539;a:1:{i:0;s:14:\"03金色琉璃\";}i:193540;a:1:{i:0;s:14:\"04海王星辰\";}i:193541;a:1:{i:0;s:15:\"黄色加内里\";}i:193542;a:1:{i:0;s:15:\"粉色加内里\";}i:193543;a:1:{i:0;s:18:\"咖啡色加内里\";}i:193544;a:1:{i:0;s:15:\"红色加内里\";}i:193545;a:1:{i:0;s:15:\"米色加内里\";}i:193546;a:1:{i:0;s:12:\"黄色鹿角\";}i:193547;a:1:{i:0;s:12:\"绿色鹿角\";}i:193548;a:1:{i:0;s:15:\"咖啡色鹿角\";}i:193549;a:1:{i:0;s:12:\"粉色鹿角\";}i:193550;a:1:{i:0;s:12:\"红色鹿角\";}i:193551;a:1:{i:0;s:18:\"绿色青蛙单层\";}i:193552;a:1:{i:0;s:18:\"红色青蛙单层\";}i:193553;a:1:{i:0;s:18:\"黄色青蛙单层\";}i:193554;a:1:{i:0;s:18:\"米色青蛙单层\";}i:193555;a:1:{i:0;s:21:\"咖啡色青蛙单层\";}i:193556;a:1:{i:0;s:18:\"绿色青蛙加绒\";}i:193557;a:1:{i:0;s:21:\"咖啡色青蛙加绒\";}i:193558;a:1:{i:0;s:18:\"红色青蛙加绒\";}i:193559;a:1:{i:0;s:18:\"黄色青蛙加绒\";}i:193560;a:1:{i:0;s:18:\"米色青蛙加绒\";}i:193561;a:1:{i:0;s:12:\"玻璃糖纸\";}i:193562;a:1:{i:0;s:9:\"小星钻\";}i:193563;a:1:{i:0;s:9:\"金水晶\";}i:193564;a:1:{i:0;s:9:\"香芋紫\";}i:193565;a:1:{i:0;s:9:\"青草绿\";}i:193566;a:1:{i:0;s:9:\"赤陶红\";}i:193567;a:1:{i:0;s:9:\"树莓色\";}i:193568;a:1:{i:0;s:9:\"蓝灰色\";}i:193569;a:1:{i:0;s:9:\"蜜糖棕\";}i:193570;a:1:{i:0;s:9:\"黑色男\";}i:193571;a:1:{i:0;s:9:\"深灰男\";}i:193572;a:1:{i:0;s:9:\"浅灰男\";}i:193573;a:1:{i:0;s:9:\"酒红男\";}i:193574;a:1:{i:0;s:9:\"藏青男\";}i:193575;a:1:{i:0;s:9:\"黑色女\";}i:193576;a:1:{i:0;s:9:\"卡其女\";}i:193577;a:1:{i:0;s:9:\"藕紫女\";}i:193578;a:1:{i:0;s:9:\"粉色女\";}i:193579;a:1:{i:0;s:9:\"紫红女\";}i:193580;a:1:{i:0;s:39:\"黑红色+金属篮+加强杆+塑料盘\";}i:193581;a:1:{i:0;s:42:\"黑红色+金属篮+加强杆+不锈钢盘\";}i:193582;a:1:{i:0;s:10:\"3双黑色\";}i:193583;a:1:{i:0;s:13:\"3双咖啡色\";}i:193584;a:1:{i:0;s:10:\"3双灰色\";}i:193585;a:1:{i:0;s:13:\"3双卡其色\";}i:193586;a:1:{i:0;s:13:\"3双深灰色\";}i:193587;a:1:{i:0;s:31:\"3双混色（颜色可备注）\";}i:193588;a:1:{i:0;s:28:\"蓝球发白光（4英寸）\";}i:193589;a:1:{i:0;s:28:\"金球发白光（4英寸）\";}i:193590;a:1:{i:0;s:31:\"蓝球发变色光（4英寸）\";}i:193591;a:1:{i:0;s:31:\"米白球发白光（4英寸）\";}i:193592;a:1:{i:0;s:15:\"灰色标准杆\";}i:193593;a:1:{i:0;s:24:\"灰色可伸缩加强杆\";}i:193594;a:1:{i:0;s:28:\"灰色伸缩杆+清洁小桶\";}i:193595;a:1:{i:0;s:37:\"黑色+白色+灰色+橘色+枚红色\";}i:193596;a:1:{i:0;s:37:\"灰色+蓝色+紫色+玫红+姜黄色\";}i:193597;a:1:{i:0;s:45:\"5双自选颜色（10色可选，请备注）\";}}","ctime":null,"utime":1608097370,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"居家用品","products":[{"id":9310,"goods_id":1489,"barcode":null,"sn":"P6080118336003","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:圣诞麋鹿1000ml","is_defalut":1,"image_id":"d6393bac2f713f4993bda9c0e3e36c04","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080111595fd84d9737525.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","is_default":true},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9311,"goods_id":1489,"barcode":null,"sn":"P6080118336042","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:橘色长脚鹿1000ml","is_defalut":2,"image_id":"7f2c3223a992317dcb30121be2eff2b1","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080111695fd84da182edb.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","is_default":true},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9312,"goods_id":1489,"barcode":null,"sn":"P6080118336074","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:驯鹿1000ml","is_defalut":2,"image_id":"d63cbd5b5c5bfdb5024453805cb376e9","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080111755fd84da7dafb7.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","is_default":true},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9313,"goods_id":1489,"barcode":null,"sn":"P6080118336101","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":49,"freeze_stock":0,"spes_desc":"颜色:鹿宝宝1000ml","is_defalut":2,"image_id":"90d432c2d4006cb87b12c711a65d86db","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080111835fd84daf67d35.jpg","total_stock":49,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","is_default":true},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9314,"goods_id":1489,"barcode":null,"sn":"P6080118336135","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:红底围巾熊1000ml","is_defalut":2,"image_id":"283c11b083704fddb0b223432720922d","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080111905fd84db671cf3.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","is_default":true},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9315,"goods_id":1489,"barcode":null,"sn":"P6080118336165","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":49,"freeze_stock":0,"spes_desc":"颜色:蓝博士熊1000ml","is_defalut":2,"image_id":"4f0d2b32db912d8dc1df679984cf9293","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080111965fd84dbc7f6ec.jpg","total_stock":49,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","is_default":true},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9316,"goods_id":1489,"barcode":null,"sn":"P6080118336193","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:灰蓝猫头鹰1000ml","is_defalut":2,"image_id":"fde6dd4788a34cc5a989333a8c3aaa7c","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080112035fd84dc33fec4.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","is_default":true},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9317,"goods_id":1489,"barcode":null,"sn":"P6080118336221","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":48,"freeze_stock":0,"spes_desc":"颜色:独角兽1000ml","is_defalut":2,"image_id":"674a5ece7bed2cdc3645a7d0829b4569","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080112105fd84dca0a381.jpg","total_stock":48,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","is_default":true},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9318,"goods_id":1489,"barcode":null,"sn":"P6080118336250","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":48,"freeze_stock":0,"spes_desc":"颜色:法兰绒粉爱心1000ml","is_defalut":2,"image_id":"db66d7adc3e1df7809aad44eb0dcff05","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080112305fd84dde618ea.jpg","total_stock":48,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","is_default":true},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9319,"goods_id":1489,"barcode":null,"sn":"P6080118336281","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:法兰绒灰爱心1000ml","is_defalut":2,"image_id":"f7c6aeffccb8793ee9a0eb484b84d3b6","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080112485fd84df0d0559.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","is_default":true},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9320,"goods_id":1489,"barcode":null,"sn":"P6080118336315","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:溜冰企鹅1000ml","is_defalut":2,"image_id":"fc7a4d8da912213012b94e2a54333e81","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080112565fd84df88bb50.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","is_default":true},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9321,"goods_id":1489,"barcode":null,"sn":"P6080118336344","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:粉猫头鹰1000ml","is_defalut":2,"image_id":"3adab0f662ef5962802dd78517a482ed","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080116235fd84f67c007b.PNG","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","is_default":true},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9322,"goods_id":1489,"barcode":null,"sn":"P6080118336373","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:红色小鹿1000ml","is_defalut":2,"image_id":"13eb9c25d46e033f584fe57ff359bfd0","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080116535fd84f858a7ea.PNG","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","is_default":true},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9323,"goods_id":1489,"barcode":null,"sn":"P6080118336405","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":49,"freeze_stock":0,"spes_desc":"颜色:蓝企鹅1000ml","is_defalut":2,"image_id":"c44a8b03bd9c2d8785abcbe7959a792c","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080116885fd84fa8f2c5a.PNG","total_stock":49,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","is_default":true},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},{"id":9324,"goods_id":1489,"barcode":null,"sn":"P6080118336433","price":"19.60","costprice":"17.60","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:鹿宝宝2000ml","is_defalut":2,"image_id":"eb03f89fecf8aadca1ba704f2f5b21a4","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080113945fd84e82503a0.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","is_default":true},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"19.60","promotion_list":[],"promotion_amount":0},{"id":9325,"goods_id":1489,"barcode":null,"sn":"P6080118336465","price":"19.60","costprice":"17.60","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:驯鹿2000ml","is_defalut":2,"image_id":"cb8c60e537b5d737c7e89361816723ce","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080114005fd84e882a23b.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","is_default":true},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"19.60","promotion_list":[],"promotion_amount":0},{"id":9326,"goods_id":1489,"barcode":null,"sn":"P6080118336480","price":"19.60","costprice":"17.60","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:紫丁香鹿2000ml","is_defalut":2,"image_id":"2aac2e19ed18c78887df5c8a4e8f18ed","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080114065fd84e8e61956.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","is_default":true},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"19.60","promotion_list":[],"promotion_amount":0},{"id":9327,"goods_id":1489,"barcode":null,"sn":"P6080118336513","price":"19.60","costprice":"17.60","mktprice":"0.00","marketable":1,"stock":49,"freeze_stock":0,"spes_desc":"颜色:抱心熊2000ml","is_defalut":2,"image_id":"9a84f199405dee46b5aee658a5a1bca7","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080114165fd84e984829e.jpg","total_stock":49,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","is_default":true},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"19.60","promotion_list":[],"promotion_amount":0},{"id":9328,"goods_id":1489,"barcode":null,"sn":"P6080118336543","price":"19.60","costprice":"17.60","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:独角兽2000ml","is_defalut":2,"image_id":"ae2e2e7bc386ef619aa289f18e0abaa2","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080114245fd84ea02b858.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","is_default":true},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"19.60","promotion_list":[],"promotion_amount":0},{"id":9329,"goods_id":1489,"barcode":null,"sn":"P6080118336570","price":"19.60","costprice":"17.60","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:插手款粉猫咪2000ml","is_defalut":2,"image_id":"2327439ca24b082a5b7a51a8286bcc62","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080114335fd84ea9de449.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","is_default":true},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"19.60","promotion_list":[],"promotion_amount":0},{"id":9330,"goods_id":1489,"barcode":null,"sn":"P6080118336604","price":"19.60","costprice":"17.60","mktprice":"0.00","marketable":1,"stock":49,"freeze_stock":0,"spes_desc":"颜色:插手款粉小猪2000ml","is_defalut":2,"image_id":"44bd32ada24605c2be954dd916e1be02","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080114395fd84eaf72134.jpg","total_stock":49,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","is_default":true},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"19.60","promotion_list":[],"promotion_amount":0},{"id":9331,"goods_id":1489,"barcode":null,"sn":"P6080118336635","price":"19.60","costprice":"17.60","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:灰蓝猫头鹰2000ml","is_defalut":2,"image_id":"df3d1759dbd5d6657c2d59a9862abdbb","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080122095fd851b1aa99e.PNG","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","is_default":true},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"19.60","promotion_list":[],"promotion_amount":0},{"id":9332,"goods_id":1489,"barcode":null,"sn":"P6080118336664","price":"19.60","costprice":"17.60","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:黄底可爱狗2000ml","is_defalut":2,"image_id":"fd6b0349cf873aef0bf497234cce27e0","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080121335fd85165ce967.PNG","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","is_default":true},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"19.60","promotion_list":[],"promotion_amount":0},{"id":9333,"goods_id":1489,"barcode":null,"sn":"P6080118336695","price":"19.60","costprice":"17.60","mktprice":"0.00","marketable":1,"stock":46,"freeze_stock":0,"spes_desc":"颜色:蓝企鹅2000ml","is_defalut":2,"image_id":"068775e1e6c0e2fe9d1b15dfc91147c3","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080120475fd8510fabd97.PNG","total_stock":46,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","product_id":9310},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","is_default":true}}},"amount":"19.60","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080110185fd84d0a0b107.jpg","default":{"id":9310,"goods_id":1489,"barcode":null,"sn":"P6080118336003","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":50,"freeze_stock":0,"spes_desc":"颜色:圣诞麋鹿1000ml","is_defalut":1,"image_id":"d6393bac2f713f4993bda9c0e3e36c04","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080111595fd84d9737525.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","is_default":true},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},"product":{"id":9310,"goods_id":1489,"barcode":null,"sn":"P6080118336003","price":"15.80","costprice":"13.80","mktprice":"0.00","marketable":1,"stock":50,"spes_desc":"颜色:圣诞麋鹿1000ml","is_defalut":1,"image_id":"d6393bac2f713f4993bda9c0e3e36c04","isdel":null,"name":"注水热水袋加厚橡胶暖水袋暖手宝1000ml2000ml","buy_limit":0,"bn":"G6080118335930","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080111595fd84d9737525.jpg","total_stock":50,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"圣诞麋鹿1000ml":{"name":"圣诞麋鹿1000ml","is_default":true},"橘色长脚鹿1000ml":{"name":"橘色长脚鹿1000ml","product_id":9311},"驯鹿1000ml":{"name":"驯鹿1000ml","product_id":9312},"鹿宝宝1000ml":{"name":"鹿宝宝1000ml","product_id":9313},"红底围巾熊1000ml":{"name":"红底围巾熊1000ml","product_id":9314},"蓝博士熊1000ml":{"name":"蓝博士熊1000ml","product_id":9315},"灰蓝猫头鹰1000ml":{"name":"灰蓝猫头鹰1000ml","product_id":9316},"独角兽1000ml":{"name":"独角兽1000ml","product_id":9317},"法兰绒粉爱心1000ml":{"name":"法兰绒粉爱心1000ml","product_id":9318},"法兰绒灰爱心1000ml":{"name":"法兰绒灰爱心1000ml","product_id":9319},"溜冰企鹅1000ml":{"name":"溜冰企鹅1000ml","product_id":9320},"粉猫头鹰1000ml":{"name":"粉猫头鹰1000ml","product_id":9321},"红色小鹿1000ml":{"name":"红色小鹿1000ml","product_id":9322},"蓝企鹅1000ml":{"name":"蓝企鹅1000ml","product_id":9323},"鹿宝宝2000ml":{"name":"鹿宝宝2000ml","product_id":9324},"驯鹿2000ml":{"name":"驯鹿2000ml","product_id":9325},"紫丁香鹿2000ml":{"name":"紫丁香鹿2000ml","product_id":9326},"抱心熊2000ml":{"name":"抱心熊2000ml","product_id":9327},"独角兽2000ml":{"name":"独角兽2000ml","product_id":9328},"插手款粉猫咪2000ml":{"name":"插手款粉猫咪2000ml","product_id":9329},"插手款粉小猪2000ml":{"name":"插手款粉小猪2000ml","product_id":9330},"灰蓝猫头鹰2000ml":{"name":"灰蓝猫头鹰2000ml","product_id":9331},"黄底可爱狗2000ml":{"name":"黄底可爱狗2000ml","product_id":9332},"蓝企鹅2000ml":{"name":"蓝企鹅2000ml","product_id":9333}}},"amount":"15.80","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/15/16080110185fd84d0a0b107.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080110195fd84d0b90cc6.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080110195fd84d0ba5991.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16080110195fd84d0b9b7d3.jpg"],"total_stock":1187,"is_buy_num":13,"isfav":"false","can_buy":"ok","vip_price":15.8,"is_notice":0},{"id":1488,"bn":"G6080002227674","name":"原画师砍眉刀眉笔防水自然不易晕染刀削式方芯眉笔初学","brief":"","price":"31.00","costprice":"29.80","mktprice":"0.00","image_id":"f5d1dc862fb4aa0020383191472411cf","goods_cat_id":79,"goods_type_id":92,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":455,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001775fd822b15935c.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001705fd822aae498f.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001785fd822b2a1472.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001785fd822b2e249d.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001805fd822b40d6a8.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001795fd822b391e57.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001805fd822b44b286.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001805fd822b4ef70e.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001815fd822b50469d.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001815fd822b5433d7.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001815fd822b5e667e.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001825fd822b69618d.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001835fd822b747c24.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001835fd822b7b82a2.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001845fd822b8ceced.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001855fd822b9190b8.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001855fd822b954f05.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079348955fd723af492b8.png\" alt=\"16079348955fd723af492b8.png\"/><\/p>","spes_desc":{"颜色":{"193384":"01#黑灰色红杆","193385":"02#深棕色红杆","193386":"03#灰棕色红杆","193387":"04#茶棕色红杆"}},"params":"","service":"1,4,6,7","comments_count":0,"view_count":0,"buy_count":19,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":1,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:37:{i:193383;a:1:{i:0;s:6:\"白色\";}i:193384;a:1:{i:0;s:18:\"01#黑灰色红杆\";}i:193385;a:1:{i:0;s:18:\"02#深棕色红杆\";}i:193386;a:1:{i:0;s:18:\"03#灰棕色红杆\";}i:193387;a:1:{i:0;s:18:\"04#茶棕色红杆\";}i:193388;a:1:{i:0;s:4:\"2551\";}i:193389;a:1:{i:0;s:4:\"2521\";}i:193390;a:1:{i:0;s:4:\"2518\";}i:193391;a:1:{i:0;s:4:\"2519\";}i:193392;a:1:{i:0;s:4:\"2517\";}i:193393;a:1:{i:0;s:21:\"【一口袋礼物】\";}i:193394;a:1:{i:0;s:21:\"【神奇的袜子】\";}i:193395;a:1:{i:0;s:21:\"【吉祥的麋鹿】\";}i:193396;a:1:{i:0;s:9:\"咖啡色\";}i:193397;a:1:{i:0;s:6:\"浅灰\";}i:193398;a:1:{i:0;s:6:\"卡其\";}i:193399;a:1:{i:0;s:9:\"牛仔蓝\";}i:193400;a:1:{i:0;s:6:\"姜黄\";}i:193401;a:1:{i:0;s:6:\"焦糖\";}i:193402;a:1:{i:0;s:6:\"军绿\";}i:193403;a:1:{i:0;s:6:\"深灰\";}i:193404;a:1:{i:0;s:6:\"黑色\";}i:193405;a:1:{i:0;s:22:\"双杆【5色混搭】\";}i:193406;a:1:{i:0;s:22:\"恐龙【5色混搭】\";}i:193407;a:1:{i:0;s:22:\"猫咪【5色混搭】\";}i:193408;a:1:{i:0;s:22:\"英伦【5色混搭】\";}i:193409;a:1:{i:0;s:9:\"北欧米\";}i:193410;a:1:{i:0;s:9:\"北欧粉\";}i:193411;a:1:{i:0;s:9:\"北欧绿\";}i:193412;a:1:{i:0;s:9:\"北欧蓝\";}i:193413;a:1:{i:0;s:9:\"牛头绿\";}i:193414;a:1:{i:0;s:9:\"牛头咖\";}i:193415;a:1:{i:0;s:9:\"牛头粉\";}i:193416;a:1:{i:0;s:9:\"牛头灰\";}i:193417;a:1:{i:0;s:6:\"蓝色\";}i:193418;a:1:{i:0;s:6:\"粉色\";}i:193419;a:1:{i:0;s:6:\"灰色\";}}","ctime":null,"utime":1608000546,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"彩妆","products":[{"id":9306,"goods_id":1488,"barcode":null,"sn":"P6080002227743","price":"31.00","costprice":"29.80","mktprice":"0.00","marketable":2,"stock":121,"freeze_stock":0,"spes_desc":"颜色:01#黑灰色红杆","is_defalut":1,"image_id":"5f3f0cba84f70626ed8da68c0d45ff2e","isdel":null,"name":"原画师砍眉刀眉笔防水自然不易晕染刀削式方芯眉笔初学","buy_limit":0,"bn":"G6080002227674","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080000755fd8224be9c54.jpg","total_stock":121,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"01#黑灰色红杆":{"name":"01#黑灰色红杆","is_default":true},"02#深棕色红杆":{"name":"02#深棕色红杆","product_id":9307},"03#灰棕色红杆":{"name":"03#灰棕色红杆","product_id":9308},"04#茶棕色红杆":{"name":"04#茶棕色红杆","product_id":9309}}},"amount":"31.00","promotion_list":[],"promotion_amount":0},{"id":9307,"goods_id":1488,"barcode":null,"sn":"P6080002227784","price":"31.00","costprice":"29.80","mktprice":"0.00","marketable":2,"stock":126,"freeze_stock":0,"spes_desc":"颜色:02#深棕色红杆","is_defalut":2,"image_id":"568c1bf213033085e26931bcff678b45","isdel":null,"name":"原画师砍眉刀眉笔防水自然不易晕染刀削式方芯眉笔初学","buy_limit":0,"bn":"G6080002227674","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080000925fd8225c20a8c.jpg","total_stock":126,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"01#黑灰色红杆":{"name":"01#黑灰色红杆","product_id":9306},"02#深棕色红杆":{"name":"02#深棕色红杆","is_default":true},"03#灰棕色红杆":{"name":"03#灰棕色红杆","product_id":9308},"04#茶棕色红杆":{"name":"04#茶棕色红杆","product_id":9309}}},"amount":"31.00","promotion_list":[],"promotion_amount":0},{"id":9308,"goods_id":1488,"barcode":null,"sn":"P6080002227811","price":"31.00","costprice":"29.80","mktprice":"0.00","marketable":2,"stock":112,"freeze_stock":0,"spes_desc":"颜色:03#灰棕色红杆","is_defalut":2,"image_id":"7a782a5371e0ecc3577bf3e9a641e8ea","isdel":null,"name":"原画师砍眉刀眉笔防水自然不易晕染刀削式方芯眉笔初学","buy_limit":0,"bn":"G6080002227674","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001045fd8226816fbb.jpg","total_stock":112,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"01#黑灰色红杆":{"name":"01#黑灰色红杆","product_id":9306},"02#深棕色红杆":{"name":"02#深棕色红杆","product_id":9307},"03#灰棕色红杆":{"name":"03#灰棕色红杆","is_default":true},"04#茶棕色红杆":{"name":"04#茶棕色红杆","product_id":9309}}},"amount":"31.00","promotion_list":[],"promotion_amount":0},{"id":9309,"goods_id":1488,"barcode":null,"sn":"P6080002227871","price":"31.00","costprice":"29.80","mktprice":"0.00","marketable":2,"stock":96,"freeze_stock":0,"spes_desc":"颜色:04#茶棕色红杆","is_defalut":2,"image_id":"87df497eca0aa373e79ebe1dc103c5fa","isdel":null,"name":"原画师砍眉刀眉笔防水自然不易晕染刀削式方芯眉笔初学","buy_limit":0,"bn":"G6080002227674","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080001165fd822741b35a.jpg","total_stock":96,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"01#黑灰色红杆":{"name":"01#黑灰色红杆","product_id":9306},"02#深棕色红杆":{"name":"02#深棕色红杆","product_id":9307},"03#灰棕色红杆":{"name":"03#灰棕色红杆","product_id":9308},"04#茶棕色红杆":{"name":"04#茶棕色红杆","is_default":true}}},"amount":"31.00","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16079999775fd821e913e3e.jpg","default":{"id":9306,"goods_id":1488,"barcode":null,"sn":"P6080002227743","price":"31.00","costprice":"29.80","mktprice":"0.00","marketable":2,"stock":121,"freeze_stock":0,"spes_desc":"颜色:01#黑灰色红杆","is_defalut":1,"image_id":"5f3f0cba84f70626ed8da68c0d45ff2e","isdel":null,"name":"原画师砍眉刀眉笔防水自然不易晕染刀削式方芯眉笔初学","buy_limit":0,"bn":"G6080002227674","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080000755fd8224be9c54.jpg","total_stock":121,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"01#黑灰色红杆":{"name":"01#黑灰色红杆","is_default":true},"02#深棕色红杆":{"name":"02#深棕色红杆","product_id":9307},"03#灰棕色红杆":{"name":"03#灰棕色红杆","product_id":9308},"04#茶棕色红杆":{"name":"04#茶棕色红杆","product_id":9309}}},"amount":"31.00","promotion_list":[],"promotion_amount":0},"product":{"id":9306,"goods_id":1488,"barcode":null,"sn":"P6080002227743","price":"31.00","costprice":"29.80","mktprice":"0.00","marketable":2,"stock":121,"spes_desc":"颜色:01#黑灰色红杆","is_defalut":1,"image_id":"5f3f0cba84f70626ed8da68c0d45ff2e","isdel":null,"name":"原画师砍眉刀眉笔防水自然不易晕染刀削式方芯眉笔初学","buy_limit":0,"bn":"G6080002227674","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/15/16080000755fd8224be9c54.jpg","total_stock":121,"grade_price":[],"grade_info":[],"default_spes_desc":{"颜色":{"01#黑灰色红杆":{"name":"01#黑灰色红杆","is_default":true},"02#深棕色红杆":{"name":"02#深棕色红杆","product_id":9307},"03#灰棕色红杆":{"name":"03#灰棕色红杆","product_id":9308},"04#茶棕色红杆":{"name":"04#茶棕色红杆","product_id":9309}}},"amount":"31.00","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/15/16079999775fd821e913e3e.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16079999765fd821e8e42aa.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16079999765fd821e8dabf6.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16079999775fd821e90231e.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/15/16079999765fd821e8cb30e.jpg"],"total_stock":455,"is_buy_num":19,"isfav":"false","can_buy":"ok","vip_price":31,"is_notice":0}]
         * total_page : 21
         * filter : {"label_ids":[],"brand_ids":[{"brand_id":13,"name":"超能"}],"goods_cat":[{"goods_cat_id":23,"name":"女士单鞋"},{"goods_cat_id":24,"name":"女士运动鞋"},{"goods_cat_id":51,"name":"打底裤"},{"goods_cat_id":54,"name":"袜子"},{"goods_cat_id":57,"name":"内衣"},{"goods_cat_id":62,"name":"休闲裤"},{"goods_cat_id":72,"name":"拖鞋"},{"goods_cat_id":75,"name":"男士皮靴"},{"goods_cat_id":78,"name":"车品"},{"goods_cat_id":79,"name":"彩妆"},{"goods_cat_id":80,"name":"护肤"},{"goods_cat_id":82,"name":"洁面"},{"goods_cat_id":83,"name":"美妆工具"},{"goods_cat_id":84,"name":"润唇膏/护手霜"},{"goods_cat_id":85,"name":"居家清洁"},{"goods_cat_id":86,"name":"口腔清洁"},{"goods_cat_id":87,"name":"头发洗护"},{"goods_cat_id":88,"name":"身体洗护"},{"goods_cat_id":89,"name":"摆件"},{"goods_cat_id":92,"name":"床上用品"},{"goods_cat_id":95,"name":"纸品"},{"goods_cat_id":96,"name":"首饰"},{"goods_cat_id":99,"name":"杯子"},{"goods_cat_id":100,"name":"配件"},{"goods_cat_id":103,"name":"围巾"},{"goods_cat_id":104,"name":"女士双肩包"},{"goods_cat_id":106,"name":"女士手提包"},{"goods_cat_id":112,"name":"休闲零食"},{"goods_cat_id":114,"name":"坚果"},{"goods_cat_id":116,"name":"冲饮"},{"goods_cat_id":119,"name":"速食"},{"goods_cat_id":120,"name":"儿童鞋服"},{"goods_cat_id":121,"name":"母婴用品"},{"goods_cat_id":126,"name":"五金电子"},{"goods_cat_id":128,"name":"小家电"},{"goods_cat_id":130,"name":"帽子"},{"goods_cat_id":131,"name":"头饰"},{"goods_cat_id":132,"name":"腰带"},{"goods_cat_id":133,"name":"手套"},{"goods_cat_id":134,"name":"餐厨"},{"goods_cat_id":135,"name":"居家用品"},{"goods_cat_id":136,"name":"毛巾/浴巾"},{"goods_cat_id":137,"name":"伞具"},{"goods_cat_id":138,"name":"文体"},{"goods_cat_id":143,"name":"儿童包"}]}
         * page : 1
         * limit : 10
         * where : {"hot":1,"is_tqm":1}
         * order : sort asc
         * class_name :
         */

        private int total_page;
        private FilterBean filter;
        private int page;
        private int limit;
        private WhereBean where;
        private String order;
        private String class_name;
        private List<ListBean> list;

        public int getTotal_page() {
            return total_page;
        }

        public void setTotal_page(int total_page) {
            this.total_page = total_page;
        }

        public FilterBean getFilter() {
            return filter;
        }

        public void setFilter(FilterBean filter) {
            this.filter = filter;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public WhereBean getWhere() {
            return where;
        }

        public void setWhere(WhereBean where) {
            this.where = where;
        }

        public String getOrder() {
            return order;
        }

        public void setOrder(String order) {
            this.order = order;
        }

        public String getClass_name() {
            return class_name;
        }

        public void setClass_name(String class_name) {
            this.class_name = class_name;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class FilterBean {
            private List<?> label_ids;
            private List<BrandIdsBean> brand_ids;
            private List<GoodsCatBean> goods_cat;

            public List<?> getLabel_ids() {
                return label_ids;
            }

            public void setLabel_ids(List<?> label_ids) {
                this.label_ids = label_ids;
            }

            public List<BrandIdsBean> getBrand_ids() {
                return brand_ids;
            }

            public void setBrand_ids(List<BrandIdsBean> brand_ids) {
                this.brand_ids = brand_ids;
            }

            public List<GoodsCatBean> getGoods_cat() {
                return goods_cat;
            }

            public void setGoods_cat(List<GoodsCatBean> goods_cat) {
                this.goods_cat = goods_cat;
            }

            public static class BrandIdsBean {
                /**
                 * brand_id : 13
                 * name : 超能
                 */

                private int brand_id;
                private String name;

                public int getBrand_id() {
                    return brand_id;
                }

                public void setBrand_id(int brand_id) {
                    this.brand_id = brand_id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class GoodsCatBean {
                /**
                 * goods_cat_id : 23
                 * name : 女士单鞋
                 */

                private int goods_cat_id;
                private String name;

                public int getGoods_cat_id() {
                    return goods_cat_id;
                }

                public void setGoods_cat_id(int goods_cat_id) {
                    this.goods_cat_id = goods_cat_id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }

        public static class WhereBean {
            /**
             * hot : 1
             * is_tqm : 1
             */

            private int hot;
            private int is_tqm;

            public int getHot() {
                return hot;
            }

            public void setHot(int hot) {
                this.hot = hot;
            }

            public int getIs_tqm() {
                return is_tqm;
            }

            public void setIs_tqm(int is_tqm) {
                this.is_tqm = is_tqm;
            }
        }

        public static class ListBean {
            /**
             * id : 1505
             * bn : G6081932808665
             * name : 龙王豆浆480g速溶原味/甜味豆奶粉营养早餐无蔗糖无渣
             * brief :
             * price : 16.60
             * costprice : 15.60
             * mktprice : 0.00
             * image_id : 39d9b34170446b8a439be6617382689b
             * goods_cat_id : 116
             * goods_type_id : 25
             * brand_id : 0
             * is_nomal_virtual : 1
             * marketable : 1
             * stock : 285
             * weight : 0.00
             * unit :
             * intro : <p style='overflow:hidden'>全国包邮，除部分地区包括内蒙古,甘肃,宁夏，海南，青海，西藏，新疆等地区需另加邮费，下单请联系客服。</p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src="http://img.ywzyit.com/static/uploads/images/2020/12/17/16081932605fdb14ec413b5.jpg"/></p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src="http://img.ywzyit.com/static/uploads/images/2020/12/17/16081932605fdb14ece4474.jpg"/></p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src="http://img.ywzyit.com/static/uploads/images/2020/12/17/16081932605fdb14ec3780d.jpg"/></p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src="http://img.ywzyit.com/static/uploads/images/2020/12/17/16081932615fdb14edd5e77.jpg"/></p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src="http://img.ywzyit.com/static/uploads/images/2020/12/17/16081932615fdb14ed61a53.png"/></p><p style='overflow:hidden'><br/></p>
             * spes_desc : {"净含量":{"195841":"480g"}}
             * params :
             * service : 1,4,6
             * comments_count : 0
             * view_count : 0
             * buy_count : 15
             * xuni_num : null
             * uptime : null
             * downtime : null
             * sort : 0
             * is_recommend : 2
             * is_hot : 1
             * is_tqm : 1
             * success_num : 0
             * start_time : 1970-01-01 08:00
             * end_time : 1970-01-01 08:00
             * label_ids : []
             * new_spec : a:56:{i:195840;a:1:{i:0;s:4:"140g";}i:195841;a:1:{i:0;s:4:"480g";}i:195842;a:1:{i:0;s:10:"100g核桃";}i:195843;a:1:{i:0;s:10:"250g核桃";}i:195844;a:1:{i:0;s:10:"500g核桃";}i:195845;a:1:{i:0;s:4:"150g";}i:195846;a:1:{i:0;s:4:"800g";}i:195847;a:1:{i:0;s:8:"400g/瓶";}i:195848;a:1:{i:0;s:3:"13g";}i:195849;a:1:{i:0;s:3:"60g";}i:195850;a:1:{i:0;s:4:"500g";}i:195851;a:1:{i:0;s:5:"1000g";}i:195852;a:1:{i:0;s:9:"420g*6袋";}i:195853;a:1:{i:0;s:4:"1袋";}i:195854;a:1:{i:0;s:11:"2袋赠1袋";}i:195855;a:1:{i:0;s:11:"3袋赠2袋";}i:195856;a:1:{i:0;s:3:"80g";}i:195857;a:1:{i:0;s:28:"100g（白芝麻猪肉脯）";}i:195858;a:1:{i:0;s:4:"120g";}i:195859;a:1:{i:0;s:4:"160g";}i:195860;a:1:{i:0;s:4:"900g";}i:195861;a:1:{i:0;s:3:"1KG";}i:195862;a:1:{i:0;s:4:"658g";}i:195863;a:1:{i:0;s:3:"50g";}i:195864;a:1:{i:0;s:4:"185g";}i:195865;a:1:{i:0;s:15:"750g(家庭版)";}i:195866;a:1:{i:0;s:19:"750g（年货版）";}i:195867;a:1:{i:0;s:25:"100g（精制猪肉脯）";}i:195868;a:1:{i:0;s:4:"100g";}i:195869;a:1:{i:0;s:18:"80g（烧烤味）";}i:195870;a:1:{i:0;s:14:"80g(麻辣味)";}i:195871;a:1:{i:0;s:16:"100g( 蔓越莓)";}i:195872;a:1:{i:0;s:16:"100g（抹茶）";}i:195873;a:1:{i:0;s:4:"600g";}i:195874;a:1:{i:0;s:3:"90g";}i:195875;a:1:{i:0;s:4:"180g";}i:195876;a:1:{i:0;s:11:"50g(五香)";}i:195877;a:1:{i:0;s:10:"50g(XO酱)";}i:195878;a:1:{i:0;s:15:"50g（香辣）";}i:195879;a:1:{i:0;s:15:"100g(五香味)";}i:195880;a:1:{i:0;s:15:"100g(甜辣味)";}i:195881;a:1:{i:0;s:15:"185g(五香味)";}i:195882;a:1:{i:0;s:15:"185g(香辣味)";}i:195883;a:1:{i:0;s:15:"185g(烧烤味)";}i:195884;a:1:{i:0;s:9:"一支60g";}i:195885;a:1:{i:0;s:13:"两支共120g";}i:195886;a:1:{i:0;s:20:"4支牙膏1支牙刷";}i:195887;a:1:{i:0;s:16:"五支装共550g";}i:195888;a:1:{i:0;s:4:"330g";}i:195889;a:1:{i:0;s:4:"200g";}i:195890;a:1:{i:0;s:3:"2KG";}i:195891;a:1:{i:0;s:9:"115g*3块";}i:195892;a:1:{i:0;s:10:"1.1kg*1瓶";}i:195893;a:1:{i:0;s:10:"1.1kg*2瓶";}i:195894;a:1:{i:0;s:5:"20片";}i:195895;a:1:{i:0;s:5:"30片";}}
             * ctime : null
             * utime : 1608193288
             * isdel : null
             * commission : 0.00
             * recommend_goods_id : 0
             * want_goods_id : 0
             * buy_limit : 0
             * brand_name : null
             * cat_name : 冲饮
             * products : [{"id":9711,"goods_id":1505,"barcode":null,"sn":"P6081932808722","price":"16.60","costprice":"15.60","mktprice":"0.00","marketable":2,"stock":285,"freeze_stock":0,"spes_desc":"净含量:480g","is_defalut":1,"image_id":"","isdel":null,"name":"龙王豆浆480g速溶原味/甜味豆奶粉营养早餐无蔗糖无渣","buy_limit":0,"bn":"G6081932808665","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931865fdb14a25f0dd.jpg","total_stock":285,"grade_price":[],"grade_info":[],"default_spes_desc":{"净含量":{"480g":{"name":"480g","is_default":true}}},"amount":"16.60","promotion_list":[],"promotion_amount":0}]
             * image_url : http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931865fdb14a25f0dd.jpg
             * default : {"id":9711,"goods_id":1505,"barcode":null,"sn":"P6081932808722","price":"16.60","costprice":"15.60","mktprice":"0.00","marketable":2,"stock":285,"freeze_stock":0,"spes_desc":"净含量:480g","is_defalut":1,"image_id":"","isdel":null,"name":"龙王豆浆480g速溶原味/甜味豆奶粉营养早餐无蔗糖无渣","buy_limit":0,"bn":"G6081932808665","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931865fdb14a25f0dd.jpg","total_stock":285,"grade_price":[],"grade_info":[],"default_spes_desc":{"净含量":{"480g":{"name":"480g","is_default":true}}},"amount":"16.60","promotion_list":[],"promotion_amount":0}
             * product : {"id":9711,"goods_id":1505,"barcode":null,"sn":"P6081932808722","price":"16.60","costprice":"15.60","mktprice":"0.00","marketable":2,"stock":285,"spes_desc":"净含量:480g","is_defalut":1,"image_id":"","isdel":null,"name":"龙王豆浆480g速溶原味/甜味豆奶粉营养早餐无蔗糖无渣","buy_limit":0,"bn":"G6081932808665","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931865fdb14a25f0dd.jpg","total_stock":285,"grade_price":[],"grade_info":[],"default_spes_desc":{"净含量":{"480g":{"name":"480g","is_default":true}}},"amount":"16.60","promotion_list":[],"promotion_amount":0}
             * album : ["http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931865fdb14a25f0dd.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931865fdb14a2125ae.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931865fdb14a221980.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931875fdb14a310666.jpg"]
             * total_stock : 285
             * is_buy_num : 15
             * isfav : false
             * can_buy : ok
             * vip_price : 16.6
             * is_notice : 0
             */

            private int id;
            private String bn;
            private String name;
            private String brief;
            private String price;
            private String costprice;
            private String mktprice;
            private String image_id;
            private int goods_cat_id;
            private int goods_type_id;
            private int brand_id;
            private int is_nomal_virtual;
            private int marketable;
            private int stock;
            private String weight;
            private String unit;
            private String intro;
            private SpesDescBean spes_desc;
            private String params;
            private String service;
            private int comments_count;
            private int view_count;
            private int buy_count;
            private Object xuni_num;
            private Object uptime;
            private Object downtime;
            private int sort;
            private int is_recommend;
            private int is_hot;
            private int is_tqm;
            private int success_num;
            private String start_time;
            private String end_time;
            private String new_spec;
            private Object ctime;
            private int utime;
            private Object isdel;
            private String commission;
            private int recommend_goods_id;
            private int want_goods_id;
            private int buy_limit;
            private Object brand_name;
            private String cat_name;
            private String image_url;
            @SerializedName("default")
            private DefaultBean defaultX;
            private ProductBean product;
            private int total_stock;
            private int is_buy_num;
            private String isfav;
            private String can_buy;
            private double vip_price;
            private int is_notice;
            private List<?> label_ids;
            private List<ProductsBean> products;
            private List<String> album;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
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

            public String getBrief() {
                return brief;
            }

            public void setBrief(String brief) {
                this.brief = brief;
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

            public String getImage_id() {
                return image_id;
            }

            public void setImage_id(String image_id) {
                this.image_id = image_id;
            }

            public int getGoods_cat_id() {
                return goods_cat_id;
            }

            public void setGoods_cat_id(int goods_cat_id) {
                this.goods_cat_id = goods_cat_id;
            }

            public int getGoods_type_id() {
                return goods_type_id;
            }

            public void setGoods_type_id(int goods_type_id) {
                this.goods_type_id = goods_type_id;
            }

            public int getBrand_id() {
                return brand_id;
            }

            public void setBrand_id(int brand_id) {
                this.brand_id = brand_id;
            }

            public int getIs_nomal_virtual() {
                return is_nomal_virtual;
            }

            public void setIs_nomal_virtual(int is_nomal_virtual) {
                this.is_nomal_virtual = is_nomal_virtual;
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

            public String getWeight() {
                return weight;
            }

            public void setWeight(String weight) {
                this.weight = weight;
            }

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public SpesDescBean getSpes_desc() {
                return spes_desc;
            }

            public void setSpes_desc(SpesDescBean spes_desc) {
                this.spes_desc = spes_desc;
            }

            public String getParams() {
                return params;
            }

            public void setParams(String params) {
                this.params = params;
            }

            public String getService() {
                return service;
            }

            public void setService(String service) {
                this.service = service;
            }

            public int getComments_count() {
                return comments_count;
            }

            public void setComments_count(int comments_count) {
                this.comments_count = comments_count;
            }

            public int getView_count() {
                return view_count;
            }

            public void setView_count(int view_count) {
                this.view_count = view_count;
            }

            public int getBuy_count() {
                return buy_count;
            }

            public void setBuy_count(int buy_count) {
                this.buy_count = buy_count;
            }

            public Object getXuni_num() {
                return xuni_num;
            }

            public void setXuni_num(Object xuni_num) {
                this.xuni_num = xuni_num;
            }

            public Object getUptime() {
                return uptime;
            }

            public void setUptime(Object uptime) {
                this.uptime = uptime;
            }

            public Object getDowntime() {
                return downtime;
            }

            public void setDowntime(Object downtime) {
                this.downtime = downtime;
            }

            public int getSort() {
                return sort;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }

            public int getIs_recommend() {
                return is_recommend;
            }

            public void setIs_recommend(int is_recommend) {
                this.is_recommend = is_recommend;
            }

            public int getIs_hot() {
                return is_hot;
            }

            public void setIs_hot(int is_hot) {
                this.is_hot = is_hot;
            }

            public int getIs_tqm() {
                return is_tqm;
            }

            public void setIs_tqm(int is_tqm) {
                this.is_tqm = is_tqm;
            }

            public int getSuccess_num() {
                return success_num;
            }

            public void setSuccess_num(int success_num) {
                this.success_num = success_num;
            }

            public String getStart_time() {
                return start_time;
            }

            public void setStart_time(String start_time) {
                this.start_time = start_time;
            }

            public String getEnd_time() {
                return end_time;
            }

            public void setEnd_time(String end_time) {
                this.end_time = end_time;
            }

            public String getNew_spec() {
                return new_spec;
            }

            public void setNew_spec(String new_spec) {
                this.new_spec = new_spec;
            }

            public Object getCtime() {
                return ctime;
            }

            public void setCtime(Object ctime) {
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

            public String getCommission() {
                return commission;
            }

            public void setCommission(String commission) {
                this.commission = commission;
            }

            public int getRecommend_goods_id() {
                return recommend_goods_id;
            }

            public void setRecommend_goods_id(int recommend_goods_id) {
                this.recommend_goods_id = recommend_goods_id;
            }

            public int getWant_goods_id() {
                return want_goods_id;
            }

            public void setWant_goods_id(int want_goods_id) {
                this.want_goods_id = want_goods_id;
            }

            public int getBuy_limit() {
                return buy_limit;
            }

            public void setBuy_limit(int buy_limit) {
                this.buy_limit = buy_limit;
            }

            public Object getBrand_name() {
                return brand_name;
            }

            public void setBrand_name(Object brand_name) {
                this.brand_name = brand_name;
            }

            public String getCat_name() {
                return cat_name;
            }

            public void setCat_name(String cat_name) {
                this.cat_name = cat_name;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public DefaultBean getDefaultX() {
                return defaultX;
            }

            public void setDefaultX(DefaultBean defaultX) {
                this.defaultX = defaultX;
            }

            public ProductBean getProduct() {
                return product;
            }

            public void setProduct(ProductBean product) {
                this.product = product;
            }

            public int getTotal_stock() {
                return total_stock;
            }

            public void setTotal_stock(int total_stock) {
                this.total_stock = total_stock;
            }

            public int getIs_buy_num() {
                return is_buy_num;
            }

            public void setIs_buy_num(int is_buy_num) {
                this.is_buy_num = is_buy_num;
            }

            public String getIsfav() {
                return isfav;
            }

            public void setIsfav(String isfav) {
                this.isfav = isfav;
            }

            public String getCan_buy() {
                return can_buy;
            }

            public void setCan_buy(String can_buy) {
                this.can_buy = can_buy;
            }

            public double getVip_price() {
                return vip_price;
            }

            public void setVip_price(double vip_price) {
                this.vip_price = vip_price;
            }

            public int getIs_notice() {
                return is_notice;
            }

            public void setIs_notice(int is_notice) {
                this.is_notice = is_notice;
            }

            public List<?> getLabel_ids() {
                return label_ids;
            }

            public void setLabel_ids(List<?> label_ids) {
                this.label_ids = label_ids;
            }

            public List<ProductsBean> getProducts() {
                return products;
            }

            public void setProducts(List<ProductsBean> products) {
                this.products = products;
            }

            public List<String> getAlbum() {
                return album;
            }

            public void setAlbum(List<String> album) {
                this.album = album;
            }

            public static class SpesDescBean {
                /**
                 * 净含量 : {"195841":"480g"}
                 */

                private 净含量Bean 净含量;

                public 净含量Bean get净含量() {
                    return 净含量;
                }

                public void set净含量(净含量Bean 净含量) {
                    this.净含量 = 净含量;
                }

                public static class 净含量Bean {
                    /**
                     * 195841 : 480g
                     */

                    @SerializedName("195841")
                    private String _$195841;

                    public String get_$195841() {
                        return _$195841;
                    }

                    public void set_$195841(String _$195841) {
                        this._$195841 = _$195841;
                    }
                }
            }

            public static class DefaultBean {
                /**
                 * id : 9711
                 * goods_id : 1505
                 * barcode : null
                 * sn : P6081932808722
                 * price : 16.60
                 * costprice : 15.60
                 * mktprice : 0.00
                 * marketable : 2
                 * stock : 285
                 * freeze_stock : 0
                 * spes_desc : 净含量:480g
                 * is_defalut : 1
                 * image_id :
                 * isdel : null
                 * name : 龙王豆浆480g速溶原味/甜味豆奶粉营养早餐无蔗糖无渣
                 * buy_limit : 0
                 * bn : G6081932808665
                 * image_path : http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931865fdb14a25f0dd.jpg
                 * total_stock : 285
                 * grade_price : []
                 * grade_info : []
                 * default_spes_desc : {"净含量":{"480g":{"name":"480g","is_default":true}}}
                 * amount : 16.60
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
                private DefaultSpesDescBean default_spes_desc;
                private String amount;
                private int promotion_amount;
                private List<?> grade_price;
                private List<?> grade_info;
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

                public List<?> getGrade_info() {
                    return grade_info;
                }

                public void setGrade_info(List<?> grade_info) {
                    this.grade_info = grade_info;
                }

                public List<?> getPromotion_list() {
                    return promotion_list;
                }

                public void setPromotion_list(List<?> promotion_list) {
                    this.promotion_list = promotion_list;
                }

                public static class DefaultSpesDescBean {
                    /**
                     * 净含量 : {"480g":{"name":"480g","is_default":true}}
                     */

                    private 净含量BeanX 净含量;

                    public 净含量BeanX get净含量() {
                        return 净含量;
                    }

                    public void set净含量(净含量BeanX 净含量) {
                        this.净含量 = 净含量;
                    }

                    public static class 净含量BeanX {
                        /**
                         * 480g : {"name":"480g","is_default":true}
                         */

                        @SerializedName("480g")
                        private _$480gBean _$480g;

                        public _$480gBean get_$480g() {
                            return _$480g;
                        }

                        public void set_$480g(_$480gBean _$480g) {
                            this._$480g = _$480g;
                        }

                        public static class _$480gBean {
                            /**
                             * name : 480g
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

            public static class ProductBean {
                /**
                 * id : 9711
                 * goods_id : 1505
                 * barcode : null
                 * sn : P6081932808722
                 * price : 16.60
                 * costprice : 15.60
                 * mktprice : 0.00
                 * marketable : 2
                 * stock : 285
                 * spes_desc : 净含量:480g
                 * is_defalut : 1
                 * image_id :
                 * isdel : null
                 * name : 龙王豆浆480g速溶原味/甜味豆奶粉营养早餐无蔗糖无渣
                 * buy_limit : 0
                 * bn : G6081932808665
                 * image_path : http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931865fdb14a25f0dd.jpg
                 * total_stock : 285
                 * grade_price : []
                 * grade_info : []
                 * default_spes_desc : {"净含量":{"480g":{"name":"480g","is_default":true}}}
                 * amount : 16.60
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
                private String spes_desc;
                private int is_defalut;
                private String image_id;
                private Object isdel;
                private String name;
                private int buy_limit;
                private String bn;
                private String image_path;
                private int total_stock;
                private DefaultSpesDescBeanX default_spes_desc;
                private String amount;
                private int promotion_amount;
                private List<?> grade_price;
                private List<?> grade_info;
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

                public DefaultSpesDescBeanX getDefault_spes_desc() {
                    return default_spes_desc;
                }

                public void setDefault_spes_desc(DefaultSpesDescBeanX default_spes_desc) {
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

                public List<?> getGrade_info() {
                    return grade_info;
                }

                public void setGrade_info(List<?> grade_info) {
                    this.grade_info = grade_info;
                }

                public List<?> getPromotion_list() {
                    return promotion_list;
                }

                public void setPromotion_list(List<?> promotion_list) {
                    this.promotion_list = promotion_list;
                }

                public static class DefaultSpesDescBeanX {
                    /**
                     * 净含量 : {"480g":{"name":"480g","is_default":true}}
                     */

                    private 净含量BeanXX 净含量;

                    public 净含量BeanXX get净含量() {
                        return 净含量;
                    }

                    public void set净含量(净含量BeanXX 净含量) {
                        this.净含量 = 净含量;
                    }

                    public static class 净含量BeanXX {
                        /**
                         * 480g : {"name":"480g","is_default":true}
                         */

                        @SerializedName("480g")
                        private _$480gBeanX _$480g;

                        public _$480gBeanX get_$480g() {
                            return _$480g;
                        }

                        public void set_$480g(_$480gBeanX _$480g) {
                            this._$480g = _$480g;
                        }

                        public static class _$480gBeanX {
                            /**
                             * name : 480g
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

            public static class ProductsBean {
                /**
                 * id : 9711
                 * goods_id : 1505
                 * barcode : null
                 * sn : P6081932808722
                 * price : 16.60
                 * costprice : 15.60
                 * mktprice : 0.00
                 * marketable : 2
                 * stock : 285
                 * freeze_stock : 0
                 * spes_desc : 净含量:480g
                 * is_defalut : 1
                 * image_id :
                 * isdel : null
                 * name : 龙王豆浆480g速溶原味/甜味豆奶粉营养早餐无蔗糖无渣
                 * buy_limit : 0
                 * bn : G6081932808665
                 * image_path : http://img.ywzyit.com/static/uploads/images/2020/12/17/16081931865fdb14a25f0dd.jpg
                 * total_stock : 285
                 * grade_price : []
                 * grade_info : []
                 * default_spes_desc : {"净含量":{"480g":{"name":"480g","is_default":true}}}
                 * amount : 16.60
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
                private DefaultSpesDescBeanXX default_spes_desc;
                private String amount;
                private int promotion_amount;
                private List<?> grade_price;
                private List<?> grade_info;
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

                public DefaultSpesDescBeanXX getDefault_spes_desc() {
                    return default_spes_desc;
                }

                public void setDefault_spes_desc(DefaultSpesDescBeanXX default_spes_desc) {
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

                public List<?> getGrade_info() {
                    return grade_info;
                }

                public void setGrade_info(List<?> grade_info) {
                    this.grade_info = grade_info;
                }

                public List<?> getPromotion_list() {
                    return promotion_list;
                }

                public void setPromotion_list(List<?> promotion_list) {
                    this.promotion_list = promotion_list;
                }

                public static class DefaultSpesDescBeanXX {
                    /**
                     * 净含量 : {"480g":{"name":"480g","is_default":true}}
                     */

                    private 净含量BeanXXX 净含量;

                    public 净含量BeanXXX get净含量() {
                        return 净含量;
                    }

                    public void set净含量(净含量BeanXXX 净含量) {
                        this.净含量 = 净含量;
                    }

                    public static class 净含量BeanXXX {
                        /**
                         * 480g : {"name":"480g","is_default":true}
                         */

                        @SerializedName("480g")
                        private _$480gBeanXX _$480g;

                        public _$480gBeanXX get_$480g() {
                            return _$480g;
                        }

                        public void set_$480g(_$480gBeanXX _$480g) {
                            this._$480g = _$480g;
                        }

                        public static class _$480gBeanXX {
                            /**
                             * name : 480g
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
