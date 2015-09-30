package exemplo.stepbuilder.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CriarUsuarioPage extends BasePage
{
	@FindBy(id="msgSucesso")
	private WebElement msgSucesso;
	
	@FindBy(id="nome")
	private WebElement nome;
	
	public CriarUsuarioPage(WebDriver driver)
	{
		super(driver);
	}

	@Override
	protected ExpectedCondition<?> getPageLoadCondition()
	{
		return ExpectedConditions.visibilityOf(nome);
	}
	
	public WebElement getMsgSucesso()
	{
		return msgSucesso;
	}
}
