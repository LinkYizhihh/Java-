package test;

public class Practice {
	public static void main(String[] args) {
		//产生10个随机数
		int a[]=new int[10];
		for(int i=0;i<10;i++){
			a[i]=(int)(Math.random()*100);
		}
		//输出
		for(int i=0;i<10;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//逆序输出
		for(int i=1;i<=10;i++){
			System.out.print(a[10-i]+" ");
		}	
	}
}
