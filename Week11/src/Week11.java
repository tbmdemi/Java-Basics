import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Week11 {
    /**
     * Sap xep danh sach theo ten va tuoi.
     * @param list Danh sach goc.
     * @return Danh sach sau khi sap xep.
     */
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> list) {
        Collections.sort(list);
        return list;
    }
}
