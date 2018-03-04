import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] elements = new int[n];
	    for(int i=0;i<n;i++)
	        elements[i] = sc.nextInt();
	    
	    for(int i=0;i<n;i++)
	    {
	        int _leftsum = leftSum(elements,i-1);
	        int _rightsum = rightSum(elements,i+1);
	        
	        if(_leftsum==_rightsum)
	            System.out.println(elements[i]+" ");
	    }
	}
	//to calculate the leftsum from poisiton to start - reverse process
	public static int leftSum(int[] array,int start)
	{
	    int result = 0;
	    for(int i=start;i>=0;i--)
	    {
	        result += array[i];
	    }
	    
	    return result;
	}
	//to calculate the right sum from that position to end - forward process
	public static int rightSum(int[] array, int start)
	{
	    int result = 0;
	    for(int i=start;i<array.length;i++)
	    {
	        result += array[i];
	    }
	    
	    return result;
	}
}
