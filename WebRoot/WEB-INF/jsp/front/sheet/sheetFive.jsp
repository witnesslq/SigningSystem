<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>用户管理</title>
<%@include file="/common/header.jsp"%>
<script type="text/javascript">
	function doEmportExcel() {
		document.forms[0].action="{basePath}sheet/down_sheetFive.action";
		document.forms[0].submit();
	}
	function doImportExcel() {
		alert("请务必导入对应表格的数据");
		document.forms[0].action="{basePath}sheet/sheet_importFiveExcel.action";
		document.forms[0].submit();
	}
	//提交
	function doSubmit(){
		if(confirm("确认提交吗？")){
		document.forms[0].action="{basePath}sheet/sheet_doSubmitFive.action";
		document.forms[0].submit();
		alert("提交成功");
		}
		
	}
	//表单验证
	function doCheck(){
	
	//获取用户输入数据（无简单方式）
	    var i_011 = document.getElementById("011").value;
	    var i_012 = document.getElementById("012").value;
	    var i_013 = document.getElementById("013").value;
	    var i_014 = document.getElementById("014").value;
	    var i_015 = document.getElementById("015").value;
	    var i_016 = document.getElementById("016").value;
	    var i_017 = document.getElementById("017").value;
	    var i_021 = document.getElementById("021").value;
	    var i_022 = document.getElementById("022").value;
	    var i_023 = document.getElementById("023").value;
	    var i_024 = document.getElementById("024").value;
	    var i_025 = document.getElementById("025").value;
	    var i_026 = document.getElementById("026").value;
	    var i_027 = document.getElementById("027").value;
	    var i_031 = document.getElementById("031").value;
	    var i_032 = document.getElementById("032").value;
	    var i_033 = document.getElementById("033").value;
	    var i_034 = document.getElementById("034").value;
	    var i_035 = document.getElementById("035").value;
	    var i_036 = document.getElementById("036").value;
	    var i_037 = document.getElementById("037").value;
	    var i_041 = document.getElementById("041").value;
	    var i_042 = document.getElementById("042").value;
	    var i_043 = document.getElementById("043").value;
	    var i_044 = document.getElementById("044").value;
	    var i_045 = document.getElementById("045").value;
	    var i_046 = document.getElementById("046").value;
	    var i_047 = document.getElementById("047").value;
	    var i_051 = document.getElementById("051").value;
	    var i_052 = document.getElementById("052").value;
	    var i_053 = document.getElementById("053").value;
	    var i_054 = document.getElementById("054").value;
	    var i_055 = document.getElementById("055").value;
	    var i_056 = document.getElementById("056").value;
	    var i_057 = document.getElementById("057").value;
		var reg = /^[0-9]+$/;
		//验证数据格式
		if((i_011==""||reg.test(i_011))&&(i_012==""||reg.test(i_012))&&(i_013==""||reg.test(i_013))&&(i_014==""||reg.test(i_014))&&(i_015==""||reg.test(i_015))&&(i_016==""||reg.test(i_016))&&(i_017==""||reg.test(i_017))&&
		(i_021==""||reg.test(i_021))&&(i_022==""||reg.test(i_022))&&(i_023==""||reg.test(i_023))&&(i_024==""||reg.test(i_024))&&(i_025==""||reg.test(i_025))&&(i_026==""||reg.test(i_026))&&(i_027==""||reg.test(i_027))&&
		(i_031==""||reg.test(i_031))&&(i_032==""||reg.test(i_032))&&(i_033==""||reg.test(i_033))&&(i_034==""||reg.test(i_034))&&(i_035==""||reg.test(i_035))&&(i_036==""||reg.test(i_036))&&(i_037==""||reg.test(i_037))&&
		(i_041==""||reg.test(i_041))&&(i_042==""||reg.test(i_042))&&(i_043==""||reg.test(i_043))&&(i_044==""||reg.test(i_044))&&(i_045==""||reg.test(i_045))&&(i_046==""||reg.test(i_046))&&(i_047==""||reg.test(i_047))&&
		(i_051==""||reg.test(i_051))&&(i_052==""||reg.test(i_052))&&(i_053==""||reg.test(i_053))&&(i_054==""||reg.test(i_054))&&(i_055==""||reg.test(i_055))&&(i_056==""||reg.test(i_056))&&(i_057==""||reg.test(i_057))
		){
				//验证数据范围（不可为0和负数）
			    if((i_011==""||i_011>0)&&(i_012==""||i_012>0)&&(i_013==""||i_013>0)&&(i_014==""||i_014>0)&&(i_015==""||i_015>0)&&(i_016==""||i_016>0)&&(i_017==""||i_017>0)&&
				   (i_021==""||i_021>0)&&(i_022==""||i_022>0)&&(i_023==""||i_023>0)&&(i_024==""||i_024>0)&&(i_025==""||i_025>0)&&(i_026==""||i_026>0)&&(i_027==""||i_027>0)&&
				   (i_031==""||i_031>0)&&(i_032==""||i_032>0)&&(i_033==""||i_033>0)&&(i_034==""||i_034>0)&&(i_035==""||i_035>0)&&(i_036==""||i_036>0)&&(i_037==""||i_037>0)&&
				   (i_041==""||i_041>0)&&(i_042==""||i_042>0)&&(i_043==""||i_043>0)&&(i_044==""||i_044>0)&&(i_045==""||i_045>0)&&(i_046==""||i_046>0)&&(i_047==""||i_047>0)&&
				   (i_051==""||i_051>0)&&(i_052==""||i_052>0)&&(i_053==""||i_053>0)&&(i_054==""||i_054>0)&&(i_055==""||i_055>0)&&(i_056==""||i_056>0)&&(i_057==""||i_057>0)
			       ){
			             //必须相加后才能比较相等，且条件中不可以连等
			             //Number()方法可将空值转化为0计算
			             var a = Number(i_021)+Number(i_031)+Number(i_041)+Number(i_051);
			             var b = Number(i_022)+Number(i_032)+Number(i_042)+Number(i_052);
			             var c = Number(i_023)+Number(i_033)+Number(i_043)+Number(i_053);
			             var d = Number(i_024)+Number(i_034)+Number(i_044)+Number(i_054);
			             var e = Number(i_025)+Number(i_035)+Number(i_045)+Number(i_055);
			             var f = Number(i_026)+Number(i_036)+Number(i_046)+Number(i_056);
			             var g = Number(i_027)+Number(i_037)+Number(i_047)+Number(i_057);
				        //验证具体算法（相加相等）
				        //验证列关系
				      
					    if(i_011==a&&i_012==b&&i_013==c&&i_014==d&&i_015==e&&i_016==f&&i_017==g  
					    ){    
			             //进行提交				          				                   
			             doSubmit();
	                     return true;
					    }else{
					    alert("校验失败，不符合规则：01行=02行+03行+04行+05行！");
					    return false;
					    }				
				}else{
				alert("范围错误，请检查数字范围(不可为0或负数)！");
				return false;
				}
		}else{
            alert("格式错误，请检查并填写数字(不要有空格)！");
			return false;
		}
	}
	
