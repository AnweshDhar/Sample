package myOwnPractice;



public class InharitancePrac2 extends InharitancePrac1 {
	
	
	void add(int x,int y) {
		int z=x-y;
		System.out.println("Add of int,int in InharitancePrac2 class:" +z);
		super.add(x, y);
		System.out.println("Add of int,int in InharitancePrac1 class:" +super.v);
		}
	
	
	void add(double x,double y) {
		double z=x+y;
		System.out.println("Add of double,double in C2 class:" +z);// if we compare C1 and C2,then it is overloading in C2
	}
	
	void mul(int x,int y) {
		int z=x*y;
		System.out.println("Mul of int,int in C2 class:" +z);
	}
	
	public static void main(String[] args) {
	  InharitancePrac2 obj1 = new InharitancePrac2();
 	  InharitancePrac1 obj2 = new InharitancePrac2();
 	   obj2.add(30,20);
 	   //obj1.add(10, 20.2);
 	   
 	  }
	
}


