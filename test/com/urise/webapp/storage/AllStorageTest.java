package com.urise.webapp.storage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Alex on 20.01.2017.
 */

    @RunWith(Suite.class)
    @Suite.SuiteClasses({
            ArrayStorageTest.class,
            SortedArrayStoragetest.class,
            ListStorageTest.class,
            MapUuidStorageTest.class,
            MapResumeStorageTest.class

    })
    public class AllStorageTest {
}
