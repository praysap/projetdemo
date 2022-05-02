package dem0;

import java.util.Scanner;

//Create a class Training having fields like studentid, name ,address,phone.
//create two inner classes onlinetraining and offline trainning
//In online training define fields like duration,onlinemarks.
//a) define getdata and show data method of same class
//In offline training define fileds like boolean systemallocation,offlinemarks.
//a) define input and display methods in same class


//create main method in Training class and show menu
//1) offline training
//2) online training

	class Training{

	int Studentid,phone;
	String name,Address;
	
	Scanner s= new Scanner(System.in);
	
	class onlinetraining {
	int duration,onlinemarks;
	
	
	void getdata() {
		System.out.println("Enter the student id, phone, name and Address ");
		Studentid=s.nextInt();
		phone=s.nextInt();
		name=s.next();
		Address=s.next();
		
			}
	
	void showdata() {
		System.out.println(Studentid+"  "  +phone+" " +name+ " " +Address);
	}
	}
	
	class offlinetrainning{
	
	boolean systemallocation;
	int offlinemarks;
	Scanner s= new Scanner(System.in);
	
	void input() {
		System.out.println("Enter the offlinemarks");
		offlinemarks=s.nextInt();
		
		if (offlinemarks<=40){
			systemallocation = false;
			}
		
		else {
			systemallocation = true;
			}
		}

	void display() {
		System.out.println( systemallocation+"  "  +offlinemarks);
	}
}
	}

public class StudentRegistration {
	
	public static void main(String[] args) {
	    Training t=new Training();
	    Training.onlinetraining o1=t.new onlinetraining();
	    Training.offlinetrainning o2=t.new offlinetrainning();
	  
	    int ch;
	    do {
	    System.out.println("\n1. onlinetraining");
	    System.out.println("2. offlinetrainning");
	    System.out.println("3. Exit");
	    Scanner s= new Scanner(System.in);
	    System.out.println("Enter your choice");
	    ch= s.nextInt();
	    switch(ch) {
	 
	    case 1:o1.getdata();
	    		o1.showdata();
	    		break;
	    		
	    case 2:o2.input();
	    		o2.display();
	    		break;
	    
	    case 3: System.out.println("Sucessfully Exit");
	    		break;
	    default: System.out.println("wrong choice");
	    }
	    }while(ch!=0);
}

}
