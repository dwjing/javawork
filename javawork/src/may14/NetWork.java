package may14;
/*
 * 【练习题】定义一个网络用户类，要处理的信息有用户ID、用户密码、email地址。在建立类的实例时，把以上三个信息都作为构造函数的参数输入，
 * 其中用户ID和用户密码时必须的，缺省的email地址是用户ID加上字符串"@gameschool.com"*/
public class NetWork {
	private int id;
	private String password;
	private String emailAdress;
	
	public NetWork(int id, String password, String emailAdress) {
		
		this.id = id;
		this.password = password;
		this.emailAdress = emailAdress;
		System.out.println("id:"+id+"  密码:"+password+"  邮箱:"+emailAdress);
		
	}
    
	public NetWork(int id, String password) {
		
		this.id = id;
		this.password = password;
		System.out.println("id:"+id+"  密码:"+password+"  邮箱:"+id+"@xyw.com");
		
		
	}
	
	
}
