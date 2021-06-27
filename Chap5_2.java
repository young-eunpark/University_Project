package report2;

import java.sql.*;

public class Chap5_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;
		PreparedStatement pstmt;
		PreparedStatement pstmt1;
		PreparedStatement pstmt2;
		int i=0,j=0,k=0;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/report1","re1","Report1@");
			System.out.println("������ ���̽� ���� ����");
			System.out.println();
			
			//3��
			/*Statement stmt=conn.createStatement();
			Statement stmt1=conn.createStatement();
			Statement stmt2=conn.createStatement();
			Statement stmt3=conn.createStatement();

			ResultSet select=stmt.executeQuery("SELECT S.sid, S.sname FROM Sailors S, Reserves R WHERE S.sid=R.sid AND R.bid=103");
			ResultSet nameA=stmt1.executeQuery("SELECT S.sid, S.sname, S.age FROM Sailors S WHERE S.sname LIKE 'A%'");
			ResultSet Bcolor=stmt2.executeQuery("SELECT S.sid,S.sname,S.rating FROM Sailors S, Boats B, Reserves R "
					+ "WHERE S.sid=R.sid AND R.bid=B.bid AND B.color='green'");
			ResultSet ReserveAll=stmt3.executeQuery("SELECT S.sid,S.sname FROM Sailors S "
					+ "WHERE NOT EXISTS(SELECT B.bid FROM Boats B "
					+ "WHERE NOT EXISTS(SELECT R.bid FROM Reserves R WHERE R.bid=B.bid AND R.sid=S.sid))");

			System.out.println("------R.bid=103�� Saliors : sid, sname------");
			while(select.next()) {
				int sid = select.getInt(1);
				String sname = select.getString(2);
				System.out.println(sid+"\t"+sname);
			}
			System.out.println();

			System.out.println("------�̸��� A�� �����ϴ� ����� sid,sname,age------");
			while(nameA.next()) {
				int sid = nameA.getInt(1);
				String sname = nameA.getString(2);
				int age=nameA.getInt(3);
				System.out.println(sid+"\t"+sname+"\t"+age);
			}
			System.out.println();

			System.out.println("------�� ���� green�� ������ ����� sid,sname,rating------");
			while(Bcolor.next()) {
				int sid = Bcolor.getInt(1);
				String sname = Bcolor.getString(2);
				int rating=Bcolor.getInt(3);
				System.out.println(sid+"\t"+sname+"\t"+rating);
			}
			System.out.println();

			System.out.println("------��� �踦 ������ ������ sid,sname------");
			while(ReserveAll.next()) {
				int sid = ReserveAll.getInt(1);
				String sname = ReserveAll.getString(2);
				System.out.println(sid+"\t"+sname);
			}
			System.out.println();*/
			
			//4��
			pstmt=conn.prepareStatement("Insert into Boats(bid,bname,color) Values(?,?,?)");
			pstmt.setInt(1, 105);
			pstmt.setString(2, "Clipper");
			pstmt.setString(3, "blue");
			i=pstmt.executeUpdate();
			
			pstmt1=conn.prepareStatement("Delete from Reserves where bid=?");
			pstmt1.setInt(1, 102);
			j=pstmt1.executeUpdate();
			
			pstmt2=conn.prepareStatement("Update Sailors set sname=? where sname=?");
			pstmt2.setString(1, "Dongmin");
			pstmt2.setString(2, "Horatio");
			k=pstmt2.executeUpdate();
			
			Statement stmt=conn.createStatement();
			Statement stmt1=conn.createStatement();
			Statement stmt2=conn.createStatement();
			
			ResultSet s=stmt.executeQuery("select * from Sailors");
			ResultSet b=stmt1.executeQuery("select * from Boats");
			ResultSet r=stmt2.executeQuery("select * from Reserves");
			
			System.out.println("-----Insert,Delete,Update �� ǥ�õǴ� ������-----");
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
			
			conn.close();  //3��, 4�� ����
			pstmt.close();
			pstmt1.close();
			pstmt2.close();
			System.out.println("�����ͺ��̽� ���� ����");
		}
		catch(Exception e){
			System.out.println("���� : "+e);
		}
	}
}


