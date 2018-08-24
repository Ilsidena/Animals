package ru.suai.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import ru.suai.Feed;
import ru.suai.Rest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class CallerTest {
    private Caller caller;

    @Mock
    private Api api;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        caller = new Caller(api);
    }

    @Test
    public void test() {
        when(api.getResponse("name", "food", 0)).thenReturn(
                new Rest ("name", new Feed("food", 0)));
        assertEquals(caller.getResponse("name", "food", 0),
                new Rest ("name", new Feed("food", 0)));
    }
}