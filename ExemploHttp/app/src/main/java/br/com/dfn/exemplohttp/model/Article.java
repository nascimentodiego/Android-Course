package br.com.dfn.exemplohttp.model;

public class Article {

    private String author;
    private String description;
    private String title;
    private String urlToImage;

    public Article(String author,
                   String description,
                   String title,
                   String urlToImage) {
        this.author = author;
        this.description = description;
        this.title = title;
        this.urlToImage = urlToImage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }
}
