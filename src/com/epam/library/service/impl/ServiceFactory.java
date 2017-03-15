package com.epam.library.service.impl;

import com.epam.library.service.LibraryService;

/**
 * Created by alesnax on 15.03.2017.
 */
public class ServiceFactory {
    private static final ServiceFactory INSTANCE = new ServiceFactory();



    private final LibraryService libraryService = new LibraryServiceImpl();

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return INSTANCE;
    }


    public LibraryService getLibraryService() {
        return libraryService;
    }
}
