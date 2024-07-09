package ttc;

import java.io.Serializable;

public class BookBean implements Serializable {
    private String _id;
    private String _title;
    private String _price;
    
    public BookBean(){}

    public String getId() {
        return _id;
    }
    public void setId(String id) {
        _id = id;
    }
    public String getTitle() {
        return _title;
    }
    public void setTitle(String title) {
        _title = title;
    }
    public String getPrice() {
        return _price;
    }
    public void setPrice(String price) {
        _price = price;
    } 
}
