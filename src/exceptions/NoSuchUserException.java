package exceptions;

@SuppressWarnings("serial")
public class NoSuchUserException extends Exception {
	public NoSuchUserException() {
		super("Nie ma użytkownika o takim loginie.");
	}
}
