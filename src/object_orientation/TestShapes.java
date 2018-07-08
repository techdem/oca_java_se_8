package object_orientation;

public class TestShapes {

    public static void main(String[] args) {

        PlayerPiece player = new PlayerPiece();
        TilePiece tile = new TilePiece();
        doShapes(player);
        doShapes(tile);
    }

    public static void doShapes(GameShape shape) {

        shape.displayShape();
    }
}

class GameShape {

    public void displayShape() {

        System.out.println("displaying shape");
    }

    // more code
}

class PlayerPiece extends GameShape {

    public void movePiece() {

        System.out.println("moving game piece");
    }

    // more code
}

class TilePiece extends GameShape {

    public void getAdjacent() {

        System.out.println("gettings adjacent tiles");
    }
    // more code
}