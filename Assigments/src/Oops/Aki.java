package Oops;

public class Aki implements Akshit, Anand {
public Aki()
{

}

@Override
public void brain()
{
System.out.println("I Am monstar");


}
@Override
public void flesh ()
{
System.out.println("I Am not Mota");


}
@Override
public void color()
{
System.out.println("xyz");


}
public static void main (String args[])
{
Aki myTest = new Aki();
myTest.brain();
myTest.flesh();
myTest.color();
}

}
