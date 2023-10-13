import java.util.*;
import java.util.Scanner;

class SumOfNaturals{


public static int sumOfNaturals(int n){

return (n*(n+1)/2);


}



public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:  ");
int a = sc.nextInt();
sumOfNaturals(a);
a= sumOfNaturals(a);

System.out.println(a);
}
}