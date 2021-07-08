package com.mashirro.tacobusiness.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mashirro.tacobusiness.domain.Ingredient;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface IngredientMapper extends BaseMapper<Ingredient> {


    @Select("select * from ingredient where id in (select ingredientId from taco_ingredients where tacoId = #{tacoId})")
    List<Ingredient> selectIngredientsByTacoId(String tacoId);
}
