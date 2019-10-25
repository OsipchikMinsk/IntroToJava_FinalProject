package by.epam.accounting_finance.controller;

import by.epam.accounting_finance.beans.User;
import by.epam.accounting_finance.service.UserService;
import by.epam.accounting_finance.service.UserServiceImpl;

public class UserController {
    private UserService userService = new UserServiceImpl();


    public User getUser(String name){


        return userService.getUser(name);
    }
}
