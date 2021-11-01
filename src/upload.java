

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;





@WebServlet("/upload")
public class upload extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name="jdbc/project")
	DataSource dataSource;
	
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Connection con =null;
			PreparedStatement statement=null;
			
			try {
				con= dataSource.getConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		String m=request.getParameter("marks");
		String sub=request.getParameter("sub");
		String date=request.getParameter("dos");
		String r=request.getParameter("roll");
		int marks = Integer.parseInt(m);
		int roll= Integer.parseInt(r);
		String query = "insert into student (marks,sub,dos,roll) values (?,?,?,?)";
		try {
			statement = con.prepareStatement(query);
			statement.setInt(1, marks);
			statement.setString(2, sub);
			statement.setString(3, date);
			statement.setInt(4, roll);
			statement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("uploadfile.jsp").forward(request, response);
		
	}

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletFileUpload upload = new ServletFileUpload(new DiskFileItemFactory());
		try {
			List<org.apache.commons.fileupload.FileItem> images = upload.parseRequest(request);
			for(org.apache.commons.fileupload.FileItem image: images)
			{
				String name = image.getName();
				
				try {name=name.substring(name.lastIndexOf("\\")+1);}catch(Exception e) {}
				System.out.println(name);
				File file = new File("C:/Images/"+name);
				image.write(file);
			}
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("uploadfile.jsp").forward(request, response);
		
		
		
}
}
