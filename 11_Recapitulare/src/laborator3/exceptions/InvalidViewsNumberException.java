package laborator3.exceptions;

public class InvalidViewsNumberException extends Exception {
	private String message;

	public InvalidViewsNumberException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "InvalidViewsNumberException [message=" + message + "]";
	}

}
