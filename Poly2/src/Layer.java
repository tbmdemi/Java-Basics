import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes;

    /**
     * Constructor mặc định.
     */
    public Layer() {
        this.shapes = new ArrayList<>();
    }

    /**
     * Thêm shape vào danh sách.
     * @param shape The shape.
     */
    public void addShape(Shape shape) {
        if (shape != null) {
            shapes.add(shape);
        }
    }

    /**
     * Xóa hình tròn.
     */
    public void removeCircles() {
        shapes.removeIf(shape -> shape instanceof Circle);
    }

    /**
     * Trả về thông tin.
     * @return Chuỗi thông tin.
     */
    public String getInfo() {
        StringBuilder info = new StringBuilder("Layer of crazy shapes:\n");
        for (Shape shape : shapes) {
            info.append(shape.toString()).append("\n");
        }
        return info.toString();
    }

    /**
     * Xóa tất cả hình bị lặp trong list.
     */
    public void removeDuplicates() {
        List<Shape> uniqueShapes = new ArrayList<>();
        for (Shape current : shapes) {
            boolean isDuplicate = false;
            for (Shape unique : uniqueShapes) {
                if (current.equals(unique) && current.getClass() == unique.getClass()) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueShapes.add(current);
            }
        }
        shapes.clear();
        shapes.addAll(uniqueShapes);
    }
}