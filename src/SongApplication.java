import domain.Song;
import enums.SongTypeEnum;
import service.SongService;
import service.impL.SongServiceImpl;

import java.util.Scanner;

public class SongApplication {
    static Scanner scannerInt = new Scanner(System.in);
    static Scanner scannerStr = new Scanner(System.in);
    static SongService songService = new SongServiceImpl();
    public static void main(String[] args) {
        while (true){
            printShow();
            System.out.print("Choose menu = ");
            int userInput = scannerInt.nextInt();
            if (userInput == 0) {
                break;
            }
            switch (userInput){
                case 1 ->{
                    create();
                }
                case 2 ->{
                    songService.showAll();
                }
                case 3 ->{
                    songService.showAll();
                    int index = scannerInt.nextInt();
                    songService.addToFavourites(index);
                }
                case 4 ->{
                    songService.showAll();
                    int index = scannerInt.nextInt();
                    songService.removeFromFavourites(index);
                }
                case 5 ->{
                    songService.showFavourites();
                }
                case 6 ->{
                 songService.showAll();
                 int index = scannerInt.nextInt();
                 songService.delete(index);
                }
                case 7 ->{
                   showByType();
                }
            }

        }
    }
    public static void printShow(){
        System.out.println("""
                1 Add song
                2 Get all
                3 Add to favourites
                4 Delete from favourites
                5 Get favourites
                6 Delete song
                7 Get song by type
                0 Exit""");
    }
    public  static void create(){
        System.out.print("Enter song name = ");
        String name = scannerStr.nextLine();
        System.out.print("Enter author name = ");
        String author = scannerStr.nextLine();
        SongTypeEnum.showAllType();
        System.out.print("Choose one = ");
        int typeIndex = scannerInt.nextInt();
        SongTypeEnum type = SongTypeEnum.getTypeByIndex(typeIndex);
        songService.add(new Song(name,author,type));
    }
    public static void showByType(){
        SongTypeEnum.showAllType();
        int index = scannerInt.nextInt();
        SongTypeEnum type = SongTypeEnum.getTypeByIndex(index);
        songService.showByType(type);
    }
}