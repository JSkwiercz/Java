import java.util.ArrayList;

public class ShipsGame {

    private GameHelper helper = new GameHelper();
    private ArrayList<Ship> shipList = new ArrayList<Ship>();
    private int moves = 0;

    private void prepareGame() {
        Ship one = new Ship();
        one.setName("Mały");
        Ship two = new Ship();
        two.setName("Sredni");
        Ship three = new Ship();
        three.setName("Duzy");
        shipList.add(one);
        shipList.add(two);
        shipList.add(three);

        for (Ship deployedShip : shipList) {
            ArrayList<String> newPlace = helper.deployShip(3);
            deployedShip.setPlace(newPlace);
        }
    }

    private void StartGame() {
        while(!shipList.isEmpty()) {
            String PlayerTurn = helper.read("Enter coordinates: ");
            checkTurn(PlayerTurn);
        }
        endgame();
    }

    private void checkTurn(String Turn) {
        moves++;
        String score = "MISS!";

        for (Ship checkShip : shipList) {
            score = checkShip.check(Turn);
            if (score.equals("HIT!"))
                break;
            if (score.equals("SANK!")) {
                shipList.remove(checkShip);
                break;
            }
        }
        System.out.println(score);
    }

    private void endgame() {
        System.out.println("All ships have been sunk");
    }

    public static void main(String[] args) {
        ShipsGame game = new ShipsGame();
        game.prepareGame();
        game.StartGame();
    }

}
