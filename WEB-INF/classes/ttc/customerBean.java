package ttc;

import java.io.Serializable;

public class customerBean implements Serializable {
    private String _name;
    private String _pass;
    
    public customerBean() {

    }
    public void setName(String name) {
        _name = name;
    }
    public String getName() {
        return _name;
    }
    public void setPass(String pass) {
        _pass = pass;
    }
    public String getPass() {
        return _pass;
    }

}