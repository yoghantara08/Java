package belajar.static_keywords.class_attributes;

class Display{
    static String type = "Static";
    private String name;

    Display(String name){
        this.name = name;
    }

    void setType(String gantiType){
        // type = gantiType; // alternatif 1
        // this.type = gantiType; // alternatif 2
        Display.type = gantiType; // rekomen
    }

    void show(){
        System.out.println("Display name = " + this.name);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Display display1 = new Display("Monitor");
        display1.show();

        Display display2 = new Display("Mobile");
        display2.show();

        // tampilkan static variable / class variable
        // System.out.println(display1.type);
        System.out.println(Display.type);

        // memcoba mengganti variable static
        display1.setType("Ganti Static");

        // System.out.println(display1.type);
        System.out.println(Display.type);
    }
}
