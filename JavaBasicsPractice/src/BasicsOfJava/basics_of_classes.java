package BasicsOfJava;

public class basics_of_classes {
	 
	
	public static void main(String[] args) {

		student[] students  = new student[5];
		System.out.println(students);
		
		//by default constructor
		student s2 = new student();
		
		System.out.println("S1 number = "+ s2.name);
		System.out.println("S1 rollnumber = "+ s2.rollnumber);
		System.out.println("S1 marks = "+ s2.marks);
		
		student s1 = new student();
		s1.marks=30;
		s1.name="Swapnil";
		s1.rollnumber=21;
		System.out.println("S1 number = "+ s1.name);
		System.out.println("S1 rollnumber = "+ s1.rollnumber);
		System.out.println("S1 marks = "+ s1.marks);

		//User defined constructor
		student s3 = new student(12, "Tushar", 49);
		System.out.println("S2 number = "+ s3.name);
		System.out.println("S2 rollnumber = "+ s3.rollnumber);
		System.out.println("S2 marks = "+ s3.marks);
		
		
	}

}

 class student{
	
	int rollnumber;
	String name;
	float marks;
	
	// By default constructor
	student(){
		this.name="FirstStudent";
		this.marks=00;
		this.rollnumber=00;
	}
	
	
	//User defined constructor
	student (int rollnumber, String name, float marks){
		this.name=name;
		this.marks=marks;
		this.rollnumber=rollnumber;


		
		
	}
}
