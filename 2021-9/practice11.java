package jiuYueErShiSan;

public class Test {
    public static void main(String[] args) {
    	int a=10;
    	int b=10;
    	method(a,b);
    	System.out.print("a="+a);
    	System.out.print("b="+b);
    }
    public static void method(int a,int b){
    	a=100;
    	b=200;
    	System.out.println("a="+a);
    	System.out.print("b="+b);
        System.exit(0);//直接跳过主函数里的输出，真是狗啊
    }
}
