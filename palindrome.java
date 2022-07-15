//import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int i = 0, j = A.length()-1;
        while(i<=j)
        {
            if(A.charAt(i)!=A.charAt(j))
            {
                System.out.println("No");
                break;
            }
            else
            System.out.println("Yes");
            break;
        }
        
        /* Enter your code here. Print output to STDOUT. */
        
    }
}
