package org.svrlab.classabstract.form.validator;

import org.svrlab.classabstract.form.validator.message.IMessageFormat;

public class LongValidator extends Validator implements IMessageFormat {

    protected  String message = "the field %s must have minimum %s characters and maximum %s characters";
    private int min;
    private int max = Integer.MAX_VALUE;

    public LongValidator() {
    }

    public LongValidator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

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
        //this.message = String.format( this.message, this.min, this.max);
        if ( value == null ) {
            return true;
        }
        int longer = value.length();
        return (longer >= min && longer <= max);
    }

    @Override
    public String getMessageFormat(String field) {
        return String.format( this.message, field, this.min, this.max);
    }

}
