package com.pinnoocle.weshare.bean;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.pinnoocle.weshare.adapter.RawStringJsonAdapter;

import java.util.List;

public class GoodsBean {

    /**
     * status : true
     * msg : 查询成功
     * data : {"list":[{"id":1541,"bn":"G6087109327893","name":"2斤小核肉厚桂圆500g*2 休闲零食农产品龙眼干","brief":"不免邮区域:海外,台湾,澳门,\n香港,西藏,新疆,宁夏,青海,内蒙古","price":"27.00","costprice":"25.80","mktprice":"0.00","image_id":"1672061b623bfe9f1915e8bb0a78f85b","goods_cat_id":112,"goods_type_id":48,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":163,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109205fe2fb08f1245.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb090831f.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb09121a2.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb0932bdb.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb0940700.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb094ab5b.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb095da30.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb096d31a.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb09769e4.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb098bfe8.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb099b20b.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb09a6703.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb09b0fb0.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb09be8a6.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb09c7b9e.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087082265fe2f082987b6.png\" alt=\"16087082265fe2f082987b6.png\"/><\/p>","spes_desc":{"规格":{"198969":"500g*2袋【共2斤】"}},"params":"","service":"1,4,6,7","comments_count":0,"view_count":0,"buy_count":27,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":1,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:315:{i:198968;a:1:{i:0;s:17:\"蓝色纸盒20朵\";}i:198969;a:1:{i:0;s:22:\"500g*2袋【共2斤】\";}i:198970;a:1:{i:0;s:9:\"经典黑\";}i:198971;a:1:{i:0;s:23:\"升级波浪款10片装\";}i:198972;a:1:{i:0;s:42:\"特大号带镜子三层，单双肩两用\";}i:198973;a:1:{i:0;s:18:\"迷你小号手提\";}i:198974;a:1:{i:0;s:24:\"小号三层，可单肩\";}i:198975;a:1:{i:0;s:30:\"中号三层，单双肩两用\";}i:198976;a:1:{i:0;s:30:\"大号三层，单双肩两用\";}i:198977;a:1:{i:0;s:39:\"大号带镜子三层，单双肩两用\";}i:198978;a:1:{i:0;s:20:\"大胆爱love3只装\";}i:198979;a:1:{i:0;s:22:\"大胆爱 LOVE10只装\";}i:198980;a:1:{i:0;s:24:\"杜蕾斯 活力12只装\";}i:198981;a:1:{i:0;s:19:\"超薄-隐 12只装\";}i:198982;a:1:{i:0;s:23:\"杜蕾斯 活力3只装\";}i:198983;a:1:{i:0;s:18:\"超薄-隐 3只装\";}i:198984;a:1:{i:0;s:17:\"长55宽35高35cm\";}i:198985;a:1:{i:0;s:12:\"熊掌粉色\";}i:198986;a:1:{i:0;s:12:\"熊掌灰色\";}i:198987;a:1:{i:0;s:12:\"熊掌棕色\";}i:198988;a:1:{i:0;s:9:\"萌小猪\";}i:198989;a:1:{i:0;s:9:\"灰龙猫\";}i:198990;a:1:{i:0;s:9:\"小浣熊\";}i:198991;a:1:{i:0;s:19:\"黑色-铅色五金\";}i:198992;a:1:{i:0;s:19:\"黑色-金色五金\";}i:198993;a:1:{i:0;s:18:\" 单开门56*120cm\";}i:198994;a:1:{i:0;s:23:\"侧开门冰箱56*120cm\";}i:198995;a:1:{i:0;s:23:\"双开门冰箱70*170cm\";}i:198996;a:1:{i:0;s:6:\"红色\";}i:198997;a:1:{i:0;s:6:\"杏色\";}i:198998;a:1:{i:0;s:27:\"【标准22管径】53-80cm\";}i:198999;a:1:{i:0;s:29:\"【标准22管径】70-120cm \";}i:199000;a:1:{i:0;s:29:\"【标准22管径】90-160cm \";}i:199001;a:1:{i:0;s:30:\"【标准22管径】110-200cm \";}i:199002;a:1:{i:0;s:30:\"【标准22管径】128-240cm \";}i:199003;a:1:{i:0;s:30:\"【标准22管径】150-280cm \";}i:199004;a:1:{i:0;s:27:\"【标准25管径】50-80cm\";}i:199005;a:1:{i:0;s:29:\"【标准25管径】70-120cm \";}i:199006;a:1:{i:0;s:29:\"【标准25管径】90-160cm \";}i:199007;a:1:{i:0;s:30:\"【标准25管径】110-200cm \";}i:199008;a:1:{i:0;s:30:\"【标准25管径】128-240cm \";}i:199009;a:1:{i:0;s:30:\"【标准25管径】150-280cm \";}i:199010;a:1:{i:0;s:14:\"1手柄3卷纸\";}i:199011;a:1:{i:0;s:12:\"金色小熊\";}i:199012;a:1:{i:0;s:15:\"玫瑰金小熊\";}i:199013;a:1:{i:0;s:12:\"玫粉小熊\";}i:199014;a:1:{i:0;s:12:\"银色小熊\";}i:199015;a:1:{i:0;s:12:\"橘色小熊\";}i:199016;a:1:{i:0;s:12:\"蓝色佩奇\";}i:199017;a:1:{i:0;s:12:\"粉色佩奇\";}i:199018;a:1:{i:0;s:13:\"黄色表情1\";}i:199019;a:1:{i:0;s:13:\"黄色表情3\";}i:199020;a:1:{i:0;s:6:\"黄鸭\";}i:199021;a:1:{i:0;s:6:\"蓝鸭\";}i:199022;a:1:{i:0;s:6:\"粉鸭\";}i:199023;a:1:{i:0;s:15:\"小雏菊黑色\";}i:199024;a:1:{i:0;s:15:\"小雏菊粉色\";}i:199025;a:1:{i:0;s:15:\"小雏菊橙色\";}i:199026;a:1:{i:0;s:15:\"新款蓝色熊\";}i:199027;a:1:{i:0;s:15:\"新款黄色熊\";}i:199028;a:1:{i:0;s:15:\"粉色小兔子\";}i:199029;a:1:{i:0;s:15:\"紫色小兔子\";}i:199030;a:1:{i:0;s:18:\"玫红色小兔子\";}i:199031;a:1:{i:0;s:12:\"红色雏菊\";}i:199032;a:1:{i:0;s:12:\"红色鸭子\";}i:199033;a:1:{i:0;s:12:\"网红黑色\";}i:199034;a:1:{i:0;s:12:\"网红红色\";}i:199035;a:1:{i:0;s:12:\"网红粉色\";}i:199036;a:1:{i:0;s:15:\"网红玫红色\";}i:199037;a:1:{i:0;s:15:\"纸盒人红色\";}i:199038;a:1:{i:0;s:15:\"纸盒人白色\";}i:199039;a:1:{i:0;s:15:\"纸盒人绿色\";}i:199040;a:1:{i:0;s:15:\"纸盒人橘色\";}i:199041;a:1:{i:0;s:15:\"纸盒人黑色\";}i:199042;a:1:{i:0;s:24:\"歪头鸭鸭姜黄单肩\";}i:199043;a:1:{i:0;s:21:\"空心兔米白单肩\";}i:199044;a:1:{i:0;s:31:\"wink鸭鸭米白可调节斜跨\";}i:199045;a:1:{i:0;s:22:\"wink鸭鸭米白单肩\";}i:199046;a:1:{i:0;s:36:\"大眼睛鸭鸭米白可调节斜跨\";}i:199047;a:1:{i:0;s:27:\"大眼睛鸭鸭米白单肩\";}i:199048;a:1:{i:0;s:30:\"大眼睛鸭鸭米白小手提\";}i:199049;a:1:{i:0;s:27:\"歪头鸭鸭绿色小手提\";}i:199050;a:1:{i:0;s:27:\"歪头鸭鸭粉色小手提\";}i:199051;a:1:{i:0;s:27:\"歪头鸭鸭藏青小手提\";}i:199052;a:1:{i:0;s:24:\"歪头鸭鸭黄小手提\";}i:199053;a:1:{i:0;s:27:\"歪头鸭鸭米白小手提\";}i:199054;a:1:{i:0;s:24:\"空心兔米白小手提\";}i:199055;a:1:{i:0;s:25:\"wink鸭鸭米白小手提\";}i:199056;a:1:{i:0;s:7:\"200ml*3\";}i:199057;a:1:{i:0;s:26:\"1000ML营养柔顺(黄色)\";}i:199058;a:1:{i:0;s:30:\"1000ML多效修护（粉色）\";}i:199059;a:1:{i:0;s:30:\"1000ML焗油顺滑（蓝色）\";}i:199060;a:1:{i:0;s:30:\"1000ML去屑柔顺（橙色）\";}i:199061;a:1:{i:0;s:5:\"50g*4\";}i:199062;a:1:{i:0;s:17:\" 700g深润去屑\";}i:199063;a:1:{i:0;s:16:\"700g柔顺亮泽\";}i:199064;a:1:{i:0;s:16:\"700g柔韧丝滑\";}i:199065;a:1:{i:0;s:33:\"北美留兰120g+竹炭薄荷120g\";}i:199066;a:1:{i:0;s:33:\"竹炭薄荷120g+茉莉白茶120g\";}i:199067;a:1:{i:0;s:33:\"北美留兰120g+茉莉白茶120g\";}i:199068;a:1:{i:0;s:18:\"北美留兰120g*2\";}i:199069;a:1:{i:0;s:18:\"竹炭薄荷120g*2\";}i:199070;a:1:{i:0;s:18:\"茉莉白茶120g*2\";}i:199071;a:1:{i:0;s:6:\"粉色\";}i:199072;a:1:{i:0;s:6:\"蓝色\";}i:199073;a:1:{i:0;s:6:\"灰色\";}i:199074;a:1:{i:0;s:8:\"白色  \";}i:199075;a:1:{i:0;s:8:\"红色  \";}i:199076;a:1:{i:0;s:8:\"黑色  \";}i:199077;a:1:{i:0;s:11:\"豆粉色  \";}i:199078;a:1:{i:0;s:14:\"深卡其色  \";}i:199079;a:1:{i:0;s:8:\"咖色  \";}i:199080;a:1:{i:0;s:8:\"杏色  \";}i:199081;a:1:{i:0;s:14:\"20条双层款\";}i:199082;a:1:{i:0;s:21:\"3斤装中果/约5个\";}i:199083;a:1:{i:0;s:23:\"5斤装中果/约8-9个\";}i:199084;a:1:{i:0;s:23:\"5斤装大果/约3-7个\";}i:199085;a:1:{i:0;s:24:\"6斤装中果/约9-10个\";}i:199086;a:1:{i:0;s:23:\"6斤装大果/约4-8个\";}i:199087;a:1:{i:0;s:25:\"5斤装小果/约11-12个\";}i:199088;a:1:{i:0;s:22:\"8斤装小果/约18个\";}i:199089;a:1:{i:0;s:22:\"8斤装中果/约14个\";}i:199090;a:1:{i:0;s:22:\"8斤装大果/约10个\";}i:199091;a:1:{i:0;s:11:\"12粒/盒*2\";}i:199092;a:1:{i:0;s:60:\"默认黑色挂篮【需要白色，蓝色请自行备注】\";}i:199093;a:1:{i:0;s:67:\"默认黑色挂篮+挂钩【需要白色，蓝色请自行备注】\";}i:199094;a:1:{i:0;s:7:\"粉色 \";}i:199095;a:1:{i:0;s:7:\"米色 \";}i:199096;a:1:{i:0;s:7:\"浅蓝 \";}i:199097;a:1:{i:0;s:7:\"深蓝 \";}i:199098;a:1:{i:0;s:48:\"共14只【10母蟹3两/只，4公蟹4两/只】\";}i:199099;a:1:{i:0;s:12:\" 70克100张\";}i:199100;a:1:{i:0;s:11:\"80克100张\";}i:199101;a:1:{i:0;s:9:\"100g*4块\";}i:199102;a:1:{i:0;s:7:\"白色 \";}i:199103;a:1:{i:0;s:7:\"黑色 \";}i:199104;a:1:{i:0;s:18:\"金属黑无声版\";}i:199105;a:1:{i:0;s:18:\"星辰黑无声版\";}i:199106;a:1:{i:0;s:9:\"酒红色\";}i:199107;a:1:{i:0;s:9:\"浅灰色\";}i:199108;a:1:{i:0;s:6:\"黑色\";}i:199109;a:1:{i:0;s:9:\"粉红色\";}i:199110;a:1:{i:0;s:35:\"KS-739定焦手电筒+USB线+彩盒\";}i:199111;a:1:{i:0;s:35:\"金色（6味6饼）明月照我还\";}i:199112;a:1:{i:0;s:35:\"红色（6味6饼）月上柳梢头\";}i:199113;a:1:{i:0;s:44:\"蓝色（6味6饼）但愿人长久\t19.89元\";}i:199114;a:1:{i:0;s:14:\"白色2L容量\";}i:199115;a:1:{i:0;s:39:\"银色1L(含)-2L(含)高硼硅玻璃壶\";}i:199116;a:1:{i:0;s:22:\"洋甘菊味-10片/盒\";}i:199117;a:1:{i:0;s:22:\"薰衣草味-10片/盒\";}i:199118;a:1:{i:0;s:19:\"玫瑰味-10片/盒\";}i:199119;a:1:{i:0;s:16:\"无香-10片/盒\";}i:199120;a:1:{i:0;s:32:\"酱香味500g【18袋约54颗】\";}i:199121;a:1:{i:0;s:18:\"麻辣味290g*2盒\";}i:199122;a:1:{i:0;s:55:\"默认01肤白色【02粉白色，请自行备注！】\";}i:199123;a:1:{i:0;s:16:\"原味360ml*6瓶\";}i:199124;a:1:{i:0;s:19:\"蜜桃味360ml*6瓶\";}i:199125;a:1:{i:0;s:19:\"柠檬味360ml*6瓶\";}i:199126;a:1:{i:0;s:17:\"原味360ml*24瓶\";}i:199127;a:1:{i:0;s:20:\"蜜桃味360ml*24瓶\";}i:199128;a:1:{i:0;s:20:\"柠檬味360ml*24瓶\";}i:199129;a:1:{i:0;s:9:\"100g*2袋\";}i:199130;a:1:{i:0;s:118:\"默认【氺寇晚香玉.深层补水一盒】【国色牡丹亮肤，惠心兰花提拉紧致，请自行备注！】\";}i:199131;a:1:{i:0;s:30:\"食品级PP碗-带叉勺吸盘\";}i:199132;a:1:{i:0;s:9:\"1盒20只\";}i:199133;a:1:{i:0;s:40:\"百鸟朝凤系列（广式6饼6味)300g\";}i:199134;a:1:{i:0;s:11:\"30包/袋*2\";}i:199135;a:1:{i:0;s:64:\"2套刀叉勺三件套（颜色有蓝、黑、粉、绿可选）\";}i:199136;a:1:{i:0;s:19:\"榴莲饼252g小盒\";}i:199137;a:1:{i:0;s:19:\"榴莲饼500g大盒\";}i:199138;a:1:{i:0;s:25:\"灰枣夹核桃500g一箱\";}i:199139;a:1:{i:0;s:25:\"骏枣夹核桃500g一箱\";}i:199140;a:1:{i:0;s:32:\"实惠款礼盒（8包装864g）\";}i:199141;a:1:{i:0;s:34:\"实力款礼盒（10包装1080g）\";}i:199142;a:1:{i:0;s:34:\"豪华款礼盒（12包装1306g）\";}i:199143;a:1:{i:0;s:34:\"尊享款礼盒（14包装1522g）\";}i:199144;a:1:{i:0;s:28:\"零食礼盒54包【1076g】\";}i:199145;a:1:{i:0;s:14:\"100条共1600g\";}i:199146;a:1:{i:0;s:11:\"310mL*12瓶\";}i:199147;a:1:{i:0;s:11:\"100ml*20瓶\";}i:199148;a:1:{i:0;s:27:\"500g/10包20片黑麦面包\";}i:199149;a:1:{i:0;s:28:\"1000g/20包40片黑麦面包\";}i:199150;a:1:{i:0;s:27:\"500g/10包20片谷物面包\";}i:199151;a:1:{i:0;s:28:\"1000g/20包40片谷物面包\";}i:199152;a:1:{i:0;s:23:\"4枚220g【红豆味】\";}i:199153;a:1:{i:0;s:23:\"4枚220g【紫薯味】\";}i:199154;a:1:{i:0;s:23:\"4枚220g【莲蓉味】\";}i:199155;a:1:{i:0;s:23:\"6枚330g【红豆味】\";}i:199156;a:1:{i:0;s:23:\"6枚330g【紫薯味】\";}i:199157;a:1:{i:0;s:23:\"6枚330g【莲蓉味】\";}i:199158;a:1:{i:0;s:23:\"6枚330g【混合装】\";}i:199159;a:1:{i:0;s:23:\"8枚440g【紫薯味】\";}i:199160;a:1:{i:0;s:23:\"8枚440g【红豆味】\";}i:199161;a:1:{i:0;s:23:\"8枚440g【莲蓉味】\";}i:199162;a:1:{i:0;s:23:\"8枚440g【混合装】\";}i:199163;a:1:{i:0;s:25:\"12枚660g 【紫薯味】\";}i:199164;a:1:{i:0;s:25:\"12枚660g 【红豆味】\";}i:199165;a:1:{i:0;s:25:\"12枚660g 【莲蓉味】\";}i:199166;a:1:{i:0;s:25:\"12枚660g 【混合装】\";}i:199167;a:1:{i:0;s:9:\"210g*2袋\";}i:199168;a:1:{i:0;s:21:\"很麻很辣26g*30包\";}i:199169;a:1:{i:0;s:20:\"散称-香辣味500g\";}i:199170;a:1:{i:0;s:20:\"散称-麻辣味500g\";}i:199171;a:1:{i:0;s:20:\"散称-酸辣味500g\";}i:199172;a:1:{i:0;s:16:\"混合口味500g\";}i:199173;a:1:{i:0;s:23:\"散称-风吃海带500g\";}i:199174;a:1:{i:0;s:33:\"明星版嗨吃家酸辣粉143g*6\";}i:199175;a:1:{i:0;s:21:\"椒麻锅巴粉113g*6\";}i:199176;a:1:{i:0;s:15:\"花甲粉145g*6\";}i:199177;a:1:{i:0;s:27:\"跳跳鱼丸酸辣粉165g*6\";}i:199178;a:1:{i:0;s:9:\"320g*5袋\";}i:199179;a:1:{i:0;s:9:\"320g*2袋\";}i:199180;a:1:{i:0;s:9:\"150*200cm\";}i:199181;a:1:{i:0;s:9:\"180*220cm\";}i:199182;a:1:{i:0;s:9:\"200*230cm\";}i:199183;a:1:{i:0;s:9:\"220*230cm\";}i:199184;a:1:{i:0;s:15:\"万能032蓝色\";}i:199185;a:1:{i:0;s:15:\"万能032绿色\";}i:199186;a:1:{i:0;s:15:\"万能032粉色\";}i:199187;a:1:{i:0;s:15:\"万能036蓝色\";}i:199188;a:1:{i:0;s:15:\"万能036绿色\";}i:199189;a:1:{i:0;s:15:\"万能036粉色\";}i:199190;a:1:{i:0;s:15:\"万能039蓝色\";}i:199191;a:1:{i:0;s:15:\"万能039绿色\";}i:199192;a:1:{i:0;s:15:\"万能039粉色\";}i:199193;a:1:{i:0;s:23:\" 皇家古龙黑色50ML\";}i:199194;a:1:{i:0;s:22:\"皇家古龙白色50ML\";}i:199195;a:1:{i:0;s:22:\"皇家古龙蓝色50ML\";}i:199196;a:1:{i:0;s:22:\"皇家古龙黄色50ML\";}i:199197;a:1:{i:0;s:5:\"30包\";}i:199198;a:1:{i:0;s:5:\"72包\";}i:199199;a:1:{i:0;s:11:\"整提42卷\";}i:199200;a:1:{i:0;s:5:\"10包\";}i:199201;a:1:{i:0;s:5:\"40包\";}i:199202;a:1:{i:0;s:17:\"紫色纸盒20朵\";}i:199203;a:1:{i:0;s:14:\"瓜片1级1号\";}i:199204;a:1:{i:0;s:14:\"瓜片1级2号\";}i:199205;a:1:{i:0;s:10:\"瓜片2级\";}i:199206;a:1:{i:0;s:10:\"瓜片3级\";}i:199207;a:1:{i:0;s:43:\"小动物四维发热+赠送护膝小盖毯\";}i:199208;a:1:{i:0;s:49:\"森系小动物四维发热+赠送护膝小盖毯\";}i:199209;a:1:{i:0;s:49:\"田园小清新四维发热+赠送护膝小盖毯\";}i:199210;a:1:{i:0;s:49:\"插画小树林四维发热+赠送护膝小盖毯\";}i:199211;a:1:{i:0;s:30:\"白色烘干款（普通款）\";}i:199212;a:1:{i:0;s:30:\"粉色烘干款（普通款）\";}i:199213;a:1:{i:0;s:39:\"粉色杀菌烘干款（带紫外线）\";}i:199214;a:1:{i:0;s:39:\"白色杀菌烘干款（带紫外线）\";}i:199215;a:1:{i:0;s:12:\"两口之家\";}i:199216;a:1:{i:0;s:12:\"三口之家\";}i:199217;a:1:{i:0;s:12:\"四口之家\";}i:199218;a:1:{i:0;s:18:\"家用装7+1件套\";}i:199219;a:1:{i:0;s:16:\"中手卷40*60cm\";}i:199220;a:1:{i:0;s:13:\"小号45*70cm\";}i:199221;a:1:{i:0;s:13:\"中号56*80cm\";}i:199222;a:1:{i:0;s:17:\"特大号80*100cm\";}i:199223;a:1:{i:0;s:22:\"中号立体50*70*30cm\";}i:199224;a:1:{i:0;s:26:\"特大号立体80*100*38cm\";}i:199225;a:1:{i:0;s:6:\"运费\";}i:199226;a:1:{i:0;s:4:\"2支\";}i:199227;a:1:{i:0;s:4:\"3支\";}i:199228;a:1:{i:0;s:26:\"樱桃50*70cm*4个+1手泵\";}i:199229;a:1:{i:0;s:26:\"樱桃60*80cm*4个+1手泵\";}i:199230;a:1:{i:0;s:26:\"樱桃70*90cm*4个+1手泵\";}i:199231;a:1:{i:0;s:27:\"樱桃80*100cm*4个+1手泵\";}i:199232;a:1:{i:0;s:27:\"樱桃90*110cm*4个+1手泵\";}i:199233;a:1:{i:0;s:28:\"樱桃100*120cm*4个+1手泵\";}i:199234;a:1:{i:0;s:39:\"（樱桃）3大3中2小2手卷1手泵\t\";}i:199235;a:1:{i:0;s:30:\"（樱桃）4特大4中1手泵\";}i:199236;a:1:{i:0;s:45:\"（樱桃）3特大2大3中2小1电泵1手泵\";}i:199237;a:1:{i:0;s:33:\"（樱桃）6特大1电泵1手泵\";}i:199238;a:1:{i:0;s:27:\"（樱桃）5中5小1手泵\";}i:199239;a:1:{i:0;s:34:\"（樱桃）2特大3中3小1手泵\";}i:199240;a:1:{i:0;s:31:\"（樱桃）1大2中2小1手泵\";}i:199241;a:1:{i:0;s:38:\"（樱桃）1特大1大1中2小1电泵\";}i:199242;a:1:{i:0;s:31:\"（樱桃）2大2中2小1手泵\";}i:199243;a:1:{i:0;s:38:\"（樱桃）2大2中2小2手卷1手泵\";}i:199244;a:1:{i:0;s:52:\"（樱桃）2特大2大2中2小2特小1手泵1电泵\";}i:199245;a:1:{i:0;s:41:\"（樱桃）2特大2中3小3手卷1手泵\";}i:199246;a:1:{i:0;s:48:\"（樱桃）2特大3大3小3手卷1手泵1电泵\";}i:199247;a:1:{i:0;s:31:\"（樱桃）3大2中3小1手泵\";}i:199248;a:1:{i:0;s:27:\"（樱桃）4大4中1手泵\";}i:199249;a:1:{i:0;s:34:\"（樱桃）4特大2中2小1手泵\";}i:199250;a:1:{i:0;s:26:\"（樱桃）5特大1手泵\";}i:199251;a:1:{i:0;s:23:\"（樱桃）6大1手泵\";}i:199252;a:1:{i:0;s:23:\"（樱桃）7中1手泵\";}i:199253;a:1:{i:0;s:23:\"（樱桃）8小1手泵\";}i:199254;a:1:{i:0;s:34:\"（樱桃）3特大2中2小1手泵\";}i:199255;a:1:{i:0;s:41:\"（樱桃）3特大2中3小2手卷1手泵\";}i:199256;a:1:{i:0;s:34:\"（樱桃）4特大2中4小1手泵\";}i:199257;a:1:{i:0;s:41:\"（樱桃）2特大3中3小2手卷1手泵\";}i:199258;a:1:{i:0;s:9:\"经典装\";}i:199259;a:1:{i:0;s:18:\"升级装带支架\";}i:199260;a:1:{i:0;s:25:\"双面双效（1包蓝）\";}i:199261;a:1:{i:0;s:25:\"双面超柔（1包橙）\";}i:199262;a:1:{i:0;s:25:\"双面双效（2包蓝）\";}i:199263;a:1:{i:0;s:25:\"双面超柔（2包橙）\";}i:199264;a:1:{i:0;s:30:\"组合装（1包蓝+1包橙）\";}i:199265;a:1:{i:0;s:25:\"双面双效（3包蓝）\";}i:199266;a:1:{i:0;s:25:\"双面超柔（3包橙）\";}i:199267;a:1:{i:0;s:6:\"100粒\";}i:199268;a:1:{i:0;s:4:\"1盒\";}i:199269;a:1:{i:0;s:4:\"2盒\";}i:199270;a:1:{i:0;s:4:\"3盒\";}i:199271;a:1:{i:0;s:7:\"1000片\";}i:199272;a:1:{i:0;s:16:\"美妆蛋4枚装\";}i:199273;a:1:{i:0;s:7:\"1个头\";}i:199274;a:1:{i:0;s:7:\"2个头\";}i:199275;a:1:{i:0;s:7:\"3个头\";}i:199276;a:1:{i:0;s:7:\"4个头\";}i:199277;a:1:{i:0;s:7:\"5个头\";}i:199278;a:1:{i:0;s:7:\"6个头\";}i:199279;a:1:{i:0;s:10:\"带1块布\";}i:199280;a:1:{i:0;s:10:\"带3块布\";}i:199281;a:1:{i:0;s:10:\"带7块布\";}i:199282;a:1:{i:0;s:30:\"美规电源（国内通用）\";}}","ctime":null,"utime":1608711047,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"休闲零食","products":[{"id":9932,"goods_id":1541,"barcode":null,"sn":"P6087109327973","price":"27.00","costprice":"25.80","mktprice":"0.00","marketable":1,"stock":163,"freeze_stock":0,"spes_desc":"规格:500g*2袋【共2斤】","is_defalut":1,"image_id":"","isdel":null,"name":"2斤小核肉厚桂圆500g*2 休闲零食农产品龙眼干","buy_limit":0,"bn":"G6087109327893","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4da47b.jpg","total_stock":163,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"500g*2袋【共2斤】":{"name":"500g*2袋【共2斤】","is_default":true}}},"amount":"27.00","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4da47b.jpg","default":{"id":9932,"goods_id":1541,"barcode":null,"sn":"P6087109327973","price":"27.00","costprice":"25.80","mktprice":"0.00","marketable":1,"stock":163,"freeze_stock":0,"spes_desc":"规格:500g*2袋【共2斤】","is_defalut":1,"image_id":"","isdel":null,"name":"2斤小核肉厚桂圆500g*2 休闲零食农产品龙眼干","buy_limit":0,"bn":"G6087109327893","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4da47b.jpg","total_stock":163,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"500g*2袋【共2斤】":{"name":"500g*2袋【共2斤】","is_default":true}}},"amount":"27.00","promotion_list":[],"promotion_amount":0},"product":{"id":9932,"goods_id":1541,"barcode":null,"sn":"P6087109327973","price":"27.00","costprice":"25.80","mktprice":"0.00","marketable":1,"stock":163,"spes_desc":"规格:500g*2袋【共2斤】","is_defalut":1,"image_id":"","isdel":null,"name":"2斤小核肉厚桂圆500g*2 休闲零食农产品龙眼干","buy_limit":0,"bn":"G6087109327893","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4da47b.jpg","total_stock":163,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"500g*2袋【共2斤】":{"name":"500g*2袋【共2斤】","is_default":true}}},"amount":"27.00","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4da47b.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4c7154.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4bbbcf.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4d14b7.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4af414.jpg"],"total_stock":163,"is_buy_num":27,"isfav":"false","can_buy":"ok","vip_price":27,"is_notice":0},{"id":1518,"bn":"G6083494744183","name":"鸡蛋酥270g传统老式奶香味黑芝麻味鸡蛋卷手工老蛋卷","brief":"不免邮区域:海外,台湾,澳门,\n香港,西藏,新疆,青海,内蒙古","price":"12.50","costprice":"11.85","mktprice":"0.00","image_id":"859de913d1e06ed2919663073343e3b7","goods_cat_id":112,"goods_type_id":98,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":360,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083494345fdd76facd864.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083494355fdd76fb0ab21.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083494355fdd76fb592ad.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083494355fdd76fb9a380.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083494355fdd76fbb51b6.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083494365fdd76fc11dda.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083494365fdd76fc7749e.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083494365fdd76fc69b6e.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083494365fdd76fc8267f.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083494365fdd76fc903d3.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082833405fdc74cc8f0fe.png\" alt=\"16082833405fdc74cc8f0fe.png\"/><\/p>","spes_desc":{"口味":{"196968":"黑芝麻味270g","196969":"奶香味270g"}},"params":"","service":"1,4,6,7","comments_count":0,"view_count":0,"buy_count":24,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":1,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:29:{i:196967;a:1:{i:0;s:17:\"山核桃98g*3袋\";}i:196968;a:1:{i:0;s:16:\"黑芝麻味270g\";}i:196969;a:1:{i:0;s:13:\"奶香味270g\";}i:196970;a:1:{i:0;s:12:\" 16条*30克\";}i:196971;a:1:{i:0;s:31:\"平底锅巴300g/箱（14包）\";}i:196972;a:1:{i:0;s:34:\"大黄米锅巴350g/箱（12包）\";}i:196973;a:1:{i:0;s:37:\"北海稻场果派350g/箱（38个）\";}i:196974;a:1:{i:0;s:37:\"每日坚果米酥278g/箱（30个）\";}i:196975;a:1:{i:0;s:20:\"奶油味100g/袋*10\";}i:196976;a:1:{i:0;s:20:\"香橙味100g/袋*10\";}i:196977;a:1:{i:0;s:20:\"草莓味100g/袋*10\";}i:196978;a:1:{i:0;s:59:\"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3\";}i:196979;a:1:{i:0;s:13:\"辣白菜500g\";}i:196980;a:1:{i:0;s:27:\"原味150克/袋（15枚）\";}i:196981;a:1:{i:0;s:27:\"香辣150克/袋（15枚）\";}i:196982;a:1:{i:0;s:29:\"1.26千克/桶【约120支】\";}i:196983;a:1:{i:0;s:22:\"香辣铁蛋15g*30包\t\";}i:196984;a:1:{i:0;s:19:\"盐焗味15g*30包\t\";}i:196985;a:1:{i:0;s:22:\"知心卤味20g*30包\t\";}i:196986;a:1:{i:0;s:19:\"泡椒味20g*30包\t\";}i:196987;a:1:{i:0;s:18:\"混合口味30包\t\";}i:196988;a:1:{i:0;s:10:\"520g桶装\";}i:196989;a:1:{i:0;s:15:\"原味98g*3袋\t\";}i:196990;a:1:{i:0;s:18:\"海盐味98g*3袋\t\";}i:196991;a:1:{i:0;s:24:\"蜂蜜黄油味98g*3袋\t\";}i:196992;a:1:{i:0;s:18:\"焦糖味98g*3袋\t\";}i:196993;a:1:{i:0;s:18:\"芝士味98g*3袋\t\";}i:196994;a:1:{i:0;s:18:\"藤椒味98g*3袋\t\";}i:196995;a:1:{i:0;s:64:\"3袋不同口味（请备注口味，没备注口味随机发）\";}}","ctime":null,"utime":1608349571,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"休闲零食","products":[{"id":9793,"goods_id":1518,"barcode":null,"sn":"P6083494744245","price":"12.50","costprice":"11.85","mktprice":"0.00","marketable":2,"stock":185,"freeze_stock":0,"spes_desc":"口味:黑芝麻味270g","is_defalut":1,"image_id":"","isdel":null,"name":"鸡蛋酥270g传统老式奶香味黑芝麻味鸡蛋卷手工老蛋卷","buy_limit":0,"bn":"G6083494744183","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083493425fdd769e64b22.jpg","total_stock":185,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"黑芝麻味270g":{"name":"黑芝麻味270g","is_default":true},"奶香味270g":{"name":"奶香味270g","product_id":9794}}},"amount":"12.50","promotion_list":[],"promotion_amount":0},{"id":9794,"goods_id":1518,"barcode":null,"sn":"P6083494744292","price":"12.50","costprice":"11.85","mktprice":"0.00","marketable":2,"stock":175,"freeze_stock":0,"spes_desc":"口味:奶香味270g","is_defalut":2,"image_id":"","isdel":null,"name":"鸡蛋酥270g传统老式奶香味黑芝麻味鸡蛋卷手工老蛋卷","buy_limit":0,"bn":"G6083494744183","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083493425fdd769e64b22.jpg","total_stock":175,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"黑芝麻味270g":{"name":"黑芝麻味270g","product_id":9793},"奶香味270g":{"name":"奶香味270g","is_default":true}}},"amount":"12.50","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083493425fdd769e64b22.jpg","default":{"id":9793,"goods_id":1518,"barcode":null,"sn":"P6083494744245","price":"12.50","costprice":"11.85","mktprice":"0.00","marketable":2,"stock":185,"freeze_stock":0,"spes_desc":"口味:黑芝麻味270g","is_defalut":1,"image_id":"","isdel":null,"name":"鸡蛋酥270g传统老式奶香味黑芝麻味鸡蛋卷手工老蛋卷","buy_limit":0,"bn":"G6083494744183","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083493425fdd769e64b22.jpg","total_stock":185,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"黑芝麻味270g":{"name":"黑芝麻味270g","is_default":true},"奶香味270g":{"name":"奶香味270g","product_id":9794}}},"amount":"12.50","promotion_list":[],"promotion_amount":0},"product":{"id":9793,"goods_id":1518,"barcode":null,"sn":"P6083494744245","price":"12.50","costprice":"11.85","mktprice":"0.00","marketable":2,"stock":185,"spes_desc":"口味:黑芝麻味270g","is_defalut":1,"image_id":"","isdel":null,"name":"鸡蛋酥270g传统老式奶香味黑芝麻味鸡蛋卷手工老蛋卷","buy_limit":0,"bn":"G6083494744183","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083493425fdd769e64b22.jpg","total_stock":185,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"黑芝麻味270g":{"name":"黑芝麻味270g","is_default":true},"奶香味270g":{"name":"奶香味270g","product_id":9794}}},"amount":"12.50","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/19/16083493425fdd769e64b22.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/19/16083493425fdd769e80f04.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/19/16083493425fdd769e988f9.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/19/16083493425fdd769e7602e.jpg"],"total_stock":360,"is_buy_num":24,"isfav":"false","can_buy":"ok","vip_price":12.5,"is_notice":0},{"id":1509,"bn":"G6082620268395","name":"豫味之源平底锅巴330g麻辣休闲零食膨化食品大黄米锅巴","brief":"","price":"10.90","costprice":"9.90","mktprice":"0.00","image_id":"30fb954a001da476b4234c4c0c7d6690","goods_cat_id":112,"goods_type_id":98,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":644,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'>全国包邮，除部分地区包括内蒙古,甘肃,宁夏，海南，青海，西藏，新疆等地区需另加邮费，下单请联系客服哦~<\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082620245fdc2188685ba.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082620245fdc218872715.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082620245fdc21887be19.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082620245fdc21889075f.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082620245fdc21889cc5d.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082620245fdc2188a702e.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082620245fdc2188b8416.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082620245fdc2188c1e1a.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082620245fdc2188cc363.png\"/><\/p><p style='overflow:hidden'><br/><\/p>","spes_desc":{"口味":{"196968":"平底锅巴300g/箱（14包）","196969":"大黄米锅巴350g/箱（12包）","196970":"北海稻场果派350g/箱（38个）","196971":"每日坚果米酥278g/箱（30个）"}},"params":"","service":"1,4,6","comments_count":0,"view_count":0,"buy_count":27,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":2,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:29:{i:196967;a:1:{i:0;s:17:\"山核桃98g*3袋\";}i:196968;a:1:{i:0;s:31:\"平底锅巴300g/箱（14包）\";}i:196969;a:1:{i:0;s:34:\"大黄米锅巴350g/箱（12包）\";}i:196970;a:1:{i:0;s:37:\"北海稻场果派350g/箱（38个）\";}i:196971;a:1:{i:0;s:37:\"每日坚果米酥278g/箱（30个）\";}i:196972;a:1:{i:0;s:20:\"奶油味100g/袋*10\";}i:196973;a:1:{i:0;s:20:\"香橙味100g/袋*10\";}i:196974;a:1:{i:0;s:20:\"草莓味100g/袋*10\";}i:196975;a:1:{i:0;s:59:\"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3\";}i:196976;a:1:{i:0;s:13:\"辣白菜500g\";}i:196977;a:1:{i:0;s:27:\"原味150克/袋（15枚）\";}i:196978;a:1:{i:0;s:27:\"香辣150克/袋（15枚）\";}i:196979;a:1:{i:0;s:29:\"1.26千克/桶【约120支】\";}i:196980;a:1:{i:0;s:22:\"香辣铁蛋15g*30包\t\";}i:196981;a:1:{i:0;s:19:\"盐焗味15g*30包\t\";}i:196982;a:1:{i:0;s:22:\"知心卤味20g*30包\t\";}i:196983;a:1:{i:0;s:19:\"泡椒味20g*30包\t\";}i:196984;a:1:{i:0;s:18:\"混合口味30包\t\";}i:196985;a:1:{i:0;s:10:\"520g桶装\";}i:196986;a:1:{i:0;s:15:\"原味98g*3袋\t\";}i:196987;a:1:{i:0;s:18:\"海盐味98g*3袋\t\";}i:196988;a:1:{i:0;s:24:\"蜂蜜黄油味98g*3袋\t\";}i:196989;a:1:{i:0;s:18:\"焦糖味98g*3袋\t\";}i:196990;a:1:{i:0;s:18:\"芝士味98g*3袋\t\";}i:196991;a:1:{i:0;s:18:\"藤椒味98g*3袋\t\";}i:196992;a:1:{i:0;s:64:\"3袋不同口味（请备注口味，没备注口味随机发）\";}i:196993;a:1:{i:0;s:18:\"芝士味98g*3袋\t\";}i:196994;a:1:{i:0;s:18:\"藤椒味98g*3袋\t\";}i:196995;a:1:{i:0;s:64:\"3袋不同口味（请备注口味，没备注口味随机发）\";}}","ctime":null,"utime":1608380106,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"休闲零食","products":[{"id":9715,"goods_id":1509,"barcode":null,"sn":"P6082620268462","price":"10.90","costprice":"9.90","mktprice":"0.00","marketable":1,"stock":148,"freeze_stock":0,"spes_desc":"口味:平底锅巴300g/箱（14包）","is_defalut":1,"image_id":"6dd0b96f007bf8de5317804bd5392cf9","isdel":null,"name":"豫味之源平底锅巴330g麻辣休闲零食膨化食品大黄米锅巴","buy_limit":0,"bn":"G6082620268395","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082619415fdc213543a0b.jpg","total_stock":148,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"平底锅巴300g/箱（14包）":{"name":"平底锅巴300g/箱（14包）","is_default":true},"大黄米锅巴350g/箱（12包）":{"name":"大黄米锅巴350g/箱（12包）","product_id":9716},"北海稻场果派350g/箱（38个）":{"name":"北海稻场果派350g/箱（38个）","product_id":9717},"每日坚果米酥278g/箱（30个）":{"name":"每日坚果米酥278g/箱（30个）","product_id":9718}}},"amount":"10.90","promotion_list":[],"promotion_amount":0},{"id":9716,"goods_id":1509,"barcode":null,"sn":"P6082620268504","price":"10.90","costprice":"9.90","mktprice":"0.00","marketable":1,"stock":172,"freeze_stock":0,"spes_desc":"口味:大黄米锅巴350g/箱（12包）","is_defalut":2,"image_id":"d30503fb298146cbf5d8158d8ef8ae09","isdel":null,"name":"豫味之源平底锅巴330g麻辣休闲零食膨化食品大黄米锅巴","buy_limit":0,"bn":"G6082620268395","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082619475fdc213bc9dd4.jpg","total_stock":172,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"平底锅巴300g/箱（14包）":{"name":"平底锅巴300g/箱（14包）","product_id":9715},"大黄米锅巴350g/箱（12包）":{"name":"大黄米锅巴350g/箱（12包）","is_default":true},"北海稻场果派350g/箱（38个）":{"name":"北海稻场果派350g/箱（38个）","product_id":9717},"每日坚果米酥278g/箱（30个）":{"name":"每日坚果米酥278g/箱（30个）","product_id":9718}}},"amount":"10.90","promotion_list":[],"promotion_amount":0},{"id":9717,"goods_id":1509,"barcode":null,"sn":"P6082620268532","price":"10.90","costprice":"9.90","mktprice":"0.00","marketable":1,"stock":175,"freeze_stock":0,"spes_desc":"口味:北海稻场果派350g/箱（38个）","is_defalut":2,"image_id":"0f0190ec896357a9dbdca1ef2e793fd3","isdel":null,"name":"豫味之源平底锅巴330g麻辣休闲零食膨化食品大黄米锅巴","buy_limit":0,"bn":"G6082620268395","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082619535fdc2141b0fe0.jpg","total_stock":175,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"平底锅巴300g/箱（14包）":{"name":"平底锅巴300g/箱（14包）","product_id":9715},"大黄米锅巴350g/箱（12包）":{"name":"大黄米锅巴350g/箱（12包）","product_id":9716},"北海稻场果派350g/箱（38个）":{"name":"北海稻场果派350g/箱（38个）","is_default":true},"每日坚果米酥278g/箱（30个）":{"name":"每日坚果米酥278g/箱（30个）","product_id":9718}}},"amount":"10.90","promotion_list":[],"promotion_amount":0},{"id":9718,"goods_id":1509,"barcode":null,"sn":"P6082620268574","price":"10.90","costprice":"9.90","mktprice":"0.00","marketable":1,"stock":149,"freeze_stock":0,"spes_desc":"口味:每日坚果米酥278g/箱（30个）","is_defalut":2,"image_id":"1c4a1c16884e0d733c80706c708e90ec","isdel":null,"name":"豫味之源平底锅巴330g麻辣休闲零食膨化食品大黄米锅巴","buy_limit":0,"bn":"G6082620268395","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082619625fdc214a2c20c.jpg","total_stock":149,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"平底锅巴300g/箱（14包）":{"name":"平底锅巴300g/箱（14包）","product_id":9715},"大黄米锅巴350g/箱（12包）":{"name":"大黄米锅巴350g/箱（12包）","product_id":9716},"北海稻场果派350g/箱（38个）":{"name":"北海稻场果派350g/箱（38个）","product_id":9717},"每日坚果米酥278g/箱（30个）":{"name":"每日坚果米酥278g/箱（30个）","is_default":true}}},"amount":"10.90","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082619185fdc211eed1b2.jpg","default":{"id":9715,"goods_id":1509,"barcode":null,"sn":"P6082620268462","price":"10.90","costprice":"9.90","mktprice":"0.00","marketable":1,"stock":148,"freeze_stock":0,"spes_desc":"口味:平底锅巴300g/箱（14包）","is_defalut":1,"image_id":"6dd0b96f007bf8de5317804bd5392cf9","isdel":null,"name":"豫味之源平底锅巴330g麻辣休闲零食膨化食品大黄米锅巴","buy_limit":0,"bn":"G6082620268395","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082619415fdc213543a0b.jpg","total_stock":148,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"平底锅巴300g/箱（14包）":{"name":"平底锅巴300g/箱（14包）","is_default":true},"大黄米锅巴350g/箱（12包）":{"name":"大黄米锅巴350g/箱（12包）","product_id":9716},"北海稻场果派350g/箱（38个）":{"name":"北海稻场果派350g/箱（38个）","product_id":9717},"每日坚果米酥278g/箱（30个）":{"name":"每日坚果米酥278g/箱（30个）","product_id":9718}}},"amount":"10.90","promotion_list":[],"promotion_amount":0},"product":{"id":9715,"goods_id":1509,"barcode":null,"sn":"P6082620268462","price":"10.90","costprice":"9.90","mktprice":"0.00","marketable":1,"stock":148,"spes_desc":"口味:平底锅巴300g/箱（14包）","is_defalut":1,"image_id":"6dd0b96f007bf8de5317804bd5392cf9","isdel":null,"name":"豫味之源平底锅巴330g麻辣休闲零食膨化食品大黄米锅巴","buy_limit":0,"bn":"G6082620268395","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082619415fdc213543a0b.jpg","total_stock":148,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"平底锅巴300g/箱（14包）":{"name":"平底锅巴300g/箱（14包）","is_default":true},"大黄米锅巴350g/箱（12包）":{"name":"大黄米锅巴350g/箱（12包）","product_id":9716},"北海稻场果派350g/箱（38个）":{"name":"北海稻场果派350g/箱（38个）","product_id":9717},"每日坚果米酥278g/箱（30个）":{"name":"每日坚果米酥278g/箱（30个）","product_id":9718}}},"amount":"10.90","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/18/16082619185fdc211eed1b2.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/18/16082619195fdc211f26cf8.PNG","http://img.ywzyit.com/static/uploads/images/2020/12/18/16082619195fdc211f0f3c8.jpg"],"total_stock":644,"is_buy_num":27,"isfav":"false","can_buy":"ok","vip_price":10.9,"is_notice":0},{"id":1503,"bn":"G6081862509121","name":"米乐谷微波爆米花香甜奶油味膨化零食100g*10袋","brief":"","price":"15.90","costprice":"14.90","mktprice":"0.00","image_id":"9b129aa35e70031dad024b26a461bccf","goods_cat_id":112,"goods_type_id":98,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":789,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'>全国包邮，除部分地区包括内蒙古,甘肃,宁夏，海南，青海，西藏，新疆等地区需另加邮费，下单请联系客服哦~<\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081862475fdaf9875428f.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081862475fdaf9875d926.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081862475fdaf98767711.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081862475fdaf9877a5dc.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081862475fdaf98784e90.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081862475fdaf9878dc20.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081862475fdaf987a1f36.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081862475fdaf987ad0ea.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081862475fdaf987b61a8.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081862475fdaf987c7d82.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081862485fdaf988524b3.png\"/><\/p><p style='overflow:hidden'><br/><\/p>","spes_desc":{"口味":{"195471":"奶油味100g/袋*10","195472":"香橙味100g/袋*10","195473":"草莓味100g/袋*10","195474":"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3"}},"params":"","service":"1,4,6","comments_count":0,"view_count":0,"buy_count":11,"xuni_num":null,"uptime":null,"downtime":null,"sort":100,"is_recommend":2,"is_hot":2,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:22:{i:195470;a:1:{i:0;s:17:\"山核桃98g*3袋\";}i:195471;a:1:{i:0;s:20:\"奶油味100g/袋*10\";}i:195472;a:1:{i:0;s:20:\"香橙味100g/袋*10\";}i:195473;a:1:{i:0;s:20:\"草莓味100g/袋*10\";}i:195474;a:1:{i:0;s:59:\"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3\";}i:195475;a:1:{i:0;s:13:\"辣白菜500g\";}i:195476;a:1:{i:0;s:27:\"原味150克/袋（15枚）\";}i:195477;a:1:{i:0;s:27:\"香辣150克/袋（15枚）\";}i:195478;a:1:{i:0;s:29:\"1.26千克/桶【约120支】\";}i:195479;a:1:{i:0;s:22:\"香辣铁蛋15g*30包\t\";}i:195480;a:1:{i:0;s:19:\"盐焗味15g*30包\t\";}i:195481;a:1:{i:0;s:22:\"知心卤味20g*30包\t\";}i:195482;a:1:{i:0;s:19:\"泡椒味20g*30包\t\";}i:195483;a:1:{i:0;s:18:\"混合口味30包\t\";}i:195484;a:1:{i:0;s:10:\"520g桶装\";}i:195485;a:1:{i:0;s:15:\"原味98g*3袋\t\";}i:195486;a:1:{i:0;s:18:\"海盐味98g*3袋\t\";}i:195487;a:1:{i:0;s:24:\"蜂蜜黄油味98g*3袋\t\";}i:195488;a:1:{i:0;s:18:\"焦糖味98g*3袋\t\";}i:195489;a:1:{i:0;s:18:\"芝士味98g*3袋\t\";}i:195490;a:1:{i:0;s:18:\"藤椒味98g*3袋\t\";}i:195491;a:1:{i:0;s:64:\"3袋不同口味（请备注口味，没备注口味随机发）\";}}","ctime":null,"utime":1608186250,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"休闲零食","products":[{"id":9356,"goods_id":1503,"barcode":null,"sn":"P6081862509190","price":"15.90","costprice":"14.90","mktprice":"0.00","marketable":2,"stock":192,"freeze_stock":0,"spes_desc":"口味:奶油味100g/袋*10","is_defalut":1,"image_id":"","isdel":null,"name":"米乐谷微波爆米花香甜奶油味膨化零食100g*10袋","buy_limit":0,"bn":"G6081862509121","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081861125fdaf900cb47f.jpg","total_stock":192,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"奶油味100g/袋*10":{"name":"奶油味100g/袋*10","is_default":true},"香橙味100g/袋*10":{"name":"香橙味100g/袋*10","product_id":9357},"草莓味100g/袋*10":{"name":"草莓味100g/袋*10","product_id":9358},"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3":{"name":"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3","product_id":9359}}},"amount":"15.90","promotion_list":[],"promotion_amount":0},{"id":9357,"goods_id":1503,"barcode":null,"sn":"P6081862509263","price":"15.90","costprice":"14.90","mktprice":"0.00","marketable":2,"stock":200,"freeze_stock":0,"spes_desc":"口味:香橙味100g/袋*10","is_defalut":2,"image_id":"","isdel":null,"name":"米乐谷微波爆米花香甜奶油味膨化零食100g*10袋","buy_limit":0,"bn":"G6081862509121","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081861125fdaf900cb47f.jpg","total_stock":200,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"奶油味100g/袋*10":{"name":"奶油味100g/袋*10","product_id":9356},"香橙味100g/袋*10":{"name":"香橙味100g/袋*10","is_default":true},"草莓味100g/袋*10":{"name":"草莓味100g/袋*10","product_id":9358},"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3":{"name":"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3","product_id":9359}}},"amount":"15.90","promotion_list":[],"promotion_amount":0},{"id":9358,"goods_id":1503,"barcode":null,"sn":"P6081862509313","price":"15.90","costprice":"14.90","mktprice":"0.00","marketable":2,"stock":200,"freeze_stock":0,"spes_desc":"口味:草莓味100g/袋*10","is_defalut":2,"image_id":"","isdel":null,"name":"米乐谷微波爆米花香甜奶油味膨化零食100g*10袋","buy_limit":0,"bn":"G6081862509121","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081861125fdaf900cb47f.jpg","total_stock":200,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"奶油味100g/袋*10":{"name":"奶油味100g/袋*10","product_id":9356},"香橙味100g/袋*10":{"name":"香橙味100g/袋*10","product_id":9357},"草莓味100g/袋*10":{"name":"草莓味100g/袋*10","is_default":true},"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3":{"name":"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3","product_id":9359}}},"amount":"15.90","promotion_list":[],"promotion_amount":0},{"id":9359,"goods_id":1503,"barcode":null,"sn":"P6081862509345","price":"15.90","costprice":"14.90","mktprice":"0.00","marketable":2,"stock":197,"freeze_stock":0,"spes_desc":"口味:奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3","is_defalut":2,"image_id":"","isdel":null,"name":"米乐谷微波爆米花香甜奶油味膨化零食100g*10袋","buy_limit":0,"bn":"G6081862509121","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081861125fdaf900cb47f.jpg","total_stock":197,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"奶油味100g/袋*10":{"name":"奶油味100g/袋*10","product_id":9356},"香橙味100g/袋*10":{"name":"香橙味100g/袋*10","product_id":9357},"草莓味100g/袋*10":{"name":"草莓味100g/袋*10","product_id":9358},"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3":{"name":"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3","is_default":true}}},"amount":"15.90","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081861125fdaf900cb47f.jpg","default":{"id":9356,"goods_id":1503,"barcode":null,"sn":"P6081862509190","price":"15.90","costprice":"14.90","mktprice":"0.00","marketable":2,"stock":192,"freeze_stock":0,"spes_desc":"口味:奶油味100g/袋*10","is_defalut":1,"image_id":"","isdel":null,"name":"米乐谷微波爆米花香甜奶油味膨化零食100g*10袋","buy_limit":0,"bn":"G6081862509121","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081861125fdaf900cb47f.jpg","total_stock":192,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"奶油味100g/袋*10":{"name":"奶油味100g/袋*10","is_default":true},"香橙味100g/袋*10":{"name":"香橙味100g/袋*10","product_id":9357},"草莓味100g/袋*10":{"name":"草莓味100g/袋*10","product_id":9358},"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3":{"name":"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3","product_id":9359}}},"amount":"15.90","promotion_list":[],"promotion_amount":0},"product":{"id":9356,"goods_id":1503,"barcode":null,"sn":"P6081862509190","price":"15.90","costprice":"14.90","mktprice":"0.00","marketable":2,"stock":192,"spes_desc":"口味:奶油味100g/袋*10","is_defalut":1,"image_id":"","isdel":null,"name":"米乐谷微波爆米花香甜奶油味膨化零食100g*10袋","buy_limit":0,"bn":"G6081862509121","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081861125fdaf900cb47f.jpg","total_stock":192,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"奶油味100g/袋*10":{"name":"奶油味100g/袋*10","is_default":true},"香橙味100g/袋*10":{"name":"香橙味100g/袋*10","product_id":9357},"草莓味100g/袋*10":{"name":"草莓味100g/袋*10","product_id":9358},"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3":{"name":"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3","product_id":9359}}},"amount":"15.90","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/17/16081861125fdaf900cb47f.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/17/16081861125fdaf900ac183.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/17/16081861125fdaf900bd5cc.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/17/16081861125fdaf900e19ff.jpg"],"total_stock":789,"is_buy_num":11,"isfav":"false","can_buy":"ok","vip_price":15.9,"is_notice":0},{"id":1482,"bn":"G6079172177100","name":"黄山烧饼150克(15枚)安徽特产邬秾苑梅干菜扣肉烧饼","brief":"不免邮区域:海外,台湾,澳门,香港,西藏,新疆,宁夏,青海,内蒙古","price":"16.80","costprice":"15.80","mktprice":"0.00","image_id":"e7138dfda9b9699fcc5c0cae509465f7","goods_cat_id":112,"goods_type_id":98,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":375,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171935fd6de8999855.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171935fd6de89a3c85.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171935fd6de89b4a3f.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171935fd6de89f2e06.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171945fd6de8a0a071.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171945fd6de8a20f53.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171945fd6de8a5dc1d.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171945fd6de8a6889d.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171945fd6de8aa6875.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171945fd6de8aedc1e.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171945fd6de8ae47b5.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077642835fd4893b4ffde.png\" alt=\"16077642835fd4893b4ffde.png\"/><\/p>","spes_desc":{"口味":{"193127":"原味150克/袋（15枚）","193128":"香辣150克/袋（15枚）"}},"params":"","service":"1,4,6,7","comments_count":1,"view_count":0,"buy_count":23,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":1,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:17:{i:193126;a:1:{i:0;s:17:\"山核桃98g*3袋\";}i:193127;a:1:{i:0;s:27:\"原味150克/袋（15枚）\";}i:193128;a:1:{i:0;s:27:\"香辣150克/袋（15枚）\";}i:193129;a:1:{i:0;s:29:\"1.26千克/桶【约120支】\";}i:193130;a:1:{i:0;s:22:\"香辣铁蛋15g*30包\t\";}i:193131;a:1:{i:0;s:19:\"盐焗味15g*30包\t\";}i:193132;a:1:{i:0;s:22:\"知心卤味20g*30包\t\";}i:193133;a:1:{i:0;s:19:\"泡椒味20g*30包\t\";}i:193134;a:1:{i:0;s:18:\"混合口味30包\t\";}i:193135;a:1:{i:0;s:10:\"520g桶装\";}i:193136;a:1:{i:0;s:15:\"原味98g*3袋\t\";}i:193137;a:1:{i:0;s:18:\"海盐味98g*3袋\t\";}i:193138;a:1:{i:0;s:24:\"蜂蜜黄油味98g*3袋\t\";}i:193139;a:1:{i:0;s:18:\"焦糖味98g*3袋\t\";}i:193140;a:1:{i:0;s:18:\"芝士味98g*3袋\t\";}i:193141;a:1:{i:0;s:18:\"藤椒味98g*3袋\t\";}i:193142;a:1:{i:0;s:64:\"3袋不同口味（请备注口味，没备注口味随机发）\";}}","ctime":null,"utime":1607917253,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"休闲零食","products":[{"id":9294,"goods_id":1482,"barcode":null,"sn":"P6079172177165","price":"16.80","costprice":"15.80","mktprice":"0.00","marketable":2,"stock":189,"freeze_stock":0,"spes_desc":"口味:原味150克/袋（15枚）","is_defalut":1,"image_id":"","isdel":null,"name":"黄山烧饼150克(15枚)安徽特产邬秾苑梅干菜扣肉烧饼","buy_limit":0,"bn":"G6079172177100","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171005fd6de2cd8516.jpg","total_stock":189,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"原味150克/袋（15枚）":{"name":"原味150克/袋（15枚）","is_default":true},"香辣150克/袋（15枚）":{"name":"香辣150克/袋（15枚）","product_id":9295}}},"amount":"16.80","promotion_list":[],"promotion_amount":0},{"id":9295,"goods_id":1482,"barcode":null,"sn":"P6079172177203","price":"16.80","costprice":"15.80","mktprice":"0.00","marketable":2,"stock":186,"freeze_stock":0,"spes_desc":"口味:香辣150克/袋（15枚）","is_defalut":2,"image_id":"","isdel":null,"name":"黄山烧饼150克(15枚)安徽特产邬秾苑梅干菜扣肉烧饼","buy_limit":0,"bn":"G6079172177100","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171005fd6de2cd8516.jpg","total_stock":186,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"原味150克/袋（15枚）":{"name":"原味150克/袋（15枚）","product_id":9294},"香辣150克/袋（15枚）":{"name":"香辣150克/袋（15枚）","is_default":true}}},"amount":"16.80","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171005fd6de2cd8516.jpg","default":{"id":9294,"goods_id":1482,"barcode":null,"sn":"P6079172177165","price":"16.80","costprice":"15.80","mktprice":"0.00","marketable":2,"stock":189,"freeze_stock":0,"spes_desc":"口味:原味150克/袋（15枚）","is_defalut":1,"image_id":"","isdel":null,"name":"黄山烧饼150克(15枚)安徽特产邬秾苑梅干菜扣肉烧饼","buy_limit":0,"bn":"G6079172177100","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171005fd6de2cd8516.jpg","total_stock":189,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"原味150克/袋（15枚）":{"name":"原味150克/袋（15枚）","is_default":true},"香辣150克/袋（15枚）":{"name":"香辣150克/袋（15枚）","product_id":9295}}},"amount":"16.80","promotion_list":[],"promotion_amount":0},"product":{"id":9294,"goods_id":1482,"barcode":null,"sn":"P6079172177165","price":"16.80","costprice":"15.80","mktprice":"0.00","marketable":2,"stock":189,"spes_desc":"口味:原味150克/袋（15枚）","is_defalut":1,"image_id":"","isdel":null,"name":"黄山烧饼150克(15枚)安徽特产邬秾苑梅干菜扣肉烧饼","buy_limit":0,"bn":"G6079172177100","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171005fd6de2cd8516.jpg","total_stock":189,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"原味150克/袋（15枚）":{"name":"原味150克/袋（15枚）","is_default":true},"香辣150克/袋（15枚）":{"name":"香辣150克/袋（15枚）","product_id":9295}}},"amount":"16.80","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171005fd6de2cd8516.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171005fd6de2cc2a34.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171005fd6de2ce20f9.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171005fd6de2cf2432.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171005fd6de2ccd813.jpg"],"total_stock":375,"is_buy_num":23,"isfav":"false","can_buy":"ok","vip_price":16.8,"is_notice":0},{"id":1481,"bn":"G6079138846204","name":"荧光棒棒糖120支/桶酸甜水果味硬糖儿童糖果","brief":"不免邮区域:海外,台湾,澳门,\n香港,西藏,新疆,宁夏,青海,内蒙古","price":"38.50","costprice":"37.90","mktprice":"0.00","image_id":"b4d3519b6f4dcf2c341fe0a1647ac4f8","goods_cat_id":112,"goods_type_id":98,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":213,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079138315fd6d16782022.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079138315fd6d1678c3bc.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079138315fd6d167964f5.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079138315fd6d167d4312.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079138325fd6d16850cf2.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077642835fd4893b4ffde.png\" alt=\"16077642835fd4893b4ffde.png\"/><\/p>","spes_desc":{"口味":{"193112":"1.26千克/桶【约120支】"}},"params":"","service":"1,4,6,7","comments_count":0,"view_count":0,"buy_count":12,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":1,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:15:{i:193111;a:1:{i:0;s:17:\"山核桃98g*3袋\";}i:193112;a:1:{i:0;s:29:\"1.26千克/桶【约120支】\";}i:193113;a:1:{i:0;s:22:\"香辣铁蛋15g*30包\t\";}i:193114;a:1:{i:0;s:19:\"盐焗味15g*30包\t\";}i:193115;a:1:{i:0;s:22:\"知心卤味20g*30包\t\";}i:193116;a:1:{i:0;s:19:\"泡椒味20g*30包\t\";}i:193117;a:1:{i:0;s:18:\"混合口味30包\t\";}i:193118;a:1:{i:0;s:10:\"520g桶装\";}i:193119;a:1:{i:0;s:15:\"原味98g*3袋\t\";}i:193120;a:1:{i:0;s:18:\"海盐味98g*3袋\t\";}i:193121;a:1:{i:0;s:24:\"蜂蜜黄油味98g*3袋\t\";}i:193122;a:1:{i:0;s:18:\"焦糖味98g*3袋\t\";}i:193123;a:1:{i:0;s:18:\"芝士味98g*3袋\t\";}i:193124;a:1:{i:0;s:18:\"藤椒味98g*3袋\t\";}i:193125;a:1:{i:0;s:64:\"3袋不同口味（请备注口味，没备注口味随机发）\";}}","ctime":null,"utime":1607913899,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"休闲零食","products":[{"id":9293,"goods_id":1481,"barcode":null,"sn":"P6079138846265","price":"38.50","costprice":"37.90","mktprice":"0.00","marketable":2,"stock":213,"freeze_stock":0,"spes_desc":"口味:1.26千克/桶【约120支】","is_defalut":1,"image_id":"0b21991ffbac56ac7ad765957fd1dd3c","isdel":null,"name":"荧光棒棒糖120支/桶酸甜水果味硬糖儿童糖果","buy_limit":0,"bn":"G6079138846204","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079138095fd6d1510708a.jpg","total_stock":213,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"1.26千克/桶【约120支】":{"name":"1.26千克/桶【约120支】","is_default":true}}},"amount":"38.50","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079137965fd6d144f3f88.jpg","default":{"id":9293,"goods_id":1481,"barcode":null,"sn":"P6079138846265","price":"38.50","costprice":"37.90","mktprice":"0.00","marketable":2,"stock":213,"freeze_stock":0,"spes_desc":"口味:1.26千克/桶【约120支】","is_defalut":1,"image_id":"0b21991ffbac56ac7ad765957fd1dd3c","isdel":null,"name":"荧光棒棒糖120支/桶酸甜水果味硬糖儿童糖果","buy_limit":0,"bn":"G6079138846204","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079138095fd6d1510708a.jpg","total_stock":213,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"1.26千克/桶【约120支】":{"name":"1.26千克/桶【约120支】","is_default":true}}},"amount":"38.50","promotion_list":[],"promotion_amount":0},"product":{"id":9293,"goods_id":1481,"barcode":null,"sn":"P6079138846265","price":"38.50","costprice":"37.90","mktprice":"0.00","marketable":2,"stock":213,"spes_desc":"口味:1.26千克/桶【约120支】","is_defalut":1,"image_id":"0b21991ffbac56ac7ad765957fd1dd3c","isdel":null,"name":"荧光棒棒糖120支/桶酸甜水果味硬糖儿童糖果","buy_limit":0,"bn":"G6079138846204","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079138095fd6d1510708a.jpg","total_stock":213,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"1.26千克/桶【约120支】":{"name":"1.26千克/桶【约120支】","is_default":true}}},"amount":"38.50","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/14/16079137965fd6d144f3f88.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/14/16079137965fd6d144ba3ae.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/14/16079137965fd6d144c4a15.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/14/16079137965fd6d144de6d5.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/14/16079137965fd6d144cd5a2.jpg"],"total_stock":213,"is_buy_num":12,"isfav":"false","can_buy":"ok","vip_price":38.5,"is_notice":0},{"id":1478,"bn":"G6077583809984","name":"湖湘贡鹌鹑蛋卤蛋整盒15g*30包无壳湖南特产铁蛋零食","brief":"","price":"28.90","costprice":"26.90","mktprice":"0.00","image_id":"577e128be616fe623dc3d693cd98a961","goods_cat_id":112,"goods_type_id":98,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":394,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'>全国包邮，除部分地区包括内蒙古,甘肃,宁夏，海南，青海，西藏，新疆等地区需另加邮费，下单请联系客服哦。<\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077583775fd4722963cb4.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077583775fd472296ddfc.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077583775fd472297752b.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077583775fd4722989ff1.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077583775fd47229954fa.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077583775fd47229ad2ca.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077583785fd4722a18eb3.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077583785fd4722a55dcb.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077583785fd4722a93a80.png\"/><\/p><br/><p style='overflow:hidden'><\/p>","spes_desc":{"口味":{"193043":"香辣铁蛋15g*30包\t","193044":"盐焗味15g*30包\t","193045":"知心卤味20g*30包\t","193046":"泡椒味20g*30包\t","193047":"混合口味30包\t"}},"params":"","service":"1,4,6","comments_count":0,"view_count":0,"buy_count":6,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":2,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:14:{i:193042;a:1:{i:0;s:17:\"山核桃98g*3袋\";}i:193043;a:1:{i:0;s:22:\"香辣铁蛋15g*30包\t\";}i:193044;a:1:{i:0;s:19:\"盐焗味15g*30包\t\";}i:193045;a:1:{i:0;s:22:\"知心卤味20g*30包\t\";}i:193046;a:1:{i:0;s:19:\"泡椒味20g*30包\t\";}i:193047;a:1:{i:0;s:18:\"混合口味30包\t\";}i:193048;a:1:{i:0;s:10:\"520g桶装\";}i:193049;a:1:{i:0;s:15:\"原味98g*3袋\t\";}i:193050;a:1:{i:0;s:18:\"海盐味98g*3袋\t\";}i:193051;a:1:{i:0;s:24:\"蜂蜜黄油味98g*3袋\t\";}i:193052;a:1:{i:0;s:18:\"焦糖味98g*3袋\t\";}i:193053;a:1:{i:0;s:18:\"芝士味98g*3袋\t\";}i:193054;a:1:{i:0;s:18:\"藤椒味98g*3袋\t\";}i:193055;a:1:{i:0;s:64:\"3袋不同口味（请备注口味，没备注口味随机发）\";}}","ctime":null,"utime":1608111842,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"休闲零食","products":[{"id":9284,"goods_id":1478,"barcode":null,"sn":"P6077583810045","price":"28.90","costprice":"26.90","mktprice":"0.00","marketable":2,"stock":78,"freeze_stock":0,"spes_desc":"口味:香辣铁蛋15g*30包\t","is_defalut":1,"image_id":"","isdel":null,"name":"湖湘贡鹌鹑蛋卤蛋整盒15g*30包无壳湖南特产铁蛋零食","buy_limit":0,"bn":"G6077583809984","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077581715fd4715b276a9.jpg","total_stock":78,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"香辣铁蛋15g*30包\t":{"name":"香辣铁蛋15g*30包\t","is_default":true},"盐焗味15g*30包\t":{"name":"盐焗味15g*30包\t","product_id":9285},"知心卤味20g*30包\t":{"name":"知心卤味20g*30包\t","product_id":9286},"泡椒味20g*30包\t":{"name":"泡椒味20g*30包\t","product_id":9287},"混合口味30包\t":{"name":"混合口味30包\t","product_id":9288}}},"amount":"28.90","promotion_list":[],"promotion_amount":0},{"id":9285,"goods_id":1478,"barcode":null,"sn":"P6077583810084","price":"28.90","costprice":"26.90","mktprice":"0.00","marketable":2,"stock":79,"freeze_stock":0,"spes_desc":"口味:盐焗味15g*30包\t","is_defalut":2,"image_id":"","isdel":null,"name":"湖湘贡鹌鹑蛋卤蛋整盒15g*30包无壳湖南特产铁蛋零食","buy_limit":0,"bn":"G6077583809984","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077581715fd4715b276a9.jpg","total_stock":79,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"香辣铁蛋15g*30包\t":{"name":"香辣铁蛋15g*30包\t","product_id":9284},"盐焗味15g*30包\t":{"name":"盐焗味15g*30包\t","is_default":true},"知心卤味20g*30包\t":{"name":"知心卤味20g*30包\t","product_id":9286},"泡椒味20g*30包\t":{"name":"泡椒味20g*30包\t","product_id":9287},"混合口味30包\t":{"name":"混合口味30包\t","product_id":9288}}},"amount":"28.90","promotion_list":[],"promotion_amount":0},{"id":9286,"goods_id":1478,"barcode":null,"sn":"P6077583810113","price":"28.90","costprice":"26.90","mktprice":"0.00","marketable":2,"stock":80,"freeze_stock":0,"spes_desc":"口味:知心卤味20g*30包\t","is_defalut":2,"image_id":"","isdel":null,"name":"湖湘贡鹌鹑蛋卤蛋整盒15g*30包无壳湖南特产铁蛋零食","buy_limit":0,"bn":"G6077583809984","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077581715fd4715b276a9.jpg","total_stock":80,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"香辣铁蛋15g*30包\t":{"name":"香辣铁蛋15g*30包\t","product_id":9284},"盐焗味15g*30包\t":{"name":"盐焗味15g*30包\t","product_id":9285},"知心卤味20g*30包\t":{"name":"知心卤味20g*30包\t","is_default":true},"泡椒味20g*30包\t":{"name":"泡椒味20g*30包\t","product_id":9287},"混合口味30包\t":{"name":"混合口味30包\t","product_id":9288}}},"amount":"28.90","promotion_list":[],"promotion_amount":0},{"id":9287,"goods_id":1478,"barcode":null,"sn":"P6077583810154","price":"28.90","costprice":"26.90","mktprice":"0.00","marketable":2,"stock":80,"freeze_stock":0,"spes_desc":"口味:泡椒味20g*30包\t","is_defalut":2,"image_id":"","isdel":null,"name":"湖湘贡鹌鹑蛋卤蛋整盒15g*30包无壳湖南特产铁蛋零食","buy_limit":0,"bn":"G6077583809984","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077581715fd4715b276a9.jpg","total_stock":80,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"香辣铁蛋15g*30包\t":{"name":"香辣铁蛋15g*30包\t","product_id":9284},"盐焗味15g*30包\t":{"name":"盐焗味15g*30包\t","product_id":9285},"知心卤味20g*30包\t":{"name":"知心卤味20g*30包\t","product_id":9286},"泡椒味20g*30包\t":{"name":"泡椒味20g*30包\t","is_default":true},"混合口味30包\t":{"name":"混合口味30包\t","product_id":9288}}},"amount":"28.90","promotion_list":[],"promotion_amount":0},{"id":9288,"goods_id":1478,"barcode":null,"sn":"P6077583810183","price":"28.90","costprice":"26.90","mktprice":"0.00","marketable":2,"stock":77,"freeze_stock":0,"spes_desc":"口味:混合口味30包\t","is_defalut":2,"image_id":"","isdel":null,"name":"湖湘贡鹌鹑蛋卤蛋整盒15g*30包无壳湖南特产铁蛋零食","buy_limit":0,"bn":"G6077583809984","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077581715fd4715b276a9.jpg","total_stock":77,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"香辣铁蛋15g*30包\t":{"name":"香辣铁蛋15g*30包\t","product_id":9284},"盐焗味15g*30包\t":{"name":"盐焗味15g*30包\t","product_id":9285},"知心卤味20g*30包\t":{"name":"知心卤味20g*30包\t","product_id":9286},"泡椒味20g*30包\t":{"name":"泡椒味20g*30包\t","product_id":9287},"混合口味30包\t":{"name":"混合口味30包\t","is_default":true}}},"amount":"28.90","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077581715fd4715b276a9.jpg","default":{"id":9284,"goods_id":1478,"barcode":null,"sn":"P6077583810045","price":"28.90","costprice":"26.90","mktprice":"0.00","marketable":2,"stock":78,"freeze_stock":0,"spes_desc":"口味:香辣铁蛋15g*30包\t","is_defalut":1,"image_id":"","isdel":null,"name":"湖湘贡鹌鹑蛋卤蛋整盒15g*30包无壳湖南特产铁蛋零食","buy_limit":0,"bn":"G6077583809984","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077581715fd4715b276a9.jpg","total_stock":78,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"香辣铁蛋15g*30包\t":{"name":"香辣铁蛋15g*30包\t","is_default":true},"盐焗味15g*30包\t":{"name":"盐焗味15g*30包\t","product_id":9285},"知心卤味20g*30包\t":{"name":"知心卤味20g*30包\t","product_id":9286},"泡椒味20g*30包\t":{"name":"泡椒味20g*30包\t","product_id":9287},"混合口味30包\t":{"name":"混合口味30包\t","product_id":9288}}},"amount":"28.90","promotion_list":[],"promotion_amount":0},"product":{"id":9284,"goods_id":1478,"barcode":null,"sn":"P6077583810045","price":"28.90","costprice":"26.90","mktprice":"0.00","marketable":2,"stock":78,"spes_desc":"口味:香辣铁蛋15g*30包\t","is_defalut":1,"image_id":"","isdel":null,"name":"湖湘贡鹌鹑蛋卤蛋整盒15g*30包无壳湖南特产铁蛋零食","buy_limit":0,"bn":"G6077583809984","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077581715fd4715b276a9.jpg","total_stock":78,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"香辣铁蛋15g*30包\t":{"name":"香辣铁蛋15g*30包\t","is_default":true},"盐焗味15g*30包\t":{"name":"盐焗味15g*30包\t","product_id":9285},"知心卤味20g*30包\t":{"name":"知心卤味20g*30包\t","product_id":9286},"泡椒味20g*30包\t":{"name":"泡椒味20g*30包\t","product_id":9287},"混合口味30包\t":{"name":"混合口味30包\t","product_id":9288}}},"amount":"28.90","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/12/16077581715fd4715b276a9.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/12/16077581715fd4715b1d485.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/12/16077581715fd4715b13f1d.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/12/16077581715fd4715b3509b.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/12/16077582405fd471a0f3fb9.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/12/16077582415fd471a10aca5.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/12/16077582415fd471a114313.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/12/16077582415fd471a123541.jpg"],"total_stock":394,"is_buy_num":6,"isfav":"false","can_buy":"ok","vip_price":28.9,"is_notice":0},{"id":1476,"bn":"G6077550534660","name":"麦丽素520g桶装巧克力","brief":"不免邮区域:海外,台湾,澳门,\n香港,西藏,新疆,青海,内蒙古","price":"35.00","costprice":"32.50","mktprice":"0.00","image_id":"38e114ce54a7116a07cf57358199f13f","goods_cat_id":112,"goods_type_id":98,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":175,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077550275fd46513d7bd6.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077550275fd46513442a8.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077550275fd46513abbda.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077550285fd46514280cb.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077550285fd46514b9987.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077550285fd46514c3b79.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077550285fd46514d67cf.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077550295fd4651523ff8.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/11/16076760535fd330956c9fe.png\" alt=\"16076760535fd330956c9fe.png\"/><\/p>","spes_desc":{"口味":{"193034":"520g桶装"}},"params":"","service":"1,4,6,7","comments_count":0,"view_count":0,"buy_count":25,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":1,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:9:{i:193033;a:1:{i:0;s:17:\"山核桃98g*3袋\";}i:193034;a:1:{i:0;s:10:\"520g桶装\";}i:193035;a:1:{i:0;s:15:\"原味98g*3袋\t\";}i:193036;a:1:{i:0;s:18:\"海盐味98g*3袋\t\";}i:193037;a:1:{i:0;s:24:\"蜂蜜黄油味98g*3袋\t\";}i:193038;a:1:{i:0;s:18:\"焦糖味98g*3袋\t\";}i:193039;a:1:{i:0;s:18:\"芝士味98g*3袋\t\";}i:193040;a:1:{i:0;s:18:\"藤椒味98g*3袋\t\";}i:193041;a:1:{i:0;s:64:\"3袋不同口味（请备注口味，没备注口味随机发）\";}}","ctime":null,"utime":1607755105,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"休闲零食","products":[{"id":9282,"goods_id":1476,"barcode":null,"sn":"P6077550534720","price":"35.00","costprice":"32.50","mktprice":"0.00","marketable":2,"stock":175,"freeze_stock":0,"spes_desc":"口味:520g桶装","is_defalut":1,"image_id":"","isdel":null,"name":"麦丽素520g桶装巧克力","buy_limit":0,"bn":"G6077550534660","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077549515fd464c76cfc4.jpg","total_stock":175,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"520g桶装":{"name":"520g桶装","is_default":true}}},"amount":"35.00","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077549515fd464c76cfc4.jpg","default":{"id":9282,"goods_id":1476,"barcode":null,"sn":"P6077550534720","price":"35.00","costprice":"32.50","mktprice":"0.00","marketable":2,"stock":175,"freeze_stock":0,"spes_desc":"口味:520g桶装","is_defalut":1,"image_id":"","isdel":null,"name":"麦丽素520g桶装巧克力","buy_limit":0,"bn":"G6077550534660","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077549515fd464c76cfc4.jpg","total_stock":175,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"520g桶装":{"name":"520g桶装","is_default":true}}},"amount":"35.00","promotion_list":[],"promotion_amount":0},"product":{"id":9282,"goods_id":1476,"barcode":null,"sn":"P6077550534720","price":"35.00","costprice":"32.50","mktprice":"0.00","marketable":2,"stock":175,"spes_desc":"口味:520g桶装","is_defalut":1,"image_id":"","isdel":null,"name":"麦丽素520g桶装巧克力","buy_limit":0,"bn":"G6077550534660","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077549515fd464c76cfc4.jpg","total_stock":175,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"520g桶装":{"name":"520g桶装","is_default":true}}},"amount":"35.00","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/12/16077549515fd464c76cfc4.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/12/16077549515fd464c763263.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/12/16077549515fd464c781276.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/12/16077549515fd464c74efed.jpg"],"total_stock":175,"is_buy_num":25,"isfav":"false","can_buy":"ok","vip_price":35,"is_notice":0},{"id":1465,"bn":"G6075838326883","name":"每日小点肉松蛋糕营养早餐面包独立包装","brief":"","price":"16.90","costprice":"15.90","mktprice":"0.00","image_id":"f755da65845f22ba2eb8e9de9dd97c18","goods_cat_id":112,"goods_type_id":95,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":300,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'>全国包邮，除部分地区包括内蒙古,甘肃,宁夏，海南，青海，西藏，新疆等地区需另加邮费，下单请联系客服哦<\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838295fd1c85569eee.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838295fd1c85574643.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838295fd1c8557df27.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838295fd1c8558f28d.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838295fd1c8559cc44.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838295fd1c855b554e.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838295fd1c855bebb2.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838295fd1c855c8a66.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838295fd1c855ed585.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838305fd1c856027fc.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838305fd1c8561bf0f.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838305fd1c85625613.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838305fd1c85662a83.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838305fd1c8566b995.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838305fd1c8567fc2f.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838305fd1c856bcdc3.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838305fd1c856c6d2d.png\"/><\/p><p style='overflow:hidden'><br/><\/p>","spes_desc":{"规格":{"190244":"咸肉松小贝【3包】约12枚","190245":"咸肉松小贝【6包】约24枚","190246":"咸肉松小贝 2kg/原装整箱\t"}},"params":"","service":"1,4,6","comments_count":0,"view_count":0,"buy_count":0,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":2,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:39:{i:190243;a:1:{i:0;s:8:\"1个头\t\";}i:190244;a:1:{i:0;s:33:\"咸肉松小贝【3包】约12枚\";}i:190245;a:1:{i:0;s:33:\"咸肉松小贝【6包】约24枚\";}i:190246;a:1:{i:0;s:33:\"咸肉松小贝 2kg/原装整箱\t\";}i:190247;a:1:{i:0;s:21:\"黑色（主驾驶）\";}i:190248;a:1:{i:0;s:21:\"黑色（副驾驶）\";}i:190249;a:1:{i:0;s:21:\"棕色（主驾驶）\";}i:190250;a:1:{i:0;s:21:\"棕色（副驾驶）\";}i:190251;a:1:{i:0;s:21:\"米色（主驾驶）\";}i:190252;a:1:{i:0;s:21:\"米色（副驾驶）\";}i:190253;a:1:{i:0;s:30:\"塑胶无皮款（主驾驶）\";}i:190254;a:1:{i:0;s:30:\"塑胶无皮款（副驾驶）\";}i:190255;a:1:{i:0;s:20:\"黑色主+副2个装\";}i:190256;a:1:{i:0;s:20:\"棕色主+副2个装\";}i:190257;a:1:{i:0;s:20:\"米色主+副2个装\";}i:190258;a:1:{i:0;s:29:\"塑胶无皮款主+副2个装\";}i:190259;a:1:{i:0;s:6:\"大号\";}i:190260;a:1:{i:0;s:6:\"小号\";}i:190261;a:1:{i:0;s:9:\"折叠款\";}i:190262;a:1:{i:0;s:12:\"折叠圆形\";}i:190263;a:1:{i:0;s:7:\"30包*2\";}i:190264;a:1:{i:0;s:5:\"50g*8\";}i:190265;a:1:{i:0;s:24:\"4个500ml高档水晶杯\";}i:190266;a:1:{i:0;s:23:\"S925银针耳钉一对 \";}i:190267;a:1:{i:0;s:25:\" 三角软垫耳夹一对\";}i:190268;a:1:{i:0;s:13:\"龙猫-小草\";}i:190269;a:1:{i:0;s:13:\"龙猫-萝卜\";}i:190270;a:1:{i:0;s:11:\"哆啦A梦1\";}i:190271;a:1:{i:0;s:11:\"哆啦A梦2\";}i:190272;a:1:{i:0;s:14:\"10支蓝桥opp\";}i:190273;a:1:{i:0;s:17:\"10支蓝桥+pu包\";}i:190274;a:1:{i:0;s:7:\"5个头\";}i:190275;a:1:{i:0;s:10:\"带1片布\";}i:190276;a:1:{i:0;s:10:\"带3片布\";}i:190277;a:1:{i:0;s:10:\"带7片布\";}i:190278;a:1:{i:0;s:30:\"美规电源（国内通用）\";}i:190279;a:1:{i:0;s:8:\"2个头\t\";}i:190280;a:1:{i:0;s:8:\"3个头\t\";}i:190281;a:1:{i:0;s:7:\"4个头\";}}","ctime":null,"utime":1608112509,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"休闲零食","products":[{"id":9186,"goods_id":1465,"barcode":null,"sn":"P6075838326945","price":"16.90","costprice":"15.90","mktprice":"0.00","marketable":2,"stock":100,"freeze_stock":0,"spes_desc":"规格:咸肉松小贝【3包】约12枚","is_defalut":1,"image_id":"","isdel":null,"name":"每日小点肉松蛋糕营养早餐面包独立包装","buy_limit":0,"bn":"G6075838326883","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075837335fd1c7f5c1eeb.jpg","total_stock":100,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"咸肉松小贝【3包】约12枚":{"name":"咸肉松小贝【3包】约12枚","is_default":true},"咸肉松小贝【6包】约24枚":{"name":"咸肉松小贝【6包】约24枚","product_id":9187},"咸肉松小贝 2kg/原装整箱\t":{"name":"咸肉松小贝 2kg/原装整箱\t","product_id":9188}}},"amount":"16.90","promotion_list":[],"promotion_amount":0},{"id":9187,"goods_id":1465,"barcode":null,"sn":"P6075838326994","price":"28.90","costprice":"27.50","mktprice":"0.00","marketable":2,"stock":100,"freeze_stock":0,"spes_desc":"规格:咸肉松小贝【6包】约24枚","is_defalut":2,"image_id":"","isdel":null,"name":"每日小点肉松蛋糕营养早餐面包独立包装","buy_limit":0,"bn":"G6075838326883","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075837335fd1c7f5c1eeb.jpg","total_stock":100,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"咸肉松小贝【3包】约12枚":{"name":"咸肉松小贝【3包】约12枚","product_id":9186},"咸肉松小贝【6包】约24枚":{"name":"咸肉松小贝【6包】约24枚","is_default":true},"咸肉松小贝 2kg/原装整箱\t":{"name":"咸肉松小贝 2kg/原装整箱\t","product_id":9188}}},"amount":"28.90","promotion_list":[],"promotion_amount":0},{"id":9188,"goods_id":1465,"barcode":null,"sn":"P6075838327021","price":"74.90","costprice":"69.70","mktprice":"0.00","marketable":2,"stock":100,"freeze_stock":0,"spes_desc":"规格:咸肉松小贝 2kg/原装整箱\t","is_defalut":2,"image_id":"","isdel":null,"name":"每日小点肉松蛋糕营养早餐面包独立包装","buy_limit":0,"bn":"G6075838326883","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075837335fd1c7f5c1eeb.jpg","total_stock":100,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"咸肉松小贝【3包】约12枚":{"name":"咸肉松小贝【3包】约12枚","product_id":9186},"咸肉松小贝【6包】约24枚":{"name":"咸肉松小贝【6包】约24枚","product_id":9187},"咸肉松小贝 2kg/原装整箱\t":{"name":"咸肉松小贝 2kg/原装整箱\t","is_default":true}}},"amount":"74.90","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075837335fd1c7f5c1eeb.jpg","default":{"id":9186,"goods_id":1465,"barcode":null,"sn":"P6075838326945","price":"16.90","costprice":"15.90","mktprice":"0.00","marketable":2,"stock":100,"freeze_stock":0,"spes_desc":"规格:咸肉松小贝【3包】约12枚","is_defalut":1,"image_id":"","isdel":null,"name":"每日小点肉松蛋糕营养早餐面包独立包装","buy_limit":0,"bn":"G6075838326883","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075837335fd1c7f5c1eeb.jpg","total_stock":100,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"咸肉松小贝【3包】约12枚":{"name":"咸肉松小贝【3包】约12枚","is_default":true},"咸肉松小贝【6包】约24枚":{"name":"咸肉松小贝【6包】约24枚","product_id":9187},"咸肉松小贝 2kg/原装整箱\t":{"name":"咸肉松小贝 2kg/原装整箱\t","product_id":9188}}},"amount":"16.90","promotion_list":[],"promotion_amount":0},"product":{"id":9186,"goods_id":1465,"barcode":null,"sn":"P6075838326945","price":"16.90","costprice":"15.90","mktprice":"0.00","marketable":2,"stock":100,"spes_desc":"规格:咸肉松小贝【3包】约12枚","is_defalut":1,"image_id":"","isdel":null,"name":"每日小点肉松蛋糕营养早餐面包独立包装","buy_limit":0,"bn":"G6075838326883","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075837335fd1c7f5c1eeb.jpg","total_stock":100,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"咸肉松小贝【3包】约12枚":{"name":"咸肉松小贝【3包】约12枚","is_default":true},"咸肉松小贝【6包】约24枚":{"name":"咸肉松小贝【6包】约24枚","product_id":9187},"咸肉松小贝 2kg/原装整箱\t":{"name":"咸肉松小贝 2kg/原装整箱\t","product_id":9188}}},"amount":"16.90","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/10/16075837335fd1c7f5c1eeb.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/10/16075837335fd1c7f5d4a0a.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/10/16075837335fd1c7f5cb903.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/10/16075837335fd1c7f5e65f0.jpg"],"total_stock":300,"is_buy_num":0,"isfav":"false","can_buy":"ok","vip_price":16.9,"is_notice":0},{"id":1433,"bn":"G6073251753212","name":"国产紫皮糖1000g巧克力涂层","brief":"","price":"26.00","costprice":"25.30","mktprice":"0.00","image_id":"337e43e8e826a1948fa7f917e0731f9c","goods_cat_id":112,"goods_type_id":79,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":192,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073251595fcdd5e737f47.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073251595fcdd5e760e88.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073251595fcdd5e7d1702.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073251605fcdd5e84ed66.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073251605fcdd5e8cb8d7.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073251615fcdd5e918fe2.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073251615fcdd5e922b38.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073251615fcdd5e95fa7d.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073251615fcdd5e99ec1c.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073251615fcdd5e9dc146.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073221145fcdca02ddc9f.png\" alt=\"16073221145fcdca02ddc9f.png\"/><\/p>","spes_desc":{"规格2":{"185714":" 1000g紫皮糖"}},"params":"","service":"1,4,6,7","comments_count":0,"view_count":0,"buy_count":8,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":1,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:381:{i:185713;a:1:{i:0;s:17:\"120克(不加绒)\";}i:185714;a:1:{i:0;s:15:\" 1000g紫皮糖\";}i:185715;a:1:{i:0;s:36:\"【整条原味】酸豆角500g*2袋\";}i:185716;a:1:{i:0;s:33:\"女款5双【适用于35-39码】\";}i:185717;a:1:{i:0;s:33:\"男款5双【适用于40-44码】\";}i:185718;a:1:{i:0;s:15:\"两层有轮子\";}i:185719;a:1:{i:0;s:15:\"三层有轮子\";}i:185720;a:1:{i:0;s:15:\"四层有轮子\";}i:185721;a:1:{i:0;s:9:\"酒红色\";}i:185722;a:1:{i:0;s:9:\"墨绿色\";}i:185723;a:1:{i:0;s:46:\"一共2个，发不同颜色请自行备注！\";}i:185724;a:1:{i:0;s:31:\"绿色酒套老人款【2个】\";}i:185725;a:1:{i:0;s:31:\"红色酒套雪人款【2个】\";}i:185726;a:1:{i:0;s:31:\"米色酒套雪人款【2个】\";}i:185727;a:1:{i:0;s:21:\"带柄碗（黄色）\";}i:185728;a:1:{i:0;s:24:\"带柄碗（粉红色）\";}i:185729;a:1:{i:0;s:21:\"带柄碗（蓝色）\";}i:185730;a:1:{i:0;s:21:\"带柄碗（绿色）\";}i:185731;a:1:{i:0;s:21:\"带柄碗（黑色）\";}i:185732;a:1:{i:0;s:21:\"带柄碗（白色）\";}i:185733;a:1:{i:0;s:21:\"带柄碗（灰色）\";}i:185734;a:1:{i:0;s:24:\"带柄碗（湖绿色）\";}i:185735;a:1:{i:0;s:23:\"羽绒服湿巾12片装\";}i:185736;a:1:{i:0;s:26:\"皮衣皮革湿巾15片装\";}i:185737;a:1:{i:0;s:35:\"羽绒服泡沫干洗剂（200ml）\";}i:185738;a:1:{i:0;s:23:\"任一产品，拍2发3\";}i:185739;a:1:{i:0;s:22:\"开口松子罐装250g\";}i:185740;a:1:{i:0;s:29:\"开口松子罐装2罐共500g\";}i:185741;a:1:{i:0;s:30:\"开口松子罐装4罐共1000g\";}i:185742;a:1:{i:0;s:22:\"开口松子袋装250g\";}i:185743;a:1:{i:0;s:29:\"开口松子袋装2袋共500g\";}i:185744;a:1:{i:0;s:30:\"开口松子袋装4袋共1000g\";}i:185745;a:1:{i:0;s:10:\"Q宠猫咪\";}i:185746;a:1:{i:0;s:10:\"Q宠小兔\";}i:185747;a:1:{i:0;s:10:\"Q宠小皮\";}i:185748;a:1:{i:0;s:10:\"Q宠小鹿\";}i:185749;a:1:{i:0;s:9:\"N12粉色\";}i:185750;a:1:{i:0;s:9:\"N12绿色\";}i:185751;a:1:{i:0;s:9:\"N12黑色\";}i:185752;a:1:{i:0;s:16:\" 原味香菇酱\";}i:185753;a:1:{i:0;s:15:\"香辣香菇酱\";}i:185754;a:1:{i:0;s:18:\"奥尔良香菇酱\";}i:185755;a:1:{i:0;s:15:\"香辣牛肉酱\";}i:185756;a:1:{i:0;s:15:\"红烧牛肉酱\";}i:185757;a:1:{i:0;s:15:\"五香牛肉酱\";}i:185758;a:1:{i:0;s:43:\"特惠2瓶装【口味请自行备注！】\";}i:185759;a:1:{i:0;s:13:\"圆柿饼2斤\";}i:185760;a:1:{i:0;s:13:\"吊柿饼2斤\";}i:185761;a:1:{i:0;s:27:\"圆柿饼1斤+吊柿饼1斤\";}i:185762;a:1:{i:0;s:8:\"  黄色\";}i:185763;a:1:{i:0;s:8:\"  蓝色\";}i:185764;a:1:{i:0;s:9:\"   粉色\";}i:185765;a:1:{i:0;s:10:\" 果绿色\";}i:185766;a:1:{i:0;s:7:\" 米色\";}i:185767;a:1:{i:0;s:7:\" 灰色\";}i:185768;a:1:{i:0;s:6:\"咖色\";}i:185769;a:1:{i:0;s:10:\" 海藻绿\";}i:185770;a:1:{i:0;s:6:\"褐色\";}i:185771;a:1:{i:0;s:6:\"灰色\";}i:185772;a:1:{i:0;s:9:\"橘红色\";}i:185773;a:1:{i:0;s:9:\"土黄色\";}i:185774;a:1:{i:0;s:6:\"棕色\";}i:185775;a:1:{i:0;s:9:\"卡其色\";}i:185776;a:1:{i:0;s:6:\"墨绿\";}i:185777;a:1:{i:0;s:20:\"9018-26A一鹿有你\";}i:185778;a:1:{i:0;s:20:\"9018-26B一鹿有你\";}i:185779;a:1:{i:0;s:20:\"9018-26C一鹿有你\";}i:185780;a:1:{i:0;s:20:\"9018-26D一鹿有你\";}i:185781;a:1:{i:0;s:26:\"9018-27A黄色老人帽子\";}i:185782;a:1:{i:0;s:26:\"9018-27B黄色小鹿帽子\";}i:185783;a:1:{i:0;s:26:\"9018-27C红色老人帽子\";}i:185784;a:1:{i:0;s:26:\"9018-27D红色雪人帽子\";}i:185785;a:1:{i:0;s:55:\"正版宝可梦皮卡丘神奇宝贝情侣摆件-男款\";}i:185786;a:1:{i:0;s:55:\"正版宝可梦皮卡丘神奇宝贝情侣摆件-女款\";}i:185787;a:1:{i:0;s:62:\"正版宝可梦皮卡丘神奇宝贝情侣摆件-男款+女款\";}i:185788;a:1:{i:0;s:16:\"薄壳罐装250g\";}i:185789;a:1:{i:0;s:23:\"薄壳罐装2罐共500g\";}i:185790;a:1:{i:0;s:24:\"薄壳罐装4罐共1000g\";}i:185791;a:1:{i:0;s:42:\"手撕肉干原味30包/盒（超市同款\";}i:185792;a:1:{i:0;s:45:\"手撕肉干香辣味30包/盒（超市同款\";}i:185793;a:1:{i:0;s:45:\"手撕肉干孜然味30包/盒（超市同款\";}i:185794;a:1:{i:0;s:45:\"手撕肉干麻辣味30包/盒（超市同款\";}i:185795;a:1:{i:0;s:4:\"2包\";}i:185796;a:1:{i:0;s:4:\"5包\";}i:185797;a:1:{i:0;s:5:\"10包\";}i:185798;a:1:{i:0;s:78:\"默认口味随机【肉松味，蟹黄味，海鲜味，请自行备注！】\";}i:185799;a:1:{i:0;s:22:\"夏威夷果罐装250g\";}i:185800;a:1:{i:0;s:29:\"夏威夷果罐装2罐共500g\";}i:185801;a:1:{i:0;s:30:\"夏威夷果罐装4罐共1000g\";}i:185802;a:1:{i:0;s:29:\"夏威夷果袋装2袋共500g\";}i:185803;a:1:{i:0;s:30:\"夏威夷果袋装4袋共1000g\";}i:185804;a:1:{i:0;s:10:\"罐装250g\";}i:185805;a:1:{i:0;s:17:\"罐装2罐共500g\";}i:185806;a:1:{i:0;s:18:\"罐装4罐共1000g\";}i:185807;a:1:{i:0;s:10:\"袋装250g\";}i:185808;a:1:{i:0;s:17:\"袋装2袋共500g\";}i:185809;a:1:{i:0;s:18:\"袋装4袋共1000g\";}i:185810;a:1:{i:0;s:4:\"200g\";}i:185811;a:1:{i:0;s:4:\"400g\";}i:185812;a:1:{i:0;s:4:\"800g\";}i:185813;a:1:{i:0;s:5:\"2500g\";}i:185814;a:1:{i:0;s:15:\"350ml 海天蓝\";}i:185815;a:1:{i:0;s:15:\"350ml 可爱粉\";}i:185816;a:1:{i:0;s:15:\"350ml 活力黄\";}i:185817;a:1:{i:0;s:15:\"300ml 深蓝色\";}i:185818;a:1:{i:0;s:12:\"300ml 红色\";}i:185819;a:1:{i:0;s:12:\"300ml 粉色\";}i:185820;a:1:{i:0;s:16:\"脱脂奶粉800g\";}i:185821;a:1:{i:0;s:4:\"500g\";}i:185822;a:1:{i:0;s:5:\"1000g\";}i:185823;a:1:{i:0;s:5:\"2000g\";}i:185824;a:1:{i:0;s:13:\"青花椒210g\";}i:185825;a:1:{i:0;s:13:\"酸菜鱼220g\";}i:185826;a:1:{i:0;s:13:\"烧鸡公160g\";}i:185827;a:1:{i:0;s:18:\"100ml【1瓶装】\";}i:185828;a:1:{i:0;s:20:\"100ml*3【3瓶装】\";}i:185829;a:1:{i:0;s:15:\"全脂奶粉1kg\";}i:185830;a:1:{i:0;s:15:\"脱脂奶粉1kg\";}i:185831;a:1:{i:0;s:9:\"1瓶60粒\";}i:185832;a:1:{i:0;s:7:\"1瓶20g\";}i:185833;a:1:{i:0;s:10:\"1瓶/50粒\";}i:185834;a:1:{i:0;s:25:\"12盒 益生菌 28片/盒\";}i:185835;a:1:{i:0;s:28:\"12盒 叶黄素酯 28片/盒\";}i:185836;a:1:{i:0;s:27:\"12盒 针叶樱桃28片/盒\";}i:185837;a:1:{i:0;s:22:\"12盒 原味 28片/盒\";}i:185838;a:1:{i:0;s:35:\"haleiwa哈雷蛙保温杯儿 粉色\";}i:185839;a:1:{i:0;s:35:\"haleiwa哈雷蛙保温杯儿 蓝色\";}i:185840;a:1:{i:0;s:24:\"硅胶奶瓶 粉色150ml\";}i:185841;a:1:{i:0;s:4:\"15ml\";}i:185842;a:1:{i:0;s:79:\"8122大【2个装，默认随机.粉色，蓝色，绿色，请 自行备注】\";}i:185843;a:1:{i:0;s:79:\"8123小【2个装，默认随机.粉色，蓝色，绿色，请 自行备注】\";}i:185844;a:1:{i:0;s:32:\"整箱60包【家庭实惠装】\";}i:185845;a:1:{i:0;s:9:\"粉红色\";}i:185846;a:1:{i:0;s:6:\"蓝色\";}i:185847;a:1:{i:0;s:6:\"白色\";}i:185848;a:1:{i:0;s:31:\"脱骨凤爪200g（柠檬味）\";}i:185849;a:1:{i:0;s:31:\"脱骨凤爪200g（山椒味）\";}i:185850;a:1:{i:0;s:8:\" 50*50CM\";}i:185851;a:1:{i:0;s:36:\"小号48CM*40CM(底部直径*高度)\";}i:185852;a:1:{i:0;s:36:\"大号56CM*48CM(底部直径*高度)\";}i:185853;a:1:{i:0;s:111:\"【此项勿拍】颜色默认随机【蓝色，紫色，粉色，白色，有颜色要求请自行备注！】\";}i:185854;a:1:{i:0;s:66:\"1.8快慢档+不锈钢蒸格+送7礼【可炖煮，不可煎炒】\";}i:185855;a:1:{i:0;s:69:\"1.8不粘快慢档+不锈钢蒸格+送8礼【可炖煮，可煎炒】\";}i:185856;a:1:{i:0;s:19:\"标准版-无蓝光\";}i:185857;a:1:{i:0;s:25:\"升级版-蓝光负离子\";}i:185858;a:1:{i:0;s:21:\"鸳鸯火锅礼品款\";}i:185859;a:1:{i:0;s:21:\"鸳鸯火锅高端款\";}i:185860;a:1:{i:0;s:19:\"白色+USB充电线\";}i:185861;a:1:{i:0;s:19:\"蓝色+USB充电线\";}i:185862;a:1:{i:0;s:22:\"粉红色+USB充电线\";}i:185863;a:1:{i:0;s:12:\"小猪米色\";}i:185864;a:1:{i:0;s:12:\"小猪粉色\";}i:185865;a:1:{i:0;s:23:\"橄榄深层保湿800g\t\";}i:185866;a:1:{i:0;s:23:\"薄荷冰爽健肤800g\t\";}i:185867;a:1:{i:0;s:23:\"牛奶润滑嫩肤800g\t\";}i:185868;a:1:{i:0;s:26:\"薰衣草舒缓肌肤800g\t\";}i:185869;a:1:{i:0;s:23:\"法国迷蝶香水800g\t\";}i:185870;a:1:{i:0;s:23:\"海马情迷香肌800g\t\";}i:185871;a:1:{i:0;s:23:\"芦荟清新爽肤800g\t\";}i:185872;a:1:{i:0;s:18:\"普通款三件套\";}i:185873;a:1:{i:0;s:12:\"小号蓝色\";}i:185874;a:1:{i:0;s:12:\"小号粉色\";}i:185875;a:1:{i:0;s:12:\"小号灰色\";}i:185876;a:1:{i:0;s:12:\"大号蓝色\";}i:185877;a:1:{i:0;s:12:\"大号粉色\";}i:185878;a:1:{i:0;s:12:\"大号灰色\";}i:185879;a:1:{i:0;s:16:\"小小面包380g\";}i:185880;a:1:{i:0;s:7:\"2罐装\";}i:185881;a:1:{i:0;s:9:\"1盒2.5ML\";}i:185882;a:1:{i:0;s:33:\"颜色随机【线长约1.5米】\";}i:185883;a:1:{i:0;s:12:\"颜色随机\";}i:185884;a:1:{i:0;s:14:\"梨膏糖*2罐\";}i:185885;a:1:{i:0;s:26:\"牛油果润唇膏4.5g/支\";}i:185886;a:1:{i:0;s:9:\"480g*2箱\";}i:185887;a:1:{i:0;s:3:\"60g\";}i:185888;a:1:{i:0;s:9:\"葡萄味\";}i:185889;a:1:{i:0;s:10:\"150片/瓶\";}i:185890;a:1:{i:0;s:72:\"默认字母混搭男款5双【u字混搭女款5双请自行备注！】\";}i:185891;a:1:{i:0;s:9:\"310g*3袋\";}i:185892;a:1:{i:0;s:9:\"310g*5袋\";}i:185893;a:1:{i:0;s:10:\"310g*10袋\";}i:185894;a:1:{i:0;s:21:\"正宗城味300g*3袋\";}i:185895;a:1:{i:0;s:17:\"正宗城味300g*\";}i:185896;a:1:{i:0;s:4:\"5袋\";}i:185897;a:1:{i:0;s:22:\"正宗城味300g*10袋\";}i:185898;a:1:{i:0;s:15:\"3袋共90小包\";}i:185899;a:1:{i:0;s:39:\"按压款停车牌【黑色塑料款】\";}i:185900;a:1:{i:0;s:39:\"按压款停车牌【银色合金款】\";}i:185901;a:1:{i:0;s:39:\"按压款停车牌【金色合金款】\";}i:185902;a:1:{i:0;s:2:\"A8\";}i:185903;a:1:{i:0;s:30:\"七彩虹（密码锁齿轮）\";}i:185904;a:1:{i:0;s:17:\"30片川香风味\";}i:185905;a:1:{i:0;s:20:\"30片麦辣鸡汁味\";}i:185906;a:1:{i:0;s:20:\"30片红烧牛肉味\";}i:185907;a:1:{i:0;s:20:\"三种口味各10片\";}i:185908;a:1:{i:0;s:66:\"【此项勿拍】两瓶需要不同香味的，请自行备注！\";}i:185909;a:1:{i:0;s:37:\"海洋【买一送一，实发2瓶】\";}i:185910;a:1:{i:0;s:37:\"桂花【买一送一，实发2瓶】\";}i:185911;a:1:{i:0;s:37:\"茉莉【买一送一，实发2瓶】\";}i:185912;a:1:{i:0;s:37:\"古龙【买一送一，实发2瓶】\";}i:185913;a:1:{i:0;s:37:\"柠檬【买一送一，实发2瓶】\";}i:185914;a:1:{i:0;s:21:\"脆口菜芯426g*2瓶\";}i:185915;a:1:{i:0;s:21:\"香辣三丝426g*2瓶\";}i:185916;a:1:{i:0;s:21:\"开味酸菜426g*2瓶\";}i:185917;a:1:{i:0;s:21:\"脆口豇豆426g*2瓶\";}i:185918;a:1:{i:0;s:23:\"426g爽口下饭菜2瓶\";}i:185919;a:1:{i:0;s:53:\"正装280ml奇异果香型+补充装300ml草莓香型\";}i:185920;a:1:{i:0;s:34:\"狼蛛2016黑色圆键机械键盘\";}i:185921;a:1:{i:0;s:16:\"400g混合口味\";}i:185922;a:1:{i:0;s:16:\"800g混合口味\";}i:185923;a:1:{i:0;s:17:\"2500g混合口味\";}i:185924;a:1:{i:0;s:32:\"2包【100抽】15*20cm珍珠纹\";}i:185925;a:1:{i:0;s:29:\"2包【100抽】15*20cm平纹\";}i:185926;a:1:{i:0;s:34:\"15*20cm珍珠纹和平纹各一包\";}i:185927;a:1:{i:0;s:39:\"1块除菌止痒皂+2块滋润柔肤皂\";}i:185928;a:1:{i:0;s:39:\"2块除菌止痒皂+1块滋润柔肤皂\";}i:185929;a:1:{i:0;s:19:\"3块除菌止痒皂\";}i:185930;a:1:{i:0;s:19:\"3块滋润柔肤皂\";}i:185931;a:1:{i:0;s:9:\"12ml*7个\";}i:185932;a:1:{i:0;s:16:\"混装口味1斤\";}i:185933;a:1:{i:0;s:13:\"麻辣味1斤\";}i:185934;a:1:{i:0;s:13:\"爆烤味1斤\";}i:185935;a:1:{i:0;s:13:\"山椒味1斤\";}i:185936;a:1:{i:0;s:13:\"五香味1斤\";}i:185937;a:1:{i:0;s:13:\"鸡汁味1斤\";}i:185938;a:1:{i:0;s:4:\"2对\";}i:185939;a:1:{i:0;s:12:\"花朵蓝色\";}i:185940;a:1:{i:0;s:12:\"花朵绿色\";}i:185941;a:1:{i:0;s:12:\"花朵粉色\";}i:185942;a:1:{i:0;s:12:\"荷花蓝色\";}i:185943;a:1:{i:0;s:12:\"荷花绿色\";}i:185944;a:1:{i:0;s:12:\"荷花粉色\";}i:185945;a:1:{i:0;s:56:\"标配：KS-738旋转手电筒+18650电池+USB线+彩盒\";}i:185946;a:1:{i:0;s:23:\"200PC女孩图案粉色\";}i:185947;a:1:{i:0;s:26:\"200PC独角兽图案蓝色\";}i:185948;a:1:{i:0;s:17:\"200PC铝盒粉色\";}i:185949;a:1:{i:0;s:17:\"200PC铝盒蓝色\";}i:185950;a:1:{i:0;s:17:\"200PC铝盒黄色\";}i:185951;a:1:{i:0;s:26:\"200PC独角兽图案粉色\";}i:185952;a:1:{i:0;s:28:\"【超辣】山椒花生1斤\";}i:185953;a:1:{i:0;s:25:\"【辣】秘辣花生1斤\";}i:185954;a:1:{i:0;s:28:\"【不辣】盐焗花生1斤\";}i:185955;a:1:{i:0;s:13:\"混合味1斤\";}i:185956;a:1:{i:0;s:19:\"5瓶【实惠装】\";}i:185957;a:1:{i:0;s:15:\"电池款粉色\";}i:185958;a:1:{i:0;s:15:\"电池款蓝色\";}i:185959;a:1:{i:0;s:15:\"充电款粉色\";}i:185960;a:1:{i:0;s:15:\"充电款蓝色\";}i:185961;a:1:{i:0;s:9:\"120g*2袋\";}i:185962;a:1:{i:0;s:11:\"310ml*12瓶\";}i:185963;a:1:{i:0;s:7:\"[14]码\";}i:185964;a:1:{i:0;s:10:\"内长14cm\";}i:185965;a:1:{i:0;s:7:\"[15]码\";}i:185966;a:1:{i:0;s:10:\"内长15cm\";}i:185967;a:1:{i:0;s:7:\"[16]码\";}i:185968;a:1:{i:0;s:10:\"内长16cm\";}i:185969;a:1:{i:0;s:7:\"[17]码\";}i:185970;a:1:{i:0;s:10:\"内长17cm\";}i:185971;a:1:{i:0;s:7:\"[18]码\";}i:185972;a:1:{i:0;s:10:\"内长18cm\";}i:185973;a:1:{i:0;s:7:\"[19]码\";}i:185974;a:1:{i:0;s:10:\"内长19cm\";}i:185975;a:1:{i:0;s:7:\"[20]码\";}i:185976;a:1:{i:0;s:10:\"内长20cm\";}i:185977;a:1:{i:0;s:28:\"薰衣草【鸭蛋形300g】\";}i:185978;a:1:{i:0;s:25:\"茉莉【鸭蛋形300g】\";}i:185979;a:1:{i:0;s:25:\"玫瑰【鸭蛋形300g】\";}i:185980;a:1:{i:0;s:23:\"420ml白身一个草莓\";}i:185981;a:1:{i:0;s:23:\"420ml白身多个草莓\";}i:185982;a:1:{i:0;s:23:\"420ml粉身一个草莓\";}i:185983;a:1:{i:0;s:23:\"420ml粉身多个草莓\";}i:185984;a:1:{i:0;s:23:\"300ml白身一个草莓\";}i:185985;a:1:{i:0;s:23:\"300ml白身多个草莓\";}i:185986;a:1:{i:0;s:23:\"300ml粉身一个草莓\";}i:185987;a:1:{i:0;s:23:\"300ml粉身多个草莓\";}i:185988;a:1:{i:0;s:4:\"1瓶\";}i:185989;a:1:{i:0;s:19:\"2瓶【优惠价】\";}i:185990;a:1:{i:0;s:34:\"5个装【茉莉味，特价款】\";}i:185991;a:1:{i:0;s:37:\"5个装【薰衣草味，升级款】\";}i:185992;a:1:{i:0;s:34:\"5个装【柠檬味，升级款】\";}i:185993;a:1:{i:0;s:24:\"混合味（箱装1kg）\";}i:185994;a:1:{i:0;s:28:\"01#混合味（箱装500g）\";}i:185995;a:1:{i:0;s:31:\"02#黑芝麻味（箱装500g）\";}i:185996;a:1:{i:0;s:31:\"03#黄芝麻味（箱装500g）\";}i:185997;a:1:{i:0;s:31:\"04#白芝麻味（箱装500g）\";}i:185998;a:1:{i:0;s:28:\"05#花生味（箱装500g）\";}i:185999;a:1:{i:0;s:30:\"06#黑芝麻味（箱装1kg）\";}i:186000;a:1:{i:0;s:30:\"07#黄芝麻味（箱装1kg）\";}i:186001;a:1:{i:0;s:30:\"08#白芝麻味（箱装1kg）\";}i:186002;a:1:{i:0;s:25:\"09#花生味（箱装1kg)\";}i:186003;a:1:{i:0;s:75:\"插电款银色（不带无线充）+配USB线+配USB充电头+三档调光\";}i:186004;a:1:{i:0;s:75:\"充电款银色（不带无线充）+配USB线+配USB充电头+三档调光\";}i:186005;a:1:{i:0;s:84:\"插电款银色（不带无线充）+配USB线+配USB充电头+调光调色带定时\";}i:186006;a:1:{i:0;s:84:\"充电款银色（不带无线充）+配USB线+配USB充电头+调光调色带定时\";}i:186007;a:1:{i:0;s:81:\"插电款银色（带无线充）+配USB线+配USB充电头+调光调色带定时\";}i:186008;a:1:{i:0;s:51:\"家庭实惠装【20支】白色10支，竹炭10支\";}i:186009;a:1:{i:0;s:32:\"家庭实惠装【20支】竹炭\";}i:186010;a:1:{i:0;s:32:\"家庭实惠装【20支】白色\";}i:186011;a:1:{i:0;s:19:\"100ml/瓶【3瓶】\";}i:186012;a:1:{i:0;s:51:\"【此项勿拍！】请拍两双，一双不发货\";}i:186013;a:1:{i:0;s:25:\"36-37（建议35-36码）\";}i:186014;a:1:{i:0;s:25:\"38-39（建议37-38码）\";}i:186015;a:1:{i:0;s:25:\"40-41（建议39-40码）\";}i:186016;a:1:{i:0;s:17:\"3斤1.5L实惠装\";}i:186017;a:1:{i:0;s:37:\"咸蛋黄卷288g/箱+牛乳卷288/箱\";}i:186018;a:1:{i:0;s:25:\"1-3岁建议脚长11-13CM\";}i:186019;a:1:{i:0;s:25:\"3-5岁建议脚长13-15CM\";}i:186020;a:1:{i:0;s:25:\"6-8岁建议脚长16-18CM\";}i:186021;a:1:{i:0;s:26:\"8-12岁建议脚长18-22CM\";}i:186022;a:1:{i:0;s:24:\"两支特惠装3.5g+3.5g\";}i:186023;a:1:{i:0;s:9:\"儿童款\";}i:186024;a:1:{i:0;s:9:\"成人款\";}i:186025;a:1:{i:0;s:1:\"S\";}i:186026;a:1:{i:0;s:1:\"M\";}i:186027;a:1:{i:0;s:1:\"L\";}i:186028;a:1:{i:0;s:16:\"3双随机图案\";}i:186029;a:1:{i:0;s:10:\"3双透白\";}i:186030;a:1:{i:0;s:13:\"3双幸运鹿\";}i:186031;a:1:{i:0;s:13:\"3双幸运鸟\";}i:186032;a:1:{i:0;s:13:\"3双幸运吻\";}i:186033;a:1:{i:0;s:12:\"3双01字母\";}i:186034;a:1:{i:0;s:17:\"长55宽35高35cm\";}i:186035;a:1:{i:0;s:10:\"6000毫安\";}i:186036;a:1:{i:0;s:11:\"10000毫安\";}i:186037;a:1:{i:0;s:30:\"美规电源（国内通用）\";}i:186038;a:1:{i:0;s:12:\"三层黑色\";}i:186039;a:1:{i:0;s:12:\"三层玫红\";}i:186040;a:1:{i:0;s:12:\"四层黑色\";}i:186041;a:1:{i:0;s:12:\"四层玫红\";}i:186042;a:1:{i:0;s:12:\"五层黑色\";}i:186043;a:1:{i:0;s:12:\"五层玫红\";}i:186044;a:1:{i:0;s:28:\"黑色普通款（60cm宽）\";}i:186045;a:1:{i:0;s:29:\"白色普通款（110cm宽）\";}i:186046;a:1:{i:0;s:29:\"黑色普通款（110cm宽）\";}i:186047;a:1:{i:0;s:29:\"白色防风款（110cm宽）\";}i:186048;a:1:{i:0;s:29:\"黑色防风款（110cm宽）\";}i:186049;a:1:{i:0;s:35:\"白色普通单边树杈（110cm）\";}i:186050;a:1:{i:0;s:35:\"黑色普通单边树杈（110cm）\";}i:186051;a:1:{i:0;s:35:\"白色普通双边树杈（110cm）\";}i:186052;a:1:{i:0;s:35:\"黑色防风双边树杈（110cm）\";}i:186053;a:1:{i:0;s:23:\"白色双杆（110cm）\";}i:186054;a:1:{i:0;s:23:\"黑色双杆（110cm）\";}i:186055;a:1:{i:0;s:32:\"白色双层双树杈（110cm）\";}i:186056;a:1:{i:0;s:32:\"黑色双层双树杈（110cm）\";}i:186057;a:1:{i:0;s:24:\"暖足贴（2片）30组\";}i:186058;a:1:{i:0;s:20:\"益母草暖贴30个\";}i:186059;a:1:{i:0;s:17:\"艾草暖贴30个\";}i:186060;a:1:{i:0;s:20:\"增强型暖贴30个\";}i:186061;a:1:{i:0;s:24:\"暖足贴（2片）10组\";}i:186062;a:1:{i:0;s:20:\"增强型暖贴10个\";}i:186063;a:1:{i:0;s:17:\"艾草暖贴10个\";}i:186064;a:1:{i:0;s:20:\"益母草暖贴10个\";}i:186065;a:1:{i:0;s:4:\"5个\";}i:186066;a:1:{i:0;s:5:\"10个\";}i:186067;a:1:{i:0;s:20:\"10种果蔬250G*1袋\";}i:186068;a:1:{i:0;s:21:\"10种果蔬500G*1袋\t\";}i:186069;a:1:{i:0;s:14:\"北欧蓝20个\";}i:186070;a:1:{i:0;s:14:\"北欧粉20个\";}i:186071;a:1:{i:0;s:68:\"【四折小动物】+【四周发热】+【赠送护膝小盖毯】\";}i:186072;a:1:{i:0;s:68:\"【森系小动物】+【四周发热】+【赠送护膝小盖毯】\";}i:186073;a:1:{i:0;s:68:\"【田园小清新】+【四周发热】+【赠送护膝小盖毯】\";}i:186074;a:1:{i:0;s:68:\"【插画小树林】+【四周发热】+【赠送护膝小盖毯】\";}i:186075;a:1:{i:0;s:62:\"【简约灰】+【四周发热】+【赠送护膝小盖毯】\";}i:186076;a:1:{i:0;s:20:\"方形海绵擦20片\";}i:186077;a:1:{i:0;s:9:\"70g*10包\";}i:186078;a:1:{i:0;s:15:\"羽丝绒中枕\";}i:186079;a:1:{i:0;s:15:\"羽丝绒低枕\";}i:186080;a:1:{i:0;s:8:\"50g*2罐\";}i:186081;a:1:{i:0;s:27:\"2020新货特大颗粒/500g\";}i:186082;a:1:{i:0;s:24:\"2020新货大颗粒/500g\";}i:186083;a:1:{i:0;s:27:\"2020新货中等颗粒/500g\";}i:186084;a:1:{i:0;s:24:\"2020新货小颗粒/500g\";}i:186085;a:1:{i:0;s:17:\"50克(不加绒)\t\";}i:186086;a:1:{i:0;s:17:\"80克(不加绒)\t\";}i:186087;a:1:{i:0;s:24:\"100克锦纶(不加绒)\t\";}i:186088;a:1:{i:0;s:24:\"150克锦纶(龙爪绒)\t\";}i:186089;a:1:{i:0;s:21:\"200克(加绒加绒)\t\";}i:186090;a:1:{i:0;s:21:\"300克(加绒加厚)\t\";}i:186091;a:1:{i:0;s:21:\"500克(加绒特厚)\t\";}i:186092;a:1:{i:0;s:20:\"250克(加绒加厚)\";}i:186093;a:1:{i:0;s:20:\"350克(加绒加厚)\";}}","ctime":null,"utime":1607325250,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"休闲零食","products":[{"id":9061,"goods_id":1433,"barcode":null,"sn":"P6073251753284","price":"26.00","costprice":"25.30","mktprice":"0.00","marketable":2,"stock":192,"freeze_stock":0,"spes_desc":"规格2: 1000g紫皮糖","is_defalut":1,"image_id":"","isdel":null,"name":"国产紫皮糖1000g巧克力涂层","buy_limit":0,"bn":"G6073251753212","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073250315fcdd5678eb90.jpg","total_stock":192,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格2":{" 1000g紫皮糖":{"name":" 1000g紫皮糖","is_default":true}}},"amount":"26.00","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073250315fcdd5678eb90.jpg","default":{"id":9061,"goods_id":1433,"barcode":null,"sn":"P6073251753284","price":"26.00","costprice":"25.30","mktprice":"0.00","marketable":2,"stock":192,"freeze_stock":0,"spes_desc":"规格2: 1000g紫皮糖","is_defalut":1,"image_id":"","isdel":null,"name":"国产紫皮糖1000g巧克力涂层","buy_limit":0,"bn":"G6073251753212","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073250315fcdd5678eb90.jpg","total_stock":192,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格2":{" 1000g紫皮糖":{"name":" 1000g紫皮糖","is_default":true}}},"amount":"26.00","promotion_list":[],"promotion_amount":0},"product":{"id":9061,"goods_id":1433,"barcode":null,"sn":"P6073251753284","price":"26.00","costprice":"25.30","mktprice":"0.00","marketable":2,"stock":192,"spes_desc":"规格2: 1000g紫皮糖","is_defalut":1,"image_id":"","isdel":null,"name":"国产紫皮糖1000g巧克力涂层","buy_limit":0,"bn":"G6073251753212","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073250315fcdd5678eb90.jpg","total_stock":192,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格2":{" 1000g紫皮糖":{"name":" 1000g紫皮糖","is_default":true}}},"amount":"26.00","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/07/16073250315fcdd5678eb90.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/07/16073250315fcdd5677e278.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/07/16073250315fcdd567981e2.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/07/16073250315fcdd56775146.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/07/16073250315fcdd567653a2.jpg"],"total_stock":192,"is_buy_num":8,"isfav":"false","can_buy":"ok","vip_price":26,"is_notice":0}],"total_page":6,"filter":[],"page":1,"limit":10,"where":{"cat_id":"112"},"order":"","class_name":"休闲零食"}
     */

    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public DataBean getData() {
        return data;
    }

