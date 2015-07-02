import java.util.Scanner;


public class Bottle {

	private int Marbles;
	private int Max=100;
	private int Min =0;
	
	public void read(){
		Scanner keyboard = new Scanner(System.in);
		int input = keyboard.nextInt();
		this.Marbles=input;
		if (Marbles>100){
			System.out.println("That number is too big.");
			System.exit(0);}
			else if (Marbles<0){
			System.out.println("That number is too small.");
			System.exit(0);
			}
		}

	
	public void set(int num){
		if(num<Min){
			System.out.println("That number is too small");
			System.exit(0);
		}
		else if(num>Max){
			System.out.println("That number is too big.");
			System.exit(0);
		}
		else Marbles=num;
	}
	
	public int getMarbles(){
		return Marbles;
		
	}
	public Bottle add(Bottle object){
		Bottle new1 = new Bottle();
		if (Marbles<0){
			System.out.println("There cannot be negative marbles.");
		}
		else if(Marbles>Max){
			System.out.println("That number is too big");
		}
		else{ ;
		new1.set(Marbles + object.Marbles);
	}
	
	return new1;
}
	public Bottle subtract(Bottle object){
		Bottle object1 = new Bottle();
		if (Marbles<0){ // this is checking the object acessing the method "object 2" to see if it is lower than zero."
			System.out.println("There cannot be negative marbles.");
		}
		object1.set(Marbles-object.Marbles);
		return object1;
	}
	
	public Bottle multiply(Bottle object){ 
		Bottle whatever = new Bottle();
		whatever.set(object.Marbles * Marbles);
		return whatever;
		
		
	}

	public boolean equals(Bottle object){
		
		if (object.Marbles==Marbles){
			return true;
		}
		else return false;
	}
	
	
	public Bottle divide(Bottle object){
		Bottle object1 = new Bottle();
		object1.set(Marbles/object.Marbles);
		return object1;
		
		
	}
	public Bottle divide(int num){
		Bottle object2 = new Bottle();
		object2.set(Marbles/num);
		return object2;
	}

public Bottle add(int x){
	Bottle temp = new Bottle();
	temp.set(x+this.Marbles);
	return temp;
}



public String toString(){ 
String word ="";
word = word + Marbles;
return word;
		
}	
}

