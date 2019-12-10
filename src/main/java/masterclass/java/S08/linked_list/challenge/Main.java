package masterclass.java.S08.linked_list.challenge;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("akdsjfhfds", "Daniel Band");
        album.addSong("One", 9.77);
        album.addSong("Two", 1.77);
        album.addSong("Three", 2.77);
        album.addSong("Four", 3.77);
        album.addSong("Five", 4.77);
        album.addSong("Six", 5.77);
        album.addSong("Seven", 6.77);
        album.addSong("Eight", 7.77);

        albums.add(album);

        album = new Album("HASHG", "Daniel Band");
        album.addSong("Uno", 6.77);
        album.addSong("Dos", 6.77);
        album.addSong("Tres", 7.77);
        album.addSong("Cuatro", 98.77);
        album.addSong("Cinco", 7.77);
        album.addSong("Seis", 1.77);
        album.addSong("Siete", 5.77);
        album.addSong("Ocho", 73.77);
        album.addSong("nueve", 6.77);

        albums.add(album);
        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("One", playList);
        albums.get(0).addToPlayList("Two", playList);
        albums.get(0).addToPlayList("Three", playList);
        albums.get(0).addToPlayList("Four", playList);
        albums.get(0).addToPlayList("ELEVEN", playList);
        albums.get(1).addToPlayList(0, playList);
        albums.get(1).addToPlayList(1, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(4, playList);

        play(playList);

    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No song in playlsit");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the beginning of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions: \n PRESS");
        System.out.println("0 - quit\n" +
                        "1 - play next song\n" +
                        "2 - play previous song\n" +
                        "3 - replay current song\n" +
                        "4 - list songs in the playlist\n" +
                        "5 - print available actions" +
                        "6 - delete current song");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("======================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("======================");


    }
}
