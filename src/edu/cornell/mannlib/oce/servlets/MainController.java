/* $This file is distributed under the terms of the license in /doc/license.txt$ */

package edu.cornell.mannlib.oce.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * TODO
 */
public class MainController extends HttpServlet {
	private static final Log log = LogFactory.getLog(MainController.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		log.warn("MainController.doGet() not implemented.");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>MainController.doGet() not implemented.</h1>");
		writer.println("<h2>Logged in as " + req.getHeader("LOGIN_ID")
				+ ".</h2>");
	}

}
