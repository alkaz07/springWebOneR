package rectangle;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountRectanglesJulia {
    public static Map<Rectangle, Integer> countRectangles(String fileName)  {
        HashMap<Rectangle, Integer> mapRect = new HashMap<>();
        try {
            List<Rectangle> rectangleList = Loader.loadRecList(fileName);

            for (Rectangle r: rectangleList){
                int counter = mapRect.getOrDefault(r, 0);
                mapRect.put(r, counter+1);


            }

        } catch (FileNotFoundException | GeometryException e) {
            throw new RuntimeException(e);
        }


        return mapRect;
    }
}
