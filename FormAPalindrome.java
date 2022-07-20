//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String str = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.countMin(str));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int countMin(String str)
    {
        int l = str.length(),output = 0;
        int countChar[] = new int[26];
        for (int i = 0; i < l; i++)
            countChar[str.charAt(i) - 'a']++;
        for (int i = 0; i < 26; i++)
        {
            if (countChar[i] % 2 == 1)
                output++;
        }
        return (output == 0) ? 0 : output - 1;// code here
    }
}
