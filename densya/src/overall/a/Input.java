package overall.a;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
	public static int nextInt(int minRange,int maxRange){
		Scanner sc=new Scanner(System.in);
		
		while(true){
			try{
				int inf=sc.nextInt();
				if(inf>=minRange&&inf<=maxRange){
					return inf;
				}
				else {
					System.out.println(minRange+"から"+maxRange+"の間の整数を入力してください");
				}
			}catch(InputMismatchException exception){
				System.out.println("正しい整数を入力してください");
				String cString=sc.next();
				
			}
			
		}
	}
}
