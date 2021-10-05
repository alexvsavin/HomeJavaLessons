package Lesson06;

        public class Dog extends Animals {
            //private String color;
            private final int MaxRunLength = 500;
            private final int MaxSwimLength = 10;

            public Dog(String name, int run, int swim) {
                super(name, run, swim);
                //    this.color = color;
            }
                @Override
                public void animalsInfo() {
                    System.out.println("Собака имя: " + name /*+ " цвет: " + color*/);
                }
                 @Override
                 public void animalsRun(int run) {
                 if ((run >= 0) && (run <= MaxRunLength)) System.out.println("Собака пробежала " + run + "м.");
                 else System.out.println("Не праильно задана дистанция. Max 500 метров");
            }

                @Override
                public void animalsSwim(int swim) {
                if ((swim >= 0) && (swim <= MaxSwimLength)) System.out.println("Собака проплыла " + swim + "м.");
                else System.out.println("Не праильно задана дистанция Max 10 метров");
            }


                /*@Override
                public void animalsSwim() {
                    System.out.println("Собака проплыла " + swim);
                }*/
            }
