package com.urise.webapp.exception;

/**
 * Created by Alex on 26.12.2016.
 */
public class StorageException extends RuntimeException {
    private final String uuid;

    public StorageException(String message, String uuid) {
        super(message);
        this.uuid = uuid;
    }



    public String getUuid() {
        return uuid;
    }
}
