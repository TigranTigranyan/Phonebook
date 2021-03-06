package controller;


import model.Email;
import model.Number;
import model.User;

public interface UserController {
    void create(String userName, User user);
    void delete(String name);
    void addNumberInExisting(String userName, Number number);
    void addEmailInExisting(String userName, Email email);
    void updateNumber(String userName, Number number, int index);
    void showAll();
    String getAllNames();
    String showAllEmailsOfAUser(String name);
    String showAllNumbersOfAUser(String name);
    void updateEmail(String userName, Email email, int index);


}

