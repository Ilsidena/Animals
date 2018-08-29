package ru.suai.service;

import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CallerTest {
    private Caller caller;

    @Mock
    private Api api;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        caller = new Caller(api);
    }

    /*@Test
    public void test() {
        when(api.getResponse("name", "food", 0)).thenReturn(
                new Rest ("name", new Feed("food", 0)));
        assertEquals(caller.getResponse("name", "food", 0),
                new Rest ("name", new Feed("food", 0)));
    }*/
}