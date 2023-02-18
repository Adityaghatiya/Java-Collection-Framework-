class Bubble_sorting{
public static int  sort(int arr[])
{
    int len=arr.length;
    
    // For ascending order
    for(int i=0;i<arr.length-1;i++)
    {
        for(int j=0;j<arr.length-1-i;j++ )
        {
            if(arr[j+1]<arr[j])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    // For descending order
    
    
 return 1;

}
public static void print(int arr[])
{
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }
}
public static void main(String args[])
{
   int arr[]={2,4,1,6,8};
   sort(arr);
   print(arr);
}
}