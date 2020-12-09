package w03;

public class p03 {
	public static void main(String[] args) {
		String furniture = "냉장고,세탁기,에어컨,TV,오디오,컴퓨터";
		String[] f = furniture.split(",");

		for(int i=0;i<6;i++)
		{
			System.out.println(f[i]);
		}
	}
}
