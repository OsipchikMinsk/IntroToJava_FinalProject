package by.epam.accounting_finance.service;

import by.epam.accounting_finance.beans.User;
import by.epam.accounting_finance.dao.UserDao;
import by.epam.accounting_finance.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao = new UserDaoImpl();


    @Override
    public User getUser(String name) {
        return userDao.getUser(name);
    }
}


