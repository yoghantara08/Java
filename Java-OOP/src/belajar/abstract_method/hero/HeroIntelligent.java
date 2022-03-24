package belajar.abstract_method.hero;

// inheritance dari abstract Hero
public class HeroIntelligent extends Hero{
	
	public HeroIntelligent(String name){
		super(name);
	}

	public void levelUp(){
		this.setLevel(2);
	}
}
