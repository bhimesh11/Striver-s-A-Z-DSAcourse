package recurssion;

public class palindrome {

    public static void main(String[] args) {
        String s = "madam";
        System.out.println( stringpalindrome(0,s));
    }

    private static boolean stringpalindrome(int i, String s) {
   if(i>=s.length()/2)
   {
       return true;
   }
   if(s.charAt(i)!=s.charAt(s.length()-i-1))
   {
       return false;
   }
   return stringpalindrome(i+1,s);

    }
}
