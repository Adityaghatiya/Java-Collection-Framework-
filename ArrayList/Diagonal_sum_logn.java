class Diagonal_sum_logn{
    public static int d_sum(int arr[][])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i][i];

            if(i!=arr.length-i-1)
            {
                sum+=arr[i][arr.length-i-1];
            }
        }
        return sum;
    }
public static void main(String args[])
{
    int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[i][j]);
        }
        System.out.println();
    }
    System.out.println( d_sum(arr));
}
}