class RecursionIsCool{
public static void main(String args[]){
countBackwards(14);
}

public static void countBackwards(int n){

if(n==0){
System.out.println("dome");
}else{
System.out.println(n);
n--;
countBackwards(n);
}

}







}