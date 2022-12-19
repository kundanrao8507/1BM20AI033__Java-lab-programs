import GCD.*;
import LCM.*;
class sample
{
public static void main(String args[])
{
int a = 10;
int b = 20;
gcdcompute a1 = new gcdcompute();
int k = a1.gcdcompute(a,b);
System.out.println("GCD of two numbers:"+k);
lcmcompute a2 = new lcmcompute();
int l = a2.lcmcompute(a,b);
System.out.println("LCM of two numbers:"+l);
}
}
