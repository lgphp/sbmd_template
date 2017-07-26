package com.hcfc.sbmd.provider;

import com.hcfc.sbmd.mapper.UserMapper;
import com.hcfc.sbmd.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by lgphp on 7/26/17.
 */

@Component
public class UserProvider {
    @Autowired
    private UserMapper um;
    @Autowired
    private UserModel userModel;

        /**
         * @param userId
         * @return
         */
        public UserModel findUser(Integer userId) {
            userModel = um.findUserById(userId);
            return userModel;
        }
}
