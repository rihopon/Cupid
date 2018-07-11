package model;

public class Calculation {
	public int Calc(int x, int y, String s) {
		int ans =0;
		if(s.equals("+")) ans=x+y;
		else if(s.equals("-")) ans = x-y;
		else if(s.equals("*")) ans = x*y;
		
		return ans;
	}

}
