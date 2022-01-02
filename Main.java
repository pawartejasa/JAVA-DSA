
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner s= new Scanner(System.in);
	    int num= s.nextInt();
	    int startnum= 65+num-1;
	    char start= (char)startnum;
	    for(int i=1;i<=num;i++){
	        for(int j=1;j<=i;j++){
	            System.out.print(start);
	            start++;
	        }
	        System.out.println();
	        startnum--;
	       start= (char)startnum;
	    }
	    
		
	}
}

