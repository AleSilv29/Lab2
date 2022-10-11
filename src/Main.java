import ModelLayer.modelLayer;
import ViewLayer.viewLayer;
import ControllerLayer.controllerLayer;

public class Main {
    public static void main(String[] args) {
        modelLayer model=retrieveStudentFromDatabase();
        viewLayer view=new viewLayer();

        controllerLayer controller=new controllerLayer(model, view);

        controller.updateView();

        controller.setID("1234");
        System.out.println("Afer updating, student details are as follows: \n");

        controller.updateView();
    }

    private static modelLayer retrieveStudentFromDatabase(){
        modelLayer student= new modelLayer();
        student.setID("1000");
        student.setFirstName("Pop");
        student.setLastName("Ana");
        student.setCourse("Engleza");
        return student;
    }
}