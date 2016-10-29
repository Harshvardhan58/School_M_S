import java.util.*;
class intpair{
	public static void main(String arg[]){
		Scanner in= new Scanner(System.in);
		int t=in.nextInt();
		for(int i=1;i<=t;i++){
			long n=in.nextLong();
			long l=in.nextLong();
			long r=in.nextLong();
			long a=in.nextLong();
			long b=in.nextLong();
			long c1=in.nextLong();
			long c2=in.nextLong();
			long m=in.nextLong();
			long rem=r-l;
			for(long x=1;x<n;x++){
				long ln=a*l + b*r + c1 % m;
				long rn=a*r + b*l + c2 % m;
			}
			
		}
	}
}