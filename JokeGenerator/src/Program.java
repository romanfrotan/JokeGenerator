
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        //test jokes

        JokeManager manager = new JokeManager();
        manager.addJoke("Did you hear about the claustrophobic astronaut?"+"\n"+"He just needed a little space.");

        manager.addJoke("Why cant scientists trust atoms"+"\n"+"because they make up everything!");

        manager.addJoke("What did the shark say when he ate the clownfish?"+"\n"+"This tastes a little funny");


        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(manager, scanner);
        ui.start();
    }
}
