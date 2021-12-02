package laborator3.exceptions;

public class EmptyVerseException extends Exception {
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
