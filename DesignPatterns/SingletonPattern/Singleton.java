package com.company;

public class Singleton
{
        private static Singleton instance = new Singleton();

        private Singleton()
        {

        }
        public static Singleton getInstance()
        {
            return instance;
        }

        public void Display()
        {
            System.out.println("Single object");
        }
}
