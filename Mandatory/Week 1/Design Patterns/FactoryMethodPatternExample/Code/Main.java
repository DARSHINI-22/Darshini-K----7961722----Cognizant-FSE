package FactoryMethodPatternExample;

public class Main {
    public static void main(String[] args) {

        DocumentFactory wordFactory = new WordFactory();
        DocumentFactory pdfFactory = new PdfFactory();
        DocumentFactory excelFactory = new ExcelFactory();


        Document wordDocument = wordFactory.createDocument();   
        Document pdfDocument = pdfFactory.createDocument();
        Document excelDocument = excelFactory.createDocument();

        wordDocument.open();    
        pdfDocument.open();
        excelDocument.open();
    }
}
