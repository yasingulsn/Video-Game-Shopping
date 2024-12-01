public class VideoGameTest {
    public static void main(String[] args) {
        ShoppingSite shoppingSite= new ShoppingSite("Game Center"); VideoGame game0= new VideoGame("The Last of Us 1",100,120,
                String.valueOf(VideoGame.gameTypeList.Simulation));

        VideoGame game1= new VideoGame("Red Dead Redemption 2",499,30, String.valueOf(VideoGame.gameTypeList.Adventure));

        shoppingSite.addVideoGame(game0); shoppingSite.addVideoGame(game1);

        System.out.println("Name of the game: "+game0.getGameName());


        System.out.println("Type of the game: "+game0.getGameType());

        System.out.println("Price of the game: "+"$"+game0.getGamePrice()); System.out.println("Total game stock of the shopping site:"
                +ShoppingSite.totalGameStock);
    }
}
