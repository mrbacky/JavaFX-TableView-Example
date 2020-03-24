/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableviewexample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author schemabuoi
 */
public class Person {
    
    private IntegerProperty id = new SimpleIntegerProperty();
    private StringProperty name = new SimpleStringProperty();
    
    public Person(int id, String name)
    {
        this.id.set(id);
        this.name.set(name);
    }
    
    public void setId(int id)
    {
        this.id.set(id);
    }
    
    public int getId()
    {
        return this.id.get();
    }
    
    public IntegerProperty idProperty()
    {
        return id;
    }
    
    public void setName(String name)
    {
        this.name.set(name);
    }
    
    public String getName()
    {
        return this.name.get();
    }
    
    public StringProperty nameProperty()
    {
        return name;
    }
    
}
