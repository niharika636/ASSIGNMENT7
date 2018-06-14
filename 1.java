import java.lang.*;
 interface Animals {
 public void speak();
public void eat();
}
 class Cat implements Animals {
	
	   public void speak() {
	     System.out.println("CLASS CAT");
	     System.out.println("Cat produces sound of meow");
	   }
	   public void eat() {
		     System.out.println("Cat eat meat");
		     
		   }
}
 class Dog implements Animals {
	
	   public void speak() {
	     System.out.println("CLASS DOG");
	     System.out.println("Dog produces sound of bow");
	   }
	   public void eat() {
		     System.out.println("Dog eat meat");
		     
		   }
}
class mm
{
public static void main(String a[])
{
 Animals a1=new Dog();
a1.speak();
a1.eat();
a1 =new Cat();
a1.speak();
a1.eat();
}}
