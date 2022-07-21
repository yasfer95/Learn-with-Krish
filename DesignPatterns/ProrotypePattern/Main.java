package com.company;

public class Main
{
        public static void main(String[] args)
        {
            BookCache.loadCache();

            Book clonedBook = (Book) BookCache.getBook("1");
            System.out.println(clonedBook.getCategory());

            Book clonedBook2 = (Book) BookCache.getBook("2");
            System.out.println(clonedBook2.getCategory());

            Book clonedBook3 = (Book) BookCache.getBook("3");
            System.out.println(clonedBook3.getCategory());

            Book clonedBook4 = (Book) BookCache.getBook("4");
            System.out.println(clonedBook4.getCategory());
        }
}
