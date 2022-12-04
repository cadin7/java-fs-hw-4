package ro.fasttrackit.hw4.sealed.model;

sealed interface Animal permits Dog, Cat, Bird, Insects {
    default String makeSound(String sound) {
        return "Make sound! " + sound;
    }
}
