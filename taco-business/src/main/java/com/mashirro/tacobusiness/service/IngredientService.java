package com.mashirro.tacobusiness.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mashirro.tacocommon.domain.Ingredient;

import java.util.List;

public interface IngredientService extends IService<Ingredient> {


    List<Ingredient> selectIngredientsByTacoId(String tacoId);

}
