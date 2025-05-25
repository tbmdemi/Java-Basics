import java.util.List;

public class ShapeUtil {
    /**
     * In ra tap hop hinh.
     * @param list danh sach.
     * @return danh sach.
     */
    public String printInfo(List<GeometricObject> list) {
        StringBuilder circleInfo = new StringBuilder("Circle:\n");
        StringBuilder triangleInfo = new StringBuilder("Triangle:\n");

        for (GeometricObject shape : list) {
            if (shape instanceof Circle) {
                circleInfo.append(shape.getInfo()).append("\n");
            } else if (shape instanceof Triangle) {
                triangleInfo.append(shape.getInfo()).append("\n");
            }
        }

        return circleInfo.toString() + triangleInfo.toString();
    }
}
