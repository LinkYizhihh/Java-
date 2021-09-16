public class yanghui {
	public static void main(String[] args) {
		int yanghui[][];
		int hang,i;
		//创建输入
		Scanner input=new Scanner(System.in);
		System.out.println("请输入行数：");
		hang=input.nextInt();
		//杨辉三角
		yanghui=new int[hang][];
		for(i=2;i<hang;i++){
			yanghui[i]=new int[i+1];//创建该行个数数组
			yanghui[i][0]=1;//每行第一个数是1
			yanghui[i][yanghui[i].length-1]=1;//每行最后一个数是1
			for(int j=1;j<yanghui[i].length-1;j++){
				yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
			}
		}
		//输出
		for(i=0;i<hang;i++){
			for(int j=0;j<yanghui[i].length;j++){
				System.out.print(yanghui[i][j]+" ");
			}
			System.out.println("");
		}	
	}
}
