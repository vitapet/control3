

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control2.service.App;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		Writer writer = response.getWriter();
//		writer.write(App.getHelloFromService()+"Hello from Servlet! ");
//		writer.close();
		String message = App.getHelloFromService()+"Hello from Web! Yeah!";
		request.setAttribute("message", message);
		request.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(request, response);
	}

}
