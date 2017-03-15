package com.epam.library.command.impl;

import com.epam.library.command.Command;
import com.epam.library.domain.Request;
import com.epam.library.domain.Response;
import com.epam.library.service.LibraryService;
import com.epam.library.service.ServiceException;
import com.epam.library.service.impl.ServiceFactory;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by alesnax on 15.03.2017.
 */
public class ReportAboutGoodReaders implements Command {
    private static Logger logger = LogManager.getLogger(ReportAboutGoodReaders.class);

    @Override
    public Response execute(Request request) {
        ServiceFactory factory = ServiceFactory.getInstance();
        LibraryService service = factory.getLibraryService();

        LinkedHashMap<String, Integer> goodReaders = new LinkedHashMap<>();
        try {
            goodReaders = service.reportAboutGoodReaders();
        } catch (ServiceException e) {
            logger.log(Level.ERROR, e);
        }
        Response response = new Response();
        response.setVeryGoodReaders(goodReaders);

        return response;
    }
}
