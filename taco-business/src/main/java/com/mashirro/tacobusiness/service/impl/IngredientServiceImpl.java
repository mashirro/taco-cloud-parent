package com.mashirro.tacobusiness.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mashirro.tacobusiness.domain.Ingredient;
import com.mashirro.tacobusiness.mapper.IngredientMapper;
import com.mashirro.tacobusiness.service.IngredientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class IngredientServiceImpl extends ServiceImpl<IngredientMapper, Ingredient>
        implements IngredientService {
}
