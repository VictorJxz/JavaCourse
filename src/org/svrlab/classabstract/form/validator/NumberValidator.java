package org.svrlab.classabstract.form.validator;

public class NumberValidator extends Validator {

    protected String message = "The field %s must be a number";

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public boolean isValid(String value) {
        try {
            Integer.parseInt( value );
            return true;
        } catch ( NumberFormatException e){
            return false;
        }
    }
}
