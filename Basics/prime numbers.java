public class hello {
    public static void main(String[] args){

        // Prime Numbers
         int prime = 8;
         boolean flag = false;
         for (int i = 2; i < prime; i++){
             if (prime % i == 0){
                 flag = true;
                 break;
             }
         }
         if (flag == false){
             System.out.println("Prime Number");
         }else {
             System.out.println("Not a prime number");
         }
    }
}

// Re-visit pre-post increment and greater than and less than symbol,Modulus Operator








