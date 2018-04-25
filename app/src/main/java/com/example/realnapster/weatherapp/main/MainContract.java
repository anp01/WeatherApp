package com.example.realnapster.weatherapp.main;

/**
 * Defines the contract between View  {@link MainActivity} and the Presenter {@link MainPresenter}
 */

public interface MainContract {

    interface View{
        void showEnterScreen();
    }

    interface Presenter{
        void handleEnterClick(String zip);

    }

}
