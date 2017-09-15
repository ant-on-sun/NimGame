package com.springsun.nimgamej.view.consoleview;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ReadInteger.class)
public class AskNumberOfStonesTest {
    ConsoleView vmock;

    @Before
    public void setUp() throws Exception {
        vmock = Mockito.mock(ConsoleView.class);
        PowerMockito.mockStatic(ReadInteger.class);
    }

    @After
    public void tearDown() throws Exception {
        vmock = null;
    }

    @Test
    public void askNumberOfStonesTest() throws Exception {
        PowerMockito.when(ReadInteger.readInt()).thenReturn(12);
        AskNumberOfStones.askNumberOfStones(vmock);
        PowerMockito.verifyStatic(ReadInteger.class);
        ReadInteger.readInt();
        Mockito.verify(vmock).setNumberOfStones(12);
    }

}