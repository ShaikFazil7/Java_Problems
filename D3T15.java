class FileValidator
{
  String fileName = "student_report.pdf";
}

public class D3T15 {
    public static void main(String[] args) {
        FileValidator fv = new FileValidator();
        System.out.println("is the file ends with .pdf : "  +  fv.fileName.endsWith(".pdf"));
        if(fv.fileName.endsWith(".pdf"))
        {
            System.out.println("PDF file");
        }
        else{
            System.out.println("different file format");
        }
    }
}
