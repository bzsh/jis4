package by.jrr.task.car.service;

public interface CarServiceInterface {

    void accelerate(int targetSpeed);

    void decelerate(int targetSpeed);

    boolean isDriving();

    boolean isStopped();

    boolean canAccelerate();
}
