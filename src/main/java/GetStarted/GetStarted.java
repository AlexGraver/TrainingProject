package GetStarted;

import Exercise.KettlebellExercises.KettlebellExercise;

import java.util.*;

public class GetStarted {
    List<String> equipmentAvailable = new ArrayList<>();
    List<String> equipmentSelected = new ArrayList<>();

    public int timesPerWeek;
    public int durationPerWeek;

    Scanner scanner = new Scanner(System.in);

    public void getStarted(){
        countAverageWorkoutDuration();
        selectEquipment();
        printGetstartedInfo();
    }

    private void printGetstartedInfo(){
        System.out.println("Estimated time: " + getDurationPerWeek());
        System.out.println("Estimated workouts: " + getTimesPerWeek());
        System.out.println("========================================");
        System.out.println("Equipment: ");

        for(String s: equipmentSelected){
            if(s.equalsIgnoreCase("kettlebell")){
                System.out.println(s + KettlebellExercise.infoAvailableKettlebells());
                continue;
            }
            System.out.println(s);
        }
    }

   private void setEquipmentAvailable(){
       equipmentAvailable.add("kettlebell");
       equipmentAvailable.add("longRubber");
       equipmentAvailable.add("shortRubber");
       equipmentAvailable.add("bicycle");
   }

    private void selectEquipment(){
        setEquipmentAvailable();
            for (String eq : equipmentAvailable) {
                validateEquipmentType(eq);
            }
            selectAvailableKettlebells();
    }

    private void selectAvailableKettlebells(){
        if(equipmentSelected.contains("kettlebell")){
            int count = 0;
            int[] kettlebellWeight = {16,24,32};
            for(int kw: kettlebellWeight){
                while (true){
                    System.out.println("How many "+kw+" Kg kettlebells do You have?");
                    try {
                        count = scanner.nextInt();
                        if(count>=0 && count<=2){
                            KettlebellExercise.availableKettlebells.put(kw,count);
                            break;
                        }else{
                            System.out.println("Enter digits 0-2");
                        }
                    }catch (InputMismatchException e){
                        scanner.next();
                        System.out.println("Invalid input, enter digits 0-2");
                    }
                }
            }
        }
    }


    private void validateEquipmentType(String unit){
        int is = -1;
        while (is != 0 && is != 1) {
            try {
                System.out.println("Press 1 if You have " + unit + ", 0 if NOT");
                is = scanner.nextInt();
                if (is == 1) {
                    equipmentSelected.add(unit);
                } else if (is == 0) {

                } else {
                    System.out.println("Please enter only 1 for true and 0 for false");
                }
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Invalid input. Please enter only 1 for true and 0 for false");
            }
        }
    }



    public int getTimesPerWeek() {
        return timesPerWeek;
    }

    private void setTimesPerWeek(int timesPerWeek) {
        this.timesPerWeek = timesPerWeek;
    }

    public int getDurationPerWeek() {
        return durationPerWeek;
    }

    private void setDurationPerWeek(int durationPerWeek) {
        this.durationPerWeek = durationPerWeek;
    }

    private void enterAndValidateTimesPerWeek(){
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter available workout times per week (2 to 12)");
                timesPerWeek = scanner.nextInt();
                if (timesPerWeek >= 2 && timesPerWeek <= 12) {
                    validInput = true;
                } else {
                    System.out.println("Enter numbers from 2 to 12: ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter valid numbers from 2 to 12");
                scanner.next();
            }
        }
    }

    private void enterAndValidateDurationPerWeek(){
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter available duration  per week (80 to 1000 min)");
                durationPerWeek = scanner.nextInt();
                if (durationPerWeek >= 80 && durationPerWeek <= 1000) {
                    validInput = true;
                } else {
                    System.out.println("Enter numbers from 80 to 1000: ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter valid numbers from 80 to 1000");
                scanner.next();
            }
        }
    }

    private void countAverageWorkoutDuration(){
        enterAndValidateTimesPerWeek();
        enterAndValidateDurationPerWeek();
        if((durationPerWeek/timesPerWeek)>120){
            setTimesPerWeek(durationPerWeek/120);
        } else if ((durationPerWeek/timesPerWeek)<40){
            setDurationPerWeek(40*timesPerWeek);
        }
        System.out.println("Workouts per week: " + timesPerWeek);
        System.out.println("Duration per week: " + durationPerWeek);
    }




}
