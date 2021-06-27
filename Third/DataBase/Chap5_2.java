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
			System.out.println("데이터 베이스 연결 성공");
			System.out.println();
			
			//3번
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

			System.out.println("------R.bid=103인 Saliors : sid, sname------");
			while(select.next()) {
				int sid = select.getInt(1);
				String sname = select.getString(2);
				System.out.println(sid+"\t"+sname);
			}
			System.out.println();

			System.out.println("------이름이 A로 시작하는 사람의 sid,sname,age------");
			while(nameA.next()) {
				int sid = nameA.getInt(1);
				String sname = nameA.getString(2);
				int age=nameA.getInt(3);
				System.out.println(sid+"\t"+sname+"\t"+age);
			}
			System.out.println();

			System.out.println("------배 색깔 green을 선택한 사람의 sid,sname,rating------");
			while(Bcolor.next()) {
				int sid = Bcolor.getInt(1);
				String sname = Bcolor.getString(2);
				int rating=Bcolor.getInt(3);
				System.out.println(sid+"\t"+sname+"\t"+rating);
			}
			System.out.println();

			System.out.println("------모든 배를 예약한 뱃사랑의 sid,sname------");
			while(ReserveAll.next()) {
				int sid = ReserveAll.getInt(1);
				String sname = ReserveAll.getString(2);
				System.out.println(sid+"\t"+sname);
			}
			System.out.println();*/
			
			//4번
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
			
			System.out.println("-----Insert,Delete,Update 후 표시되는 데이터-----");
			System.out.println("------Sailors 데이터------");
			while(s.next()) {
				int sid = s.getInt(1);
				String sname = s.getString(2);
				int rating = s.getInt(3);
				double age = s.getDouble(4);
				System.out.println(sid+"\t"+sname+"\t"+rating+"\t"+age);
			}
			System.out.println();
			
			System.out.println("------Boats 데이터------");
			while(b.next()) {
				int bid = b.getInt(1);
				String bname = b.getString(2);
				String color = b.getString(3);
				System.out.println(bid+"\t"+bname+"\t"+color);
			}
			System.out.println();
			
			System.out.println("------Reserves 데이터------");
			while(r.next()) {
				int sid = r.getInt(1);
				int bid = r.getInt(2);
				String day = r.getString(3);
				System.out.println(sid+"\t"+bid+"\t"+day);
			}
			System.out.println();
			
			conn.close();  //3번, 4번 공통
			pstmt.close();
			pstmt1.close();
			pstmt2.close();
			System.out.println("데이터베이스 연결 종료");
		}
		catch(Exception e){
			System.out.println("오류 : "+e);
		}
	}
}


