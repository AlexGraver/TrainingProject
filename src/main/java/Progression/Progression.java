package Progression;

public class Progression {

    public int lastResult;
    public int newResult;


    public  enum ProgressionType {
        RELAX_TIME,
        SET,
        REPS,
        WEIGHT,
        DURATION,
        INTENCITY;
    }

    public enum Levels {
        REGRESS(0.9),
        PROGRESS(1.1);

        private final double level;
        Levels(double level) {
            this.level = level;
        }

        public double getLevel() {
            return level;
        }
    }

    public int setProgression(ProgressionType type, Levels level, int lastResult){
        if(type == ProgressionType.RELAX_TIME && level == Levels.PROGRESS){
            newResult = progression(Levels.REGRESS, lastResult);
        }
        else if (type == ProgressionType.RELAX_TIME && level == Levels.REGRESS){
            newResult = progression(Levels.PROGRESS, lastResult);
        }
        else {
            newResult = progression(level, lastResult);
        }
        return newResult;
    }

    public int progression(Levels level, int lastResult){
        newResult = Math.round(lastResult * (float)level.getLevel());
        return newResult;
    }



}
