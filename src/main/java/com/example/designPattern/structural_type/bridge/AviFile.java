package com.example.designPattern.structural_type.bridge;

/**
 * @author: zhoupb
 * @Description: avi视频(具体的实现化角色)
 * @since: version 1.0
 */
public class AviFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件：" + fileName);
    }
}
