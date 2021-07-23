package com.example.designPattern.structural_type.bridge;

/**
 * @author: zhoupb
 * @Description: Mac(扩展抽象化角色)
 * @since: version 1.0
 */
public class Mac extends OpratingSystem{

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
