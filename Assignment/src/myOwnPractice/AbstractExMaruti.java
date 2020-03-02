package myOwnPractice;

public class AbstractExMaruti extends AbstractExCAR { 
	
	AbstractExMaruti(int regno){
		super(regno);
	}
	
	void steering(int direction, int angle) {
		System.out.println("This is ordinary steering");
	}
	
	void braking(int force) {
	System.out.println("this are hydraulic breaks");
	}

}
