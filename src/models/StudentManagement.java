package models;

import java.util.ArrayList;

public class StudentManagement {

// JUST TEST

//----------DATA FIELDS------------------------------------------------------------------------------------

    private static ArrayList<Student> studentArray = new ArrayList<>();


//-------------CONSTRUCTOR--------------------------------------------------------------------------------

    // public StudentManagement() {
    //     Student initialStudent = new Student("0", "0"); // initial student
    //     studentArray.add(initialStudent);
    // }


//-------------METHODS--------------------------------------------------------------------------------------



    //--------------- ADD STUDENT----------------------------------------------

    public static void addStd(Student student) { // Method explaination in SubjectManagement.java
        studentArray.add(student);
    }


    //-----------------FIND STUDENT INDEX------------------------------------------

    public static int findStdIndex(int id) { // Method explaination in SubjectManagement.java

        if (id <= 0) {
            return -1;
        }
        for (int i = 0; i < studentArray.size(); i++) {
            if (id == studentArray.get(i).getID()) {

                return i;  // return the index of the student
            }
        }
        return -1;
    }


//-------------------SEARCH STUDENT--------------------------------------------
    // before running check if the index is not -1
    public static Student searchStd(int index) {  // Method explaination in SubjectManagement.java
        return studentArray.get(index);
    }



//----------------- DELETE STUDENT------------------------------------------

    public static boolean deleteStd(int id) {   // Method explaination in SubjectManagement.java
        int index = findStdIndex(id);
        if (index != -1) {
            studentArray.remove(studentArray.get(index));
            return true;
        }
        return false;
    }


    //-------------------UPDATE STUDENT USERNAME---------------------------------

    public static boolean updateStdUsername(int id, String newUsername) {
        int index = findStdIndex(id);

        if (index != -1) {
            studentArray.get(index).setUserName(newUsername);
            return true;
        }
        return false;
    }


    //------------------UPDATE STUDENT PASSWORD-----------------------------------

    public static boolean updateStdPassword(int id, String newPass) {
        int index = findStdIndex(id);
        if (index != -1) {
            studentArray.get(index).setPassword(newPass);
            return true;
        }
        return false;
    }


    


    //----------------------LIST STUDENT---------------------------------------------

    public static ArrayList<Student> getStudentArray() {
        return studentArray;
    }

    public static void setStudentArray(ArrayList<Student> studentArr) {
        studentArray = studentArr;
    }
}
