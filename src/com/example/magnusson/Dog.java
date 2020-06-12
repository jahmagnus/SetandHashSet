package com.example.magnusson;



public class Dog {

    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj){
            System.out.println("This object is comparing itself to itself");
            return true;
        }

        if (obj instanceof Dog){
            String obName = ((Dog) obj).getName();
            return this.name.equals(obName);
        }

        return false;
    }
}
