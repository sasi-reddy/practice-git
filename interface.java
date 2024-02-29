public interface sum{
	public static int sum(int n1,int n2);
}

class sumimpl implements sum{
	public static int sum(int n1,int n2){
		return n1+n2;
	}
}