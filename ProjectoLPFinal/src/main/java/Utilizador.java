import java.util.HashSet;

/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Utilizador.
 * 
 * @author JorgeMiguel
 */
public class Utilizador {
	
	public HashSet<AlwaysOn> alwaysOns = new HashSet<AlwaysOn>();
	private int nif = 0;
	private String morada = "";
	private int idUtilizador = 0;
	private String nome = "";
	private String estadoCivil = "";
	private String email = "";
	private String cidade = "";
	public HashSet<Relacao> class3s = new HashSet<Relacao>();

	public Utilizador() {
		// Start of user code constructor for Utilizador)
		super();
		// End of user code
	}


	public Utilizador addUtilizadores(int idUtilizador, String nome, String morada, String cidade, int nif, String email){
		
		this.idUtilizador = idUtilizador;
		this.nome = nome;
		this.morada = morada;
		this.cidade = cidade;
		
		return this;
	}
	
	
	public HashSet<AlwaysOn> getAlwaysOns() {
		return this.alwaysOns;
	}

	/**
	 * Returns nif.
	 * @return nif 
	 */
	public int getNif() {
		return this.nif;
	}

	/**
	 * Sets a value to attribute nif. 
	 * @param newNif 
	 */
	public void setNif(int newNif) {
		this.nif = newNif;
	}

	/**
	 * Returns morada.
	 * @return morada 
	 */
	public String getMorada() {
		return this.morada;
	}

	/**
	 * Sets a value to attribute morada. 
	 * @param newMorada 
	 */
	public void setMorada(String newMorada) {
		this.morada = newMorada;
	}

	/**
	 * Returns idUtilizador.
	 * @return idUtilizador 
	 */
	public int getIdUtilizador() {
		return this.idUtilizador;
	}

	/**
	 * Sets a value to attribute idUtilizador. 
	 * @param newIdUtilizador 
	 */
	public void setIdUtilizador(int newIdUtilizador) {
		this.idUtilizador = newIdUtilizador;
	}

	/**
	 * Returns nome.
	 * @return nome 
	 */
	public String getNome() {
		return this.nome;
	}

	/**
	 * Sets a value to attribute nome. 
	 * @param newNome 
	 */
	public void setNome(String newNome) {
		this.nome = newNome;
	}

	/**
	 * Returns estadoCivil.
	 * @return estadoCivil 
	 */
	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	/**
	 * Sets a value to attribute estadoCivil. 
	 * @param newEstadoCivil 
	 */
	public void setEstadoCivil(String newEstadoCivil) {
		this.estadoCivil = newEstadoCivil;
	}

	/**
	 * Returns email.
	 * @return email 
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Sets a value to attribute email. 
	 * @param newEmail 
	 */
	public void setEmail(String newEmail) {
		this.email = newEmail;
	}

	/**
	 * Returns cidade.
	 * @return cidade 
	 */
	public String getCidade() {
		return this.cidade;
	}

	/**
	 * Sets a value to attribute cidade. 
	 * @param newCidade 
	 */
	public void setCidade(String newCidade) {
		this.cidade = newCidade;
	}

	/**
	 * Returns class3s.
	 * @return class3s 
	 */
	public HashSet<Relacao> getClass3s() {
		return this.class3s;
	}

}
