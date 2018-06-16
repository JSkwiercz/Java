import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {
    public static final String alphabet = "abcdefg";
    private int boardLength = 10;
    private int boardSize = 100;
    private int [] board = new int[boardSize];
    private int shipsNumber = 0;

    public String read(String statement) {
        String data = null;
        System.out.println(statement + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            data = is.readLine();
            if (data.length() == 0)
                return null;
        }
        catch (IOException e) {
            System.out.println("IOExlectation: " + e);
        }
        return data.toLowerCase();
    }

    public ArrayList deployShip(int shipSize) {
        ArrayList<String> occupiedPlace = new ArrayList<String>();
        String [] coordinatesLnc = new String[shipSize];
        String help = null;
        int [] coordinates = new int[shipSize];
        int prob = 0;
        boolean succes = false;
        int location = 0;

        shipsNumber++;
        int inkr = 1;
        if ((shipSize % 2) == 1)
            inkr = boardLength;
        while (!succes && prob++ < 200) {
            location = (int)(Math.random() * boardSize);
            int x = 0;
            succes = true;
            while (succes && x < shipSize) {
                if (board[location] == 0) {
                    coordinates[x++] = location;
                     location += inkr;
                    if (location >= boardSize)
                        succes = false;
                    if (x > 0 & (location % boardLength == 0))
                        succes = false;
                }
                else {
                    System.out.println("This place is taken " + location);
                    succes = false;
                }
            }
        }

        int x = 0;
        int line = 0;
        int column = 0;

        while (x < shipSize) {
            board[coordinates[x]] = 1;
            line = (int) (coordinates[x] / boardLength);
            column = coordinates[x] % boardLength;
            help = String.valueOf(alphabet.charAt(column));
            occupiedPlace.add(help.concat(Integer.toString(line)));
            x++;
        }
        return occupiedPlace;
    }
}
