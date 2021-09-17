public class practice1 {
	public static void main(String[] args) {
		char a[]=new char[36];
		a[0]='A';
		a[26]='0';
		for(int i=1;i<36;i++){
			if(i==26) continue;
			a[i]=(char)(a[i-1]+1);
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

}
