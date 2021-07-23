package com.example.designPattern.structural_type.bridge;

/**
 * @author: zhoupb
 * @Description: 抽象的操作系统类(抽象化角色)
 * @since: version 1.0
 */
public abstract class OpratingSystem {

    /**
     * 声明videoFile变量
     */
    protected VideoFile videoFile;

    public OpratingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    /**
     * 播放功能
     */
    public abstract void play(String fileName);
}
