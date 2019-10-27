package by.epam.accounting_finance.dao;
import by.epam.accounting_finance.beans.User;

public interface UserDAO {

    //create
    void save(User user) throws DAOException;

    //read
    User getUser(String name)throws DAOException;

    //update
    void update(User user)throws DAOException;

    // delete
    void deleteUser(User user)throws DAOException;




}
