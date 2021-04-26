package test.testspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;

@Controller
public class DownloadController {

    /*서버파일 URL 다운로드*/

    @RequestMapping(value="/download.do")
    public void test(ModelMap model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("download Controller Entrace");

        String dFile = "CafeMessenger6_Installer.zip";
        String upDir = "D:/0005.사이트별 Client/";
//        String upDir = "/home/cafe/apps/admin/";
        String path = upDir+ File.separator+dFile;

        File file = new File(path);

        String userAgent = request.getHeader("User-Agent");
        boolean ie = userAgent.indexOf("MSIE") > -1 || userAgent.indexOf("rv:11") > -1;
        String fileName = null;

        if (ie) {
            fileName = URLEncoder.encode(file.getName(), "utf-8");
        } else {
            fileName = new String(file.getName().getBytes("utf-8"),"iso-8859-1");
        }

        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition","attachment;filename=\"" +fileName+"\";");

        FileInputStream fis=new FileInputStream(file);
        BufferedInputStream bis=new BufferedInputStream(fis);
        ServletOutputStream so=response.getOutputStream();
        BufferedOutputStream bos=new BufferedOutputStream(so);

        byte[] data=new byte[2048];
        int input=0;
        while((input=bis.read(data))!=-1){
            bos.write(data,0,input);
            bos.flush();
        }

        if(bos!=null) bos.close();
        if(bis!=null) bis.close();
        if(so!=null) so.close();
        if(fis!=null) fis.close();
    }
}
