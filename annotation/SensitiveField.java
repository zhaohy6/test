package com.example.demo.annotation;

import java.lang.annotation.*;

/**
  * 注解敏感信息字段的注解
  */

@Inherited
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SensitiveField {
}
