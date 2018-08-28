class human
{
void speak()
{
System.out.println("inside human");
}
}
class student extends human
{
void speak()
{
System.out.println("inside student");
}
void speak(String s,int x)
{
System.out.println("inside student");
}
void speak(String s)
{
System.out.println("inside student");
}

}
class eng extends student
{
void speak()
{
System.out.println("inside engineer");
}
}
class Final
{
public static void main(String[] args)
{
student a=new student();
a.speak();
}
}