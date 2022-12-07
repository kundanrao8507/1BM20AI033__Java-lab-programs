class retail_item{
String desc;
int unit;
double price;
retail_item(String s , int u, double p){
desc = s;
unit = u;
price = p;
}
void display(){
System.out.println("Item desc:"+desc);
System.out.println("Units:"+unit);
System.out.println("Price:"+price);
}
}

class 1a{
public static void main(String args[])
{
retail_item a1  = new retail_item("Banana",10,50);
retail_item a2  = new retail_item("Mouse",1,250);
retail_item a3  = new retail_item("Clock",1,5000);
a1.display();
}
}
