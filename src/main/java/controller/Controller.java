package controller;

import model.Model;
import model.entity.StationPosition;
import view.View;

public class Controller {
    private View view;
    private Model model;

    public Controller() {
        this.view = new View();
        this.model = new Model();
    }

    public void start(){
        int selectedOption;
        do {
            selectedOption =view.showMenuAndGetSelectedOption();
            switch (selectedOption){
                case 1:
                    handlePrintActualPosition();
                    break;
                case 2:
                    handleCalclateActualSpeed();
                    break;
                case 3:
                    handleListsOfIncomingCursesOverCurrentLocalization();
                    break;
                case 4:
                    handleListOfCurrentISSInhabitants();
                    break;
                }

        } while (selectedOption != 0);
    }
    private void handlePrintActualPosition(){
        StationPosition actualPosition = model.getPosition();
        view.printActualLocation(actualPosition);
    }
    private void handleCalclateActualSpeed(){
        // TODO: 06.11.2020
    }
    private void handleListsOfIncomingCursesOverCurrentLocalization(){
        // TODO: 06.11.2020
    }
    private void handleListOfCurrentISSInhabitants(){
        // TODO: 06.11.2020  }
    }
}
