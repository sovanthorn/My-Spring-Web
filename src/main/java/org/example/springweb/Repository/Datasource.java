package org.example.springweb.Repository;

import java.util.ArrayList;

public class Datasource {
    public static void main(String[] args){
        ArrayList<String> toDo= new ArrayList<>();
            toDo.add("Take a shower");
            toDo.add("Do housework");
            toDo.add("Go to school");
        System.out.printf("To do List:");
        for(String name:toDo){
            System.out.printf(name);
        }

    }
}
