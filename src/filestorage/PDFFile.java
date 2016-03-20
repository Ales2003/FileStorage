
package filestorage;

public class PDFFile extends AbstractFile {

    
    public PDFFile() {
        //???super заменяет необходимость создавать ссылку на объект, которая нужна чтобы реализовать метод (ведь к методу млжно обратиться только через объект(ссылку на объект))
        super.setName("PDF_"+Main.fileID);
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
        show = "PDF File has name <<" + super.getName()+">> and show piktures";
        System.out.println(show);
        return show;
    }

   
    
   
    
}
