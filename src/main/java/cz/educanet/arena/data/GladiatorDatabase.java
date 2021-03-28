package cz.educanet.arena.data;

import cz.educanet.arena.logic.Gladiator;

import java.io.*;

/**
 * Utils class that saves and loads gladiators.
 */
public class GladiatorDatabase {

    /**
     * @param filename path to the gladiator file.
     * @return loaded Gladiator
     */
    public static Gladiator loadGladiator(String filename) {
        Gladiator gladiator = new Gladiator();
        try{
            BufferedReader br = new BufferedReader(new FileReader(filename));

            gladiator.setName(br.readLine());
            gladiator.setMaxHP(Integer.parseInt(br.readLine()));
            gladiator.setMaxDMG(Integer.parseInt(br.readLine()));
            gladiator.setMinDMG(Integer.parseInt(br.readLine()));

            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gladiator;
    }

    public static void saveGladiator(String filename, Gladiator gladiator) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            bw.write("" + gladiator.getName());
            bw.newLine();
            bw.write(""+ gladiator.getMaxDMG());
            bw.newLine();
            bw.write(""+ gladiator.getMinDMG());
            bw.newLine();
            bw.write(""+ gladiator.getMaxDMG());
            bw.newLine();

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