    private String msg;
    private DataBean data;

    public static class DataBean {

        public int getTotal_page() {
            return total_page;
        }

        public int getPage() {
            return page;
        }

        public int getLimit() {
            return limit;
        }

        public WhereBean getWhere() {
            return where;
        }

        public String getOrder() {
            return order;
        }

        public String getClass_name() {
            return class_name;
        }

        public List<ListBean> getList() {
            return list;
        }

        public String getFilter() {
            return filter;
        }

        /**
         * list : [{"id":1541,"bn":"G6087109327893","name":"2斤小核肉厚桂圆500g*2 休闲零食农产品龙眼干","brief":"不免邮区域:海外,台湾,澳门,\n香港,西藏,新疆,宁夏,青海,内蒙古","price":"27.00","costprice":"25.80","mktprice":"0.00","image_id":"1672061b623bfe9f1915e8bb0a78f85b","goods_cat_id":112,"goods_type_id":48,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":163,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109205fe2fb08f1245.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb090831f.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb09121a2.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb0932bdb.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb0940700.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb094ab5b.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb095da30.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb096d31a.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb09769e4.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb098bfe8.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb099b20b.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb09a6703.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb09b0fb0.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb09be8a6.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb09c7b9e.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087082265fe2f082987b6.png\" alt=\"16087082265fe2f082987b6.png\"/><\/p>","spes_desc":{"规格":{"198969":"500g*2袋【共2斤】"}},"params":"","service":"1,4,6,7","comments_count":0,"view_count":0,"buy_count":27,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":1,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:315:{i:198968;a:1:{i:0;s:17:\"蓝色纸盒20朵\";}i:198969;a:1:{i:0;s:22:\"500g*2袋【共2斤】\";}i:198970;a:1:{i:0;s:9:\"经典黑\";}i:198971;a:1:{i:0;s:23:\"升级波浪款10片装\";}i:198972;a:1:{i:0;s:42:\"特大号带镜子三层，单双肩两用\";}i:198973;a:1:{i:0;s:18:\"迷你小号手提\";}i:198974;a:1:{i:0;s:24:\"小号三层，可单肩\";}i:198975;a:1:{i:0;s:30:\"中号三层，单双肩两用\";}i:198976;a:1:{i:0;s:30:\"大号三层，单双肩两用\";}i:198977;a:1:{i:0;s:39:\"大号带镜子三层，单双肩两用\";}i:198978;a:1:{i:0;s:20:\"大胆爱love3只装\";}i:198979;a:1:{i:0;s:22:\"大胆爱 LOVE10只装\";}i:198980;a:1:{i:0;s:24:\"杜蕾斯 活力12只装\";}i:198981;a:1:{i:0;s:19:\"超薄-隐 12只装\";}i:198982;a:1:{i:0;s:23:\"杜蕾斯 活力3只装\";}i:198983;a:1:{i:0;s:18:\"超薄-隐 3只装\";}i:198984;a:1:{i:0;s:17:\"长55宽35高35cm\";}i:198985;a:1:{i:0;s:12:\"熊掌粉色\";}i:198986;a:1:{i:0;s:12:\"熊掌灰色\";}i:198987;a:1:{i:0;s:12:\"熊掌棕色\";}i:198988;a:1:{i:0;s:9:\"萌小猪\";}i:198989;a:1:{i:0;s:9:\"灰龙猫\";}i:198990;a:1:{i:0;s:9:\"小浣熊\";}i:198991;a:1:{i:0;s:19:\"黑色-铅色五金\";}i:198992;a:1:{i:0;s:19:\"黑色-金色五金\";}i:198993;a:1:{i:0;s:18:\" 单开门56*120cm\";}i:198994;a:1:{i:0;s:23:\"侧开门冰箱56*120cm\";}i:198995;a:1:{i:0;s:23:\"双开门冰箱70*170cm\";}i:198996;a:1:{i:0;s:6:\"红色\";}i:198997;a:1:{i:0;s:6:\"杏色\";}i:198998;a:1:{i:0;s:27:\"【标准22管径】53-80cm\";}i:198999;a:1:{i:0;s:29:\"【标准22管径】70-120cm \";}i:199000;a:1:{i:0;s:29:\"【标准22管径】90-160cm \";}i:199001;a:1:{i:0;s:30:\"【标准22管径】110-200cm \";}i:199002;a:1:{i:0;s:30:\"【标准22管径】128-240cm \";}i:199003;a:1:{i:0;s:30:\"【标准22管径】150-280cm \";}i:199004;a:1:{i:0;s:27:\"【标准25管径】50-80cm\";}i:199005;a:1:{i:0;s:29:\"【标准25管径】70-120cm \";}i:199006;a:1:{i:0;s:29:\"【标准25管径】90-160cm \";}i:199007;a:1:{i:0;s:30:\"【标准25管径】110-200cm \";}i:199008;a:1:{i:0;s:30:\"【标准25管径】128-240cm \";}i:199009;a:1:{i:0;s:30:\"【标准25管径】150-280cm \";}i:199010;a:1:{i:0;s:14:\"1手柄3卷纸\";}i:199011;a:1:{i:0;s:12:\"金色小熊\";}i:199012;a:1:{i:0;s:15:\"玫瑰金小熊\";}i:199013;a:1:{i:0;s:12:\"玫粉小熊\";}i:199014;a:1:{i:0;s:12:\"银色小熊\";}i:199015;a:1:{i:0;s:12:\"橘色小熊\";}i:199016;a:1:{i:0;s:12:\"蓝色佩奇\";}i:199017;a:1:{i:0;s:12:\"粉色佩奇\";}i:199018;a:1:{i:0;s:13:\"黄色表情1\";}i:199019;a:1:{i:0;s:13:\"黄色表情3\";}i:199020;a:1:{i:0;s:6:\"黄鸭\";}i:199021;a:1:{i:0;s:6:\"蓝鸭\";}i:199022;a:1:{i:0;s:6:\"粉鸭\";}i:199023;a:1:{i:0;s:15:\"小雏菊黑色\";}i:199024;a:1:{i:0;s:15:\"小雏菊粉色\";}i:199025;a:1:{i:0;s:15:\"小雏菊橙色\";}i:199026;a:1:{i:0;s:15:\"新款蓝色熊\";}i:199027;a:1:{i:0;s:15:\"新款黄色熊\";}i:199028;a:1:{i:0;s:15:\"粉色小兔子\";}i:199029;a:1:{i:0;s:15:\"紫色小兔子\";}i:199030;a:1:{i:0;s:18:\"玫红色小兔子\";}i:199031;a:1:{i:0;s:12:\"红色雏菊\";}i:199032;a:1:{i:0;s:12:\"红色鸭子\";}i:199033;a:1:{i:0;s:12:\"网红黑色\";}i:199034;a:1:{i:0;s:12:\"网红红色\";}i:199035;a:1:{i:0;s:12:\"网红粉色\";}i:199036;a:1:{i:0;s:15:\"网红玫红色\";}i:199037;a:1:{i:0;s:15:\"纸盒人红色\";}i:199038;a:1:{i:0;s:15:\"纸盒人白色\";}i:199039;a:1:{i:0;s:15:\"纸盒人绿色\";}i:199040;a:1:{i:0;s:15:\"纸盒人橘色\";}i:199041;a:1:{i:0;s:15:\"纸盒人黑色\";}i:199042;a:1:{i:0;s:24:\"歪头鸭鸭姜黄单肩\";}i:199043;a:1:{i:0;s:21:\"空心兔米白单肩\";}i:199044;a:1:{i:0;s:31:\"wink鸭鸭米白可调节斜跨\";}i:199045;a:1:{i:0;s:22:\"wink鸭鸭米白单肩\";}i:199046;a:1:{i:0;s:36:\"大眼睛鸭鸭米白可调节斜跨\";}i:199047;a:1:{i:0;s:27:\"大眼睛鸭鸭米白单肩\";}i:199048;a:1:{i:0;s:30:\"大眼睛鸭鸭米白小手提\";}i:199049;a:1:{i:0;s:27:\"歪头鸭鸭绿色小手提\";}i:199050;a:1:{i:0;s:27:\"歪头鸭鸭粉色小手提\";}i:199051;a:1:{i:0;s:27:\"歪头鸭鸭藏青小手提\";}i:199052;a:1:{i:0;s:24:\"歪头鸭鸭黄小手提\";}i:199053;a:1:{i:0;s:27:\"歪头鸭鸭米白小手提\";}i:199054;a:1:{i:0;s:24:\"空心兔米白小手提\";}i:199055;a:1:{i:0;s:25:\"wink鸭鸭米白小手提\";}i:199056;a:1:{i:0;s:7:\"200ml*3\";}i:199057;a:1:{i:0;s:26:\"1000ML营养柔顺(黄色)\";}i:199058;a:1:{i:0;s:30:\"1000ML多效修护（粉色）\";}i:199059;a:1:{i:0;s:30:\"1000ML焗油顺滑（蓝色）\";}i:199060;a:1:{i:0;s:30:\"1000ML去屑柔顺（橙色）\";}i:199061;a:1:{i:0;s:5:\"50g*4\";}i:199062;a:1:{i:0;s:17:\" 700g深润去屑\";}i:199063;a:1:{i:0;s:16:\"700g柔顺亮泽\";}i:199064;a:1:{i:0;s:16:\"700g柔韧丝滑\";}i:199065;a:1:{i:0;s:33:\"北美留兰120g+竹炭薄荷120g\";}i:199066;a:1:{i:0;s:33:\"竹炭薄荷120g+茉莉白茶120g\";}i:199067;a:1:{i:0;s:33:\"北美留兰120g+茉莉白茶120g\";}i:199068;a:1:{i:0;s:18:\"北美留兰120g*2\";}i:199069;a:1:{i:0;s:18:\"竹炭薄荷120g*2\";}i:199070;a:1:{i:0;s:18:\"茉莉白茶120g*2\";}i:199071;a:1:{i:0;s:6:\"粉色\";}i:199072;a:1:{i:0;s:6:\"蓝色\";}i:199073;a:1:{i:0;s:6:\"灰色\";}i:199074;a:1:{i:0;s:8:\"白色  \";}i:199075;a:1:{i:0;s:8:\"红色  \";}i:199076;a:1:{i:0;s:8:\"黑色  \";}i:199077;a:1:{i:0;s:11:\"豆粉色  \";}i:199078;a:1:{i:0;s:14:\"深卡其色  \";}i:199079;a:1:{i:0;s:8:\"咖色  \";}i:199080;a:1:{i:0;s:8:\"杏色  \";}i:199081;a:1:{i:0;s:14:\"20条双层款\";}i:199082;a:1:{i:0;s:21:\"3斤装中果/约5个\";}i:199083;a:1:{i:0;s:23:\"5斤装中果/约8-9个\";}i:199084;a:1:{i:0;s:23:\"5斤装大果/约3-7个\";}i:199085;a:1:{i:0;s:24:\"6斤装中果/约9-10个\";}i:199086;a:1:{i:0;s:23:\"6斤装大果/约4-8个\";}i:199087;a:1:{i:0;s:25:\"5斤装小果/约11-12个\";}i:199088;a:1:{i:0;s:22:\"8斤装小果/约18个\";}i:199089;a:1:{i:0;s:22:\"8斤装中果/约14个\";}i:199090;a:1:{i:0;s:22:\"8斤装大果/约10个\";}i:199091;a:1:{i:0;s:11:\"12粒/盒*2\";}i:199092;a:1:{i:0;s:60:\"默认黑色挂篮【需要白色，蓝色请自行备注】\";}i:199093;a:1:{i:0;s:67:\"默认黑色挂篮+挂钩【需要白色，蓝色请自行备注】\";}i:199094;a:1:{i:0;s:7:\"粉色 \";}i:199095;a:1:{i:0;s:7:\"米色 \";}i:199096;a:1:{i:0;s:7:\"浅蓝 \";}i:199097;a:1:{i:0;s:7:\"深蓝 \";}i:199098;a:1:{i:0;s:48:\"共14只【10母蟹3两/只，4公蟹4两/只】\";}i:199099;a:1:{i:0;s:12:\" 70克100张\";}i:199100;a:1:{i:0;s:11:\"80克100张\";}i:199101;a:1:{i:0;s:9:\"100g*4块\";}i:199102;a:1:{i:0;s:7:\"白色 \";}i:199103;a:1:{i:0;s:7:\"黑色 \";}i:199104;a:1:{i:0;s:18:\"金属黑无声版\";}i:199105;a:1:{i:0;s:18:\"星辰黑无声版\";}i:199106;a:1:{i:0;s:9:\"酒红色\";}i:199107;a:1:{i:0;s:9:\"浅灰色\";}i:199108;a:1:{i:0;s:6:\"黑色\";}i:199109;a:1:{i:0;s:9:\"粉红色\";}i:199110;a:1:{i:0;s:35:\"KS-739定焦手电筒+USB线+彩盒\";}i:199111;a:1:{i:0;s:35:\"金色（6味6饼）明月照我还\";}i:199112;a:1:{i:0;s:35:\"红色（6味6饼）月上柳梢头\";}i:199113;a:1:{i:0;s:44:\"蓝色（6味6饼）但愿人长久\t19.89元\";}i:199114;a:1:{i:0;s:14:\"白色2L容量\";}i:199115;a:1:{i:0;s:39:\"银色1L(含)-2L(含)高硼硅玻璃壶\";}i:199116;a:1:{i:0;s:22:\"洋甘菊味-10片/盒\";}i:199117;a:1:{i:0;s:22:\"薰衣草味-10片/盒\";}i:199118;a:1:{i:0;s:19:\"玫瑰味-10片/盒\";}i:199119;a:1:{i:0;s:16:\"无香-10片/盒\";}i:199120;a:1:{i:0;s:32:\"酱香味500g【18袋约54颗】\";}i:199121;a:1:{i:0;s:18:\"麻辣味290g*2盒\";}i:199122;a:1:{i:0;s:55:\"默认01肤白色【02粉白色，请自行备注！】\";}i:199123;a:1:{i:0;s:16:\"原味360ml*6瓶\";}i:199124;a:1:{i:0;s:19:\"蜜桃味360ml*6瓶\";}i:199125;a:1:{i:0;s:19:\"柠檬味360ml*6瓶\";}i:199126;a:1:{i:0;s:17:\"原味360ml*24瓶\";}i:199127;a:1:{i:0;s:20:\"蜜桃味360ml*24瓶\";}i:199128;a:1:{i:0;s:20:\"柠檬味360ml*24瓶\";}i:199129;a:1:{i:0;s:9:\"100g*2袋\";}i:199130;a:1:{i:0;s:118:\"默认【氺寇晚香玉.深层补水一盒】【国色牡丹亮肤，惠心兰花提拉紧致，请自行备注！】\";}i:199131;a:1:{i:0;s:30:\"食品级PP碗-带叉勺吸盘\";}i:199132;a:1:{i:0;s:9:\"1盒20只\";}i:199133;a:1:{i:0;s:40:\"百鸟朝凤系列（广式6饼6味)300g\";}i:199134;a:1:{i:0;s:11:\"30包/袋*2\";}i:199135;a:1:{i:0;s:64:\"2套刀叉勺三件套（颜色有蓝、黑、粉、绿可选）\";}i:199136;a:1:{i:0;s:19:\"榴莲饼252g小盒\";}i:199137;a:1:{i:0;s:19:\"榴莲饼500g大盒\";}i:199138;a:1:{i:0;s:25:\"灰枣夹核桃500g一箱\";}i:199139;a:1:{i:0;s:25:\"骏枣夹核桃500g一箱\";}i:199140;a:1:{i:0;s:32:\"实惠款礼盒（8包装864g）\";}i:199141;a:1:{i:0;s:34:\"实力款礼盒（10包装1080g）\";}i:199142;a:1:{i:0;s:34:\"豪华款礼盒（12包装1306g）\";}i:199143;a:1:{i:0;s:34:\"尊享款礼盒（14包装1522g）\";}i:199144;a:1:{i:0;s:28:\"零食礼盒54包【1076g】\";}i:199145;a:1:{i:0;s:14:\"100条共1600g\";}i:199146;a:1:{i:0;s:11:\"310mL*12瓶\";}i:199147;a:1:{i:0;s:11:\"100ml*20瓶\";}i:199148;a:1:{i:0;s:27:\"500g/10包20片黑麦面包\";}i:199149;a:1:{i:0;s:28:\"1000g/20包40片黑麦面包\";}i:199150;a:1:{i:0;s:27:\"500g/10包20片谷物面包\";}i:199151;a:1:{i:0;s:28:\"1000g/20包40片谷物面包\";}i:199152;a:1:{i:0;s:23:\"4枚220g【红豆味】\";}i:199153;a:1:{i:0;s:23:\"4枚220g【紫薯味】\";}i:199154;a:1:{i:0;s:23:\"4枚220g【莲蓉味】\";}i:199155;a:1:{i:0;s:23:\"6枚330g【红豆味】\";}i:199156;a:1:{i:0;s:23:\"6枚330g【紫薯味】\";}i:199157;a:1:{i:0;s:23:\"6枚330g【莲蓉味】\";}i:199158;a:1:{i:0;s:23:\"6枚330g【混合装】\";}i:199159;a:1:{i:0;s:23:\"8枚440g【紫薯味】\";}i:199160;a:1:{i:0;s:23:\"8枚440g【红豆味】\";}i:199161;a:1:{i:0;s:23:\"8枚440g【莲蓉味】\";}i:199162;a:1:{i:0;s:23:\"8枚440g【混合装】\";}i:199163;a:1:{i:0;s:25:\"12枚660g 【紫薯味】\";}i:199164;a:1:{i:0;s:25:\"12枚660g 【红豆味】\";}i:199165;a:1:{i:0;s:25:\"12枚660g 【莲蓉味】\";}i:199166;a:1:{i:0;s:25:\"12枚660g 【混合装】\";}i:199167;a:1:{i:0;s:9:\"210g*2袋\";}i:199168;a:1:{i:0;s:21:\"很麻很辣26g*30包\";}i:199169;a:1:{i:0;s:20:\"散称-香辣味500g\";}i:199170;a:1:{i:0;s:20:\"散称-麻辣味500g\";}i:199171;a:1:{i:0;s:20:\"散称-酸辣味500g\";}i:199172;a:1:{i:0;s:16:\"混合口味500g\";}i:199173;a:1:{i:0;s:23:\"散称-风吃海带500g\";}i:199174;a:1:{i:0;s:33:\"明星版嗨吃家酸辣粉143g*6\";}i:199175;a:1:{i:0;s:21:\"椒麻锅巴粉113g*6\";}i:199176;a:1:{i:0;s:15:\"花甲粉145g*6\";}i:199177;a:1:{i:0;s:27:\"跳跳鱼丸酸辣粉165g*6\";}i:199178;a:1:{i:0;s:9:\"320g*5袋\";}i:199179;a:1:{i:0;s:9:\"320g*2袋\";}i:199180;a:1:{i:0;s:9:\"150*200cm\";}i:199181;a:1:{i:0;s:9:\"180*220cm\";}i:199182;a:1:{i:0;s:9:\"200*230cm\";}i:199183;a:1:{i:0;s:9:\"220*230cm\";}i:199184;a:1:{i:0;s:15:\"万能032蓝色\";}i:199185;a:1:{i:0;s:15:\"万能032绿色\";}i:199186;a:1:{i:0;s:15:\"万能032粉色\";}i:199187;a:1:{i:0;s:15:\"万能036蓝色\";}i:199188;a:1:{i:0;s:15:\"万能036绿色\";}i:199189;a:1:{i:0;s:15:\"万能036粉色\";}i:199190;a:1:{i:0;s:15:\"万能039蓝色\";}i:199191;a:1:{i:0;s:15:\"万能039绿色\";}i:199192;a:1:{i:0;s:15:\"万能039粉色\";}i:199193;a:1:{i:0;s:23:\" 皇家古龙黑色50ML\";}i:199194;a:1:{i:0;s:22:\"皇家古龙白色50ML\";}i:199195;a:1:{i:0;s:22:\"皇家古龙蓝色50ML\";}i:199196;a:1:{i:0;s:22:\"皇家古龙黄色50ML\";}i:199197;a:1:{i:0;s:5:\"30包\";}i:199198;a:1:{i:0;s:5:\"72包\";}i:199199;a:1:{i:0;s:11:\"整提42卷\";}i:199200;a:1:{i:0;s:5:\"10包\";}i:199201;a:1:{i:0;s:5:\"40包\";}i:199202;a:1:{i:0;s:17:\"紫色纸盒20朵\";}i:199203;a:1:{i:0;s:14:\"瓜片1级1号\";}i:199204;a:1:{i:0;s:14:\"瓜片1级2号\";}i:199205;a:1:{i:0;s:10:\"瓜片2级\";}i:199206;a:1:{i:0;s:10:\"瓜片3级\";}i:199207;a:1:{i:0;s:43:\"小动物四维发热+赠送护膝小盖毯\";}i:199208;a:1:{i:0;s:49:\"森系小动物四维发热+赠送护膝小盖毯\";}i:199209;a:1:{i:0;s:49:\"田园小清新四维发热+赠送护膝小盖毯\";}i:199210;a:1:{i:0;s:49:\"插画小树林四维发热+赠送护膝小盖毯\";}i:199211;a:1:{i:0;s:30:\"白色烘干款（普通款）\";}i:199212;a:1:{i:0;s:30:\"粉色烘干款（普通款）\";}i:199213;a:1:{i:0;s:39:\"粉色杀菌烘干款（带紫外线）\";}i:199214;a:1:{i:0;s:39:\"白色杀菌烘干款（带紫外线）\";}i:199215;a:1:{i:0;s:12:\"两口之家\";}i:199216;a:1:{i:0;s:12:\"三口之家\";}i:199217;a:1:{i:0;s:12:\"四口之家\";}i:199218;a:1:{i:0;s:18:\"家用装7+1件套\";}i:199219;a:1:{i:0;s:16:\"中手卷40*60cm\";}i:199220;a:1:{i:0;s:13:\"小号45*70cm\";}i:199221;a:1:{i:0;s:13:\"中号56*80cm\";}i:199222;a:1:{i:0;s:17:\"特大号80*100cm\";}i:199223;a:1:{i:0;s:22:\"中号立体50*70*30cm\";}i:199224;a:1:{i:0;s:26:\"特大号立体80*100*38cm\";}i:199225;a:1:{i:0;s:6:\"运费\";}i:199226;a:1:{i:0;s:4:\"2支\";}i:199227;a:1:{i:0;s:4:\"3支\";}i:199228;a:1:{i:0;s:26:\"樱桃50*70cm*4个+1手泵\";}i:199229;a:1:{i:0;s:26:\"樱桃60*80cm*4个+1手泵\";}i:199230;a:1:{i:0;s:26:\"樱桃70*90cm*4个+1手泵\";}i:199231;a:1:{i:0;s:27:\"樱桃80*100cm*4个+1手泵\";}i:199232;a:1:{i:0;s:27:\"樱桃90*110cm*4个+1手泵\";}i:199233;a:1:{i:0;s:28:\"樱桃100*120cm*4个+1手泵\";}i:199234;a:1:{i:0;s:39:\"（樱桃）3大3中2小2手卷1手泵\t\";}i:199235;a:1:{i:0;s:30:\"（樱桃）4特大4中1手泵\";}i:199236;a:1:{i:0;s:45:\"（樱桃）3特大2大3中2小1电泵1手泵\";}i:199237;a:1:{i:0;s:33:\"（樱桃）6特大1电泵1手泵\";}i:199238;a:1:{i:0;s:27:\"（樱桃）5中5小1手泵\";}i:199239;a:1:{i:0;s:34:\"（樱桃）2特大3中3小1手泵\";}i:199240;a:1:{i:0;s:31:\"（樱桃）1大2中2小1手泵\";}i:199241;a:1:{i:0;s:38:\"（樱桃）1特大1大1中2小1电泵\";}i:199242;a:1:{i:0;s:31:\"（樱桃）2大2中2小1手泵\";}i:199243;a:1:{i:0;s:38:\"（樱桃）2大2中2小2手卷1手泵\";}i:199244;a:1:{i:0;s:52:\"（樱桃）2特大2大2中2小2特小1手泵1电泵\";}i:199245;a:1:{i:0;s:41:\"（樱桃）2特大2中3小3手卷1手泵\";}i:199246;a:1:{i:0;s:48:\"（樱桃）2特大3大3小3手卷1手泵1电泵\";}i:199247;a:1:{i:0;s:31:\"（樱桃）3大2中3小1手泵\";}i:199248;a:1:{i:0;s:27:\"（樱桃）4大4中1手泵\";}i:199249;a:1:{i:0;s:34:\"（樱桃）4特大2中2小1手泵\";}i:199250;a:1:{i:0;s:26:\"（樱桃）5特大1手泵\";}i:199251;a:1:{i:0;s:23:\"（樱桃）6大1手泵\";}i:199252;a:1:{i:0;s:23:\"（樱桃）7中1手泵\";}i:199253;a:1:{i:0;s:23:\"（樱桃）8小1手泵\";}i:199254;a:1:{i:0;s:34:\"（樱桃）3特大2中2小1手泵\";}i:199255;a:1:{i:0;s:41:\"（樱桃）3特大2中3小2手卷1手泵\";}i:199256;a:1:{i:0;s:34:\"（樱桃）4特大2中4小1手泵\";}i:199257;a:1:{i:0;s:41:\"（樱桃）2特大3中3小2手卷1手泵\";}i:199258;a:1:{i:0;s:9:\"经典装\";}i:199259;a:1:{i:0;s:18:\"升级装带支架\";}i:199260;a:1:{i:0;s:25:\"双面双效（1包蓝）\";}i:199261;a:1:{i:0;s:25:\"双面超柔（1包橙）\";}i:199262;a:1:{i:0;s:25:\"双面双效（2包蓝）\";}i:199263;a:1:{i:0;s:25:\"双面超柔（2包橙）\";}i:199264;a:1:{i:0;s:30:\"组合装（1包蓝+1包橙）\";}i:199265;a:1:{i:0;s:25:\"双面双效（3包蓝）\";}i:199266;a:1:{i:0;s:25:\"双面超柔（3包橙）\";}i:199267;a:1:{i:0;s:6:\"100粒\";}i:199268;a:1:{i:0;s:4:\"1盒\";}i:199269;a:1:{i:0;s:4:\"2盒\";}i:199270;a:1:{i:0;s:4:\"3盒\";}i:199271;a:1:{i:0;s:7:\"1000片\";}i:199272;a:1:{i:0;s:16:\"美妆蛋4枚装\";}i:199273;a:1:{i:0;s:7:\"1个头\";}i:199274;a:1:{i:0;s:7:\"2个头\";}i:199275;a:1:{i:0;s:7:\"3个头\";}i:199276;a:1:{i:0;s:7:\"4个头\";}i:199277;a:1:{i:0;s:7:\"5个头\";}i:199278;a:1:{i:0;s:7:\"6个头\";}i:199279;a:1:{i:0;s:10:\"带1块布\";}i:199280;a:1:{i:0;s:10:\"带3块布\";}i:199281;a:1:{i:0;s:10:\"带7块布\";}i:199282;a:1:{i:0;s:30:\"美规电源（国内通用）\";}}","ctime":null,"utime":1608711047,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"休闲零食","products":[{"id":9932,"goods_id":1541,"barcode":null,"sn":"P6087109327973","price":"27.00","costprice":"25.80","mktprice":"0.00","marketable":1,"stock":163,"freeze_stock":0,"spes_desc":"规格:500g*2袋【共2斤】","is_defalut":1,"image_id":"","isdel":null,"name":"2斤小核肉厚桂圆500g*2 休闲零食农产品龙眼干","buy_limit":0,"bn":"G6087109327893","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4da47b.jpg","total_stock":163,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"500g*2袋【共2斤】":{"name":"500g*2袋【共2斤】","is_default":true}}},"amount":"27.00","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4da47b.jpg","default":{"id":9932,"goods_id":1541,"barcode":null,"sn":"P6087109327973","price":"27.00","costprice":"25.80","mktprice":"0.00","marketable":1,"stock":163,"freeze_stock":0,"spes_desc":"规格:500g*2袋【共2斤】","is_defalut":1,"image_id":"","isdel":null,"name":"2斤小核肉厚桂圆500g*2 休闲零食农产品龙眼干","buy_limit":0,"bn":"G6087109327893","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4da47b.jpg","total_stock":163,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"500g*2袋【共2斤】":{"name":"500g*2袋【共2斤】","is_default":true}}},"amount":"27.00","promotion_list":[],"promotion_amount":0},"product":{"id":9932,"goods_id":1541,"barcode":null,"sn":"P6087109327973","price":"27.00","costprice":"25.80","mktprice":"0.00","marketable":1,"stock":163,"spes_desc":"规格:500g*2袋【共2斤】","is_defalut":1,"image_id":"","isdel":null,"name":"2斤小核肉厚桂圆500g*2 休闲零食农产品龙眼干","buy_limit":0,"bn":"G6087109327893","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4da47b.jpg","total_stock":163,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"500g*2袋【共2斤】":{"name":"500g*2袋【共2斤】","is_default":true}}},"amount":"27.00","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4da47b.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4c7154.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4bbbcf.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4d14b7.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4af414.jpg"],"total_stock":163,"is_buy_num":27,"isfav":"false","can_buy":"ok","vip_price":27,"is_notice":0},{"id":1518,"bn":"G6083494744183","name":"鸡蛋酥270g传统老式奶香味黑芝麻味鸡蛋卷手工老蛋卷","brief":"不免邮区域:海外,台湾,澳门,\n香港,西藏,新疆,青海,内蒙古","price":"12.50","costprice":"11.85","mktprice":"0.00","image_id":"859de913d1e06ed2919663073343e3b7","goods_cat_id":112,"goods_type_id":98,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":360,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083494345fdd76facd864.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083494355fdd76fb0ab21.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083494355fdd76fb592ad.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083494355fdd76fb9a380.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083494355fdd76fbb51b6.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083494365fdd76fc11dda.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083494365fdd76fc7749e.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083494365fdd76fc69b6e.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083494365fdd76fc8267f.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083494365fdd76fc903d3.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082833405fdc74cc8f0fe.png\" alt=\"16082833405fdc74cc8f0fe.png\"/><\/p>","spes_desc":{"口味":{"196968":"黑芝麻味270g","196969":"奶香味270g"}},"params":"","service":"1,4,6,7","comments_count":0,"view_count":0,"buy_count":24,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":1,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:29:{i:196967;a:1:{i:0;s:17:\"山核桃98g*3袋\";}i:196968;a:1:{i:0;s:16:\"黑芝麻味270g\";}i:196969;a:1:{i:0;s:13:\"奶香味270g\";}i:196970;a:1:{i:0;s:12:\" 16条*30克\";}i:196971;a:1:{i:0;s:31:\"平底锅巴300g/箱（14包）\";}i:196972;a:1:{i:0;s:34:\"大黄米锅巴350g/箱（12包）\";}i:196973;a:1:{i:0;s:37:\"北海稻场果派350g/箱（38个）\";}i:196974;a:1:{i:0;s:37:\"每日坚果米酥278g/箱（30个）\";}i:196975;a:1:{i:0;s:20:\"奶油味100g/袋*10\";}i:196976;a:1:{i:0;s:20:\"香橙味100g/袋*10\";}i:196977;a:1:{i:0;s:20:\"草莓味100g/袋*10\";}i:196978;a:1:{i:0;s:59:\"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3\";}i:196979;a:1:{i:0;s:13:\"辣白菜500g\";}i:196980;a:1:{i:0;s:27:\"原味150克/袋（15枚）\";}i:196981;a:1:{i:0;s:27:\"香辣150克/袋（15枚）\";}i:196982;a:1:{i:0;s:29:\"1.26千克/桶【约120支】\";}i:196983;a:1:{i:0;s:22:\"香辣铁蛋15g*30包\t\";}i:196984;a:1:{i:0;s:19:\"盐焗味15g*30包\t\";}i:196985;a:1:{i:0;s:22:\"知心卤味20g*30包\t\";}i:196986;a:1:{i:0;s:19:\"泡椒味20g*30包\t\";}i:196987;a:1:{i:0;s:18:\"混合口味30包\t\";}i:196988;a:1:{i:0;s:10:\"520g桶装\";}i:196989;a:1:{i:0;s:15:\"原味98g*3袋\t\";}i:196990;a:1:{i:0;s:18:\"海盐味98g*3袋\t\";}i:196991;a:1:{i:0;s:24:\"蜂蜜黄油味98g*3袋\t\";}i:196992;a:1:{i:0;s:18:\"焦糖味98g*3袋\t\";}i:196993;a:1:{i:0;s:18:\"芝士味98g*3袋\t\";}i:196994;a:1:{i:0;s:18:\"藤椒味98g*3袋\t\";}i:196995;a:1:{i:0;s:64:\"3袋不同口味（请备注口味，没备注口味随机发）\";}}","ctime":null,"utime":1608349571,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"休闲零食","products":[{"id":9793,"goods_id":1518,"barcode":null,"sn":"P6083494744245","price":"12.50","costprice":"11.85","mktprice":"0.00","marketable":2,"stock":185,"freeze_stock":0,"spes_desc":"口味:黑芝麻味270g","is_defalut":1,"image_id":"","isdel":null,"name":"鸡蛋酥270g传统老式奶香味黑芝麻味鸡蛋卷手工老蛋卷","buy_limit":0,"bn":"G6083494744183","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083493425fdd769e64b22.jpg","total_stock":185,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"黑芝麻味270g":{"name":"黑芝麻味270g","is_default":true},"奶香味270g":{"name":"奶香味270g","product_id":9794}}},"amount":"12.50","promotion_list":[],"promotion_amount":0},{"id":9794,"goods_id":1518,"barcode":null,"sn":"P6083494744292","price":"12.50","costprice":"11.85","mktprice":"0.00","marketable":2,"stock":175,"freeze_stock":0,"spes_desc":"口味:奶香味270g","is_defalut":2,"image_id":"","isdel":null,"name":"鸡蛋酥270g传统老式奶香味黑芝麻味鸡蛋卷手工老蛋卷","buy_limit":0,"bn":"G6083494744183","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083493425fdd769e64b22.jpg","total_stock":175,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"黑芝麻味270g":{"name":"黑芝麻味270g","product_id":9793},"奶香味270g":{"name":"奶香味270g","is_default":true}}},"amount":"12.50","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083493425fdd769e64b22.jpg","default":{"id":9793,"goods_id":1518,"barcode":null,"sn":"P6083494744245","price":"12.50","costprice":"11.85","mktprice":"0.00","marketable":2,"stock":185,"freeze_stock":0,"spes_desc":"口味:黑芝麻味270g","is_defalut":1,"image_id":"","isdel":null,"name":"鸡蛋酥270g传统老式奶香味黑芝麻味鸡蛋卷手工老蛋卷","buy_limit":0,"bn":"G6083494744183","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083493425fdd769e64b22.jpg","total_stock":185,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"黑芝麻味270g":{"name":"黑芝麻味270g","is_default":true},"奶香味270g":{"name":"奶香味270g","product_id":9794}}},"amount":"12.50","promotion_list":[],"promotion_amount":0},"product":{"id":9793,"goods_id":1518,"barcode":null,"sn":"P6083494744245","price":"12.50","costprice":"11.85","mktprice":"0.00","marketable":2,"stock":185,"spes_desc":"口味:黑芝麻味270g","is_defalut":1,"image_id":"","isdel":null,"name":"鸡蛋酥270g传统老式奶香味黑芝麻味鸡蛋卷手工老蛋卷","buy_limit":0,"bn":"G6083494744183","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/19/16083493425fdd769e64b22.jpg","total_stock":185,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"黑芝麻味270g":{"name":"黑芝麻味270g","is_default":true},"奶香味270g":{"name":"奶香味270g","product_id":9794}}},"amount":"12.50","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/19/16083493425fdd769e64b22.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/19/16083493425fdd769e80f04.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/19/16083493425fdd769e988f9.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/19/16083493425fdd769e7602e.jpg"],"total_stock":360,"is_buy_num":24,"isfav":"false","can_buy":"ok","vip_price":12.5,"is_notice":0},{"id":1509,"bn":"G6082620268395","name":"豫味之源平底锅巴330g麻辣休闲零食膨化食品大黄米锅巴","brief":"","price":"10.90","costprice":"9.90","mktprice":"0.00","image_id":"30fb954a001da476b4234c4c0c7d6690","goods_cat_id":112,"goods_type_id":98,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":644,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'>全国包邮，除部分地区包括内蒙古,甘肃,宁夏，海南，青海，西藏，新疆等地区需另加邮费，下单请联系客服哦~<\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082620245fdc2188685ba.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082620245fdc218872715.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082620245fdc21887be19.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082620245fdc21889075f.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082620245fdc21889cc5d.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082620245fdc2188a702e.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082620245fdc2188b8416.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082620245fdc2188c1e1a.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082620245fdc2188cc363.png\"/><\/p><p style='overflow:hidden'><br/><\/p>","spes_desc":{"口味":{"196968":"平底锅巴300g/箱（14包）","196969":"大黄米锅巴350g/箱（12包）","196970":"北海稻场果派350g/箱（38个）","196971":"每日坚果米酥278g/箱（30个）"}},"params":"","service":"1,4,6","comments_count":0,"view_count":0,"buy_count":27,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":2,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:29:{i:196967;a:1:{i:0;s:17:\"山核桃98g*3袋\";}i:196968;a:1:{i:0;s:31:\"平底锅巴300g/箱（14包）\";}i:196969;a:1:{i:0;s:34:\"大黄米锅巴350g/箱（12包）\";}i:196970;a:1:{i:0;s:37:\"北海稻场果派350g/箱（38个）\";}i:196971;a:1:{i:0;s:37:\"每日坚果米酥278g/箱（30个）\";}i:196972;a:1:{i:0;s:20:\"奶油味100g/袋*10\";}i:196973;a:1:{i:0;s:20:\"香橙味100g/袋*10\";}i:196974;a:1:{i:0;s:20:\"草莓味100g/袋*10\";}i:196975;a:1:{i:0;s:59:\"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3\";}i:196976;a:1:{i:0;s:13:\"辣白菜500g\";}i:196977;a:1:{i:0;s:27:\"原味150克/袋（15枚）\";}i:196978;a:1:{i:0;s:27:\"香辣150克/袋（15枚）\";}i:196979;a:1:{i:0;s:29:\"1.26千克/桶【约120支】\";}i:196980;a:1:{i:0;s:22:\"香辣铁蛋15g*30包\t\";}i:196981;a:1:{i:0;s:19:\"盐焗味15g*30包\t\";}i:196982;a:1:{i:0;s:22:\"知心卤味20g*30包\t\";}i:196983;a:1:{i:0;s:19:\"泡椒味20g*30包\t\";}i:196984;a:1:{i:0;s:18:\"混合口味30包\t\";}i:196985;a:1:{i:0;s:10:\"520g桶装\";}i:196986;a:1:{i:0;s:15:\"原味98g*3袋\t\";}i:196987;a:1:{i:0;s:18:\"海盐味98g*3袋\t\";}i:196988;a:1:{i:0;s:24:\"蜂蜜黄油味98g*3袋\t\";}i:196989;a:1:{i:0;s:18:\"焦糖味98g*3袋\t\";}i:196990;a:1:{i:0;s:18:\"芝士味98g*3袋\t\";}i:196991;a:1:{i:0;s:18:\"藤椒味98g*3袋\t\";}i:196992;a:1:{i:0;s:64:\"3袋不同口味（请备注口味，没备注口味随机发）\";}i:196993;a:1:{i:0;s:18:\"芝士味98g*3袋\t\";}i:196994;a:1:{i:0;s:18:\"藤椒味98g*3袋\t\";}i:196995;a:1:{i:0;s:64:\"3袋不同口味（请备注口味，没备注口味随机发）\";}}","ctime":null,"utime":1608380106,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"休闲零食","products":[{"id":9715,"goods_id":1509,"barcode":null,"sn":"P6082620268462","price":"10.90","costprice":"9.90","mktprice":"0.00","marketable":1,"stock":148,"freeze_stock":0,"spes_desc":"口味:平底锅巴300g/箱（14包）","is_defalut":1,"image_id":"6dd0b96f007bf8de5317804bd5392cf9","isdel":null,"name":"豫味之源平底锅巴330g麻辣休闲零食膨化食品大黄米锅巴","buy_limit":0,"bn":"G6082620268395","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082619415fdc213543a0b.jpg","total_stock":148,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"平底锅巴300g/箱（14包）":{"name":"平底锅巴300g/箱（14包）","is_default":true},"大黄米锅巴350g/箱（12包）":{"name":"大黄米锅巴350g/箱（12包）","product_id":9716},"北海稻场果派350g/箱（38个）":{"name":"北海稻场果派350g/箱（38个）","product_id":9717},"每日坚果米酥278g/箱（30个）":{"name":"每日坚果米酥278g/箱（30个）","product_id":9718}}},"amount":"10.90","promotion_list":[],"promotion_amount":0},{"id":9716,"goods_id":1509,"barcode":null,"sn":"P6082620268504","price":"10.90","costprice":"9.90","mktprice":"0.00","marketable":1,"stock":172,"freeze_stock":0,"spes_desc":"口味:大黄米锅巴350g/箱（12包）","is_defalut":2,"image_id":"d30503fb298146cbf5d8158d8ef8ae09","isdel":null,"name":"豫味之源平底锅巴330g麻辣休闲零食膨化食品大黄米锅巴","buy_limit":0,"bn":"G6082620268395","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082619475fdc213bc9dd4.jpg","total_stock":172,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"平底锅巴300g/箱（14包）":{"name":"平底锅巴300g/箱（14包）","product_id":9715},"大黄米锅巴350g/箱（12包）":{"name":"大黄米锅巴350g/箱（12包）","is_default":true},"北海稻场果派350g/箱（38个）":{"name":"北海稻场果派350g/箱（38个）","product_id":9717},"每日坚果米酥278g/箱（30个）":{"name":"每日坚果米酥278g/箱（30个）","product_id":9718}}},"amount":"10.90","promotion_list":[],"promotion_amount":0},{"id":9717,"goods_id":1509,"barcode":null,"sn":"P6082620268532","price":"10.90","costprice":"9.90","mktprice":"0.00","marketable":1,"stock":175,"freeze_stock":0,"spes_desc":"口味:北海稻场果派350g/箱（38个）","is_defalut":2,"image_id":"0f0190ec896357a9dbdca1ef2e793fd3","isdel":null,"name":"豫味之源平底锅巴330g麻辣休闲零食膨化食品大黄米锅巴","buy_limit":0,"bn":"G6082620268395","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082619535fdc2141b0fe0.jpg","total_stock":175,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"平底锅巴300g/箱（14包）":{"name":"平底锅巴300g/箱（14包）","product_id":9715},"大黄米锅巴350g/箱（12包）":{"name":"大黄米锅巴350g/箱（12包）","product_id":9716},"北海稻场果派350g/箱（38个）":{"name":"北海稻场果派350g/箱（38个）","is_default":true},"每日坚果米酥278g/箱（30个）":{"name":"每日坚果米酥278g/箱（30个）","product_id":9718}}},"amount":"10.90","promotion_list":[],"promotion_amount":0},{"id":9718,"goods_id":1509,"barcode":null,"sn":"P6082620268574","price":"10.90","costprice":"9.90","mktprice":"0.00","marketable":1,"stock":149,"freeze_stock":0,"spes_desc":"口味:每日坚果米酥278g/箱（30个）","is_defalut":2,"image_id":"1c4a1c16884e0d733c80706c708e90ec","isdel":null,"name":"豫味之源平底锅巴330g麻辣休闲零食膨化食品大黄米锅巴","buy_limit":0,"bn":"G6082620268395","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082619625fdc214a2c20c.jpg","total_stock":149,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"平底锅巴300g/箱（14包）":{"name":"平底锅巴300g/箱（14包）","product_id":9715},"大黄米锅巴350g/箱（12包）":{"name":"大黄米锅巴350g/箱（12包）","product_id":9716},"北海稻场果派350g/箱（38个）":{"name":"北海稻场果派350g/箱（38个）","product_id":9717},"每日坚果米酥278g/箱（30个）":{"name":"每日坚果米酥278g/箱（30个）","is_default":true}}},"amount":"10.90","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082619185fdc211eed1b2.jpg","default":{"id":9715,"goods_id":1509,"barcode":null,"sn":"P6082620268462","price":"10.90","costprice":"9.90","mktprice":"0.00","marketable":1,"stock":148,"freeze_stock":0,"spes_desc":"口味:平底锅巴300g/箱（14包）","is_defalut":1,"image_id":"6dd0b96f007bf8de5317804bd5392cf9","isdel":null,"name":"豫味之源平底锅巴330g麻辣休闲零食膨化食品大黄米锅巴","buy_limit":0,"bn":"G6082620268395","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082619415fdc213543a0b.jpg","total_stock":148,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"平底锅巴300g/箱（14包）":{"name":"平底锅巴300g/箱（14包）","is_default":true},"大黄米锅巴350g/箱（12包）":{"name":"大黄米锅巴350g/箱（12包）","product_id":9716},"北海稻场果派350g/箱（38个）":{"name":"北海稻场果派350g/箱（38个）","product_id":9717},"每日坚果米酥278g/箱（30个）":{"name":"每日坚果米酥278g/箱（30个）","product_id":9718}}},"amount":"10.90","promotion_list":[],"promotion_amount":0},"product":{"id":9715,"goods_id":1509,"barcode":null,"sn":"P6082620268462","price":"10.90","costprice":"9.90","mktprice":"0.00","marketable":1,"stock":148,"spes_desc":"口味:平底锅巴300g/箱（14包）","is_defalut":1,"image_id":"6dd0b96f007bf8de5317804bd5392cf9","isdel":null,"name":"豫味之源平底锅巴330g麻辣休闲零食膨化食品大黄米锅巴","buy_limit":0,"bn":"G6082620268395","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/18/16082619415fdc213543a0b.jpg","total_stock":148,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"平底锅巴300g/箱（14包）":{"name":"平底锅巴300g/箱（14包）","is_default":true},"大黄米锅巴350g/箱（12包）":{"name":"大黄米锅巴350g/箱（12包）","product_id":9716},"北海稻场果派350g/箱（38个）":{"name":"北海稻场果派350g/箱（38个）","product_id":9717},"每日坚果米酥278g/箱（30个）":{"name":"每日坚果米酥278g/箱（30个）","product_id":9718}}},"amount":"10.90","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/18/16082619185fdc211eed1b2.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/18/16082619195fdc211f26cf8.PNG","http://img.ywzyit.com/static/uploads/images/2020/12/18/16082619195fdc211f0f3c8.jpg"],"total_stock":644,"is_buy_num":27,"isfav":"false","can_buy":"ok","vip_price":10.9,"is_notice":0},{"id":1503,"bn":"G6081862509121","name":"米乐谷微波爆米花香甜奶油味膨化零食100g*10袋","brief":"","price":"15.90","costprice":"14.90","mktprice":"0.00","image_id":"9b129aa35e70031dad024b26a461bccf","goods_cat_id":112,"goods_type_id":98,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":789,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'>全国包邮，除部分地区包括内蒙古,甘肃,宁夏，海南，青海，西藏，新疆等地区需另加邮费，下单请联系客服哦~<\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081862475fdaf9875428f.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081862475fdaf9875d926.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081862475fdaf98767711.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081862475fdaf9877a5dc.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081862475fdaf98784e90.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081862475fdaf9878dc20.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081862475fdaf987a1f36.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081862475fdaf987ad0ea.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081862475fdaf987b61a8.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081862475fdaf987c7d82.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081862485fdaf988524b3.png\"/><\/p><p style='overflow:hidden'><br/><\/p>","spes_desc":{"口味":{"195471":"奶油味100g/袋*10","195472":"香橙味100g/袋*10","195473":"草莓味100g/袋*10","195474":"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3"}},"params":"","service":"1,4,6","comments_count":0,"view_count":0,"buy_count":11,"xuni_num":null,"uptime":null,"downtime":null,"sort":100,"is_recommend":2,"is_hot":2,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:22:{i:195470;a:1:{i:0;s:17:\"山核桃98g*3袋\";}i:195471;a:1:{i:0;s:20:\"奶油味100g/袋*10\";}i:195472;a:1:{i:0;s:20:\"香橙味100g/袋*10\";}i:195473;a:1:{i:0;s:20:\"草莓味100g/袋*10\";}i:195474;a:1:{i:0;s:59:\"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3\";}i:195475;a:1:{i:0;s:13:\"辣白菜500g\";}i:195476;a:1:{i:0;s:27:\"原味150克/袋（15枚）\";}i:195477;a:1:{i:0;s:27:\"香辣150克/袋（15枚）\";}i:195478;a:1:{i:0;s:29:\"1.26千克/桶【约120支】\";}i:195479;a:1:{i:0;s:22:\"香辣铁蛋15g*30包\t\";}i:195480;a:1:{i:0;s:19:\"盐焗味15g*30包\t\";}i:195481;a:1:{i:0;s:22:\"知心卤味20g*30包\t\";}i:195482;a:1:{i:0;s:19:\"泡椒味20g*30包\t\";}i:195483;a:1:{i:0;s:18:\"混合口味30包\t\";}i:195484;a:1:{i:0;s:10:\"520g桶装\";}i:195485;a:1:{i:0;s:15:\"原味98g*3袋\t\";}i:195486;a:1:{i:0;s:18:\"海盐味98g*3袋\t\";}i:195487;a:1:{i:0;s:24:\"蜂蜜黄油味98g*3袋\t\";}i:195488;a:1:{i:0;s:18:\"焦糖味98g*3袋\t\";}i:195489;a:1:{i:0;s:18:\"芝士味98g*3袋\t\";}i:195490;a:1:{i:0;s:18:\"藤椒味98g*3袋\t\";}i:195491;a:1:{i:0;s:64:\"3袋不同口味（请备注口味，没备注口味随机发）\";}}","ctime":null,"utime":1608186250,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"休闲零食","products":[{"id":9356,"goods_id":1503,"barcode":null,"sn":"P6081862509190","price":"15.90","costprice":"14.90","mktprice":"0.00","marketable":2,"stock":192,"freeze_stock":0,"spes_desc":"口味:奶油味100g/袋*10","is_defalut":1,"image_id":"","isdel":null,"name":"米乐谷微波爆米花香甜奶油味膨化零食100g*10袋","buy_limit":0,"bn":"G6081862509121","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081861125fdaf900cb47f.jpg","total_stock":192,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"奶油味100g/袋*10":{"name":"奶油味100g/袋*10","is_default":true},"香橙味100g/袋*10":{"name":"香橙味100g/袋*10","product_id":9357},"草莓味100g/袋*10":{"name":"草莓味100g/袋*10","product_id":9358},"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3":{"name":"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3","product_id":9359}}},"amount":"15.90","promotion_list":[],"promotion_amount":0},{"id":9357,"goods_id":1503,"barcode":null,"sn":"P6081862509263","price":"15.90","costprice":"14.90","mktprice":"0.00","marketable":2,"stock":200,"freeze_stock":0,"spes_desc":"口味:香橙味100g/袋*10","is_defalut":2,"image_id":"","isdel":null,"name":"米乐谷微波爆米花香甜奶油味膨化零食100g*10袋","buy_limit":0,"bn":"G6081862509121","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081861125fdaf900cb47f.jpg","total_stock":200,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"奶油味100g/袋*10":{"name":"奶油味100g/袋*10","product_id":9356},"香橙味100g/袋*10":{"name":"香橙味100g/袋*10","is_default":true},"草莓味100g/袋*10":{"name":"草莓味100g/袋*10","product_id":9358},"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3":{"name":"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3","product_id":9359}}},"amount":"15.90","promotion_list":[],"promotion_amount":0},{"id":9358,"goods_id":1503,"barcode":null,"sn":"P6081862509313","price":"15.90","costprice":"14.90","mktprice":"0.00","marketable":2,"stock":200,"freeze_stock":0,"spes_desc":"口味:草莓味100g/袋*10","is_defalut":2,"image_id":"","isdel":null,"name":"米乐谷微波爆米花香甜奶油味膨化零食100g*10袋","buy_limit":0,"bn":"G6081862509121","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081861125fdaf900cb47f.jpg","total_stock":200,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"奶油味100g/袋*10":{"name":"奶油味100g/袋*10","product_id":9356},"香橙味100g/袋*10":{"name":"香橙味100g/袋*10","product_id":9357},"草莓味100g/袋*10":{"name":"草莓味100g/袋*10","is_default":true},"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3":{"name":"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3","product_id":9359}}},"amount":"15.90","promotion_list":[],"promotion_amount":0},{"id":9359,"goods_id":1503,"barcode":null,"sn":"P6081862509345","price":"15.90","costprice":"14.90","mktprice":"0.00","marketable":2,"stock":197,"freeze_stock":0,"spes_desc":"口味:奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3","is_defalut":2,"image_id":"","isdel":null,"name":"米乐谷微波爆米花香甜奶油味膨化零食100g*10袋","buy_limit":0,"bn":"G6081862509121","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081861125fdaf900cb47f.jpg","total_stock":197,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"奶油味100g/袋*10":{"name":"奶油味100g/袋*10","product_id":9356},"香橙味100g/袋*10":{"name":"香橙味100g/袋*10","product_id":9357},"草莓味100g/袋*10":{"name":"草莓味100g/袋*10","product_id":9358},"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3":{"name":"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3","is_default":true}}},"amount":"15.90","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081861125fdaf900cb47f.jpg","default":{"id":9356,"goods_id":1503,"barcode":null,"sn":"P6081862509190","price":"15.90","costprice":"14.90","mktprice":"0.00","marketable":2,"stock":192,"freeze_stock":0,"spes_desc":"口味:奶油味100g/袋*10","is_defalut":1,"image_id":"","isdel":null,"name":"米乐谷微波爆米花香甜奶油味膨化零食100g*10袋","buy_limit":0,"bn":"G6081862509121","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081861125fdaf900cb47f.jpg","total_stock":192,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"奶油味100g/袋*10":{"name":"奶油味100g/袋*10","is_default":true},"香橙味100g/袋*10":{"name":"香橙味100g/袋*10","product_id":9357},"草莓味100g/袋*10":{"name":"草莓味100g/袋*10","product_id":9358},"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3":{"name":"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3","product_id":9359}}},"amount":"15.90","promotion_list":[],"promotion_amount":0},"product":{"id":9356,"goods_id":1503,"barcode":null,"sn":"P6081862509190","price":"15.90","costprice":"14.90","mktprice":"0.00","marketable":2,"stock":192,"spes_desc":"口味:奶油味100g/袋*10","is_defalut":1,"image_id":"","isdel":null,"name":"米乐谷微波爆米花香甜奶油味膨化零食100g*10袋","buy_limit":0,"bn":"G6081862509121","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/17/16081861125fdaf900cb47f.jpg","total_stock":192,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"奶油味100g/袋*10":{"name":"奶油味100g/袋*10","is_default":true},"香橙味100g/袋*10":{"name":"香橙味100g/袋*10","product_id":9357},"草莓味100g/袋*10":{"name":"草莓味100g/袋*10","product_id":9358},"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3":{"name":"奶油味100g/袋*4+香橙味100g/袋*3+草莓味100g/袋*3","product_id":9359}}},"amount":"15.90","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/17/16081861125fdaf900cb47f.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/17/16081861125fdaf900ac183.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/17/16081861125fdaf900bd5cc.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/17/16081861125fdaf900e19ff.jpg"],"total_stock":789,"is_buy_num":11,"isfav":"false","can_buy":"ok","vip_price":15.9,"is_notice":0},{"id":1482,"bn":"G6079172177100","name":"黄山烧饼150克(15枚)安徽特产邬秾苑梅干菜扣肉烧饼","brief":"不免邮区域:海外,台湾,澳门,香港,西藏,新疆,宁夏,青海,内蒙古","price":"16.80","costprice":"15.80","mktprice":"0.00","image_id":"e7138dfda9b9699fcc5c0cae509465f7","goods_cat_id":112,"goods_type_id":98,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":375,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171935fd6de8999855.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171935fd6de89a3c85.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171935fd6de89b4a3f.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171935fd6de89f2e06.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171945fd6de8a0a071.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171945fd6de8a20f53.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171945fd6de8a5dc1d.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171945fd6de8a6889d.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171945fd6de8aa6875.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171945fd6de8aedc1e.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171945fd6de8ae47b5.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077642835fd4893b4ffde.png\" alt=\"16077642835fd4893b4ffde.png\"/><\/p>","spes_desc":{"口味":{"193127":"原味150克/袋（15枚）","193128":"香辣150克/袋（15枚）"}},"params":"","service":"1,4,6,7","comments_count":1,"view_count":0,"buy_count":23,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":1,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:17:{i:193126;a:1:{i:0;s:17:\"山核桃98g*3袋\";}i:193127;a:1:{i:0;s:27:\"原味150克/袋（15枚）\";}i:193128;a:1:{i:0;s:27:\"香辣150克/袋（15枚）\";}i:193129;a:1:{i:0;s:29:\"1.26千克/桶【约120支】\";}i:193130;a:1:{i:0;s:22:\"香辣铁蛋15g*30包\t\";}i:193131;a:1:{i:0;s:19:\"盐焗味15g*30包\t\";}i:193132;a:1:{i:0;s:22:\"知心卤味20g*30包\t\";}i:193133;a:1:{i:0;s:19:\"泡椒味20g*30包\t\";}i:193134;a:1:{i:0;s:18:\"混合口味30包\t\";}i:193135;a:1:{i:0;s:10:\"520g桶装\";}i:193136;a:1:{i:0;s:15:\"原味98g*3袋\t\";}i:193137;a:1:{i:0;s:18:\"海盐味98g*3袋\t\";}i:193138;a:1:{i:0;s:24:\"蜂蜜黄油味98g*3袋\t\";}i:193139;a:1:{i:0;s:18:\"焦糖味98g*3袋\t\";}i:193140;a:1:{i:0;s:18:\"芝士味98g*3袋\t\";}i:193141;a:1:{i:0;s:18:\"藤椒味98g*3袋\t\";}i:193142;a:1:{i:0;s:64:\"3袋不同口味（请备注口味，没备注口味随机发）\";}}","ctime":null,"utime":1607917253,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"休闲零食","products":[{"id":9294,"goods_id":1482,"barcode":null,"sn":"P6079172177165","price":"16.80","costprice":"15.80","mktprice":"0.00","marketable":2,"stock":189,"freeze_stock":0,"spes_desc":"口味:原味150克/袋（15枚）","is_defalut":1,"image_id":"","isdel":null,"name":"黄山烧饼150克(15枚)安徽特产邬秾苑梅干菜扣肉烧饼","buy_limit":0,"bn":"G6079172177100","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171005fd6de2cd8516.jpg","total_stock":189,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"原味150克/袋（15枚）":{"name":"原味150克/袋（15枚）","is_default":true},"香辣150克/袋（15枚）":{"name":"香辣150克/袋（15枚）","product_id":9295}}},"amount":"16.80","promotion_list":[],"promotion_amount":0},{"id":9295,"goods_id":1482,"barcode":null,"sn":"P6079172177203","price":"16.80","costprice":"15.80","mktprice":"0.00","marketable":2,"stock":186,"freeze_stock":0,"spes_desc":"口味:香辣150克/袋（15枚）","is_defalut":2,"image_id":"","isdel":null,"name":"黄山烧饼150克(15枚)安徽特产邬秾苑梅干菜扣肉烧饼","buy_limit":0,"bn":"G6079172177100","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171005fd6de2cd8516.jpg","total_stock":186,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"原味150克/袋（15枚）":{"name":"原味150克/袋（15枚）","product_id":9294},"香辣150克/袋（15枚）":{"name":"香辣150克/袋（15枚）","is_default":true}}},"amount":"16.80","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171005fd6de2cd8516.jpg","default":{"id":9294,"goods_id":1482,"barcode":null,"sn":"P6079172177165","price":"16.80","costprice":"15.80","mktprice":"0.00","marketable":2,"stock":189,"freeze_stock":0,"spes_desc":"口味:原味150克/袋（15枚）","is_defalut":1,"image_id":"","isdel":null,"name":"黄山烧饼150克(15枚)安徽特产邬秾苑梅干菜扣肉烧饼","buy_limit":0,"bn":"G6079172177100","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171005fd6de2cd8516.jpg","total_stock":189,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"原味150克/袋（15枚）":{"name":"原味150克/袋（15枚）","is_default":true},"香辣150克/袋（15枚）":{"name":"香辣150克/袋（15枚）","product_id":9295}}},"amount":"16.80","promotion_list":[],"promotion_amount":0},"product":{"id":9294,"goods_id":1482,"barcode":null,"sn":"P6079172177165","price":"16.80","costprice":"15.80","mktprice":"0.00","marketable":2,"stock":189,"spes_desc":"口味:原味150克/袋（15枚）","is_defalut":1,"image_id":"","isdel":null,"name":"黄山烧饼150克(15枚)安徽特产邬秾苑梅干菜扣肉烧饼","buy_limit":0,"bn":"G6079172177100","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171005fd6de2cd8516.jpg","total_stock":189,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"原味150克/袋（15枚）":{"name":"原味150克/袋（15枚）","is_default":true},"香辣150克/袋（15枚）":{"name":"香辣150克/袋（15枚）","product_id":9295}}},"amount":"16.80","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171005fd6de2cd8516.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171005fd6de2cc2a34.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171005fd6de2ce20f9.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171005fd6de2cf2432.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/14/16079171005fd6de2ccd813.jpg"],"total_stock":375,"is_buy_num":23,"isfav":"false","can_buy":"ok","vip_price":16.8,"is_notice":0},{"id":1481,"bn":"G6079138846204","name":"荧光棒棒糖120支/桶酸甜水果味硬糖儿童糖果","brief":"不免邮区域:海外,台湾,澳门,\n香港,西藏,新疆,宁夏,青海,内蒙古","price":"38.50","costprice":"37.90","mktprice":"0.00","image_id":"b4d3519b6f4dcf2c341fe0a1647ac4f8","goods_cat_id":112,"goods_type_id":98,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":213,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079138315fd6d16782022.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079138315fd6d1678c3bc.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079138315fd6d167964f5.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079138315fd6d167d4312.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079138325fd6d16850cf2.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077642835fd4893b4ffde.png\" alt=\"16077642835fd4893b4ffde.png\"/><\/p>","spes_desc":{"口味":{"193112":"1.26千克/桶【约120支】"}},"params":"","service":"1,4,6,7","comments_count":0,"view_count":0,"buy_count":12,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":1,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:15:{i:193111;a:1:{i:0;s:17:\"山核桃98g*3袋\";}i:193112;a:1:{i:0;s:29:\"1.26千克/桶【约120支】\";}i:193113;a:1:{i:0;s:22:\"香辣铁蛋15g*30包\t\";}i:193114;a:1:{i:0;s:19:\"盐焗味15g*30包\t\";}i:193115;a:1:{i:0;s:22:\"知心卤味20g*30包\t\";}i:193116;a:1:{i:0;s:19:\"泡椒味20g*30包\t\";}i:193117;a:1:{i:0;s:18:\"混合口味30包\t\";}i:193118;a:1:{i:0;s:10:\"520g桶装\";}i:193119;a:1:{i:0;s:15:\"原味98g*3袋\t\";}i:193120;a:1:{i:0;s:18:\"海盐味98g*3袋\t\";}i:193121;a:1:{i:0;s:24:\"蜂蜜黄油味98g*3袋\t\";}i:193122;a:1:{i:0;s:18:\"焦糖味98g*3袋\t\";}i:193123;a:1:{i:0;s:18:\"芝士味98g*3袋\t\";}i:193124;a:1:{i:0;s:18:\"藤椒味98g*3袋\t\";}i:193125;a:1:{i:0;s:64:\"3袋不同口味（请备注口味，没备注口味随机发）\";}}","ctime":null,"utime":1607913899,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"休闲零食","products":[{"id":9293,"goods_id":1481,"barcode":null,"sn":"P6079138846265","price":"38.50","costprice":"37.90","mktprice":"0.00","marketable":2,"stock":213,"freeze_stock":0,"spes_desc":"口味:1.26千克/桶【约120支】","is_defalut":1,"image_id":"0b21991ffbac56ac7ad765957fd1dd3c","isdel":null,"name":"荧光棒棒糖120支/桶酸甜水果味硬糖儿童糖果","buy_limit":0,"bn":"G6079138846204","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079138095fd6d1510708a.jpg","total_stock":213,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"1.26千克/桶【约120支】":{"name":"1.26千克/桶【约120支】","is_default":true}}},"amount":"38.50","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079137965fd6d144f3f88.jpg","default":{"id":9293,"goods_id":1481,"barcode":null,"sn":"P6079138846265","price":"38.50","costprice":"37.90","mktprice":"0.00","marketable":2,"stock":213,"freeze_stock":0,"spes_desc":"口味:1.26千克/桶【约120支】","is_defalut":1,"image_id":"0b21991ffbac56ac7ad765957fd1dd3c","isdel":null,"name":"荧光棒棒糖120支/桶酸甜水果味硬糖儿童糖果","buy_limit":0,"bn":"G6079138846204","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079138095fd6d1510708a.jpg","total_stock":213,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"1.26千克/桶【约120支】":{"name":"1.26千克/桶【约120支】","is_default":true}}},"amount":"38.50","promotion_list":[],"promotion_amount":0},"product":{"id":9293,"goods_id":1481,"barcode":null,"sn":"P6079138846265","price":"38.50","costprice":"37.90","mktprice":"0.00","marketable":2,"stock":213,"spes_desc":"口味:1.26千克/桶【约120支】","is_defalut":1,"image_id":"0b21991ffbac56ac7ad765957fd1dd3c","isdel":null,"name":"荧光棒棒糖120支/桶酸甜水果味硬糖儿童糖果","buy_limit":0,"bn":"G6079138846204","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/14/16079138095fd6d1510708a.jpg","total_stock":213,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"1.26千克/桶【约120支】":{"name":"1.26千克/桶【约120支】","is_default":true}}},"amount":"38.50","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/14/16079137965fd6d144f3f88.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/14/16079137965fd6d144ba3ae.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/14/16079137965fd6d144c4a15.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/14/16079137965fd6d144de6d5.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/14/16079137965fd6d144cd5a2.jpg"],"total_stock":213,"is_buy_num":12,"isfav":"false","can_buy":"ok","vip_price":38.5,"is_notice":0},{"id":1478,"bn":"G6077583809984","name":"湖湘贡鹌鹑蛋卤蛋整盒15g*30包无壳湖南特产铁蛋零食","brief":"","price":"28.90","costprice":"26.90","mktprice":"0.00","image_id":"577e128be616fe623dc3d693cd98a961","goods_cat_id":112,"goods_type_id":98,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":394,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'>全国包邮，除部分地区包括内蒙古,甘肃,宁夏，海南，青海，西藏，新疆等地区需另加邮费，下单请联系客服哦。<\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077583775fd4722963cb4.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077583775fd472296ddfc.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077583775fd472297752b.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077583775fd4722989ff1.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077583775fd47229954fa.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077583775fd47229ad2ca.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077583785fd4722a18eb3.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077583785fd4722a55dcb.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077583785fd4722a93a80.png\"/><\/p><br/><p style='overflow:hidden'><\/p>","spes_desc":{"口味":{"193043":"香辣铁蛋15g*30包\t","193044":"盐焗味15g*30包\t","193045":"知心卤味20g*30包\t","193046":"泡椒味20g*30包\t","193047":"混合口味30包\t"}},"params":"","service":"1,4,6","comments_count":0,"view_count":0,"buy_count":6,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":2,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:14:{i:193042;a:1:{i:0;s:17:\"山核桃98g*3袋\";}i:193043;a:1:{i:0;s:22:\"香辣铁蛋15g*30包\t\";}i:193044;a:1:{i:0;s:19:\"盐焗味15g*30包\t\";}i:193045;a:1:{i:0;s:22:\"知心卤味20g*30包\t\";}i:193046;a:1:{i:0;s:19:\"泡椒味20g*30包\t\";}i:193047;a:1:{i:0;s:18:\"混合口味30包\t\";}i:193048;a:1:{i:0;s:10:\"520g桶装\";}i:193049;a:1:{i:0;s:15:\"原味98g*3袋\t\";}i:193050;a:1:{i:0;s:18:\"海盐味98g*3袋\t\";}i:193051;a:1:{i:0;s:24:\"蜂蜜黄油味98g*3袋\t\";}i:193052;a:1:{i:0;s:18:\"焦糖味98g*3袋\t\";}i:193053;a:1:{i:0;s:18:\"芝士味98g*3袋\t\";}i:193054;a:1:{i:0;s:18:\"藤椒味98g*3袋\t\";}i:193055;a:1:{i:0;s:64:\"3袋不同口味（请备注口味，没备注口味随机发）\";}}","ctime":null,"utime":1608111842,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"休闲零食","products":[{"id":9284,"goods_id":1478,"barcode":null,"sn":"P6077583810045","price":"28.90","costprice":"26.90","mktprice":"0.00","marketable":2,"stock":78,"freeze_stock":0,"spes_desc":"口味:香辣铁蛋15g*30包\t","is_defalut":1,"image_id":"","isdel":null,"name":"湖湘贡鹌鹑蛋卤蛋整盒15g*30包无壳湖南特产铁蛋零食","buy_limit":0,"bn":"G6077583809984","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077581715fd4715b276a9.jpg","total_stock":78,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"香辣铁蛋15g*30包\t":{"name":"香辣铁蛋15g*30包\t","is_default":true},"盐焗味15g*30包\t":{"name":"盐焗味15g*30包\t","product_id":9285},"知心卤味20g*30包\t":{"name":"知心卤味20g*30包\t","product_id":9286},"泡椒味20g*30包\t":{"name":"泡椒味20g*30包\t","product_id":9287},"混合口味30包\t":{"name":"混合口味30包\t","product_id":9288}}},"amount":"28.90","promotion_list":[],"promotion_amount":0},{"id":9285,"goods_id":1478,"barcode":null,"sn":"P6077583810084","price":"28.90","costprice":"26.90","mktprice":"0.00","marketable":2,"stock":79,"freeze_stock":0,"spes_desc":"口味:盐焗味15g*30包\t","is_defalut":2,"image_id":"","isdel":null,"name":"湖湘贡鹌鹑蛋卤蛋整盒15g*30包无壳湖南特产铁蛋零食","buy_limit":0,"bn":"G6077583809984","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077581715fd4715b276a9.jpg","total_stock":79,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"香辣铁蛋15g*30包\t":{"name":"香辣铁蛋15g*30包\t","product_id":9284},"盐焗味15g*30包\t":{"name":"盐焗味15g*30包\t","is_default":true},"知心卤味20g*30包\t":{"name":"知心卤味20g*30包\t","product_id":9286},"泡椒味20g*30包\t":{"name":"泡椒味20g*30包\t","product_id":9287},"混合口味30包\t":{"name":"混合口味30包\t","product_id":9288}}},"amount":"28.90","promotion_list":[],"promotion_amount":0},{"id":9286,"goods_id":1478,"barcode":null,"sn":"P6077583810113","price":"28.90","costprice":"26.90","mktprice":"0.00","marketable":2,"stock":80,"freeze_stock":0,"spes_desc":"口味:知心卤味20g*30包\t","is_defalut":2,"image_id":"","isdel":null,"name":"湖湘贡鹌鹑蛋卤蛋整盒15g*30包无壳湖南特产铁蛋零食","buy_limit":0,"bn":"G6077583809984","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077581715fd4715b276a9.jpg","total_stock":80,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"香辣铁蛋15g*30包\t":{"name":"香辣铁蛋15g*30包\t","product_id":9284},"盐焗味15g*30包\t":{"name":"盐焗味15g*30包\t","product_id":9285},"知心卤味20g*30包\t":{"name":"知心卤味20g*30包\t","is_default":true},"泡椒味20g*30包\t":{"name":"泡椒味20g*30包\t","product_id":9287},"混合口味30包\t":{"name":"混合口味30包\t","product_id":9288}}},"amount":"28.90","promotion_list":[],"promotion_amount":0},{"id":9287,"goods_id":1478,"barcode":null,"sn":"P6077583810154","price":"28.90","costprice":"26.90","mktprice":"0.00","marketable":2,"stock":80,"freeze_stock":0,"spes_desc":"口味:泡椒味20g*30包\t","is_defalut":2,"image_id":"","isdel":null,"name":"湖湘贡鹌鹑蛋卤蛋整盒15g*30包无壳湖南特产铁蛋零食","buy_limit":0,"bn":"G6077583809984","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077581715fd4715b276a9.jpg","total_stock":80,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"香辣铁蛋15g*30包\t":{"name":"香辣铁蛋15g*30包\t","product_id":9284},"盐焗味15g*30包\t":{"name":"盐焗味15g*30包\t","product_id":9285},"知心卤味20g*30包\t":{"name":"知心卤味20g*30包\t","product_id":9286},"泡椒味20g*30包\t":{"name":"泡椒味20g*30包\t","is_default":true},"混合口味30包\t":{"name":"混合口味30包\t","product_id":9288}}},"amount":"28.90","promotion_list":[],"promotion_amount":0},{"id":9288,"goods_id":1478,"barcode":null,"sn":"P6077583810183","price":"28.90","costprice":"26.90","mktprice":"0.00","marketable":2,"stock":77,"freeze_stock":0,"spes_desc":"口味:混合口味30包\t","is_defalut":2,"image_id":"","isdel":null,"name":"湖湘贡鹌鹑蛋卤蛋整盒15g*30包无壳湖南特产铁蛋零食","buy_limit":0,"bn":"G6077583809984","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077581715fd4715b276a9.jpg","total_stock":77,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"香辣铁蛋15g*30包\t":{"name":"香辣铁蛋15g*30包\t","product_id":9284},"盐焗味15g*30包\t":{"name":"盐焗味15g*30包\t","product_id":9285},"知心卤味20g*30包\t":{"name":"知心卤味20g*30包\t","product_id":9286},"泡椒味20g*30包\t":{"name":"泡椒味20g*30包\t","product_id":9287},"混合口味30包\t":{"name":"混合口味30包\t","is_default":true}}},"amount":"28.90","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077581715fd4715b276a9.jpg","default":{"id":9284,"goods_id":1478,"barcode":null,"sn":"P6077583810045","price":"28.90","costprice":"26.90","mktprice":"0.00","marketable":2,"stock":78,"freeze_stock":0,"spes_desc":"口味:香辣铁蛋15g*30包\t","is_defalut":1,"image_id":"","isdel":null,"name":"湖湘贡鹌鹑蛋卤蛋整盒15g*30包无壳湖南特产铁蛋零食","buy_limit":0,"bn":"G6077583809984","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077581715fd4715b276a9.jpg","total_stock":78,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"香辣铁蛋15g*30包\t":{"name":"香辣铁蛋15g*30包\t","is_default":true},"盐焗味15g*30包\t":{"name":"盐焗味15g*30包\t","product_id":9285},"知心卤味20g*30包\t":{"name":"知心卤味20g*30包\t","product_id":9286},"泡椒味20g*30包\t":{"name":"泡椒味20g*30包\t","product_id":9287},"混合口味30包\t":{"name":"混合口味30包\t","product_id":9288}}},"amount":"28.90","promotion_list":[],"promotion_amount":0},"product":{"id":9284,"goods_id":1478,"barcode":null,"sn":"P6077583810045","price":"28.90","costprice":"26.90","mktprice":"0.00","marketable":2,"stock":78,"spes_desc":"口味:香辣铁蛋15g*30包\t","is_defalut":1,"image_id":"","isdel":null,"name":"湖湘贡鹌鹑蛋卤蛋整盒15g*30包无壳湖南特产铁蛋零食","buy_limit":0,"bn":"G6077583809984","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077581715fd4715b276a9.jpg","total_stock":78,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"香辣铁蛋15g*30包\t":{"name":"香辣铁蛋15g*30包\t","is_default":true},"盐焗味15g*30包\t":{"name":"盐焗味15g*30包\t","product_id":9285},"知心卤味20g*30包\t":{"name":"知心卤味20g*30包\t","product_id":9286},"泡椒味20g*30包\t":{"name":"泡椒味20g*30包\t","product_id":9287},"混合口味30包\t":{"name":"混合口味30包\t","product_id":9288}}},"amount":"28.90","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/12/16077581715fd4715b276a9.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/12/16077581715fd4715b1d485.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/12/16077581715fd4715b13f1d.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/12/16077581715fd4715b3509b.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/12/16077582405fd471a0f3fb9.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/12/16077582415fd471a10aca5.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/12/16077582415fd471a114313.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/12/16077582415fd471a123541.jpg"],"total_stock":394,"is_buy_num":6,"isfav":"false","can_buy":"ok","vip_price":28.9,"is_notice":0},{"id":1476,"bn":"G6077550534660","name":"麦丽素520g桶装巧克力","brief":"不免邮区域:海外,台湾,澳门,\n香港,西藏,新疆,青海,内蒙古","price":"35.00","costprice":"32.50","mktprice":"0.00","image_id":"38e114ce54a7116a07cf57358199f13f","goods_cat_id":112,"goods_type_id":98,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":175,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077550275fd46513d7bd6.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077550275fd46513442a8.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077550275fd46513abbda.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077550285fd46514280cb.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077550285fd46514b9987.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077550285fd46514c3b79.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077550285fd46514d67cf.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077550295fd4651523ff8.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/11/16076760535fd330956c9fe.png\" alt=\"16076760535fd330956c9fe.png\"/><\/p>","spes_desc":{"口味":{"193034":"520g桶装"}},"params":"","service":"1,4,6,7","comments_count":0,"view_count":0,"buy_count":25,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":1,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:9:{i:193033;a:1:{i:0;s:17:\"山核桃98g*3袋\";}i:193034;a:1:{i:0;s:10:\"520g桶装\";}i:193035;a:1:{i:0;s:15:\"原味98g*3袋\t\";}i:193036;a:1:{i:0;s:18:\"海盐味98g*3袋\t\";}i:193037;a:1:{i:0;s:24:\"蜂蜜黄油味98g*3袋\t\";}i:193038;a:1:{i:0;s:18:\"焦糖味98g*3袋\t\";}i:193039;a:1:{i:0;s:18:\"芝士味98g*3袋\t\";}i:193040;a:1:{i:0;s:18:\"藤椒味98g*3袋\t\";}i:193041;a:1:{i:0;s:64:\"3袋不同口味（请备注口味，没备注口味随机发）\";}}","ctime":null,"utime":1607755105,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"休闲零食","products":[{"id":9282,"goods_id":1476,"barcode":null,"sn":"P6077550534720","price":"35.00","costprice":"32.50","mktprice":"0.00","marketable":2,"stock":175,"freeze_stock":0,"spes_desc":"口味:520g桶装","is_defalut":1,"image_id":"","isdel":null,"name":"麦丽素520g桶装巧克力","buy_limit":0,"bn":"G6077550534660","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077549515fd464c76cfc4.jpg","total_stock":175,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"520g桶装":{"name":"520g桶装","is_default":true}}},"amount":"35.00","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077549515fd464c76cfc4.jpg","default":{"id":9282,"goods_id":1476,"barcode":null,"sn":"P6077550534720","price":"35.00","costprice":"32.50","mktprice":"0.00","marketable":2,"stock":175,"freeze_stock":0,"spes_desc":"口味:520g桶装","is_defalut":1,"image_id":"","isdel":null,"name":"麦丽素520g桶装巧克力","buy_limit":0,"bn":"G6077550534660","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077549515fd464c76cfc4.jpg","total_stock":175,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"520g桶装":{"name":"520g桶装","is_default":true}}},"amount":"35.00","promotion_list":[],"promotion_amount":0},"product":{"id":9282,"goods_id":1476,"barcode":null,"sn":"P6077550534720","price":"35.00","costprice":"32.50","mktprice":"0.00","marketable":2,"stock":175,"spes_desc":"口味:520g桶装","is_defalut":1,"image_id":"","isdel":null,"name":"麦丽素520g桶装巧克力","buy_limit":0,"bn":"G6077550534660","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/12/16077549515fd464c76cfc4.jpg","total_stock":175,"grade_price":[],"grade_info":[],"default_spes_desc":{"口味":{"520g桶装":{"name":"520g桶装","is_default":true}}},"amount":"35.00","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/12/16077549515fd464c76cfc4.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/12/16077549515fd464c763263.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/12/16077549515fd464c781276.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/12/16077549515fd464c74efed.jpg"],"total_stock":175,"is_buy_num":25,"isfav":"false","can_buy":"ok","vip_price":35,"is_notice":0},{"id":1465,"bn":"G6075838326883","name":"每日小点肉松蛋糕营养早餐面包独立包装","brief":"","price":"16.90","costprice":"15.90","mktprice":"0.00","image_id":"f755da65845f22ba2eb8e9de9dd97c18","goods_cat_id":112,"goods_type_id":95,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":300,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'>全国包邮，除部分地区包括内蒙古,甘肃,宁夏，海南，青海，西藏，新疆等地区需另加邮费，下单请联系客服哦<\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838295fd1c85569eee.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838295fd1c85574643.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838295fd1c8557df27.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838295fd1c8558f28d.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838295fd1c8559cc44.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838295fd1c855b554e.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838295fd1c855bebb2.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838295fd1c855c8a66.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838295fd1c855ed585.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838305fd1c856027fc.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838305fd1c8561bf0f.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838305fd1c85625613.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838305fd1c85662a83.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838305fd1c8566b995.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838305fd1c8567fc2f.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838305fd1c856bcdc3.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075838305fd1c856c6d2d.png\"/><\/p><p style='overflow:hidden'><br/><\/p>","spes_desc":{"规格":{"190244":"咸肉松小贝【3包】约12枚","190245":"咸肉松小贝【6包】约24枚","190246":"咸肉松小贝 2kg/原装整箱\t"}},"params":"","service":"1,4,6","comments_count":0,"view_count":0,"buy_count":0,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":2,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:39:{i:190243;a:1:{i:0;s:8:\"1个头\t\";}i:190244;a:1:{i:0;s:33:\"咸肉松小贝【3包】约12枚\";}i:190245;a:1:{i:0;s:33:\"咸肉松小贝【6包】约24枚\";}i:190246;a:1:{i:0;s:33:\"咸肉松小贝 2kg/原装整箱\t\";}i:190247;a:1:{i:0;s:21:\"黑色（主驾驶）\";}i:190248;a:1:{i:0;s:21:\"黑色（副驾驶）\";}i:190249;a:1:{i:0;s:21:\"棕色（主驾驶）\";}i:190250;a:1:{i:0;s:21:\"棕色（副驾驶）\";}i:190251;a:1:{i:0;s:21:\"米色（主驾驶）\";}i:190252;a:1:{i:0;s:21:\"米色（副驾驶）\";}i:190253;a:1:{i:0;s:30:\"塑胶无皮款（主驾驶）\";}i:190254;a:1:{i:0;s:30:\"塑胶无皮款（副驾驶）\";}i:190255;a:1:{i:0;s:20:\"黑色主+副2个装\";}i:190256;a:1:{i:0;s:20:\"棕色主+副2个装\";}i:190257;a:1:{i:0;s:20:\"米色主+副2个装\";}i:190258;a:1:{i:0;s:29:\"塑胶无皮款主+副2个装\";}i:190259;a:1:{i:0;s:6:\"大号\";}i:190260;a:1:{i:0;s:6:\"小号\";}i:190261;a:1:{i:0;s:9:\"折叠款\";}i:190262;a:1:{i:0;s:12:\"折叠圆形\";}i:190263;a:1:{i:0;s:7:\"30包*2\";}i:190264;a:1:{i:0;s:5:\"50g*8\";}i:190265;a:1:{i:0;s:24:\"4个500ml高档水晶杯\";}i:190266;a:1:{i:0;s:23:\"S925银针耳钉一对 \";}i:190267;a:1:{i:0;s:25:\" 三角软垫耳夹一对\";}i:190268;a:1:{i:0;s:13:\"龙猫-小草\";}i:190269;a:1:{i:0;s:13:\"龙猫-萝卜\";}i:190270;a:1:{i:0;s:11:\"哆啦A梦1\";}i:190271;a:1:{i:0;s:11:\"哆啦A梦2\";}i:190272;a:1:{i:0;s:14:\"10支蓝桥opp\";}i:190273;a:1:{i:0;s:17:\"10支蓝桥+pu包\";}i:190274;a:1:{i:0;s:7:\"5个头\";}i:190275;a:1:{i:0;s:10:\"带1片布\";}i:190276;a:1:{i:0;s:10:\"带3片布\";}i:190277;a:1:{i:0;s:10:\"带7片布\";}i:190278;a:1:{i:0;s:30:\"美规电源（国内通用）\";}i:190279;a:1:{i:0;s:8:\"2个头\t\";}i:190280;a:1:{i:0;s:8:\"3个头\t\";}i:190281;a:1:{i:0;s:7:\"4个头\";}}","ctime":null,"utime":1608112509,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"休闲零食","products":[{"id":9186,"goods_id":1465,"barcode":null,"sn":"P6075838326945","price":"16.90","costprice":"15.90","mktprice":"0.00","marketable":2,"stock":100,"freeze_stock":0,"spes_desc":"规格:咸肉松小贝【3包】约12枚","is_defalut":1,"image_id":"","isdel":null,"name":"每日小点肉松蛋糕营养早餐面包独立包装","buy_limit":0,"bn":"G6075838326883","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075837335fd1c7f5c1eeb.jpg","total_stock":100,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"咸肉松小贝【3包】约12枚":{"name":"咸肉松小贝【3包】约12枚","is_default":true},"咸肉松小贝【6包】约24枚":{"name":"咸肉松小贝【6包】约24枚","product_id":9187},"咸肉松小贝 2kg/原装整箱\t":{"name":"咸肉松小贝 2kg/原装整箱\t","product_id":9188}}},"amount":"16.90","promotion_list":[],"promotion_amount":0},{"id":9187,"goods_id":1465,"barcode":null,"sn":"P6075838326994","price":"28.90","costprice":"27.50","mktprice":"0.00","marketable":2,"stock":100,"freeze_stock":0,"spes_desc":"规格:咸肉松小贝【6包】约24枚","is_defalut":2,"image_id":"","isdel":null,"name":"每日小点肉松蛋糕营养早餐面包独立包装","buy_limit":0,"bn":"G6075838326883","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075837335fd1c7f5c1eeb.jpg","total_stock":100,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"咸肉松小贝【3包】约12枚":{"name":"咸肉松小贝【3包】约12枚","product_id":9186},"咸肉松小贝【6包】约24枚":{"name":"咸肉松小贝【6包】约24枚","is_default":true},"咸肉松小贝 2kg/原装整箱\t":{"name":"咸肉松小贝 2kg/原装整箱\t","product_id":9188}}},"amount":"28.90","promotion_list":[],"promotion_amount":0},{"id":9188,"goods_id":1465,"barcode":null,"sn":"P6075838327021","price":"74.90","costprice":"69.70","mktprice":"0.00","marketable":2,"stock":100,"freeze_stock":0,"spes_desc":"规格:咸肉松小贝 2kg/原装整箱\t","is_defalut":2,"image_id":"","isdel":null,"name":"每日小点肉松蛋糕营养早餐面包独立包装","buy_limit":0,"bn":"G6075838326883","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075837335fd1c7f5c1eeb.jpg","total_stock":100,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"咸肉松小贝【3包】约12枚":{"name":"咸肉松小贝【3包】约12枚","product_id":9186},"咸肉松小贝【6包】约24枚":{"name":"咸肉松小贝【6包】约24枚","product_id":9187},"咸肉松小贝 2kg/原装整箱\t":{"name":"咸肉松小贝 2kg/原装整箱\t","is_default":true}}},"amount":"74.90","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075837335fd1c7f5c1eeb.jpg","default":{"id":9186,"goods_id":1465,"barcode":null,"sn":"P6075838326945","price":"16.90","costprice":"15.90","mktprice":"0.00","marketable":2,"stock":100,"freeze_stock":0,"spes_desc":"规格:咸肉松小贝【3包】约12枚","is_defalut":1,"image_id":"","isdel":null,"name":"每日小点肉松蛋糕营养早餐面包独立包装","buy_limit":0,"bn":"G6075838326883","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075837335fd1c7f5c1eeb.jpg","total_stock":100,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"咸肉松小贝【3包】约12枚":{"name":"咸肉松小贝【3包】约12枚","is_default":true},"咸肉松小贝【6包】约24枚":{"name":"咸肉松小贝【6包】约24枚","product_id":9187},"咸肉松小贝 2kg/原装整箱\t":{"name":"咸肉松小贝 2kg/原装整箱\t","product_id":9188}}},"amount":"16.90","promotion_list":[],"promotion_amount":0},"product":{"id":9186,"goods_id":1465,"barcode":null,"sn":"P6075838326945","price":"16.90","costprice":"15.90","mktprice":"0.00","marketable":2,"stock":100,"spes_desc":"规格:咸肉松小贝【3包】约12枚","is_defalut":1,"image_id":"","isdel":null,"name":"每日小点肉松蛋糕营养早餐面包独立包装","buy_limit":0,"bn":"G6075838326883","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/10/16075837335fd1c7f5c1eeb.jpg","total_stock":100,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"咸肉松小贝【3包】约12枚":{"name":"咸肉松小贝【3包】约12枚","is_default":true},"咸肉松小贝【6包】约24枚":{"name":"咸肉松小贝【6包】约24枚","product_id":9187},"咸肉松小贝 2kg/原装整箱\t":{"name":"咸肉松小贝 2kg/原装整箱\t","product_id":9188}}},"amount":"16.90","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/10/16075837335fd1c7f5c1eeb.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/10/16075837335fd1c7f5d4a0a.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/10/16075837335fd1c7f5cb903.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/10/16075837335fd1c7f5e65f0.jpg"],"total_stock":300,"is_buy_num":0,"isfav":"false","can_buy":"ok","vip_price":16.9,"is_notice":0},{"id":1433,"bn":"G6073251753212","name":"国产紫皮糖1000g巧克力涂层","brief":"","price":"26.00","costprice":"25.30","mktprice":"0.00","image_id":"337e43e8e826a1948fa7f917e0731f9c","goods_cat_id":112,"goods_type_id":79,"brand_id":0,"is_nomal_virtual":1,"marketable":1,"stock":192,"weight":"0.00","unit":"","intro":"<p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073251595fcdd5e737f47.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073251595fcdd5e760e88.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073251595fcdd5e7d1702.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073251605fcdd5e84ed66.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073251605fcdd5e8cb8d7.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073251615fcdd5e918fe2.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073251615fcdd5e922b38.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073251615fcdd5e95fa7d.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073251615fcdd5e99ec1c.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073251615fcdd5e9dc146.jpg\"/><\/p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src=\"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073221145fcdca02ddc9f.png\" alt=\"16073221145fcdca02ddc9f.png\"/><\/p>","spes_desc":{"规格2":{"185714":" 1000g紫皮糖"}},"params":"","service":"1,4,6,7","comments_count":0,"view_count":0,"buy_count":8,"xuni_num":null,"uptime":null,"downtime":null,"sort":0,"is_recommend":1,"is_hot":1,"is_tqm":1,"success_num":0,"start_time":"1970-01-01 08:00","end_time":"1970-01-01 08:00","label_ids":[],"new_spec":"a:381:{i:185713;a:1:{i:0;s:17:\"120克(不加绒)\";}i:185714;a:1:{i:0;s:15:\" 1000g紫皮糖\";}i:185715;a:1:{i:0;s:36:\"【整条原味】酸豆角500g*2袋\";}i:185716;a:1:{i:0;s:33:\"女款5双【适用于35-39码】\";}i:185717;a:1:{i:0;s:33:\"男款5双【适用于40-44码】\";}i:185718;a:1:{i:0;s:15:\"两层有轮子\";}i:185719;a:1:{i:0;s:15:\"三层有轮子\";}i:185720;a:1:{i:0;s:15:\"四层有轮子\";}i:185721;a:1:{i:0;s:9:\"酒红色\";}i:185722;a:1:{i:0;s:9:\"墨绿色\";}i:185723;a:1:{i:0;s:46:\"一共2个，发不同颜色请自行备注！\";}i:185724;a:1:{i:0;s:31:\"绿色酒套老人款【2个】\";}i:185725;a:1:{i:0;s:31:\"红色酒套雪人款【2个】\";}i:185726;a:1:{i:0;s:31:\"米色酒套雪人款【2个】\";}i:185727;a:1:{i:0;s:21:\"带柄碗（黄色）\";}i:185728;a:1:{i:0;s:24:\"带柄碗（粉红色）\";}i:185729;a:1:{i:0;s:21:\"带柄碗（蓝色）\";}i:185730;a:1:{i:0;s:21:\"带柄碗（绿色）\";}i:185731;a:1:{i:0;s:21:\"带柄碗（黑色）\";}i:185732;a:1:{i:0;s:21:\"带柄碗（白色）\";}i:185733;a:1:{i:0;s:21:\"带柄碗（灰色）\";}i:185734;a:1:{i:0;s:24:\"带柄碗（湖绿色）\";}i:185735;a:1:{i:0;s:23:\"羽绒服湿巾12片装\";}i:185736;a:1:{i:0;s:26:\"皮衣皮革湿巾15片装\";}i:185737;a:1:{i:0;s:35:\"羽绒服泡沫干洗剂（200ml）\";}i:185738;a:1:{i:0;s:23:\"任一产品，拍2发3\";}i:185739;a:1:{i:0;s:22:\"开口松子罐装250g\";}i:185740;a:1:{i:0;s:29:\"开口松子罐装2罐共500g\";}i:185741;a:1:{i:0;s:30:\"开口松子罐装4罐共1000g\";}i:185742;a:1:{i:0;s:22:\"开口松子袋装250g\";}i:185743;a:1:{i:0;s:29:\"开口松子袋装2袋共500g\";}i:185744;a:1:{i:0;s:30:\"开口松子袋装4袋共1000g\";}i:185745;a:1:{i:0;s:10:\"Q宠猫咪\";}i:185746;a:1:{i:0;s:10:\"Q宠小兔\";}i:185747;a:1:{i:0;s:10:\"Q宠小皮\";}i:185748;a:1:{i:0;s:10:\"Q宠小鹿\";}i:185749;a:1:{i:0;s:9:\"N12粉色\";}i:185750;a:1:{i:0;s:9:\"N12绿色\";}i:185751;a:1:{i:0;s:9:\"N12黑色\";}i:185752;a:1:{i:0;s:16:\" 原味香菇酱\";}i:185753;a:1:{i:0;s:15:\"香辣香菇酱\";}i:185754;a:1:{i:0;s:18:\"奥尔良香菇酱\";}i:185755;a:1:{i:0;s:15:\"香辣牛肉酱\";}i:185756;a:1:{i:0;s:15:\"红烧牛肉酱\";}i:185757;a:1:{i:0;s:15:\"五香牛肉酱\";}i:185758;a:1:{i:0;s:43:\"特惠2瓶装【口味请自行备注！】\";}i:185759;a:1:{i:0;s:13:\"圆柿饼2斤\";}i:185760;a:1:{i:0;s:13:\"吊柿饼2斤\";}i:185761;a:1:{i:0;s:27:\"圆柿饼1斤+吊柿饼1斤\";}i:185762;a:1:{i:0;s:8:\"  黄色\";}i:185763;a:1:{i:0;s:8:\"  蓝色\";}i:185764;a:1:{i:0;s:9:\"   粉色\";}i:185765;a:1:{i:0;s:10:\" 果绿色\";}i:185766;a:1:{i:0;s:7:\" 米色\";}i:185767;a:1:{i:0;s:7:\" 灰色\";}i:185768;a:1:{i:0;s:6:\"咖色\";}i:185769;a:1:{i:0;s:10:\" 海藻绿\";}i:185770;a:1:{i:0;s:6:\"褐色\";}i:185771;a:1:{i:0;s:6:\"灰色\";}i:185772;a:1:{i:0;s:9:\"橘红色\";}i:185773;a:1:{i:0;s:9:\"土黄色\";}i:185774;a:1:{i:0;s:6:\"棕色\";}i:185775;a:1:{i:0;s:9:\"卡其色\";}i:185776;a:1:{i:0;s:6:\"墨绿\";}i:185777;a:1:{i:0;s:20:\"9018-26A一鹿有你\";}i:185778;a:1:{i:0;s:20:\"9018-26B一鹿有你\";}i:185779;a:1:{i:0;s:20:\"9018-26C一鹿有你\";}i:185780;a:1:{i:0;s:20:\"9018-26D一鹿有你\";}i:185781;a:1:{i:0;s:26:\"9018-27A黄色老人帽子\";}i:185782;a:1:{i:0;s:26:\"9018-27B黄色小鹿帽子\";}i:185783;a:1:{i:0;s:26:\"9018-27C红色老人帽子\";}i:185784;a:1:{i:0;s:26:\"9018-27D红色雪人帽子\";}i:185785;a:1:{i:0;s:55:\"正版宝可梦皮卡丘神奇宝贝情侣摆件-男款\";}i:185786;a:1:{i:0;s:55:\"正版宝可梦皮卡丘神奇宝贝情侣摆件-女款\";}i:185787;a:1:{i:0;s:62:\"正版宝可梦皮卡丘神奇宝贝情侣摆件-男款+女款\";}i:185788;a:1:{i:0;s:16:\"薄壳罐装250g\";}i:185789;a:1:{i:0;s:23:\"薄壳罐装2罐共500g\";}i:185790;a:1:{i:0;s:24:\"薄壳罐装4罐共1000g\";}i:185791;a:1:{i:0;s:42:\"手撕肉干原味30包/盒（超市同款\";}i:185792;a:1:{i:0;s:45:\"手撕肉干香辣味30包/盒（超市同款\";}i:185793;a:1:{i:0;s:45:\"手撕肉干孜然味30包/盒（超市同款\";}i:185794;a:1:{i:0;s:45:\"手撕肉干麻辣味30包/盒（超市同款\";}i:185795;a:1:{i:0;s:4:\"2包\";}i:185796;a:1:{i:0;s:4:\"5包\";}i:185797;a:1:{i:0;s:5:\"10包\";}i:185798;a:1:{i:0;s:78:\"默认口味随机【肉松味，蟹黄味，海鲜味，请自行备注！】\";}i:185799;a:1:{i:0;s:22:\"夏威夷果罐装250g\";}i:185800;a:1:{i:0;s:29:\"夏威夷果罐装2罐共500g\";}i:185801;a:1:{i:0;s:30:\"夏威夷果罐装4罐共1000g\";}i:185802;a:1:{i:0;s:29:\"夏威夷果袋装2袋共500g\";}i:185803;a:1:{i:0;s:30:\"夏威夷果袋装4袋共1000g\";}i:185804;a:1:{i:0;s:10:\"罐装250g\";}i:185805;a:1:{i:0;s:17:\"罐装2罐共500g\";}i:185806;a:1:{i:0;s:18:\"罐装4罐共1000g\";}i:185807;a:1:{i:0;s:10:\"袋装250g\";}i:185808;a:1:{i:0;s:17:\"袋装2袋共500g\";}i:185809;a:1:{i:0;s:18:\"袋装4袋共1000g\";}i:185810;a:1:{i:0;s:4:\"200g\";}i:185811;a:1:{i:0;s:4:\"400g\";}i:185812;a:1:{i:0;s:4:\"800g\";}i:185813;a:1:{i:0;s:5:\"2500g\";}i:185814;a:1:{i:0;s:15:\"350ml 海天蓝\";}i:185815;a:1:{i:0;s:15:\"350ml 可爱粉\";}i:185816;a:1:{i:0;s:15:\"350ml 活力黄\";}i:185817;a:1:{i:0;s:15:\"300ml 深蓝色\";}i:185818;a:1:{i:0;s:12:\"300ml 红色\";}i:185819;a:1:{i:0;s:12:\"300ml 粉色\";}i:185820;a:1:{i:0;s:16:\"脱脂奶粉800g\";}i:185821;a:1:{i:0;s:4:\"500g\";}i:185822;a:1:{i:0;s:5:\"1000g\";}i:185823;a:1:{i:0;s:5:\"2000g\";}i:185824;a:1:{i:0;s:13:\"青花椒210g\";}i:185825;a:1:{i:0;s:13:\"酸菜鱼220g\";}i:185826;a:1:{i:0;s:13:\"烧鸡公160g\";}i:185827;a:1:{i:0;s:18:\"100ml【1瓶装】\";}i:185828;a:1:{i:0;s:20:\"100ml*3【3瓶装】\";}i:185829;a:1:{i:0;s:15:\"全脂奶粉1kg\";}i:185830;a:1:{i:0;s:15:\"脱脂奶粉1kg\";}i:185831;a:1:{i:0;s:9:\"1瓶60粒\";}i:185832;a:1:{i:0;s:7:\"1瓶20g\";}i:185833;a:1:{i:0;s:10:\"1瓶/50粒\";}i:185834;a:1:{i:0;s:25:\"12盒 益生菌 28片/盒\";}i:185835;a:1:{i:0;s:28:\"12盒 叶黄素酯 28片/盒\";}i:185836;a:1:{i:0;s:27:\"12盒 针叶樱桃28片/盒\";}i:185837;a:1:{i:0;s:22:\"12盒 原味 28片/盒\";}i:185838;a:1:{i:0;s:35:\"haleiwa哈雷蛙保温杯儿 粉色\";}i:185839;a:1:{i:0;s:35:\"haleiwa哈雷蛙保温杯儿 蓝色\";}i:185840;a:1:{i:0;s:24:\"硅胶奶瓶 粉色150ml\";}i:185841;a:1:{i:0;s:4:\"15ml\";}i:185842;a:1:{i:0;s:79:\"8122大【2个装，默认随机.粉色，蓝色，绿色，请 自行备注】\";}i:185843;a:1:{i:0;s:79:\"8123小【2个装，默认随机.粉色，蓝色，绿色，请 自行备注】\";}i:185844;a:1:{i:0;s:32:\"整箱60包【家庭实惠装】\";}i:185845;a:1:{i:0;s:9:\"粉红色\";}i:185846;a:1:{i:0;s:6:\"蓝色\";}i:185847;a:1:{i:0;s:6:\"白色\";}i:185848;a:1:{i:0;s:31:\"脱骨凤爪200g（柠檬味）\";}i:185849;a:1:{i:0;s:31:\"脱骨凤爪200g（山椒味）\";}i:185850;a:1:{i:0;s:8:\" 50*50CM\";}i:185851;a:1:{i:0;s:36:\"小号48CM*40CM(底部直径*高度)\";}i:185852;a:1:{i:0;s:36:\"大号56CM*48CM(底部直径*高度)\";}i:185853;a:1:{i:0;s:111:\"【此项勿拍】颜色默认随机【蓝色，紫色，粉色，白色，有颜色要求请自行备注！】\";}i:185854;a:1:{i:0;s:66:\"1.8快慢档+不锈钢蒸格+送7礼【可炖煮，不可煎炒】\";}i:185855;a:1:{i:0;s:69:\"1.8不粘快慢档+不锈钢蒸格+送8礼【可炖煮，可煎炒】\";}i:185856;a:1:{i:0;s:19:\"标准版-无蓝光\";}i:185857;a:1:{i:0;s:25:\"升级版-蓝光负离子\";}i:185858;a:1:{i:0;s:21:\"鸳鸯火锅礼品款\";}i:185859;a:1:{i:0;s:21:\"鸳鸯火锅高端款\";}i:185860;a:1:{i:0;s:19:\"白色+USB充电线\";}i:185861;a:1:{i:0;s:19:\"蓝色+USB充电线\";}i:185862;a:1:{i:0;s:22:\"粉红色+USB充电线\";}i:185863;a:1:{i:0;s:12:\"小猪米色\";}i:185864;a:1:{i:0;s:12:\"小猪粉色\";}i:185865;a:1:{i:0;s:23:\"橄榄深层保湿800g\t\";}i:185866;a:1:{i:0;s:23:\"薄荷冰爽健肤800g\t\";}i:185867;a:1:{i:0;s:23:\"牛奶润滑嫩肤800g\t\";}i:185868;a:1:{i:0;s:26:\"薰衣草舒缓肌肤800g\t\";}i:185869;a:1:{i:0;s:23:\"法国迷蝶香水800g\t\";}i:185870;a:1:{i:0;s:23:\"海马情迷香肌800g\t\";}i:185871;a:1:{i:0;s:23:\"芦荟清新爽肤800g\t\";}i:185872;a:1:{i:0;s:18:\"普通款三件套\";}i:185873;a:1:{i:0;s:12:\"小号蓝色\";}i:185874;a:1:{i:0;s:12:\"小号粉色\";}i:185875;a:1:{i:0;s:12:\"小号灰色\";}i:185876;a:1:{i:0;s:12:\"大号蓝色\";}i:185877;a:1:{i:0;s:12:\"大号粉色\";}i:185878;a:1:{i:0;s:12:\"大号灰色\";}i:185879;a:1:{i:0;s:16:\"小小面包380g\";}i:185880;a:1:{i:0;s:7:\"2罐装\";}i:185881;a:1:{i:0;s:9:\"1盒2.5ML\";}i:185882;a:1:{i:0;s:33:\"颜色随机【线长约1.5米】\";}i:185883;a:1:{i:0;s:12:\"颜色随机\";}i:185884;a:1:{i:0;s:14:\"梨膏糖*2罐\";}i:185885;a:1:{i:0;s:26:\"牛油果润唇膏4.5g/支\";}i:185886;a:1:{i:0;s:9:\"480g*2箱\";}i:185887;a:1:{i:0;s:3:\"60g\";}i:185888;a:1:{i:0;s:9:\"葡萄味\";}i:185889;a:1:{i:0;s:10:\"150片/瓶\";}i:185890;a:1:{i:0;s:72:\"默认字母混搭男款5双【u字混搭女款5双请自行备注！】\";}i:185891;a:1:{i:0;s:9:\"310g*3袋\";}i:185892;a:1:{i:0;s:9:\"310g*5袋\";}i:185893;a:1:{i:0;s:10:\"310g*10袋\";}i:185894;a:1:{i:0;s:21:\"正宗城味300g*3袋\";}i:185895;a:1:{i:0;s:17:\"正宗城味300g*\";}i:185896;a:1:{i:0;s:4:\"5袋\";}i:185897;a:1:{i:0;s:22:\"正宗城味300g*10袋\";}i:185898;a:1:{i:0;s:15:\"3袋共90小包\";}i:185899;a:1:{i:0;s:39:\"按压款停车牌【黑色塑料款】\";}i:185900;a:1:{i:0;s:39:\"按压款停车牌【银色合金款】\";}i:185901;a:1:{i:0;s:39:\"按压款停车牌【金色合金款】\";}i:185902;a:1:{i:0;s:2:\"A8\";}i:185903;a:1:{i:0;s:30:\"七彩虹（密码锁齿轮）\";}i:185904;a:1:{i:0;s:17:\"30片川香风味\";}i:185905;a:1:{i:0;s:20:\"30片麦辣鸡汁味\";}i:185906;a:1:{i:0;s:20:\"30片红烧牛肉味\";}i:185907;a:1:{i:0;s:20:\"三种口味各10片\";}i:185908;a:1:{i:0;s:66:\"【此项勿拍】两瓶需要不同香味的，请自行备注！\";}i:185909;a:1:{i:0;s:37:\"海洋【买一送一，实发2瓶】\";}i:185910;a:1:{i:0;s:37:\"桂花【买一送一，实发2瓶】\";}i:185911;a:1:{i:0;s:37:\"茉莉【买一送一，实发2瓶】\";}i:185912;a:1:{i:0;s:37:\"古龙【买一送一，实发2瓶】\";}i:185913;a:1:{i:0;s:37:\"柠檬【买一送一，实发2瓶】\";}i:185914;a:1:{i:0;s:21:\"脆口菜芯426g*2瓶\";}i:185915;a:1:{i:0;s:21:\"香辣三丝426g*2瓶\";}i:185916;a:1:{i:0;s:21:\"开味酸菜426g*2瓶\";}i:185917;a:1:{i:0;s:21:\"脆口豇豆426g*2瓶\";}i:185918;a:1:{i:0;s:23:\"426g爽口下饭菜2瓶\";}i:185919;a:1:{i:0;s:53:\"正装280ml奇异果香型+补充装300ml草莓香型\";}i:185920;a:1:{i:0;s:34:\"狼蛛2016黑色圆键机械键盘\";}i:185921;a:1:{i:0;s:16:\"400g混合口味\";}i:185922;a:1:{i:0;s:16:\"800g混合口味\";}i:185923;a:1:{i:0;s:17:\"2500g混合口味\";}i:185924;a:1:{i:0;s:32:\"2包【100抽】15*20cm珍珠纹\";}i:185925;a:1:{i:0;s:29:\"2包【100抽】15*20cm平纹\";}i:185926;a:1:{i:0;s:34:\"15*20cm珍珠纹和平纹各一包\";}i:185927;a:1:{i:0;s:39:\"1块除菌止痒皂+2块滋润柔肤皂\";}i:185928;a:1:{i:0;s:39:\"2块除菌止痒皂+1块滋润柔肤皂\";}i:185929;a:1:{i:0;s:19:\"3块除菌止痒皂\";}i:185930;a:1:{i:0;s:19:\"3块滋润柔肤皂\";}i:185931;a:1:{i:0;s:9:\"12ml*7个\";}i:185932;a:1:{i:0;s:16:\"混装口味1斤\";}i:185933;a:1:{i:0;s:13:\"麻辣味1斤\";}i:185934;a:1:{i:0;s:13:\"爆烤味1斤\";}i:185935;a:1:{i:0;s:13:\"山椒味1斤\";}i:185936;a:1:{i:0;s:13:\"五香味1斤\";}i:185937;a:1:{i:0;s:13:\"鸡汁味1斤\";}i:185938;a:1:{i:0;s:4:\"2对\";}i:185939;a:1:{i:0;s:12:\"花朵蓝色\";}i:185940;a:1:{i:0;s:12:\"花朵绿色\";}i:185941;a:1:{i:0;s:12:\"花朵粉色\";}i:185942;a:1:{i:0;s:12:\"荷花蓝色\";}i:185943;a:1:{i:0;s:12:\"荷花绿色\";}i:185944;a:1:{i:0;s:12:\"荷花粉色\";}i:185945;a:1:{i:0;s:56:\"标配：KS-738旋转手电筒+18650电池+USB线+彩盒\";}i:185946;a:1:{i:0;s:23:\"200PC女孩图案粉色\";}i:185947;a:1:{i:0;s:26:\"200PC独角兽图案蓝色\";}i:185948;a:1:{i:0;s:17:\"200PC铝盒粉色\";}i:185949;a:1:{i:0;s:17:\"200PC铝盒蓝色\";}i:185950;a:1:{i:0;s:17:\"200PC铝盒黄色\";}i:185951;a:1:{i:0;s:26:\"200PC独角兽图案粉色\";}i:185952;a:1:{i:0;s:28:\"【超辣】山椒花生1斤\";}i:185953;a:1:{i:0;s:25:\"【辣】秘辣花生1斤\";}i:185954;a:1:{i:0;s:28:\"【不辣】盐焗花生1斤\";}i:185955;a:1:{i:0;s:13:\"混合味1斤\";}i:185956;a:1:{i:0;s:19:\"5瓶【实惠装】\";}i:185957;a:1:{i:0;s:15:\"电池款粉色\";}i:185958;a:1:{i:0;s:15:\"电池款蓝色\";}i:185959;a:1:{i:0;s:15:\"充电款粉色\";}i:185960;a:1:{i:0;s:15:\"充电款蓝色\";}i:185961;a:1:{i:0;s:9:\"120g*2袋\";}i:185962;a:1:{i:0;s:11:\"310ml*12瓶\";}i:185963;a:1:{i:0;s:7:\"[14]码\";}i:185964;a:1:{i:0;s:10:\"内长14cm\";}i:185965;a:1:{i:0;s:7:\"[15]码\";}i:185966;a:1:{i:0;s:10:\"内长15cm\";}i:185967;a:1:{i:0;s:7:\"[16]码\";}i:185968;a:1:{i:0;s:10:\"内长16cm\";}i:185969;a:1:{i:0;s:7:\"[17]码\";}i:185970;a:1:{i:0;s:10:\"内长17cm\";}i:185971;a:1:{i:0;s:7:\"[18]码\";}i:185972;a:1:{i:0;s:10:\"内长18cm\";}i:185973;a:1:{i:0;s:7:\"[19]码\";}i:185974;a:1:{i:0;s:10:\"内长19cm\";}i:185975;a:1:{i:0;s:7:\"[20]码\";}i:185976;a:1:{i:0;s:10:\"内长20cm\";}i:185977;a:1:{i:0;s:28:\"薰衣草【鸭蛋形300g】\";}i:185978;a:1:{i:0;s:25:\"茉莉【鸭蛋形300g】\";}i:185979;a:1:{i:0;s:25:\"玫瑰【鸭蛋形300g】\";}i:185980;a:1:{i:0;s:23:\"420ml白身一个草莓\";}i:185981;a:1:{i:0;s:23:\"420ml白身多个草莓\";}i:185982;a:1:{i:0;s:23:\"420ml粉身一个草莓\";}i:185983;a:1:{i:0;s:23:\"420ml粉身多个草莓\";}i:185984;a:1:{i:0;s:23:\"300ml白身一个草莓\";}i:185985;a:1:{i:0;s:23:\"300ml白身多个草莓\";}i:185986;a:1:{i:0;s:23:\"300ml粉身一个草莓\";}i:185987;a:1:{i:0;s:23:\"300ml粉身多个草莓\";}i:185988;a:1:{i:0;s:4:\"1瓶\";}i:185989;a:1:{i:0;s:19:\"2瓶【优惠价】\";}i:185990;a:1:{i:0;s:34:\"5个装【茉莉味，特价款】\";}i:185991;a:1:{i:0;s:37:\"5个装【薰衣草味，升级款】\";}i:185992;a:1:{i:0;s:34:\"5个装【柠檬味，升级款】\";}i:185993;a:1:{i:0;s:24:\"混合味（箱装1kg）\";}i:185994;a:1:{i:0;s:28:\"01#混合味（箱装500g）\";}i:185995;a:1:{i:0;s:31:\"02#黑芝麻味（箱装500g）\";}i:185996;a:1:{i:0;s:31:\"03#黄芝麻味（箱装500g）\";}i:185997;a:1:{i:0;s:31:\"04#白芝麻味（箱装500g）\";}i:185998;a:1:{i:0;s:28:\"05#花生味（箱装500g）\";}i:185999;a:1:{i:0;s:30:\"06#黑芝麻味（箱装1kg）\";}i:186000;a:1:{i:0;s:30:\"07#黄芝麻味（箱装1kg）\";}i:186001;a:1:{i:0;s:30:\"08#白芝麻味（箱装1kg）\";}i:186002;a:1:{i:0;s:25:\"09#花生味（箱装1kg)\";}i:186003;a:1:{i:0;s:75:\"插电款银色（不带无线充）+配USB线+配USB充电头+三档调光\";}i:186004;a:1:{i:0;s:75:\"充电款银色（不带无线充）+配USB线+配USB充电头+三档调光\";}i:186005;a:1:{i:0;s:84:\"插电款银色（不带无线充）+配USB线+配USB充电头+调光调色带定时\";}i:186006;a:1:{i:0;s:84:\"充电款银色（不带无线充）+配USB线+配USB充电头+调光调色带定时\";}i:186007;a:1:{i:0;s:81:\"插电款银色（带无线充）+配USB线+配USB充电头+调光调色带定时\";}i:186008;a:1:{i:0;s:51:\"家庭实惠装【20支】白色10支，竹炭10支\";}i:186009;a:1:{i:0;s:32:\"家庭实惠装【20支】竹炭\";}i:186010;a:1:{i:0;s:32:\"家庭实惠装【20支】白色\";}i:186011;a:1:{i:0;s:19:\"100ml/瓶【3瓶】\";}i:186012;a:1:{i:0;s:51:\"【此项勿拍！】请拍两双，一双不发货\";}i:186013;a:1:{i:0;s:25:\"36-37（建议35-36码）\";}i:186014;a:1:{i:0;s:25:\"38-39（建议37-38码）\";}i:186015;a:1:{i:0;s:25:\"40-41（建议39-40码）\";}i:186016;a:1:{i:0;s:17:\"3斤1.5L实惠装\";}i:186017;a:1:{i:0;s:37:\"咸蛋黄卷288g/箱+牛乳卷288/箱\";}i:186018;a:1:{i:0;s:25:\"1-3岁建议脚长11-13CM\";}i:186019;a:1:{i:0;s:25:\"3-5岁建议脚长13-15CM\";}i:186020;a:1:{i:0;s:25:\"6-8岁建议脚长16-18CM\";}i:186021;a:1:{i:0;s:26:\"8-12岁建议脚长18-22CM\";}i:186022;a:1:{i:0;s:24:\"两支特惠装3.5g+3.5g\";}i:186023;a:1:{i:0;s:9:\"儿童款\";}i:186024;a:1:{i:0;s:9:\"成人款\";}i:186025;a:1:{i:0;s:1:\"S\";}i:186026;a:1:{i:0;s:1:\"M\";}i:186027;a:1:{i:0;s:1:\"L\";}i:186028;a:1:{i:0;s:16:\"3双随机图案\";}i:186029;a:1:{i:0;s:10:\"3双透白\";}i:186030;a:1:{i:0;s:13:\"3双幸运鹿\";}i:186031;a:1:{i:0;s:13:\"3双幸运鸟\";}i:186032;a:1:{i:0;s:13:\"3双幸运吻\";}i:186033;a:1:{i:0;s:12:\"3双01字母\";}i:186034;a:1:{i:0;s:17:\"长55宽35高35cm\";}i:186035;a:1:{i:0;s:10:\"6000毫安\";}i:186036;a:1:{i:0;s:11:\"10000毫安\";}i:186037;a:1:{i:0;s:30:\"美规电源（国内通用）\";}i:186038;a:1:{i:0;s:12:\"三层黑色\";}i:186039;a:1:{i:0;s:12:\"三层玫红\";}i:186040;a:1:{i:0;s:12:\"四层黑色\";}i:186041;a:1:{i:0;s:12:\"四层玫红\";}i:186042;a:1:{i:0;s:12:\"五层黑色\";}i:186043;a:1:{i:0;s:12:\"五层玫红\";}i:186044;a:1:{i:0;s:28:\"黑色普通款（60cm宽）\";}i:186045;a:1:{i:0;s:29:\"白色普通款（110cm宽）\";}i:186046;a:1:{i:0;s:29:\"黑色普通款（110cm宽）\";}i:186047;a:1:{i:0;s:29:\"白色防风款（110cm宽）\";}i:186048;a:1:{i:0;s:29:\"黑色防风款（110cm宽）\";}i:186049;a:1:{i:0;s:35:\"白色普通单边树杈（110cm）\";}i:186050;a:1:{i:0;s:35:\"黑色普通单边树杈（110cm）\";}i:186051;a:1:{i:0;s:35:\"白色普通双边树杈（110cm）\";}i:186052;a:1:{i:0;s:35:\"黑色防风双边树杈（110cm）\";}i:186053;a:1:{i:0;s:23:\"白色双杆（110cm）\";}i:186054;a:1:{i:0;s:23:\"黑色双杆（110cm）\";}i:186055;a:1:{i:0;s:32:\"白色双层双树杈（110cm）\";}i:186056;a:1:{i:0;s:32:\"黑色双层双树杈（110cm）\";}i:186057;a:1:{i:0;s:24:\"暖足贴（2片）30组\";}i:186058;a:1:{i:0;s:20:\"益母草暖贴30个\";}i:186059;a:1:{i:0;s:17:\"艾草暖贴30个\";}i:186060;a:1:{i:0;s:20:\"增强型暖贴30个\";}i:186061;a:1:{i:0;s:24:\"暖足贴（2片）10组\";}i:186062;a:1:{i:0;s:20:\"增强型暖贴10个\";}i:186063;a:1:{i:0;s:17:\"艾草暖贴10个\";}i:186064;a:1:{i:0;s:20:\"益母草暖贴10个\";}i:186065;a:1:{i:0;s:4:\"5个\";}i:186066;a:1:{i:0;s:5:\"10个\";}i:186067;a:1:{i:0;s:20:\"10种果蔬250G*1袋\";}i:186068;a:1:{i:0;s:21:\"10种果蔬500G*1袋\t\";}i:186069;a:1:{i:0;s:14:\"北欧蓝20个\";}i:186070;a:1:{i:0;s:14:\"北欧粉20个\";}i:186071;a:1:{i:0;s:68:\"【四折小动物】+【四周发热】+【赠送护膝小盖毯】\";}i:186072;a:1:{i:0;s:68:\"【森系小动物】+【四周发热】+【赠送护膝小盖毯】\";}i:186073;a:1:{i:0;s:68:\"【田园小清新】+【四周发热】+【赠送护膝小盖毯】\";}i:186074;a:1:{i:0;s:68:\"【插画小树林】+【四周发热】+【赠送护膝小盖毯】\";}i:186075;a:1:{i:0;s:62:\"【简约灰】+【四周发热】+【赠送护膝小盖毯】\";}i:186076;a:1:{i:0;s:20:\"方形海绵擦20片\";}i:186077;a:1:{i:0;s:9:\"70g*10包\";}i:186078;a:1:{i:0;s:15:\"羽丝绒中枕\";}i:186079;a:1:{i:0;s:15:\"羽丝绒低枕\";}i:186080;a:1:{i:0;s:8:\"50g*2罐\";}i:186081;a:1:{i:0;s:27:\"2020新货特大颗粒/500g\";}i:186082;a:1:{i:0;s:24:\"2020新货大颗粒/500g\";}i:186083;a:1:{i:0;s:27:\"2020新货中等颗粒/500g\";}i:186084;a:1:{i:0;s:24:\"2020新货小颗粒/500g\";}i:186085;a:1:{i:0;s:17:\"50克(不加绒)\t\";}i:186086;a:1:{i:0;s:17:\"80克(不加绒)\t\";}i:186087;a:1:{i:0;s:24:\"100克锦纶(不加绒)\t\";}i:186088;a:1:{i:0;s:24:\"150克锦纶(龙爪绒)\t\";}i:186089;a:1:{i:0;s:21:\"200克(加绒加绒)\t\";}i:186090;a:1:{i:0;s:21:\"300克(加绒加厚)\t\";}i:186091;a:1:{i:0;s:21:\"500克(加绒特厚)\t\";}i:186092;a:1:{i:0;s:20:\"250克(加绒加厚)\";}i:186093;a:1:{i:0;s:20:\"350克(加绒加厚)\";}}","ctime":null,"utime":1607325250,"isdel":null,"commission":"0.00","recommend_goods_id":0,"want_goods_id":0,"buy_limit":0,"brand_name":null,"cat_name":"休闲零食","products":[{"id":9061,"goods_id":1433,"barcode":null,"sn":"P6073251753284","price":"26.00","costprice":"25.30","mktprice":"0.00","marketable":2,"stock":192,"freeze_stock":0,"spes_desc":"规格2: 1000g紫皮糖","is_defalut":1,"image_id":"","isdel":null,"name":"国产紫皮糖1000g巧克力涂层","buy_limit":0,"bn":"G6073251753212","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073250315fcdd5678eb90.jpg","total_stock":192,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格2":{" 1000g紫皮糖":{"name":" 1000g紫皮糖","is_default":true}}},"amount":"26.00","promotion_list":[],"promotion_amount":0}],"image_url":"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073250315fcdd5678eb90.jpg","default":{"id":9061,"goods_id":1433,"barcode":null,"sn":"P6073251753284","price":"26.00","costprice":"25.30","mktprice":"0.00","marketable":2,"stock":192,"freeze_stock":0,"spes_desc":"规格2: 1000g紫皮糖","is_defalut":1,"image_id":"","isdel":null,"name":"国产紫皮糖1000g巧克力涂层","buy_limit":0,"bn":"G6073251753212","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073250315fcdd5678eb90.jpg","total_stock":192,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格2":{" 1000g紫皮糖":{"name":" 1000g紫皮糖","is_default":true}}},"amount":"26.00","promotion_list":[],"promotion_amount":0},"product":{"id":9061,"goods_id":1433,"barcode":null,"sn":"P6073251753284","price":"26.00","costprice":"25.30","mktprice":"0.00","marketable":2,"stock":192,"spes_desc":"规格2: 1000g紫皮糖","is_defalut":1,"image_id":"","isdel":null,"name":"国产紫皮糖1000g巧克力涂层","buy_limit":0,"bn":"G6073251753212","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/07/16073250315fcdd5678eb90.jpg","total_stock":192,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格2":{" 1000g紫皮糖":{"name":" 1000g紫皮糖","is_default":true}}},"amount":"26.00","promotion_list":[],"promotion_amount":0},"album":["http://img.ywzyit.com/static/uploads/images/2020/12/07/16073250315fcdd5678eb90.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/07/16073250315fcdd5677e278.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/07/16073250315fcdd567981e2.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/07/16073250315fcdd56775146.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/07/16073250315fcdd567653a2.jpg"],"total_stock":192,"is_buy_num":8,"isfav":"false","can_buy":"ok","vip_price":26,"is_notice":0}]
         * total_page : 6
         * filter : []
         * page : 1
         * limit : 10
         * where : {"cat_id":"112"}
         * order :
         * class_name : 休闲零食
         */

