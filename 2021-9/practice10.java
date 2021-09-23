package jiuYueErShiSan;

public class MyDate {
	int year;
	int month;
	int day;
	//设置日期
	public void setDate(int year,int month,int day) {
		this.year=year;
		this.month=month;
		this.day=day;
	}
	//显示日期
	public void showDate() {
		System.out.println(year+"年"+month+"月"+day+"日");
	}
	public static void main(String[] args) {
		MyDate m1=new MyDate();
		MyDate m2=new MyDate();
		m1.setDate(1997, 5, 7);
		m2.setDate(1996, 12, 11);
		m1.showDate();
		m2.showDate();
	}
}
