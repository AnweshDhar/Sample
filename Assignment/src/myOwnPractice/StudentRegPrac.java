package myOwnPractice;



public class StudentRegPrac {
	
	String name;
	int age;
	static String school ="Narayana school";
	
	void register() {
		System.out.println("student registered successfully");//non static method/instance
	}
  
	
	void delete() {
		System.out.println("student deleted successfully");
	}
	

	
	


public static void main(String[] args) {
	
	StudentRegPrac st1= new StudentRegPrac();
	StudentRegPrac st2= new StudentRegPrac();
	
	st1.name="suresh";
	st1.age=15;
	//st1.register();
	
	st2.name="John";
	st2.age=13;
	//st2.register();
	
	
	System.out.println(st1.name);
	System.out.println(st1.age);
	
	
	System.out.println(school);
	System.out.println(StudentRegPrac.school);//normally we use this syntax to get school name(which is static) in different class
	System.out.println(st1.school);
	System.out.println(st2.school);
	
	st1.school="chaitanya school";
	
	System.out.println(st2.name);
	System.out.println(st2.age);
	
	System.out.println(school);
	System.out.println(StudentRegPrac.school);
	System.out.println(st1.school);
	System.out.println(st2.school);
}
}

