public class hello {
    public static void main(String[] args){

        String str = "123"; 
        int len = str.length();  // store the string len in s variable
        int count = 0;           // to count the number of char are same so we can compare with length of original string
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

// if ((str.charAt(i) == str.charAt(len-1-i)))   //Here we are checking like
// 1 == 3 
// 2 == 2 like this we can check with the input!






