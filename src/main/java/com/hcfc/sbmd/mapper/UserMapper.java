package com.hcfc.sbmd.mapper;

import com.hcfc.sbmd.mapper.sqlprovider.UserSqlProvider;
import com.hcfc.sbmd.model.UserModel;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Service;

/**
 * Created by lgphp on 7/26/17.
 */

@Service
public interface UserMapper {

    @SelectProvider(type = UserSqlProvider.class, method = "findUserById")
    @Results({
            @Result(id = true ,column = "id" , property = "id" ),
            @Result(column = "username" , property = "username"),
            @Result(column = "usertitle", property = "usertitle"),
            @Result(column = "useraddr" , property = "useraddr")
    })
    UserModel findUserById(Integer userId);
}
