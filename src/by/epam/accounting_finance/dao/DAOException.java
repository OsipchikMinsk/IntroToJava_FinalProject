package by.epam.accounting_finance.dao;

public class DAOException extends Exception {

    public DAOException (){
        super();
    }
    public DAOException (String message){
        super(message);
    }
    public DAOException (String message, Exception e){
        super(message,e);
    }
}
