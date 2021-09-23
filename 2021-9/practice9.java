package test;

public class Student {
	public static void main(String[] args) {
		Student students[] =new Student[20];//初始化对象数组
		//创建学生对象数组
		for(int i=0;i<20;i++){
			students[i]=new Student();
			students[i].number=(int)(Math.random()*20);
			students[i].state=(int)(Math.random()*10);
			students[i].score=(int)(Math.random()*100);
		}
		//打印出3年级(state值为3）的学生信息
		System.out.println("3年级(state值为3）的学生信息:");
		for(int i=0;i<students.length;i++){
			if(students[i].state==3){
				System.out.println("学号："+students[i].number+"    成绩："+students[i].score);
			}
		}
		//使用冒泡排序按学生成绩排序，并遍历所有学生信息
		System.out.println("冒泡排序按学生成绩排序，并遍历所有学生信息:");
		for(int i=0;i<students.length;i++){
			for(int j=i;j<students.length;j++){
				if(students[i].score>students[j].score){
					Student temp=students[i];
					students[i]=students[j];
					students[j]=temp;
				}
			}
		}
		for(int i=0;i<students.length;i++){
			System.out.println("学号："+students[i].number+"    成绩："+students[i].score);
		}
		
	}
	int number;
	int state;
	int score;
}
