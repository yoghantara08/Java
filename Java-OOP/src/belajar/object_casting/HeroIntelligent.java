package belajar.object_casting;

public class HeroIntelligent extends Hero{
    public String type;

	public HeroIntelligent(String name, double health){
		super(name,health);
		this.type = "intel";
	}

	public void display(){
		System.out.println(this.getName() + " is an " + this.type + " Hero");
	}

	public void castMagic(){
		System.out.println("Mengeluarkan Mejik");
	}
}
