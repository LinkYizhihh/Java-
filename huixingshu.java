import java.util.Scanner;

public class huixingshu {
	public static void main(String[] args) {
		//创建输入
		Scanner input=new Scanner(System.in);
		System.out.println("请输入矩阵大小：");
		int len=input.nextInt();//获得矩阵大小
		//定义参数
		int huiXingShu[][]=new int[len][len];
		int i=0,j=0;
		int direction=1;//1-向右，2-向下，3-向左，4-向上
		//计算回型数
		for(int m=1;m<=len*len;m++){
			if(direction==1){//向右
				if(j<len&&huiXingShu[i][j]==0){
					huiXingShu[i][j]=m;//赋值
					j++;//纵坐标更新
				}else {//到头方向换下
					direction=2;
					i++;//横坐标更新
					j--;//上一步多加了一次纵坐标
					m--;//上一步m递增了一次
				}
			}else if (direction==2) {//向下
				if(i<len&&huiXingShu[i][j]==0){
					huiXingShu[i][j]=m;//赋值
					i++;
				}else {//到头方向换左
					direction=3;
					j--;
					i--;
					m--;
				}
			}else if (direction==3) {//向左，注意边界判断
				if(j>=0&&huiXingShu[i][j]==0){
					huiXingShu[i][j]=m;//赋值
					j--;
				}else {//到头方向换上
					direction=4;
					i--;
					j++;
					m--;
				}
			}else if (direction==4) {//向上
				if(i>=0&&huiXingShu[i][j]==0){
					huiXingShu[i][j]=m;//赋值
					i--;
				}else {//到头方向换右
					direction=1;
					j++;
					i++;
					m--;
				}
			}
		}
		//输出回型数组
		for (int[] anArr : huiXingShu) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + "\t");
            }
            System.out.println();
        }
	}
}
