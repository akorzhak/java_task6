/*
 * Controller
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

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    private String login;
    private String password;

    /**
     * Constructor, initializes a new object.
     * @param model
     * @param view
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Work method.
     * Creates a new user.
     */
    public void processUser() {

        model.fillDataBase();
        Scanner sc = new Scanner(System.in);

        inputPassword(sc);
        do {
            try {
                inputLogin(sc);
            } catch (UnavailableLoginException e) {
                view.printMessage(View.UNAVAILABLE_LOGIN);
            }
        } while (! model.isValidLogin(login));

        model.setDataBase(login, password);
        view.printMessage(View.DATA_BASE);
    }

    /**
     * Records user password.
     * @param sc
     */
    private void inputPassword(Scanner sc) {

        view.printMessage(View.PASSWORD);
        password = sc.nextLine();
        while (!password.matches(".{5,}")) {
            view.printMessage(View.WRONG);
            view.printMessage(View.PASSWORD);
            password = sc.nextLine();
        }
    }

    /**
     * Records user login.
     * @param sc
     * @throws UnavailableLoginException
     */
    private void inputLogin(Scanner sc) throws UnavailableLoginException {

            view.printMessage(View.LOGIN);
            login = sc.nextLine();
            while (!login.matches("[a-z]{3,}[1-9_]*")) {
                view.printMessage(View.WRONG);
                view.printMessage(View.LOGIN);
                login = sc.nextLine();
            }
            if (!model.isValidLogin(login))
                throw new UnavailableLoginException();
    }
}