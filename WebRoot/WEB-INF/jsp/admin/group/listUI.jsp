<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>分组管理</title>
    <%@ include file="/common/header.jsp"%>
    <script type="text/javascript">
      	//全选、全反选
		function doSelectAll(){
			$("input[name=selectedRow]").prop("checked", $("#selAll").is(":checked"));		
		}
		
		//其他模块只要更改这个url即可！以达到抽取的目的
		var list_url = "${basePath}group/group_listUI.action";
		
		function doSearch() {
			//BUG
			$("#pageNo").val(1);
			document.forms[0].action = list_url;
			document.forms[0].submit();
		}
		//导出四表
		function doEmportExcel(num) {
		var num;
		if(num=='one'){
		document.forms[0].action = "${basePath}group/group_doEmportXlsOne.action";
		}else if(num=='two'){
	    document.forms[0].action = "${basePath}group/group_doEmportXlsTwo.action";
		}else if(num=='three'){
		document.forms[0].action = "${basePath}group/group_doEmportXlsThree.action";
		}else if(num=='four'){
		document.forms[0].action = "${basePath}group/group_doEmportXlsFour.action";
		}else if(num=='five'){
		document.forms[0].action = "${basePath}group/group_doEmportXlsFive.action";
		}
		document.forms[0].submit();
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
                <div class="c_crumbs"><div><b></b><strong>分组管理</strong></div> </div>
                <div class="search_art">
                    <li>
                    	是否签到：
                    	<s:select name="school.s_Submit" list="#schoolStateMap" headerKey="" headerValue="全部" onchange="doSearch()"/>
                    
                   
                    </li>
                     <li style="float:right;">
                    	导出统计表：
                        <input type="button" value="表一" class="s_button" onclick="doEmportExcel('one')"/>&nbsp;
                        <input type="button" value="表二" class="s_button" onclick="doEmportExcel('two')"/>&nbsp;
                        <input type="button" value="表三" class="s_button" onclick="doEmportExcel('three')"/>&nbsp;
                        <input type="button" value="表四	" class="s_button" onclick="doEmportExcel('four')"/>&nbsp;
                         <input type="button" value="表五" class="s_button" onclick="doEmportExcel('five')"/>&nbsp;
                    </li>
                </div>

                <div class="t_list" style="margin:0px; border:0px none;">
                    <table width="100%" border="0">
                        <tr class="t_tit">
                            <td width="10%" align="center"><input type="checkbox" id="selAll" onclick="doSelectAll()" /></td>
                            
                            
                            
                            
                            
                            <td width="32%" align="center">用户名</td>
                            <td width="15%" align="center">
								<s:select name="school.s_City" list="#cityMap" headerKey="" headerValue="所在城市" onchange="doSearch()"/>
							</td>
							
							  <td width="15%" align="center">
							 	<s:select name="school.s_Type" list="#typeMap" headerKey="" headerValue="所属类别" onchange="doSearch()"/>
							 </td>
							  <td width="15%" align="center">
							 	<s:select name="school.s_Admin" list="#adminMap" headerKey="" headerValue="行政名称" onchange="doSearch()"/>
							 </td>
							 <td width="15%" align="center">
							 	<s:select name="school.s_75" list="#s75Map" headerKey="" headerValue="75省属学校" onchange="doSearch()"/>
							 </td>
                         </tr> 
                             <!-- ===================================数据循环区域============================================ -->
                            <c:forEach items="${pageResult.items}" var="school">
                            <tr> 
                                <td align="center"><input type="checkbox" name="selectedRow" value="${school.s_Id}"/></td>
                                <td align="center">
	                                ${school.s_Name}
                                </td>
                                <td align="center">
                                	${school.s_City}
                                </td>
                                <td align="center">
                                	${school.s_Type}
                                </td>
                                 <td align="center">
                                	${school.s_Admin}
                                </td>
                                  <td align="center">
                                	${school.s_75}
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