package com.test.demoappgit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {
    private MainActivity activity;

    @Before
    public void setUp() throws Exception{
        activity = Robolectric.buildActivity(MainActivity.class)
                .create()
                .resume()
                .get();

    }
    @Test
    public void shouldBeEqual()throws  Exception{

        activity.findViewById(R.id.clickmebtn).performClick();
        activity.findViewById(R.id.clickmebtn).performClick();
        String expectedMessage = "The button is clicked 2 times";
        String actual = activity.mMessage;
        assertEquals(expectedMessage,actual);
    }


    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(activity);
    }

}
