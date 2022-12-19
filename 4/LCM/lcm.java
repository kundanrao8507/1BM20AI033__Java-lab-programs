package LCM;
import GCD.*;
public class lcmcompute
{
public int lcmcompute(int a, int b)
{
gcdcompute a1 = new gcdcompute();
int k = a1.gcdcompute(a, b);
return (a/k) * b;
}
}
