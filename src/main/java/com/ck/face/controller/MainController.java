/**
 * 
 */
package com.ck.face.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ck.face.constant.Result;
import com.ck.face.facade.HomeFacade;
import com.ck.face.validation.UserValidator;
import com.ck.face.vo.HomePageVO;

/**
 * @author cuiyanwei
 *
 */
@Controller
@RequestMapping("/home")
public class MainController extends BaseController {

	@Autowired  
	private HomeFacade homeFacade;
	
	@Autowired  
	private UserValidator userValidator;

	/**
	 * @api {get} /home 返回主頁信息
	 * @apiName 用户
	 * @apiGroup HomePage
	 * @apiSuccessExample Success-Response: { "code": 1, "msg": null, "data": {
	 *                    "id": 1, "name": "test", "passport": "test" } }
	 */
	@ResponseBody
	@RequestMapping("/")
	public Result<HomePageVO> getHomePage() {
		userValidator.validator(null);
		return homeFacade.getHomePage();

	}
}
