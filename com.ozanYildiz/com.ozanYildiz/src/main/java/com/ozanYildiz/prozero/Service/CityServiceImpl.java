package com.ozanYildiz.prozero.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ozanYildiz.prozero.Dao.CityDao;
import com.ozanYildiz.prozero.Entities.City;

@Service
public class CityServiceImpl implements CityService {

	private CityDao cityDao;
	
	@Autowired
	public CityServiceImpl(CityDao cityDao) {
		this.cityDao = cityDao;
	}

	@Override
	@Transactional
	public List<City> getAll() {
		return this.cityDao.getAll();
	}

	@Override
	@Transactional
	public void add(City city) {
		this.cityDao.add(city);
	}

	@Override
	@Transactional
	public void update(City city) {
		this.cityDao.update(city);
	}

	@Override
	@Transactional
	public void delete(City city) {
		this.cityDao.delete(city);
	}

	@Override
	@Transactional
	public City getById(int id) {
		return this.cityDao.getById(id);
	}

}
