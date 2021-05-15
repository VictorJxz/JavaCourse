package org.svrlab.classabstract.form.element;

import org.svrlab.classabstract.form.element.select.Option;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementForm{

    private List<Option> options;

    public SelectForm(String name) {
        super(name);
        this.options = new ArrayList<Option>();
    }

    public SelectForm(String name, List<Option> options) {
        super(name);
        this.options = options;
    }

    public SelectForm addOption( Option option ){
        this.options.add( option );
        return this;
    }

    @Override
    public String rendersHtml() {
        StringBuilder stringBuilder = new StringBuilder("<select ");
        stringBuilder.append("name='").append( this.name ).append("'>");

        for ( Option option : this.options ){
            stringBuilder.append("\n <option value='").append(option.getKey()).append("'");
            if ( option.isSelected() ){
                stringBuilder.append(" selected ");
                this.value = option.getValue();
            }
            stringBuilder.append(">").append( option.getValue() ).append("</option>");
        }
        stringBuilder.append("</select>");
        return stringBuilder.toString();
    }
}
