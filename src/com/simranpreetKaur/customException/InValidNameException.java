package com.simranpreetKaur.customException;

public class InValidNameException extends Exception {
    public InValidNameException(String message) {
        super("Custom Exception:"+message);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public String getLocalizedMessage() {
        return super.getLocalizedMessage();
    }

    public static boolean validateFirstName(String firstName){

        if(firstName.length() < 5){
            return false;
        }
        return true;

    }
}
