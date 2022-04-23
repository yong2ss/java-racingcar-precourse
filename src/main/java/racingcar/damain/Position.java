package racingcar.damain;

import racingcar.utils.PositionRandomUtil;

public class Position {
    private int position = 0;

    public int getPosition() {
        return position;
    }

    private void moveForward() {
        position++;
    }

    public void tryoutMove () {
        if(PositionRandomUtil.tryoutMove()) {
            moveForward();
        }
    }
}
