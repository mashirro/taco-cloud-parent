package com.mashirro.tacobusiness.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mashirro.tacocommon.domain.Order;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface OrderMapper extends BaseMapper<Order> {

    @Select("select * from tacoorder")
    List<Order> findAllOrders();
}
