package laborator3.exceptions;

public class InvalidSingerException extends Exception {
	private String message;

	public InvalidSingerException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "InvalidSingerException [message=" + message + "]";
	}

}