        private int total_page;
        private int page;
        private int limit;
        private WhereBean where;
        private String order;
        private String class_name;
        private java.util.List<ListBean> list;
        @SerializedName("filter")
        @JsonAdapter(RawStringJsonAdapter.class)
        private String filter;

        public static class WhereBean {
            /**
             * cat_id : 112
             */

            private String cat_id;

            public String getCat_id() {
                return cat_id;
            }

            public void setCat_id(String cat_id) {
                this.cat_id = cat_id;
            }
        }

        public static class ListBean {
            public int getId() {
                return id;
            }

            public String getBn() {
                return bn;
            }

            public String getName() {
                return name;
            }

            public String getBrief() {
                return brief;
            }

            public String getPrice() {
                return price;
            }

            public String getCostprice() {
                return costprice;
            }

            public String getMktprice() {
                return mktprice;
            }

            public String getImage_id() {
                return image_id;
            }

            public int getGoods_cat_id() {
                return goods_cat_id;
            }

            public int getGoods_type_id() {
                return goods_type_id;
            }

            public int getBrand_id() {
                return brand_id;
            }

            public int getIs_nomal_virtual() {
                return is_nomal_virtual;
            }

            public int getMarketable() {
                return marketable;
            }

            public int getStock() {
                return stock;
            }

