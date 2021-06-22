package com.qiusannu.missyou.api.v1;

import com.qiusannu.missyou.dto.PersonDTO;
import com.qiusannu.missyou.exception.http.ForbiddenException;
import com.qiusannu.missyou.exception.http.NotFoundException;
import com.qiusannu.missyou.sample.IConnect;
import com.qiusannu.missyou.sample.ISkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import java.util.Map;

@RestController
@RequestMapping("/banner")
@Validated
public class BannerController {
    @Autowired
    private ISkill iSkill;

    @Autowired
    private IConnect iConnect;

    @PostMapping(value = "/test/{id}")
    public PersonDTO test(@PathVariable @Max(value = 10 ,message = "不可以超过10嗷") Integer id,
                          @RequestParam String name,
                          @RequestBody @Validated PersonDTO person) throws Exception {
//        PersonDTO personDTO = new PersonDTO();
//        personDTO.setName("dhc");
//        person    DTO.setAge(18);
        PersonDTO personDTO = PersonDTO.builder()
                .name("7yue")
                .age(18)
                .build();
        return personDTO;
    }

}
