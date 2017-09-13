<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%

    Map<String,String> menuMap = new HashMap<String,String>();
    menuMap.put("", "home.jsp");
    menuMap.put("home", "home.jsp");
    menuMap.put("add_category", "category/add_category.jsp");
    menuMap.put("view_category", "category/view_category.jsp");
    
    menuMap.put("add_product", "product/add_product.jsp");
    menuMap.put("view_product", "product/view_product.jsp");
    
    menuMap.put("add_review_type", "reviewtype/add_review_type.jsp");
    menuMap.put("view_review_type", "reviewtype/view_review_type.jsp");
    
    menuMap.put("add_review", "review/add_category.jsp");
    menuMap.put("view_review", "review/view_category.jsp");

%>