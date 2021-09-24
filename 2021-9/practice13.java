package jiuYueErShiSi;

public class Practice2 {
	public static void main(String[] args) {
		int n=10;
		Practice2 practice2=new Practice2();
		int result=practice2.f(n);
		System.out.print(result);
	}
	//递归算法
	public int f(int n) {
		if(n>1){
			return 2*f(n-1)+f(n-2);
		}else if(n==1){
			return 4;
		}else {
			return 1;
		}
	}

}
