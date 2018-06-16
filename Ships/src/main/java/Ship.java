import java.util.ArrayList;

class Ship {
    private ArrayList<String> field;
    private String name;

    public void setPlace(ArrayList<String> place) {
        field = place;
    }

    public void setName(String shipName) {
        name = shipName;
    }

    public String check(String Turn) {
        String score = "MISS";
        int indeks = field.indexOf(Turn);
        if (indeks >= 0) {
            field.remove(indeks);

            if (field.isEmpty()) {
                score = "SANK";
                System.out.println("You sank " + name);
            }
            else {
                score = "HIT";
            }
        }
        return score;
    }
}
