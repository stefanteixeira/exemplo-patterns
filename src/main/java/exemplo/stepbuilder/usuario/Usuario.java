package exemplo.stepbuilder.usuario;

public class Usuario
{
	//todos os atributos sao obrigatorios!
	private String nome;
	private String cpf;
	private String dataNascimento;
	private String endereco;
	private String email;
	private String informacoes;
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getCpf()
	{
		return cpf;
	}
	
	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}
	
	public String getDataNascimento()
	{
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento)
	{
		this.dataNascimento = dataNascimento;
	}
	
	public String getEndereco()
	{
		return endereco;
	}
	
	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getInformacoes()
	{
		return informacoes;
	}
	
	public void setInformacoes(String informacoes)
	{
		this.informacoes = informacoes;
	}
}
