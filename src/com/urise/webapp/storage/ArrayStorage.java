package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage extends AbstractArrayStorage {


    @Override
    protected void fillDeletedElement(int index) {
        storage[index] = storage[size-1];
    }

    @Override
    protected void insertElement(Resume r, int index) {
        storage[size] = r;
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */


protected int getIndex(String uuid){
    for(int i = 0; i < size; i++){
        if(uuid == storage[i].getUuid()){
            return i;
        }
    }
    return -1;
}
}