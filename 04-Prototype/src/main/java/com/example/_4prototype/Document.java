package com.example._4prototype;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Document {
    public String title;
    private String content;
    public String author;

    public Document(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public Document clone() {
        return new Document(title, content, author);
    }

    public void displayInfo() {
        log.info("Tile: {}, Content: {}, Author: {}", title, content, author);
    }
}
