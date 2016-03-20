
package filestorage;

public class Main {

    //переменная для хранения ID файла        
    public static int fileID=0;
    //переменная для хранения количества файлов в хранилище
    public static int pdfFileIndex=0;

    
    
    public static void main(String[] args) {
    
    
        
//AbstractFile pdf = new PDFFile();
//pdf.setName("FirstPDF");
//System.out.println(pdf.getName());
//pdf.showFileName();

//AbstractFile er = new PDFFile();
//AbstractFile era = new PDFFile();
//er.showFileName();



FileStorage s = new FileStorage();

System.out.println(Main.fileID);
System.out.println(Main.pdfFileIndex);
s.addPDFFile();
System.out.println(Main.fileID);
System.out.println(Main.pdfFileIndex);
System.out.println("===================");

System.out.println(Main.fileID);
System.out.println(Main.pdfFileIndex);
s.addPDFFile();
System.out.println(Main.fileID);
System.out.println(Main.pdfFileIndex);
System.out.println("===================");

System.out.println(Main.fileID);
System.out.println(Main.pdfFileIndex);
s.addPDFFile();
System.out.println(Main.fileID);
System.out.println(Main.pdfFileIndex);
System.out.println("===================");




AbstractFile txt = new TXTFile();
txt.setName("FirstTXT");
txt.showFileName();


AbstractFile avi = new AVIFile();
avi.setName("Firstavi");
avi.showFileName();
        
    }
    
}
