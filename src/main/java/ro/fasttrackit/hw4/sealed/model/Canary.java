package ro.fasttrackit.hw4.sealed.model;

public record Canary() implements Bird {
    public boolean canFly() {
        return true;
    }
}
