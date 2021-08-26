package org.svrlab.design_patron.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Component{


    private List<Component> child;

    public Directory(String name) {
        super(name);
        this.child = new ArrayList<>();
    }

    public Directory addComponent( Component component ) {
        child.add( component );
        return this;
    }

    public void removeComponent( Component component ) {
        child.remove( component );
    }

    @Override
    public String render( int level) {

        StringBuilder string = new StringBuilder("\t".repeat( level ));
        string.append(name).append("/").append("\n");

        for ( Component child: this.child ) {
            string.append( child.render( level + 1) );

            if ( child instanceof  File) {
                string.append("\n");
            }
        }
        return string.toString();
    }

    @Override
    public boolean search(String name) {

        if ( this.name.equalsIgnoreCase( name ) ) {
            return true;
        }
/*        for ( Component child: this.child ) {
            if ( child.search( name ) ) {
                return  true;
            }
        }*/

        return child.stream().anyMatch( c -> c.search(name));
    }


}
