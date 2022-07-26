public class hello {
    public static void main(String[] args){

     int num = 123456789;
     int rev = 0;
     while (num!=0){
        int lastDigit = num % 10;
        rev = rev+lastDigit;
        num = num / 10;
     }
        System.out.println(rev);
    }
}

// Re-visit pre-post increment and greater than and less than symbol,Modulus Operator
// while loop ---> HERE WE USE while loop in for we cant initiate the I so i go with while looop













