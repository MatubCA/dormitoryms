package com.southwind.service;

import com.southwind.entity.SystemAdmin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.southwind.form.RuleForm;
import com.southwind.vo.ResultVO;

public interface SystemAdminService extends IService<SystemAdmin> {
    public ResultVO login(RuleForm ruleForm);
}
