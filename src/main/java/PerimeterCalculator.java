import org.talento.tech.*;

import java.util.List;
import java.util.Scanner;

/**
 * Este codigo permite calcular el perimetro de figuras de N >= 3 lados
 * Figuras de ejemplo:
 * - square.txt - lado de 4
 * - triangle.txt - base de 4, altura de 4
 */

public class PerimeterCalculator {

    public PerimeterCalculator () {}

    public double calculatePerimeter(Shape s) {
        int perimeter = 0;

        // Definir la variable que acumule el perimetro
        List<Point> points = s.getPoints();
        Point prevPoint = points.getLast();

        for (Point point : points) {
            // Obtener la distancia de los lados
            // Ayuda: prevPoint.distancia(point)
            double distance = prevPoint.distancia(point);
            perimeter += distance;

            prevPoint = point;
        }

        // Retornar la variable del perimetro
        return perimeter;
    }

    public int getTotalPoints(Shape s) {
        // Definir la variable para el total de puntos
        int totalPoints = 0;

        for(Point point: s.getPoints()) {
            // Acumular el total de puntos
            totalPoints++;

        }

        // Retornas el valor de puntos
        return totalPoints;
    }

    public static void main (String[] args) {
        PerimeterCalculator perimeterCalculator = new PerimeterCalculator();
        // Defini el nombre del archivo
        String filename = "square.txt";
        Shape shape = new Shape();

        shape.readPoints(filename);
        // Mostrar el valor de calculatePerimeter y getTotalPoints
    }
}
