package exemplo.stepbuilder.usuario;

public class UsuarioStepBuilder
{
	private UsuarioStepBuilder() {}

	public static NomeStep newBuilder()
	{
		return new Steps();
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
		Usuario build();
	}

	private static class Steps implements NomeStep, CpfStep, DataNascimentoStep, EnderecoStep, EmailStep, 
		InformacoesStep, BuildStep
	{
		private Usuario usuario;
		
		public CpfStep nome(String nome)
		{
			usuario = new Usuario();
			usuario.setNome(nome);
			return this;
		}

		public DataNascimentoStep cpf(String cpf)
		{
			usuario.setCpf(cpf);
			return this;
		}

		public EnderecoStep dataNascimento(String dataNasc)
		{
			usuario.setDataNascimento(dataNasc);
			return this;
		}

		public EmailStep endereco(String endereco)
		{
			usuario.setEndereco(endereco);
			return this;
		}

		public InformacoesStep email(String email)
		{
			usuario.setEmail(email);
			return this;
		}

		public BuildStep informacoes(String informacoes)
		{
			usuario.setInformacoes(informacoes);
			return this;
		}

		public Usuario build()
		{
			return usuario;
		}
	}
}
