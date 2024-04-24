import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{
		int sum = 0;
		int number = num;
		while (number > 0){
			sum++;
			number /= 10;
		}
		digitList = new ArrayList<Integer>();
		for (int i = 0; i < sum; i++){
			digitList.add(num % 10);
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
