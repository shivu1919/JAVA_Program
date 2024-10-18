import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num,rev=0,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");

        num = sc.nextInt();
        int n=num;
        while(num!=0){
            rem=num%10;
            rev=(rev*10)+rem;
            num =num/10;
        }
        if(rev==n){
            System.out.println("Palindrom number");
        }
        else{
            System.out.println("Not a palindrome number");
        }

    }
}
