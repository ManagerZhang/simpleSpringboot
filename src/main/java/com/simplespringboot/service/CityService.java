package com.simplespringboot.service;


import com.simplespringboot.model.City;

/**
 * @author zhangke
 * @date 2018-01-05.
 */

public interface CityService {
	/**
	 * 查询城市信息
	 * @param cityName
	 * @return
	 */
	City selectCityByName(String cityName);
}
