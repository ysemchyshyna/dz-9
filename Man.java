package org.example;

public class Man extends Person {
    public Man (String firstName, String lastName, int age){
        super(firstName, lastName, age);
    }

    @Override
    public boolean isRetired(){
        return this.age > 65;
    }

    @Override
    public void registerPartnership(Person partner){
        if (partner instanceof Woman){
            super.registerPartnership(partner);
        } else {
            throw new IllegalArgumentException ("Partner must be a woman");
        }
    }

    public void deregisterPartnership(boolean revertLastName){
        super.deregisterPartnership(revertLastName);
    }
}
