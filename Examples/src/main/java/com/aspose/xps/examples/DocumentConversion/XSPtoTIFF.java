package com.aspose.xps.examples.DocumentConversion;

import com.aspose.xps.TiffSaveOptions;
import com.aspose.xps.XpsDocument;
import com.aspose.xps.java.examples.Utils;

public class XSPtoTIFF {
    public static void main(String[] args) throws Exception {
        // ExStart:XSPtoTIFF
        // The path to the documents directory.
        String dataDir = Utils.getDataDir();
        // Load Existing XPS Document
        XpsDocument doc = new XpsDocument(dataDir + "input.xps");
        // Initialize TiffSaveOptions
        TiffSaveOptions tiffSaveOptions = new TiffSaveOptions();
        // Specify Resolution
        tiffSaveOptions.setResolution(300f);
        // Save as PDF Document
        doc.save(dataDir + "XSPtoTIFF_out.tif", tiffSaveOptions);
        // ExEnd:XSPtoTIFF
    }
}
