<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>File Upload</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="assets/img/favicon.png" rel="icon">
  <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Roboto:100,300,400,500,700|Philosopher:400,400i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="assets/vendor/aos/aos.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
  <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="assets/css/style.css" rel="stylesheet">

</head>

<body>

<header id="header" class="header fixed-top d-flex align-items-center">
    <div class="container d-flex align-items-center justify-content-between">

      <div id="logo">
        <h1><a href="index.jsp"><span>M</span>entor</a></h1>
        
      </div>

      <nav id="navbar" class="navbar">
        <ul>
          <li><a class="nav-link scrollto " href="index.jsp">Log Out</a></li>
          <li><a class="nav-link scrollto" href="about.jsp">About</a></li>
          <li><a class="nav-link scrollto" href="login.jsp">Log in</a></li>
          <li><a class="nav-link scrollto" href="#view">View</a></li>
        </ul>
        <i class="bi bi-list mobile-nav-toggle"></i>
      </nav>

    </div>
  </header>
  </br>
    </br>
      </br>
        </br>
          </br>
            </br>
  

<center><form action="<%= request.getContextPath() %>/upload" method="post" enctype="multipart/form-data">
 Select File <input type= "file" name="files" multiple/> <br/>
<input type="submit" value="upload"/>
</form></center>

<center><form action="<%= request.getContextPath() %>/upload" method="get">
Marks <input type="number" name ="marks" /> <br/> 
Subject <input type="text" name ="sub" /> <br/> 
Date of Submission <input type="text" name ="dos" /> <br/> 
Roll no <input type="number" name ="roll" /> <br/>
<input type="submit" value="Submit"/>
</form> </center>

</br>
  </br>
    </br>
      </br>
        </br>
          </br>
<footer class="footer">
    


    <div class="copyrights">
      <div class="container">
        <p>&copy; Copyrights Mentor. All rights reserved.</p>
        <div class="credits">

          Designed by <a href="#">Sana Kamal</a>
        </div>
      </div>
    </div>

  </footer><!-- End  Footer -->

  <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

  <!-- Vendor JS Files -->
  <script src="assets/vendor/aos/aos.js"></script>
  <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
  <script src="assets/vendor/php-email-form/validate.js"></script>
  <script src="assets/vendor/swiper/swiper-bundle.min.js"></script>

  <!-- Template Main JS File -->
  <script src="assets/js/main.js"></script>

</body>
</html>