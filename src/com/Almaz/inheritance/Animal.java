package com.Almaz.inheritance;

public class Animal {

	protected void sound(
			) {
		System.out.println("Animal Sound.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal =new Dog();//Liskov substitution supperclass by gradsuper class
		animal.sound();
		Mamal mamal = new Dog();// called substituting dog superclass by child and is called Liskov substitution 
		mamal.breastFeeding();
		// can be added as 
		animal  = new cat();
	}

}

class Mamal extends Animal {
	//@override
	protected void sound() {
		System.out.println("Mamals sound.");
	}
	public void breastFeeding() {
		System.out.println("Mamals are breast feeding.");
	}
}
class Dog extends Mamal {
	
}
// to add cat to the animal group , we can add new line and new class
//with out changing any paramater as is already tested and 
//this is called closed modification that is with out modifying existing code by team or any one else 
// opened to extension 
class cat extends Mamal{
	
}