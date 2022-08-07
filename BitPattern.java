public class BitPattern
{
    public static void main(String[] args) {
        //int len = args.length;
        int n = Integer.parseInt(args[0]);
        int twoD[][]=new int[n][];
        for(int i=0;i<n;i++){
        twoD[i]=new int[i+1];
        }
        // twoD[1]=new int[2];
        // twoD[2]=new int[3];
        // twoD[3]=new int[4];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                if(j%2!=0)
                twoD[i][j]=0;
                else
                twoD[i][j]=1;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}