</script>
</head>
<body class="rightBody">
	<form name="form1" action="" method="post"
		enctype="multipart/form-data">
		<div class="p_d_1">
			<div class="p_d_1_1">
				<div class="content_info">
					<div class="c_crumbs">
						<div>
							<b></b><strong>填写表五</strong>
						</div>
					</div>
					<div class="search_art">
						<li style="float:right;"><input type="button" value="提交"
							class="s_button" onclick="doCheck()" />&nbsp; <input
							name="sheetExcel" type="file" /> <input type="button" value="导入"
							class="s_button" onclick="doImportExcel()" />&nbsp; <input
							type="button" value="模版" class="s_button"
							onclick="doEmportExcel()" />&nbsp;</li>
					</div>

					<div class="t_list" style="margin:0px; border:0px none;">
						<table border="1" cellspacing="0" cellpadding="0" width="955px">
							<tr>
								<td colspan="9" align="center">2017年全国高校与党组织失去联系党员规范管理及组织处置情况汇总表</td>
							</tr>
							<tr>
								<td colspan="9">填报单位（盖章）：</td>
							</tr>
						<tr align="center">
								<td rowspan="2"></td>
								<td rowspan="2">编号</td>
								<td colspan="4">规范管理情况</td>
								<td colspan="3">组织处置情况</td> 
							</tr>
							<tr align="center">
								<td>纳入组织管理</td>
								<td>取消预备党员资格</td>
								<td>保留组织关系</td>
								<td>停止党籍</td>
								<td>限期改正</td>
								<td>退党除名</td>
								<td>自行脱党除名</td>
							</tr>
							<tr align="center">
								<td>甲</td>
								<td>乙</td>
								<td>1</td>
								<td>2</td>
								<td>3</td>
								<td>4</td>
								<td>5</td>
								<td>6</td>
								<td>7</td>
							</tr>
							<tr align="center">
								<td>总计</td>
								<td>01</td>
								<td><input id="011" type="text" name="dataMap['011']" style="border:0px" size="3px" value="${dataMap['011']}">
								</td>
								<td><input id="012" type="text" name="dataMap['012']" style="border:0px" size="3px" value="${dataMap['012']}">
								</td>
								<td><input id="013" type="text" name="dataMap['013']" style="border:0px" size="3px" value="${dataMap['013']}">
								</td>
								<td><input id="014" type="text" name="dataMap['014']" style="border:0px" size="3px" value="${dataMap['014']}">
								</td>
								<td><input id="015" type="text" name="dataMap['015']" style="border:0px" size="3px" value="${dataMap['015']}">
								</td>
								<td><input id="016" type="text" name="dataMap['016']" style="border:0px" size="3px" value="${dataMap['016']}">
								</td>
								<td><input id="017" type="text" name="dataMap['017']" style="border:0px" size="3px" value="${dataMap['017']}">
								</td>
							</tr>
							<tr align="center">
								<td>教职工（含解除劳动关系的）</td>
								<td>02</td>
								<td><input id="021" type="text" name="dataMap['021']" style="border:0px" size="3px" value="${dataMap['021']}">
								</td>
								<td><input id="022" type="text" name="dataMap['022']" style="border:0px" size="3px" value="${dataMap['022']}">
								</td>
								<td><input id="023" type="text" name="dataMap['023']" style="border:0px" size="3px" value="${dataMap['023']}">
								</td>
								<td><input id="024" type="text" name="dataMap['024']" style="border:0px" size="3px" value="${dataMap['024']}">
								</td>
								<td><input id="025" type="text" name="dataMap['025']" style="border:0px" size="3px" value="${dataMap['025']}">
								</td>
								<td><input id="026" type="text" name="dataMap['026']" style="border:0px" size="3px" value="${dataMap['026']}">
								</td>
								<td><input id="027" type="text" name="dataMap['027']" style="border:0px" size="3px" value="${dataMap['027']}">
								</td>
							</tr>
							<tr align="center">
								<td>离退休人员</td>
								<td>03</td>
								<td><input id="031" type="text" name="dataMap['031']" style="border:0px" size="3px" value="${dataMap['031']}">
								</td>
								<td><input id="032" type="text" name="dataMap['032']" style="border:0px" size="3px" value="${dataMap['032']}">
								</td>
								<td><input id="033" type="text" name="dataMap['033']" style="border:0px" size="3px" value="${dataMap['033']}">
								</td>
								<td><input id="034" type="text" name="dataMap['034']" style="border:0px" size="3px" value="${dataMap['034']}">
								</td>
								<td><input id="035" type="text" name="dataMap['035']" style="border:0px" size="3px" value="${dataMap['035']}">
								</td>
								<td><input id="036" type="text" name="dataMap['036']" style="border:0px" size="3px" value="${dataMap['036']}">
								</td>
								<td><input id="037" type="text" name="dataMap['037']" style="border:0px" size="3px" value="${dataMap['037']}">
								</td>
							</tr>
							<tr align="center">
								<td>高校毕业生</td>
								<td>04</td>
								<td><input id="041" type="text" name="dataMap['041']" style="border:0px" size="3px" value="${dataMap['041']}">
								</td>
								<td><input id="042" type="text" name="dataMap['042']" style="border:0px" size="3px" value="${dataMap['042']}">
								</td>
								<td><input id="043" type="text" name="dataMap['043']" style="border:0px" size="3px" value="${dataMap['043']}">
								</td>
								<td><input id="044" type="text" name="dataMap['044']" style="border:0px" size="3px" value="${dataMap['044']}">
								</td>
								<td><input id="045" type="text" name="dataMap['045']" style="border:0px" size="3px" value="${dataMap['045']}">
								</td>
								<td><input id="046" type="text" name="dataMap['046']" style="border:0px" size="3px" value="${dataMap['046']}">
								</td>
								<td><input id="047" type="text" name="dataMap['047']" style="border:0px" size="3px" value="${dataMap['047']}">
								</td>
							</tr>
							<tr align="center">
								<td>其他</td>
								<td>05</td>
								<td><input id="051" type="text" name="dataMap['051']" style="border:0px" size="3px" value="${dataMap['051']}">
								</td>
								<td><input id="052" type="text" name="dataMap['052']" style="border:0px" size="3px" value="${dataMap['052']}">
								</td>
								<td><input id="053" type="text" name="dataMap['053']" style="border:0px" size="3px" value="${dataMap['053']}">
								</td>
								<td><input id="054" type="text" name="dataMap['054']" style="border:0px" size="3px" value="${dataMap['054']}">
								</td>
								<td><input id="055" type="text" name="dataMap['055']" style="border:0px" size="3px" value="${dataMap['055']}">
								</td>
								<td><input id="056" type="text" name="dataMap['056']" style="border:0px" size="3px" value="${dataMap['056']}">
								</td>
								<td><input id="057" type="text" name="dataMap['057']" style="border:0px" size="3px" value="${dataMap['057']}">
								</td>
							</tr>
							<tr align="center">
								<td align="center">说明</td>
								<td align="left" colspan="8">说明： 1.本表行列关系如下：如，列关系：01=02+03+04+05；</td>
							</tr>
							<tr>
								<td></td>
								<td colspan="8">2.统计数据截至2017年6月30日。</td>
						</table>
					</div>
				</div>
			</div>
		</div>
	</form>

</body>
</html>