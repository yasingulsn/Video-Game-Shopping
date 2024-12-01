public class ShoppingSite {
    public int videoGameCount=1;
    public static int totalGameStock;
    private VideoGame[] videoGameList=new VideoGame[videoGameCount]; private final String storeName;

    public ShoppingSite(String storeName) { this.storeName = storeName; System.out.println("Name of the game store:"
            + this.storeName);
    }
    public String getStoreName() { return storeName;
    }

    public void addVideoGame(VideoGame videoGame){ int i = 0;
        videoGameList[i] = videoGame; videoGameCount++;
        totalGameStock += videoGame.getGameStock();

    }
}
