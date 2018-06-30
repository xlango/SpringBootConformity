Spring Boot后端加前端相关整合：
1.构造并返回Json
(1)自定义响应数据结构
 	这个类是提供给门户，ios，安卓，微信商城用的
  	门户接受此类数据后需要使用本类的方法转换成对于的数据类型格式（类，或者list）
	其他自行处理
 	200：表示成功
 	500：表示错误，错误信息在msg字段中
 	501：bean验证错误，不管多少个错误都以map形式返回
 	502：拦截器拦截到用户token出错
 	555：异常抛出信息
(2)pojo对属性得jackson相关注解
    @JsonIgnore    json数据中不显示该属性
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss a",locale="zh",timezone="GMT+8")  规范日期格式
    @JsonInclude(Include.NON_NULL)    根据自己的业务需求设置不同情况属性在json串中的显示
    
2.SpringBoot开发环境下的热部署
(1)监控classpath下的java类，当java文件改变时不会重启Tomcat，只是编译classpath下的java类
(2)注意配置静态文件改变时不会重新编译java文件
(3)引入jar包，配置application.properties文件

