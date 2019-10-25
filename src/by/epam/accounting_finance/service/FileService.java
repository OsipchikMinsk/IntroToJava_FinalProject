package by.epam.accounting_finance.service;

import by.epam.accounting_finance.beans.User;

import java.io.IOException;
import java.util.List;

public interface FileService {

    String USER_FILE_PATH = "asdasd";
    String PASS_FILE_PATH = "asdasd";


    byte[] getUsersData(String name);


}
