package com.springsun.nimgamej.controller;

import com.springsun.nimgamej.model.ListOfHeaps;
import com.springsun.nimgamej.model.ListOfPlayers;
import com.springsun.nimgamej.view.IView;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.logging.Logger;

import static com.springsun.nimgamej.model.Players.*;
import static org.mockito.Mockito.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ComputerMove.class, MadComputerMove.class})
public class MoveTest {
    ListOfHeaps h;
    ListOfPlayers p;
    IView vmock;
    Logger logmock;

    @Before
    public void setUp() throws Exception {
        h = new ListOfHeaps(3, 10);
        p = new ListOfPlayers(1, 2, 1);
        vmock = mock(IView.class);
        logmock = mock(Logger.class);

        PowerMockito.mockStatic(ComputerMove.class, MadComputerMove.class);
    }

    @After
    public void tearDown() throws Exception {
        h = null;
        p = null;
        vmock = null;
    }

    @Test
    public void makeMoveTest1() throws Exception {

        Move.makeMove(vmock, h, HUMAN, p,0);

        verify(vmock).showMessage("" + HUMAN + "-" + 1);
        verify(vmock).moveHuman(h);
        Mockito.verifyZeroInteractions(vmock);
        PowerMockito.verifyStatic(ComputerMove.class, Mockito.never());
        ComputerMove.moveComputer(h);
        PowerMockito.verifyStatic(MadComputerMove.class, Mockito.never());
        MadComputerMove.moveMadComputer(h);
        verify(logmock, never()).severe("No matches in method makeMove");

    }

    @Test
    public void makeMoveTest2() throws Exception {

        Move.makeMove(vmock, h, COMPUTER, p,2);

        verify(vmock).showMessage("" + COMPUTER + "-" + 2);
        verify(vmock, Mockito.never()).moveHuman(h);
        Mockito.verifyZeroInteractions(vmock);
        PowerMockito.verifyStatic(ComputerMove.class, Mockito.times(1));
        ComputerMove.moveComputer(h);
        PowerMockito.verifyStatic(MadComputerMove.class, Mockito.never());
        MadComputerMove.moveMadComputer(h);
        verify(logmock, never()).severe("No matches in method makeMove");

    }

    @Test
    public void makeMoveTest3() throws Exception {

        Move.makeMove(vmock, h, MAD_COMPUTER, p,3);

        verify(vmock).showMessage("" + MAD_COMPUTER + "-" + 1);
        verify(vmock, Mockito.never()).moveHuman(h);
        Mockito.verifyZeroInteractions(vmock);
        PowerMockito.verifyStatic(ComputerMove.class, Mockito.never());
        ComputerMove.moveComputer(h);
        PowerMockito.verifyStatic(MadComputerMove.class, Mockito.times(1));
        MadComputerMove.moveMadComputer(h);
        verify(logmock, never()).severe("No matches in method makeMove");

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void makeMoveTest4() throws IndexOutOfBoundsException {

        Move.makeMove(vmock, h, COMPUTER, p,4);

    }

}