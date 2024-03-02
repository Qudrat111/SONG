package domain;

import enums.SongTypeEnum;
import util.DateUtil;

import java.time.LocalDateTime;
import java.util.UUID;

public class Song {
    private UUID uuid = UUID.randomUUID();
    public String name;
    private String author;
    private SongTypeEnum type;
    private boolean isFavourite;
    LocalDateTime createdAt = LocalDateTime.now();

    public Song(String name, String author, SongTypeEnum type) {
        this.name = name;
        this.author = author;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Song{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", type=" + type +
                ", isFavourite=" + isFavourite +
                ", createdAt=" + DateUtil.formatter(createdAt) +
                '}';
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public SongTypeEnum getType() {
        return type;
    }

    public void setType(SongTypeEnum type) {
        this.type = type;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
