package ro.fasttrackit.hw4.sealed.model;

public record Ladybug() implements Insects {
    public boolean isCute() {
        return true;
    }
}
