package w04;

import java.util.*;

public class Member {
	public static void main(String[] args) {
		String id,passwd;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Id 입력 : ");
			id=sc.next();
			checkID(id);
			System.out.print("PassWord 입력 : ");
			passwd=sc.next();
			checkPasswd(passwd);
			
			System.out.println(id);
			System.out.println(passwd);
		}
		catch(NotExistIDException e)
		{
			System.out.println("ID가 없음");
		}
		catch(WrongPasswordException e)
		{
			System.out.println("Password가 잘못됨");
		}
	}
	public static String checkID(String id) throws NotExistIDException
	{
		if(id.equals("0"))
			throw new NotExistIDException();
		else
			return id;
	}
	public static String checkPasswd(String passwd) throws WrongPasswordException
	{
		if(passwd.equals("0"))
			throw new WrongPasswordException();
		else
			return passwd;
	}
}
class NotExistIDException extends Exception
{
	public NotExistIDException() {}
}
class WrongPasswordException extends Exception
{
	public WrongPasswordException() {}
}
