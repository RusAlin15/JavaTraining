package laborator3.exceptions;

public class InvalidFileLineException extends Exception {
	private String messsage;

	public InvalidFileLineException(String messsage) {
		super();
		this.messsage = messsage;
	}

	@Override
	public String toString() {
		return "InvalidFileLineException [messsage=" + messsage + "]";
	}

}
