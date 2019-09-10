import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Screentest {

	public static void main(String []args)throws IOException
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Desktop\\geckodriver.exe");
		DesiredCapabilities capabilites= DesiredCapabilities.firefox();
		capabilites.setCapability("marionette",true);
		FirefoxDriver f = new FirefoxDriver();
		f.get("https://www.amazon.com/");
		TakesScreenshot ts =((TakesScreenshot)f);
		File f1=ts.getScreenshotAs(OutputType.FILE);
		File f2= new File("D:\\testimg.jpg");
		Files.copy(f1, f2);
	}
	private void method1() {
		System.out.println("added new git ");

	}
}
