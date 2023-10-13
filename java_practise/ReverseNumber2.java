import java.util.Scanner;

public class ReverseNumber2{
       public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enetr a number:");
System.out.println();
int number =  sc.nextInt();
int reverse = 0;
for(;number!=0;){
int remainder = number%10;
reverse = reverse*10+remainder;
number= number/10;
}

System.out.println("Reverse of number = "+reverse);

}




}