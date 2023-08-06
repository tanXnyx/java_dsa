import java.util.Scanner;
public class POG_1 
{

	public static void main(String[] args) 
	{
		Float Fahrenheit,Celsius;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a degree in Fahrenheit:");
		Fahrenheit=ob.nextFloat();
		Celsius = (Fahrenheit-32)*(5.0f/9);
		System.out.println(Fahrenheit+" Fahrenheit is "+Celsius+" Celsius");
			}

}
