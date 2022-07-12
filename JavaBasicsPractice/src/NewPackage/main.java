package NewPackage;

import javax.swing.Spring;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}
	
	static void fun() {
		main ob = new main();
		ob.greeting();
		System.out.println("fun");
	}
	
	 void greeting() {
		 fun();
		System.out.println("Hello !");
			
		}
	
	
	public static void main(String[] args) {
		
		human h1 = new human(23, "Swapnil");
		human h2 = new human(25, "Tushar");
		System.out.println(h1.population);
		System.out.println(h2.population);
		
		fun();
		
		
		
		}

}
