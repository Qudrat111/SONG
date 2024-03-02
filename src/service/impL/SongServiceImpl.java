package service.impL;

import domain.Song;
import enums.SongTypeEnum;
import service.SongService;

public class SongServiceImpl implements SongService {
    @Override
    public void add(Song song) {
        for (int i = 0; i < SONGS.length; i++) {
            if (SONGS[i] == null) {
                SONGS[i] = song;
                break;
            }
        }
    }

    @Override
    public void showAll() {
        for (int i = 0; i < SONGS.length; i++) {
            if (SONGS[i] == null) {
                break;
            } else {
                System.out.println(i + 1 + " " + SONGS[i]);
            }
        }
    }

    @Override
    public void addToFavourites(int index) {
        if (index < 1 || index > SONGS.length) {
            System.out.println("You wrote invalid index");
        } else {
            SONGS[index - 1].setFavourite(true);
        }
    }

    @Override
    public void removeFromFavourites(int index) {
        if (index < 1 || index > SONGS.length) {
            System.out.println("You wrote invalid index");
        } else {
            SONGS[index - 1].setFavourite(false);
        }
    }

    @Override
    public void showFavourites() {
        for (int i = 0; i < SONGS.length; i++) {
            if (SONGS[i] == null) {
                break;
            } else if (SONGS[i].isFavourite()) {
                System.out.println(i + 1 + " " + SONGS[i]);
            }
        }
    }

    @Override
    public void delete(int index) {
        for (int i = index - 1; i < SONGS.length - 1; i++) {
            if (SONGS[i] == null) {
                break;
            }
            SONGS[i] = SONGS[i + 1];
        }
    }

    @Override
    public void showByType(SongTypeEnum type) {
        for (int i = 0; i < SONGS.length; i++) {
            if (SONGS[i] == null) {
                break;
            } else if (SONGS[i].getType().equals(type)) {
                System.out.println(i + 1 + " " + SONGS[i]);
            }
        }
    }
}
