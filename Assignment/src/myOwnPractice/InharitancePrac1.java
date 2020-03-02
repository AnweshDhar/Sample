package myOwnPractice;

public class InharitancePrac1 {
	
	int v=40;
	
	void add(int x,int y) {
		int z=x+y;
		System.out.println("Add of int,int in C1 class:" +z);
	}

	void add(int x,double y) {
		double z=x+y;
		System.out.println("Add of int,double in C1 class:" +z);
	}
	
	void add(int x,int y, int k) {
		int z=x+y+k;
		System.out.println("Add of int,int,int in C1 class:" +z);
	}
	
	void sub(int x,int y) {
		int z=x-y;
		System.out.println("Sub of int,int in C1 class:" +z);
	}

}
