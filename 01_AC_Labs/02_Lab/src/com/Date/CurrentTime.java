package com.Date;

public class CurrentTime extends CurrentDate {

	private int second=0;
	private int minute=0;
	private int hour=0;
	
	private long MILLISINHOUR = 60*60*1000;
	private long MILLISINMINUTE = 60*1000;
	
	CurrentTime(){
		setCurrentHour1();
		setCurrentMinute1();
		setCurrentSecond1();
		}
	
	void setCurrentHour1() {
		while(millis >= MILLISINHOUR){
			millis -= MILLISINHOUR;
			hour++;
		}
	}
			
	void setCurrentMinute1() {	
		while(millis >= MILLISINMINUTE){
			millis -= MILLISINMINUTE;
			minute++;
		}
	}

					
	void setCurrentSecond1() {	
		while(millis >= MILLISINMINUTE/60){
			millis -= MILLISINMINUTE/60;
			second++;
		}
	}
	
	void getTime() {
		System.out.print("Time: " + hour + ":" + minute + ":"  + second);
	}
	
}
