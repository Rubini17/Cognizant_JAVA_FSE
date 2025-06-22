package singletonpattern;

public class Test {

	public static void main(String[] args) {
		
		Logger l1 = Logger.getInstance();
		l1.log("Logged in from l1");
		
		Logger l2 = Logger.getInstance();
		l2.log("Logged in from l2");

		System.out.println("l1 == l2 is "+ (l1 == l2));
	}

}
