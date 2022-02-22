package edu.whpu.dao;

import edu.whpu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<User> getAllUser();

    User getUserById(int uid);

    int insertUser(User user);

    int deleteUser(int uid);

    int updateUser(User user);

    User userLogin(@Param("userName") String userName, @Param("password") String password);
}
