package challenges.second.classes;

import java.util.Objects;

public class Automaker {
    //notnull
    private String name;

    public Automaker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Automaker{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automaker automaker = (Automaker) o;
        return Objects.equals(name, automaker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
