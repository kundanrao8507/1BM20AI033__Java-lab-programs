import java.util.*;
class calculator
{
int a,b,c;
calculator(int k,int l)
{
a=k;
b=l;
}

int add()
{
c = a+b;
return c;
}

int sub()
{
c= a-b;
return c;
}
int mul()
{
c=a*b;
return c;
}

void div()
{
try{
c=a/b;
System.out.println(c);
}
catch(java.lang.ArithmeticException ex)
{
System.out.println("Error");
}
}

}

class demo1{
public static void main(String args[])
{
calculator c = new calculator(10,8);
Scanner sc = new Scanner(System.in);
int k =0;
System.out.println("Enter an operator:");
char s = sc.next().charAt(0);
switch (s){
case '+':
k = c.add();
break;
case '-':
k = c.sub();
break;
case '*':
k=c.mul();
break;
case '/':
c.div();
break;
default:
System.out.println("Enter an appropriate choice");
break;
}
System.out.println(k);
}
}
