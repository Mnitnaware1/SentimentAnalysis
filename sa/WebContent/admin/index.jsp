<!DOCTYPE html>
<html lang="en">
    <%@include  file="header.jsp" %> 

    <body class="no-skin">
        <div id="navbar" class="navbar navbar-default ace-save-state">
            <%@include file="topmenu.jsp" %>
        </div>

        <div class="main-container ace-save-state" id="main-container">
            <script type="text/javascript">
                try {
                    ace.settings.loadState('main-container')
                } catch (e) {
                }
            </script>

            <div id="sidebar" class="sidebar responsive ace-save-state">
                <%@include file="leftmenu.jsp" %>
            </div>

            <div class="main-content">
                <%
                   Object object =  request.getParameter("page");
                   String includepage = object == null ? "" : object.toString();
                %>
                
                <%  if (includepage.equals("add_category")) { %>  <%@include file="category/add_category.jsp" %> <% }  %>
            	<%  if (includepage.equals("view_category")) { %>  <%@include file="category/view_category.jsp" %> <% }  %>
            	
            	<%  if (includepage.equals("add_product")) { %>  <%@include file="product/add_product.jsp" %> <% }  %>
            	<%  if (includepage.equals("view_product")) { %>  <%@include file="product/view_product.jsp" %> <% }  %>
            	
            	<%  if (includepage.equals("add_reviewtype")) { %>  <%@include file="reviewtype/add_reviewtype.jsp" %> <% }  %>
            	<%  if (includepage.equals("view_reviewtype")) { %>  <%@include file="reviewtype/view_reviewtype.jsp" %> <% }  %>
            	
            	<%  if (includepage.equals("add_review")) { %>  <%@include file="review/add_review.jsp" %> <% }  %>
            	<%  if (includepage.equals("view_review")) { %>  <%@include file="review/view_review.jsp" %> <% }  %>
            		
            	
            	
            	<%  if (includepage.equals("default") || includepage.equals("") ) { %>  <%@include file="home.jsp" %> <% }%>
                
            </div><!-- /.main-content -->

            <div class="footer">
                <%@include file="footer.jsp" %>
            </div>

            <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
                <i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
            </a>
        </div><!-- /.main-container -->

       
    </body>
</html>
