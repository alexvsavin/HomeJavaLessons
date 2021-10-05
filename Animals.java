package Lesson06;

public class Animals {

           protected String name;
           protected int run;
           protected int swim;

    //public Animals() {
    //}

        public Animals(String name, int run, int swim) {
            this.name = name;
            this.run = run;
            this.swim = swim;
        }

        public void animalsInfo() {
            System.out.println("Животное: " + name);
                    }

        public void animalsRun(int run) {
            System.out.println("Животное пробежало " + run);
                    }

        public void animalsSwim(int swim) {
            System.out.println( "Животное проплыло " + swim);
                    }


}
