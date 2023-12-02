
/**
 * Sep 22, 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * developed by Tangirov Akbar
 * Returns a string indicating whether the student has passed or failed based on their marks.
 * If all marks are greater than or equal to 40, the student has passed.
 * Otherwise, the student has failed.
 */

public class Check {
    private int mark1;
    private int mark2;
    private int mark3;
    private int total;



    public Check(int markOne, int markTwo, int markThree) {
        this.mark1 = markOne;
        this.mark2 = markTwo;
        this.mark3 = markThree;
        this.total = markOne + markTwo + markThree;
    }


    public String getResult () {
        if (mark1 >= 40 && mark2 >= 40 && mark3 >= 40) {
            return "PASSED!";
        } else {
            return "FAILED!";
        }
    }

    // public boolean GetResult () {
    //     if (mark1 >= 40) {
    //         return true;
    //     } else if (mark2 >= 40) {
    //         return true;
    //     } else if (mark3 >= 40) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }


    /**
     *  Sep 22, 2023 FRIDAY
     */

    public int getTotal () {
        return this.total;
    }

    public double getAverage () {
        return (this.total / 3);
    }

    public String getGrade () {
        if (total >= 90) {
            return "Grade: A ";
        } else if (total >= 80) {
            return "Grade: B ";
        } else if (total >= 70) {
            return "Grade: C ";
        } else if (total >= 60) {
            return "Grade: D ";
        } else if (total >= 50) {
            return "Grade: E ";
        } else {
            return "Grade: F ";
        }
    }






}

