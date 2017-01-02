package com.urise.webapp.exception;

/**
 * Created by Alex on 26.12.2016.
 */
public class NotExistStorageException extends StorageException {
    public NotExistStorageException(String uuid) {
        super("Resume"+ uuid+"not exist",uuid);
    }
}
