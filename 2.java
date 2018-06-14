import java.lang.*;
import java.util.*;
abstract class Animal
{
  String breed,colour,name;
abstract void eat();
void speak(){
System.out.println("CLASS ANIMAL ");
  }
}
class Dog extends Animal
{
void eat()
{
System.out.println("CLASS Dog");
}
}
class Demo1{
 public static void main(String a[])

  {
   Animal a1=new Dog();
            a1.speak();
     a1.eat();        
  }

}
