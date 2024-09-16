package movie;

import java.util.List;
public class movie {
    private List<movieItem>objects;
    public void addmovieItem(movieItem Item) {
        objects.add(Item);
    }
    public void printmovieDetails() {
        for (movieItem item : objects) {
            item.printDetails();
        }
    }

}
