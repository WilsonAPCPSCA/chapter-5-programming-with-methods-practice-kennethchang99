import java.util.Scanner;
public class timeEnglish {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter an hour between 1 and 12.");
		int hours = in.nextInt();
		System.out.println("Please enter the amount of minutes between 0 and 59.");
		int minutes = in.nextInt();
		System.out.println(getTimeName(hours, minutes));
	}
	public static String getTimeName(int hours, int minutes){
		String hour = "";
		String minute = "";
		if (hours == 1){
			hour = "one";
		}else if (hours == 2){
			hour = "two";
		}else if (hours == 3){
			hour = "three";
		}else if (hours == 4){
			hour = "four";
		}else if (hours == 5){
			hour = "five";
		}else if (hours == 6){
			hour = "six";
		}else if (hours == 7){
			hour = "seven";
		}else if (hours == 8){
			hour = "eight";
		}else if (hours == 9){
			hour = "nine";
		}else if (hours == 10){
			hour = "ten";
		}else if (hours == 11){
			hour = "eleven";
		}else{
			hour = "twelve";
		}
		String yuh = "";
		if (minutes == 15){
			minute = " quarter after ";
			yuh = minute + hour;
		}else if (minutes == 30){
			minute = " half past ";
			yuh = minute + hour;
		}else if (minutes == 45){
			minute = " quarter til ";
			yuh = minute + hour;
		}else if (minutes == 0){
			minute = " o'clock ";
			yuh = hour + minute;
		}else{
			minute = " minutes past ";
			yuh = minutes + minute + hour;
		}
		return yuh;
	}
}
