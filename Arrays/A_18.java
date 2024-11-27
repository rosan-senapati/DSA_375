public class A_18 {

    public static void nextPermutation(int arr[])
    {
        int i = arr.length-2;
        while(i>=0 && arr[i] >= arr[i+1])
        {
            i--;
        }

        if(i>=0)
        {
            int j = arr.length-1;
            while(j>=0  && arr[j] <= arr[i])
            {
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1);

    }

    public static   void swap(int arr[],int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int arr[],int start)
    {
        int end = arr.length-1;
        while(start<end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,2,1};
        nextPermutation(arr);
        for(int x : arr)
        {
            System.out.print(x+" ");
        }
    }
}
