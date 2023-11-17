import java.util.Scanner;

public class UserInterface {

    private JokeManager jokeManager;
    private Scanner input;

    public UserInterface(JokeManager jokeManager, Scanner input) {
        this.jokeManager = jokeManager;
        this.input = input;
    }

    public void start() {
        while (true) {
            printMenu();
            String command = input.nextLine();

            if (command.equals("1")) {
                System.out.println("Write the joke to save in list :");
                String joke = input.nextLine();
                jokeManager.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println(jokeManager.drawJoke());
            } else if (command.equals("3")) {
                jokeManager.printJokes();
            } else if (command.equals("x")) {
                break;
            }
        }
    }

    public void printMenu() {
        System.out.println("\n"+"What should we do?: ");
        System.out.println("1 - add a joke");
        System.out.println("2 - tell a joke");
        System.out.println("3 - list all jokes");
        System.out.println("x - stop joking");
    }
}

