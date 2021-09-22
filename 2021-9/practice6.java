package test;

public class Practice {
	public static void main(String[] args) {
		//产生4*4矩阵
		int n=4;
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=(int)(Math.random()*100);
			}
		}
		//输出
		System.out.print("原始数组：");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		//处理
		int b[]=new int[n];
		for(int i=0;i<n;i++){
			b[i]=a[0][i];
		}//取出第一行
		for(int i=0;i<n;i++){
			a[0][i]=a[3][i];
		}//将第一行换成第四行
		for(int i=0;i<n;i++){
			a[3][i]=b[i];
		}//将第四行换成第一行

		for(int i=0;i<n;i++){
			b[i]=a[1][i];
		}//取出第二行
		for(int i=0;i<n;i++){
			a[1][i]=a[2][i];
		}//将第二行换成第三行
		for(int i=0;i<n;i++){
			a[2][i]=b[i];
		}//将第三行换成第二行

		//输出
		System.out.println();
		System.out.print("新数组：");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}	
	}
}
