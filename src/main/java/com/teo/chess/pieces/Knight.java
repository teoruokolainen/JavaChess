package com.teo.chess.pieces;

import com.teo.chess.Location;
import com.teo.chess.Move;
import com.teo.chess.MoveType;
import com.teo.chess.gui.Board;
import com.teo.chess.gui.PieceColor;
import com.teo.chess.graphics.Sprite;

import java.util.ArrayList;


public class Knight extends Piece {

    public Knight(Location location, Sprite sprite, PieceColor color) {
        super(PieceType.KNIGHT, location, sprite, color, "N");
    }

    public Knight(Piece knight) {
        this(new Location(knight.getLocation()), knight.getSprite(), knight.getColor());
    }

    @Override
    public Move[] getMoveset(Location startLocation) {
        ArrayList<Move> moveset = new ArrayList<>();

        int x = startLocation.getBoardX();
        int y = startLocation.getBoardY();

        if (y > 2 && x > 0)
            moveset.add(new Move(MoveType.STATIC, startLocation, new Location(x - 1, y - 2), 0, 0)); //first left
        if (y > 2 && x < Board.TILES_ACROSS - 1)
            moveset.add(new Move(MoveType.STATIC, startLocation, new Location(x + 1, y - 2), 0, 0));//first right
        if (y > 0 && x > 1)
            moveset.add(new Move(MoveType.STATIC, startLocation, new Location(x - 2, y - 1), 0, 0));//second left
        if (y > 0 && x < Board.TILES_ACROSS - 2)
            moveset.add(new Move(MoveType.STATIC, startLocation, new Location(x + 2, y - 1), 0, 0));//second right
        if (y < Board.TILES_ACROSS - 1 && x > 1)
            moveset.add(new Move(MoveType.STATIC, startLocation, new Location(x - 2, y + 1), 0, 0));//third left
        if (y < Board.TILES_ACROSS - 1 && x < Board.TILES_ACROSS - 2)
            moveset.add(new Move(MoveType.STATIC, startLocation, new Location(x + 2, y + 1), 0, 0));//third right
        if (y < Board.TILES_ACROSS - 2 && x > 0)
            moveset.add(new Move(MoveType.STATIC, startLocation, new Location(x - 1, y + 2), 0, 0));//fourth left
        if (y < Board.TILES_ACROSS - 2 && x < Board.TILES_ACROSS - 1)
            moveset.add(new Move(MoveType.STATIC, startLocation, new Location(x + 1, y + 2), 0, 0));//fourth right

        return moveset.toArray(new Move[moveset.size()]);
    }

    public Move[] getCaptures(Location startLocation) {
        ArrayList<Move> moveset = new ArrayList<>();

        int x = startLocation.getBoardX();
        int y = startLocation.getBoardY();

        if (y > 2 && x > 0)
            moveset.add(new Move(MoveType.CAPTURE_STATIC, startLocation, new Location(x - 1, y - 2), 0, 0)); //first left
        if (y > 2 && x < Board.TILES_ACROSS - 1)
            moveset.add(new Move(MoveType.CAPTURE_STATIC, startLocation, new Location(x + 1, y - 2), 0, 0));//first right
        if (y > 0 && x > 1)
            moveset.add(new Move(MoveType.CAPTURE_STATIC, startLocation, new Location(x - 2, y - 1), 0, 0));//second left
        if (y > 0 && x < Board.TILES_ACROSS - 2)
            moveset.add(new Move(MoveType.CAPTURE_STATIC, startLocation, new Location(x + 2, y - 1), 0, 0));//second right
        if (y < Board.TILES_ACROSS - 1 && x > 1)
            moveset.add(new Move(MoveType.CAPTURE_STATIC, startLocation, new Location(x - 2, y + 1), 0, 0));//third left
        if (y < Board.TILES_ACROSS - 1 && x < Board.TILES_ACROSS - 2)
            moveset.add(new Move(MoveType.CAPTURE_STATIC, startLocation, new Location(x + 2, y + 1), 0, 0));//third right
        if (y < Board.TILES_ACROSS - 2 && x > 0)
            moveset.add(new Move(MoveType.CAPTURE_STATIC, startLocation, new Location(x - 1, y + 2), 0, 0));//fourth left
        if (y < Board.TILES_ACROSS - 2 && x < Board.TILES_ACROSS - 1)
            moveset.add(new Move(MoveType.CAPTURE_STATIC, startLocation, new Location(x + 1, y + 2), 0, 0));//fourth right

        return moveset.toArray(new Move[moveset.size()]);
    }
}