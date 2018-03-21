import java.io.*; 
import javax.servlet.*;
import javax.servlet.http.*;

public class InsertProductServlet extends HttpServlet {
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
		  
	
	response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
	
	HttpSession session = request.getSession();
   
	String fname=(String)session.getAttribute("fname");
	String type = (String)session.getAttribute("type");
	
	 // Display the Header section	
	
    out.println("<html>");
		out.println("<head>");
			out.println("<meta http-equiv='Content-Type' content='text/html; charset=utf-8' content='no-cache'/>");
			out.println("<title>Smart Portables</title>");
			out.println("<link rel='shortcut icon' href='cart/icon.jpg'/>");
			out.println("<link rel='stylesheet' href='styles.css' type='text/css' />");
		out.println("</head>");
		out.println("<body>");
			out.println("<div id='container'>");
			out.println("<header>");
			out.println("<h1><a href='Home'>Smart <span> Portables</span></a></h1>");
			
			if(fname!=null)
			{
				out.println("<h3 align='right' color:'black'>Welcome, "+fname+"</h3>");
				out.println("<div align='right'>");
				out.println("<a href='SignOut'>Sign out</a>");
				out.println("</div>");
			}
			
			
			out.println("</header>");
			out.println("<nav>");
			out.println("<ul>");
			out.println("<li  class='start selected'><a id='home' href='Home'>Home</a></li>");
			out.println("<li  class=''><a href='ProductServlet?param1=smartwatches'>Smart Watches</a></li>");
			out.println("<li  class=''><a href='ProductServlet?param1=speakers'>Speakers</a></li>");
			out.println("<li  class=''><a href='ProductServlet?param1=headphones'>Headphones</a></li>");
			out.println("<li  class=''><a href='ProductServlet?param1=phones'>Phones</a></li>");
			out.println("<li  class=''><a href='ProductServlet?param1=laptops'>Laptops</a></li>");
			out.println("<li  class=''><a href='ProductServlet?param1=externalstorages'>External Storage</a></li>");
			//out.println("<li  class=''><a href='ProductServlet?param1=accessories'>Accessories</a></li>");
			
	
	if (fname == null)
			{
			out.println("<li class=''><a href='Registration'>Register</a></li>");
			out.println("<li class='' ><a href='Login'>Sign in</a></li>");
			} 
			out.println("<li class='' ><a href='ViewOrdersServlet'>View Orders</a></li>");
			
			
				//Data analytics links only accessible to StoreManager
				if(fname!=null && type.equals("StoreManager"))
			{
				out.println("<li class='' ><a href='DataAnalyticsServlet'>Data Analytics</a></li>");
				out.println("<li class='' ><a href='InsertProductServlet'>Add New Product</a></li>");
				
			}
			
			out.println("<div align='right'>");
			out.println("<form action='CartServlet'>");
			out.println("<button type='submit' style='background-color:transparent'><img src='images/cart.png' width = '60px' height = '63px'></button>");
			out.println("</form>");
			out.println("</ul>");
			out.println("</nav>");
			out.println("</div>");
			
	//Displaying the Content section
			
	out.println("<img class='header-image' src='images/combined.jpg' width = '100%' height = '100%' alt='Index Page Image' />");
	out.println("<div id='body'>");
	out.println("<section id='content'>");

	
	out.println("<h3>Enter Product Details:</h3>");
	
	out.println("<form action='StoreNewProduct'>");
	out.println("<table>");
	out.println("<tr>");
	out.println("<td>");
	out.println("Product Name :");
	out.println("<input type='text' placeholder ='Product name'  name='productname'  required/></td>");
	out.println("</tr>");
	
	out.println("<tr>");
	out.println("<td>");
	out.println("Price  :");
	out.println("<input type='text' name='price' required/></td>");
	out.println("</tr>");
	out.println("<tr>");
	
	out.println("<tr>");
	out.println("<td>");
	out.println("Reatiler  :");
	out.println("<input type='text' name='retailer' required/></td>");
	out.println("</tr>");
	out.println("<tr>");
	
	out.println("<tr>");
	out.println("<td>");
	out.println("Retailer City  :");
	out.println("<input type='text' name='retailercity' required/></td>");
	out.println("</tr>");
	out.println("<tr>");
	
	out.println("<tr>");
	out.println("<td>");
	out.println("Retailer Zipcode  :");
	out.println("<input type='text' name='retailerzipcode' required/></td>");
	out.println("</tr>");
	out.println("<tr>");
	
	out.println("<tr>");
	out.println("<td>");
	out.println("Retailer state  :");
	out.println("<input type='text' name='retailerstate' required/></td>");
	out.println("</tr>");
	out.println("<tr>");
	
