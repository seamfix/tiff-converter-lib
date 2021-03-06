package com.seamfix.imageutil;

import com.seamfix.imageutil.ImageResult;
import com.seamfix.imageutil.Images;

import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //path to your tiff image file:
        String tiffPath = "/Users/jeffemuveyan/Desktop/images/example.tiff";

        Images.Companion.createBMPFromTIFF(tiffPath, new ImageResult(){

            @Override
            public void result(ArrayList<File> bmpFiles) {

                //use result
                for(File bmpFile : bmpFiles){
                    System.out.println("File name: "+bmpFile.getName()+", size: "+bmpFile.length());
                }
            }

            @Override
            public void error(String message) {

                //handle error
                System.out.println(message);
            }
        });
    }
}
