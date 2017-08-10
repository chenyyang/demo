package com.chenyang.controller; /**
 * Created by chenyang on 2017/5/21.
 */

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @RequestMapping(value = "/user/add",method = RequestMethod.POST)
    public @ResponseBody String test(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        return "name:"+name+" , age="+age;
    }

    public static void main(String args[]){
        /*
        $param = array(
            "version" => 1,
            "componentName" => "MC",
            "eventId"=> 1103941038,
            "interface" => array (
                "interfaceName" => "logical.messagecenter.insertMsg",
                "para" => array(
                    "user" => "financial",
                    "pass" => "H8817TRhs9sai732hFEU",
                    "params" => $params
                )
            )
        );

         */
        String a="{\"uin\":583084570,\"themeId\":108,\"titleTpl\":[],\"contentTpl\":[\"2017-07-28 16:10:02\",1.17,\"583084570\",\"2017\\u5e7407\\u670828\\u65e5\",\"\\u60a8\\u6240\\u6709\\u6309\\u91cf\\u4ed8\\u8d39\\u4e91\\u4e3b\\u673a\\u5c06\\u57282017-07-28 16:10:02\\u505c\\u6b62\\u670d\\u52a1\\uff0c2017-07-29 16:10:02 \\u8d44\\u6e90\\u5c06\\u88ab\\u91ca\\u653e\\u3002\",\"<p>\\u60a8\\u6240\\u6709\\u6309\\u91cf\\u4ed8\\u8d39\\u4e91\\u4e3b\\u673a\\u5c06\\u57282017-07-28 16:10:02\\u505c\\u6b62\\u670d\\u52a1\\uff0c2017-07-29 16:10:02 \\u8d44\\u6e90\\u5c06\\u88ab\\u91ca\\u653e\\u3002<p><p>\\u4e91\\u670d\\u52a1\\u5668\\u5217\\u8868:<p><table sortCol=\\\"-1\\\" style=\\\"border:solid #B1CBE2;border-width:0px 0px 1px 1px;font-size:12px;\\\" cellspacing=\\\"0\\\" cellpadding=\\\"4\\\" width=\\\"100%\\\" id=\\\"cvm_hour\\\"><thead><tr style=\\\"background-color:#D5E7F3;font-family:Arial, Helvetica, sans-serif;\\\"><th style=\\\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\\\">\\u540d\\u79f0<\\/th><th style=\\\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\\\">\\u5185\\u7f51IP<\\/th><th style=\\\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\\\">\\u5916\\u7f51IP<\\/th><th style=\\\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\\\">\\u4e91\\u670d\\u52a1\\u5668ID<\\/th><\\/tr><\\/thead><tbody><tr class=\\\"tr_spec\\\" ><td style=\\\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;background-image:url\\\\('..\\/image\\/td_bg1.gif'\\\\)\\\">\\u672a\\u547d\\u540d<\\/td><td style=\\\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;td\\\">10.144.90.143<\\/td><td style=\\\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;td\\\">119.28.44.153<\\/td><td style=\\\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;td\\\">faa67cdf-7944-4998-9ebb-5563d4b1aa04<\\/td><\\/tr><\\/tbody><\\/table>\"],\"mpbossTpl\":[\"2017-07-28 16:10:02\",1.17,\"583084570\",\"2017\\u5e7407\\u670828\\u65e5\",\"\\u60a8\\u6240\\u6709\\u6309\\u91cf\\u4ed8\\u8d39\\u4e91\\u4e3b\\u673a\\u5c06\\u57282017-07-28 16:10:02\\u505c\\u6b62\\u670d\\u52a1\\uff0c2017-07-29 16:10:02 \\u8d44\\u6e90\\u5c06\\u88ab\\u91ca\\u653e\\u3002\",\"<p>\\u60a8\\u6240\\u6709\\u6309\\u91cf\\u4ed8\\u8d39\\u4e91\\u4e3b\\u673a\\u5c06\\u57282017-07-28 16:10:02\\u505c\\u6b62\\u670d\\u52a1\\uff0c2017-07-29 16:10:02 \\u8d44\\u6e90\\u5c06\\u88ab\\u91ca\\u653e\\u3002<p><p>\\u4e91\\u670d\\u52a1\\u5668\\u5217\\u8868:<p><table sortCol=\\\"-1\\\" style=\\\"border:solid #B1CBE2;border-width:0px 0px 1px 1px;font-size:12px;\\\" cellspacing=\\\"0\\\" cellpadding=\\\"4\\\" width=\\\"100%\\\" id=\\\"cvm_hour\\\"><thead><tr style=\\\"background-color:#D5E7F3;font-family:Arial, Helvetica, sans-serif;\\\"><th style=\\\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\\\">\\u540d\\u79f0<\\/th><th style=\\\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\\\">\\u5185\\u7f51IP<\\/th><th style=\\\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\\\">\\u5916\\u7f51IP<\\/th><th style=\\\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\\\">\\u4e91\\u670d\\u52a1\\u5668ID<\\/th><\\/tr><\\/thead><tbody><tr class=\\\"tr_spec\\\" ><td style=\\\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;background-image:url\\\\('..\\/image\\/td_bg1.gif'\\\\)\\\">\\u672a\\u547d\\u540d<\\/td><td style=\\\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;td\\\">10.144.90.143<\\/td><td style=\\\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;td\\\">119.28.44.153<\\/td><td style=\\\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;td\\\">faa67cdf-7944-4998-9ebb-5563d4b1aa04<\\/td><\\/tr><\\/tbody><\\/table>\"]}";
        JSONObject para = new JSONObject();
        para.put("params",new JSONObject(a));
        para.put("pass","H8817TRhs9sai732hFEU");
        para.put("user","financial");

        JSONObject interfaceJson = new JSONObject();
        interfaceJson.put("para",para);
        interfaceJson.put("interfaceName","logical.messagecenter.insertMsg");


        JSONObject param = new JSONObject();
        param.put("version",1);
        param.put("componentName","MC");
        param.put("eventId",1103941138);
        param.put("interface",interfaceJson);

        System.out.println(param.toString());

        String d="{\n" +
                "    \"version\": 1,\n" +
                "    \"componentName\": \"MC\",\n" +
                "    \"eventId\": 1103941038,\n" +
                "    \"interface\": {\n" +
                "        \"interfaceName\": \"logical.messagecenter.insertMsg\",\n" +
                "        \"para\": {\n" +
                "            \"user\": \"financial\",\n" +
                "            \"pass\": \"H8817TRhs9sai732hFEU\",\n" +
                "            \"params\": {\n" +
                "                \"isAsync\": 1,\n" +
                "                \"ownerUin\": 583084570,\n" +
                "                \"themeId\": 108,\n" +
                "                \"titleTpl\": [],\n" +
                "                \"contentTpl\": [\n" +
                "                    \"2017-07-28 15:28:01\",\n" +
                "                    0.24,\n" +
                "                    \"583084570\",\n" +
                "                    \"2017年07月28日\",\n" +
                "                    \"您按流量付费的云主机将无法使用网络。账户冲正后服务会恢复。恢复后请更新负载均衡等网络设置。\",\n" +
                "                    \"<p>您按流量付费的云主机将无法使用网络。账户冲正后服务会恢复。恢复后请更新负载均衡等网络设置。<p><p>按流量网络云服务器列表: <p><table sortCol=\\\"-1\\\" style=\\\"border:solid #B1CBE2;border-width:0px 0px 1px 1px;font-size:12px;\\\" cellspacing=\\\"0\\\" cellpadding=\\\"4\\\" width=\\\"100%\\\" id=\\\"cvm_traffic\\\"><thead><tr style=\\\"background-color:#D5E7F3;font-family:Arial, Helvetica, sans-serif;\\\"><th style=\\\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\\\">名称</th><th style=\\\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\\\">内网IP</th><th style=\\\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\\\">外网IP</th><th style=\\\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\\\">云服务器ID</th></tr></thead><tbody><tr class=\\\"tr_spec\\\" ><td style=\\\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;background-image:url\\\\('../image/td_bg1.gif'\\\\)\\\">JF</td><td style=\\\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;td\\\">10.133.1.1</td><td style=\\\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;td\\\">115.1.1.1</td><td style=\\\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;td\\\">ins-test</td></tr></tbody></table>\"\n" +
                "                ],\n" +
                "                \"mpbossTpl\": [\n" +
                "                    \"2017-07-28 15:28:01\",\n" +
                "                    0.24,\n" +
                "                    \"583084570\",\n" +
                "                    \"2017年07月28日\",\n" +
                "                    \"您按流量付费的云主机将无法使用网络。账户冲正后服务会恢复。恢复后请更新负载均衡等网络设置。\",\n" +
                "                    \"<p>您按流量付费的云主机将无法使用网络。账户冲正后服务会恢复。恢复后请更新负载均衡等网络设置。<p><p>按流量网络云服务器列表: <p><table sortCol=\\\"-1\\\" style=\\\"border:solid #B1CBE2;border-width:0px 0px 1px 1px;font-size:12px;\\\" cellspacing=\\\"0\\\" cellpadding=\\\"4\\\" width=\\\"100%\\\" id=\\\"cvm_traffic\\\"><thead><tr style=\\\"background-color:#D5E7F3;font-family:Arial, Helvetica, sans-serif;\\\"><th style=\\\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\\\">名称</th><th style=\\\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\\\">内网IP</th><th style=\\\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\\\">外网IP</th><th style=\\\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\\\">云服务器ID</th></tr></thead><tbody><tr class=\\\"tr_spec\\\" ><td style=\\\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;background-image:url\\\\('../image/td_bg1.gif'\\\\)\\\">JF</td><td style=\\\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;td\\\">10.133.1.1</td><td style=\\\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;td\\\">115.1.1.1</td><td style=\\\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;td\\\">ins-test</td></tr></tbody></table>\"\n" +
                "                ]\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}";
        System.out.println("curl -v http://10.182.8.57:8080/interface.php -d '"+d+"'");
     //   curl -v http://10.182.8.57:8080/interface.php -d '{"eventId":1103941038,"componentName":"MC","interface":{"para":{"pass":"H8817TRhs9sai732hFEU","params":"{\"uin\":583084570,\"messageID\":108,\"titleTpl\":[],\"contentTpl\":[\"2017-07-28 16:10:02\",1.17,\"583084570\",\"2017\\u5e7407\\u670828\\u65e5\",\"\\u60a8\\u6240\\u6709\\u6309\\u91cf\\u4ed8\\u8d39\\u4e91\\u4e3b\\u673a\\u5c06\\u57282017-07-28 16:10:02\\u505c\\u6b62\\u670d\\u52a1\\uff0c2017-07-29 16:10:02 \\u8d44\\u6e90\\u5c06\\u88ab\\u91ca\\u653e\\u3002\",\"<p>\\u60a8\\u6240\\u6709\\u6309\\u91cf\\u4ed8\\u8d39\\u4e91\\u4e3b\\u673a\\u5c06\\u57282017-07-28 16:10:02\\u505c\\u6b62\\u670d\\u52a1\\uff0c2017-07-29 16:10:02 \\u8d44\\u6e90\\u5c06\\u88ab\\u91ca\\u653e\\u3002<p><p>\\u4e91\\u670d\\u52a1\\u5668\\u5217\\u8868:<p><table sortCol=\\\"-1\\\" style=\\\"border:solid #B1CBE2;border-width:0px 0px 1px 1px;font-size:12px;\\\" cellspacing=\\\"0\\\" cellpadding=\\\"4\\\" width=\\\"100%\\\" id=\\\"cvm_hour\\\"><thead><tr style=\\\"background-color:#D5E7F3;font-family:Arial, Helvetica, sans-serif;\\\"><th style=\\\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\\\">\\u540d\\u79f0<\\/th><th style=\\\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\\\">\\u5185\\u7f51IP<\\/th><th style=\\\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\\\">\\u5916\\u7f51IP<\\/th><th style=\\\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\\\">\\u4e91\\u670d\\u52a1\\u5668ID<\\/th><\\/tr><\\/thead><tbody><tr class=\\\"tr_spec\\\" ><td style=\\\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;background-image:url\\\\('..\\/image\\/td_bg1.gif'\\\\)\\\">\\u672a\\u547d\\u540d<\\/td><td style=\\\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;td\\\">10.144.90.143<\\/td><td style=\\\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;td\\\">119.28.44.153<\\/td><td style=\\\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;td\\\">faa67cdf-7944-4998-9ebb-5563d4b1aa04<\\/td><\\/tr><\\/tbody><\\/table>\"],\"mpbossTpl\":[\"2017-07-28 16:10:02\",1.17,\"583084570\",\"2017\\u5e7407\\u670828\\u65e5\",\"\\u60a8\\u6240\\u6709\\u6309\\u91cf\\u4ed8\\u8d39\\u4e91\\u4e3b\\u673a\\u5c06\\u57282017-07-28 16:10:02\\u505c\\u6b62\\u670d\\u52a1\\uff0c2017-07-29 16:10:02 \\u8d44\\u6e90\\u5c06\\u88ab\\u91ca\\u653e\\u3002\",\"<p>\\u60a8\\u6240\\u6709\\u6309\\u91cf\\u4ed8\\u8d39\\u4e91\\u4e3b\\u673a\\u5c06\\u57282017-07-28 16:10:02\\u505c\\u6b62\\u670d\\u52a1\\uff0c2017-07-29 16:10:02 \\u8d44\\u6e90\\u5c06\\u88ab\\u91ca\\u653e\\u3002<p><p>\\u4e91\\u670d\\u52a1\\u5668\\u5217\\u8868:<p><table sortCol=\\\"-1\\\" style=\\\"border:solid #B1CBE2;border-width:0px 0px 1px 1px;font-size:12px;\\\" cellspacing=\\\"0\\\" cellpadding=\\\"4\\\" width=\\\"100%\\\" id=\\\"cvm_hour\\\"><thead><tr style=\\\"background-color:#D5E7F3;font-family:Arial, Helvetica, sans-serif;\\\"><th style=\\\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\\\">\\u540d\\u79f0<\\/th><th style=\\\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\\\">\\u5185\\u7f51IP<\\/th><th style=\\\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\\\">\\u5916\\u7f51IP<\\/th><th style=\\\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\\\">\\u4e91\\u670d\\u52a1\\u5668ID<\\/th><\\/tr><\\/thead><tbody><tr class=\\\"tr_spec\\\" ><td style=\\\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;background-image:url\\\\('..\\/image\\/td_bg1.gif'\\\\)\\\">\\u672a\\u547d\\u540d<\\/td><td style=\\\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;td\\\">10.144.90.143<\\/td><td style=\\\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;td\\\">119.28.44.153<\\/td><td style=\\\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;td\\\">faa67cdf-7944-4998-9ebb-5563d4b1aa04<\\/td><\\/tr><\\/tbody><\\/table>\"]}","user":"financial"},"interfaceName":"logical.messagecenter.insertMsg"},"version":1}
      //  curl -v http://10.182.8.57:8080/interface.php -d '{"eventId":1103941138,"componentName":"MC","interface":{"para":{"pass":"H8817TRhs9sai732hFEU","params":{"titleTpl":[],"contentTpl":["2017-07-28 16:10:02",1.17,"583084570","2017年07月28日","您所有按量付费云主机将在2017-07-28 16:10:02停止服务，2017-07-29 16:10:02 资源将被释放。","<p>您所有按量付费云主机将在2017-07-28 16:10:02停止服务，2017-07-29 16:10:02 资源将被释放。<p><p>云服务器列表:<p><table sortCol=\"-1\" style=\"border:solid #B1CBE2;border-width:0px 0px 1px 1px;font-size:12px;\" cellspacing=\"0\" cellpadding=\"4\" width=\"100%\" id=\"cvm_hour\"><thead><tr style=\"background-color:#D5E7F3;font-family:Arial, Helvetica, sans-serif;\"><th style=\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\">名称<\/th><th style=\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\">内网IP<\/th><th style=\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\">外网IP<\/th><th style=\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\">云服务器ID<\/th><\/tr><\/thead><tbody><tr class=\"tr_spec\" ><td style=\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;background-image:url\\('../image/td_bg1.gif'\\)\">未命名<\/td><td style=\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;td\">10.144.90.143<\/td><td style=\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;td\">119.28.44.153<\/td><td style=\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;td\">faa67cdf-7944-4998-9ebb-5563d4b1aa04<\/td><\/tr><\/tbody><\/table>"],"themeId":108,"uin":583084570,"mpbossTpl":["2017-07-28 16:10:02",1.17,"583084570","2017年07月28日","您所有按量付费云主机将在2017-07-28 16:10:02停止服务，2017-07-29 16:10:02 资源将被释放。","<p>您所有按量付费云主机将在2017-07-28 16:10:02停止服务，2017-07-29 16:10:02 资源将被释放。<p><p>云服务器列表:<p><table sortCol=\"-1\" style=\"border:solid #B1CBE2;border-width:0px 0px 1px 1px;font-size:12px;\" cellspacing=\"0\" cellpadding=\"4\" width=\"100%\" id=\"cvm_hour\"><thead><tr style=\"background-color:#D5E7F3;font-family:Arial, Helvetica, sans-serif;\"><th style=\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\">名称<\/th><th style=\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\">内网IP<\/th><th style=\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\">外网IP<\/th><th style=\"border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;color:#000000\">云服务器ID<\/th><\/tr><\/thead><tbody><tr class=\"tr_spec\" ><td style=\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;background-image:url\\('../image/td_bg1.gif'\\)\">未命名<\/td><td style=\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;td\">10.144.90.143<\/td><td style=\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;td\">119.28.44.153<\/td><td style=\"padding:5px 8px;background-position:top left;background-repeat:no-repeat;color:#000000;border:solid #B1CBE2;border-width:1px 1px 0px 0px;font-size:12px;td\">faa67cdf-7944-4998-9ebb-5563d4b1aa04<\/td><\/tr><\/tbody><\/table>"]},"user":"financial"},"interfaceName":"logical.messagecenter.insertMsg"},"version":1}';

    }
}

        #enables colorin the terminal bash shell
        export export CLICOLOR=1

        #setsup thecolor scheme for list export
        export LSCOLORS=gxfxcxdxbxegedabagacad

        #sets up theprompt color (currently a green similar to linux terminal)
        export PS1='\[\033[01;32m\]\u@\h\[\033[00m\]:\[\033[01;36m\]\w\[\033[00m\]\$ '

        #enables colorfor iTerm
        export TERM=xterm-256color