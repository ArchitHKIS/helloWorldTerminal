import java.util.Scanner;
public class Potato1{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	potato potato = new potato();
	System.out.println("Enter Name: ");
	potato.setName(input.nextLine());
	System.out.println("Name: " + potato.getname());
	System.out.println("Enter size: ");
		potato.setsize(input.nextInt());
	
	System.out.println("Size: " + potato.getsize());
	System.out.println("   "); //puts space in between the final results and the previous size inputed. 
		System.out.println("Final Name: " + potato.getname());
		System.out.println("Final Size: " + potato.getsize());	
	}	
}
