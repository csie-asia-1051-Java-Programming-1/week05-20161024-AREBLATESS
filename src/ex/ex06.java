package ex;
/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 105021008 陳畯程
 */
import java.util.Scanner;
public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入人數");
		int n=scn.nextInt();
		System.out.print("請輸入學號");
		
		int[]data=new int[n];
		int tank=0;
		for(int a=0;a<n;a++){
			data[a]=scn.nextInt();
		}
		for(int i=0;i<data.length-1;i++){
			for(int j=0;j<data.length-1;j++){
				if(data[j]<data[j+1]){
					tank=data[j];
					data[j]=data[j+1];
					data[j+1]=tank;
				}
			}
		}
			for(int z=0;z<n;z++){
			System.out.print(data[z]+" ");
		}
		
		
	}

}
