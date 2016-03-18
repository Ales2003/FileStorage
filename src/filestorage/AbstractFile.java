
package filestorage;

public abstract class AbstractFile implements InterfaceFile {
    
    
    private String name;
    protected String show;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

      
    
}
