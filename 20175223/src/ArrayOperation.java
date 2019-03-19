import java.util.Scanner;

public class ArrayOperation {
 
       public static void main(String [] args){
int temp;           
int[] arr = new int[5];
	    Scanner read = new Scanner(System.in);
           for(int i=0;i<5;i++){
		System.out.printf("Input your number:");
		int reader = read.nextInt();
               
          }
System.out.printf("You input: ");

for(int i=0;i<5;i++){
System.out.print(arr[i] + " ");
}
          System.out.println();
for(int i=0; i<arr.length; i++)
              arr[i-1] = arr[i]; 	


/*
	for(int j)
          for(int i=0; i<arr.length; i++)
 		temp=arr[i];        
     arr[i-1] = arr[i];
 */
          arr[7] = 0;
 
         for(int i:arr){
              System.out.print(i + " ");
          }
          System.out.println();
 
          for(int i=arr.length; i>4; i--)
            arr[i-1] = arr[i-2];
 
          arr[4] = 5;

         for(int i:arr){
             System.out.print(i + " ");
         }
         System.out.println();

     }
}
