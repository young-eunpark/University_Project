package report1;

import java.sql.*;

public class Chap5_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/report1","re1","Report1@");
			System.out.println("������ ���̽� ���� ����");
			System.out.println();
			
			Statement stmt=conn.createStatement();
			Statement stmt1=conn.createStatement();
			Statement stmt2=conn.createStatement();
			
			ResultSet s=stmt.executeQuery("select * from Sailors");
			ResultSet b=stmt1.executeQuery("select * from Boats");
			ResultSet r=stmt2.executeQuery("select * from Reserves");
			
			System.out.println("------Sailors ������------");
			while(s.next()) {
				int sid = s.getInt(1);
				String sname = s.getString(2);
				int rating = s.getInt(3);
				double age = s.getDouble(4);
				System.out.println(sid+"\t"+sname+"\t"+rating+"\t"+age);
			}
			System.out.println();
			
			System.out.println("------Boats ������------");
			while(b.next()) {
				int bid = b.getInt(1);
				String bname = b.getString(2);
				String color = b.getString(3);
				System.out.println(bid+"\t"+bname+"\t"+color);
			}
			System.out.println();
			
			System.out.println("------Reserves ������------");
			while(r.next()) {
				int sid = r.getInt(1);
				int bid = r.getInt(2);
				String day = r.getString(3);
				System.out.println(sid+"\t"+bid+"\t"+day);
			}
			System.out.println();
			
			System.out.println("�����ͺ��̽� ���� ����");
			conn.close();
		}
		catch(Exception e){
			System.out.println("���� : "+e);
		}
	}

}
