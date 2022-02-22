package edu.whpu.service;

import edu.whpu.dao.UserDao;
import edu.whpu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User userLogin(String userName, String password) {
        return userDao.userLogin(userName, password);
    }

    public User getUserById(int uid) {
        return userDao.getUserById(uid);
    }
}
