package exemplo.builder.tests.selenium;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import exemplo.builder.pageobjects.CriarUsuarioPage;
import exemplo.builder.pageobjects.CriarUsuarioPageFluent;

public class CriarUsuarioTest extends BaseTest
{
	private CriarUsuarioPage usuarioPage;

	@Test
	public void criarUsuarioSomenteComCamposObrigatorios() throws InterruptedException
	{
	        usuarioPage = new CriarUsuarioPage(driver);
	        
		new CriarUsuarioPage.CriarUsuarioFormBuilder(driver, "Admin", "11145678906").submit();
		
		assertTrue(usuarioPage.getMsgSucesso().isDisplayed());
	}
	
	@Test
	public void criarUsuarioPreenchendoTodosOsCampos()
	{
	        usuarioPage = new CriarUsuarioPage(driver);

		new CriarUsuarioPage.CriarUsuarioFormBuilder(driver, "Admin2", "12332199912")
			.dataNascimento("01/07/1918")
			.endereco("Av Presidente Vargas 1000")
			.bairro("Centro")
			.cidade("Rio de Janeiro")
			.estado("Rio de Janeiro")
			.infosAdicionais("Perto da Central do Brasil")
			.submit();
		
		assertTrue(usuarioPage.getMsgSucesso().isDisplayed());
	}
	
	@Test
        public void criarUsuarioPreenchendoTodosOsCamposFluent()
        {
                CriarUsuarioPageFluent page = new CriarUsuarioPageFluent(driver);
                
                page.nome("Admin2")
                    .cpf("12332199912")
                    .dataNascimento("01/07/1918")
                    .endereco("Av Presidente Vargas 1000")
                    .bairro("Centro")
                    .cidade("Rio de Janeiro")
                    .estado("Rio de Janeiro")
                    .infosAdicionais("Perto da Central do Brasil")
                    .submit();
                        
                assertTrue(page.getMsgSucesso().isDisplayed());
        }
}
