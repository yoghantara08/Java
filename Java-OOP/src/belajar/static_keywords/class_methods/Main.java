package belajar.static_keywords.class_methods;

import java.util.ArrayList;

class Player {
    private String name;
    private static int numberOfPlayer;
    private static ArrayList<String> nameList = new ArrayList<String>();

    Player(String name){
        this.name = name;
        Player.numberOfPlayer++;
        Player.nameList.add(this.name);
    }

    void show(){
        System.out.println("Player Name = " + this.name);
    }

    public String getName(){
        return this.name;
    }

    // Static method
    static void showNumberOfPlayer(){
        System.out.println("Number Of Player = " + Player.numberOfPlayer);
    }

    static ArrayList<String> getNames(){
        return Player.nameList;
    }
}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Ricky");
        Player player2 = new Player("Rama");
        Player player3 = new Player("Galang");
        Player player4 = new Player("Krisdit");

        System.out.println(player1.getName());
        System.out.println(player2.getName());
        System.out.println(player3.getName());
        System.out.println(player4.getName());

        Player.showNumberOfPlayer();
        
        // menampilkan semua name
        System.out.println("Names = " + Player.getNames());
    }
}
