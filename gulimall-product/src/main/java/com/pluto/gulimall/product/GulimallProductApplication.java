package com.pluto.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1、整合Mybatis-plus
 *      1）、导入依赖
 *      <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.2.0</version>
 *         </dependency>
 *       2)、配置
 *          1、配置数据源
 *              1)、导入数据库的驱动
 *              2）、在application.yml配置数据源相关信息
 *          2、配置Mybatis-Plus
 *              1)、使用MapperScan
 *              2）、告诉Mybatis-plus,sql映射文件位置
 *
 * 2、使用逻辑删除
 *  1）、配置全局的逻辑删除规则 （省略）
 * 2）、配置逻辑删除的组件Bean（省略）
 * 3）、实体类字段上加上@TableLogic注解
 *
 * 3、JSR303校验
 *  1）、给Bean添加校验注解:javax.validation.constraints,并定义自己的message提示
 *  2)、开启校验功能@Valid
 *      效果:校验错误后会有默认的响应
 *  3)、给校验的bean后紧跟一个BindingResult,就可以获取到校验的结果
 *  4)、分组校验
 *      1)、@NotNull(message = "修改必须指定品牌id",groups = {UpdateGroup.class})
 *        @Null(message = "新增不能指定id",groups = {AddGroup.class})
 *        给校验注解标注什么情况需要进行校验
 *      2)、(@Validated({AddGroup.class})
 *      3)、默认没有指定分组的校验注解,在分组校验情况下不生效，只会在不分组的情况下生效
 * 5）、自定义校验
 *     1）、编写一个自定义的校验注解
 *     2）、编写一个自定义的校验器 ConstraintValidator
 *     3）、关联自定义的校验器和自定义的校验注解
 *     @Documented
 *     @Constraint(
 *         validatedBy = {ListValueConstraintValidator.class[可以指定多个不同的校验器,适配不同类型的校验]}
 *      )
 *     @Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
 *     @Retention(RetentionPolicy.RUNTIME)
 * public @interface ListValue {
 *
 * 4、统一的异常处理
 * @ControllerAdvice
 */
@MapperScan("com.pluto.gulimall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
