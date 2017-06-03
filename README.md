

编译
============
mvn -U clean package


部署
============
target 目录下war包放到tomcat的webapp下，tomcat会自动解压
mv demo-1.0-SNAPSHOT demo


访问
============
浏览器输入地址：tomcat所在机器的ip/demo/views/index.html
