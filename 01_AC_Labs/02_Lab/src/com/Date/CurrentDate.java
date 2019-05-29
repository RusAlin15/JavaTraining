package com.Date;

public class CurrentDate {

	long millis =(long) System.currentTimeMillis();
	private int year = 1970;
	private int month = 1;
	private int day = 1;
	
	private long MILLISINDAY = 24*60*60*1000;
	
	CurrentDate(){
		setCurrentYear1();
		setCurrentMonth1();
		setCurrentDay1();
	}
		
void setCurrentYear1() {		
		while(millis >= 365*MILLISINDAY) {
		if(year%400 ==  0 || (year%4 == 0 && year%100 !=0)) {
			millis -= 366*MILLISINDAY;
			year++;
						 
		}	else {
				millis -= 365*MILLISINDAY;
				year++;
			}
		}
}


void setCurrentMonth1() {
		while(millis >= 28*MILLISINDAY){
				switch(month) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					millis -= 31*MILLISINDAY;
					month++;
					break;
				case 2:
					if(year%400 ==  0 || (year%4 == 0 && year%100 !=0)) {
						millis -= 29*MILLISINDAY;
						month++;
					}
					else {
						millis -= 28*MILLISINDAY;
						month++;						
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					millis -= 30*MILLISINDAY;
					month++;
					break;
				}
		}
}

void setCurrentDay1() {	
	while(millis >= MILLISINDAY){
		millis -= MILLISINDAY;
		day++;
	}
}




public void getDate() {
	System.out.print("DATE: " + day);
	switch(month) {
	case 1:
		System.out.print(".Jan.");
		break;
	case 2:
		System.out.print(".Feb.");
		break;
	case 3:
		System.out.print(".Mar.");
		break;
	case 4:
		System.out.print(".Apr.");
		break;
	case 5:
		System.out.print(".May.");
		break;
	case 6:
		System.out.print(".Jun.");
		break;
	case 7:
		System.out.print(".Jul.");
		break;
	case 8:
		System.out.print(".Aug.");
		break;
	case 9:
		System.out.print(".Sep.");
		break;
	case 10:
		System.out.print(".Oct.");
		break;
	case 11:
		System.out.print(".Nov.");
		break;
	case 12:
		System.out.print(".Dec.");
		break;
	}
	System.out.println(+ year);
}
}

