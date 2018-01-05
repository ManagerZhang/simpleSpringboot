package com.simplespringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangke
 * @date 2018-01-05.
 */
@RestController
public class SimpleController {

	/**
	 * 捕获/请求
	 * @return
	 */
	@RequestMapping("/")
	@ResponseBody
	String testBoot(){
		return "hello spring boot!";
	}
}
