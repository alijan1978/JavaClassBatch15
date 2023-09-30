package Class24;

public interface Movable {

    void move();
}

    interface ownAble{

        void own();
    }

    class Car implements Movable, ownAble{

        @Override
        public void move() {}

        @Override
        public void own() {}
    }

    class Dog implements Movable, ownAble{
        @Override
        public void move() {
            System.out.println("I can move");}

        @Override
        public void own() {
            System.out.println("You can own me");
        }
    }
