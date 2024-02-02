package TikTakTo_game.service.winningStrategy;

public class WinningStrategyFactory {
    public static WinningStrategy getWinningStrategy(WinningStrategies winningStrategy, int dimension){
        return new OrderOneWinningStrategy(dimension);
    }
}
