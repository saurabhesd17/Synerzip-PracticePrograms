import java.util.*;


class Player{
    String name;
    int age;
    int runs;

    public Player(String name, int age, int runs){
        this.name = name;
        this.age = age;
        this.runs = runs;
    }
}

public class exercise7 {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();

        players.add(new Player("Saurabh", 23, 200));
        players.add(new Player("Akshay", 26, 50));
        players.add(new Player("Shubham", 28, 60));
        players.add(new Player("Kishan", 21, 68));
        players.add(new Player("Pravin", 29, 6));
        players.add(new Player("Sanket", 30, 62));
        players.add(new Player("Kartik", 22, 89));
        players.add(new Player("Hariom", 34, 99));
        players.add(new Player("Swarnit", 45, 49));
        players.add(new Player("Bhushan", 18, 00));

        /**
         * Displaying player above or equals age 28
         */
        // players.stream()
        //         .filter(player -> player.age >= 28)
        //         .forEach(
        //             player -> System.out.println("Name: "+player.name+" age: "+player.age)
        //             );

        /**
         * Displaying who got the max runs
         */
        // Player maxRuns = players.stream()
        //                  .max((player1,player2) -> player1.runs > player2.runs? 1:-1).get();
        // System.out.println("Max runs: "+maxRuns.runs+" by "+maxRuns.name);

        /**
         * Displaying average age
         */
    }
}
