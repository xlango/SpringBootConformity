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
   (3)引入依赖jar包，配置application.properties文件

3.整合模版引擎（freemaker，thymeleaf）
   (1)引入依赖jar包,配置application.properties文件
   (2)配置i18n 资源文件，供thymeleaf 读取

4.SpringBoot配置全局异常捕获
   (1)error页面形式
   (2)ajax形式

5.整合Mybatis
   (1)使用generatorConfig生成mapper以及pojo
   (2)实现基于mybatis的CRUD功能
   (3)整合mybatis-pagehelper实现分页
   (4)idwork生成id
   (5)整合事务回滚（解决脏、幻象、不可重复读） service层添加注解@Transactional(propagation = Propagation.REQUIRED)
   
6.SpringBoot整合Redis
   (1)引入Redis依赖
   (2)配置application.properties
   (3)下载运行redis：运行 redis-server.exe redis.windows.conf
   
7.SpringBoot整合定时任务task
   (1)使用注解@EnableScheduling开始定时任务，会自动扫描
   (2)定义@Component作为组件被容器扫描
   (3)在线cron表达式：http://cron.qqe2.com/   注：springboot只支持六位，不支持到年
