package com.qiusannu.missyou.dto;

import com.qiusannu.missyou.validators.PasswordEqual;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.Max;

//数据传输对象
@Builder
@Getter
@PasswordEqual
public class PersonDTO {
    @Length(min = 2,max = 10,message = "xxxxxx")
    private String name;

    private Integer age;

    private String password1;
    private String password2;
}

