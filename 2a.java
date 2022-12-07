class A{
private int a,b;
protected float c,d;
int l,k;
A(){
l=5;
k=10;
}
A(int e, int r){
l = e;
k = r;
}
void display(){
System.out.println("The sum of the two numbers are"+(l+k));
}

final void d(){
System.out.println("This Method cannot be further inherited");
}
}

class B extends A{
int l = 15;
int k = 11;
void display(){
System.out.println("The product of the two numbers of the parent is"+(super.l*super.k));
System.out.println("The product of the two numbers of the child is"+(l*k));
}
}

class C extends B{
int l = 11;
int k = 119;
void display(){
System.out.println("The product of the two numbers of the parent is"+(super.l*super.k));
System.out.println("The product of the two numbers of the child is"+(l*k));
}
}

class D extends B{
int l = 155;
int k = 111;
void display(){
System.out.println("The product of the two numbers of the parent is"+(super.l*super.k));
System.out.println("The product of the two numbers of the child is"+(l*k));
}
}

class 2a{
public static void main(String args[])
{
A a1 = new A(1,2);
a1.display();
}
}
