package com.urise.webapp.storage;

import com.urise.webapp.exception.ExistStorageException;
import com.urise.webapp.exception.NotExistStorageException;
import com.urise.webapp.exception.StorageException;
import com.urise.webapp.model.Resume;

import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public abstract class AbstractArrayStorage implements Storage {
    protected static final int STORAGE_LIMIT = 100000;
    protected Resume[] storage = new Resume[STORAGE_LIMIT];
    protected int size = 0;

    public int size() {
        return size;
    }

    public Resume get(String uuid) {
        int index = getIndex(uuid);
        if(index < 0) {
            throw new NotExistStorageException(uuid);
        }
        return storage[index];
    }

    public void clear() {
        Arrays.fill(storage,0,size,null);
        size=0;
    }


    public void update(Resume r) {
        int index = getIndex(r.getUuid());

        if(index == -1){
          throw new NotExistStorageException(r.getUuid());
        }
        else {
            storage[index] = r;
        }

    }
    public Resume[] getAll(){
        return Arrays.copyOfRange(storage,0,size);
    }

    public void save(Resume r) {
        int index = getIndex(r.getUuid());
        if(index >= 0){
            throw new ExistStorageException(r.getUuid());
        }else if(size == storage.length){
            throw new StorageException("Storage overflow",r.getUuid());
        } else{
            insertElement(r, index);
            size++;
        }
    }

    public void delete(String uuid) {
        int index = getIndex(uuid);
        if(index <0){
            throw new NotExistStorageException(uuid);
        }else{
            fillDeletedElement(index);
            storage[size - 1]= null;
            size--;
        }
    }

    protected abstract void fillDeletedElement(int index);

    protected abstract void insertElement(Resume r, int index);

    protected abstract int getIndex(String uuid);


}