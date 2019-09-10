import java.util.Scanner;
public class AAr{
	public static void main (String [] args){
		for(String arg : args){
			;
		}
		int [] tmp = new int [args.length];
		
		for(int i=0; i<args.length; i++) {
			tmp[i] = Integer.parseInt(args[i]);
		}
		
		for(int i=tmp.length-1; i>=0; i--) {
			System.out.printf("%d ",tmp[i]*tmp[i]);
		
		}
		System.out.println("");
}



}

