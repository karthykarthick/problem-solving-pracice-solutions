import static java.lang.Math.pow;

public class hello {
    public static void main(String[] args){

        int strong = 5; // check the numbber is strong or not!

        int temp = strong;  // assign to check later with our output
        int a = 0;          // we are use this to add each fact to this number oand this is also used to compare temp == a
        int last_digit = 0;
        int sum = 1;       //  to find the factorial we are initialize sum = 1
        while(strong>=1){
            last_digit = strong % 10;
            for (int j = 1; j<=last_digit;j++){
                sum = sum * j;
            }
            a = a + sum;   // we are adding each digit of factorial
            strong = strong/10; 
            sum = 1;

        }
        if(a == temp){
            System.out.println("strong number");
        }else {
            System.out.println("Not a strong number");
        }
    }
}

// Re-visit pre-post increment and greater than and less than symbol,Modulus Operator








