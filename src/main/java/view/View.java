package view;

import model.Model;
import model.entity.StationPosition;

import java.util.Scanner;

public class View {

    private Scanner scanner;

    public View(){scanner=new Scanner(System.in);}

    public void log(String text) {
        System.out.println(text);
    }
    public int showMenuAndGetSelectedOption() {
        log("Wybierz opcję");
        log("[1] Wyświetl aktualną pozycję stacji ISS");
        log("[2] Policz prędkość poruszania się Stacji ISS");
        log("[3] Wyświetl listę nadchodzących przebiegów w danej lokalizacji");
        log("[4] Wyświetl listę osób przebywających na stacji ISS");
        log("[0] Wyjście z aplikacji");
        int select=scanner.nextInt();
        return select;
    }

    public void printActualLocation(StationPosition position){
        log("Aktualna pozycja ISS to:");
        log(position.getLatitude()+ " szerokości geograficznej, ");
        log("oraz "+ position.getLongitude()+" długości geograficznej. ");
    }
}
