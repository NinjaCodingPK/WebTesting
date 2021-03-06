/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wookie.epamwebtesting.controllers;

import com.wookie.epamwebtesting.controllers.commands.Command;
import com.wookie.epamwebtesting.controllers.commands.CommandList;
import com.wookie.epamwebtesting.controllers.constants.Constants;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Main servlet. Handling all requests form web pages and sends them to propper
 * command.
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String commandName = request.getParameter(Constants.PROPERTY_COMMAND);
        String goTo;
        if (commandName != null) {
            Command command = CommandList.valueOf(commandName).getCommand();

            //try {
                goTo = command.execute(request, response);
            //} catch (RuntimeException ex) {
              //  goTo = Constants.ERROR_PAGE;
            //}
        } else {
            goTo = Constants.LOGIN_PAGE;
        }
        if (goTo != null) {
            request.getRequestDispatcher(goTo).forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doGet(request, response);
    }
}
