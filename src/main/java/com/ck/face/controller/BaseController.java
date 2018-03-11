package com.ck.face.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class BaseController {

	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(BaseController.class);

	@RequestMapping(method = RequestMethod.GET)
	public String welcome(ModelMap model) {
		logger.debug("进入欢迎页");
		return "index";
	}

}