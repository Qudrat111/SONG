package enums;

import domain.Song;

public enum SongTypeEnum {
    ROCK(1),
    POP(2),
    CLASSIC(3);

    private int index;

    SongTypeEnum(int index) {
        this.index = index;
    }
    public static void showAllType(){
        SongTypeEnum[] values = SongTypeEnum.values();
        for (SongTypeEnum song : values ) {
            System.out.println(song.index + " " + song.name());
        }
    }
    public static SongTypeEnum getTypeByIndex(int index){
        SongTypeEnum[] values = SongTypeEnum.values();
        for (SongTypeEnum song : values ) {
           if(song.index == index){
               return song;
           }
        }
        return null;
    }
}
