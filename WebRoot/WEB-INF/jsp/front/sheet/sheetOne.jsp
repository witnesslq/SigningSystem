<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>用户管理</title>
<%@include file="/common/header.jsp"%>
<style type="text/css">
</style>
<script type="text/javascript">
	function doEmportExcel() {
		document.forms[0].action="{basePath}sheet/down_sheetOne.action";
		document.forms[0].submit();
	}
	function doImportExcel(){
	    alert("请务必导入对应表格的数据");
		document.forms[0].action="{basePath}sheet/sheet_importOneExcel.action";
		document.forms[0].submit();
	}
	function doSubmit(){
	    if(confirm("确认提交吗？")){
		document.forms[0].action="{basePath}sheet/sheet_doSubmitOne.action";
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
	    var i_018 = document.getElementById("018").value;
	    var i_019 = document.getElementById("019").value;
	    var i_0110 = document.getElementById("0110").value;
	    var i_0111 = document.getElementById("0111").value;
	    var i_0112 = document.getElementById("0112").value;
	    var i_0113 = document.getElementById("0113").value;
	    var i_021 = document.getElementById("021").value;
	    var i_022 = document.getElementById("022").value;
	    var i_023 = document.getElementById("023").value;
	    var i_024 = document.getElementById("024").value;
	    var i_025 = document.getElementById("025").value;
	    var i_026 = document.getElementById("026").value;
	    var i_027 = document.getElementById("027").value;
	    var i_028 = document.getElementById("028").value;
	    var i_029 = document.getElementById("029").value;
	    var i_0210 = document.getElementById("0210").value;
	    var i_0211 = document.getElementById("0211").value;
	    var i_0212 = document.getElementById("0212").value;
	    var i_0213 = document.getElementById("0213").value;
	    var i_031 = document.getElementById("031").value;
	    var i_032 = document.getElementById("032").value;
	    var i_033 = document.getElementById("033").value;
	    var i_034 = document.getElementById("034").value;
	    var i_035 = document.getElementById("035").value;
	    var i_036 = document.getElementById("036").value;
	    var i_037 = document.getElementById("037").value;
	    var i_038 = document.getElementById("038").value;
	    var i_039 = document.getElementById("039").value;
	    var i_0310 = document.getElementById("0310").value;
	    var i_0311 = document.getElementById("0311").value;
	    var i_0312 = document.getElementById("0312").value;
	    var i_0313 = document.getElementById("0313").value;
	    var i_041 = document.getElementById("041").value;
	    var i_042 = document.getElementById("042").value;
	    var i_043 = document.getElementById("043").value;
	    var i_044 = document.getElementById("044").value;
	    var i_045 = document.getElementById("045").value;
	    var i_046 = document.getElementById("046").value;
	    var i_047 = document.getElementById("047").value;
	    var i_048 = document.getElementById("048").value;
	    var i_049 = document.getElementById("049").value;
	    var i_0410 = document.getElementById("0410").value;
	    var i_0411 = document.getElementById("0411").value;
	    var i_0412 = document.getElementById("0412").value;
	    var i_0413 = document.getElementById("0413").value;
		var reg = /^[0-9]+$/;
		//验证数据格式
		if((i_011==""||reg.test(i_011))&&(i_012==""||reg.test(i_012))&&(i_013==""||reg.test(i_013))&&(i_014==""||reg.test(i_014))&&(i_015==""||reg.test(i_015))&&(i_016==""||reg.test(i_016))&&(i_017==""||reg.test(i_017))&&(i_018==""||reg.test(i_018))&&(i_019==""||reg.test(i_019))&&(i_0110==""||reg.test(i_0110))&&(i_0111==""||reg.test(i_0111))&&(i_0112==""||reg.test(i_0112))&&(i_0113==""||reg.test(i_0113))&&
		(i_021==""||reg.test(i_021))&&(i_022==""||reg.test(i_022))&&(i_023==""||reg.test(i_023))&&(i_024==""||reg.test(i_024))&&(i_025==""||reg.test(i_025))&&(i_026==""||reg.test(i_026))&&(i_027==""||reg.test(i_027))&&(i_028==""||reg.test(i_028))&&(i_029==""||reg.test(i_029))&&(i_0210==""||reg.test(i_0210))&&(i_0211==""||reg.test(i_0211))&&(i_0212==""||reg.test(i_0212))&&(i_0213==""||reg.test(i_0213))&&
		(i_031==""||reg.test(i_031))&&(i_032==""||reg.test(i_032))&&(i_033==""||reg.test(i_033))&&(i_034==""||reg.test(i_034))&&(i_035==""||reg.test(i_035))&&(i_036==""||reg.test(i_036))&&(i_037==""||reg.test(i_037))&&(i_038==""||reg.test(i_038))&&(i_039==""||reg.test(i_039))&&(i_0310==""||reg.test(i_0310))&&(i_0311==""||reg.test(i_0311))&&(i_0312==""||reg.test(i_0312))&&(i_0313==""||reg.test(i_0313))&&
		(i_041==""||reg.test(i_041))&&(i_042==""||reg.test(i_042))&&(i_043==""||reg.test(i_043))&&(i_044==""||reg.test(i_044))&&(i_045==""||reg.test(i_045))&&(i_046==""||reg.test(i_046))&&(i_047==""||reg.test(i_047))&&(i_048==""||reg.test(i_048))&&(i_049==""||reg.test(i_049))&&(i_0410==""||reg.test(i_0410))&&(i_0411==""||reg.test(i_0411))&&(i_0412==""||reg.test(i_0412))&&(i_0413==""||reg.test(i_0413))
		){
				//验证数据范围（不可为0和负数）
			    if((i_011==""||i_011>0)&&(i_012==""||i_012>0)&&(i_013==""||i_013>0)&&(i_014==""||i_014>0)&&(i_015==""||i_015>0)&&(i_016==""||i_016>0)&&(i_017==""||i_017>0)&&(i_018==""||i_018>0)&&(i_019==""||i_019>0)&&(i_0110==""||i_0110>0)&&(i_0111==""||i_0111>0)&&(i_0112==""||i_0112>0)&&(i_0113==""||i_0113>0)&&
				   (i_021==""||i_021>0)&&(i_022==""||i_022>0)&&(i_023==""||i_023>0)&&(i_024==""||i_024>0)&&(i_025==""||i_025>0)&&(i_026==""||i_026>0)&&(i_027==""||i_027>0)&&(i_028==""||i_028>0)&&(i_029==""||i_029>0)&&(i_0210==""||i_0210>0)&&(i_0211==""||i_0211>0)&&(i_0212==""||i_0212>0)&&(i_0213==""||i_0213>0)&&
				   (i_031==""||i_031>0)&&(i_032==""||i_032>0)&&(i_033==""||i_033>0)&&(i_034==""||i_034>0)&&(i_035==""||i_035>0)&&(i_036==""||i_036>0)&&(i_037==""||i_037>0)&&(i_038==""||i_038>0)&&(i_039==""||i_039>0)&&(i_0310==""||i_0310>0)&&(i_0311==""||i_0311>0)&&(i_0312==""||i_0312>0)&&(i_0313==""||i_0313>0)&&
				   (i_041==""||i_041>0)&&(i_042==""||i_042>0)&&(i_043==""||i_043>0)&&(i_044==""||i_044>0)&&(i_045==""||i_045>0)&&(i_046==""||i_046>0)&&(i_047==""||i_047>0)&&(i_048==""||i_048>0)&&(i_049==""||i_049>0)&&(i_0410==""||i_0410>0)&&(i_0411==""||i_0411>0)&&(i_0412==""||i_0412>0)&&(i_0413==""||i_0413>0)
			       ){
				        //验证具体算法（相加相等）
					    if(i_011==1&&(((i_021==1&&(i_031==""&&i_041==""))||(i_031==1&&(i_021==""&&i_041==""))||(i_041==1&&(i_021==""&&i_031==""))))	  
					    ){    
					          //验证院校类型（三选一），且其他与之数据对应
					          if(i_021=1&&((i_022==1&&i_012==1&&i_013==""&&i_023==""&&i_014==""&&i_024==""&&i_015==""&&i_025=="")||(i_013==1&&i_023==1&&i_012==""&&i_022==""&&i_014==""&&i_024==""&&i_015==""&&i_025=="")||(i_014==1&&i_024==1&&i_012==""&&i_022==""&&i_013==""&&i_023==""&&i_015==""&&i_025=="")||(i_015==1&&i_025==1&&i_012==""&&i_022==""&&i_013==""&&i_023==""&&i_014==""&&i_024==""))     
					          &&i_031==""&&i_032==""&&i_033==""&&i_034==""&&i_035==""&&i_036==""&&i_037==""&&i_038==""&&i_039==""&&i_0310==""&&i_0311==""&&i_0312==""&&i_0313==""
					          &&i_041==""&&i_042==""&&i_043==""&&i_044==""&&i_045==""&&i_046==""&&i_047==""&&i_048==""&&i_049==""&&i_0410==""&&i_0411==""&&i_0412==""&&i_0413==""
					          &&i_016==i_026&&i_017==i_027&&i_018==i_028&&i_019==i_029&&i_0110==i_0210&&i_0111==i_0211&&i_0112==i_0212&&i_0113==i_0213
					          ){					          
					          //进行提交
 				              doSubmit();
				               return true;					          
					          }
					          else if(i_031=1&&((i_032==1&&i_012==1&&i_013==""&&i_033==""&&i_014==""&&i_034==""&&i_015==""&&i_035=="")||(i_013==1&&i_033==1&&i_012==""&&i_032==""&&i_014==""&&i_034==""&&i_015==""&&i_035=="")||(i_014==1&&i_034==1&&i_012==""&&i_032==""&&i_013==""&&i_033==""&&i_015==""&&i_035=="")||(i_015==1&&i_035==1&&i_012==""&&i_032==""&&i_013==""&&i_033==""&&i_014==""&&i_034==""))
					          &&i_021==""&&i_022==""&&i_023==""&&i_024==""&&i_025==""&&i_026==""&&i_027==""&&i_028==""&&i_029==""&&i_0210==""&&i_0211==""&&i_0212==""&&i_0213==""
					          &&i_041==""&&i_042==""&&i_043==""&&i_044==""&&i_045==""&&i_046==""&&i_047==""&&i_048==""&&i_049==""&&i_0410==""&&i_0411==""&&i_0412==""&&i_0413==""
					          &&i_016==i_036&&i_017==i_037&&i_018==i_038&&i_019==i_039&&i_0110==i_0310&&i_0111==i_0311&&i_0112==i_0312&&i_0113==i_0313
					          ){
					          //进行提交
					          doSubmit();
					           return true;
					          }
					          else if(i_041=1&&((i_042==1&&i_012==1&&i_013==""&&i_043==""&&i_014==""&&i_044==""&&i_015==""&&i_045=="")||(i_013==1&&i_043==1&&i_012==""&&i_042==""&&i_014==""&&i_044==""&&i_015==""&&i_045=="")||(i_014==1&&i_044==1&&i_012==""&&i_042==""&&i_013==""&&i_043==""&&i_015==""&&i_045=="")||(i_015==1&&i_045==1&&i_012==""&&i_042==""&&i_013==""&&i_043==""&&i_014==""&&i_044==""))
					          &&i_021==""&&i_022==""&&i_023==""&&i_024==""&&i_025==""&&i_026==""&&i_027==""&&i_028==""&&i_029==""&&i_0210==""&&i_0211==""&&i_0212==""&&i_0213==""
					          &&i_031==""&&i_032==""&&i_033==""&&i_034==""&&i_035==""&&i_036==""&&i_037==""&&i_038==""&&i_039==""&&i_0310==""&&i_0311==""&&i_0312==""&&i_0313==""	
					          &&i_016==i_046&&i_017==i_047&&i_018==i_048&&i_019==i_049&&i_0110==i_0410&&i_0111==i_0411&&i_0112==i_0412&&i_0113==i_0413						          
					          ){
					          //进行提交
					          doSubmit();
					           return true;
					          }
					          else{
					             alert("校验失败，不符合规则：2、3、4、5列只能填写一列，同时01行与填写行对应数据相等！");
					             return false;
					          }
					    }else{
					    alert("校验失败，不符合规则：02、03、04行只能填写一行且只能填'1'！");
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
							<b></b><strong>填写表一</strong>
						</div>
					</div>
					<div class="search_art">
						<li style="float:right;"><input type="button" value="提交"
							class="s_button" onclick="doCheck()" />&nbsp; 
							<input name="sheetExcel" type="file" /> <input type="button" value="导入"
							class="s_button" onclick="doImportExcel()" />&nbsp; <input
							type="button" value="模版" class="s_button"
							onclick="doEmportExcel()" />&nbsp;</li>
					</div>

					<div class="t_list" style="margin:0px; border:0px none;">
						<table border="1" cellspacing="0" cellpadding="0">
							<tr>
								<td colspan="16" align="center">2017年全国高校基层党组织建设情况统计表</td>
							</tr>
							<tr>
								<td colspan="16">填报单位（盖章）：</td>
							</tr>

							<tr align="center">
								<td rowspan="2" colspan="2"></td>
								<td rowspan="2">列号</td>
								<td rowspan="2">高校总数</td>
								<td>建立党委的高校</td>
								<td>建立总支部的高校</td>
								<td>建立支部的高校</td>
								<td>未建立党组织的高校</td>
								<td colspan="8">高校基层党组织总数</td>
							</tr>

							<tr align="center">
								<td>小计</td>
								<td>小计</td>
								<td>小计</td>
								<td>小计</td>
								<td>校级党委数</td>
								<td>院系级党委数</td>
								<td>院系级党总支数</td>
								<td>直属党支部数</td>
								<td>教职工党总支</td>
								<td>教职工党支部数（含离退休人员党支部数）</td>
								<td>离退休人员党支部数</td>
								<td>学生党支部数</td>

							</tr>
							<tr align="center">
								<td colspan="2">行号</td>
								<td></td>
								<td>1</td>
								<td>2</td>
								<td>3</td>
								<td>4</td>
								<td>5</td>
								<td>6</td>
								<td>7</td>
								<td>8</td>
								<td>9</td>
								<td>10</td>
								<td>11</td>
								<td>12</td>
								<td>13</td>
							</tr>
							<tr align="center">
								<td colspan="2">总计</td>
								<td>01</td>
								<td align="center">
								<input id="011"　type="text" name="dataMap['011']" style="border:0px" size="3px" value="${dataMap['011']}">
								</td>
								<td><input id="012" type="text" name="dataMap['012']" style="border:0px" size="3px" value="${dataMap['012']}">
								</td>
								<td><input id="013" type="text" name="dataMap['013']"  style="border:0px" size="3px" value="${dataMap['013']}">
								</td>
								<td><input id="014" type="text" name="dataMap['014']"  style="border:0px" size="3px" value="${dataMap['014']}">
								</td>
								<td><input id="015" type="text" name="dataMap['015']"  style="border:0px" size="3px" value="${dataMap['015']}">
								</td>
								<td><input id="016" type="text" name="dataMap['016']"  style="border:0px" size="3px" value="${dataMap['016']}">
								</td>
								<td><input id="017" type="text" name="dataMap['017']"  style="border:0px" size="3px" value="${dataMap['017']}">
								</td>
								<td><input id="018" type="text" name="dataMap['018']"  style="border:0px" size="3px" value="${dataMap['018']}">
								</td>
								<td><input id="019" type="text" name="dataMap['019']"  style="border:0px" size="3px" value="${dataMap['019']}">
								</td>
								<td><input id="0110" type="text" name="dataMap['0110']"  style="border:0px" size="3px" value="${dataMap['0110']}">
								</td>
								<td><input id="0111" type="text" name="dataMap['0111']"  style="border:0px" size="3px" value="${dataMap['0111']}">
								</td>
								<td><input id="0112" type="text" name="dataMap['0112']"  style="border:0px" size="3px" value="${dataMap['0112']}">
								</td>
								<td><input id="0113" type="text" name="dataMap['0113']"  style="border:0px" size="3px" value="${dataMap['0113']}">
								</td>
							</tr>
							<tr align="center">
								<td rowspan="3">合计</td>
								<td>本科院校</td>
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
								<td><input id="028" type="text" name="dataMap['028']" style="border:0px" size="3px" value="${dataMap['028']}">
								</td>
								<td><input id="029" type="text" name="dataMap['029']" style="border:0px" size="3px" value="${dataMap['029']}">
								</td>
								<td><input id="0210" type="text" name="dataMap['0210']" style="border:0px" size="3px" value="${dataMap['0210']}">
								</td>
								<td><input id="0211" type="text" name="dataMap['0211']" style="border:0px" size="3px" value="${dataMap['0211']}">
								</td>
								<td><input id="0212" type="text" name="dataMap['0212']" style="border:0px" size="3px" value="${dataMap['0212']}">
								</td>
								<td><input id="0213" type="text" name="dataMap['0213']" style="border:0px" size="3px" value="${dataMap['0213']}">
								</td>
							</tr>
							<tr align="center">
								<td>专科院校（含职业技术学院）</td>
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
								<td><input id="038" type="text" name="dataMap['038']" style="border:0px" size="3px" value="${dataMap['038']}">
								</td>
								<td><input id="039" type="text" name="dataMap['039']" style="border:0px" size="3px" value="${dataMap['039']}">
								</td>
								<td><input id="0310" type="text" name="dataMap['0310']" style="border:0px" size="3px" value="${dataMap['0310']}">
								</td>
								<td><input id="0311" type="text" name="dataMap['0311']" style="border:0px" size="3px" value="${dataMap['0311']}">
								</td>
								<td><input id="0312" type="text" name="dataMap['0312']" style="border:0px" size="3px" value="${dataMap['0312']}">
								</td>
								<td><input id="0313" type="text" name="dataMap['0313']" style="border:0px" size="3px" value="${dataMap['0313']}">
								</td>
							</tr>
							<tr align="center">
								<td>民办高校（含独立学院）</td>
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
								<td><input id="048" type="text" name="dataMap['048']" style="border:0px" size="3px" value="${dataMap['048']}">
								</td>
								<td><input id="049" type="text" name="dataMap['049']" style="border:0px" size="3px" value="${dataMap['049']}">
								</td>
								<td><input id="0410" type="text" name="dataMap['0410']" style="border:0px" size="3px" value="${dataMap['0410']}">
								</td>
								<td><input id="0411" type="text" name="dataMap['0411']" style="border:0px" size="3px" value="${dataMap['0411']}">
								</td>
								<td><input id="0412" type="text" name="dataMap['0412']" style="border:0px" size="3px" value="${dataMap['0412']}">
								</td>
								<td><input id="0413" type="text" name="dataMap['0413']" style="border:0px" size="3px" value="${dataMap['0413']}">
								</td>
							</tr>
							<tr>
								<td align="center">说明</td>
								<td align="left" colspan="13">1.本表行列关系如下：如，列关系：01=02+03+04，行关系：1=2+3+4+5；</td>
							</tr>
							<tr>
								<td></td>
								<td colspan="13">2.统计数据截至2017年6月30日。</td>
						</table>
					</div>
				</div>
			</div>
		</div>
	</form>

</body>
</html>