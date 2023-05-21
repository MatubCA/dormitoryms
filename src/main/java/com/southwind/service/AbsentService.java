package com.southwind.service;

import com.southwind.entity.Absent;
import com.baomidou.mybatisplus.extension.service.IService;
import com.southwind.form.SearchForm;
import com.southwind.vo.PageVO;


public interface AbsentService extends IService<Absent> {
    public PageVO list(Integer page, Integer size);
    public PageVO search(SearchForm searchForm);
}
