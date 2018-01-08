package com.simplespringboot.dao;

import com.simplespringboot.model.City;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @author zhangke
 * @date 2018-01-05.
 */
public interface CityDao {
	/**
	 * 查询City
	 * @param parameter
	 * @return
	 */
	City findCityByName(Map parameter);
}
