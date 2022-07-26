public class hello {
    public static void main(String[] args){

        // Fibonacci series

        int a = 0;   // first two var are pre-defined
        int b = 1;
        int c = 0;   // third one is used to swap and add a b to c
        int limit = 10; // fibonnaci upto is set here 
        System.out.println(a);
        System.out.println(b);

        for(int i = 2; i<limit; i++){
            c = a+b;
            a = b;  // use swapping
            b = c;  // use swapping
            System.out.println(c);
        }
    }
}

// Re-visit pre-post increment and greater than and less than symbol,Modulus Operator








