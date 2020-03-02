package myOwnPractice;

public abstract class AbstractExCAR {
	
	int regno;
	//parameterized constructor
	AbstractExCAR(int r){
		regno = r;
	}
	
	// all cars will have a fuel tank and same mechanism to open the tank
	void openTank() {
		System.out.println("Fill the tank");
	}
	
	// all cars will have steering but different cars will have different steering mechanism
	abstract void steering(int direction, int angle);
	
	//all cars will have break but different cars will have different braking mechanism
	abstract void braking(int force);

}
