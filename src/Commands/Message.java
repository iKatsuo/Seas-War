package Commands;

import java.io.Serializable;



public class Message implements Serializable{
    private String name;
    private String[] parameters;

    public Message(String name, String[] parameters) {
        this.name = name;
        this.parameters = parameters;
    }
    
    public Message(String cadena){
        this.parameters = this.convertStringToArray(cadena);
        this.name = this.parameters[0];
    }
    
    
    public String toString(){
        String parameter = "";
        for (int i = 0; i < parameters.length; i++) {
             parameter += parameters[i] + " ";
        }
        return parameter;
 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getParameters() {
        return parameters;
    }

    public void setParameters(String[] parameters) {
        this.parameters = parameters;
    }
    
    public String[] convertStringToArray(String string) {
        return string.split(" ");
    }
    
    
    
    
    
    
}