            public String getWeight() {
                return weight;
            }

            public String getUnit() {
                return unit;
            }

            public String getIntro() {
                return intro;
            }

            public String getSpes_desc() {
                return spes_desc;
            }

            public String getParams() {
                return params;
            }

            public String getService() {
                return service;
            }

            public int getComments_count() {
                return comments_count;
            }

            public int getView_count() {
                return view_count;
            }

            public int getBuy_count() {
                return buy_count;
            }

            public Object getXuni_num() {
                return xuni_num;
            }

            public Object getUptime() {
                return uptime;
            }

            public Object getDowntime() {
                return downtime;
            }

            public int getSort() {
                return sort;
            }

            public int getIs_recommend() {
                return is_recommend;
            }

            public int getIs_hot() {
                return is_hot;
            }

            public int getIs_tqm() {
                return is_tqm;
            }

            public int getSuccess_num() {
                return success_num;
            }

            public String getStart_time() {
                return start_time;
            }

            public String getEnd_time() {
                return end_time;
            }

            public String getNew_spec() {
                return new_spec;
            }

            public Object getCtime() {
                return ctime;
            }

            public int getUtime() {
                return utime;
            }

            public Object getIsdel() {
                return isdel;
            }

            public String getCommission() {
                return commission;
            }

            public int getRecommend_goods_id() {
                return recommend_goods_id;
            }

