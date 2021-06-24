package w06;

import java.util.TimeZone;

public class WorldTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] local=TimeZone.getAvailableIDs();
		for(int i=0;i<local.length;i++)
			System.out.println(local[i]);
	}

}
