package exemplo.builder.tests.usuario;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exemplo.builder.usuario.Usuario;

public class UsuarioBuilderTest
{
    @Test
    public void getUsuarioComBuilder()
    {
            Usuario dollynho = new Usuario.UsuarioBuilder("Dollynho", "11133344409")
                                          .dataNascimento("01/09/1979")
                                          .endereco("Rua do Amiguinho, 1000")
                                          .bairro("Guaranalandia")
                                          .cidade("Guaranazinho do Sul")
                                          .estado("Acre")
                                          .informacoes("Cuidado com o sol!")
                                          .build();
            
            assertEquals("Dollynho", dollynho.getNome());
    }
}
