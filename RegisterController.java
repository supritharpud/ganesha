package com.mccoy.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mccoy.model.Customer;
import com.mccoy.service.Registerservice;
@WebServlet("/register")
public class RegisterController extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	super.doPost(req, resp);
	PrintWriter out=resp.getWriter();
	String name=req.getParameter("name");
	String accountno=req.getParameter("no");
	int accno=Integer.parseInt(accountno);
	String accountbal=req.getParameter("bal");
	double accbal=Double.parseDouble(accountbal);
	String id=req.getParameter("userid");
	int userid=Integer.parseInt(id);
	String password=req.getParameter("pw");
	Customer custm=new Customer();
	custm.setUserid(userid);
	custm.setName(name);
	custm.setAccno(accno);
	custm.setAccbal(accbal);
	custm.setPassword(password);
	try {	
		 Registerservice registerservice=new Registerservice();
		 boolean result = registerservice.register(custm);		
		 out.println("<html>");
		 out.println("<head>");		
		 out.println("<title>Registration Successful</title>");		
		 out.println("</head>");
		 out.println("<body>");
		 out.println("<center>");
		 if(result){
			 out.println("<h1>Thanks for Registering with us :</h1>");
			 out.println("To login with new UserId and Password<a href=login.jsp>Click here</a>");
		 }else{
			 out.println("<h1>Registration Failed</h1>");
			 out.println("To try again<a href=register.jsp>Click here</a>");
		 }
		 out.println("</center>");
		 out.println("</body>");
		 out.println("</html>");
	 } finally {		
		 out.close();
	 }
	
}
}
