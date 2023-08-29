package ss20.th.service;

import ss20.th.model.Login;
import ss20.th.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        users.add(new User("nhung274","123456","Nhung","nhung274@gmail.com",27));
        users.add(new User("admin","admin","Admin","admin@gmail.com",27));
        users.add(new User("user123","user123","User","user@gmail.com",27));

    }
    public static User checkLogin(Login login){
        for (User u: users) {
            if(u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }

}
