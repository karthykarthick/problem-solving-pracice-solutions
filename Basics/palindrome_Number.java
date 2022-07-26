public class hello {
    public static void main(String[] args){

        String str = "123";
        int len = str.length();
        int count = 0;
//      System.out.println(str.length());
        for (int i = 0;i<=str.length()-1;i++){
            if ((str.charAt(i) == str.charAt(len-1-i))){
                count++;
            }
        }
        if(count == str.length()){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not a Palindrome Number");
        }
    }
}

// Re-visit pre-post increment and greater than and less than symbol,Modulus Operator








