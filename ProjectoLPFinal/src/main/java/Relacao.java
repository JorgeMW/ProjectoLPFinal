import java.util.HashSet;

/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Relacao.
 * 
 * @author JorgeMiguel
 */
public class Relacao {
	/**
	 * Description of the property utilizadorRelacao.
	 */
	private Utilizador utilizadorRelacao = null;

	/**
	 * Description of the property utilizadors.
	 */
	public HashSet<Utilizador> utilizadors = new HashSet<Utilizador>();

	// Start of user code (user defined attributes for Relacao)

	// End of user code

	/**
	 * The constructor.
	 */
	public Relacao() {
		// Start of user code constructor for Relacao)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Relacao)

	// End of user code
	/**
	 * Returns utilizadorRelacao.
	 * @return utilizadorRelacao 
	 */
	public Utilizador getUtilizadorRelacao() {
		return this.utilizadorRelacao;
	}

	/**
	 * Sets a value to attribute utilizadorRelacao. 
	 * @param newUtilizadorRelacao 
	 */
	public void setUtilizadorRelacao(Utilizador newUtilizadorRelacao) {
		this.utilizadorRelacao = newUtilizadorRelacao;
	}

	/**
	 * Returns utilizadors.
	 * @return utilizadors 
	 */
	public HashSet<Utilizador> getUtilizadors() {
		return this.utilizadors;
	}

}
