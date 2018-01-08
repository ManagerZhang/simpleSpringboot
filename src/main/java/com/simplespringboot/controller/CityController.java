package com.simplespringboot.controller;

import com.simplespringboot.model.City;
import com.simplespringboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author  zhangke
 * @date 2018-01-05.
 */
@RestController
public class CityController {

	@Autowired
	private CityService cityService;
	/**
	 * 拦截查询请求
	 * @param cityName
	 * @return
	 */
	@RequestMapping("/selectCity")
	@ResponseBody
	public City city(@RequestParam String cityName){
		City city =  cityService.selectCityByName(cityName);
		return city;
	}
}
