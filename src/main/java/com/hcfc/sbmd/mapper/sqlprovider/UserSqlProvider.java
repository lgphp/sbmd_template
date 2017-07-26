package com.hcfc.sbmd.mapper.sqlprovider;

/**
 * Created by lgphp on 7/26/17.
 */
public class UserSqlProvider {

    public  String findUserById(Integer userId) {
        String sql =  "select id ,  username , usertitle, useraddr from user where id = " + userId;
        System.out.println(sql);
        return sql;
    }
}
