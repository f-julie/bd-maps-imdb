package com.amazon.ata.maps;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Represents an actor in IMDB. Each actor's name must be unique.
 */
public class Actor {
    private final String name;
    private final LocalDate birthdate;
    private final String birthCity;

    /**
     * Constructs a new actor with the specifid parameters.
     *
     * @param name Actor's name (must be unique)
     * @param birthdate Actor's birthdate. Can be null
     * @param birthCity Actor's birth city. Can be null
     */
    public Actor(String name, LocalDate birthdate, String birthCity) {
        this.name = name;
        this.birthdate = birthdate;
        this.birthCity = birthCity;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Birthday: " + birthdate + "\n" + "Birth city: " + birthCity + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor actor = (Actor) obj;
        return Objects.equals(name, actor.name) &&
                Objects.equals(birthdate, actor.birthdate) &&
                Objects.equals(birthCity, actor.birthCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthdate, birthCity);
    }
}
