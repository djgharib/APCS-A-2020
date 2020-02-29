package Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int x = 0;
		for(int i = 1; i<ray.size(); i++) {
			if(ray.get(i)>ray.get(0)) {
				x+=ray.get(i);
			}
		}
		if(x==0) {
			x=-1;
		}
		return x;
	}
}