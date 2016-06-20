# spring-mvc-learn
spring-mvc learn code source

## app03a
第一个Spring MVC应用

## app04a
基于注解的控制器

## app05a
数据绑定和表单标签库
1. 在视图中引入:<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>,使用spring的form表单
2. 在controller的action添加model
## app06a
转换器(Converter)和格式化(Formatter)
### Converter
1. 实现Converter接口
2. 在spring-mvc的配置文件中添加bean: org.springframework.context.support.ConversionServiceFactoryBean,注册Converter,添加annotation-driven的conversion-service属性
### Formatter
1. 实现Formatter接口
2. 在spring-mvc的配置文件中添加bean: org.springframework.format.support.FormattingConversionServiceFactoryBean,注册Formatter,添加annotation-driven的conversion-service属性
### 用Registrar注册Formatter
1. 实现FormatterRegistrar接口
2. 在spring-mvc的配置文件中添加bean: org.springframework.format.support.FormattingConversionServiceFactoryBean,注册FormatterRegistrar,添加annotation-driven的conversion-service属性

## app07a
spring验证器
1. 实现Validator接口
2. 在messages.properties文件添加验证器的错误信息
3. 在spring-mvc的配置文件中添加bean: org.springframework.context.support.ReloadableResourceBundleMessageSource,注册messages
4. 在controller的action调用Validator的实现类

## app07b
JSR 303 验证
1. 在pom.xml中添加Hibernate Validator
2. 在java bean属性上方添加JSR 303标注
3. 在controller的action的参数前加上@Valid注解
4. 在messages.properties文件添加验证器的错误信息