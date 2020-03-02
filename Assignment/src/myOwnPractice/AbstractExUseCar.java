package myOwnPractice;

public class AbstractExUseCar {

	public static void main(String[] args) {
		
		AbstractExMaruti m = new AbstractExMaruti(1001);// 1001 is regno
		AbstractexSantro s = new AbstractexSantro(5001);//5001 is regno
		// m. it will show AbstractExCAR and AbstractExMaruti class method
		AbstractExCAR ref;
		ref = m;
		ref.braking(80);
		//ref. it will show AbstractExCAR class methods all,even AbstractExMaruti class method also show in AbstractExCAR class
        ref = s;
        ref.steering(2, 25);
	}

}
