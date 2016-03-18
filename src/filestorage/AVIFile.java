package filestorage;

public class AVIFile extends AbstractFile {

    
    @Override
    public void setName(String name) {
        super.setName(name); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }

    //???!!! Как сделать через GetName и когла name private???
    @Override
    public String showFileName() {
        show = "AVI File has name" + super.getName()+ " and show videos";
        System.out.println(show);
        return show;
    }

   
    
   
    
}
