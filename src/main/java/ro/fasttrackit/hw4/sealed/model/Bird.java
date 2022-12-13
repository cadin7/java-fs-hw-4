package ro.fasttrackit.hw4.sealed.model;

sealed interface Bird extends Animal permits Canary, Parrot, Chicken {
    boolean canFly();

    default String canIFly() {
        return "I can fly! - it's " + canFly();
    }
}
