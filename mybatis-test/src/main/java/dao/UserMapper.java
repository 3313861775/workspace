package dao;

import pojo.User;

import java.util.List;

public interface UserMapper {
    //查询所有
    public List<User> findAll();

    List<User> findAllUserAndRole();
}
