import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


/**
 * TODO A simple class that needs to be localized
 *
 * @author mohan.
 *         Created Mar 27, 2010.
 */
public class PrintBalance{

	
	/**
	 * Simple Java Method that is crying out to be localized.
	 *
	 * @param args
	 */
	public static void main(String args[])
	{
	
		String language;
		String country;
		Locale currentLocale;
		ResourceBundle messages;
		
		if(args.length == 0){
			language = "en";
			country = "US";
		} else {
			language = args[0];
			country = args[1];
		}
		
		
		currentLocale = new Locale(language, country);
		messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
				
		Scanner scanInput = new Scanner(System.in);
		Date today = new Date();
		
		//Greeting
		
		String greeting = messages.getString("greeting");
		System.out.println(greeting);
		
		//Get User's Name
		
		String question = messages.getString("question");
		System.out.println(question);
		String name = scanInput.nextLine();
		
		String personalized_greeting = messages.getString("personalized_greeting") + name;
		System.out.println(personalized_greeting);
		
		//print today's date, balance and bid goodbye
		System.out.println(messages.getString("date_prefix")+ DateFormat.getDateInstance(DateFormat.LONG, currentLocale).format(today));
		System.out.println(messages.getString("money")+NumberFormat.getCurrencyInstance(currentLocale).format(9876543.21));
		System.out.println(messages.getString("bye"));
	}
}
