package com.simplespringboot.service.impl;

import com.simplespringboot.dao.CityDao;
import com.simplespringboot.model.City;
import com.simplespringboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangke
 * @date 2018-01-05
 */
@Service
public class CityServiceImpl implements CityService{
	@Autowired
	private CityDao cityDao;

	@Override
	public City selectCityByName(String cityName) {
		Map parameter = new HashMap(4);
		parameter.put("cityName",cityName);
		return cityDao.findCityByName(parameter);
	}
}
