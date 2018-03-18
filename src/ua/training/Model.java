/*
 * Model
 *
 * Description: This source file is a part of Java program,
 * that records login and password input from the command line.
 *
 * By: Alyona Korzhakova
 *
 * Created: 2018/03/18
 *
 * Updated: 2018/03/18
 */
package ua.training;

import java.util.HashMap;

public class Model {

    private HashMap<String, String> dataBase = new HashMap<>();

    /**
     * Sets pseudo database.
     */
    public void fillDataBase() {
        dataBase.put("ann1", "qwerty");
        dataBase.put("ann12", "12345");
        dataBase.put("ann123", "98765");
        dataBase.put("user1", "abcde");
        dataBase.put("user12", "zxcvbn");
        dataBase.put("user123", "password");
        dataBase.put("login1", "qazwsxedc");
        dataBase.put("login12", "qazw123");
        dataBase.put("login123", "mnbvcxz");
    }

    /**
     * Adds a new user to database.
     * @param login
     * @param password
     */
    public void setDataBase(String login, String password) {
        dataBase.put(login, password);
    }

    public HashMap<String, String> getDataBase() {
        return dataBase;
    }

    /**
     * Checks login for uniqueness.
     * @param key
     * @return true - if login is unique, otherwise - false.
     */
    public boolean isValidLogin(String key) {
        return (! dataBase.containsKey(key));
    }
}