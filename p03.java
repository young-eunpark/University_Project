package w03;

public class p03 {
	public static void main(String[] args) {
		String furniture = "�����,��Ź��,������,TV,�����,��ǻ��";
		String[] f = furniture.split(",");

		for(int i=0;i<6;i++)
		{
			System.out.println(f[i]);
		}
	}
}
