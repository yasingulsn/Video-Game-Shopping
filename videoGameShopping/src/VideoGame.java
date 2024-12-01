public class VideoGame { private String gameName; private int gamePrice; private int gameStock; private String gameType;

    public VideoGame(String gameName, int gamePrice, int gameStock,String gameType)
    {
        this.gameName = gameName; this.gamePrice = gamePrice; this.gameStock = gameStock; this.gameType=gameType;

    }

    public String getGameName() {

        return gameName;
    }
    public void setGameName(String gameName) { this.gameName = gameName;
    }
    public int getGamePrice() { return gamePrice;
    }
    public void setGamePrice(int gamePrice) { this.gamePrice = gamePrice;
    }

    public int getGameStock() { return gameStock;
    }
    public void setGameStock(int gameStock) { this.gameStock = gameStock;
    }
    public String getGameType() { return gameType;
    }
    public void setGameType(String gameType) { this.gameType = gameType;
    }
    public enum gameTypeList{

        Sport, Strategy, Simulation, Fighting, Adventure, Racing,
        Puzzle,

    }
}
