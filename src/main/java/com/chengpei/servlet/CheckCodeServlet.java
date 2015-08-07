//package com.chengpei.servlet;
//
//import com.chengpei.util.ImageUtil;
//
//import javax.imageio.ImageIO;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.awt.image.BufferedImage;
//import java.io.IOException;
//import java.util.Map;
//
///**
// * Created by chengpei on 2015/8/7.
// */
//@WebServlet(name = "/CheckCodeServlet")
//public class CheckCodeServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Map<String, BufferedImage> map = ImageUtil.getCheckCode();
//        String code = map.keySet().iterator().next();
//        request.getSession().setAttribute("checkcode", code);
//        //8.设置响应头通知浏览器以图片的形式打开
//        response.setContentType("image/jpeg");//等同于response.setHeader("Content-Type", "image/jpeg");
//        //9.设置响应头控制浏览器不要缓存
//        response.setDateHeader("expries", -1);
//        response.setHeader("Cache-Control", "no-cache");
//        response.setHeader("Pragma", "no-cache");
//        //10.将图片写给浏览器
//        ImageIO.write(map.get(code), "jpg", response.getOutputStream());
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doPost(request, response);
//    }
//}
