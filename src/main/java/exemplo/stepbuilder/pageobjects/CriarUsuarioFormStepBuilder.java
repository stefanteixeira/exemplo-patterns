package exemplo.stepbuilder.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CriarUsuarioFormStepBuilder
{
	private static WebDriver driver;
	
	public CriarUsuarioFormStepBuilder(WebDriver driver)
	{
		CriarUsuarioFormStepBuilder.driver = driver;
	}
	
	public NomeStep newBuilder()
	{
		return new Steps(driver);
	}
	
	public static interface NomeStep
	{
		CpfStep nome(String nome);
	}
	
	public static interface CpfStep
	{
		DataNascimentoStep cpf(String cpf);
	}
	
	public static interface DataNascimentoStep
	{
		EnderecoStep dataNascimento(String dataNasc);
	}
	
	public static interface EnderecoStep
	{
		EmailStep endereco(String endereco);
	}
	
	public static interface EmailStep
	{
		InformacoesStep email(String email);
	}
	
	public static interface InformacoesStep
	{
		BuildStep informacoes(String informacoes);
	}
	
	public static interface BuildStep
	{
		void build();
	}
	
	private static class Steps implements NomeStep, CpfStep, DataNascimentoStep, EnderecoStep,
		EmailStep, InformacoesStep, BuildStep
	{
		private WebDriver driver;
		
		public Steps(WebDriver driver)
		{
			this.driver = driver;
		}
		
		public CpfStep nome(String nome)
		{
			sendKeys("nome", nome);
			return this;
		}
		
		public DataNascimentoStep cpf(String cpf)
		{
			sendKeys("cpf", cpf);
			return this;
		}
		
		public EnderecoStep dataNascimento(String dataNasc)
		{
			sendKeys("nasc", dataNasc);
			return this;
		}
		
		public EmailStep endereco(String endereco)
		{
			sendKeys("endereco", endereco);
			return this;
		}
		
		public InformacoesStep email(String email)
		{
			sendKeys("email", email);
			return this;
		}
		
		public BuildStep informacoes(String informacoes)
		{
			sendKeys("infos", informacoes);
			return this;
		}
		
		public void build()
		{
			this.driver.findElement(By.id("btn-submit")).click();
		}
		
		private void sendKeys(String elementId, String text)
		{
			this.driver.findElement(By.id(elementId)).sendKeys(text);
		}
	}
}
