package com.mashirro.tacobusiness.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mashirro.tacocommon.domain.Taco;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface TacoMapper extends BaseMapper<Taco> {

    @Select("select * from taco where id in (select tacoId from order_tacos where tacoOrderId = #{id})")
    List<Taco> selectTacosByOrderId(String id);
}
