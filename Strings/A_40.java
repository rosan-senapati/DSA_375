import java.util.ArrayList;

public class A_40{
    public static void main(String[] args) {
        String s =  "9,8";
        String newStr = s.toLowerCase();
        System.out.println(newStr);

        int i = 0;
        int j = newStr.length()-1;
        Boolean flag = true;
        while(i<j)
        {
            while(i<j && !Character.isLetterOrDigit(newStr.charAt(i)))
                i++;
            while(i<j && !Character.isLetterOrDigit(newStr.charAt(j)))
                j--;
            if(newStr.charAt(i) != newStr.charAt(j))
                {
                    flag=false;
                    break;
                }    

        }

        if(flag)
        {
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

    }
}