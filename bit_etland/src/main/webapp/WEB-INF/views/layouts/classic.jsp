<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
  <body>
        <table style="width: 100%;">
      <tr>
        <td>
          <tiles:insertAttribute name="top" />
        </td>
      </tr>
      <tr>
 
        <td>
          <tiles:insertAttribute name="main" />
        </td>
      </tr>
      <tr>
        <td>
          <tiles:insertAttribute name="bottom" />
        </td>
      </tr>
    </table>
  </body>
</html>