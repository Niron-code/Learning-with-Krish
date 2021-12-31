public class Blocks {

	static int count = 0;

	public Blocks() {
		System.out.println("Hi From Constructor");
	}

	static {
		System.out.println("Greetings from Static Block");
		count=count+1;
		System.out.println("Count from static : " + count);
		System.out.println("End of Static Block");
	}

	{
		System.out.println("I am Empty");
		count=count+1;
		System.out.println("Count from Empty : " +count);
	}

	public static void main (String [] args) {
		System.out.println("The count before object creation is: " +count);
		Blocks obj = new Blocks();
		System.out.println("");
		Blocks obj_1 = new Blocks();
		System.out.println("The count after 2 object creations is: " +count);
	}
  
 
}