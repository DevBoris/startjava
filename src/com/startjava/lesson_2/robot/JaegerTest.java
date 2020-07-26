package com.startjava.lesson_2.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.2f, 1.9f, 7, 8, 6);
        System.out.println("Первый Jaeger:");
        System.out.println("название модели: " + jaeger1.getModelName());
        System.out.println("модель: " + jaeger1.getMark());
        System.out.println("страна: " + jaeger1.getOrigin());
        System.out.println("высота: " + jaeger1.getHeight());
        System.out.println("вес: " + jaeger1.getWeight());
        System.out.println("скорость: " + jaeger1.getSpeed());
        System.out.println("прочность: " + jaeger1.getStrength());
        System.out.println("броня: " + jaeger1.getArmor());
        System.out.println("Возможности: " + jaeger1.drift() + ", " + jaeger1.move() + ", " +
                           jaeger1.scanKaiju() + ", " + jaeger1.useVortexCannon() + ".");

        Jaeger jaeger2 = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 85.3f, 2.4f, 3, 10, 10);
        System.out.println("\nВторой Jaeger: ");
        System.out.println("название модели: " + jaeger2.getModelName());
        System.out.println("модель: " + jaeger2.getMark());
        System.out.println("страна: " + jaeger2.getOrigin());
        System.out.println("высота: " + jaeger2.getHeight());
        System.out.println("вес: " + jaeger2.getWeight());
        System.out.println("скорость: " + jaeger2.getSpeed());
        System.out.println("прочность: " + jaeger2.getStrength());
        System.out.println("броня: " + jaeger2.getArmor());
        System.out.println("Возможности: " + jaeger2.drift() + ", " + jaeger2.move() + ", " +
                            jaeger2.scanKaiju() + ", " + jaeger2.useVortexCannon() + ".");
    }
}