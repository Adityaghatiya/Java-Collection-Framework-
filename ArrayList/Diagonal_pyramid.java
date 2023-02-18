class Diagonal_pyramid{
    public static void pyr(int arr[][])

    {
        System.out.println(arr[0][0]);
        int l=arr.length;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                
                if(i)
                {
                    System.out.println(arr[i][j]);
                }
            }
        }
        
    }
    public static void main(String args[])
    {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,18,20}};
        pyr(arr);
    }
}