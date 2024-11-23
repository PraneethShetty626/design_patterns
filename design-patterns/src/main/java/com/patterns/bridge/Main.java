package com.patterns.bridge;

public class Main {
    public static void main(String[] args) {
        Video youTube = new YoutubeVideo(new HdProcessor());
        youTube.play("abc.mp4");

        Video netflixVicdeo = new NetflixVideo(new UHdProcessror());

        netflixVicdeo.play("abc.mp4");
    }
}
