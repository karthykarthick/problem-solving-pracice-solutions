import static java.lang.Math.pow;

public class hello {
    public static void main(String[] args){

     int num = 153;
     int temp = num;
     int last_digit = 0;
     int val = 0;


     while(num > 0){
         last_digit = num % 10;
         val = val + (last_digit * last_digit * last_digit);
         num = num / 10;
     }

     
     if(temp == val){
         System.out.println("Amstrong Number");
     }else {
         System.out.println("Not a Amstrong Number");
     }
    }
}

// Re-visit pre-post increment and greater than and less than symbol,Modulus Operator








