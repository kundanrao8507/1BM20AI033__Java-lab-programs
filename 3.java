public interface tossable
{
void toss();
}

public abstract class Ball implements tossable
{
private String brandName;
Ball(String brandName)
{
this.brandName = brandName;
}
String getbrandName()
{
return brandName;
}
public abstract void bounce();
}
public class Baseball extends Ball
{
Baseball(String brandName)
{
super(brandName);
}
void toss()
{
}
void bounce()
{
}
}

public class Football implements Ball
{
Football(String brandName)
{
super(brandName);
}
}

public class Rock implements Tossable
{
   
    public void toss()
    {        
    }
   
}

class demo
{
public static void main(String[] args)
{
 Ball b = new Ball("Kipsta");
 i = b.getbrandName;
 System.out.println("Ball brand : "i);
  
}
}
