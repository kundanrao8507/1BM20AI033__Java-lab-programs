public class Clock {
	private int hours, minutes, seconds;

	// method to check if these are in thier respective range
	private boolean isInRange(int hours, int minutes, int seconds) {
		return hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59 && seconds >= 0 && seconds <= 59;
	}

	// default constructor to set time to 12:0:0
	public Clock() {
		this.hours = 12;
		this.minutes = 0;
		this.seconds = 0;
	}

	// pameterized constructor
	public Clock(int hours, int minutes, int seconds) {
		if (isInRange(hours, minutes, seconds)) {
			this.hours = hours;
			this.minutes = minutes;
			this.seconds = seconds;
		}
	}

	// constructor with one parameter seconds
	// initialize clock to arg seconds since midnight(0:0:0)
	public Clock(int seconds) {
		// counting seconds after mints whole minutes
		this.seconds = seconds % 60;
		int mints = seconds / 60;

		// counting minutes after hours whole hours
		this.minutes = mints % 60;
		int hours = mints / 60;

		this.hours = hours % 24;

	}

	// setClock() method
	// initalize the clock to arg seconds since midnight
	public void setClock(int seconds) {
		// counting seconds after mints whole minutes
		this.seconds = seconds % 60;
		int mints = seconds / 60;

		// counting minutes after hours whole hours
		this.minutes = mints % 60;
		int hours = mints / 60;

		this.hours = hours % 24;
	}

	// getters and setters
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	// tick method to increment time by one second
	public void tick()
	{
		this.seconds+=1;
		
		// if it is 60 then increment minutes by one
		if(this.seconds == 60) 
		{
			this.seconds = 0;
			this.minutes+=1;
			
			// if minutes is 60 now then increment hour by one
			if(this.minutes == 60)
			{
				this.minutes=0;
				this.hours +=1;
				
				// if hours is 24 then make it 0 (next day start)
				if(this.hours == 24)
				{
					this.hours = 0;
				}
			}
		}
	}
	
	// tickDown() method to decrement time by one second
		public void tickDown()
		{
			this.seconds-=1;
			
			// if it is -1 then decrement minutes by one make seconds 59
			if(this.seconds == -1) 
			{
				this.seconds = 59;
				this.minutes-=1;
				
				// if minutes is 0 now then decrement hour by one and make minutes 59
				if(this.minutes == -1)
				{
					this.minutes=59;
					this.hours -=1;
					
					// if hours is -1 then make it 23 (previous day)
					if(this.hours == -1)
					{
						this.hours = 23;
					}
				}
			}
		}
	
	// addClock(Clock c) 
	//it set time of current clock to same as clock c
	public void addClock(Clock c)
	{
		this.hours=c.getHours();
		this.minutes=c.getMinutes();
		this.seconds=c.getSeconds();
	}
	
	// subtracrt Clock
	// subtract argument clock time from this clock and return
	public Clock subtractClock(Clock c)
	{
		int diffSeconds = 0;	// diff in seconds
		diffSeconds+= this.getSeconds() - c.getSeconds() ;
		diffSeconds+= 60*(this.getMinutes() - c.getMinutes());
		diffSeconds+= 3600*(this.getHours() - c.getHours());
		
		Clock ret = new Clock(Math.abs(diffSeconds));			// clock with this number of seconds
		return ret;
	}
	
	// toString() method
	public String toString()
	{
		String ret="";
		ret+=(hours<10)?"0":"" ;
		ret+= hours + ":";
		ret+=(minutes<10)?"0":"";
		ret+= minutes + ":";
		ret+=(seconds<10)?"0":"";
		ret+= seconds;
		return ret;
	}
	
	
	

}

public class ClockDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("First Clock");
		System.out.println("Enter seconds for firstClock: ");
		int seconds = sc.nextInt();
		Clock firstClock = new Clock(seconds);
		
		for(int i=0;i<10;i++)
		{
			firstClock.tick();
			System.out.println(firstClock);
		}
		
		System.out.println("Enter Hours Minutes Seconds for secondClock");
		int hours = sc.nextInt();
		int minutes = sc.nextInt();
		int second = sc.nextInt();
		
		System.out.println("Second Clock");
		Clock secondClock =  new Clock(hours,minutes,second);
		
		for(int i=0;i<10;i++)
		{
			secondClock.tick();
			System.out.println(secondClock);
		}
		
		System.out.println("First Clock: "+firstClock);
		System.out.println("Second Clock: "+secondClock);
		Clock thirdClock = firstClock.subtractClock(secondClock);
		System.out.println("First Clock - Second Clock = "+thirdClock);
		
		firstClock.addClock(secondClock);
		System.out.println("First Clock: "+firstClock);
		System.out.println("Second Clock: "+secondClock);
		
		thirdClock = firstClock.subtractClock(secondClock);
		System.out.println("First Clock - Second Clock = "+thirdClock);
		
		
	}

}
