package com.mashirro.tacocommon.domain;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * taco_ingredient关联表
 */

@Data
@TableName("taco_ingredients")
public class TacoIngredient {

    public String tacoId;

    public String ingredientId;

}
