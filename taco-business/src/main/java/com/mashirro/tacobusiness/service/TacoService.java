package com.mashirro.tacobusiness.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mashirro.tacocommon.domain.Taco;

import java.util.List;


public interface TacoService extends IService<Taco> {

    Taco saveTaco(Taco taco);

    List<Taco> selectTacosByOrderId(String id);
}
