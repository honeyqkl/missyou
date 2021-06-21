package com.qiusannu.missyou.sample.hero;


import com.qiusannu.missyou.sample.ISkill;
import org.springframework.stereotype.Component;

//@Component
public class Camille implements ISkill {
    private String name;
    private int age;

    public Camille(String name,Integer age) {
        this.name = name;
        this.age = age;
    }
    // 立即实例化Diana
    public Camille() {
        System.out.println("Hello,7yue");
    }
    public void q() {
        System.out.println("Camille Q");
    }
    public void w() {
        System.out.println("Camille W");
    }
    public void e() {
        System.out.println("Camille E");
    }
    public void r() {
        System.out.println("Camille R");
    }
}
