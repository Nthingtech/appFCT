package tux.appfct.entities;

import java.io.Serializable;
import java.util.Objects;

public class Personal implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;

    public Personal() {
    }

    public Personal(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personal personal = (Personal) o;
        return Objects.equals(id, personal.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Personal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
