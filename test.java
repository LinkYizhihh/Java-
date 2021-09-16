public class test {
	public static void main(String[] args) {
		int a[]=new int[29];	
		boolean isEqal=true;//生成随机数之后判断是否和其他数相等
		for(int i=0;i<a.length;i++){
			while(isEqal){
				a[i]=(int)(Math.random()*30);//生成随机数
				isEqal=false;
			    for(int j=0;j<i;j++){
				    if(a[i]==a[j]){
				    	isEqal=true;
				        break;//只要和前面一个相等，就跳出判断，重新生成随机数
				    } 
			    }
			}
			isEqal=true;
		}
		Arrays.sort(a);//验证是否没有重复
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
