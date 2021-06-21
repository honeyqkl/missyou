package com.qiusannu.missyou.sample.hero;

import com.qiusannu.missyou.sample.ISkill;
import org.springframework.stereotype.Component;

//@Component
public class Irelia implements ISkill {

    // 立即实例化Diana
    public Irelia() {
        System.out.println("Hello,7yue");
    }
    public void q() {
        System.out.println("Irelia Q");
    }
    public void w() {
        System.out.println("Irelia W");
    }
    public void e() {
        System.out.println("Irelia E");
    }
    public void r() {
        System.out.println("Irelia R");
    }
}
