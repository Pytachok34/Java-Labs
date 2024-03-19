import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
public class Tests {

    @Test
    public void insert() {
        var vector = new Container();
        vector.append(5);
        vector.append(2);

        vector.insert(100,1);

        assertEquals(3, vector.length());
        assertEquals(100, vector.at(1));
    }

    @Test
    public void at() {
        var vector = new Container();
        vector.append(5);

        assertEquals(5,vector.at(0));
    }

    @Test
    public void pop() {
        var vector = new Container();
        vector.append(5);
        vector.pop();

        assertEquals(0, vector.length());
    }
    @Test
    public void deleteAt() {
        var vector = new Container();
        vector.append(5);
        vector.append(2);

        vector.deleteAt(0);

        assertEquals(1, vector.length());
        assertEquals(2, vector.at(0));
    }
    @Test
    public void length() {
        var vector = new Container();
        vector.append(5);
        vector.append(5);
        vector.append(5);

        assertEquals(3, vector.length());
    }
}
