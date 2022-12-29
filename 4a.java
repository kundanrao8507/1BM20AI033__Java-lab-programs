enum size{ small, medium, large, monster}

class test{

size psize;

/*test(size pizzasize){

this.psize = pizzasize;
}*/

public void orderpizza(size psize){

switch(psize){
   case small: System.out.println("Ordered an Small size pizza");
               break;
   case medium: System.out.println("Ordered an Medium size pizza");
               break;
   case large: System.out.println("Ordered an Large size pizza");
               break;
   case monster: System.out.println("Ordered an Monster size pizza");
               break;
   default: System.out.println("Please select the pizza size");
               break;
}
}
}

public class Main{

public static void main(String  args[]){

size s = size.monster;

test t = new test();

t.orderpizza(s);

}
}
