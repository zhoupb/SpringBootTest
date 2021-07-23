package com.example.designPattern.structural_type.bridge;

/**
 * @author: zhoupb
 * @Description: Windows系统类(扩展抽象化角色)
 * @since: version 1.0
 */
public class Windows extends OpratingSystem{

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
