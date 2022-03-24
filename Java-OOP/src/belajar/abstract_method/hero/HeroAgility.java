package belajar.abstract_method.hero;

// inheritance dari abstract Hero
public class HeroAgility extends Hero{
	
	public HeroAgility(String name){
		super(name);
	}

	public void levelUp(){
		this.setLevel(1);
	}
}