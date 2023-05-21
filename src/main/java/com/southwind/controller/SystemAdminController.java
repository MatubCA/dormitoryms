package com.southwind.controller;


import com.southwind.form.RuleForm;
import com.southwind.service.SystemAdminService;
import com.southwind.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/systemAdmin")
public class SystemAdminController {

    @Autowired
    private SystemAdminService systemAdminService;

    @GetMapping("/login")
    public ResultVO login(RuleForm ruleForm){
        ResultVO resultVO = this.systemAdminService.login(ruleForm);
        return resultVO;
    }

}

