import java.util.Scanner;
import java.util.Random;

public class RandomNumberGenerator{
	public static void main (String args[]){
		Scanner Scan = new Scanner(System.in);
		Random random = new Random();

		System.out.print("ENter the upperlimit of the number you want to generate: ");
		int upperLimit = Scan.nextInt();
		
		if(upperLimit == 0) {
			System.out.println("The number must be greater than 0");
		}
		else{
			int randomNum = random.nextInt(upperLimit) + 1;
			System.out.printf("The Generated Random number from 0 -%d is %d%n", upperLimit,randomNum);
		}
	}
}