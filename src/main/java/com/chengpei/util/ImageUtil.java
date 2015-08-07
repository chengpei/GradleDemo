package com.chengpei.util;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by chengpei on 2015/6/11.
 */
public class ImageUtil {
    private static int width = 75;
    private static int height = 25;
    public static Map<String, BufferedImage> getCheckCode(){
        Map<String, BufferedImage> map = new HashMap<String, BufferedImage>();
        //��������
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        //��ȡ����
        Graphics g = image.getGraphics();
        Random ran = new Random();
        //���������ɫ����
        g.setColor(new Color(ran.nextInt(150),ran.nextInt(150),ran.nextInt(150)));
        g.fillRect(0, 0, width, height);
        //�������A-Z 0-9��ɵ��ַ���
        String code = getNumber(5);
        //�������ǳɫ������ɫ
        g.setColor(new Color(ran.nextInt(105)+150, ran.nextInt(105)+150, ran.nextInt(105)+150));
        g.setFont(new Font(null,Font.ITALIC,20));
        g.drawString(code,5, 22);
        //��������
        for(int i=0;i<3;i++){
            g.drawLine(ran.nextInt(width), ran.nextInt(height), ran.nextInt(width), ran.nextInt(height));
        }
        map.put(code, image);
        return map;
    }

    public static String getNumber(int size) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String rs = "";
        Random r = new Random();
        for(int i=0;i<size;i++){
            rs += str.charAt(r.nextInt(str.length()));
        }
        return rs;
    }
    public static InputStream getInputStream(BufferedImage image)
            throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(bos);
        encoder.encode(image);
        byte[] imageBts = bos.toByteArray();
        InputStream in = new ByteArrayInputStream(imageBts);
        return in;
    }
}
