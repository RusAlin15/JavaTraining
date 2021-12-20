package laborator3.exceptions;

public class InvalidYearException extends Exception {
	private String message;

	public InvalidYearException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "InvalidYearException [message=" + message + "]";
	}

}
