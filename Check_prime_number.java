package Prime_Number;
public class Check_prime_number {
       public static void main(String[] arg){
            int num = 29;
            boolean flag = false;

            for(int i=2;i<=num/2; ++i) {
                //condition for nonprime number

                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
                if(!flag)
                    System.out.println(num + "is a prime number");
                else
                    System.out.println(num +"is not prime number");
        }
}
