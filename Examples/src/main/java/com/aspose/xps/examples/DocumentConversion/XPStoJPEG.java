package com.aspose.xps.examples.DocumentConversion;

import com.aspose.xps.JpegSaveOptions;
import com.aspose.xps.XpsDocument;
import com.aspose.xps.java.examples.Utils;

public class XPStoJPEG {
    public static void main(String[] args) throws Exception {
        // ExStart:XPStoJPEG
        // The path to the documents directory.
        String dataDir = Utils.getDataDir();
        // Load Existing XPS Document
        XpsDocument doc = new XpsDocument(dataDir + "input.xps");
        // Initialize JpegSaveOptions
        JpegSaveOptions jpegSaveOptions = new JpegSaveOptions();
        // Specify Resolution
        jpegSaveOptions.setResolution(300f);
        // Save as PDF Document
        doc.save(dataDir + "XPStoJPEG_out.jpeg", jpegSaveOptions);
        // ExEnd:XPStoJPEG
    }
}
