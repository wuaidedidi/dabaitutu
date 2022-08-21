package com.lichen.dabaitutu.common.annotation;



import com.lichen.dabaitutu.common.Validator.MobileValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author lichen
 * @version 1.0.0
 * @className IsMobile.java
 * @Description TODO
 * @createTime 2022年08月20日 22:33:00
 */

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy =MobileValidator.class )
public @interface IsMobile {
    String message() ;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}