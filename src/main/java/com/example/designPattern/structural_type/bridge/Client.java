package com.example.designPattern.structural_type.bridge;

/**
 * @author: zhoupb
 * @Description: Client
 * @since: version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 创建mac系统
        OpratingSystem opratingSystem = new Mac(new AviFile());

        opratingSystem.play("越狱第一季");
    }
}
