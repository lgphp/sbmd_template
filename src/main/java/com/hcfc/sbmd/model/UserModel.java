package com.hcfc.sbmd.model;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by lgphp on 7/26/17.
 */

@Repository

public class UserModel implements Serializable {
    private Integer id;
    private String username;
    private String usertitle;
    private String useraddr;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsertitle() {
        return usertitle;
    }

    public void setUsertitle(String usertitle) {
        this.usertitle = usertitle;
    }

    public String getUseraddr() {
        return useraddr;
    }

    public void setUseraddr(String useradd) {
        this.useraddr = useradd;
    }

    @Override
    public String toString()
    { return "UserModel{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", usertitle='" + usertitle + '\'' +
                ", useradd='" + useraddr + '\'' +
                '}';
    }
}
