package w06;

import java.util.*;
import java.text.*;
public class WorldTimeTest {
	public static void main(String[] args) {
		TimeZone tz;
		Date time = new Date();
		
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy�� MM�� dd�� aa HH�� mm�� ss��");
		tz=TimeZone.getTimeZone("Asia/Seoul");
		format1.setTimeZone(tz);	
		String Seoul=format1.format(time);
		System.out.println("���� ǥ�ؽ�\n"+Seoul+"\n");
		
		SimpleDateFormat format2 = new SimpleDateFormat("yy�� MM�� dd�� aa HH�� mm�� ss��");
		tz=TimeZone.getTimeZone("CET");
		format2.setTimeZone(tz);	
		String MEurope=format2.format(time);
		System.out.println("�ߺ� ���� ǥ�ؽ�\n"+MEurope+"\n");
		
		SimpleDateFormat format3 = new SimpleDateFormat("dd-MM-yyyy aa HH:mm:ss");
		tz=TimeZone.getTimeZone("EST");
		format3.setTimeZone(tz);	
		String EAmerica=format3.format(time);
		System.out.println("�� ���� ǥ�ؽ�\n"+EAmerica+"\n");
		
		SimpleDateFormat format4 = new SimpleDateFormat("MM-dd-yyyy aa HH:mm:ss");
		tz=TimeZone.getTimeZone("EST");
		format4.setTimeZone(tz);	
		String PAmerica=format4.format(time);
		System.out.println("�� ����� ǥ�ؽ�\n"+PAmerica+"\n");
		
		SimpleDateFormat format5 = new SimpleDateFormat("yy-MM-dd EEEE aa HH:mm:ss");
		tz=TimeZone.getTimeZone("BRT");
		format5.setTimeZone(tz);	
		String Brasilia=format5.format(time);
		System.out.println("��������� ǥ�ؽ�\n"+Brasilia+"\n");
		
		SimpleDateFormat format6 = new SimpleDateFormat("yyyy-MM-dd aa HH:mm:ss");
		tz=TimeZone.getTimeZone("Asia/Moscow");
		format6.setTimeZone(tz);	
		String Moscow=format6.format(time);
		System.out.println("��ũ�� ǥ�ؽ�\n"+Moscow+"\n");
		
		SimpleDateFormat format7 = new SimpleDateFormat("yyyy/MM/dd aa HH:mm:ss");
		tz=TimeZone.getTimeZone("Africa/Cairo");
		format7.setTimeZone(tz);	
		String Arab=format7.format(time);
		System.out.println("�ƶ��� ǥ�ؽ�\n"+Arab+"\n");
		
		SimpleDateFormat format8 = new SimpleDateFormat("G yyyy-MM-dd EEEE HH:mm:ss aa");
		tz=TimeZone.getTimeZone("SAST");
		format8.setTimeZone(tz);	
		String SAfrica=format8.format(time);
		System.out.println("��������ī ǥ�ؽ�\n"+SAfrica+"\n");
		
		SimpleDateFormat format9 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aa");
		tz=TimeZone.getTimeZone("AEST");
		format9.setTimeZone(tz);	
		String Aus=format9.format(time);
		System.out.println("����Ʈ���ϸ��� ���� ǥ�ؽ�\n"+Aus+"\n");
		
		SimpleDateFormat format10 = new SimpleDateFormat("yy/MM��/dd HH:mm:ss aa");
		tz=TimeZone.getTimeZone("CST");
		format10.setTimeZone(tz);	
		String China=format10.format(time);
		System.out.println("�߱� ǥ�ؽ�\n"+China+"\n");
	}
}
