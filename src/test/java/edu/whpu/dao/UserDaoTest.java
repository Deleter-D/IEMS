package edu.whpu.dao;

import edu.whpu.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserDaoTest {
    @Autowired
    UserDao userDao;

    @Test
    public void getAllUserTest() {
        List<User> userList = userDao.getAllUser();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void insertUserTest() {
        User user = new User("六六", "admin", "刘六");
        int i = userDao.insertUser(user);
        System.out.println(i);
    }

    @Test
    public void deleteUserTest() {
        int i = userDao.deleteUser(4);
        System.out.println(i);
    }

    @Test
    public void updateUserTest() {
        User user = userDao.getUserById(5);
        user.setPassword("admin123");
        int i = userDao.updateUser(user);
        System.out.println(i);
    }

    @Test
    public void userLoginTest() {
        User user = userDao.userLogin("user012", "admin");
        System.out.println(user);
    }
}
