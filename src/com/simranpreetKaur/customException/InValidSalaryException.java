package com.simranpreetKaur.customException;

public class InValidSalaryException extends Exception{
    public InValidSalaryException(String message) {
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

    public static boolean validateSalary(double baseSalary) {
        if (baseSalary < 0) {
            return false;
        } else if (baseSalary < 2000) {
            return false;
        }
        return true;
    }
}
