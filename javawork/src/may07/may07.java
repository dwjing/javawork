package may07;

public class may07 {
public static void main(String[] args) {
	System.out.println("十进制转成十六进制："+Integer.toHexString(150));
	System.out.println("十进制转成八进制："+Integer.toOctalString(150));
	System.out.println("十进制转成二进制："+Integer.toBinaryString(20));
	System.out.println("十六进制转成十进制："+Integer.valueOf("96",16).toString());
	System.out.println("八制转成十进制："+Integer.valueOf("226",8).toString());
	System.out.println("二制转成十进制："+Integer.valueOf("10100",2).toString());




}
}
