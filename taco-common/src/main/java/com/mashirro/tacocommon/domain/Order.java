package com.mashirro.tacocommon.domain;

import cn.hutool.system.UserInfo;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 订单
 */

@Data
@TableName("tacoorder")
public class Order {

    @TableId
    private String id;

    private String deliveryName;

    private String deliveryStreet;

    private String deliveryCity;

    private String deliveryState;

    private String deliveryZip;

    private String ccNumber;

    private String ccExpiration;

    private String ccCVV;

    private Date createTime;

    //一对多
    @TableField(exist = false)  //非数据库表字段
    private List<Taco> tacos = new ArrayList<>();

    //订单所属用户
    @TableField(exist = false)
    private UserInfo userInfo;

    public void addDesign(Taco design) {
        this.tacos.add(design);
    }
}
