//github username - Debangshu97
import java.util.Scanner;

public class SelectionSort {
  public static void main(String []args) {
    int i,j,temp,limit;
    Scanner sc = new Scanner(System.in);
 
    System.out.println("Enter the limit of the numbers:");
    limit = sc.nextInt();
 
    int array[] = new int[limit];
 
    System.out.println("Enter " + limit + " numbers: ");
 
    for (i = 0; i <limit; i++) 
      array[i] = sc.nextInt();
      
      
      
      for ( i = 0; i < limit-1; i++)
        {
           
            int min = i;
            for ( j = i+1; j < limit; j++)
                if (array[j] < array[min])
                    min = j;
 
             temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
      
      
 
    System.out.println("******Sorted list******");
 
    for (i = 0; i < limit; i++) 
      System.out.println(array[i]);
  }
}