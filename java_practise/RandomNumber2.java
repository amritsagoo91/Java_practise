import java.util.Random;
public class RandomNumber2{
public static void main(String[] args){
Random random = new Random();

int x = random.nextInt(50);
int y = random.nextInt(1000);
System.out.println(x+" "+y );

} 

}