package com.aspose.xps.examples.DocumentConversion;

import com.aspose.xps.BmpSaveOptions;
import com.aspose.xps.XpsDocument;
import com.aspose.xps.java.examples.Utils;

public class XPStoBMP {
    public static void main(String[] args) throws Exception {
        // ExStart:XPStoBMP
        // The path to the documents directory.
        String dataDir = Utils.getDataDir();
        // Load Existing XPS Document
        XpsDocument doc = new XpsDocument(dataDir + "input.xps");
        // Initialize BmpSaveOptions
        BmpSaveOptions bmpSaveOptions = new BmpSaveOptions();
        // Specify Resolution
        bmpSaveOptions.setResolution(300f);
        // Save as PDF Document
        doc.save(dataDir + "XPStoBMP_out.bmp", bmpSaveOptions);
        // ExEnd:XPStoBMP
    }
}
