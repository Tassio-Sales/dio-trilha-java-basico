package edu.tassio.secondWeek;

public class StudentReportCard {

    public static void main(String[] args) {

        int finalMedia = 6;

        if (finalMedia < 6)
            System.out.println("Disapproved!");
        else if (finalMedia == 6)
            System.out.println("Final test!");
        else
            System.out.println("Approved!");

    }
}
