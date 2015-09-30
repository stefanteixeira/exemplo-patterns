package exemplo.stepbuilder.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import exemplo.builder.pageobjects.CriarUsuarioPage;
import exemplo.stepbuilder.pageobjects.CriarUsuarioFormStepBuilder;

public class CriarUsuarioTest extends BaseTest
{
	private CriarUsuarioPage usuarioPage;
	
	@Before
	public void before()
	{
		usuarioPage = new CriarUsuarioPage(driver);
	}
	
	@Test
	public void criarUsuarioComStepBuilder()
	{
		CriarUsuarioFormStepBuilder stepBuilder = new CriarUsuarioFormStepBuilder(driver);
		stepBuilder.newBuilder()
				   .nome("Pablo")
				   .cpf("00900199212")
				   .dataNascimento("01/01/1961")
				   .endereco("Av da Sofrencia, 171")
				   .email("homemnaochora@sofrenc.ia")
				   .informacoes("Estou indo embora agora")
				   .build();
		
		assertTrue(usuarioPage.getMsgSucesso().isDisplayed());
	}
}
