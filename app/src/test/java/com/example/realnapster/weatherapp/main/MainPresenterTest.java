package com.example.realnapster.weatherapp.main;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class MainPresenterTest {

    @Mock
    private MainContract.View mView;
    private MainPresenter mainPresenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        mainPresenter = new MainPresenter(mView);
    }

    @Test
    public void handleEnterClick() throws  Exception {
        mainPresenter.handleEnterClick();
        verify(mView).showEnterScreen();
    }
}