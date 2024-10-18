package Exercise;

public abstract class Exercise {
    public  String exerciseName;
    public ActivityType activityType;
    public enum ActivityType {
        STRENGHT,
        ENDURANCE,
        STRENGHT_ENDURANCE,
        POWER,
        RECOVERY;
    }

    public int exerciseReps;
    public int exerciseSets;
    public int relaxTimeMin;
    public int excerciseDurationMin;
    public String exerciseIntensity;
    public String equipment;
    boolean isDone;

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public Exercise(ActivityType activityType) {
        this.activityType = activityType;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public void getExerсiceInfo(){
        System.out.println("Exercise name: " + exerciseName);
        System.out.println("Relax time Min: " + relaxTimeMin);
        System.out.println("Sets x Reps: " + exerciseSets + " x " + exerciseReps);
    }


}
