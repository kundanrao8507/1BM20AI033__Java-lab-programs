public abstract class Animal {

	
	protected int legs;

	
	protected Animal(int legs) {
		this.legs = legs;
	}

	
	abstract public void eat();

	
	public void walk() {
		System.out.println("The animal is walking on " + legs + " legs");
	}

}

public class Spider extends Animal {

	public Spider() {
		super(8);

	}

		public void eat() {
		System.out.println("Spider eats insects");
	}

}

public interface Pet {
	
	public String getName();
	
	public void setName(String name);
	
	public void play();

}

public class Rabbit extends Animal implements Pet {
	
	
	private String name;

	
	public Rabbit(String name) {
		super(4);
		this.name = name;
	}

	
	public Rabbit() {
		super(4);
		this.name = "";
	}

	

	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public void play() {
		System.out.println("Rabbit is playing");
	}


	public void eat() {
		System.out.println("Rabbit is eating carrot");
	}

}



public class Fish extends Animal implements Pet {
	
	private String name;

	public Fish(String name) {
		super(0);
		this.name = name;
	}
	

	public Fish() {
		super(0);
		this.name = "";
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void play() {
		System.out.println("Fish is playing");
	}

	public void eat() {
		System.out.println("Fish is eating fish food");
	}
	

	public void walk() {
		System.out.println("Fish can't walk");
	}

}

public class TestAnimals {
	public static void main(String[] args) {

		Animal spider = new Spider();
		Animal rabbit = new Rabbit("Clue");
		Animal fish = new Fish("Joe");
		spider.eat();
		spider.walk();
		rabbit.eat();
		rabbit.walk();
		fish.eat();
		fish.walk();
		Pet rab = new Rabbit("Sushi");
		Pet fis = new Fish("Megan");
		rab.play();
		fis.play();

	}
}
