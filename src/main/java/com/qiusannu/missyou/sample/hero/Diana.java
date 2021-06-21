package com.qiusannu.missyou.sample.hero;

import com.qiusannu.missyou.sample.ISkill;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class Diana implements ISkill {
    private String name;
    private int age;

    public Diana(String name,Integer age) {
        this.name = name;
        this.age = age;
    }

    // 立即实例化Diana
    public Diana() {
        System.out.println("Hello,7yue");
    }
    public void q() {
        System.out.println("Diana Q");
    }
    public void w() {
        System.out.println("Diana W");
    }
    public void e() {
        System.out.println("Diana E");
    }
    public void r() {
        System.out.println("Diana R");
    }
}
