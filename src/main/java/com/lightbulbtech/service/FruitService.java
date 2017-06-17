package com.lightbulbtech.service;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lightbulbtech.domain.Fruit;

@Service
public class FruitService {
	private List<Fruit> FruitList = new LinkedList<Fruit>();
	
	FruitService() {
		Fruit Fruit1 = new Fruit();
		Fruit1.setName("Avocado");
		Fruit1.setPrice(new BigDecimal(27));
		FruitList.add(Fruit1);
		
		Fruit Fruit2 = new Fruit();
		Fruit2.setName("PineApple");
		Fruit2.setPrice(new BigDecimal(7));
		FruitList.add(Fruit2);

		Fruit Fruit3 = new Fruit();
		Fruit3.setName("Banana");
		Fruit3.setPrice(new BigDecimal(5));
		FruitList.add(Fruit3);
	}
	
	public List<Fruit> findAll() {
		return FruitList;
	}
}
