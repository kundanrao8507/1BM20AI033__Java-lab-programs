class Car
{
	private int Speed = 0;
	private String Make = "Chevy";
	private int yearModel = 2000;
		
	public Car (String n, int Model)
	{	
		Make = n;
		yearModel = Model; 
	}
	
	public int getyearModel ()
	{
		return yearModel;
	}
	
	public String getMake ()
	{
		return Make;
	}
	
	public int getSpeed ()
	{
		return Speed;
	}	
		
	public void accelerate ()
	{
		if (Speed !=90)
			Speed = Speed +5;
	}
	
	public void brake ()
	{
		if (Speed !=0)
			Speed = Speed -5;
	}
}

public class 1b
{
	public static void main (String [] str)
	{
		Car car1 = new Car("Chevy", 2000);
		for (int i = 1; i <= 5; i++)
		{
			car1.accelerate();
			System.out.println("Current speed is: " + car1.getSpeed());
		}
		for (int j = 1; j <= 5; j++)
		{
			car1.brake();
			System.out.println("Current speed is: " + car1.getSpeed());
		}		
		
	}
}
