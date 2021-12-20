package laborator3.exceptions;

public class SingerNotFoundException extends Exception {
	private String message;

	public SingerNotFoundException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "SingerNotFoundException [message=" + message + "]";
	}

}
