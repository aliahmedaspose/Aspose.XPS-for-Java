package com.aspose.xps.examples.DocumentConversion;

import com.aspose.xps.PdfSaveOptions;
import com.aspose.xps.PdfTextCompression;
import com.aspose.xps.XpsDocument;
import com.aspose.xps.java.examples.Utils;

import java.io.FileOutputStream;

public class XPStoPDFStream {
    public static void main(String[] args) throws Exception {
        // ExStart:XPStoPDF
        // The path to the documents directory.
        String dataDir = Utils.getDataDir();
        // Load Existing XPS Document
        XpsDocument doc = new XpsDocument(dataDir + "input.xps");
        // Initialize PdfSaveOptions
        PdfSaveOptions pdfSaveOptions = new PdfSaveOptions();
        // Specify TextCompression Style
        pdfSaveOptions.setTextCompression(PdfTextCompression.Flate);
        //Create a PDF stream
        FileOutputStream outputStream = new FileOutputStream(dataDir + "XPStoPDF_out.pdf");
        // Save as PDF Document
        doc.save(outputStream, pdfSaveOptions);
        // ExEnd:XPStoPDF
    }
}
