package org.svrlab.classabstract.form.validator;

public class NotNullValidator extends Validator{

    protected String message = "The field %s cannot be null ";

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
        return (value != null);
    }
}
