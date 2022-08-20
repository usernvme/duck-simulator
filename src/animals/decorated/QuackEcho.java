package animals.decorated;

import animals.Quackable;

public class QuackEcho implements Quackable {
    private Quackable duck;

    public QuackEcho(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        System.out.println("Echo:");
        duck.quack();
    }
}