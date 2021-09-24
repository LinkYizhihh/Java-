package jiuYueErShiSi;

public class Practice3 {
	public static void main(String[] args) {
		int m=10;
		Practice3 practice3=new Practice3();
		int result=practice3.digui(m);
		System.out.print(result);
	}
	//递归算法
	public int digui(int m) {
		if(m<20){
			return digui(m+2)-2*digui(m+1);
		}else if(m==21){
			return 4;
		}else if(m==20){
			return 1;
		}else {
			return 2*digui(m-1)+digui(m-2);
		}
	}
}
