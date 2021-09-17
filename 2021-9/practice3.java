public class practice {
	public static void main(String[] args) {
		int length=20;
		int feiBoNaQie[]=new int[length];
		//初始化
		feiBoNaQie[0]=0;
		feiBoNaQie[1]=1;
		//计算斐波那契数列
		for(int i=2;i<length;i++){
			feiBoNaQie[i]=feiBoNaQie[i-1]+feiBoNaQie[i-2];
		}
		//输出
		System.out.println();
		for(int i=0;i<feiBoNaQie.length;i++){
			System.out.print(feiBoNaQie[i]+" ");
		}		
	}
}
