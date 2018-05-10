package may05;

import java.util.Scanner;

public class Lianxi{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入三角形的行数:");
    int line = scanner.nextInt();

    for(int i =1; i<= line; i++){
    	for(int j =i;j<=line-1;j++ ) {
    		System.out.print(" ");}
    		for (int k=1;k<=2*i-1;k++) {
    			System.out.print("*");
    			
    		
    	}
    		System.out.println();	
    }
      
    }
  }

