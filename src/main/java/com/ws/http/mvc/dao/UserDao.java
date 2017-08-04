package com.ws.http.mvc.dao;

import com.ws.http.mvc.pojo.UserPojo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserDao {
    int addUser(Map<String, String> user);

    int updatePassword(@Param("phone") String phone, @Param("password") String password);

    String getUser(@Param("phone") String phone, @Param("password") String password);

    int checkExist(String phone);

    int updateInfo(Map<String, String> param);

    UserPojo getInfo(int userId);
}
