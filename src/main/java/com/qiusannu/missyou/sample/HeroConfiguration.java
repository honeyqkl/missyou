package com.qiusannu.missyou.sample;

import com.qiusannu.missyou.sample.condtion.DianaCondition;
import com.qiusannu.missyou.sample.condtion.IreliaCondition;
import com.qiusannu.missyou.sample.hero.Camille;
import com.qiusannu.missyou.sample.hero.Diana;
import com.qiusannu.missyou.sample.hero.Irelia;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HeroConfiguration {
//    @Bean
//    @ConditionalOn1Bean(name="mysql")
    public ISkill diana() {
        return new Diana("Diana",18);
    }

    @Bean
//    @ConditionalOnProperty(value = "hero.condition",havingValue = "irelia")
    public ISkill irelia() {
        return new Irelia();
    }
}
