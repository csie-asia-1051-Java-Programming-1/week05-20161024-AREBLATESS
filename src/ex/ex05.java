package ex;
/*
 * Topic: 設計一個程式由 0~9 的亂數隨機產生一 10*10 的二維陣列，將行列互換輸出(即輸出轉置矩陣)
 * Date: 2016/10/24
 * Author: 105021008 陳畯程
 */
import java.util.Random;
public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd=new Random();
		int[][]data=new int[10][10];
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				data[i][j]=rnd.nextInt(10);
				System.out.print(data[i][j]+"  ");
			}
			System.out.println();
			
		}System.out.println();
		for(int j=0;j<10;j++){
			for(int i=0;i<10;i++){
				System.out.print(data[i][j]+"  ");
			}System.out.println();

		}

	}
}