package com.mashirro.tacocommon.domain;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * order_taco关联表
 */
@Data
@TableName("order_tacos")
public class OrderTaco {

    public String tacoOrderId;


    public String tacoId;
}
