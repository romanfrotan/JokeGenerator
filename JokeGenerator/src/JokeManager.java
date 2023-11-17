import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokes;


    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        jokes.add(joke);
    }

    public String drawJoke() {
        System.out.println("Telling a joke...");
        if (jokes.size() > 0) {
            Random draw = new Random();
            int index = draw.nextInt(jokes.size());
            return jokes.get(index);
        } else {
            return "No jokes in joke book :(";
        }
    }

    public void printJokes() {
        System.out.println("known jokes:");
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
