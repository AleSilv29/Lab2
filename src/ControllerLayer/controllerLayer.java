package ControllerLayer;
import ModelLayer.modelLayer;
import ViewLayer.viewLayer;

public class controllerLayer {
    private modelLayer model;
    private viewLayer view;

    public controllerLayer(modelLayer model, viewLayer view){
        this.model=model;
        this.view=view;
    }

    public void setID( String id){
        model.setID(id);
    }

    public String getID(){
        return model.getID();
    }

    public void setFirstName( String name){
        model.setFirstName(name);
    }

    public String getFirstName(){
        return model.getFirstName();
    }

    public void setLastName(String name){
        model.setLastName(name);
    }

    public String getLastName(){
        return model.getLastName();
    }

    public void setCourse(String course){
        model.setCourse(course);
    }

    public String getCourse(){
        return model.getCourse();
    }

    public void updateView(){
        view.printStudentDetails(model.getID(), model.getFirstName(), model.getLastName(), model.getCourse());
    }

}
