package com.mashirro.tacoweb.controller.business;


import com.mashirro.tacobusiness.domain.Ingredient;
import com.mashirro.tacobusiness.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ingredientsx")
//@CrossOrigin(origins="*")    //允许跨域请求
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;

    /**
     * 查询所有原料ingredient
     * @return
     */
    @GetMapping
    public List<Ingredient> allIngredients(){
        return ingredientService.getBaseMapper().selectList(null);
    }

}
