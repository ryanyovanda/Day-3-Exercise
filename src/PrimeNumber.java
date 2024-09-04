import java.util.Scanner;

//Create a function to check if a number is prime.
public class PrimeNumber {
    public static void main(String[] args) {
        int i,m=0,flag=0;
        Scanner Number = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = Number.nextInt();
        m=n/2;
        if(n==0||n==1){
            System.out.println("is not Prime Number");
        }else{
            for(i=2;i<m;i++){
                if(n%i==0){
                    System.out.println("is not Prime Number");
                    flag=1;
                    break;
                }
            }
            if(flag==0){ System.out.println("is Prime Number"); }
        }

    }
}
