package practical5;
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Multiplication Table of 15
		int a,i,b;
		System.out.println("Enter any Integer : ");
		Scanner obj = new Scanner(System.in);
		a = obj.nextInt();
		i=1;
		while(i<=12)
		{
			System.out.println(a+"x"+i+"="+a*i);
			i++;
		}
		

	}

}
