/* Traditional Comments!*/
/** Java Doc Comments! */
package ch2Practice;

public class Ch2Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * main method is the starting point of every Java application
		 * For Java application one of the methods must be called "main", otherwise (JVM) will not excute the app
		 * Methods perform tasks and can return info when they complete their tasks
		 * key "void" indicates that this method will not return any information
		 */
		
		System.out.println("\"Hi There!\"");
		System.out.print("Hi");
		System.out.println(" There!");
		System.out.println("Hi\nThere!"); //same result as: System.out.printf("Hi\nThere!");
		System.out.println("my name is Asma\\Sama\\");
		/*
		 * \n Newline
		 * \t Horizontal tab
		 * \r carriage return -windows tend to use \r\n as a line separator, Unix tends to use \n, Macs used to use \r
		 * \\ print backslash character
		 * \* print double-quote 
		 */
		
		//DISPLAYING TEXT WITH PRINTF
		System.out.printf("My name is:%nAsma"); //%n newline
		System.out.printf("Today is:%s", "Sunday");
		
		/*
		 * SUMMARY
		 * System.out.printf --(f means "formatted") displays formatted data.
		 * fixed text is output by printf just as it would be by print or println
		 * format specifiers each of it is a "placeholder" for a value and specifies the type of data to output
		 * format specifiers begin with a percent sign (%) followed by a character that representeds the data type
		 * %s is a placeholder for a string
		 * %n is a newline 
		 */

	}

}