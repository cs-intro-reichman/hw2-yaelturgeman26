public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0]; 
        int minutesToAdd = Integer.parseInt(args[1]); 
        String[] timeParts = time.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);
        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int newHours = (totalMinutes / 60) % 24;
        int newMinutes = totalMinutes % 60;
        String hoursString;
        if (newHours < 10) {
             hoursString = "0" + newHours;
        } else {
         hoursString = Integer.toString(newHours);
        }
        String minutesString;
        if (newMinutes < 10) {
            minutesString = "0" + newMinutes;
        } else {
            minutesString = Integer.toString(newMinutes);
        }
        System.out.println(hoursString + ":" + minutesString);
    }
}
