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
  
            <form method="post" action="login" modelAttribute="user" >
           
           <li>Email: <input type="text" name="email"></li>
          
          
            <li> Pw: <input type="text" name="pw"></li>
           
            <li> <input type="submit" value="Login"></input></li>
         
            </form>
            
            </ul>
            </div><!--end menubar-->
      
    </div><!--end header-->
    
<div id="site_content">
       <ul class="slideshow">
        <li class="show"><img width="918" height="350" src="resources/images/home_1.jpg"  /></li>
        <li><img width="918" height="350" src="resources/images/home_2.jpg"  /></li>
      </ul>          
	  <div id="content">
        <div class="content_item">
        ${message}
        <h2>Registration: </h2>
          <form method="post" action="insert" modelAttribute="user">
            <table>
           <tr><td><h3>Email:</h3></td>
           <td><h3>Photo: </h3></td>
           </tr>
           <tr><td> <input type="text" name="email"></td>
           <td> <input name="photo" type="file" id="photo"></td>
           </tr>
          
           <tr>
           <td><h3>Name: </h3></td>
           <td><h3>Surname:</h3></td>
           </tr>
           <tr><td><input type="text" name="name_user"></td>
           
            <td> <input type="text" name="surname"></td>
           </tr>
           <tr>
           <td><h3>Birth day (gg/mm/aaaa):</h3></td>
           <td><h3>City:</td></tr>
           <tr>
            <td> <input type="text" name="birth_day"></td>
           
             <td><input type="text" name="city"></td>
           </tr>
           <tr>
           <td><h3>Password:</h3></td>
           <td><h3>Confirm Password:</td>
           </tr>
           <tr>
           <td> <input type="text" name="pw"></td>
           
            <td> <input type="text" name="Cpw"></td>
           </tr>
           <tr>
           <span id="confirmMessage" class="confirmMessage" ></span>
           </tr>
           <tr>
              <td ><h3><input type="submit" value="Registrati"></h3></input>
           	<td><h3><input type="submit" value="Clear"></h3></input></td>
           </tr>
           </table>
           
          
          
            </form>
      
            <p>&nbsp;</p>
		</div><!--end sidebar-->
      </div><!--end content-->
      
	
  </div><!--end main-->
  
  <div id="footer">
    <div id="footer_container">
	 	  
	  </div><!--end footer_container_box1-->      
	 
	 
    </div>
  </div><!--end footer-->
</body>
</html>
