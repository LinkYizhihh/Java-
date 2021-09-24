package jiuYueErShiSi;

public class Practice1 {
	public static void main(String[] args) {
		int m=7;
		Practice1 practice1=new Practice1();
		int result=practice1.digui(m);
		System.out.print(result);
	}
	//递归算法
	public int digui(int m) {
		if(m>1){
			return m*digui(m-1);
		}else {
			return 1;
		}
	}
}
