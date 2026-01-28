public class ShallowCopy
{
    public static void main(String[] args) 
    {
        int[] a= {1,2,3,4};
        int[] b= a;
        b[0] = 5;
         
        System.out.println(a[0]);
    }
    
} 

// Same Refference if b array value changes a array value also change