package org.svrlab.classabstract.form;

import org.svrlab.classabstract.form.element.*;
import org.svrlab.classabstract.form.element.select.Option;
import org.svrlab.classabstract.form.validator.*;

import java.util.Arrays;
import java.util.List;

public class ExampleForm {

    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidator( new RequiredValidator());

        InputForm password = new InputForm("password", "password");
        password.addValidator( new RequiredValidator()).addValidator( new LongValidator(6 , 12) );

        InputForm email = new InputForm("email", "email");
        email.addValidator( new RequiredValidator()).addValidator( new EmailValidator());

        InputForm age = new InputForm("age", "number");
        age.addValidator( new NumberValidator());

        TextAreaForm experience = new TextAreaForm("Exp ", 5, 9);
        SelectForm language = new SelectForm("language");
        language.addValidator( new NotNullValidator());
        language.addOption( new Option("1","Java").setSelected() )
        .addOption( new Option("2","Python"))
        .addOption( new Option("3","JavaScript"))
                .addOption( new Option("4","TypeScript") );

        ElementForm greet = new ElementForm("greeting"){
            @Override
            public String rendersHtml() {
                return "<input disabled name='"+this.name+"' value=\""+this.value+"\">";
            }
        };
        greet.setValue("Hello, how's this field disabled");

        username.setValue("Victor");
        password.setValue("a1b2c3");
        email.setValue("virusmx@gmail.com");
        age.setValue("22");
        experience.setValue("... more than one year of experience ...");

        List<ElementForm> elements = Arrays.asList(username, password, email, age, experience, language, greet );

        // Lambda expression
        elements.forEach( element -> {
            System.out.println( element.rendersHtml() );
            System.out.println("<br>");
        });

        elements.forEach( element -> {
            if (!element.esValid()) {
                element.getErrors().forEach( System.out::println );
            }
        });

    }
}
