import java.util.*;
public class Main
{
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		int num = sc.nextInt();
 		int rev = 0;
 		int temp = num;
 		while(num>0) {
 			int l=num%10;
 			rev = rev+(l*l*l*l);
 			num=num/10;
 		}
 		System.out.println(rev);
 		if(temp==rev) {
 			System.out.println("armstrong");
 		} else {
 			System.out.println("not a armstrong");
 		}
 	}
}
