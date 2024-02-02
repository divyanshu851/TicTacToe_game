package TikTakTo_game.service.botPlayingStrategy;

import TikTakTo_game.Models.*;
import TikTakTo_game.exceptions.GameOverException;

import java.util.List;

public class RandomBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board, Player player) throws GameOverException{
        List<List<Cell>> matrix = board.getBoard();
        for(int i=0; i<matrix.size(); i++){
            for(int j=0; j<matrix.size(); j++){
                if(matrix.get(i).get(j).getCellState().equals(CellState.EMPTY)){
                    board.getBoard().get(i).get(j).setPlayer(player);
                    board.getBoard().get(i).get(j).setCellState(CellState.FILLED);
                    return new Move(i, j, player);
                }
            }
        }
        throw new GameOverException("No new cells to play with, GAME OVER");
    }
}
