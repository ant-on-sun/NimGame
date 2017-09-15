package com.springsun.nimgamej.view.consoleview;

import com.springsun.nimgamej.model.ListOfHeaps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ReadInteger.class)
public class AskQuantityOfStonesTest {
    ListOfHeaps h = new ListOfHeaps(3, 12);

    @Before
    public void setUp() throws Exception {
        PowerMockito.mockStatic(ReadInteger.class);
    }

    @After
    public void tearDown() throws Exception {
        h = null;
    }

    @Test
    public void askQuantityOfStonesTest() throws Exception {
        PowerMockito.when(ReadInteger.readInt()).thenReturn(5);
        AskQuantityOfStones.askQuantityOfStones(h, 0);
        PowerMockito.verifyStatic(ReadInteger.class);
        ReadInteger.readInt();
        assertEquals(5, AskQuantityOfStones.askQuantityOfStones(h, 0));
    }

}