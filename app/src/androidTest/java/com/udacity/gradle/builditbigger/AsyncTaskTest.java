package com.udacity.gradle.builditbigger;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;


/**
 * Created by ShowMe on 8/31/16.
 */

public class AsyncTaskTest {


    @Test
    public void testAsyncTask() throws Exception {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute();
        String joke = endpointsAsyncTask.get();
        assertNotNull(joke);

    }
}
