import java.util.HashMap;
import java.util.Map;

import javax.swing.RowFilter.Entry;

public class A_46 {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        Map<Character,Integer> answer = new HashMap<>();
        for(int i = 0; i<s.length();i++)
        {
            if(answer.containsKey(s.charAt(i)))
            {
                answer.put(s.charAt(i), answer.get(s.charAt(i))+1);
            }
            else{
                answer.put(s.charAt(i),1);
            }
        }

        for(Map.Entry<Character,Integer> entry:answer.entrySet())
        {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
