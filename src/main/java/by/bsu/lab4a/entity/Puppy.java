package by.bsu.lab4a.entity;

import by.bsu.lab4a.evidence.DogBreed;

public class Puppy extends Dog{
    public Puppy() {
    }

    public Puppy(String name, int age, DogBreed breed) {
        super(name, age, breed);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Puppy{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }
}
