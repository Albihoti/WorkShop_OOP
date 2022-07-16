package Exceptions;

public class NewStudentExceptions extends StudentExceptions {
    private int negativeID;


    public NewStudentExceptions(int negativeID) {
        this.negativeID = negativeID;
    }

    public NewStudentExceptions(String message, int negativeID) {
        super(message);
        this.negativeID = negativeID;
    }

    public int getNegativeID() {
        return negativeID;
    }

    public void setNegativeID(int negativeID) {
        this.negativeID = negativeID;
    }
}