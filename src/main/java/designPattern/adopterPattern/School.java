package designPattern.adopterPattern;

public class School {
    public static void main(String[] args) {
        AssignmentWork assignmentWork=new AssignmentWork();
        Pen p=new AdopterPen();
        assignmentWork.setP(p);
        assignmentWork.writeAssignment("I am bit tired to write anything");
    }
}
