package com.liuhp.annotation;

import com.liuhp.LiuhpAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(LiuhpAutoConfiguration.class)
public @interface EnableLiuhp {
}
