public class RightInvertedPattern {
    public static void main(String arg[]){
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=n-i+1;k>=1;k--)
            System.out.print(i);
            System.out.println();
        }
    }
}
