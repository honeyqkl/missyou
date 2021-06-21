package com.qiusannu.missyou;

import com.qiusannu.missyou.sample.EnableLoLConfiguration;
import com.qiusannu.missyou.sample.HeroConfiguration;
import com.qiusannu.missyou.sample.ISkill;
import com.qiusannu.missyou.sample.hero.LOLConfigurationSelector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

//@ComponentScan
//@Import(LOLConfigurationSelector.class)
@EnableLoLConfiguration
public class LOLApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(LOLApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
        ISkill iSkill = (ISkill) context.getBean("irelia");
        iSkill.r();
    }
}
