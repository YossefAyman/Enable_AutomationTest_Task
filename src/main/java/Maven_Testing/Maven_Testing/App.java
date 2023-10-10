package Maven_Testing.Maven_Testing;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	File file = new File("C:\\Users\\DELL\\eclipse-workspace\\Enable_AutomationTest_Task\\chromedriver.exe");
    	System.out.println("Does file exist? " + file.exists());
    	System.out.println("Is file executable? " + file.canExecute());
    }
}
