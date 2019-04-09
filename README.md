# Spring 教程
# 1、Spring概述
Spring是一站式轻量级开源框架，它是以Ioc(控制反转)、AOP(面向切片编程)为内核
## 优点：
* 非侵入设计：是应用程序代码对框架的依赖最小化
* 方便解耦、简化开发
* 支持AOP(面向切片编程)，提高代码的复用性
* 支持声明式事务
* 便于程序测试
* 易于集成多种框架
* 降低JavaEE API的难度
## Spring的体系框架
Spring采用的分层架构如图：
![Spring分层架构](https://7n.w3cschool.cn/attachments/image/wk/wkspring/arch1.png)

## Core Container(核心容器)
是其他模块建立的基础，主要是由Beans、Core、Context、Context-support、SpEl(Spring Expression Language，Spring表达式语言)
* Beans模块：提供BeanFactory,是工厂模式的经典实现，Spring将管理对象称为Bean
* Core模块：提供Spring框架的基本组成部分，包括Ioc和DI（依赖注入）功能
* Context模块：建立再Core和Beans模块的基础上，是访问和定义配置然后对象的媒介。ApplicationContext是其焦点
* Context-support:提供第三方库嵌入Spring应用的集成支持
* SpEl模块：Spring3.0后加入的模块，是运行时查询和操作对象图强大的表达式语言
## Data Access/Integration(数据访问/集成)
* JDBC模块：提供了JDBC的抽象层
* ORM模块：对流行的对象关系映射的API，包括JPA,JDO和Hibernate提供了集成层支持
* OXM模块：提供了一个支持对象/XML映射的抽象层实现
* JMS模块：JAVA消息传递服务
* Transaction 事务模块：支持对实现特殊接口以及所有POJO类的编程和声明式的事务管理
## WEB(WebSocket、Servlet、Web、Protlet)
* WebSocket模块：提供WebSocket和SocketJS的实现
* Servlet模块：Spring-webMVC模块，模型---视图---控制器
* Web模块：提供基本的Web开发集成的特性
* Portlet模块：提供在Portlet环境的MVC实现

## 四个基础jar包
```
<!--Spring 核心包1
       Spring-core:定义了spring框架的核心工具类
-->
<!-- https://mvnrepository.com/artifact/org.springframework/spring-core -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-core</artifactId>
    <version>5.1.5.RELEASE</version>
</dependency>

<!--Spring 核心包2
        所以应用都会使用的JAR包
-->
<!-- https://mvnrepository.com/artifact/org.springframework/spring-beans -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-beans</artifactId>
    <version>5.1.5.RELEASE</version>
</dependency>

<!--Spring 核心包3
        提供了多种支持（IOC、邮件服务、JNDI定位、EJB）
-->
<!-- https://mvnrepository.com/artifact/org.springframework/spring-context -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.1.5.RELEASE</version>
</dependency>

<!--Spring 核心包4
        Spring表达式语言
-->
<!-- https://mvnrepository.com/artifact/org.springframework/spring-expression -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-expression</artifactId>
    <version>5.1.5.RELEASE</version>
</dependency>

```


## Spring 核心容器
* BeanFactory：管理Bean的工厂
```
BeanFActory bf = new XmlBeanFactory(
    new FlieSystemResource("XmlFilePath");
);
```
* ApplicationContext：应用上下文，是一种常用的Spring容器
 ```
 /*使用ClassPathXmlApplicationContext创建*/
 ApplicationContext ac = 
    new ClassPathXmlApplicationContext("XmlFilePath");
 
 /*使用FileSystemXmlApplicationContext创建*/
 ApplicationContext ac = 
    new FileSystemXmlApplicationContext("XmlFilePath");
 ```

