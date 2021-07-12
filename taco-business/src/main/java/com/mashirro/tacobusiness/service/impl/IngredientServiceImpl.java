package com.mashirro.tacobusiness.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mashirro.tacobusiness.mapper.IngredientMapper;
import com.mashirro.tacobusiness.service.IngredientService;
import com.mashirro.tacocommon.domain.Ingredient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class IngredientServiceImpl extends ServiceImpl<IngredientMapper, Ingredient>
        implements IngredientService {

    @Autowired
    private IngredientMapper ingredientMapper;

    @Override
    public List<Ingredient> selectIngredientsByTacoId(String tacoId) {
        return ingredientMapper.selectIngredientsByTacoId(tacoId);
    }
}
