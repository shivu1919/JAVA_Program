import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num,rev=0,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");

        num = sc.nextInt();
        while(num!=0){
            rem=num%10;
            rev=(rev*10)+rem;
            num =num/10;
        }

        System.out.println(rev);
    }
}
