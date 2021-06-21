package com.qiusannu.missyou.api.v1;

import com.qiusannu.missyou.exception.http.ForbiddenException;
import com.qiusannu.missyou.exception.http.NotFoundException;
import com.qiusannu.missyou.sample.IConnect;
import com.qiusannu.missyou.sample.ISkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/banner")
public class BannerController {
    @Autowired
    private ISkill iSkill;

    @Autowired
    private IConnect iConnect;

    @RequestMapping(value = "/test")
    public String test() throws Exception {
        throw new ForbiddenException(10001);
    }
}
