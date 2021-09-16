public class test1 {
	public static void main(String[] args) {
		int num=10;
		int a[]=new int[10];
		//产生随机两位数
		for(int i=0;i<num;i++){
			a[i]=(int)(Math.random()*90+10);
		}
		//求最大值，最小值，和值，平均值
		float mean;
		int max=0,min=a[0],sum=0;
		for(int i=0;i<num;i++){
			if(a[i]>max){
				max=a[i];
			}
			if(a[i]<min){
				min=a[i];
			}
			sum=sum+a[i];
			System.out.print(a[i]+" ");
		}
		mean=(float)(sum)/num;		
		System.out.println("最大值"+max);
		System.out.println("最小值"+min);
		System.out.println("和值"+sum);
		System.out.println("平均值"+mean);
	}
}
