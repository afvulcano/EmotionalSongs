/*
Francesco Vulcano 749074
Giacomo Paviano 750742
Alessandro Messuti 750734
Riccardo Shpati 748993
Sede: Varese
 */
package com.esongs.emotionalsongs.basicclasses;
import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;
public class FileManager {
    String PercorsoFileUtenti, PercorsoFileEmozioni, PercorsoFilePlaylist;

    public static LinkedList<Canzone> ReadSongs(String path) throws FileNotFoundException {
        LinkedList<Canzone> canzoni = new LinkedList<>();
        Scanner sc = new Scanner(new File(path));
        sc.useDelimiter(",|\\n");
        while (sc.hasNext()) {
            String anno = sc.next();
            String idCanzone = sc.next();
            String autore = sc.next();
            String titolo = sc.next();
            Canzone c = new Canzone(idCanzone, titolo, autore, anno);
            canzoni.add(c);
        }
        return canzoni;
    }
}
