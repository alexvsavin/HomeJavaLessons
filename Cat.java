package Lesson06;

    public class Cat extends Animals {
        private String color;
        private final int MaxRunLength = 200;

        public Cat(String name, String color, int run, int swim) {
            super(name, run, swim);
            this.color = color;
        }
        @Override
        public void animalsInfo() {
            System.out.println("Кот имя: " + name + " цвет: " + color);
        }

        @Override
        public void animalsRun(int run) {
            if ((run >= 0) && (run <= MaxRunLength)) System.out.println("Кот пробежал " + run + "м.");
            else System.out.println("Не праильно задана дистанция. Max 200 метров");
        }

        @Override
        public void animalsSwim(int swim) {
            System.out.println("Кот не умеет плавать");
        }

    }



