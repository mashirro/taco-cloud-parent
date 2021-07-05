package com.mashirro.tacobusiness.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mashirro.tacobusiness.enums.Type;
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
