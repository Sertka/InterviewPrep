public class Refactoring {

    /*

    interface Moveable {
        void move();
    }

    interface Stopable {
        void stop();
    }

    abstract class Car {
        public Engine engine; //отсутсвует класс Engine
        private String color;
        private String name;


        protected void start() {
            System.out.println("Car starting");
        }

        abstract void open();

        public Engine getEngine() {
            return engine;
        }

        public void setEngine(Engine engine) {
            this.engine = engine;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    class LightWeightCar extends Car implements Moveable {

        @Override
        void open() {
            System.out.println("Car is open");
        }

        @Override
        public void move() {
            System.out.println("Car is moving");
        }

    }

    class Lorry extends Car, Moveable, Stopable { //интерфейсы реализуются через implements
        //должен реализовать метод open
        //стоит использовать @Override
        public void move() {
            System.out.println("Car is moving");
        }
        //стоит использовать @Override
        public void stop() {
            System.out.println("Car is stop");
        }

    }
    */
}