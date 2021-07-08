package com.mashirro.tacoweb.controller.business;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mashirro.tacobusiness.domain.Taco;
import com.mashirro.tacobusiness.service.TacoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @RestController
 */
@RestController
@RequestMapping("/design")     //处理针对design的请求
//@CrossOrigin(origins = "*")    //允许跨域请求
public class DesignTacoController {

    @Autowired
    private TacoService tacoService;

    /**
     * 分页查询展示最近创建的taco
     *
     * @return
     */
    @GetMapping("/recent")
    public List<Taco> recentTacos() {
        Page<Taco> page = new Page<>(1, 1);
        Page<Taco> pageList = tacoService.getBaseMapper().selectPage(page, null);
        return pageList.getRecords();
    }

    /**
     * 根据id获取单个taco
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Taco tacoById(@PathVariable("id") String id) {
        return tacoService.getBaseMapper().selectById(id);
    }


    @PostMapping
    public Taco processDesign(@RequestBody Taco taco) {
        return tacoService.saveTaco(taco);
    }
}
