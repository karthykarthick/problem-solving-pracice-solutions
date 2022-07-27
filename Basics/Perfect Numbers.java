import static java.lang.Math.pow;

public class hello {
    public static void main(String[] args){

        int perfect = 496;
        int sum = 0;
        for(int i = 1; i<perfect;i++){
               if (perfect%i == 0){
                sum = sum + i;
            }
        }

        if (sum == perfect){
            System.out.println("Perfect Number");
        }else {
            System.out.println("Not a perfect Number");
        }
    }
}

// Re-visit pre-post increment and greater than and less than symbol,Modulus Operator








