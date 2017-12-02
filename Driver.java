import animals.Puppy;
import utils.*;

public class Driver
{
	public static void main(String[] args)
	{
		Puppy joey = new Puppy("Joey");
		Puppy chandler = new Puppy("Chandler");
		Puppy ross = new Puppy("Ross");

		System.out.println(joey.getName());
		System.out.println(chandler.getName());
		System.out.println(ross.getName());

		int[] arr = {9, 20, 3, 44, 88, 300};
		int[] newArray = ArrayUtils.reverse(arr);
		System.out.println(ArrayUtils.stringifyArray(newArray));

		double num = 15.4;

		System.out.println(utils.Math.factorial((int)num));
	}
}
