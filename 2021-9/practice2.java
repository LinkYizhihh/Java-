public class practice1 {
	public static void main(String[] args) {
		int a[]=new int[100];
		int b[]=new int[100];
		for(int i=0;i<a.length;i++){
			a[i]=i;	
		}
		for(int i=0;i<a.length;i++){
			b[i]=a[a.length-i-1];//颠倒赋值
		}
		//输出
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++){
			System.out.print(b[i]+" ");
		}		
	}
}
