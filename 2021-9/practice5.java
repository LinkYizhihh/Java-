package test;

public class Practice {
	public static void main(String[] args) {
		//产生10个随机数
		int a[]=new int[10];
		for(int i=0;i<10;i++){
			a[i]=(int)(Math.random()*100);
		}
		//输出
		System.out.print("原始数组：");
		for(int i=0;i<10;i++){
			System.out.print(a[i]+" ");
		}
		//处理
		int max=0,min=0;
		int max_index=0,min_index=0,temp=0;
		for(int i=0;i<10;i++){
			if(a[i]>max){
				max=a[i];
				max_index=i;
			}
			if(a[i]<min){
				min=a[i];
				min_index=i;
			}
		}
		temp=a[max_index];
		a[0]=max;
		a[max_index]=temp;
		temp=a[min_index];
		a[a.length-1]=min;
		a[min_index]=temp;
		//输出
		System.out.println();
		System.out.print("新数组：");
		for(int i=0;i<10;i++){
			System.out.print(a[i]+" ");
		}	
	}
}
