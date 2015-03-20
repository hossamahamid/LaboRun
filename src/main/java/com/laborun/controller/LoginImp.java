package com.laborun.controller;

import com.laborun.dao.LoginDaoImp;
import com.laborun.dao.LoginDaoInt;
import com.laborun.entity.Admin;
import com.laborun.entity.Staff;
import com.laborun.entity.Trainee;
import com.laborun.entity.User;

/**
 * Created by Rainfall on 3/20/2015.
 */
public class LoginImp implements loginInt {

    @Override
    public User signIn(User user) {
        user = getUserType(user);
        if (user != null){
//            User known = UserFactory.getUser(user.getRole());
            return getUserInfo(user);
        }
        return null;
    }

    @Override
    public User getUserType(User user) {
        LoginDaoInt loginDao = new LoginDaoImp();
        return loginDao.getUserType(user);
    }

    @Override
    public User getUserInfo(User user) {
        LoginDaoInt loginDao = new LoginDaoImp();

        if (user instanceof Trainee)
            return loginDao.getTraineeInfo(user);
        else if (user instanceof Staff)
            return loginDao.getStaffInfo(user);
        else if (user instanceof Admin)
            return loginDao.getAdminInfo(user);

        return null;
    }
}
