import static org.junit.Assert.assertEquals;

import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;



public class TestPrintBalance {

	@Test
	public void testUSGreeting() {
		Locale currentLocale = new Locale("en", "US");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals(messages.getString("greeting"),"Hello World");	
	}
	
	@Test
	public void testFrenchQuestion() {
		Locale currentLocale = new Locale("fr", "FR");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals(messages.getString("question"),"Entrez votre nom, je vous en prie");	
	}
	
	@Test
	public void testGermanPersonalizedGreeting() {
		Locale currentLocale = new Locale("de", "DE");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals(messages.getString("personalized_greeting"),"Ich freue mich, Sie kennen zu lernen ");	
	}
	
	@Test
	public void testUSDatePrefix() {
		Locale currentLocale = new Locale("en", "US");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals(messages.getString("date_prefix"),"As of : ");	
	}
	
	@Test
	public void testFrenchMoney() {
		Locale currentLocale = new Locale("fr", "FR");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals(messages.getString("money"),"Vous devez l'Ecole ");	
	}
	
	@Test
	public void testGermanBye() {
		Locale currentLocale = new Locale("de", "DE");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals(messages.getString("bye"),"Auf Wiedersehen");	
	}
	
//	@Test
//	public void testUSCurency() {
//		Locale currentLocale = new Locale("en", "US");
//		assertEquals("$9,876,543.21",NumberFormat.getCurrencyInstance(currentLocale).format(9876543.21));
//	}
//	
//	@Test
//	public void testFrenchDate() {
//		Locale currentLocale = new Locale("fr", "FR");
//		DateFormat.getDateInstance(DateFormat.LONG, currentLocale).format(today));
//	}
	
}