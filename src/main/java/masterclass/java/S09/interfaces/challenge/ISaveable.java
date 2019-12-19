package masterclass.java.S09.interfaces.challenge;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {

    List<String> write();
    void read(List<String> savedValues);
}
