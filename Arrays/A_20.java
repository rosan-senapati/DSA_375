public class A_20 {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 2, 3, 5 };

      for(int i = 0 ; i<arr.length ;i++)
      {
        int x = Math.abs(arr[i])-1;
        if(arr[x]<0)
        {
            System.out.println("Repeating Element is : "+(x+1));
        }
        else{

            arr[x]*=-1;
        }
      }

      for(int i =0 ;i<arr.length;i++)
      {
           if(arr[i]>0)
              System.out.println("Missing Element is : "+(i+1));
      }
    }
}
