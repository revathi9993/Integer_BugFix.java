import java.util.Scanner;
public class Bug1{
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter your Number");
	
	int a=in.nextInt();
	int sum=0;
	for(int i=1;i<a;i++) {
		if(a%i==0) {
			sum=sum+i;
		}
		
	}
	if(a==sum) {
		System.out.println(a+" is Perfect Number");
	}
	else{
	System.out.println(a+" is not a Perfect number");
	}
}
}
