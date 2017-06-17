package com.lightbulbtech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lightbulbtech.domain.Fruit;
import com.lightbulbtech.service.FruitService;

@Controller
public class FruitController {
	@Autowired
	private FruitService FruitService;
	
	@RequestMapping("/fruit/list")
	public void FruitList(Model model) {
		List<Fruit> fruitList = FruitService.findAll();
		model.addAttribute("fruitList", fruitList);
	}
}