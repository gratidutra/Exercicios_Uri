package entities;

import java.util.Date;

public class Ordem {
    private Date date = new Date();
    private Product product;
    private String local;

    public Ordem(String local) {
        this.date = date;
        this.local = local;
    }

    @Override
    public String toString() {
        return  "-" + date
                + ", '" + local +"'-" + "\n";
    }
}
