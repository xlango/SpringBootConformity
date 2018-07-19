Spring Boot后端加前端相关整合：</br>
1.构造并返回Json</br>
(1)自定义响应数据结构</br>
 	这个类是提供给门户，ios，安卓，微信商城用的</br>
  	门户接受此类数据后需要使用本类的方法转换成对于的数据类型格式（类，或者list）</br>
	其他自行处理</br>
 	200：表示成功</br>
 	500：表示错误，错误信息在msg字段中</br>
 	501：bean验证错误，不管多少个错误都以map形式返回</br>
 	502：拦截器拦截到用户token出错</br>
 	555：异常抛出信息</br>
(2)pojo对属性得jackson相关注解</br>
    @JsonIgnore    json数据中不显示该属性</br>
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss a",locale="zh",timezone="GMT+8")  规范日期格式</br>
    @JsonInclude(Include.NON_NULL)    根据自己的业务需求设置不同情况属性在json串中的显示</br>
    </br>
2.SpringBoot开发环境下的热部署</br>
   (1)监控classpath下的java类，当java文件改变时不会重启Tomcat，只是编译classpath下的java类</br>
   (2)注意配置静态文件改变时不会重新编译java文件</br>
   (3)引入依赖jar包，配置application.properties文件</br>
</br>
3.整合模版引擎（freemaker，thymeleaf）</br>
   (1)引入依赖jar包,配置application.properties文件</br>
   (2)配置i18n 资源文件，供thymeleaf 读取</br>
</br>
4.SpringBoot配置全局异常捕获</br>
   (1)error页面形式</br>
   (2)ajax形式</br>

5.整合Mybatis</br>
   (1)使用generatorConfig生成mapper以及pojo</br>
   (2)实现基于mybatis的CRUD功能</br>
   (3)整合mybatis-pagehelper实现分页</br>
   (4)idwork生成id</br>
   (5)整合事务回滚（解决脏、幻象、不可重复读） service层添加注解@Transactional(propagation = Propagation.REQUIRED)</br>
   </br>
6.SpringBoot整合Redis</br>
   (1)引入Redis依赖</br>
   (2)配置application.propertiesa</br>
   (3)下载运行redis：运行 redis-server.exe redis.windows.conf</br>
   
7.SpringBoot整合定时任务task</br>
   (1)使用注解@EnableScheduling开始定时任务，会自动扫描</br>
   (2)定义@Component作为组件被容器扫描</br>
   (3)在线cron表达式：http://cron.qqe2.com/   注：springboot只支持六位，不支持到年</br>
   
8.SpringBoot异步执行程序</br>
   (1)使用注解@EnableAsync开启异步，会自动扫描</br>
   (2)定义@Component @Async作为组件被容器扫描执行</br>
   (3)应用于进程的同步和异步方法，例如：发短信、发邮件、App消息推送、节省运维凌晨发布任务时间提高效率</br>
   
9.注册拦截器</br>

10.拓展：</br>
   (1)nosql:mongodb、memchache</br>
   (2)分布式中间件:zookeeper、dubbo</br>
   </br>
