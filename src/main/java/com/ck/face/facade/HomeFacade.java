/**
 * 
 */
package com.ck.face.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ck.face.constant.Result;
import com.ck.face.domain.Title;
import com.ck.face.service.TitleService;
import com.ck.face.vo.HomePageVO;

/**
 * @author cuiyanwei
 *
 */
@Service
public class HomeFacade {

	@Autowired
	private TitleService titleService;

	/**
	 * @return
	 */
	public Result<HomePageVO> getHomePage() {

		Result<HomePageVO> result = new Result<HomePageVO>();
		HomePageVO homePageVO = new HomePageVO();
		result.setData(homePageVO);

		List<Title> titles = titleService.getTitles();
		homePageVO.setTitles(titles);

		return result;
	}

}
