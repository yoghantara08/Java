package belajar.multi_file_package.main;

class Player{
    private String name;

    Player(String name){
        this.name = name;
    }

    void setName(String name){
        this.name = name;
    }

    void show(){
        System.out.println("Name = " + this.name);
    }
}