            public int getWant_goods_id() {
                return want_goods_id;
            }

            public int getBuy_limit() {
                return buy_limit;
            }

            public Object getBrand_name() {
                return brand_name;
            }

            public String getCat_name() {
                return cat_name;
            }

            public String getImage_url() {
                return image_url;
            }

            public DefaultBean getDefaultX() {
                return defaultX;
            }

            public ProductBean getProduct() {
                return product;
            }

            public int getTotal_stock() {
                return total_stock;
            }

            public int getIs_buy_num() {
                return is_buy_num;
            }

            public String getIsfav() {
                return isfav;
            }

            public String getCan_buy() {
                return can_buy;
            }

            public Double getVip_price() {
                return vip_price;
            }

            public int getIs_notice() {
                return is_notice;
            }

            public List<?> getLabel_ids() {
                return label_ids;
            }

            public List<ProductsBean> getProducts() {
                return products;
            }

            public List<String> getAlbum() {
                return album;
            }

            /**
             * id : 1541
             * bn : G6087109327893
             * name : 2斤小核肉厚桂圆500g*2 休闲零食农产品龙眼干
             * brief : 不免邮区域:海外,台湾,澳门,
             * 香港,西藏,新疆,宁夏,青海,内蒙古
             * price : 27.00
             * costprice : 25.80
             * mktprice : 0.00
             * image_id : 1672061b623bfe9f1915e8bb0a78f85b
             * goods_cat_id : 112
             * goods_type_id : 48
             * brand_id : 0
             * is_nomal_virtual : 1
             * marketable : 1
             * stock : 163
             * weight : 0.00
             * unit :
             * intro : <p style='overflow:hidden'><img style='max-width: 100%;float:left' src="http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109205fe2fb08f1245.jpg"/></p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src="http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb090831f.jpg"/></p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src="http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb09121a2.jpg"/></p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src="http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb0932bdb.jpg"/></p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src="http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb0940700.jpg"/></p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src="http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb094ab5b.jpg"/></p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src="http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb095da30.jpg"/></p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src="http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb096d31a.jpg"/></p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src="http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb09769e4.jpg"/></p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src="http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb098bfe8.jpg"/></p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src="http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb099b20b.jpg"/></p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src="http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb09a6703.jpg"/></p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src="http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb09b0fb0.jpg"/></p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src="http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb09be8a6.jpg"/></p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src="http://img.ywzyit.com/static/uploads/images/2020/12/23/16087109215fe2fb09c7b9e.jpg"/></p><p style='overflow:hidden'><img style='max-width: 100%;float:left' src="http://img.ywzyit.com/static/uploads/images/2020/12/23/16087082265fe2f082987b6.png" alt="16087082265fe2f082987b6.png"/></p>
             * spes_desc : {"规格":{"198969":"500g*2袋【共2斤】"}}
             * params :
             * service : 1,4,6,7
             * comments_count : 0
             * view_count : 0
             * buy_count : 27
             * xuni_num : null
             * uptime : null
             * downtime : null
             * sort : 0
             * is_recommend : 1
             * is_hot : 1
             * is_tqm : 1
             * success_num : 0
             * start_time : 1970-01-01 08:00
             * end_time : 1970-01-01 08:00
             * label_ids : []
             * new_spec : a:315:{i:198968;a:1:{i:0;s:17:"蓝色纸盒20朵";}i:198969;a:1:{i:0;s:22:"500g*2袋【共2斤】";}i:198970;a:1:{i:0;s:9:"经典黑";}i:198971;a:1:{i:0;s:23:"升级波浪款10片装";}i:198972;a:1:{i:0;s:42:"特大号带镜子三层，单双肩两用";}i:198973;a:1:{i:0;s:18:"迷你小号手提";}i:198974;a:1:{i:0;s:24:"小号三层，可单肩";}i:198975;a:1:{i:0;s:30:"中号三层，单双肩两用";}i:198976;a:1:{i:0;s:30:"大号三层，单双肩两用";}i:198977;a:1:{i:0;s:39:"大号带镜子三层，单双肩两用";}i:198978;a:1:{i:0;s:20:"大胆爱love3只装";}i:198979;a:1:{i:0;s:22:"大胆爱 LOVE10只装";}i:198980;a:1:{i:0;s:24:"杜蕾斯 活力12只装";}i:198981;a:1:{i:0;s:19:"超薄-隐 12只装";}i:198982;a:1:{i:0;s:23:"杜蕾斯 活力3只装";}i:198983;a:1:{i:0;s:18:"超薄-隐 3只装";}i:198984;a:1:{i:0;s:17:"长55宽35高35cm";}i:198985;a:1:{i:0;s:12:"熊掌粉色";}i:198986;a:1:{i:0;s:12:"熊掌灰色";}i:198987;a:1:{i:0;s:12:"熊掌棕色";}i:198988;a:1:{i:0;s:9:"萌小猪";}i:198989;a:1:{i:0;s:9:"灰龙猫";}i:198990;a:1:{i:0;s:9:"小浣熊";}i:198991;a:1:{i:0;s:19:"黑色-铅色五金";}i:198992;a:1:{i:0;s:19:"黑色-金色五金";}i:198993;a:1:{i:0;s:18:" 单开门56*120cm";}i:198994;a:1:{i:0;s:23:"侧开门冰箱56*120cm";}i:198995;a:1:{i:0;s:23:"双开门冰箱70*170cm";}i:198996;a:1:{i:0;s:6:"红色";}i:198997;a:1:{i:0;s:6:"杏色";}i:198998;a:1:{i:0;s:27:"【标准22管径】53-80cm";}i:198999;a:1:{i:0;s:29:"【标准22管径】70-120cm ";}i:199000;a:1:{i:0;s:29:"【标准22管径】90-160cm ";}i:199001;a:1:{i:0;s:30:"【标准22管径】110-200cm ";}i:199002;a:1:{i:0;s:30:"【标准22管径】128-240cm ";}i:199003;a:1:{i:0;s:30:"【标准22管径】150-280cm ";}i:199004;a:1:{i:0;s:27:"【标准25管径】50-80cm";}i:199005;a:1:{i:0;s:29:"【标准25管径】70-120cm ";}i:199006;a:1:{i:0;s:29:"【标准25管径】90-160cm ";}i:199007;a:1:{i:0;s:30:"【标准25管径】110-200cm ";}i:199008;a:1:{i:0;s:30:"【标准25管径】128-240cm ";}i:199009;a:1:{i:0;s:30:"【标准25管径】150-280cm ";}i:199010;a:1:{i:0;s:14:"1手柄3卷纸";}i:199011;a:1:{i:0;s:12:"金色小熊";}i:199012;a:1:{i:0;s:15:"玫瑰金小熊";}i:199013;a:1:{i:0;s:12:"玫粉小熊";}i:199014;a:1:{i:0;s:12:"银色小熊";}i:199015;a:1:{i:0;s:12:"橘色小熊";}i:199016;a:1:{i:0;s:12:"蓝色佩奇";}i:199017;a:1:{i:0;s:12:"粉色佩奇";}i:199018;a:1:{i:0;s:13:"黄色表情1";}i:199019;a:1:{i:0;s:13:"黄色表情3";}i:199020;a:1:{i:0;s:6:"黄鸭";}i:199021;a:1:{i:0;s:6:"蓝鸭";}i:199022;a:1:{i:0;s:6:"粉鸭";}i:199023;a:1:{i:0;s:15:"小雏菊黑色";}i:199024;a:1:{i:0;s:15:"小雏菊粉色";}i:199025;a:1:{i:0;s:15:"小雏菊橙色";}i:199026;a:1:{i:0;s:15:"新款蓝色熊";}i:199027;a:1:{i:0;s:15:"新款黄色熊";}i:199028;a:1:{i:0;s:15:"粉色小兔子";}i:199029;a:1:{i:0;s:15:"紫色小兔子";}i:199030;a:1:{i:0;s:18:"玫红色小兔子";}i:199031;a:1:{i:0;s:12:"红色雏菊";}i:199032;a:1:{i:0;s:12:"红色鸭子";}i:199033;a:1:{i:0;s:12:"网红黑色";}i:199034;a:1:{i:0;s:12:"网红红色";}i:199035;a:1:{i:0;s:12:"网红粉色";}i:199036;a:1:{i:0;s:15:"网红玫红色";}i:199037;a:1:{i:0;s:15:"纸盒人红色";}i:199038;a:1:{i:0;s:15:"纸盒人白色";}i:199039;a:1:{i:0;s:15:"纸盒人绿色";}i:199040;a:1:{i:0;s:15:"纸盒人橘色";}i:199041;a:1:{i:0;s:15:"纸盒人黑色";}i:199042;a:1:{i:0;s:24:"歪头鸭鸭姜黄单肩";}i:199043;a:1:{i:0;s:21:"空心兔米白单肩";}i:199044;a:1:{i:0;s:31:"wink鸭鸭米白可调节斜跨";}i:199045;a:1:{i:0;s:22:"wink鸭鸭米白单肩";}i:199046;a:1:{i:0;s:36:"大眼睛鸭鸭米白可调节斜跨";}i:199047;a:1:{i:0;s:27:"大眼睛鸭鸭米白单肩";}i:199048;a:1:{i:0;s:30:"大眼睛鸭鸭米白小手提";}i:199049;a:1:{i:0;s:27:"歪头鸭鸭绿色小手提";}i:199050;a:1:{i:0;s:27:"歪头鸭鸭粉色小手提";}i:199051;a:1:{i:0;s:27:"歪头鸭鸭藏青小手提";}i:199052;a:1:{i:0;s:24:"歪头鸭鸭黄小手提";}i:199053;a:1:{i:0;s:27:"歪头鸭鸭米白小手提";}i:199054;a:1:{i:0;s:24:"空心兔米白小手提";}i:199055;a:1:{i:0;s:25:"wink鸭鸭米白小手提";}i:199056;a:1:{i:0;s:7:"200ml*3";}i:199057;a:1:{i:0;s:26:"1000ML营养柔顺(黄色)";}i:199058;a:1:{i:0;s:30:"1000ML多效修护（粉色）";}i:199059;a:1:{i:0;s:30:"1000ML焗油顺滑（蓝色）";}i:199060;a:1:{i:0;s:30:"1000ML去屑柔顺（橙色）";}i:199061;a:1:{i:0;s:5:"50g*4";}i:199062;a:1:{i:0;s:17:" 700g深润去屑";}i:199063;a:1:{i:0;s:16:"700g柔顺亮泽";}i:199064;a:1:{i:0;s:16:"700g柔韧丝滑";}i:199065;a:1:{i:0;s:33:"北美留兰120g+竹炭薄荷120g";}i:199066;a:1:{i:0;s:33:"竹炭薄荷120g+茉莉白茶120g";}i:199067;a:1:{i:0;s:33:"北美留兰120g+茉莉白茶120g";}i:199068;a:1:{i:0;s:18:"北美留兰120g*2";}i:199069;a:1:{i:0;s:18:"竹炭薄荷120g*2";}i:199070;a:1:{i:0;s:18:"茉莉白茶120g*2";}i:199071;a:1:{i:0;s:6:"粉色";}i:199072;a:1:{i:0;s:6:"蓝色";}i:199073;a:1:{i:0;s:6:"灰色";}i:199074;a:1:{i:0;s:8:"白色  ";}i:199075;a:1:{i:0;s:8:"红色  ";}i:199076;a:1:{i:0;s:8:"黑色  ";}i:199077;a:1:{i:0;s:11:"豆粉色  ";}i:199078;a:1:{i:0;s:14:"深卡其色  ";}i:199079;a:1:{i:0;s:8:"咖色  ";}i:199080;a:1:{i:0;s:8:"杏色  ";}i:199081;a:1:{i:0;s:14:"20条双层款";}i:199082;a:1:{i:0;s:21:"3斤装中果/约5个";}i:199083;a:1:{i:0;s:23:"5斤装中果/约8-9个";}i:199084;a:1:{i:0;s:23:"5斤装大果/约3-7个";}i:199085;a:1:{i:0;s:24:"6斤装中果/约9-10个";}i:199086;a:1:{i:0;s:23:"6斤装大果/约4-8个";}i:199087;a:1:{i:0;s:25:"5斤装小果/约11-12个";}i:199088;a:1:{i:0;s:22:"8斤装小果/约18个";}i:199089;a:1:{i:0;s:22:"8斤装中果/约14个";}i:199090;a:1:{i:0;s:22:"8斤装大果/约10个";}i:199091;a:1:{i:0;s:11:"12粒/盒*2";}i:199092;a:1:{i:0;s:60:"默认黑色挂篮【需要白色，蓝色请自行备注】";}i:199093;a:1:{i:0;s:67:"默认黑色挂篮+挂钩【需要白色，蓝色请自行备注】";}i:199094;a:1:{i:0;s:7:"粉色 ";}i:199095;a:1:{i:0;s:7:"米色 ";}i:199096;a:1:{i:0;s:7:"浅蓝 ";}i:199097;a:1:{i:0;s:7:"深蓝 ";}i:199098;a:1:{i:0;s:48:"共14只【10母蟹3两/只，4公蟹4两/只】";}i:199099;a:1:{i:0;s:12:" 70克100张";}i:199100;a:1:{i:0;s:11:"80克100张";}i:199101;a:1:{i:0;s:9:"100g*4块";}i:199102;a:1:{i:0;s:7:"白色 ";}i:199103;a:1:{i:0;s:7:"黑色 ";}i:199104;a:1:{i:0;s:18:"金属黑无声版";}i:199105;a:1:{i:0;s:18:"星辰黑无声版";}i:199106;a:1:{i:0;s:9:"酒红色";}i:199107;a:1:{i:0;s:9:"浅灰色";}i:199108;a:1:{i:0;s:6:"黑色";}i:199109;a:1:{i:0;s:9:"粉红色";}i:199110;a:1:{i:0;s:35:"KS-739定焦手电筒+USB线+彩盒";}i:199111;a:1:{i:0;s:35:"金色（6味6饼）明月照我还";}i:199112;a:1:{i:0;s:35:"红色（6味6饼）月上柳梢头";}i:199113;a:1:{i:0;s:44:"蓝色（6味6饼）但愿人长久	19.89元";}i:199114;a:1:{i:0;s:14:"白色2L容量";}i:199115;a:1:{i:0;s:39:"银色1L(含)-2L(含)高硼硅玻璃壶";}i:199116;a:1:{i:0;s:22:"洋甘菊味-10片/盒";}i:199117;a:1:{i:0;s:22:"薰衣草味-10片/盒";}i:199118;a:1:{i:0;s:19:"玫瑰味-10片/盒";}i:199119;a:1:{i:0;s:16:"无香-10片/盒";}i:199120;a:1:{i:0;s:32:"酱香味500g【18袋约54颗】";}i:199121;a:1:{i:0;s:18:"麻辣味290g*2盒";}i:199122;a:1:{i:0;s:55:"默认01肤白色【02粉白色，请自行备注！】";}i:199123;a:1:{i:0;s:16:"原味360ml*6瓶";}i:199124;a:1:{i:0;s:19:"蜜桃味360ml*6瓶";}i:199125;a:1:{i:0;s:19:"柠檬味360ml*6瓶";}i:199126;a:1:{i:0;s:17:"原味360ml*24瓶";}i:199127;a:1:{i:0;s:20:"蜜桃味360ml*24瓶";}i:199128;a:1:{i:0;s:20:"柠檬味360ml*24瓶";}i:199129;a:1:{i:0;s:9:"100g*2袋";}i:199130;a:1:{i:0;s:118:"默认【氺寇晚香玉.深层补水一盒】【国色牡丹亮肤，惠心兰花提拉紧致，请自行备注！】";}i:199131;a:1:{i:0;s:30:"食品级PP碗-带叉勺吸盘";}i:199132;a:1:{i:0;s:9:"1盒20只";}i:199133;a:1:{i:0;s:40:"百鸟朝凤系列（广式6饼6味)300g";}i:199134;a:1:{i:0;s:11:"30包/袋*2";}i:199135;a:1:{i:0;s:64:"2套刀叉勺三件套（颜色有蓝、黑、粉、绿可选）";}i:199136;a:1:{i:0;s:19:"榴莲饼252g小盒";}i:199137;a:1:{i:0;s:19:"榴莲饼500g大盒";}i:199138;a:1:{i:0;s:25:"灰枣夹核桃500g一箱";}i:199139;a:1:{i:0;s:25:"骏枣夹核桃500g一箱";}i:199140;a:1:{i:0;s:32:"实惠款礼盒（8包装864g）";}i:199141;a:1:{i:0;s:34:"实力款礼盒（10包装1080g）";}i:199142;a:1:{i:0;s:34:"豪华款礼盒（12包装1306g）";}i:199143;a:1:{i:0;s:34:"尊享款礼盒（14包装1522g）";}i:199144;a:1:{i:0;s:28:"零食礼盒54包【1076g】";}i:199145;a:1:{i:0;s:14:"100条共1600g";}i:199146;a:1:{i:0;s:11:"310mL*12瓶";}i:199147;a:1:{i:0;s:11:"100ml*20瓶";}i:199148;a:1:{i:0;s:27:"500g/10包20片黑麦面包";}i:199149;a:1:{i:0;s:28:"1000g/20包40片黑麦面包";}i:199150;a:1:{i:0;s:27:"500g/10包20片谷物面包";}i:199151;a:1:{i:0;s:28:"1000g/20包40片谷物面包";}i:199152;a:1:{i:0;s:23:"4枚220g【红豆味】";}i:199153;a:1:{i:0;s:23:"4枚220g【紫薯味】";}i:199154;a:1:{i:0;s:23:"4枚220g【莲蓉味】";}i:199155;a:1:{i:0;s:23:"6枚330g【红豆味】";}i:199156;a:1:{i:0;s:23:"6枚330g【紫薯味】";}i:199157;a:1:{i:0;s:23:"6枚330g【莲蓉味】";}i:199158;a:1:{i:0;s:23:"6枚330g【混合装】";}i:199159;a:1:{i:0;s:23:"8枚440g【紫薯味】";}i:199160;a:1:{i:0;s:23:"8枚440g【红豆味】";}i:199161;a:1:{i:0;s:23:"8枚440g【莲蓉味】";}i:199162;a:1:{i:0;s:23:"8枚440g【混合装】";}i:199163;a:1:{i:0;s:25:"12枚660g 【紫薯味】";}i:199164;a:1:{i:0;s:25:"12枚660g 【红豆味】";}i:199165;a:1:{i:0;s:25:"12枚660g 【莲蓉味】";}i:199166;a:1:{i:0;s:25:"12枚660g 【混合装】";}i:199167;a:1:{i:0;s:9:"210g*2袋";}i:199168;a:1:{i:0;s:21:"很麻很辣26g*30包";}i:199169;a:1:{i:0;s:20:"散称-香辣味500g";}i:199170;a:1:{i:0;s:20:"散称-麻辣味500g";}i:199171;a:1:{i:0;s:20:"散称-酸辣味500g";}i:199172;a:1:{i:0;s:16:"混合口味500g";}i:199173;a:1:{i:0;s:23:"散称-风吃海带500g";}i:199174;a:1:{i:0;s:33:"明星版嗨吃家酸辣粉143g*6";}i:199175;a:1:{i:0;s:21:"椒麻锅巴粉113g*6";}i:199176;a:1:{i:0;s:15:"花甲粉145g*6";}i:199177;a:1:{i:0;s:27:"跳跳鱼丸酸辣粉165g*6";}i:199178;a:1:{i:0;s:9:"320g*5袋";}i:199179;a:1:{i:0;s:9:"320g*2袋";}i:199180;a:1:{i:0;s:9:"150*200cm";}i:199181;a:1:{i:0;s:9:"180*220cm";}i:199182;a:1:{i:0;s:9:"200*230cm";}i:199183;a:1:{i:0;s:9:"220*230cm";}i:199184;a:1:{i:0;s:15:"万能032蓝色";}i:199185;a:1:{i:0;s:15:"万能032绿色";}i:199186;a:1:{i:0;s:15:"万能032粉色";}i:199187;a:1:{i:0;s:15:"万能036蓝色";}i:199188;a:1:{i:0;s:15:"万能036绿色";}i:199189;a:1:{i:0;s:15:"万能036粉色";}i:199190;a:1:{i:0;s:15:"万能039蓝色";}i:199191;a:1:{i:0;s:15:"万能039绿色";}i:199192;a:1:{i:0;s:15:"万能039粉色";}i:199193;a:1:{i:0;s:23:" 皇家古龙黑色50ML";}i:199194;a:1:{i:0;s:22:"皇家古龙白色50ML";}i:199195;a:1:{i:0;s:22:"皇家古龙蓝色50ML";}i:199196;a:1:{i:0;s:22:"皇家古龙黄色50ML";}i:199197;a:1:{i:0;s:5:"30包";}i:199198;a:1:{i:0;s:5:"72包";}i:199199;a:1:{i:0;s:11:"整提42卷";}i:199200;a:1:{i:0;s:5:"10包";}i:199201;a:1:{i:0;s:5:"40包";}i:199202;a:1:{i:0;s:17:"紫色纸盒20朵";}i:199203;a:1:{i:0;s:14:"瓜片1级1号";}i:199204;a:1:{i:0;s:14:"瓜片1级2号";}i:199205;a:1:{i:0;s:10:"瓜片2级";}i:199206;a:1:{i:0;s:10:"瓜片3级";}i:199207;a:1:{i:0;s:43:"小动物四维发热+赠送护膝小盖毯";}i:199208;a:1:{i:0;s:49:"森系小动物四维发热+赠送护膝小盖毯";}i:199209;a:1:{i:0;s:49:"田园小清新四维发热+赠送护膝小盖毯";}i:199210;a:1:{i:0;s:49:"插画小树林四维发热+赠送护膝小盖毯";}i:199211;a:1:{i:0;s:30:"白色烘干款（普通款）";}i:199212;a:1:{i:0;s:30:"粉色烘干款（普通款）";}i:199213;a:1:{i:0;s:39:"粉色杀菌烘干款（带紫外线）";}i:199214;a:1:{i:0;s:39:"白色杀菌烘干款（带紫外线）";}i:199215;a:1:{i:0;s:12:"两口之家";}i:199216;a:1:{i:0;s:12:"三口之家";}i:199217;a:1:{i:0;s:12:"四口之家";}i:199218;a:1:{i:0;s:18:"家用装7+1件套";}i:199219;a:1:{i:0;s:16:"中手卷40*60cm";}i:199220;a:1:{i:0;s:13:"小号45*70cm";}i:199221;a:1:{i:0;s:13:"中号56*80cm";}i:199222;a:1:{i:0;s:17:"特大号80*100cm";}i:199223;a:1:{i:0;s:22:"中号立体50*70*30cm";}i:199224;a:1:{i:0;s:26:"特大号立体80*100*38cm";}i:199225;a:1:{i:0;s:6:"运费";}i:199226;a:1:{i:0;s:4:"2支";}i:199227;a:1:{i:0;s:4:"3支";}i:199228;a:1:{i:0;s:26:"樱桃50*70cm*4个+1手泵";}i:199229;a:1:{i:0;s:26:"樱桃60*80cm*4个+1手泵";}i:199230;a:1:{i:0;s:26:"樱桃70*90cm*4个+1手泵";}i:199231;a:1:{i:0;s:27:"樱桃80*100cm*4个+1手泵";}i:199232;a:1:{i:0;s:27:"樱桃90*110cm*4个+1手泵";}i:199233;a:1:{i:0;s:28:"樱桃100*120cm*4个+1手泵";}i:199234;a:1:{i:0;s:39:"（樱桃）3大3中2小2手卷1手泵	";}i:199235;a:1:{i:0;s:30:"（樱桃）4特大4中1手泵";}i:199236;a:1:{i:0;s:45:"（樱桃）3特大2大3中2小1电泵1手泵";}i:199237;a:1:{i:0;s:33:"（樱桃）6特大1电泵1手泵";}i:199238;a:1:{i:0;s:27:"（樱桃）5中5小1手泵";}i:199239;a:1:{i:0;s:34:"（樱桃）2特大3中3小1手泵";}i:199240;a:1:{i:0;s:31:"（樱桃）1大2中2小1手泵";}i:199241;a:1:{i:0;s:38:"（樱桃）1特大1大1中2小1电泵";}i:199242;a:1:{i:0;s:31:"（樱桃）2大2中2小1手泵";}i:199243;a:1:{i:0;s:38:"（樱桃）2大2中2小2手卷1手泵";}i:199244;a:1:{i:0;s:52:"（樱桃）2特大2大2中2小2特小1手泵1电泵";}i:199245;a:1:{i:0;s:41:"（樱桃）2特大2中3小3手卷1手泵";}i:199246;a:1:{i:0;s:48:"（樱桃）2特大3大3小3手卷1手泵1电泵";}i:199247;a:1:{i:0;s:31:"（樱桃）3大2中3小1手泵";}i:199248;a:1:{i:0;s:27:"（樱桃）4大4中1手泵";}i:199249;a:1:{i:0;s:34:"（樱桃）4特大2中2小1手泵";}i:199250;a:1:{i:0;s:26:"（樱桃）5特大1手泵";}i:199251;a:1:{i:0;s:23:"（樱桃）6大1手泵";}i:199252;a:1:{i:0;s:23:"（樱桃）7中1手泵";}i:199253;a:1:{i:0;s:23:"（樱桃）8小1手泵";}i:199254;a:1:{i:0;s:34:"（樱桃）3特大2中2小1手泵";}i:199255;a:1:{i:0;s:41:"（樱桃）3特大2中3小2手卷1手泵";}i:199256;a:1:{i:0;s:34:"（樱桃）4特大2中4小1手泵";}i:199257;a:1:{i:0;s:41:"（樱桃）2特大3中3小2手卷1手泵";}i:199258;a:1:{i:0;s:9:"经典装";}i:199259;a:1:{i:0;s:18:"升级装带支架";}i:199260;a:1:{i:0;s:25:"双面双效（1包蓝）";}i:199261;a:1:{i:0;s:25:"双面超柔（1包橙）";}i:199262;a:1:{i:0;s:25:"双面双效（2包蓝）";}i:199263;a:1:{i:0;s:25:"双面超柔（2包橙）";}i:199264;a:1:{i:0;s:30:"组合装（1包蓝+1包橙）";}i:199265;a:1:{i:0;s:25:"双面双效（3包蓝）";}i:199266;a:1:{i:0;s:25:"双面超柔（3包橙）";}i:199267;a:1:{i:0;s:6:"100粒";}i:199268;a:1:{i:0;s:4:"1盒";}i:199269;a:1:{i:0;s:4:"2盒";}i:199270;a:1:{i:0;s:4:"3盒";}i:199271;a:1:{i:0;s:7:"1000片";}i:199272;a:1:{i:0;s:16:"美妆蛋4枚装";}i:199273;a:1:{i:0;s:7:"1个头";}i:199274;a:1:{i:0;s:7:"2个头";}i:199275;a:1:{i:0;s:7:"3个头";}i:199276;a:1:{i:0;s:7:"4个头";}i:199277;a:1:{i:0;s:7:"5个头";}i:199278;a:1:{i:0;s:7:"6个头";}i:199279;a:1:{i:0;s:10:"带1块布";}i:199280;a:1:{i:0;s:10:"带3块布";}i:199281;a:1:{i:0;s:10:"带7块布";}i:199282;a:1:{i:0;s:30:"美规电源（国内通用）";}}
             * ctime : null
             * utime : 1608711047
             * isdel : null
             * commission : 0.00
             * recommend_goods_id : 0
             * want_goods_id : 0
             * buy_limit : 0
             * brand_name : null
             * cat_name : 休闲零食
             * products : [{"id":9932,"goods_id":1541,"barcode":null,"sn":"P6087109327973","price":"27.00","costprice":"25.80","mktprice":"0.00","marketable":1,"stock":163,"freeze_stock":0,"spes_desc":"规格:500g*2袋【共2斤】","is_defalut":1,"image_id":"","isdel":null,"name":"2斤小核肉厚桂圆500g*2 休闲零食农产品龙眼干","buy_limit":0,"bn":"G6087109327893","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4da47b.jpg","total_stock":163,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"500g*2袋【共2斤】":{"name":"500g*2袋【共2斤】","is_default":true}}},"amount":"27.00","promotion_list":[],"promotion_amount":0}]
             * image_url : http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4da47b.jpg
             * default : {"id":9932,"goods_id":1541,"barcode":null,"sn":"P6087109327973","price":"27.00","costprice":"25.80","mktprice":"0.00","marketable":1,"stock":163,"freeze_stock":0,"spes_desc":"规格:500g*2袋【共2斤】","is_defalut":1,"image_id":"","isdel":null,"name":"2斤小核肉厚桂圆500g*2 休闲零食农产品龙眼干","buy_limit":0,"bn":"G6087109327893","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4da47b.jpg","total_stock":163,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"500g*2袋【共2斤】":{"name":"500g*2袋【共2斤】","is_default":true}}},"amount":"27.00","promotion_list":[],"promotion_amount":0}
             * product : {"id":9932,"goods_id":1541,"barcode":null,"sn":"P6087109327973","price":"27.00","costprice":"25.80","mktprice":"0.00","marketable":1,"stock":163,"spes_desc":"规格:500g*2袋【共2斤】","is_defalut":1,"image_id":"","isdel":null,"name":"2斤小核肉厚桂圆500g*2 休闲零食农产品龙眼干","buy_limit":0,"bn":"G6087109327893","image_path":"http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4da47b.jpg","total_stock":163,"grade_price":[],"grade_info":[],"default_spes_desc":{"规格":{"500g*2袋【共2斤】":{"name":"500g*2袋【共2斤】","is_default":true}}},"amount":"27.00","promotion_list":[],"promotion_amount":0}
             * album : ["http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4da47b.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4c7154.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4bbbcf.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4d14b7.jpg","http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4af414.jpg"]
             * total_stock : 163
             * is_buy_num : 27
             * isfav : false
             * can_buy : ok
             * vip_price : 27
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
            @SerializedName("spes_desc")
            @JsonAdapter(RawStringJsonAdapter.class)
            private String spes_desc;
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
            @com.google.gson.annotations.SerializedName("default")
            private DefaultBean defaultX;
            private ProductBean product;
            private int total_stock;
            private int is_buy_num;
            private String isfav;
            private String can_buy;
            private Double vip_price;
            private int is_notice;
            private java.util.List<?> label_ids;
            private java.util.List<ProductsBean> products;
            private java.util.List<String> album;

            public static class ProductsBean {

                /**
                 * id : 9793
                 * goods_id : 1518
                 * barcode : null
                 * sn : P6083494744245
                 * price : 12.50
                 * costprice : 11.85
                 * mktprice : 0.00
                 * marketable : 2
                 * stock : 185
                 * freeze_stock : 0
                 * spes_desc : 口味:黑芝麻味270g
                 * is_defalut : 1
                 * image_id :
                 * isdel : null
                 * name : 鸡蛋酥270g传统老式奶香味黑芝麻味鸡蛋卷手工老蛋卷
                 * buy_limit : 0
                 * bn : G6083494744183
                 * image_path : http://img.ywzyit.com/static/uploads/images/2020/12/19/16083493425fdd769e64b22.jpg
                 * total_stock : 185
                 * grade_price : []
                 * grade_info : []
                 * default_spes_desc : {"口味":{"黑芝麻味270g":{"name":"黑芝麻味270g","is_default":true},"奶香味270g":{"name":"奶香味270g","product_id":9794}}}
                 * amount : 12.50
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
                     * 口味 : {"黑芝麻味270g":{"name":"黑芝麻味270g","is_default":true},"奶香味270g":{"name":"奶香味270g","product_id":9794}}
                     */

