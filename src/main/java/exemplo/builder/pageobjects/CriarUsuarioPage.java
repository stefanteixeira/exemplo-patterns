package exemplo.builder.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

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
	
	public static class CriarUsuarioFormBuilder
	{	
		private WebDriver driver;
		
		public CriarUsuarioFormBuilder(WebDriver driver, String nome, String cpf)
		{
			this.driver = driver;
			sendKeys("nome", nome);
			sendKeys("cpf", cpf);
		}
		
		public CriarUsuarioFormBuilder dataNascimento(String dataNascimento)
		{
			sendKeys("nasc", dataNascimento);
			return this;
		}
		
		public CriarUsuarioFormBuilder endereco(String endereco)
		{
			sendKeys("endereco", endereco);
			return this;
		}
		
		public CriarUsuarioFormBuilder bairro(String bairro)
		{
			sendKeys("bairro", bairro);
			return this;
		}
		
		public CriarUsuarioFormBuilder cidade(String cidade)
		{
			sendKeys("cidade", cidade);
			return this;
		}
		
		public CriarUsuarioFormBuilder estado(String estado)
		{
			Select estadoCombobox = new Select(this.driver.findElement(By.id("estado")));
			estadoCombobox.selectByVisibleText(estado);
			return this;
		}
		
		public CriarUsuarioFormBuilder infosAdicionais(String infos)
		{
			sendKeys("infos", infos);
			return this;
		}
		
		public void submit()
		{
			this.driver.findElement(By.id("btn-submit")).click();
		}
		
		private void sendKeys(String elementId, String text)
		{
			this.driver.findElement(By.id(elementId)).sendKeys(text);
		}
	}
}
