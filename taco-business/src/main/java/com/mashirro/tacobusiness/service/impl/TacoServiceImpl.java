package com.mashirro.tacobusiness.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mashirro.tacobusiness.domain.Ingredient;
import com.mashirro.tacobusiness.domain.Taco;
import com.mashirro.tacobusiness.domain.TacoIngredient;
import com.mashirro.tacobusiness.mapper.IngredientMapper;
import com.mashirro.tacobusiness.mapper.TacoIngredientMapper;
import com.mashirro.tacobusiness.mapper.TacoMapper;
import com.mashirro.tacobusiness.service.TacoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class TacoServiceImpl extends ServiceImpl<TacoMapper, Taco> implements TacoService {

    @Autowired
    private TacoMapper tacoMapper;

    @Autowired
    private TacoIngredientMapper tacoIngredientMapper;


    @Override
    @Transactional
    public Taco saveTaco(Taco taco) {
        String tacoId = UUID.randomUUID().toString();
        taco.setId(tacoId);
        taco.setCreateTime(new Date());
        tacoMapper.insert(taco);
        List<Ingredient> ingredients = taco.getIngredients();
        TacoIngredient tacoIngredient = new TacoIngredient();
        tacoIngredient.setTacoId(tacoId);
        for (Ingredient ingredient : ingredients) {
            tacoIngredient.setIngredientId(ingredient.getId());
            tacoIngredientMapper.insert(tacoIngredient);
        }
        return taco;
    }
}
