package GCD;

public class gcdcompute
{
public int gcdcompute(int a, int b)
{
if (a == 0)
return b;
if (b == 0)
return a;
if (a == b)
return a;
if (a > b)
return gcdcompute(a-b, b);
return gcdcompute(a, b-a);
}
}
