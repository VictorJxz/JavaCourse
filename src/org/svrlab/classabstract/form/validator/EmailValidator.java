package org.svrlab.classabstract.form.validator;

public class EmailValidator extends Validator{

    protected String message = "The field %s  mail format is invalid";
    private final static String EMAIL_REGEX = "^(.+)@(.+)$";

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
        return value.matches( EMAIL_REGEX );
    }
}
