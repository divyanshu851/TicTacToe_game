package TikTakTo_game.service.botPlayingStrategy;

import TikTakTo_game.Models.Board;
import TikTakTo_game.Models.Move;
import TikTakTo_game.Models.Player;
import TikTakTo_game.exceptions.GameOverException;

public interface BotPlayingStrategy {
    Move makeMove(Board board, Player player) throws GameOverException;
}
