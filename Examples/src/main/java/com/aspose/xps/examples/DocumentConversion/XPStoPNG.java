package com.aspose.xps.examples.DocumentConversion;

import com.aspose.xps.PngSaveOptions;
import com.aspose.xps.XpsDocument;
import com.aspose.xps.java.examples.Utils;

public class XPStoPNG {
    public static void main(String[] args) throws Exception {
        // ExStart:XPStoPNG
        // The path to the documents directory.
        String dataDir = Utils.getDataDir();
        // Load Existing XPS Document
        XpsDocument doc = new XpsDocument(dataDir + "input.xps");
        // Initialize PngSaveOptions
        PngSaveOptions pngSaveOptions = new PngSaveOptions();
        // Specify Resolution
        pngSaveOptions.setResolution(300f);
        // Save as PDF Document
        doc.save(dataDir + "XPStoPNG_out.png", pngSaveOptions);
        // ExEnd:XPStoPNG
    }
}
