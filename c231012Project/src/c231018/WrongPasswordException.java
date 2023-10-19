package c231018;

public class WrongPasswordException extends Exception {
	WrongPasswordException(String message){
		super(message);
	}
	// 사용처는?
	// 1. Bean    2. DAO    3. Servlet    4. FrontEnd(jsp)
}
