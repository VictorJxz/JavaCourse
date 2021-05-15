package org.svrlab.classabstract.form.validator;

public class RequiredValidator extends Validator {

    protected String message = "The field %s is required";

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
        return (value != null && value.length() > 0 );
    }
}
