package com.erudev.spring.basic_di.d_withanno.anno;

import java.lang.annotation.*;

/**
 * @author pengfei.zhao
 * @date 2020/9/22 8:42
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Color {
}
