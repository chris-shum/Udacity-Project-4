package com.udacity.gradle.builditbigger;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotNull;


/**
 * Created by ShowMe on 8/31/16.
 */

public class AsyncTaskTest {


    @Test
    public void testAsyncTask() throws Exception {
        EndpointsAsyncTask blah = new EndpointsAsyncTask();
        blah.execute();
        String joke = blah.get(30, TimeUnit.SECONDS);
        assertNotNull(joke);

    }
}
