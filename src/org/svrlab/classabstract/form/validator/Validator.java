package org.svrlab.classabstract.form.validator;

public abstract class Validator {

    protected String message;

    public abstract void setMessage( String message );
    public abstract  String getMessage();
    public abstract boolean isValid( String value);
}
