package exemplo.builder.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage
{
	protected Wait<WebDriver> wait;
	
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		wait = createWait(driver);
		wait.until(getPageLoadCondition());
	}

	private Wait<WebDriver> createWait(WebDriver driver)
	{
		return new WebDriverWait(driver, 10);
	}
	
	protected abstract ExpectedCondition<?> getPageLoadCondition();
}
