package TikTakTo_game.service.winningStrategy;

import TikTakTo_game.Models.Board;
import TikTakTo_game.Models.Move;
import TikTakTo_game.Models.Player;

public interface WinningStrategy {
    Player checkWinner(Board board, Move lastMove);
}
