import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a decimal number");
        int num = sc.nextInt();
        int bin=0,temp=1,rem;
        int n = num;
        while(num!=0){
            rem= num%2;
            bin+=rem*temp;
            temp=temp*10;
            num = num/2;
        }


        System.out.println("The binary number of "+ n+" is " +bin);
    }
}