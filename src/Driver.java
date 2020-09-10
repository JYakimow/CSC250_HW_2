public class Driver
{
	public static void main(String[] args)
	{
		//create variables
		String aString = "Galations";
		String vowels = "AEIOUaeiou";
		int count = 0;
		int stringLength = aString.length();
		int vowelStringLength = vowels.length();

		for(int i = 0; i <= stringLength-1; i++)
		{
			for(int a = 0; a <= vowelStringLength-1; a++)
			{
				if(aString.charAt(i) == vowels.charAt(a))
				{
					count++;
				}
			}
		}
		//display initial string
		System.out.print("The string is: ");
		System.out.println(aString);
		//print number of vowels in string to console
		System.out.print("There are ");
		System.out.print(count);
		System.out.print(" vowels in this string.");
	} //ends main function
} //ends Driver class