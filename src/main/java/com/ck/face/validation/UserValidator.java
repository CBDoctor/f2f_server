/**
 * 
 */
package com.ck.face.validation;

import org.springframework.stereotype.Component;

import com.ck.face.domain.User;
import com.ck.face.utils.AssertUtil;

/**
 * @author cuiyanwei
 *
 */
@Component
public class UserValidator implements Validator<User> {

	@Override
	public void validator(User user) {
		//AssertUtil.isNullOrEmpty(user.getName());
	}

}
