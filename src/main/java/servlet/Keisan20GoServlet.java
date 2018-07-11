package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Calculation;

/**
 * Servlet implementation class Keisan20GoServlet
 */
@WebServlet("/Keisan20GoServlet")
public class Keisan20GoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Calculation cal = new Calculation();
	int x,y,a,count = 0,num=0;
	Object aa;
	String s;
	int[] ans = new int[25];
	int anscount=0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Keisan20GoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		x=(int)(Math.random()*10)+1;
		y=(int)(Math.random()*10)+1;
		a=(int)(Math.random()*10);
		if(a<4) s="+";
		else if(a<6) s="-";
		else s="*";
		request.setAttribute("x", x);
		request.setAttribute("y", y);
		request.setAttribute("a", a);
		request.setAttribute("s",s);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/keisan20go.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int aa1 = cal.Calc(x,y,s);
		String aa2 = String.valueOf(aa1);
		//System.out.println(aa);
		String t=request.getParameter("text");
		
		System.out.println(t);
		if(aa2.equals(t)) anscount++;
	
		count++;
		System.out.println(count);
		System.out.println(anscount);
		if(count<20) {
			doGet(request,response);
		}
	    /*for(int i=0; i<20; i++) {
				if(ans[i]==1) {
					num++;
					System.out.println(num);
				}
			}*/
		request.setAttribute("num", anscount);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/keisan20result.jsp");
		dispatcher.forward(request, response);
		
	}

}