                    private 口味Bean 口味;

                    public 口味Bean get口味() {
                        return 口味;
                    }

                    public void set口味(口味Bean 口味) {
                        this.口味 = 口味;
                    }

                    public static class 口味Bean {
                        /**
                         * 黑芝麻味270g : {"name":"黑芝麻味270g","is_default":true}
                         * 奶香味270g : {"name":"奶香味270g","product_id":9794}
                         */

                        private 黑芝麻味270gBean 黑芝麻味270g;
                        private 奶香味270gBean 奶香味270g;

                        public 黑芝麻味270gBean get黑芝麻味270g() {
                            return 黑芝麻味270g;
                        }

                        public void set黑芝麻味270g(黑芝麻味270gBean 黑芝麻味270g) {
                            this.黑芝麻味270g = 黑芝麻味270g;
                        }

                        public 奶香味270gBean get奶香味270g() {
                            return 奶香味270g;
                        }

                        public void set奶香味270g(奶香味270gBean 奶香味270g) {
                            this.奶香味270g = 奶香味270g;
                        }

                        public static class 黑芝麻味270gBean {
                            /**
                             * name : 黑芝麻味270g
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

                        public static class 奶香味270gBean {
                            /**
                             * name : 奶香味270g
                             * product_id : 9794
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

            public static class SpesDescBean {
                /**
                 * 规格 : {"198969":"500g*2袋【共2斤】"}
                 */

