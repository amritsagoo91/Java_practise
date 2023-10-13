public class Employee{
String name;
int id;
int salary;
String jobTitle;

public Employee(String name,int id,int salary,String jobTitle)
{this.name=name;
this.id=id;
this.salary=salary;
this.jobTitle=jobTitle;
}

public void printEmployee(){
System.out.println(this.name+" "+this.id+" "+" "+this.salary+" "+this.jobTitle);
}

public static void main(String[] args){

Employee obj1= new Employee("Amrit",1001,100000,"Java_Developer");

obj1.printEmployee();


}
}