
package filestorage;

import static filestorage.Main.pdfFileIndex;

public class FileStorage {
  
    //Переменная, задающая размер массива
    public int massivLenght;
    
    public AbstractFile pdfFiles;
    public AbstractFile oldPdfFiles;
    

    public void addPDFFile(){
       
        //Изменение (+1) стат.поля fileID при создании нового файла
        Main.fileID++;
       
        //выполняем действие только для первого элемента масива
        if (pdfFileIndex==0) {
            //создаем новый массив pdf-файлов с длиной (pdfFileIndex+1) и присваиваем его ссылке pdfFile
            //???как создавать массив типа Абстракт чтоюы помещать туда и ТХТ и АВИ???
            AbstractFile [] pdfFiles = new PDFFile[pdfFileIndex+1];
            //создаем элемент массива с индексом pdfFileIndex
            pdfFiles [pdfFileIndex] = new PDFFile();
            //печатаем все элементы массива
            for(int i=0; i<pdfFileIndex+1; i++) {
            // Печатаем элемент массива
            System.out.println(pdfFiles[i]);
            }
            
        }
        else {
            AbstractFile [] oldPdfFiles = new PDFFile[pdfFileIndex];
            //oldPdfFiles = pdfFiles;??? почему так нельзя???копировать масссив через ссылку?
            
            /*
            Примеры копирования элементов массива
            №1
            
            String[] a = {"abc", "def", "ghs"};
            String[] b = (String[])a.clone();
            a[0] = "changed";
            for (int i=0; i<b.length; i++)
            System.out.println(b[i]);
            
            №2
            №3
            
            
            */
            
            
            AbstractFile [] pdfFiles = new PDFFile[pdfFileIndex+1];
            //создаем элемент массива с индексом pdfFileIndex
            pdfFiles [pdfFileIndex] = new PDFFile();
            //печатаем все элементы массива
            for(int j=0; j<pdfFileIndex; j++) {
                // Печатаем элемент массива
                pdfFiles [j] = oldPdfFiles [j];
                }
            for(int i=0; i<pdfFileIndex+1; i++) {
                // Печатаем элемент массива
                System.out.println(pdfFiles[i]);
                }
                    
            }//System.out.println();
        //уведичиваем индекс pdfFileIndex в массиве pdfFiles на 1
        Main.pdfFileIndex++;
    
    }
    public void deleteFile(){
    
    
    }




    
}
