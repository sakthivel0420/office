
import java.util.Scanner;
/**
* Getting a input and Printing a message
* @author sakthi vel (expleo)
* @since 04/09/2023
*/

class Laptop  {

	public static void main(String [] args){
	
	
	Scanner read = new Scanner(System.in);//scanner object created to read datas
	
	System.out.println("Enter the laptop name:");// Reading string data 
	
	String $message = read.nextLine() ;
	
	System.out.println("Enter the ram size:"); 
	
	String value = read.nextLine();
	
	System.out.println("Enter the model Number");
	
	String Number = read.nextLine();
	
	System.out.println("Enter the price:");// Reading a Integer data 
	
	int Price = read.nextInt();
	
	System.out.println("Enter the screen size:");
	
	float screen = read.nextFloat();
	
	System.out.println("Enter the processor");
	
	String Processor = read.nextLine();
	
	
		
	System.out.println("name: "+$ message);
	System.out.println("RAM: "+value);
	System.out.println("Model Number: "+Number);
	System.out.println("Rate: "+Price);
	System.out.println("Screen size: "+screen);
	System.out.println("processor: "+Processor);
	
	
	}

}
