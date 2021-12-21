package com.ozanYildiz.prozero.Dao;

import java.util.List;

import com.ozanYildiz.prozero.Entities.City;

public interface CityDao {
	
	List<City> getAll();
	
	void add(City city);
	
	void update(City city);
	
	void delete(City city);
	
	City getById(int id);
	
}
