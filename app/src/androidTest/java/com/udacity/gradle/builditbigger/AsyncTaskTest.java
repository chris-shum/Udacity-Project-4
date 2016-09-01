package com.udacity.gradle.builditbigger;

import android.test.InstrumentationTestCase;

import org.junit.Test;


/**
 * Created by ShowMe on 8/31/16.
 */

public class AsyncTaskTest extends InstrumentationTestCase{

    @Test
    public void testAsyncTask() throws Exception {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute(getInstrumentation().getContext());
        String joke = endpointsAsyncTask.get();
        assertNotNull(joke);
    }
}
