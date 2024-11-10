import java.util.Scanner;

public class IT24104089Lab3Q4{
	public static void main (String[]args){
		int Number;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the five digite number : ");
		Number = input.nextInt();
		
		String NumberString = Integer.toString(Number);

        
        for (char digit : NumberString.toCharArray()) {
            System.out.print(digit + " ");
		}
		
	
	
	}




}


