package w06;

import java.util.*;
import java.text.*;
public class WorldTimeTest {
	public static void main(String[] args) {
		TimeZone tz;
		Date time = new Date();
		
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy년 MM월 dd일 aa HH시 mm분 ss초");
		tz=TimeZone.getTimeZone("Asia/Seoul");
		format1.setTimeZone(tz);	
		String Seoul=format1.format(time);
		System.out.println("서울 표준시\n"+Seoul+"\n");
		
		SimpleDateFormat format2 = new SimpleDateFormat("yy년 MM월 dd일 aa HH시 mm분 ss초");
		tz=TimeZone.getTimeZone("CET");
		format2.setTimeZone(tz);	
		String MEurope=format2.format(time);
		System.out.println("중부 유럽 표준시\n"+MEurope+"\n");
		
		SimpleDateFormat format3 = new SimpleDateFormat("dd-MM-yyyy aa HH:mm:ss");
		tz=TimeZone.getTimeZone("EST");
		format3.setTimeZone(tz);	
		String EAmerica=format3.format(time);
		System.out.println("미 동부 표준시\n"+EAmerica+"\n");
		
		SimpleDateFormat format4 = new SimpleDateFormat("MM-dd-yyyy aa HH:mm:ss");
		tz=TimeZone.getTimeZone("EST");
		format4.setTimeZone(tz);	
		String PAmerica=format4.format(time);
		System.out.println("미 태평양 표준시\n"+PAmerica+"\n");
		
		SimpleDateFormat format5 = new SimpleDateFormat("yy-MM-dd EEEE aa HH:mm:ss");
		tz=TimeZone.getTimeZone("BRT");
		format5.setTimeZone(tz);	
		String Brasilia=format5.format(time);
		System.out.println("브라질리아 표준시\n"+Brasilia+"\n");
		
		SimpleDateFormat format6 = new SimpleDateFormat("yyyy-MM-dd aa HH:mm:ss");
		tz=TimeZone.getTimeZone("Asia/Moscow");
		format6.setTimeZone(tz);	
		String Moscow=format6.format(time);
		System.out.println("모스크바 표준시\n"+Moscow+"\n");
		
		SimpleDateFormat format7 = new SimpleDateFormat("yyyy/MM/dd aa HH:mm:ss");
		tz=TimeZone.getTimeZone("Africa/Cairo");
		format7.setTimeZone(tz);	
		String Arab=format7.format(time);
		System.out.println("아라비아 표준시\n"+Arab+"\n");
		
		SimpleDateFormat format8 = new SimpleDateFormat("G yyyy-MM-dd EEEE HH:mm:ss aa");
		tz=TimeZone.getTimeZone("SAST");
		format8.setTimeZone(tz);	
		String SAfrica=format8.format(time);
		System.out.println("남아프리카 표준시\n"+SAfrica+"\n");
		
		SimpleDateFormat format9 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aa");
		tz=TimeZone.getTimeZone("AEST");
		format9.setTimeZone(tz);	
		String Aus=format9.format(time);
		System.out.println("오스트레일리아 동부 표준시\n"+Aus+"\n");
		
		SimpleDateFormat format10 = new SimpleDateFormat("yy/MM월/dd HH:mm:ss aa");
		tz=TimeZone.getTimeZone("CST");
		format10.setTimeZone(tz);	
		String China=format10.format(time);
		System.out.println("중국 표준시\n"+China+"\n");
	}
}
