package exception;

public class TeMqException extends Exception {

    public TeMqException (String error, Exception e){
        System.out.println(error + " " + e);
    }

}
