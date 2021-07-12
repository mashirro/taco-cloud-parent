package com.mashirro.tacocommon.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mashirro.tacocommon.enums.Type;
import lombok.Data;

/**
 * 配料
 */

@Data
@TableName("ingredient")
public class Ingredient {

    @TableId
    private String id;

    private String name;

    private Type type;

}
