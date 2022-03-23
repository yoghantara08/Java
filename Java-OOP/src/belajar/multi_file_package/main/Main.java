package belajar.multi_file_package.main;

// import package external
import belajar.multi_file_package.terminal.Console;

class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Rama");
        Player player2 = new Player("Galang");

        player1.show();
        player2.show();

        Console.log("halo");
    }
}
