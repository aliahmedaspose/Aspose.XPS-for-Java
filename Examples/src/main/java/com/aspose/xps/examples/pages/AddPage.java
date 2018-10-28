/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aspose.xps.examples.pages;

import com.aspose.xps.XpsDocument;
import com.aspose.xps.java.examples.Utils;

public class AddPage {

    public static void main(String[] args) throws Exception
    {   
        // The path to the documents directory.
        String dataDir = Utils.getDataDir();       

        //ExStart:AddPage
        // Create new XPS Document
        XpsDocument doc = new XpsDocument(dataDir + "Aspose.xps");

        // Insert an empty page at beginning of pages list
        doc.insertPage(1, true);

        // Save resultant XPS document
        doc.save(dataDir + "AddPages_out.xps");
        //ExEnd:AddPage
    }
    
}
