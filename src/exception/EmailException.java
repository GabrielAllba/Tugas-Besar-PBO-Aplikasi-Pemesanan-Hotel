
package exception;

public class EmailException extends Exception{
    public String message(){
        return "Format email tidak valid";
    }
}
