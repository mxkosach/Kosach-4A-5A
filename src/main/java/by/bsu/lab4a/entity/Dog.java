package by.bsu.lab4a.entity;

import by.bsu.lab4a.evidence.DogBreed;

public class Dog extends Animal {
    private DogBreed breed;

    public Dog() {
    }

    public Dog(String name, int age, DogBreed breed) {
        super(name, age);
        this.breed = breed;
    }

    public DogBreed getBreed() {
        return breed;
    }

    public void setBreed(DogBreed breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Dog dog = (Dog) o;

        return breed == dog.breed;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + breed.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dog{");
        sb.append(super.toString()).append("breed=").append(breed);
        sb.append('}');
        return sb.toString();
    }
}
