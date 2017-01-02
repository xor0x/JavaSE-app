package com.urise.webapp;

import com.urise.webapp.model.Resume;
import com.urise.webapp.storage.ArrayStorage;

/**
 *
 * Test for com.urise.webapp.storage.ArrayStorage
 */
public class MainArray {
   private final static ArrayStorage ARRAY_STORAGE = new ArrayStorage();

    public static void main(String[] args) {
        String uuid = null;
      final  Resume r1 = new Resume(uuid);

       final Resume r2 = new Resume(uuid);

      final  Resume r3 = new Resume(uuid);



        ARRAY_STORAGE.save(r1);
        ARRAY_STORAGE.save(r2);
        ARRAY_STORAGE.save(r3);


        printAll();
        System.out.println("Get r1: " + ARRAY_STORAGE.get(r1.getUuid()));
        System.out.println("Size: " + ARRAY_STORAGE.size());

        printAll();
        ARRAY_STORAGE.delete(r1.getUuid());
        printAll();
        ARRAY_STORAGE.clear();
        printAll();


       System.out.println("Size: " + ARRAY_STORAGE.size());



    }
    static void printAll() {
       // System.out.println("\nGet All");
        for (Resume r : ARRAY_STORAGE.getAll()) {
            System.out.println(r);
        }

    }
}
