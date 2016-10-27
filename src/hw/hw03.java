package hw;
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		double n=scn.nextInt();
		int m=0;
		double sum=n;
		for(int i=1;sum<10000;i++){
			sum=Math.pow(n,i);
			m++;
		}
		System.out.print(m);

	}

}
