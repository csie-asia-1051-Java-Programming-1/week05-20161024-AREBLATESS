package hw;
//有一 n x n的矩陣(1＜n＜21)，輸入 n 後，試以程式繪出此一方陣，方陣結構如下，例如 n=5 時：
import java.util.Scanner;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[][]data=new int[n][n];
		int sum=1;
		for(int a=0;a<n;a++){
			for(int b=0;b<=a;b++){
				data[a-b][b]=sum;
					sum++;
				
				
				System.out.print(data[a][b] + " ");
			}
			System.out.println();
		}
	}

}





















/*int sumi=1;
		int sumj=1;
		int y=0;
		for(int i=0;i<n;i++){
			sumi=sumi+i;
			data[i][0]=sumi;
			for(int j=0;j<n;j++){
				
				if(i+j<n&&j!=0){
					sumj+=1;
					y=y+sumj;
					
				data[i][j]=data[i][0]+y;
				 if(i+j>=n){
					
					data[i][j]=data[i][j-1]+y-1*(n-j);
				}
				 }
				System.out.print(data[i][j] + " ");
			}System.out.println();
		}
	}
		
}*/
