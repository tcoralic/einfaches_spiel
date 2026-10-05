package controller;

import model.GewinnModel;

public class GewinnController {
    // der controller braucht zugriff auf das model
    private GewinnModel model;

    public GewinnController(){
        // ein neues model wird erstellt
        model = new GewinnModel();
    }

    public GewinnModel getModel(){
        return model;
    }
}
