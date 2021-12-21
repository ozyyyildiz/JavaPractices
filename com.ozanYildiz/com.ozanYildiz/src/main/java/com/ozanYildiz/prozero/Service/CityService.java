package com.ozanYildiz.prozero.Service;

import java.util.List;

import com.ozanYildiz.prozero.Entities.City;

public interface CityService {
	
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);

}
