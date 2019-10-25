package by.epam.accounting_finance.dao;

import by.epam.accounting_finance.beans.User;
import by.epam.accounting_finance.service.SerializationService;
import by.epam.accounting_finance.service.SerializationServiceImpl;

public class UserDaoImpl implements UserDao{
    private SerializationService serializationService = new SerializationServiceImpl();

    @Override
    public User getUser(String name) {
        return serializationService.getUserFromFile(name);
    }

    @Override
    public User save(User user) {


        return null;
    }

    @Override
    public void delete(User user) {

    }
}
