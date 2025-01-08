import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

class Student{
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}
public class Main {
    public static void main(String[] args) {
        Student studentObject1=new Student(1,"Pramod",85);
        Student studentObject2=new Student(2,"Byansh",65);
        Student studentObject3=new Student(3,"Pankaj",65);
        Student studentObject4=new Student(3,"crince",75);

        ArrayList<Student> studentList=new ArrayList<>();
        studentList.add(studentObject1);
        studentList.add(studentObject2);
        studentList.add(studentObject3);
        studentList.add(studentObject4);

//                char char3='3';
//                int abc=Character.getNumericValue(char3);
//                System.out.println(abc);


        //Bubble sort

        for(int i=0;i<studentList.size()-1;i++){
            for(int j=0;j<studentList.size()-i-1;j++){
                char char1=studentList.get(j).name.charAt(0);
                char char2=studentList.get(j+1).name.charAt(0);
                if(Character.isLowerCase(char1)){
                    char1=Character.toUpperCase(char1);
                }
                if(Character.isLowerCase(char2)){
                    char2=Character.toUpperCase(char2);
                }

                if(char1>char2){
                    Student stObj=studentList.get(j);
                    studentList.set(j,studentList.get(j+1));
                    studentList.set(j+1,stObj);
                }
            }
        }


        //Bubble Sort

//        for(int i=0;i<studentList.size()-1;i++){
//            for(int j=0;j<studentList.size()-i-1;j++){
//                if(studentList.get(j).marks>studentList.get(j+1).marks){
//                    Student tempMarkobj=studentList.get(j);
//                    studentList.set(j,studentList.get(j+1));
//                    studentList.set(j+1,tempMarkobj);
//                }
//            }
//        }

        //Insertion sort

//        for(int i=1;i<studentList.size();i++){
//            for(int j=i;j>0;j--){
//                if(studentList.get(j).marks<studentList.get(j-1).marks){
//                    Student tempMarkObj=studentList.get(j-1);
//                    studentList.set(j-1,studentList.get(j));
//                    studentList.set(j,tempMarkObj);
//                }else{
//                    break;
//                }
//            }
//        }

        //selection sort algorithm.

//        for(int i=0;i<studentList.size()-1;i++){
//
//            int minMarkObjIndex=i;
//
//            for(int j=i+1;j<studentList.size();j++){
//                if(studentList.get(j).marks<studentList.get(minMarkObjIndex).marks){
//                    minMarkObjIndex=j;
//                }
//            }
//            if(studentList.get(minMarkObjIndex).marks<studentList.get(i).marks){
//                Student tempMarkObj=studentList.get(i);
//                studentList.set(i,studentList.get(minMarkObjIndex));
//                studentList.set(minMarkObjIndex,tempMarkObj);
//            }
//        }


//        Ascending order
        for(int i=0;i<studentList.size();i++){

            System.out.print(studentList.get(i).name+"-"+studentList.get(i).marks+" ");
        }

        System.out.println();
        //Descending order
        for(int i=studentList.size()-1;i>=0;i--){

            System.out.print(studentList.get(i).name+"-"+studentList.get(i).marks+" ");
        }





//        Employee tavle id,name,department_id, salary;
//        Department Table id, name;
//
//        select count(name) form enployee  join Department on Department.name="IT and Department.id=Employee.department_id;

    }
}