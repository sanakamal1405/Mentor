
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.*;


@WebServlet("/SiteController")
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger l=Logger.getLogger(SiteController.class);
	static {
		try {
			HTMLLayout layout=new HTMLLayout();
			FileAppender appender=new FileAppender(layout,"C:/Trash/log.html",true);
			l.addAppender(appender);
			
		}
		catch(Exception e)
		{
			l.error("Problem while setting up log4j");
			e.printStackTrace();
		}
	}
       
    
    public SiteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username.equals("sa") && password.contentEquals("sa"))
		{
			l.info("Entered sigin after correct credentials");
			response.sendRedirect("uploadfile.jsp");
		}
		else {
			l.info("Returning to sign in page because of wrong credentials");
			response.sendRedirect("login.jsp");
		}
	}

}

