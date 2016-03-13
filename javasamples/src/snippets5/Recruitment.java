package snippets5;

/**
 * Created by root on 13/3/16.
 */
abstract public class Recruitment {

    int rollNumber;
    String name;

    Recruitment(int a,String b){
        rollNumber=a;
        name=b;
    }
    void eligibilityCriteria(){
        System.out.println(" 60% in academics \n any discipline");
    }
    abstract void writtenTest();
    abstract void interviewProcess();
    abstract void packageDetails();

}
