package exemplo.stepbuilder.tests.usuario;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exemplo.stepbuilder.usuario.Usuario;
import exemplo.stepbuilder.usuario.UsuarioStepBuilder;

public class UsuarioStepBuilderTest
{
	@Test
    public void getUsuarioComStepBuilder()
    {
		
		 Usuario pablo = UsuarioStepBuilder.newBuilder()
						                   .nome("Pablo do Arrocha")
						                   .cpf("00013491035")
						                   .dataNascimento("01/04/1985")
						                   .endereco("Rua da Sofrencia, 171")
						                   .email("pablo@sofrenc.ia")
						                   .informacoes("Estou indo embora agora")
						                   .build();
            
         assertEquals("Pablo do Arrocha", pablo.getNome());
    }
}
