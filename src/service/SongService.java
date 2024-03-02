package service;

import domain.Song;
import enums.SongTypeEnum;

public interface SongService {
    Song[] SONGS = new Song[30];
    void add(Song song);
    void showAll();
    void addToFavourites(int index);
    void removeFromFavourites(int index);
    void showFavourites();
    void delete(int index);
    void showByType(SongTypeEnum type);
}
