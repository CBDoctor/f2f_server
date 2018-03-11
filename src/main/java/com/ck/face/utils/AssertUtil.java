/**
 * 
 */
package com.ck.face.utils;

import com.ck.face.exception.BizException;
import com.ck.face.exception.ErrorConstants;
import com.mysql.jdbc.StringUtils;

/**
 * @author cuiyanwei
 *  判斷異常錯誤公共類，請將錯誤方法的異常判斷寫在此處
 */
public class AssertUtil {

	/**
	 * 判斷對象非空
	 * 
	 * @param agrs
	 */
	public static void isNullOrEmpty(String agrs) {
		if (StringUtils.isNullOrEmpty(agrs)) {
			throw new BizException(ErrorConstants.ERROR_CODE, ErrorConstants.OBJECT_IS_NULL);
		}
	}

	public static void isEmptyOrWhitespaceOnly(String agrs) {
		if (StringUtils.isEmptyOrWhitespaceOnly(agrs)) {
			throw new BizException(ErrorConstants.ERROR_CODE, ErrorConstants.OBJECT_IS_NULL);
		}
	}

}
