package com.epam.library.controller;

import com.epam.library.client.CommandHelper;
import com.epam.library.client.CommandName;
import com.epam.library.command.Command;
import com.epam.library.domain.Request;
import com.epam.library.domain.Response;

/**
 * @author Aliaksandr Nakhankou
 */
public class Controller {

    public Controller(){
    }

    public Response processRequest(Request request) {
        CommandName commandName = request.getCommandName();
        Command command = CommandHelper.getInstance().getCommand(commandName);
        return command.execute(request);
    }
}
