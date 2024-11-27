public class A_43 {
    public static void main(String[] args) {
        String s = "aaaaaaaaab";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1))
                continue;
            else
                result += s.charAt(i);
        }

        System.out.println(result);
    }
}
