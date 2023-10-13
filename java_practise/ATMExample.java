import java.util.Scanner;
public class ATMExample
{
public static void main(String[] args){
int balance = 10000,withdraw,deposit;

Scanner sc = new Scanner(System.in);
while(true){
System.out.println("Automated Teller Machine:  ");
System.out.println("Choose 1 for Withdraw");
System.out.println("Choose 2 fro deposit");
System.out.println("choose 3 for check balance");
System.out.println("choose 4 for EXIT");
System.out.println("Choose the operation you want to perform:  ");

int choice = sc.nextInt();

switch(choice){

case 1:
System.out.println("Enter money to be withdraw: ");
withdraw = sc.nextInt();
if(balance >=withdraw)
{
balance= balance-withdraw;
System.out.println("please collece your money:");
}else{
System.out.println("insuffiecient balance");
}System.out.println();
break;

case 2:
System.out.println("Enter money to be deposited:");
deposit = sc.nextInt();
balance = balance+deposit;
System.out.println("Money is deposited, Your new balance is"+balance);
System.out.println();break;


case 3:
System.out.println("Balance: "+balance);
System.out.println();
break;

case 4:
System.exit(0);

}


}

}

}