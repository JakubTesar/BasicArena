package cz.educanet.arena.presentation;

import cz.educanet.arena.data.GladiatorDatabase;
import cz.educanet.arena.logic.Arena;
import cz.educanet.arena.logic.Gladiator;

import java.util.Scanner;

public class ArenaCLI {

    private Arena logic;
    private Scanner sc;
    int round;

    /**
     * Initialize all variables that are needed.
     */
    public void init() {
        logic = new Arena();
        sc = new Scanner(System.in);
    }

    public void renderLandingPage() {
        System.out.println("     /\\                         \n" +
                "    /  \\   _ __ ___ _ __   __ _ \n" +
                "   / /\\ \\ | '__/ _ \\ '_ \\ / _` |\n" +
                "  / ____ \\| | |  __/ | | | (_| |\n" +
                " /_/    \\_\\_|  \\___|_| |_|\\__,_|");
        System.out.println("---------------------------------");
    }


    public void renderGladiatorPicker() {
        System.out.println("Pick your fighter #1 (enter the path of the saved file):");
        String gladiator1File = sc.nextLine();
        System.out.println("Pick your fighter #2 (enter the path of the saved file):");
        String gladiator2File = sc.nextLine();

        Gladiator gladiator1 = GladiatorDatabase.loadGladiator(gladiator1File);
        Gladiator gladiator2 = GladiatorDatabase.loadGladiator(gladiator2File);
        logic.setGladiator1(gladiator1);
        logic.setGladiator2(gladiator2);
    }

    public void renderEntireFight() {
        // TODO:
        while (logic.getWinner() == null) {
            Gladiator gladiator1 = logic.getGladiator1();

            Gladiator gladiator2 = logic.getGladiator2();

            int round = logic.getRound();

            System.out.println();
            System.out.println();
            System.out.println("<--------------" + round + ". ROUND -------------->");
            System.out.println();

            System.out.println("<--------------Fighters HP-------------->");
            System.out.println(gladiator1.getName() + " have " + gladiator1.getCurrentHP() + "/" + gladiator1.getMaxHP());
            System.out.println(gladiator2.getName() + " have " + gladiator2.getCurrentHP() + "/" + gladiator2.getMaxHP());
            System.out.println();
            logic.fight();

        }
        Gladiator winner = logic.getWinner();
        System.out.println("! WINNER !");
        System.out.println();
        System.out.println("<--------------" + winner.getName() + "-------------->");

    }
}

       /* System.out.println("Nyní zadej data pro prvního gladiátora");
        System.out.println();
        System.out.println("Zadej jméno gladiátora 1:");
        gladiator1.setName(sc.nextLine());

        System.out.println("Zadej počet životů gladiátora 1:");
        gladiator1.setMaxHP(Integer.parseInt(sc.nextLine()));

        System.out.println("Zadej minimální poškození gladiátora 1:");
        gladiator1.setMinDMG(Integer.parseInt(sc.nextLine()));

        System.out.println("Zadej maximální poškození gladiátora 1:");
        gladiator1.setMaxDMG(Integer.parseInt(sc.nextLine()));

        System.out.println("Nyní zadej data pro druhého gladiátora");
        System.out.println();
        System.out.println("Zadej jméno gladiátora 2:");
        gladiator2.setName(sc.nextLine());

        System.out.println("Zadej počet životů gladiátora 1:");
        gladiator2.setMaxHP(Integer.parseInt(sc.nextLine()));

        System.out.println("Zadej minimální poškození gladiátora 1:");
        gladiator2.setMinDMG(Integer.parseInt(sc.nextLine()));

        System.out.println("Zadej maximální poškození gladiátora 1:");
        gladiator2.setMaxDMG(Integer.parseInt(sc.nextLine()));*/
