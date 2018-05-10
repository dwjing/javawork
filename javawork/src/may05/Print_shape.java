package may05;
import java.util.Scanner;

public class Print_shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ָ����ܣ�");
		System.out.print("1����ӡֱ��������"+"      "+"2����ӡ����������"+"\n");
		System.out.println("������ָ�");
		int x=0;
		int size=0;
		boolean flag=false;
				Scanner sc=new Scanner(System.in);
				x=sc.nextInt();
				if(x==1||x==2)
				{
					System.out.println("����������������������֧��1-9��");
					Scanner scc=new Scanner(System.in);
					size=scc.nextInt();
					scc.close();
					flag=true;
				}
				else
				{
					System.out.println("����������1����2.....");
				}
				sc.close();
		
		if(flag)
		{
			if(x==1)
			{
				right_triangle(size);
			}
			else 
			{
				isosceles_triangle(size);
			}
		}
		
		System.out.println("ָ��====="+x);
	}
	public static void right_triangle(int n)
	{
		for(int row=0;row<n;row++)
		{
			for(int col=0;col<=row;col++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void isosceles_triangle(int n)
	{
		int space=n-1;
		for(int row=0;row<n;row++)
		{
			for(int col=0;col<(2*n-1);col++)
			{
				if(col<space||(2*n-1-1-col)<space)//��Ϊ��0��ʼ������n=4,����ȡֵ0-6,(2*n-1)==7,����Ҫ���1
				{
					System.out.print(" ");
				}
				else
				{					
					System.out.print("*");
				}
			}
			System.out.println("");
			space--;
		}
	}

}
