<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

<head>
  <title>DSN Project</title>
  <meta name="description" content="free website template" />
  <meta name="keywords" content="enter your keywords here" />
  <meta http-equiv="content-type" content="text/html; charset=iso-8859-1" />
 
 <link href="resources/css/style.css" rel="stylesheet" type="text/css"/ >  
 <script type="text/javascript" src="resources/js/jquery.min.js"></script>
  <script type="text/javascript" src="resources/js/image_slide.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<link href="${style}" rel="stylesheet" />
<script src="${jquery.min}"></script>
<script src="${image_slide}"></script>



  
</head>

<body>
  <div id="main">
    <div id="header">
      <div id="banner">
	    <a href="#">Welcome in Private Social Network </a>
	  </div><!--end banner-->
   <div id="menubar">
   <ul id="menu">
  
            <form method="post" name="login.js">
           
           <li>Email: <input type="text" name="nome"></li>
          
          
            <li> Pw: <input type="text" name="nome"></li>
           
            <li> <input type="button" value="Login" onClick="Login()"></input></li>
         
            </form>
            
            </ul>
            </div><!--end menubar-->
      
    </div><!--end header-->
    
<div id="site_content">
       <ul class="slideshow">
        <li class="show"><img width="918" height="350" src="resources/images/home_1.jpg" alt="&quot;Enter your caption here&quot;" /></li>
        <li><img width="918" height="350" src="resources/images/home_2.jpg" alt="&quot;Enter your caption here&quot;" /></li>
      </ul>          
	  <div id="content">
        <div class="content_item">
        <table>
      <c:forEach var="user" items="${userList}">  
   <tr>
     <td>${user.name_user}</td>  
     <td>${user.surname}</td>  
    
    </tr>  
   </c:forEach>  
  
  </table>  
  
	
  </div><!--end main-->
  
  <div id="footer">
    <div id="footer_container">
	 	  
	  </div><!--end footer_container_box1-->      
	 
	 
    </div>
  </div><!--end footer-->
</body>
</html>
