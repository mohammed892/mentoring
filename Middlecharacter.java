package method;

import java.util.Scanner;

public class Middlecharacter {

	public static void main(String[] args) {
		/*write a Java method to display the middle character of a string.
		Note: a) If the length of the string is odd there will be two middle characters.
		b) If the length of the string is even there will be one middle character.*/
		
		Scanner keyboard =new Scanner(System.in);
				System.out.println("input the string");
				String str=keyboard.nextLine();
				System.out.println("the middle character in the String " + middle(str)+ "\n");
				
	}
	public static String middle (String str)
	{
		
	
	int position;
    int length;
    if (str.length() % 2 == 0)
    {
        position = str.length() / 2 - 1;
        length = 2;
    }
    else
    {
        position = str.length() / 2;
        length = 1;
    }
    return str.substring(position, position + length);

}
}
		