package com.mashirro.tacobusiness.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Taco
 */

@Data
@TableName("taco")
public class Taco {

  @TableId
  private String id;

  private String name;

  private Date createTime;

  //一对多
  @TableField(exist = false)  //非数据库表字段
  private List<Ingredient> ingredients = new ArrayList<>();

}
