package Workout;

import Exercise.Exercise;

import java.time.LocalDateTime;
import java.util.List;

public class Workout {
    int workoutID;
    private ActivityType activityType;
    public enum ActivityType {
        STRENGHT,
        ENDURANCE,
        STRENGHT_ENDURANCE,
        POWER,
        RECOVERY;
    }




    String intencity; //low, middle, high, maximal
    List<Exercise> exercises;
    LocalDateTime planned;
    LocalDateTime start;
    LocalDateTime finish;
    int durationMin;
    boolean corrected;
    String correctionCause;
    boolean isDone;
    int AHR;
    String sportType; //bycicle, running, kettlebell, fitness
    String enduranceType; //Base, LactateThreshold, VO2max



    public void initWorkout(){

    }

    public int getWorkoutID() {
        return workoutID;
    }

    public void setWorkoutID(int workoutID) {
        this.workoutID = workoutID;
    }

    public ActivityType getWorkoutType() {
        return activityType;
    }

    public void setActivityTypeType(ActivityType activityType) {
        this.activityType = activityType;
    }

    public String getIntencity() {
        return intencity;
    }

    public void setIntencity(String intencity) {
        this.intencity = intencity;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    public LocalDateTime getPlanned() {
        return planned;
    }

    public void setPlanned(LocalDateTime planned) {
        this.planned = planned;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public void setDurationMin(int durationMin) {
        this.durationMin = durationMin;
    }

    public boolean isCorrected() {
        return corrected;
    }

    public void setCorrected(boolean corrected) {
        this.corrected = corrected;
    }

    public String getCorrectionCause() {
        return correctionCause;
    }

    public void setCorrectionCause(String correctionCause) {
        this.correctionCause = correctionCause;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public int getAHR() {
        return AHR;
    }

    public void setAHR(int AHR) {
        this.AHR = AHR;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public String getEnduranceType() {
        return enduranceType;
    }

    public void setEnduranceType(String enduranceType) {
        this.enduranceType = enduranceType;
    }
}
