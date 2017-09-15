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
public class AskNumberOfHeapsTest {
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
    public void askNumberOfHeapsTest() throws Exception {
        PowerMockito.when(ReadInteger.readInt()).thenReturn(4);
        AskNumberOfHeaps.askNumberOfHeaps(vmock);
        PowerMockito.verifyStatic(ReadInteger.class);
        ReadInteger.readInt();
        Mockito.verify(vmock).setNumberOfHeaps(4);
    }

}