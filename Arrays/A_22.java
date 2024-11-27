public class A_22 {
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int right_max[] = new int[height.length];
        int left_max[] = new int[height.length];

        right_max[0] = height[0];
        for(int i =1;i<height.length;i++)
        {
            right_max[i] = Math.max(height[i],right_max[i-1]); 
        }

        left_max[height.length-1] = height[height.length-1];
        for(int i =height.length-2;i>=0;i--)
        {
            left_max[i] = Math.max(height[i],left_max[i+1]); 
        }

        System.out.println("Left max:");
        for(int x:left_max)
        {
            System.out.print(x+" ");
        }
        System.out.println("\nRight max:");
        for(int x:right_max)
        {
            System.out.print(x+" ");
        }

        int water = 0;

        for(int i =0 ;i<height.length;i++)
        {
            water+=Math.abs(Math.min(left_max[i],right_max[i]) - height[i]);
        }

        System.out.println("\nTapping Water is : "+water);
    }
}
