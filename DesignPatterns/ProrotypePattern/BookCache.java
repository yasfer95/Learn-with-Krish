package com.company;
import java.util.Hashtable;

public class BookCache
{
    private static Hashtable<String, Book> bookMap  = new Hashtable<String, Book>();
    public static Book getBook(String bookId)
    {
        Book cachedBook = bookMap.get(bookId);
        return (Book) cachedBook.clone();
    }
    public static void loadCache()
    {
        Adventure adventure = new Adventure();
        adventure.setId("1");
        bookMap.put(adventure.getId(),adventure);

        Fantasy fantasy = new Fantasy();
        fantasy.setId("2");
        bookMap.put(fantasy.getId(),fantasy);

        Horror horror = new Horror();
        horror.setId("3");
        bookMap.put(horror.getId(),horror);

        Fiction fiction = new Fiction();
        fiction.setId("4");
        bookMap.put(fiction.getId(),fiction);
    }
}