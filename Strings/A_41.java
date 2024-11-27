import java.util.Arrays;

public class A_41 {

    public static Boolean isAnagram(String a,String b)
    {
        if(a.length()!= b.length())
            return false;
        char arrA[]=a.toCharArray();
        char arrB[]=b.toCharArray();

        Arrays.sort(arrA);
        Arrays.sort(arrB);
        
        int i = 0;
        int j = 0;

        while(i<arrA.length && j<arrB.length)
        {
            if(arrA[i] != arrB[j])
            {
                return false;
            }
            i++;
            j++;
        }

        return true;
    }
    public static void main(String[] args) {
        String a = "ABCD";
        String b = "DBC";

        if(isAnagram(a, b))
            System.out.println("True");
        else
            System.out.println("False");    
    }
}
