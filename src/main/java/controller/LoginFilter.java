package controller;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebFilter({"/listPatients","/add","/update","/delete","/addMed","/deleteMed","/ListMeds","/updateMed"})
public class LoginFilter implements Filter{
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        HttpSession session = request.getSession(false);
        
        if (session == null)  {
            response.sendRedirect(request.getContextPath()); // No logged-in user found, so redirect to login page.
        }else if(session.getAttribute("isconnected") =="false") {
        	response.sendRedirect(request.getContextPath());
        }
        
        else {
            chain.doFilter(req, res); // Logged-in user found, so just continue request.
        }
	}
	
	@Override
	public void destroy() {
	}
	

}