	out.println("<tr>");
	out.println("<td>");
	out.println("Manufacturer  :");
	out.println("<input type='text' name='manufacturer' required/></td>");
	out.println("</tr>");
	out.println("<tr>");
	
	out.println("<tr>");
	out.println("<td>");
	out.println("Condition  :");
	out.println("<input type='text' name='cond' required/></td>");
	out.println("</tr>");
	out.println("<tr>");
	
	out.println("<tr>");
	out.println("<td>");
	out.println("Discount  :");
	out.println("<input type='text' name='discount' required/></td>");
	out.println("</tr>");
	out.println("<tr>");
	
	out.println("<tr>");
	out.println("<td>");
	out.println("Rebates  :");
	out.println("<input type='text' name='rebates' required/></td>");
	out.println("</tr>");
	out.println("<tr>");
	
	
	out.println("<tr>");
	out.println("<td>");
	out.println("Product Type  :");
	out.println("<input type='radio' name='prodtype' value='Product' required/> Product");
	out.println("<input type='radio' name='prodtype' value='Accessory' required/> Accessory");
	out.println("</tr>");
	out.println("<tr>");
	
	out.println("<tr>");
	out.println("<td>");
	out.println("Select Product category   :");
	out.println("<br>");
	out.println("<input type='radio' name='prodcat' value='smartwatches' required/> SmartWatches");
	out.println("<br>");
	out.println("<input type='radio' name='prodcat' value='speakers' required/> Speakers");
	out.println("<br>");
	out.println("<input type='radio' name='prodcat' value='headphones' required/> Headphones");
	out.println("<br>");
	out.println("<input type='radio' name='prodcat' value='phones' required/> Phones");
	out.println("<br>");
	out.println("<input type='radio' name='prodcat' value='laptops' required/> Laptops");
	out.println("<br>");
	out.println("<input type='radio' name='prodcat' value='externalstorages' required/> External Storages");
	out.println("<br>");
	out.println("<input type='radio' name='prodcat' value='accessory' required/> Accessory");
	out.println("<br>");
	out.println("</tr>");

	
	
	out.println("<tr><td ><input type='submit' value='Add Product'></td></tr>");
	out.println("</table>");
	out.println("</form>");

	out.println("</section>");
	out.println("<aside class='sidebar'>");
	out.println("<ul>");	
	out.println("<li>");
	out.println("<h4>Products</h4>");
	out.println("<ul>");
	
	// Left Navigation 
	out.println("<li><a href='TrendingServlet'>Trending</a></li>");

	out.println("<li><a href='ProductServlet?param1=smartwatches'>Smart Watches</a></li>");
	out.println("<li><a href='ProductServlet?param1=speakers'>Speakers</a></li>");
	out.println("<li><a href='ProductServlet?param1=headphones'>Headphones</a></li>");
	out.println("<li><a href='ProductServlet?param1=phones'>Phones</a></li>");
	out.println("<li><a href='ProductServlet?param1=laptops'>Laptop</a></li>");
	out.println("<li><a href='ProductServlet?param1=externalstorages'>External Storage</a></li>");
	out.println("<li><a href='ProductServlet?param1=accessories'>Accessories</a></li>");
	out.println("</ul>");
	out.println("</li>");	
	out.println("<li>");
	out.println("<h4>About us</h4>");
	out.println("<ul>");
	out.println("<li class='text'>");
	out.println("<p style='margin: 0;'>This is a sample website created to demonstrate a standard enterprise web page.</p>");
	out.println(" </li>");
	out.println("</ul>");
	out.println("</li>");	
	out.println("<li>");
	out.println("<h4>Search site</h4>");
	out.println("<ul>");
	out.println("<li class='text'>");
	out.println("<form method='get' class='searchform' action='#'>");
	out.println("<p>");
	out.println("<input type='text' size='25' value='' name='s' class='s' />");
	out.println("</p>");	
	out.println("</form></li></ul></li>");	     	
	out.println("<li>");	
	out.println("<h4>Helpful Links</h4>");	
	out.println("<ul>");	
	out.println("<li><a href='http://www.cnn.com/' title='premium templates'>See what's happening around you</a></li>");	
	out.println("<li><a href='https://travel.usnews.com/rankings/worlds-best-vacations/' title='web hosting'>Get some ideas on your next trip?</a></li>");	
	out.println("</ul></li></ul></aside>");	
	out.println("<div class='clear'></div>");
	out.println("</div>");	
	
	//Footer
	out.println("<footer>");	
	out.println("<div class='footer-content'>");	
	out.println("<div class='clear'></div>");	
	out.println("</div>");	
	out.println("<div class='footer-bottom'>");	
	out.println("<p>Smart Portables - Enterprise Web Application </p>");	
	out.println("</div>");	
	out.println("</footer>");	
	out.println("</div>");	
			
	out.println("</body>");
	out.println("</html>");
	
	}
	
	}