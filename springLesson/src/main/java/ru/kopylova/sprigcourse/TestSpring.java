package ru.kopylova.sprigcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = context.getBean("someRockMusic");

//        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
//
//        System.out.println(classicalMusic.getSong());


//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//
//        musicPlayer1.playMusicList();
//    boolean comparsion = musicPlayer1 == musicPlayer2;
//
//        System.out.println(comparsion);
//        System.out.println(musicPlayer1);
//        System.out.println(musicPlayer2);

//        musicPlayer1.setVolume(11);
//        System.out.println(musicPlayer1.getVolume());
//        System.out.println(musicPlayer2.getVolume());

        context.close();
    }
}
