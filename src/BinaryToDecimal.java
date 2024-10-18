import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int num,rem,temp=1,dec=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number");
        num=sc.nextInt();
        while(num!=0){
            rem=num%10;
            dec+=rem*temp;
            temp=temp*2;
            num=num/10;
        }

        System.out.println(dec);
    }
}
