public class Date {
        int year, month, day;
        
       public Date (int year, int month, int day) {
    	   if (year >= 1900 && year <= 3000)
    	   this.year=year;
    	   if (month >= 1 && month <= 12)
    	   this.month=month;
    	   if (day >= 1 && day <= 31)
    	   this.day=day;
       }
      public int getmonth() {
    	  return month;
   	}

   	 public int getyear() {
   		return year;
   	}
    public int getDay() {

		if ((month == 1 || month == 3 || month == 5 || month == 7 || 
				month == 8|| month == 10 || month == 12 )) {
			return day;
		
		}
		else if ((month == 4 || month == 6 || month == 9 || month == 11)
				) {
			return day;
		}

		else if (month == 2 && day >= 1 && day <= 28) {
			return day;
		}
         else
			return 0;

	}
   	public int dayOfYear() {
   		int totalDays = 0;
   		switch (month) {
   		case 12: totalDays += 30;
   		case 11: totalDays += 31;
   		case 10: totalDays += 30;
   		case 9 : totalDays += 31;
   		case 8 : totalDays += 31;
   		case 7 : totalDays += 30;
   		case 6 : totalDays += 31;
   		case 5 : totalDays += 30;
   		case 4 : totalDays += 31;
   		case 3 : totalDays += 28;
   		case 2 : totalDays += 31;
   		}
   		totalDays += day;
   		return totalDays;
   		}
   	
   	public int compare(Date dt) {
		int difference = Math.abs((dayOfYear() + (365 *year))-(dt.dayOfYear() + 365 * dt.year));
		int numMonths = difference/30;
		if(numMonths > 60) {
			numMonths = 60;
		}
		return numMonths;
	}
   	  
   	  
}
