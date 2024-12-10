package lesson20241022.anonomymousclass;

public class PlayGround {


    public static void main(String[] args) {
        PlayerInterface chessPlayer = new ChessPlayer();
        chessPlayer.play();

        PlayerInterface footballPlayer = new PlayerInterface() {
            @Override
            public void play() {
                System.out.println("I play football");
            }
        };

        footballPlayer.play();

        new PlayerInterface() {
            @Override
            public void play() {
                System.out.println("I play tennis");
            }
        }.play();

    }


}