                private 规格Bean 规格;

                public 规格Bean get规格() {
                    return 规格;
                }

                public void set规格(规格Bean 规格) {
                    this.规格 = 规格;
                }

                public static class 规格Bean {
                    /**
                     * 198969 : 500g*2袋【共2斤】
                     */

                    @com.google.gson.annotations.SerializedName("198969")
                    private String _$198969;

                    public String get_$198969() {
                        return _$198969;
                    }

                    public void set_$198969(String _$198969) {
                        this._$198969 = _$198969;
                    }
                }
            }

            public static class DefaultBean {

                public int getId() {
                    return id;
                }

                public int getGoods_id() {
                    return goods_id;
                }

                public Object getBarcode() {
                    return barcode;
                }

                public String getSn() {
                    return sn;
                }

                public String getPrice() {
                    return price;
                }

                public String getCostprice() {
                    return costprice;
                }

                public String getMktprice() {
                    return mktprice;
                }

                public int getMarketable() {
                    return marketable;
                }

                public int getStock() {
                    return stock;
                }

                public int getFreeze_stock() {
                    return freeze_stock;
                }

                public String getSpes_desc() {
                    return spes_desc;
                }

                public int getIs_defalut() {
                    return is_defalut;
                }

                public String getImage_id() {
                    return image_id;
                }

