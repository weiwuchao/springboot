package com.wwc.validator.annoation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FlagValidator  implements ConstraintValidator<FalgValid, Object> {

    //临时变量保存flag值列表
    private String values;

    @Override
    public void initialize(FalgValid FalgAnnoation) {
        //将注解内配置的值赋值给临时变量
        this.values = FalgAnnoation.values();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        //分割定义的有效值
        String[] value_array = values.split(",");
        boolean isFlag = false;
        //遍历比对有效值
        for (int i =0;i<value_array.length;i++)
        {
            //存在一致跳出循环，赋值isFlag=true
            if(value_array[i].equals(value))
            {
                isFlag = true;
                break;
            }
        }
        //返回是否存在boolean
        return isFlag;
    }
}
