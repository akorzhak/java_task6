/*
 * Main
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

public class Main {
    public static void main(String[] args) {

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.processUser();
    }
}