import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{
		int sum = 0;
		int num1 = num;
		while (num1 > 0){
			sum++;
			num1 /= 10;
		}
		digitList = new ArrayList<Integer>();
		int num2 = num;
		for (int i = 0; i < sum; i++){
			digitList.add(num2 % 10);
			num2 /= 10;
		}
	}

	public boolean isStrictlyIncreasing()
	{
		for (int i = 1; i < digitList.size(); i++){
			if (digitList.get(i) <= digitList.get(i-1)){
				return false;
			}
		}
		return true;

	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
