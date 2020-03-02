package myOwnPractice;

public class AbstractexSantro extends AbstractExCAR {
	
	AbstractexSantro(int regno){
		super(regno);
	}
	
	void steering(int direction, int angle) {
		System.out.println("This car uses  power steering");
	}
	
	void braking(int force) {
	System.out.println("This car uses  gas  breaks");
	}


}
