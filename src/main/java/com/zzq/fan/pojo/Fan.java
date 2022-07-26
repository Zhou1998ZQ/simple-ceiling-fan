package com.zzq.fan.pojo;

import lombok.Data;

@Data
public class Fan {

    private Integer speed = 0;
    private Direction direction = Direction.RIGHT;

    public void reverseDirection() {
        direction = direction == Direction.RIGHT ? Direction.LEFT : Direction.RIGHT;
    }

    public void speedGoUp() {
        if (speed == 3) {
            speed = 0;
        } else {
            speed++;
        }
    }

}

enum Direction {
    RIGHT,
    LEFT
}
