package com.urise.webapp;

import com.urise.webapp.model.SectionType;

/**
 * Created by Alex on 20.01.2017.
 */
public class TestSingleton {
    private static TestSingleton instance;

    public static TestSingleton getInstance() {
        if(instance ==null){
            instance = new TestSingleton();
        }
        return instance;
    }

    private TestSingleton() {
    }

    public static void main(String[] args) {
        TestSingleton.getInstance().toString();
        Singleton instance = Singleton.valueOf("INSTANCE");
        System.out.println(instance.name());
        for (SectionType type: SectionType.values()
             ) {
            System.out.println(type.getTitle());

        }
    }
    public enum Singleton{
        INSTANCE
    }
}
