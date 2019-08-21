package com.wwc.validator.annoation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 自定义注解
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Constraint(validatedBy = FlagValidator.class)
public @interface FalgValid {

    //flag的有效值多个使用','隔开
    String values();
    //提示内容
    String message() default "flag不存在";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
