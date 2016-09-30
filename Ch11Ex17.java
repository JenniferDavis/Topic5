import java.util.*;

public class Ch11Ex17 {

    public static void main(String[] args) {  
        
    		//ArrayList<Integer> array = new ArrayList<Integer>();
        
    		Scanner number = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        int m = number.nextInt();
        int[] list = new int[m];
        
        int i = 0;
        int factorNumber = 1;
        while(factorNumber <= m)
        {
        		if(m % factorNumber == 0)
        		{
        		list[i] = factorNumber;
        		}
        		factorNumber ++;
        		i++;
        }

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        
        int countArray[]=new int[list[list.length-1]+1];
        for(int j:list)
        {
           countArray[j]= countArray[j]+1;
        }

        
        
      //  System.out.println("The smallest number n for m * n to be perfect square is " + n);
       // System.out.println("m * n is: " + (m * n));               

    }

}
