package com.company;

public class Danser extends Person {

    public String groupName;

    public Danser(String groupName) {
        this.groupName = groupName;
    }

    public Danser(String name, String designation,String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }
    public void dansing (){
        System.out.println("Balet biyin biylei alat");
    }

    @Override
    public String toString() {
        return "Danser{" +
                "groupName='" + groupName + '\'' +
                "} " + super.toString();
    }
}
