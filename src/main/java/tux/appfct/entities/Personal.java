package tux.appfct.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class Personal extends Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String cref;

    public Personal(Integer id, String cref) {
        this.id = id;
        this.cref = cref;
    }

    public Personal(String name, Instant birthday, Character gender, String address, String person, Integer id, String cref) {
        super(name, birthday, gender, address, person);
        this.id = id;
        this.cref = cref;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCref() {
        return cref;
    }

    public void setCref(String cref) {
        this.cref = cref;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Personal personal = (Personal) o;
        return Objects.equals(id, personal.id) && Objects.equals(cref, personal.cref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, cref);
    }

    @Override
    public String toString() {
        return "Personal{" +
                "id=" + id +
                ", cref='" + cref + '\'' +
                '}';
    }
}
