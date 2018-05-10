package may05;

public class DoWhile {
	public static void main(String[] args) {
		//先运行一次 在判断
		int i =0;int sum=0;
		do {
			
			if(i%2==0){
				System.out.println(i);
				sum+=i;
			}
			i++;
			
		}while(i<=100);
		System.out.print("sum="+sum);
		
	}

}
