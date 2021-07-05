package com.mashirro.tacobusiness.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mashirro.tacobusiness.domain.Taco;
import com.mashirro.tacobusiness.mapper.TacoMapper;
import com.mashirro.tacobusiness.service.TacoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TacoServiceImpl extends ServiceImpl<TacoMapper, Taco> implements TacoService {
}
