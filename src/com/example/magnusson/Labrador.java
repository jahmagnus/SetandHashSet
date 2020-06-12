package com.example.magnusson;

public class Labrador extends Dog {
    public Labrador(String name) {
        super(name);
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj){
//            System.out.println("This object is comparing itself to itself");
//            return true;
//        }
//
//        if (obj instanceof Labrador){
//            String obName = ((Labrador) obj).getName();
//            return this.getName().equals(obName);
//        }
//
//        return false;
//    }
}
