
package filestorage;

public class PDFFile extends AbstractFile {

    
    public PDFFile() {
        super.setName("Name: "+Main.fileID);//super заменяет необходимость создавать ссылку на объект, чтобы реализовать метод
        System.out.println(super.getName());
    }
    

    
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
        show = "PDF File has name " + super.getName()+" and show piktures";
        System.out.println(show);
        return show;
    }

   
    
   
    
}
