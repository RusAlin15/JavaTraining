package laborator3.exceptions;

public class EmptyVerseException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public EmptyVerseException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return message;
	}

}
