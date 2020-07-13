public class MatrixAdditionandMultiplication
{
    public static void main(String args[])
    {
        int a[][]={{1,3,4},{2,4,3},{3,4,5}};
        int b[][]={{1,3,4},{2,4,3},{1,2,4}};
        //Addition of Matrix
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
            {
                System.out.print((a[i][j]+b[i][j])+" ");
            }
            System.out.println();
        }
        System.out.println("All the Best!");
        //Multiplication of Matrix
        /*
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
            {
                System.out.print((a[i][j]*b[i][j])+" ");
            }
            System.out.println();
        }*/
        
    }
}