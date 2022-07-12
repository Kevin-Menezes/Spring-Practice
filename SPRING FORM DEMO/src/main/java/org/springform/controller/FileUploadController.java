package org.springform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
public class FileUploadController
{
    @RequestMapping("/fileform")
    public String showUploadForm()
    {
        return "FileForm";
    }


    @RequestMapping(value = "/uploadImage", method = RequestMethod.POST)
    public String fileUpload(@RequestParam("image") CommonsMultipartFile file, HttpSession session, Model m)
    {
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getStorageDescription());

//      Get the byte data
        byte data[] = file.getBytes();
//      Save the file to server
        String path = session.getServletContext().getRealPath("/") +"WEB-INF" +File.separator +"resources" +File.separator +"img" +File.separator +file.getOriginalFilename();
        System.out.println(path);

        try {
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(data);
            fos.close();
            System.out.println("File uploaded!");

            m.addAttribute("filename",file.getOriginalFilename());
            m.addAttribute("msg","Uploaded successfully!");

        } catch (IOException e) {
            e.printStackTrace();
            m.addAttribute("msg","Uploading Error!");
            System.out.println("Uploading error!");

        }

        return "Success";
    }
}
