import java.io.File;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfFile {

	
		public static void main(String[] args) {
	
			  try {
				   for(int i = 1; i<= 3; i++) {
				  
			       	//Create Document instance.
				Document document = new Document();
			 
				//Create OutputStream instance.
				FileOutputStream outputStream = 
					new FileOutputStream(new File("Exam"+i+".pdf"));
			 
				//Create PDFWriter instance.
			        PdfWriter.getInstance(document, outputStream);
			 
			        //Open the document.
			        document.open();
			 
			        //Add content to the document.
			        if (i<=20) {
			        document.add(new Paragraph("Welcome"));
			        document.add(new Paragraph("Hello"));
			        
			        }else if (i<=50) {
			        	document.add(new Paragraph("hola"));
			        }else
			        	document.add(new Paragraph("hi"));
			        //Close document and outputStream.
			        document.close();
			        outputStream.close();
				   }
			        System.out.println("Pdf created successfully.");
			    } catch (Exception e) {
				e.printStackTrace();
			    }
			  }
			}