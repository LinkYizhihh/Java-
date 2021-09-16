public class HelloWorld {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入学生人数:");
		int studentNum=input.nextInt();
		//输入
		System.out.println("请输入"+studentNum+"个成绩");
		int studentGrade[]=new int[studentNum];
		for(int i=0;i<studentNum;i++){
			studentGrade[i]=input.nextInt();		
		}
		//找到最高分
		int maxGrade=0;
		for(int i=0;i<studentNum;i++){
			if(studentGrade[i]>maxGrade){
				maxGrade=studentGrade[i];
			}
		}
		//输出
		System.out.println("最高分是："+maxGrade);
		for(int i=0;i<studentNum;i++){
			if(studentGrade[i]>=maxGrade-10){
				System.out.println("学生"+i+"分数是"+studentGrade[i]+"，等级是A");
			}else if (studentGrade[i]>=maxGrade-20) {
				System.out.println("学生"+i+"分数是"+studentGrade[i]+"，等级是B");
			}else if (studentGrade[i]>=maxGrade-30) {
				System.out.println("学生"+i+"分数是"+studentGrade[i]+"，等级是C");
			}else {
				System.out.println("学生"+i+"分数是"+studentGrade[i]+"，等级是D");
			}		
		}
	}
}
