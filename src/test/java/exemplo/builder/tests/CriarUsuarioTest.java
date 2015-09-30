package exemplo.builder.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import exemplo.builder.pageobjects.CriarUsuarioPage;

public class CriarUsuarioTest extends BaseTest
{
	private CriarUsuarioPage usuarioPage;
	
	@Before
	public void before()
	{
		usuarioPage = new CriarUsuarioPage(driver);
	}
	
	@Test
	public void criarUsuarioSomenteComCamposObrigatorios()
	{
		new CriarUsuarioPage.CriarUsuarioFormBuilder(driver, "Admin", "11145678906").submit();
		
		assertTrue(usuarioPage.getMsgSucesso().isDisplayed());
	}
	
	@Test
	public void criarUsuarioPreenchendoTodosOsCampos()
	{
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
}
