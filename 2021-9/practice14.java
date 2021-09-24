package jiuYueErShiSi;

public class Practice2 {
	public static void main(String[] args) {
		int n=10;
		Practice2 practice2=new Practice2();
		int result;
		for(int i=0;i<=n;i++){
			result=practice2.f(i);
			System.out.print(result+" ");
		}
	}
	//递归算法
	public int f(int n) {
		if(n>1){
			return f(n-1)+f(n-2);
		}else if(n==1){
			return 1;
		}else {
			return 1;
		}
	}

}
