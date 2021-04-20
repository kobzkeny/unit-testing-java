package pl.devfoundry.testing;

public class Account {
    private boolean active;
    private Adress defaultDeliveryAdress;

    public void setActive(boolean active) {
        this.active = active;
    }


    public Account() {

        this.active = false;
    }

    public void activate() {

        this.active = true;
    }

    public boolean isActive() {
        return this.active;
    }


    public Adress getDefaultDeliveryAdress() {
        return defaultDeliveryAdress;
    }

    public void setDefaultDeliveryAdress(Adress defaultDeliveryAdress) {
        this.defaultDeliveryAdress = defaultDeliveryAdress;
    }
}