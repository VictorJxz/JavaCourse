package org.svrlab.invoiceapp.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Invoice {


    private int folio;
    private String description;
    private Date date;

    private Client client;
    private ItemInvoice[] items;
    private int indexItem;
    public static final int MAX_ITEMS = 12;
    private static int lastFolio;

    public Invoice(String description, Client client) {
        this.description = description;
        this.client = client;
        this.items = new ItemInvoice[ MAX_ITEMS ];
        this.folio = ++lastFolio;
        this.date = new Date();

    }

    public int getFolio() {
        return folio;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getIndexItem() {
        return indexItem;
    }

    public void addItemInvoice( ItemInvoice itemInvoice) {
        if ( indexItem < MAX_ITEMS ){
            this.items[ indexItem++ ] = itemInvoice;
        }
    }

    public double calculateTotal(){
        double total = 0.0;
        for( int i = 0; i < indexItem; i++ ) {
            total += this.items[i].calculateAmount();
        }
        return total;
    }

    public String generateDetail() {
        StringBuilder sb = new StringBuilder("Invoice N° : ");
        sb.append( folio )
                .append("\n Client : " + this.client.getName())
                .append("\t NIF : " + this.client.getNif() )
                .append("\n description : " + this.description + "\n");

        SimpleDateFormat  simpleDateFormat = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("\nDate of issue : " + simpleDateFormat.format( this.date ) + "\n")
                .append("\n # \t Name \t $ \t Quantity \t Total\n");

        for ( int i = 0; i < indexItem; i++) {
            sb.append( this.items[i].toString() + "\n");
        }
        sb.append("\n Grand total : " + calculateTotal());
        return sb.toString();
    }

    @Override
    public String toString() {
        return generateDetail();
    }
}
