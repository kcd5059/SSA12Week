package com.tiy.ssa.weektwo.assignmentone;


public class Game {
    
    private final String title;
    private Genre genre;
    private Publisher publisher;
    
    public Game(String title, Publisher publisher, Genre genre) {
        this.title = title;
        this.genre = genre;
        this.publisher = publisher;
    }
    
    public enum Publisher {
        SQUARE_ENIX, CAPCOM, NINTENDO, ELECTRONIC_ARTS;
    }
    
    public enum Genre {
        RPG, ACTION, FIGHTING, RACING, SIMULATION, ADVENTURE;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public Genre getGenre() {
        return this.genre;
    }
    
    public Publisher getPublisher() {
        return this.publisher;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((genre == null) ? 0 : genre.hashCode());
        result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Game other = (Game) obj;
        if (genre != other.genre)
            return false;
        if (publisher != other.publisher)
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        return true;
    }
    
    

}
