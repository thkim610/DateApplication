package date;

public class Date {
	//정보은닉
	private int day;
	private int month;
	private int year;
	
	private boolean isValid; //기본값: false
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if(day<1 || day>31) {
				isValid = false;
			}else {
				isValid = true;
				this.day = day;
			}
			
			break;
		case 4: case 6: case 9: case 11:
			if(day<1 || day>30) {
				isValid = false;
			}else {
				isValid = true;
				this.day = day;
			}
			break;
		case 2: 
			if(day<1 || day>28) {
				isValid = false;
			}else {
				isValid = true;
				this.day = day;
			}
			break;
		default:
			isValid = false;

		}
		
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month<1 || month>12) {
			isValid = false;
		}else {
			isValid = true;
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if(isValid) {
			System.out.println(year + "년 " + month + "월 " + day + "일");
		}else {
			System.out.println("유효하지 않은 값입니다.");
		}
		
	}
}
