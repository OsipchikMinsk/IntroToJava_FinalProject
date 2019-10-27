package by.epam.accounting_finance.dao.impl;

import by.epam.accounting_finance.beans.User;
import by.epam.accounting_finance.dao.DAOException;
import by.epam.accounting_finance.dao.DAOFactory;
import by.epam.accounting_finance.dao.FileReaderDAO;
import by.epam.accounting_finance.dao.UserDAO;
import by.epam.accounting_finance.service.SerializationService;
import by.epam.accounting_finance.service.ServiceFactory;
import by.epam.accounting_finance.service.impl.SerializationServiceImpl;

public class FileUserDaoImpl implements UserDAO {



    private SerializationService serializationService = new SerializationServiceImpl();

    @Override
    public void save(User user) throws DAOException {

    }

    @Override
    public User getUser(String name) throws DAOException {
        return null;
    }

    /*@Override
    public void getUser(String name) throws DAOException {
        serializationService.getUserFromFile(name);
    }*/

    @Override
    public void update(User user) throws DAOException {

    }

    @Override
    public void deleteUser(User user) throws DAOException {

    }



    public void authorization(String login, String password) throws DAOException {
        DAOFactory daoFactory = DAOFactory.getInstance();
        FileReaderDAO fileUserDao = daoFactory.getFileReaderDAOImpl();
        //fileUserDao.getAuthorizationData();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();


    }


    public void registration(User user) throws DAOException {


    }
}
