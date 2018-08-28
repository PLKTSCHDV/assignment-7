class parent
{
void display()
{
System.out.println("inside parent class");
}
}
class child extends parent
{

void display()
{
super.display();
System.out.println("inside child class");
}
}
class ques1
{
public static void main(String[] args)
{
child x=new child();
x.display();
}
}