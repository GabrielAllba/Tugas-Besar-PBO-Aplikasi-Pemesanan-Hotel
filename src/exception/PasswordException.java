
package exception;

public class PasswordException extends Exception{
    public String message(){
        return "Password setidaknya terdiri dari huruf besar, huruf kecil, angka, dan tanda unik!";
    }
}
