package tests;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class BaseTest
{
	protected WebDriver driver;

	@Before
	public void setUp() throws Exception
	{
		driver = createDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		File testpage = new File("src/test/resources/testpage.html");
		driver.get("file://" + testpage.getAbsolutePath());
	}

	@After
	public void tearDown() throws Exception
	{
		getDriver().quit();
	}

	private WebDriver createDriver()
	{
		return new FirefoxDriver();
	}

	private WebDriver getDriver()
	{
		if (driver == null)
		{
			createDriver();
		}

		return driver;
	}
}
