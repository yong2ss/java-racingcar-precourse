package racingcar.damain;

import racingcar.utils.ScannerUtil;

public class Race {
    private static final String RACE_RESULT_TEXT = "실행 결과";

    private Cars cars;
    private int tryoutCount;
    private WinnerStatus winnerStatus;

    public WinnerStatus getWinnerStatus() {
        return winnerStatus;
    }

    public Race() {
        this.cars = new Cars();
        this.winnerStatus = new WinnerStatus();
        initTryoutCount();
    }

    public Race(Cars cars, int tryoutCount, WinnerStatus winnerStatus) {
        this.cars = cars;
        this.tryoutCount = tryoutCount;
        this.winnerStatus = winnerStatus;
    }

    private void initTryoutCount() {
        int count = ScannerUtil.inputTryoutCount();
        this.tryoutCount = count;
    }

    public void start() {
        tryoutMove();
        winnerStatus.raceResult(cars);
    }

    public void tryoutMove() {
        System.out.println("\n" + RACE_RESULT_TEXT);
        for(int i = 0; i < tryoutCount; i++) {
            cars.tryOutMove();
            cars.showRace();
            System.out.println();
        }
    }
}
