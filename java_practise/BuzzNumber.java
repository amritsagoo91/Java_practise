import java.util.*;
import java.io.*;
import java.util.Scanner;

class BuzzNumber{

static boolean checkNumber(int number){

if(number%10==7 || number%7==0)
   return true;
else
   return false;


}


public static void main(String args[]){

int n1,n2;

Scanner sc = new Scanner(System.in);
System.out.println("Enter first number: ");
n1= sc.nextInt();

System.out.println("Enter Second number: ");
n2= sc.nextInt();

if(checkNumber(n1))
   System.out.println(n1+ " is a buzz number");
else 
   System.out.println(n1+ " is not a buzz number");
if(checkNumber(n2))
   System.out.println(n2+ " is a buzz number");
else 
   System.out.println(n2+ " is not a buzz number");

}
}