package com.yedam.yum;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/DelScheduleServlet", "/fullcalendar-5.3.2/examples/DelScheduleServlet" })
public class DelScheduleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public DelScheduleServlet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String title = request.getParameter("title");
		String startDate = request.getParameter("start");
		EmpDAO dao = new EmpDAO();
		dao.deleteSchedule(title, startDate);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		doGet(request, response);
	}

}
