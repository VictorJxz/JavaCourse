package org.svrlab.repository_poo.model;

public class ClientPremium extends Client implements  Comparable<ClientPremium>{

    public ClientPremium(String username, String surname) {
        super(username, surname);
    }

    @Override
    public int compareTo(ClientPremium o) {
        return 0;
    }
}
