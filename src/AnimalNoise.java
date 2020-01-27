import model.*;

public class AnimalNoise {
	//add your animal class to the model package
	//only push this file and the animal class you created

	public static void main(String[] args) {
		Cat fluffy = new Cat();
		System.out.println(fluffy.speak());
    
		Donkey joe = new Donkey("Joe", "Brown", 4);
		System.out.println(joe.speak());

		Pig mrCuddles = new Pig("Mr. Cuddles", "pink", 4);
		System.out.println(mrCuddles.speak());
		
		Lion simba = new Lion(false, 2, "Simba");
		System.out.println(simba.speak());
    
		Rabbit MrNibbles = new Rabbit();
		System.out.println(MrNibbles.speak());
		
		Dog pepper = new Dog("Pepper", "Brown", 5);
		System.out.println(pepper.speak());
		
		Sheep arthur = new Sheep("Arthur", "white", 9);
		System.out.println(arthur.speak());
				
		Eagle sam = new Eagle("North America", "Bald", true);
		System.out.println(sam.speak());
		
		Horse seabiscuit = new Horse("Seabiscuit", 13, "Thoroughbred");
		System.out.println(seabiscuit.speak());
		
		Mouse jerry = new Mouse("Jerry", "Brown", 2);
		System.out.println(jerry.speak());
    
		Parrot polly = new Parrot(false, false, new String[]{"polly wanna cracker"});
		System.out.println(polly.speak());
		
		Frog kermit = new Frog("Kermit", "Green", 64);
		System.out.println(kermit.speak());
		
		Tiger tony = new Tiger("Tony", "Orange", 36);
		System.out.println(tony.speak());

		Elephant Dumbo = new Elephant ("Dumbo", "Gray", 100);
		System.out.println(Dumbo.speak());
    
    Unicorn alice = new Unicorn("Alice", "Rainbow Sparkles", true);
		System.out.println(alice.speak());
    
   	Cow bertha = new Cow("Big Bertha", "Brown", 14);
		System.out.println(bertha.speak());
    
    Cricket jiminey = new Cricket("Jiminey The Cricket", "Brown", 3);
		System.out.println(jiminey.speak());
    
    Rooster leghorn = new Rooster("Foghorn Leghorn", "White", 4);
		System.out.println(leghorn.speak());
    
		Monkey george = new Monkey("george", "brown", 10);
		System.out.println(george.speak());
    
    Spider diego = new Spider("diego", "red and black", 21);
		System.out.println(diego.speak());
	}

}

