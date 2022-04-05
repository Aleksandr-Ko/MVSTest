package ru.kopylova.sprigcourse;

public class ClassicalMusic implements Music {

    private ClassicalMusic () {}

    public static ClassicalMusic myFactoryMethod () {
        System.out.println("Создаём объект через фактори метод");
        return new ClassicalMusic ();
    }
    @Override
    public String getSong() {
        return "kalinka";
    }

    public void myInit () {
        System.out.println("Запускается создание бина");
    }

    public void myDistr () {
        System.out.println("Останавливается работа бина");
    }
}
