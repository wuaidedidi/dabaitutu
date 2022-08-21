package com.lichen.dabaitutu.common.Validator;

import com.lichen.dabaitutu.common.annotation.IsMobile;
import com.lichen.dabaitutu.common.entity.Regexp;
import com.lichen.dabaitutu.common.utils.DabaituUtils;
import org.apache.commons.lang3.StringUtils;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author lichen
 * @version 1.0.0
 * @className MobileValidator.java
 * @Description TODO
 * @createTime 2022年08月20日 22:35:00
 */

public class MobileValidator implements ConstraintValidator<IsMobile,Object> {
    @Override
    public void initialize(IsMobile Constraint) {
//初始化的时候
        System.out.println("my validator init");
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        try {
            if (StringUtils.isBlank(o.toString())) {
                return true;
            } else {
                String regex = Regexp.MOBILE_REG;
                return DabaituUtils.match(regex, o.toString());
            }
        } catch (Exception e) {
            return false;
        }
    }


}