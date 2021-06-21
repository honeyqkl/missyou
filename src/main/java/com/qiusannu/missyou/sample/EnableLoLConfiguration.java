package com.qiusannu.missyou.sample;

import com.qiusannu.missyou.sample.hero.LOLConfigurationSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(LOLConfigurationSelector.class)
public @interface EnableLoLConfiguration {

}
