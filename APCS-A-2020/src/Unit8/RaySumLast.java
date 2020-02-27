package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int addValue = 0;
		
		for(int i = 0; i<ray.length-1; i++) {
			
			if(ray[i]>ray[ray.length-1]) {
				addValue+=ray[i];
			}
		}
		if(addValue == 0) {
			addValue= -1;
		}
		return addValue;
	}
}