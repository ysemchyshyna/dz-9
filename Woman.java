package org.example;

public class Woman extends Person{
    private String maidenName;

    public Woman(String firstName, String lastName, int age){
        super(firstName, lastName, age);
        this.maidenName = lastName;
    }

    @Override
    public boolean isRetired() {
        return this.age > 60;
    }

    @Override
    public void registerPartnership(Person partner) {
        if (partner instanceof Man){
            super.registerPartnership(partner);
            this.setLastName(partner.getLastName());
        } else {
            throw new IllegalArgumentException("Partner must be a man");
        }
    }
    @Override
    public void deregisterPartnership(boolean revertLastName){
        super.deregisterPartnership(revertLastName);
        if (revertLastName){
            this.setLastName(this.maidenName);
        }
    }
}
