
package filestorage;

public class Main {

    //переменная для хранения ID файла        
public static int fileID=0;

    public static void main(String[] args) {

        
        
        
//AbstractFile pdf = new PDFFile();
//pdf.setName("FirstPDF");
//System.out.println(pdf.getName());
//pdf.showFileName();

AbstractFile er = new PDFFile();
AbstractFile era = new PDFFile();
er.showFileName();

FileStorage s = new FileStorage();
s.addPDFFile();
s.addPDFFile();



AbstractFile txt = new TXTFile();
txt.setName("FirstTXT");
txt.showFileName();


AbstractFile avi = new AVIFile();
avi.setName("Firstavi");
avi.showFileName();
        
    }
    
}
