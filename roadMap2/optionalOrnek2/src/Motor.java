import java.io.Serializable;
import java.util.Objects;

public class Motor implements Serializable {

    private int hacim;

    public Motor() {
    }

    public Motor(int hacim) {
        this.hacim = hacim;
    }

    public int getHacim() {
        return hacim;
    }

    public void setHacim(int hacim) {
        this.hacim = hacim;
    }

    @Override
    public boolean equals(Object object) {
        Motor motor = (Motor) object;
        return hacim == motor.hacim;
    }

    @Override
    public int hashCode() {
        return hacim;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "hacim=" + hacim +
                '}';
    }
}
