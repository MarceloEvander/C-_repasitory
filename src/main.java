
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author net
 *
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static int cek3HurufVocal(String data) {
        ArrayList<String> listChar = new ArrayList<String>();
        listChar.add("A");
        listChar.add("E");
        listChar.add("I");
        listChar.add("O");
        listChar.add("U");
        listChar.add("a");
        listChar.add("e");
        listChar.add("i");
        listChar.add("o");
        listChar.add("u");

        char[] dataToChar = data.toCharArray();

        int hasil = 0;

        for (int j = 0; j < dataToChar.length; j++) {
            for (int i = 0; i < j; i++) {
                if (listChar.contains(dataToChar[i] + "")) {
                    //System.out.print("ada");
                    hasil = hasil + 1;
                } else {
                    //System.out.print("tidak ada");
                }
                //System.out.println("");
            }

        }
        //System.out.println(""+hasil);
        return hasil;
    }

    public static String readFile(String pathName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(pathName)));
            String line = reader.readLine();
            StringBuilder strBuilder = new StringBuilder();
            while (line != null) {
                strBuilder.append(line);
                strBuilder.append("\n");
                line = reader.readLine();
            }
            reader.close();
            String data = strBuilder.toString();
            return data;
        } catch (IOException ex) {

        }
        return null;
    }

    public static void main(String[] args) {

        String[] data = readFile("data.txt").split("\n");
//        System.out.println("" + data[1].substring(0, 2));
//        System.out.println("" + data[1].substring(1, 3));
//        System.out.println("" + data[1].substring(2, 4));
//        System.out.println("" + data[1].substring(3, 5));
//        System.out.println("" + data[1].substring(4, 6));
//        System.out.println("" + data[1].substring(5, 7));

        List<String> listDataVocal = new ArrayList<>();
        List<String> listDataKonsonan = new ArrayList<>();
        int a = 3;
        int b = 2;
        //int index = 0;
        for (int i = 0; i < data.length; i++) {
            a = 3;
            //index = 0;
            for (int j = 0; j < data[i].length() - 2; j++) {
                listDataVocal.add(data[i].substring(j, a));
                //System.out.println(""+data[i].substring(j,a));
                a++;
                //index++;
            }

            boolean isSulitVocal = false;
            for (String string : listDataVocal) {
                if (cek3HurufVocal(string) == 3) {
                    isSulitVocal = true;

                } else {
                    isSulitVocal = false;
                }
            }

            b = 2;
            for (int j = 0; j < data[i].length() - 2; j++) {
                listDataKonsonan.add(data[i].substring(j, b));
                //System.out.println(""+data.substring(i,a));
                b++;
                //index++;
            }

            boolean isSulitkonsonan = false;
            for (String string : listDataVocal) {
                if (cek3HurufKonsonan(string) == 2) {
                    isSulitkonsonan = true;

                } else {
                    isSulitkonsonan = false;
                }
            }
            if (isSulitVocal==true) {
                System.out.println("HARD WORD");
            } else {
                System.out.println("EASY WORD");
            }
        }
        //System.out.println(""+data.substring(5,4));
        //System.out.println(""+data.substring(6,4));
        //input();

    }

    private static int cek3HurufKonsonan(String string) {
        ArrayList<String> listChar = new ArrayList<String>();
        listChar.add("B");
        listChar.add("C");
        listChar.add("D");
        listChar.add("F");
        listChar.add("G");
        listChar.add("H");
        listChar.add("J");
        listChar.add("K");
        listChar.add("L");
        listChar.add("M");
        listChar.add("N");
        listChar.add("P");
        listChar.add("Q");
        listChar.add("R");
        listChar.add("S");
        listChar.add("T");
        listChar.add("V");
        listChar.add("W");
        listChar.add("X");
        listChar.add("Y");
        listChar.add("Z");
        listChar.add("b");
        listChar.add("c");
        listChar.add("d");
        listChar.add("f");
        listChar.add("g");
        listChar.add("h");
        listChar.add("j");
        listChar.add("k");
        listChar.add("l");
        listChar.add("m");
        listChar.add("n");
        listChar.add("p");
        listChar.add("q");
        listChar.add("r");
        listChar.add("s");
        listChar.add("t");
        listChar.add("v");
        listChar.add("w");
        listChar.add("x");
        listChar.add("y");
        listChar.add("z");

        char[] dataToChar = string.toCharArray();

        int hasil = 0;

        for (int j = 0; j < dataToChar.length; j++) {
            hasil = 0;
            for (int i = 0; i < j; i++) {
                if (listChar.contains(dataToChar[i] + "")) {
                    //System.out.print("ada");
                    hasil = hasil + 1;
                } else {
                    //System.out.print("tidak ada");
                }
                //System.out.println("");
            }

        }
        //System.out.println(""+hasil);

        return hasil;
    }

}
