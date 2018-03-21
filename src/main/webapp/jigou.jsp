<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<title>机构信息页</title>
<div>
	<table>
		<tr>
			<th>机构名称</th>
			<th>地址</th>
			<th>使用面积</th>
			<th>设置床位(张)</th>
			<th>收费标准(元/月)</th>
			<th>操作</th>
		</tr>
		<c:forEach items="jiGous" var="jg">
		<tr>
			<td>${jg.name}</td>
			<td>${jg.address}</td>
			<td>${jg.usedmianji}</td>
			<td>${jg.chuangwei}</td>
			<td>${jg.shoufei}</td>
			<td>
				<a href="<%=request.getContextPath()%>/jigou_edit.jsp" >添加</a>/
				<a href="<%=request.getContextPath()%>/jigou_edit.jsp" >修改</a>/
				<a href="#" onclick="deleteJiGou()">刪除</a>
			</td>
		</tr>
		</c:forEach>
	</table>
</div>
<script type="text/javascript">
	function editJiGou(id){
		if(confirm("你确定要删除么?")){
			$.ajax({
				url:"<%=request.getContextPath()%>/jigou.html?act=delect",
				data:id=#{id},
				method:"post"
			})
		}
	}
</script>
</body>
</html>
