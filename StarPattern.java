public class StarPattern {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int twoD[][]=new int[n][];
        for(int i=0;i<n;i++)
        {
            twoD[i]=new int[i+1];
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i+1;j++)
            System.out.print("*");
            System.out.println();
        }
    }
}
