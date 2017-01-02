package com.urise.webapp.exception;

/**
 * Created by Alex on 26.12.2016.
 */
public class ExistStorageException extends StorageException {
    public ExistStorageException(String uuid) {
        super("Resume"+ uuid+"allready exist",uuid);
    }


}
