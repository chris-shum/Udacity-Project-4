package com.udacity.gradle.builditbigger;

import android.test.InstrumentationTestCase;

import org.junit.Test;


/**
 * Created by ShowMe on 8/31/16.
 */

public class AsyncTaskTest extends InstrumentationTestCase{
    //must comment out certain sections in endpointsasynctask before running test
    @Test
    public void testAsyncTask() throws Exception {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        String joke = endpointsAsyncTask.execute().get();
        assertNotNull(joke);
    }
}
