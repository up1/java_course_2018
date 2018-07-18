package ox;

public class OXGame {
    String[][] tables = new String[3][3];

    public OXGame() {
        initialTables();
    }

    private void initialTables() {
        for (int i = 0; i < tables.length; i++) {
            for (int j = 0; j < tables.length; j++) {
                tables[i][j] = "";
            }
        }
    }

    public String[][] getTables() {
        return tables;
    }

    public void playWith(Player player, int i, int j) {
        tables[i][j] = player.getSymbol();
    }

    public Player getPlayer1() {
        return new Player();
    }

    public Player getPlayer2() {
        return new Player();
    }

    public String valueAt(int i, int j) {
        return tables[i][j];
    }

    public boolean isWinner() {
        boolean result = true;
        // Row 0
        for (int column = 0; column < 3; column++) {
            if ("".equals(valueAt(0, column))) {
                result = false;
                break;
            }
        }
        // Row 1

        // Row 2

        return result;
    }

}
