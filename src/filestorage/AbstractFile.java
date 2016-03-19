
package filestorage;

public abstract class AbstractFile implements InterfaceFile {
    
    //Variable keep file name
    private String name;
    //Variable keep show
    protected String show;
    
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

      
    
}
