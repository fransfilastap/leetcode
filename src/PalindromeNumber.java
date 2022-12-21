public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        String s = x+"";
        StringBuilder builder = new StringBuilder();
        for (int i=s.length()-1;i>=0;i--){
            builder.append(s.charAt(i));
        }

        return s.compareTo(builder.toString())==0;

    }

    public static void main(String ...args){

        int[] inputs = new int[]{121,-121,10,1112111};
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        for (int input:inputs) {
            System.out.println("Input ["+input+"] is palindrom ? "+palindromeNumber.isPalindrome(input));
        }

    }
}
