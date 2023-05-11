package calendar_ex;

import java.util.*;

public class CalendarOutput {

	static int [] months = {1,2,3,4,5,6,7,8,9,10,11,12};
 	static void DateInput() {

		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���.>");
		int i = sc.nextInt();
		System.out.println("�⵵�� �Է��ϼ���.>");
		int years = sc.nextInt();
 	
	
	int year  = years; 
	int month = months[i]-1; 
	int START_DAY_OF_WEEK = 0; 
	int END_DAY = 0; 

	Calendar sDay = Calendar.getInstance(); // ������ 
	Calendar eDay = Calendar.getInstance(); // ���� 

	// ���� ��� 0���� 11������ ���� �����Ƿ� 1�� ���־�� �Ѵ�. 
	// ���� ���, 2019�� 11�� 1���� sDay.set(2019, 10, 1);�� ���� ����� �Ѵ�. 
		sDay.set(year, month-1, 1);       
	eDay.set(year, month, 1); 

	// �������� ù��(12�� 1��)���� �Ϸ縦 ���� ������� ������ ��(11�� 30��)�� �ȴ�. 
	eDay.add(Calendar.DATE, -1);       

	// ù ��° ������ ���� �������� �˾Ƴ���. 
	START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK); 

	// eDay�� ������ ��¥�� ���´�. 
	END_DAY = eDay.get(Calendar.DATE); 

	System.out.println("      " + year +"�� " + month +"��"); 
	System.out.println(" SU MO TU WE TH FR SA"); 

	// �ش� ���� 1���� ��� ���������� ���� ������ ����Ѵ�. 
	// ���� 1���� �������̶�� ������ �� �� ��´�.(�Ͽ��Ϻ��� ����) 
	for(int j=1; j < START_DAY_OF_WEEK; j++)  
		System.out.print("   "); 
        
	for(int j=1, n=START_DAY_OF_WEEK ; j <= END_DAY; j++, n++) { 
		System.out.print((j < 10)? "  "+j : " "+j ); 
		if(n%7==0) System.out.println(); 
		
		}
 	}
}
