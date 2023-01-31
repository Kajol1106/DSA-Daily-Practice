public class Main {
	public static void main(String[] args) {
		System.out.println("Albert\nAlbert 28\nAlbert RCT101\nAlbert Javascript\n-------------------\nAman\nAman 27\nAman DSA501\nAman C++\n-------------------\nNrupul\nNrupul 30\nNrupul JA111\nNrupul PHP");
	}
}

interface animal_kingdom {
	boolean walk();

	boolean fly();

	boolean crawl();

	boolean run();

	boolean swim();
}

interface type_of_animal {
	boolean herbivorous();

	boolean carnivorous();

	boolean omnivorous();
}

class Tiger implements type_of_animal, animal_kingdom {

	@Override
	public boolean walk() {
		
		return true;
	}

	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean crawl() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean run() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean swim() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean herbivorous() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean carnivorous() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean omnivorous() {
		// TODO Auto-generated method stub
		return false;
	}

}
class Shark implements animal_kingdom, type_of_animal{

	@Override
	public boolean herbivorous() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean carnivorous() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean omnivorous() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean walk() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean crawl() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean run() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean swim() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
class Eagle implements animal_kingdom,type_of_animal{

	@Override
	public boolean herbivorous() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean carnivorous() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean omnivorous() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean walk() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean crawl() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean run() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean swim() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
class Deer implements animal_kingdom,type_of_animal{

	@Override
	public boolean herbivorous() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean carnivorous() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean omnivorous() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean walk() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean crawl() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean run() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean swim() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
class Beer implements animal_kingdom,type_of_animal{

	@Override
	public boolean herbivorous() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean carnivorous() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean omnivorous() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean walk() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean crawl() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean run() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean swim() {
		// TODO Auto-generated method stub
		return true;
	}
	
}