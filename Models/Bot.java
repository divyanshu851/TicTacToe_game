package TikTakTo_game.Models;

import TikTakTo_game.exceptions.GameOverException;
import TikTakTo_game.service.botPlayingStrategy.BotPlayingStrategy;
import TikTakTo_game.service.botPlayingStrategy.BotPlayingStrategyFactory;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;

    public Bot(int id, String name, char symbol, PlayerType playerType, BotDifficultyLevel botDifficultyLevel) {
        super(id, name, symbol, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public Move makeMove(Board board) throws GameOverException {
        BotPlayingStrategy botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy();
        return botPlayingStrategy.makeMove(board, this);
    }
}
