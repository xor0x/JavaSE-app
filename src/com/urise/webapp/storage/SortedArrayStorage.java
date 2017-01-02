package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.Arrays;

/**
 * Created by Alex on 19.12.2016.
 */
public class SortedArrayStorage extends AbstractArrayStorage{



    @Override
    protected void fillDeletedElement(int index) {
        int numMoved = size - index -1;
        if(numMoved > 0){
            System.arraycopy(storage , index +1, storage, index, numMoved);
        }
    }

    @Override
    protected void insertElement(Resume r, int index) {
        int insertIdx = -index - 1;
        System.arraycopy(storage , insertIdx,storage,insertIdx+1,size-insertIdx);
        storage[insertIdx] = r;
    }



    @Override
    protected int getIndex(String uuid) {
        Resume searchKey = new Resume(uuid);

        return Arrays.binarySearch(storage,0,size,searchKey);
    }
}
