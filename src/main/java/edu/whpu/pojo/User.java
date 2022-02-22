package edu.whpu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int uid;
    private String userName;
    private String password;
    private String realName;

    public User(String userName, String password, String realName) {
        this.userName = userName;
        this.password = password;
        this.realName = realName;
    }
}
