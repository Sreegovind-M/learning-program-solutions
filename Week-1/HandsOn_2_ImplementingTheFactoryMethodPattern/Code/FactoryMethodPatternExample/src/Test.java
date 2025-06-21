public class Test {
    public static void main(String[] args) {
        DocumentFactory wordFact = new WordDocumentFactory();
        Document wordDoc = wordFact.createDocument();

        DocumentFactory pdfFact = new PdfDocumentFactory();
        Document pdfDoc = pdfFact.createDocument();

        DocumentFactory excelFact = new ExcelDocumentFactory();
        Document excelDoc = excelFact.createDocument();

        wordDoc.show();
        pdfDoc.show();
        excelDoc.show();


    }
}
