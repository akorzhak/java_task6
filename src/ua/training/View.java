/*
 * View
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

public class View {

    public static final String LOGIN = "Input your LOGIN =\n" +
            "(must contain at least 3 letters)";
    public static final String PASSWORD = "Input your PASSWORD =\n" +
            "(must contain at least 5 symbols)";
    public static final String WRONG = "WRONG input! Repeat please!\n";
    public static final String UNAVAILABLE_LOGIN = "Login is UNAVAILABLE! "
            + "Choose another one!";
    public static final String DATA_BASE = "Your data has been successfully "
            + "recorded.\nThank you.";

    /**
     * Prints a message.
     * @param message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }
}