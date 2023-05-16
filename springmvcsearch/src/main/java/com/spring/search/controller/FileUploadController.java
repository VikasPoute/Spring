package com.spring.search.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

    @RequestMapping("/upload")
    public String upload() {
        return "fileform";
    }

    @RequestMapping(path = "/upload-image", method = RequestMethod.POST)
    public String getUpload(@RequestParam("image") CommonsMultipartFile file, HttpSession session) {
        System.out.println("File upload handler called");
        System.out.println(file.getSize());
        System.out.println(file.getContentType());
        System.out.println(file.getName());
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getStorageDescription());

        byte[] data = file.getBytes();

        // Generate a unique file name
        String fileName = generateUniqueFileName(file.getOriginalFilename());

        String path = session.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources"
                + File.separator + "images" + File.separator + fileName;
        System.out.println(path);

        try {
            FileOutputStream outputStream = new FileOutputStream(path);
            outputStream.write(data);
            outputStream.close();
            System.out.println("File uploaded successfully");
        } catch (IOException e) {
            System.out.println("File Upload Failed");
            e.printStackTrace();
        }
        return "filesucess";
    }

    private String generateUniqueFileName(String originalFilename) {
        // Generate a unique file name using a combination of timestamp and original
        // file extension
        String timestamp = String.valueOf(System.currentTimeMillis());
        String fileExtension = extractFileExtension(originalFilename);

        return "image_" + timestamp + "." + fileExtension;
    }

    private String extractFileExtension(String filename) {
        // Extract the file extension from the original filename
        int dotIndex = filename.lastIndexOf('.');
        if (dotIndex > 0 && dotIndex < filename.length() - 1) {
            return filename.substring(dotIndex + 1);
        } else {
            return "";
        }
    }
}
