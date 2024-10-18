package Workout;

import Exercise.AvailableExercises;

public class WorkoutConstructor extends Workout{
    AvailableExercises savedExercises = new AvailableExercises();
    //Should construct workout according to workout type

    public int calculateWarmUpCoolDownTime(ActivityType activityType, int duration){
        if (activityType == ActivityType.RECOVERY) {
            return 0;
        }
        if (duration <= 60) {
            return 20;
        } else if (duration <= 120) {
            return 30;
        } else {
            return 40;
        }
    }





}
