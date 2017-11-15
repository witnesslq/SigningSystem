<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>用户管理</title>
    <%@ include file="/common/header.jsp"%>
    <script type="text/javascript">
      	//全选、全反选
		function doSelectAll(){
			$("input[name=selectedRow]").prop("checked", $("#selAll").is(":checked"));		
		}
		
		function doAdd() {
			document.forms[0].action = "${basePath}customer/customer_addUI.action";
			document.forms[0].submit();
		}
		function doEdit(id) {
			document.forms[0].action = "${basePath}customer/customer_editUI.action?school.s_Id="+id;
			document.forms[0].submit();
		}
		function doDelete(id) {
			document.forms[0].action = "${basePath}customer/customer_delete.action?school.s_Id="+id;
			document.forms[0].submit();
		}
		function doDeleteAll() {
			document.forms[0].action = "${basePath}customer/customer_deleteAll.action";
			document.forms[0].submit();
		}
		function doExportExcel() {
			window.open("${basePath}nsfw/user_exportExcel.action");
		}
		function doImportExcel() {
			document.forms[0].action = "${basePath}nsfw/user_importExcel.action";
			document.forms[0].submit();
		}
		//其他模块只要更改这个url即可！以达到抽取的目的
		var list_url = "${basePath}customer/customer_listUI.action";
		
		function doSearch() {
			//BUG
			$("#pageNo").val(1);
			document.forms[0].action = list_url;
			document.forms[0].submit();
		}
		
		
		//清空输入框
		function clearInput() {
			var input = document.getElementById("searchId");
			input.value = "";
		}
		
		
    </script>
    <style type="text/css">
    	#searchId {
    		color: gray;
    	}
    </style>
</head>
<body class="rightBody">
<form name="form1" action="" method="post" enctype="multipart/form-data">
    <div class="p_d_1">
        <div class="p_d_1_1">
            <div class="content_info">
                <div class="c_crumbs"><div><b></b><strong>用户管理</strong></div> </div>
                <div class="search_art">
                	<li>
                                          用户名：
                       <c:choose>
	                       <c:when test="${empty school.s_Name}">
	                       		<input id="searchId" type="text" name="school.s_Name" size="20px" value="请输入学校名称" onclick="clearInput()">
	                       	</c:when>
	                       	<c:otherwise>
	                       		<input id="searchId" type="text" name="school.s_Name" size="20px" value="${school.s_Name}" onclick="clearInput()">
	                       	</c:otherwise>
                       	</c:choose>
                    </li>
                    <li><input type="button" class="s_button" value="搜 索" onclick="doSearch()"/></li>
                    <li style="float:right;">
                        <input type="button" value="新增" class="s_button" onclick="doAdd()"/>&nbsp;
                        <input type="button" value="删除" class="s_button" onclick="doDeleteAll()"/>&nbsp;
                    </li>
                </div>

                <div class="t_list" style="margin:0px; border:0px none;">
                    <table width="100%" border="0">
                        <tr class="t_tit">
                            <td width="50" align="center"><input type="checkbox" id="selAll" onclick="doSelectAll()" /></td>
                            <td width="120" align="center">用户名</td>
                            <td width="120" align="center">密码</td>
                            <td width="100" align="center">所在城市</td>
                            <td width="150" align="center">学校主管部门</td>
                            <td width="100" align="center">操作</td>
                         </tr> 
                             <!-- ===================================数据循环区域============================================ -->
                            <c:forEach items="${pageResult.items}" var="school">
                            <tr> 
                                <td align="center"><input type="checkbox" name="selectedRow" value="${school.s_Id}"/></td>
                                <td align="center">
	                                ${school.s_Name}
                                </td>
                                <td align="center">
	                                ${school.s_Password}
                                </td>
                                <td align="center">
                                	${school.s_City}
                                </td>
                                <td align="center">
                                	${school.s_Dept}
                                </td>
                                <td align="center">
                                    <a href="javascript:doEdit('${school.s_Id}')">编辑</a>
                                    <a href="javascript:doDelete('${school.s_Id}')">删除</a>
                                </td>
                           </tr>
                           </c:forEach>
                           
                           <!-- ===================================数据循环区域============================================ -->
                           
                    </table>
                </div>
            </div>
        	<div class="c_pate" style="margin-top: 5px;">
					<table width="100%" class="pageDown" border="0" cellspacing="0"
						cellpadding="0">
						<tr>
							<td align="right">总共${pageResult.totalCount }条记录，当前第 ${pageResult.pageNo }页
							，共 ${pageResult.totalPageCount }页 
							<c:if test="${pageResult.pageNo>1}">
							&nbsp;&nbsp; <a	href="javascript:doGoPage('${pageResult.pageNo - 1}')">上一页</a>
							</c:if>
							<c:if test="${pageResult.pageNo<pageResult.totalPageCount}">
							&nbsp;&nbsp;<a href="javascript:doGoPage('${pageResult.pageNo + 1}')">下一页</a> 
							</c:if>
							到
							&nbsp;<input id="pageNo" name="pageNo" type="text" style="width: 30px;" onkeypress="if(event.keyCode == 13){doGoPage(this.value);}" min="1" max="" value="${pageResult.pageNo}"/>
							&nbsp;&nbsp;</td>
						</tr>
					</table>
				</div>
			<script type="text/javascript">
				function doGoPage(pageNo){
					document.getElementById("pageNo").value = pageNo;
					document.forms[0].action = list_url;
					document.forms[0].submit();
				}
			</script>
        </div>
    </div>
</form>

</body>
</html>