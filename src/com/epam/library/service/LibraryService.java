package com.epam.library.service;

import com.epam.library.domain.Book;
import com.epam.library.domain.Employee;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by alesnax on 15.03.2017.
 */
public interface LibraryService {

    boolean createNewBook(Book book);
    boolean deleteBookById(int id);
    boolean generateEmployeeBookList() throws ServiceException;
    boolean renameBookById(String oldTitle, String newTitle) throws ServiceException;
    Book showBookById(int id);
    LinkedHashMap<String, Integer> reportAboutGoodReaders() throws ServiceException;
    LinkedHashMap<Employee, Integer> reportAboutLittleReaders() throws ServiceException;

}
