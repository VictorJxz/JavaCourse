package org.svrlab.classabstract.form.element;

import org.svrlab.classabstract.form.validator.LongValidator;
import org.svrlab.classabstract.form.validator.Validator;
import org.svrlab.classabstract.form.validator.message.IMessageFormat;

import java.util.ArrayList;
import java.util.List;

public abstract class ElementForm {

    protected String value;
    protected String name;

    private List<Validator> validatorList;
    private List<String> errors;


    public ElementForm(){
        this.validatorList = new ArrayList<>();
        this.errors = new ArrayList<>();
    }

    public ElementForm( String name) {
        this();
        this.name = name;
    }

    public ElementForm addValidator( Validator validator ){
        this.validatorList.add( validator );
        return this;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean esValid(){
        for( Validator v: validatorList){
            if ( !v.isValid( this.value )){
                if ( v instanceof IMessageFormat){
                    this.errors.add( ((IMessageFormat) v).getMessageFormat( name) );
                } else {
                    this.errors.add( String.format(v.getMessage(), name) );
                }
            }
        }
        return this.errors.isEmpty();
    }

    public abstract String rendersHtml();
}
