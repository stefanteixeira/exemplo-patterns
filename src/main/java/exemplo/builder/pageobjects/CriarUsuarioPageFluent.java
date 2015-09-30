package exemplo.builder.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CriarUsuarioPageFluent extends BasePage
{
	@FindBy(id="msgSucesso")
	private WebElement msgSucesso;
	
	@FindBy(id="nome")
	private WebElement nome;
	
	@FindBy(id="cpf")
        private WebElement cpf;
	
	@FindBy(id="nasc")
        private WebElement dataNasc;
	
	@FindBy(id="endereco")
        private WebElement endereco;
	
	@FindBy(id="bairro")
        private WebElement bairro;
	
	@FindBy(id="cidade")
        private WebElement cidade;
	
	@FindBy(id="estado")
        private WebElement estado;
	
	@FindBy(id="infos")
        private WebElement informacoes;
	
	@FindBy(id="btn-submit")
        private WebElement btnSubmit;
	
	public CriarUsuarioPageFluent(WebDriver driver)
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
	
	public CriarUsuarioPageFluent nome(String nome)
	{
	    this.nome.sendKeys(nome);
	    return this;
	}
	
	public CriarUsuarioPageFluent cpf(String cpf)
        {
            this.cpf.sendKeys(cpf);
            return this;
        }
	
	public CriarUsuarioPageFluent dataNascimento(String dataNasc)
        {
            this.dataNasc.sendKeys(dataNasc);
            return this;
        }
	
	public CriarUsuarioPageFluent endereco(String endereco)
        {
            this.endereco.sendKeys(endereco);
            return this;
        }
	
	public CriarUsuarioPageFluent bairro(String bairro)
        {
	    this.bairro.sendKeys(bairro);
            return this;
        }
	
	public CriarUsuarioPageFluent cidade(String cidade)
        {
            this.cidade.sendKeys(cidade);
            return this;
        }
	
	public CriarUsuarioPageFluent estado(String estado)
        {
            Select estadoCombobox = new Select(this.estado);
            estadoCombobox.selectByVisibleText(estado);
            return this;
        }
	
	public CriarUsuarioPageFluent infosAdicionais(String informacoes)
        {
            this.informacoes.sendKeys(informacoes);
            return this;
        }
	
	public void submit()
        {
	    btnSubmit.click();
        }
}
