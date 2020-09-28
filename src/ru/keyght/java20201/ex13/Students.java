package ru.keyght.java20201.ex13;

public class Students {
    Student[] student = new Student[5];
    int[] IDNumber = new int[5];

    public void StudentsInit() {
        student[0] = new Student(12,4.6);
        student[1] = new Student(186, 4);
        student[2] = new Student(1, 3);
        student[3] = new Student(5, 5);
        student[4] = new Student(32, 3.5);
    }

    public void sortIDNumbers() {
        for (int i = 0; i < 5; i++) {
           IDNumber[i] = student[i].getID();
        }
        for (int left = 0; left < 5; left++) {
            int minInd = left;
            for (int i = left; i < 5; i++) {
                if (IDNumber[i] < IDNumber[minInd]) {
                    minInd = i;
                }
            }
            int tmp = IDNumber[left];
            IDNumber[left] = IDNumber[minInd];
            IDNumber[minInd] = tmp;
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(IDNumber[i]+" ");
        }
    }

    public static void main(String[] args) {
        Students students = new Students();
        students.StudentsInit();
        students.sortIDNumbers();
    }
}
