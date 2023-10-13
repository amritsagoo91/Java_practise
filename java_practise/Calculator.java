import java.util.*;

class Calculator{
public static void main(String[] args)
{

boolean b = true;

while(b){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number: ");
int num1 = sc.nextInt();
System.out.println("Enter second number: ");
int num2 = sc.nextInt();
System.out.println("what operation would u like to perform? [X,/,+,-]");
char m = sc.next().charAt(0);

switch(m){
case 'X':
case 'x':
case '*':
{
System.out.println(mul(num1,num2));
break;
}
case '+':
{
System.out.println(add(num1,num2));
break;
}
case '/':
{
System.out.println(div(num1,num2));
break;
}
case '-':
{
System.out.println(sub(num1,num2));
break;
}
default:
System.out.println("invalid input!!!");
}

System.out.println("Would u like to continue:[Y/N]");
char x = sc.next().charAt(0);
if(x=='n' || x=='N'){
b=false;
}

}


}

public static int add(int a, int b){

return (a+b);

}
public static int sub(int a, int b){

return (a-b);

}
public static int mul(int a, int b){

return (a*b);

}
public static int div(int a, int b){

return (a/b);

}



}