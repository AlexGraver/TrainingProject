package Exercise.KettlebellExercises;

import Exercise.Exercise;
import Exercise.AvailableExercises;

import java.util.LinkedHashMap;
import java.util.Map;

import static Exercise.Exercise.ActivityType.STRENGHT_ENDURANCE;

public abstract class KettlebellExercise extends Exercise {
    public int weight;
    public int kettlebellCount;
    public static Map<Integer, Integer> availableKettlebells = new LinkedHashMap<>();

    public KettlebellExercise(ActivityType activityType) {
        super(activityType);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getKettlebellCount() {
        return kettlebellCount;
    }

    public void setKettlebellCount(int kettlebellCount) {
        this.kettlebellCount = kettlebellCount;
    }

    @Override
    public void getExerсiceInfo() {
        System.out.println("Exercise name: " + exerciseName
                + " " + kettlebellCount + "x" + weight + " Kg");
        System.out.println("Relax time Min: " + relaxTimeMin);
        System.out.println("Sets x Reps: " + exerciseSets + " x " + exerciseReps);
    }

    public static String infoAvailableKettlebells(){
        String result = null;
        String[] kettlebellInfo = {
                " - 16kg x" + availableKettlebells.get(16) + ", ",
                " - 24kg x" + availableKettlebells.get(24) + ", ",
                " - 32kg x" + availableKettlebells.get(32)
        };

        int kettlebellInfoElement = 0;
        for(Integer key: availableKettlebells.keySet()){
            if(availableKettlebells.get(key) !=0){
                result = result + kettlebellInfo[kettlebellInfoElement];
            }
            kettlebellInfoElement++;
        }
        return result;
    }

    public void generateKettlebellExercises(){
       AvailableExercises.availableExercises.add(new KettlebellSnatch(STRENGHT_ENDURANCE));
       AvailableExercises.availableExercises.add(new KettlebellSwing(STRENGHT_ENDURANCE));
    }

}
