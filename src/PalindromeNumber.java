public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if((x < 0 || x % 10==0) && x != 0) return false;

        return reverseNumber(x)==x;

    }

    public int reverseNumber(int x){
        int number = x,remainder=0,reversed=0;

        while (number != 0){
            remainder = number%10;
            reversed = reversed*10;
            reversed = reversed + remainder;
            number = number /10;
        }

        return reversed;
    }

    public static void main(String ...args){

        int[] inputs = new int[]{121,-121,10,1112111,0};
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        for (int input:inputs) {
            System.out.println("Input ["+input+"] is palindrom ? "+palindromeNumber.isPalindrome(input));
        }

    }
}
