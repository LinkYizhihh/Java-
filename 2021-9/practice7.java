package test;

public class Practice {
	public static void main(String[] args) {
		//产生10个随机数
		int n=10,m=4;
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=(int)(Math.random()*100);
		}
		//输出
		System.out.print("原始数组：");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		//处理
		int b[]=new int[n];
		for(int i=0;i<m;i++){
			b[i]=a[n-m+i];
		}
		for(int i=m;i<n;i++){
			b[i]=a[i-m];
		}
		//输出
		System.out.println();
		System.out.print("新数组：");
		for(int i=0;i<n;i++){
			System.out.print(b[i]+" ");
		}	
	}
}