                public Object getIsdel() {
                    return isdel;
                }

                public String getName() {
                    return name;
                }

                public int getBuy_limit() {
                    return buy_limit;
                }

                public String getBn() {
                    return bn;
                }

                public String getImage_path() {
                    return image_path;
                }

                public int getTotal_stock() {
                    return total_stock;
                }

                public DefaultSpesDescBean getDefault_spes_desc() {
                    return default_spes_desc;
                }

                public String getAmount() {
                    return amount;
                }

                public int getPromotion_amount() {
                    return promotion_amount;
                }

                public List<?> getGrade_price() {
                    return grade_price;
                }

                public List<?> getGrade_info() {
                    return grade_info;
                }

                public List<?> getPromotion_list() {
                    return promotion_list;
                }

                /**
                 * id : 9932
                 * goods_id : 1541
                 * barcode : null
                 * sn : P6087109327973
                 * price : 27.00
                 * costprice : 25.80
                 * mktprice : 0.00
                 * marketable : 1
                 * stock : 163
                 * freeze_stock : 0
                 * spes_desc : 规格:500g*2袋【共2斤】
                 * is_defalut : 1
                 * image_id :
                 * isdel : null
                 * name : 2斤小核肉厚桂圆500g*2 休闲零食农产品龙眼干
                 * buy_limit : 0
                 * bn : G6087109327893
                 * image_path : http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4da47b.jpg
                 * total_stock : 163
                 * grade_price : []
                 * grade_info : []
                 * default_spes_desc : {"规格":{"500g*2袋【共2斤】":{"name":"500g*2袋【共2斤】","is_default":true}}}
                 * amount : 27.00
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
                private java.util.List<?> grade_price;
                private java.util.List<?> grade_info;
                private java.util.List<?> promotion_list;

                public static class DefaultSpesDescBean {

                    /**
                     * 规格 : {"500g*2袋【共2斤】":{"name":"500g*2袋【共2斤】","is_default":true}}
                     */

                    private 规格Bean 规格;

                    // FIXME generate failure  field _$_500g22116
                    public static class 规格Bean {
                        public static class _$500g {
                            /**
                             * name : 500g*2袋【共2斤】
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

                public int getId() {
                    return id;
                }

                public int getGoods_id() {
                    return goods_id;
                }

                public Object getBarcode() {
                    return barcode;
                }

                public String getSn() {
                    return sn;
                }

                public String getPrice() {
                    return price;
                }

                public String getCostprice() {
                    return costprice;
                }

                public String getMktprice() {
                    return mktprice;
                }

                public int getMarketable() {
                    return marketable;
                }

                public int getStock() {
                    return stock;
                }

                public String getSpes_desc() {
                    return spes_desc;
                }

                public int getIs_defalut() {
                    return is_defalut;
                }

                public String getImage_id() {
                    return image_id;
                }

                public Object getIsdel() {
                    return isdel;
                }

                public String getName() {
                    return name;
                }

                public int getBuy_limit() {
                    return buy_limit;
                }

                public String getBn() {
                    return bn;
                }

                public String getImage_path() {
                    return image_path;
                }

                public int getTotal_stock() {
                    return total_stock;
                }

                public DefaultSpesDescBean getDefault_spes_desc() {
                    return default_spes_desc;
                }

                public String getAmount() {
                    return amount;
                }

                public int getPromotion_amount() {
                    return promotion_amount;
                }

                public List<?> getGrade_price() {
                    return grade_price;
                }

                public List<?> getGrade_info() {
                    return grade_info;
                }

                public List<?> getPromotion_list() {
                    return promotion_list;
                }

                /**
                 * id : 9932
                 * goods_id : 1541
                 * barcode : null
                 * sn : P6087109327973
                 * price : 27.00
                 * costprice : 25.80
                 * mktprice : 0.00
                 * marketable : 1
                 * stock : 163
                 * spes_desc : 规格:500g*2袋【共2斤】
                 * is_defalut : 1
                 * image_id :
                 * isdel : null
                 * name : 2斤小核肉厚桂圆500g*2 休闲零食农产品龙眼干
                 * buy_limit : 0
                 * bn : G6087109327893
                 * image_path : http://img.ywzyit.com/static/uploads/images/2020/12/23/16087108525fe2fac4da47b.jpg
                 * total_stock : 163
                 * grade_price : []
                 * grade_info : []
                 * default_spes_desc : {"规格":{"500g*2袋【共2斤】":{"name":"500g*2袋【共2斤】","is_default":true}}}
                 * amount : 27.00
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
                private DefaultSpesDescBean default_spes_desc;
                private String amount;
                private int promotion_amount;
                private java.util.List<?> grade_price;
                private java.util.List<?> grade_info;
                private java.util.List<?> promotion_list;

                public static class DefaultSpesDescBean {

                    /**
                     * 规格 : {"500g*2袋【共2斤】":{"name":"500g*2袋【共2斤】","is_default":true}}
                     */

                    private 规格Bean 规格;

                    // FIXME generate failure  field _$_500g22264
                    public static class 规格Bean {
                        public static class _$500g {
                            /**
                             * name : 500g*2袋【共2斤】
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
                 * brand_id : 11
                 * name : 贝览得
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
                 * goods_cat_id : 2
                 * name : 外套
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

    }
}
