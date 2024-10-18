package History;

import Workout.Workout;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class History extends Workout{
    List<Workout> searchResult;
    List<Workout> workouts = new ArrayList<>();


public enum FilterOptions{
        WORKOUT_ID,
        WORKOUT_TYPE,
        WORKOUT_DATE,
        WORKOUT_SPORT;
    }


    public void saveWorkout(Workout workout){
        workouts.add(workout);
    }

    public void deleteWorkout(Workout workout){
        workouts.remove(workout);
    }

    public List<Workout> findWorkoutBy(FilterOptions option){
        searchResult = workouts.stream()
                .collect(Collectors.toList());
        return searchResult;
    }

    public void findByID(int ID){
        searchResult = workouts.stream()
                .filter(w-> w.getWorkoutID()==ID)
                .collect(Collectors.toList());
    }
}
