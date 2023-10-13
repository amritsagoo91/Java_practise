class EvenAndOdd{
public static void main(String args[]){
int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
System.out.println("Number if even numbers: ");
for (int i=0;i<arr.length;i++ ){
if(arr[i]%2==0){
System.out.println(arr[i]);

}
}

System.out.println("number of odd numbers: ");
for (int i=0;i<arr.length;i++ ){
if(arr[i]%2!=0){
System.out.println(arr[i]);

}
}

}

}