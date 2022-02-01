package overall.a;

public class Money {

	public static final int[] kinds={10000,5000,1000,500,100,50,10};
	public static void showMenu(){
		for(int i=0;i<kinds.length;i++)
		{
			
			System.out.println(i+1+":"+kinds[i]+"円");
		}
	}
}
