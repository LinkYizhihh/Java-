package test;

public class Main {
	public static void main(String[] args) {
		Main test=new Main();
		int s=test.method(9,8);
		System.out.print(s);
	}
	//打印10*8矩阵
	public int method(int m,int n) {
		int mianji=0;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print("*");
				mianji++;
			}
			System.out.println();
		}
		return mianji;
	}
}
