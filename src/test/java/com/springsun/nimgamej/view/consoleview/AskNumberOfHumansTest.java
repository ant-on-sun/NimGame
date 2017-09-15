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
public class AskNumberOfHumansTest {
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
    public void askNumberOfHumansTest() throws Exception {
        PowerMockito.when(ReadInteger.readInt()).thenReturn(1);
        AskNumberOfHumans.askNumberOfHumans(vmock);
        PowerMockito.verifyStatic(ReadInteger.class);
        ReadInteger.readInt();
        Mockito.verify(vmock).setNumberOfHumans(1);
    }

}