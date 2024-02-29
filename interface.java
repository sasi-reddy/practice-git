import java.util.*;
public interface sum{
	public  int sum(int n1,int n2);
}

class sumimpl implements sum{
	public  int sum(int n1,int n2){
		return n1+n2;
	}
}

class main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to sum");

		int n1=sc.nextInt();
		int n2=sc.nextInt();
		sumimpl s=new sumimpl();

		System.out.println(n1+"+"+n2+"="+s.sum(n1,n2));
	}
}