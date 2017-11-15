<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>用户管理</title>
<%@include file="/common/header.jsp"%>
<script type="text/javascript">
	function doEmportExcel() {
		document.forms[0].action="{basePath}sheet/down_sheetThree.action";
		document.forms[0].submit();
	}
	function doImportExcel() {
	alert("请务必导入对应表格的数据");
	document.forms[0].action="{basePath}sheet/sheet_importThreeExcel.action";
	document.forms[0].submit();
	}
	//提交
	function doSubmit(){
		if(confirm("确认提交吗？")){
		document.forms[0].action="{basePath}sheet/sheet_doSubmitThree.action";
		document.forms[0].submit();
		alert("提交成功");
		}
		
	}
	
	//表单验证
	function doCheck(){
	//获取用户输入数据（无简单方式）
	    var i_0011 = document.getElementById("0011").value;
	    var i_0012 = document.getElementById("0012").value;
	    var i_0013 = document.getElementById("0013").value;
	    var i_0014 = document.getElementById("0014").value;
	    var i_0015 = document.getElementById("0015").value;
	    var i_0016 = document.getElementById("0016").value;
	    var i_0017 = document.getElementById("0017").value;
	    var i_0018 = document.getElementById("0018").value;
	    var i_0019 = document.getElementById("0019").value;
	    var i_00110 = document.getElementById("00110").value;
	    var i_00111 = document.getElementById("00111").value;
	    var i_0021 = document.getElementById("0021").value;
	    var i_0022 = document.getElementById("0022").value;
	    var i_0023 = document.getElementById("0023").value;
	    var i_0024 = document.getElementById("0024").value;
	    var i_0025 = document.getElementById("0025").value;
	    var i_0026 = document.getElementById("0026").value;
	    var i_0027 = document.getElementById("0027").value;
	    var i_0028 = document.getElementById("0028").value;
	    var i_0029 = document.getElementById("0029").value;
	    var i_00210 = document.getElementById("00210").value;
	    var i_00211 = document.getElementById("00211").value;
	    var i_0031 = document.getElementById("0031").value;
	    var i_0032 = document.getElementById("0032").value;
	    var i_0033 = document.getElementById("0033").value;
	    var i_0034 = document.getElementById("0034").value;
	    var i_0035 = document.getElementById("0035").value;
	    var i_0036 = document.getElementById("0036").value;
	    var i_0037 = document.getElementById("0037").value;
	    var i_0038 = document.getElementById("0038").value;
	    var i_0039 = document.getElementById("0039").value;
	    var i_00310 = document.getElementById("00310").value;
	    var i_00311 = document.getElementById("00311").value;
	    var i_0041 = document.getElementById("0041").value;
	    var i_0042 = document.getElementById("0042").value;
	    var i_0043 = document.getElementById("0043").value;
	    var i_0044 = document.getElementById("0044").value;
	    var i_0045 = document.getElementById("0045").value;
	    var i_0046 = document.getElementById("0046").value;
	    var i_0047 = document.getElementById("0047").value;
	    var i_0048 = document.getElementById("0048").value;
	    var i_0049 = document.getElementById("0049").value;
	    var i_00410 = document.getElementById("00410").value;
	    var i_00411 = document.getElementById("00411").value;
	    var i_0051 = document.getElementById("0051").value;
	    var i_0052 = document.getElementById("0052").value;
	    var i_0053 = document.getElementById("0053").value;
	    var i_0054 = document.getElementById("0054").value;
	    var i_0055 = document.getElementById("0055").value;
	    var i_0056 = document.getElementById("0056").value;
	    var i_0057 = document.getElementById("0057").value;
	    var i_0058 = document.getElementById("0058").value;
	    var i_0059 = document.getElementById("0059").value;
	    var i_00510 = document.getElementById("00510").value;
	    var i_00511 = document.getElementById("00511").value;	 
	    var i_0061 = document.getElementById("0061").value;
	    var i_0062 = document.getElementById("0062").value;
	    var i_0063 = document.getElementById("0063").value;
	    var i_0064 = document.getElementById("0064").value;
	    var i_0065 = document.getElementById("0065").value;
	    var i_0066 = document.getElementById("0066").value;
	    var i_0067 = document.getElementById("0067").value;
	    var i_0068 = document.getElementById("0068").value;
	    var i_0069 = document.getElementById("0069").value;
	    var i_00610 = document.getElementById("00610").value;
	    var i_00611 = document.getElementById("00611").value;
	    var i_0071 = document.getElementById("0071").value;
	    var i_0072 = document.getElementById("0072").value;
	    var i_0073 = document.getElementById("0073").value;
	    var i_0074 = document.getElementById("0074").value;
	    var i_0075 = document.getElementById("0075").value;
	    var i_0076 = document.getElementById("0076").value;
	    var i_0077 = document.getElementById("0077").value;
	    var i_0078 = document.getElementById("0078").value;
	    var i_0079 = document.getElementById("0079").value;
	    var i_00710 = document.getElementById("00710").value;
	    var i_00711 = document.getElementById("00711").value;
	    var i_0081 = document.getElementById("0081").value;
	    var i_0082 = document.getElementById("0082").value;
	    var i_0083 = document.getElementById("0083").value;
	    var i_0084 = document.getElementById("0084").value;
	    var i_0085 = document.getElementById("0085").value;
	    var i_0086 = document.getElementById("0086").value;
	    var i_0087 = document.getElementById("0087").value;
	    var i_0088 = document.getElementById("0088").value;
	    var i_0089 = document.getElementById("0089").value;
	    var i_00810 = document.getElementById("00810").value;
	    var i_00811 = document.getElementById("00811").value;
	    var i_0091 = document.getElementById("0091").value;
	    var i_0092 = document.getElementById("0092").value;
	    var i_0093 = document.getElementById("0093").value;
	    var i_0094 = document.getElementById("0094").value;
	    var i_0095 = document.getElementById("0095").value;
	    var i_0096 = document.getElementById("0096").value;
	    var i_0097 = document.getElementById("0097").value;
	    var i_0098 = document.getElementById("0098").value;
	    var i_0099 = document.getElementById("0099").value;
	    var i_00910 = document.getElementById("00910").value;
	    var i_00911 = document.getElementById("00911").value;
	    var i_0101 = document.getElementById("0101").value;
	    var i_0102 = document.getElementById("0102").value;
	    var i_0103 = document.getElementById("0103").value;
	    var i_0104 = document.getElementById("0104").value;
	    var i_0105 = document.getElementById("0105").value;
	    var i_0106 = document.getElementById("0106").value;
	    var i_0107 = document.getElementById("0107").value;
	    var i_0108 = document.getElementById("0108").value;
	    var i_0109 = document.getElementById("0109").value;
	    var i_01010 = document.getElementById("01010").value;
	    var i_01011 = document.getElementById("01011").value;
	    var i_0111 = document.getElementById("0111").value;
	    var i_0112 = document.getElementById("0112").value;
	    var i_0113 = document.getElementById("0113").value;
	    var i_0114 = document.getElementById("0114").value;
	    var i_0115 = document.getElementById("0115").value;
	    var i_0116 = document.getElementById("0116").value;
	    var i_0117 = document.getElementById("0117").value;
	    var i_0118 = document.getElementById("0118").value;
	    var i_0119 = document.getElementById("0119").value;
	    var i_01110 = document.getElementById("01110").value;
	    var i_01111 = document.getElementById("01111").value;	
	    var i_0121 = document.getElementById("0121").value;
	    var i_0122 = document.getElementById("0122").value;
	    var i_0123 = document.getElementById("0123").value;
	    var i_0124 = document.getElementById("0124").value;
	    var i_0125 = document.getElementById("0125").value;
	    var i_0126 = document.getElementById("0126").value;
	    var i_0127 = document.getElementById("0127").value;
	    var i_0128 = document.getElementById("0128").value;
	    var i_0129 = document.getElementById("0129").value;
	    var i_01210 = document.getElementById("01210").value;
	    var i_01211 = document.getElementById("01211").value;							    
		var reg = /^[0-9]+\.{0,1}[0-9]{0,2}$/;
		//验证数据格式
		if((i_0011==""||reg.test(i_0011))&&(i_0012==""||reg.test(i_0012))&&(i_0013==""||reg.test(i_0013))&&(i_0014==""||reg.test(i_0014))&&(i_0015==""||reg.test(i_0015))&&(i_0016==""||reg.test(i_0016))&&(i_0017==""||reg.test(i_0017))&&(i_0018==""||reg.test(i_0018))&&(i_0019==""||reg.test(i_0019))&&(i_00110==""||reg.test(i_00110))&&(i_00111==""||reg.test(i_00111))&&
		(i_0021==""||reg.test(i_0021))&&(i_0022==""||reg.test(i_0022))&&(i_0023==""||reg.test(i_0023))&&(i_0024==""||reg.test(i_0024))&&(i_0025==""||reg.test(i_0025))&&(i_0026==""||reg.test(i_0026))&&(i_0027==""||reg.test(i_0027))&&(i_0028==""||reg.test(i_0028))&&(i_0029==""||reg.test(i_0029))&&(i_00210==""||reg.test(i_00210))&&(i_00211==""||reg.test(i_00211))&&
		(i_0031==""||reg.test(i_0031))&&(i_0032==""||reg.test(i_0032))&&(i_0033==""||reg.test(i_0033))&&(i_0034==""||reg.test(i_0034))&&(i_0035==""||reg.test(i_0035))&&(i_0036==""||reg.test(i_0036))&&(i_0037==""||reg.test(i_0037))&&(i_0038==""||reg.test(i_0038))&&(i_0039==""||reg.test(i_0039))&&(i_00310==""||reg.test(i_00310))&&(i_00311==""||reg.test(i_00311))&&
		(i_0041==""||reg.test(i_0041))&&(i_0042==""||reg.test(i_0042))&&(i_0043==""||reg.test(i_0043))&&(i_0044==""||reg.test(i_0044))&&(i_0045==""||reg.test(i_0045))&&(i_0046==""||reg.test(i_0046))&&(i_0047==""||reg.test(i_0047))&&(i_0048==""||reg.test(i_0048))&&(i_0049==""||reg.test(i_0049))&&(i_00410==""||reg.test(i_00410))&&(i_00411==""||reg.test(i_00411))&&
		(i_0051==""||reg.test(i_0051))&&(i_0052==""||reg.test(i_0052))&&(i_0053==""||reg.test(i_0053))&&(i_0054==""||reg.test(i_0054))&&(i_0055==""||reg.test(i_0055))&&(i_0056==""||reg.test(i_0056))&&(i_0057==""||reg.test(i_0057))&&(i_0058==""||reg.test(i_0058))&&(i_0059==""||reg.test(i_0059))&&(i_00510==""||reg.test(i_00510))&&(i_00511==""||reg.test(i_00511))&&
		(i_0061==""||reg.test(i_0061))&&(i_0062==""||reg.test(i_0062))&&(i_0063==""||reg.test(i_0063))&&(i_0064==""||reg.test(i_0064))&&(i_0065==""||reg.test(i_0065))&&(i_0066==""||reg.test(i_0066))&&(i_0067==""||reg.test(i_0067))&&(i_0068==""||reg.test(i_0068))&&(i_0069==""||reg.test(i_0069))&&(i_00610==""||reg.test(i_00610))&&(i_00611==""||reg.test(i_00611))&&
		(i_0071==""||reg.test(i_0071))&&(i_0072==""||reg.test(i_0072))&&(i_0073==""||reg.test(i_0073))&&(i_0074==""||reg.test(i_0074))&&(i_0075==""||reg.test(i_0075))&&(i_0076==""||reg.test(i_0076))&&(i_0077==""||reg.test(i_0077))&&(i_0078==""||reg.test(i_0078))&&(i_0079==""||reg.test(i_0079))&&(i_00710==""||reg.test(i_00710))&&(i_00711==""||reg.test(i_00711))&&
		(i_0081==""||reg.test(i_0081))&&(i_0082==""||reg.test(i_0082))&&(i_0083==""||reg.test(i_0083))&&(i_0084==""||reg.test(i_0084))&&(i_0085==""||reg.test(i_0085))&&(i_0086==""||reg.test(i_0086))&&(i_0087==""||reg.test(i_0087))&&(i_0088==""||reg.test(i_0088))&&(i_0089==""||reg.test(i_0089))&&(i_00810==""||reg.test(i_00810))&&(i_00811==""||reg.test(i_00811))&&
		(i_0091==""||reg.test(i_0091))&&(i_0092==""||reg.test(i_0092))&&(i_0093==""||reg.test(i_0093))&&(i_0094==""||reg.test(i_0094))&&(i_0095==""||reg.test(i_0095))&&(i_0096==""||reg.test(i_0096))&&(i_0097==""||reg.test(i_0097))&&(i_0098==""||reg.test(i_0098))&&(i_0099==""||reg.test(i_0099))&&(i_00910==""||reg.test(i_00910))&&(i_00911==""||reg.test(i_00911))&&
		(i_0101==""||reg.test(i_0101))&&(i_0102==""||reg.test(i_0102))&&(i_0103==""||reg.test(i_0103))&&(i_0104==""||reg.test(i_0104))&&(i_0105==""||reg.test(i_0105))&&(i_0106==""||reg.test(i_0106))&&(i_0107==""||reg.test(i_0107))&&(i_0108==""||reg.test(i_0108))&&(i_0109==""||reg.test(i_0109))&&(i_01010==""||reg.test(i_01010))&&(i_01011==""||reg.test(i_01011))&&
		(i_0111==""||reg.test(i_0111))&&(i_0112==""||reg.test(i_0112))&&(i_0113==""||reg.test(i_0113))&&(i_0114==""||reg.test(i_0114))&&(i_0115==""||reg.test(i_0115))&&(i_0116==""||reg.test(i_0116))&&(i_0117==""||reg.test(i_0117))&&(i_0118==""||reg.test(i_0118))&&(i_0119==""||reg.test(i_0119))&&(i_01110==""||reg.test(i_01110))&&(i_01111==""||reg.test(i_01111))&&
		(i_0121==""||reg.test(i_0121))&&(i_0122==""||reg.test(i_0122))&&(i_0123==""||reg.test(i_0123))&&(i_0124==""||reg.test(i_0124))&&(i_0125==""||reg.test(i_0125))&&(i_0126==""||reg.test(i_0126))&&(i_0127==""||reg.test(i_0127))&&(i_0128==""||reg.test(i_0128))&&(i_0129==""||reg.test(i_0129))&&(i_01210==""||reg.test(i_01210))&&(i_01211==""||reg.test(i_01211))
		){
				//验证数据范围（不可为0和负数）
			    if((i_0011==""||i_0011>0)&&(i_0012==""||i_0012>0)&&(i_0013==""||i_0013>0)&&(i_0014==""||i_0014>0)&&(i_0015==""||i_0015>0)&&(i_0016==""||i_0016>0)&&(i_0017==""||i_0017>0)&&(i_0018==""||i_0018>0)&&(i_0019==""||i_0019>0)&&(i_00110==""||i_00110>0)&&(i_00111==""||i_00111>0)&&
				   (i_0021==""||i_0021>0)&&(i_0022==""||i_0022>0)&&(i_0023==""||i_0023>0)&&(i_0024==""||i_0024>0)&&(i_0025==""||i_0025>0)&&(i_0026==""||i_0026>0)&&(i_0027==""||i_0027>0)&&(i_0028==""||i_0028>0)&&(i_0029==""||i_0029>0)&&(i_00210==""||i_00210>0)&&(i_00211==""||i_00211>0)&&
				   (i_0031==""||i_0031>0)&&(i_0032==""||i_0032>0)&&(i_0033==""||i_0033>0)&&(i_0034==""||i_0034>0)&&(i_0035==""||i_0035>0)&&(i_0036==""||i_0036>0)&&(i_0037==""||i_0037>0)&&(i_0038==""||i_0038>0)&&(i_0039==""||i_0039>0)&&(i_00310==""||i_00310>0)&&(i_00311==""||i_00311>0)&&
				   (i_0041==""||i_0041>0)&&(i_0042==""||i_0042>0)&&(i_0043==""||i_0043>0)&&(i_0044==""||i_0044>0)&&(i_0045==""||i_0045>0)&&(i_0046==""||i_0046>0)&&(i_0047==""||i_0047>0)&&(i_0048==""||i_0048>0)&&(i_0049==""||i_0049>0)&&(i_00410==""||i_00410>0)&&(i_00411==""||i_00411>0)&&
				   (i_0051==""||i_0051>0)&&(i_0052==""||i_0052>0)&&(i_0053==""||i_0053>0)&&(i_0054==""||i_0054>0)&&(i_0055==""||i_0055>0)&&(i_0056==""||i_0056>0)&&(i_0057==""||i_0057>0)&&(i_0058==""||i_0058>0)&&(i_0059==""||i_0059>0)&&(i_00510==""||i_00510>0)&&(i_00511==""||i_00511>0)&&
			       (i_0061==""||i_0061>0)&&(i_0062==""||i_0062>0)&&(i_0063==""||i_0063>0)&&(i_0064==""||i_0064>0)&&(i_0065==""||i_0065>0)&&(i_0066==""||i_0066>0)&&(i_0067==""||i_0067>0)&&(i_0068==""||i_0068>0)&&(i_0069==""||i_0069>0)&&(i_00610==""||i_00610>0)&&(i_00611==""||i_00611>0)&&
			       (i_0071==""||i_0071>0)&&(i_0072==""||i_0072>0)&&(i_0073==""||i_0073>0)&&(i_0074==""||i_0074>0)&&(i_0075==""||i_0075>0)&&(i_0076==""||i_0076>0)&&(i_0077==""||i_0077>0)&&(i_0078==""||i_0078>0)&&(i_0079==""||i_0079>0)&&(i_00710==""||i_00710>0)&&(i_00711==""||i_00711>0)&&
			       (i_0081==""||i_0081>0)&&(i_0082==""||i_0082>0)&&(i_0083==""||i_0083>0)&&(i_0084==""||i_0084>0)&&(i_0085==""||i_0085>0)&&(i_0086==""||i_0086>0)&&(i_0087==""||i_0087>0)&&(i_0088==""||i_0088>0)&&(i_0089==""||i_0089>0)&&(i_00810==""||i_00810>0)&&(i_00811==""||i_00811>0)&&
			       (i_0091==""||i_0091>0)&&(i_0092==""||i_0092>0)&&(i_0093==""||i_0093>0)&&(i_0094==""||i_0094>0)&&(i_0095==""||i_0095>0)&&(i_0096==""||i_0096>0)&&(i_0097==""||i_0097>0)&&(i_0098==""||i_0098>0)&&(i_0099==""||i_0099>0)&&(i_00910==""||i_00910>0)&&(i_00911==""||i_00911>0)&&
			       (i_0101==""||i_0101>0)&&(i_0102==""||i_0102>0)&&(i_0103==""||i_0103>0)&&(i_0104==""||i_0104>0)&&(i_0105==""||i_0105>0)&&(i_0106==""||i_0106>0)&&(i_0107==""||i_0107>0)&&(i_0108==""||i_0108>0)&&(i_0109==""||i_0109>0)&&(i_01010==""||i_01010>0)&&(i_01011==""||i_01011>0)&&
			       (i_0111==""||i_0111>0)&&(i_0112==""||i_0112>0)&&(i_0113==""||i_0113>0)&&(i_0114==""||i_0114>0)&&(i_0115==""||i_0115>0)&&(i_0116==""||i_0116>0)&&(i_0117==""||i_0117>0)&&(i_0118==""||i_0118>0)&&(i_0119==""||i_0119>0)&&(i_01110==""||i_01110>0)&&(i_01111==""||i_01111>0)&&
			       (i_0121==""||i_0121>0)&&(i_0122==""||i_0122>0)&&(i_0123==""||i_0123>0)&&(i_0124==""||i_0124>0)&&(i_0125==""||i_0125>0)&&(i_0126==""||i_0126>0)&&(i_0127==""||i_0127>0)&&(i_0128==""||i_0128>0)&&(i_0129==""||i_0129>0)&&(i_01210==""||i_01210>0)&&(i_01211==""||i_01211>0)
			       ){			             
				        //验证具体算法（相加相等）					   
					          
					          //如果填写普通高校（民办为空）
					          if(i_0101==""&&i_0102==""&&i_0103==""&&i_0104==""&&i_0105==""&&i_0106==""&&i_0107==""&&i_0108==""&&i_0109==""&&i_01010==""&&i_01011==""&&
					          i_0111==""&&i_0112==""&&i_0113==""&&i_0114==""&&i_0115==""&&i_0116==""&&i_0117==""&&i_0118==""&&i_0119==""&&i_01110==""&&i_01111==""&&
					          i_0121==""&&i_0122==""&&i_0123==""&&i_0124==""&&i_0125==""&&i_0126==""&&i_0127==""&&i_0128==""&&i_0129==""&&i_01210==""&&i_01211==""
					          ){		
					                 //必须相加后才能比较相等，且条件中不可以连等
					                 //Number()方法可将空值转化为0计算
					                 //001=004+007
					                 var i__0011 = Number(i_0041)+Number(i_0071);
					                 var i__0012 = Number(i_0042)+Number(i_0072);
					                 var i__0013 = Number(i_0043)+Number(i_0073);
					                 var i__0014 = Number(i_0044)+Number(i_0074);
					                 var i__0015 = Number(i_0045)+Number(i_0075);
					                 var i__0016 = Number(i_0046)+Number(i_0076);
					                 var i__0017 = Number(i_0047)+Number(i_0077);
					                 var i__0018 = Number(i_0048)+Number(i_0078);
					                 var i__0019 = Number(i_0049)+Number(i_0079);
					                 var i__00110 = Number(i_00410)+Number(i_00710);
					                 var i__00111 = Number(i_00411)+Number(i_00711);
					                 //004=005+006
					                 var i__0101 = Number(i_0051)+Number(i_0061);
					                 var i__0102 = Number(i_0052)+Number(i_0062);
					                 var i__0103 = Number(i_0053)+Number(i_0063);
					                 var i__0104 = Number(i_0054)+Number(i_0064);
					                 var i__0105 = Number(i_0055)+Number(i_0065);
					                 var i__0106 = Number(i_0056)+Number(i_0066);
					                 var i__0107 = Number(i_0057)+Number(i_0067);
					                 var i__0108 = Number(i_0058)+Number(i_0068);
					                 var i__0109 = Number(i_0059)+Number(i_0069);
					                 var i__01010 = Number(i_00510)+Number(i_00610);
					                 var i__01011 = Number(i_00511)+Number(i_00611);
					                 //007=008+009
					                 var i__0071 = Number(i_0081)+Number(i_0091);
					                 var i__0072 = Number(i_0082)+Number(i_0092);
					                 var i__0073 = Number(i_0083)+Number(i_0093);
					                 var i__0074 = Number(i_0084)+Number(i_0094);
					                 var i__0075 = Number(i_0085)+Number(i_0095);
					                 var i__0076 = Number(i_0086)+Number(i_0096);
					                 var i__0077 = Number(i_0087)+Number(i_0097);
					                 var i__0078 = Number(i_0088)+Number(i_0098);
					                 var i__0079 = Number(i_0089)+Number(i_0099);
					                 var i__00710 = Number(i_00810)+Number(i_00910);
					                 var i__00711 = Number(i_00811)+Number(i_00911);	
					                 //验证列关系
					                 if(i_0011==i__0011&&i_0012==i__0012&&i_0013==i__0013&&i_0014==i__0014&&i_0015==i__0015&&i_0016==i__0016&&i_0017==i__0017&&i_0018==i__0018&&i_0019==i__0019&&i_00110==i__00110&&i_00111==i__00111){
					                     if(i_0041==i__0101&&i_0042==i__0102&&i_0043==i__0103&&i_0044==i__0104&&i_0045==i__0105&&i_0046==i__0106&&i_0047==i__0107&&i_0048==i__0108&&i_0049==i__0109&&i_00410==i__01010&&i_00411==i__01011&&
					                     i_0071==i__0071&&i_0072==i__0072&&i_0073==i__0073&&i_0074==i__0074&&i_0075==i__0075&&i_0076==i__0076&&i_0077==i__0077&&i_0078==i__0078&&i_0079==i__0079&&i_00710==i__00710&&i_00711==i__00711
					                 ){	           
					                         //1=2+7  
					                         var a = Number(i_0012)+Number(i_0017); 
					                         var b = Number(i_0022)+Number(i_0027);
					                         var c = Number(i_0032)+Number(i_0037);
					                         var d = Number(i_0042)+Number(i_0047);
					                         var e = Number(i_0052)+Number(i_0057);
					                         var f = Number(i_0062)+Number(i_0067);
					                         var g = Number(i_0072)+Number(i_0077);
					                         var h = Number(i_0082)+Number(i_0087);
					                         var i = Number(i_0092)+Number(i_0097);  
					                         //2=3+4
					                         var j = Number(i_0013)+Number(i_0014);
					                         var k = Number(i_0023)+Number(i_0024);
					                         var l = Number(i_0033)+Number(i_0034);
					                         var m = Number(i_0043)+Number(i_0044);
					                         var n = Number(i_0053)+Number(i_0054);
					                         var o = Number(i_0063)+Number(i_0064);
					                         var p = Number(i_0073)+Number(i_0074);
					                         var q = Number(i_0083)+Number(i_0084);
					                         var r = Number(i_0093)+Number(i_0094);					                                                         
							                 //验证行关系
							                 if(i_0011==a&&i_0021==b&&i_0031==c&&i_0041==d&&i_0051==e&&i_0061==f&&i_0071==g&&i_0081==h&&i_0091==i){
							                     if(i_0012==j&&i_0022==k&&i_0032==l&&i_0042==m&&i_0052==n&&i_0062==o&&i_0072==p&&i_0082==q&&i_0092==r
							                     ){
							                      //进行提交							                     			                    				                   
 		 	 				                      doSubmit();
							                      return true;	
							                      }else{
							                      alert("校验失败，不符合规则：2列=3列+4列！");
								                  return false;
								                  }
							                 }else{
								                  alert("校验失败，不符合规则：1列=2列+7列！");
								                  return false;
							                 }
							               }	
							               else{
							                alert("校验失败，不符合规则：004行=005行+006行,007行=008行+009行！");
								            return false;
							               }
							         }else{
							            alert("校验失败，不符合规则：001行=004行+007行！");
								        return false;
							         }		          	          
					          }
					          //如果填写民办高校（普通为空，研究生为空）
					          else if(i_0041==""&&i_0042==""&&i_0043==""&&i_0044==""&&i_0045==""&&i_0046==""&&i_0047==""&&i_0048==""&&i_0049==""&&i_00410==""&&i_00411==""&&
					          i_0051==""&&i_0052==""&&i_0053==""&&i_0054==""&&i_0055==""&&i_0056==""&&i_0057==""&&i_0058==""&&i_0059==""&&i_00510==""&&i_00511==""&&
					          i_0061==""&&i_0062==""&&i_0063==""&&i_0064==""&&i_0065==""&&i_0066==""&&i_0067==""&&i_0068==""&&i_0069==""&&i_00610==""&&i_00611==""&&
					          i_0071==""&&i_0072==""&&i_0073==""&&i_0074==""&&i_0075==""&&i_0076==""&&i_0077==""&&i_0078==""&&i_0079==""&&i_00710==""&&i_00711==""&&
					          i_0081==""&&i_0082==""&&i_0083==""&&i_0084==""&&i_0085==""&&i_0086==""&&i_0087==""&&i_0088==""&&i_0089==""&&i_00810==""&&i_00811==""&&
					          i_0091==""&&i_0092==""&&i_0093==""&&i_0094==""&&i_0095==""&&i_0096==""&&i_0097==""&&i_0098==""&&i_0099==""&&i_00910==""&&i_00911==""
					          ){
					                 //必须相加后才能比较相等，且条件中不可以连等
					                 //Number()方法可将空值转化为0计算
					                 //001=010
					                 var i__0011 = Number(i_0101);
					                 var i__0012 = Number(i_0102);
					                 var i__0013 = Number(i_0103);
					                 var i__0014 = Number(i_0104);
					                 var i__0015 = Number(i_0105);
					                 var i__0016 = Number(i_0106);
					                 var i__0017 = Number(i_0107);
					                 var i__0018 = Number(i_0108);
					                 var i__0019 = Number(i_0109);
					                 var i__00110 = Number(i_01010);
					                 var i__00111 = Number(i_01011);
					                 //010=011+012
					                 var i__0101 = Number(i_0111)+Number(i_0121);
					                 var i__0102 = Number(i_0112)+Number(i_0122);
					                 var i__0103 = Number(i_0113)+Number(i_0123);
					                 var i__0104 = Number(i_0114)+Number(i_0124);
					                 var i__0105 = Number(i_0115)+Number(i_0125);
					                 var i__0106 = Number(i_0116)+Number(i_0126);
					                 var i__0107 = Number(i_0117)+Number(i_0127);
					                 var i__0108 = Number(i_0118)+Number(i_0128);
					                 var i__0109 = Number(i_0119)+Number(i_0129);
					                 var i__01010 = Number(i_01110)+Number(i_01210);
					                 var i__01011 = Number(i_01111)+Number(i_01211);
					               	
					                 //验证列关系
					                 if(i_0011==i__0011&&i_0012==i__0012&&i_0013==i__0013&&i_0014==i__0014&&i_0015==i__0015&&i_0016==i__0016&&i_0017==i__0017&&i_0018==i__0018&&i_0019==i__0019&&i_00110==i__00110&&i_00111==i__00111){
					                    if(i_0101==i__0101&&i_0102==i__0102&&i_0103==i__0103&&i_0104==i__0104&&i_0105==i__0105&&i_0106==i__0106&&i_0107==i__0107&&i_0108==i__0108&&i_0109==i__0109&&i_01010==i__01010&&i_01011==i__01011
					                    ){           
					                         //1=2+7  
					                         var a = Number(i_0012)+Number(i_0017); 
					                         var b = Number(i_0022)+Number(i_0027);
					                         var c = Number(i_0032)+Number(i_0037);
					                         var d = Number(i_0042)+Number(i_0047);
					                         var e = Number(i_0052)+Number(i_0057);
					                         var f = Number(i_0062)+Number(i_0067);
					                         var g = Number(i_0072)+Number(i_0077);
					                         var h = Number(i_0082)+Number(i_0087);
					                         var i = Number(i_0092)+Number(i_0097);  
					                         //2=3+4
					                         var j = Number(i_0013)+Number(i_0014);
					                         var k = Number(i_0023)+Number(i_0024);
					                         var l = Number(i_0033)+Number(i_0034);
					                         var m = Number(i_0043)+Number(i_0044);
					                         var n = Number(i_0053)+Number(i_0054);
					                         var o = Number(i_0063)+Number(i_0064);
					                         var p = Number(i_0073)+Number(i_0074);
					                         var q = Number(i_0083)+Number(i_0084);
					                         var r = Number(i_0093)+Number(i_0094);					                                                         
								                 //验证行关系
								                 if(i_0011==a&&i_0021==b&&i_0031==c&&i_0041==d&&i_0051==e&&i_0061==f&&i_0071==g&&i_0081==h&&i_0091==i){
								                    if(i_0012==j&&i_0022==k&&i_0032==l&&i_0042==m&&i_0052==n&&i_0062==o&&i_0072==p&&i_0082==q&&i_0092==r
								                    ){
								                      //进行提交								             		                    				                   
		 	 				                          doSubmit();
								                      return true;	
								                 }else{
									                  alert("校验失败，不符合规则：2列=3列+4列！");
									                  return false;
								                 }	
								                 }else{
								                      alert("校验失败，不符合规则：1列=2列+7列！");
									                  return false;
								                 }
							                 }else{
							                 alert("校验失败，不符合规则：010行=011行+012行！");
								              return false;
							                 }
							         }else{
							            alert("校验失败，不符合规则：001行=010行！");
								        return false;
							         }		          	       
					          
					        
					          }else{
					             alert("校验失败，不符合规则：普通高校和民办高校只能选择一个填写！");
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
							<b></b><strong>填写表三</strong>
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
						<table border="1" cellspacing="0" cellpadding="0">
							<tr>
								<td colspan="15" align="center">2017年全国高校学生党员队伍结构和党组织基本状况统计表</td>
							</tr>
							<tr>
								<td colspan="15">填报单位（盖章）：</td>
							</tr>
							<tr align="center">
								<td rowspan="3" colspan="3"></td>
								<td rowspan="3">列号</td>
								<td colspan="11">在校生党员队伍结构</td>
							</tr>
							<tr align="center">
								<td rowspan="2">在校生总数</td>
								<td colspan="5">学生党员情况</td>
								<td colspan="4">申请入党情况</td>
								<td rowspan="2">学生党支部数</td>
							</tr>
							<tr align="center">
								<td>党员总数</td>
								<td>预备党员</td>
								<td>正式党员</td>
								<td>当年发展党员数</td>
								<td>党员占学生总数的比例</td>
								<td>非党员学生数</td>
								<td>申请入党学生数</td>
								<td>入党积极分子数</td>
								<td>非党员学生申请入党比例</td>
							</tr>
							<tr align="center">
								<td colspan="3">行号</td>
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
							</tr>
							<tr align="center">
								<td colspan="3">总计</td>
								<td>001</td>
								<td><input id="0011" type="text" name="dataMap['0011']" style="border:0px" size="3px" value="${dataMap['0011']}">
								</td>
								<td><input id="0012" type="text" name="dataMap['0012']" style="border:0px" size="3px" value="${dataMap['0012']}">
								</td>
								<td><input id="0013" type="text" name="dataMap['0013']" style="border:0px" size="3px" value="${dataMap['0013']}">
								</td>
								<td><input id="0014" type="text" name="dataMap['0014']" style="border:0px" size="3px" value="${dataMap['0014']}">
								</td>
								<td><input id="0015" type="text" name="dataMap['0015']" style="border:0px" size="3px" value="${dataMap['0015']}">
								</td>
								<td><input id="0016" type="text" name="dataMap['0016']" style="border:0px" size="3px" value="${dataMap['0016']}">
								</td>
								<td><input id="0017" type="text" name="dataMap['0017']" style="border:0px" size="3px" value="${dataMap['0017']}">
								</td>
								<td><input id="0018" type="text" name="dataMap['0018']" style="border:0px" size="3px" value="${dataMap['0018']}">
								</td>
								<td><input id="0019" type="text" name="dataMap['0019']" style="border:0px" size="3px" value="${dataMap['0019']}">
								</td>
								<td><input id="00110" type="text" name="dataMap['00110']" style="border:0px" size="3px" value="${dataMap['00110']}">
								</td>
								<td><input id="00111" type="text" name="dataMap['00111']" style="border:0px" size="3px" value="${dataMap['00111']}">
								</td>
							</tr>
							<tr align="center">
								<td colspan="3">其中少数民族数量</td>
								<td>002</td>
								<td><input id="0021" type="text" name="dataMap['0021']" style="border:0px" size="3px" value="${dataMap['0021']}">
								</td>
								<td><input id="0022" type="text" name="dataMap['0022']" style="border:0px" size="3px" value="${dataMap['0022']}">
								</td>
								<td><input id="0023" type="text" name="dataMap['0023']" style="border:0px" size="3px" value="${dataMap['0023']}">
								</td>
								<td><input id="0024" type="text" name="dataMap['0024']" style="border:0px" size="3px" value="${dataMap['0024']}">
								</td>
								<td><input id="0025" type="text" name="dataMap['0025']" style="border:0px" size="3px" value="${dataMap['0025']}">
								</td>
								<td><input id="0026" type="text" name="dataMap['0026']" style="border:0px" size="3px" value="${dataMap['0026']}">
								</td>
								<td><input id="0027" type="text" name="dataMap['0027']" style="border:0px" size="3px" value="${dataMap['0027']}">
								</td>
								<td><input id="0028" type="text" name="dataMap['0028']" style="border:0px" size="3px" value="${dataMap['0028']}">
								</td>
								<td><input id="0029" type="text" name="dataMap['0029']" style="border:0px" size="3px" value="${dataMap['0029']}">
								</td>
								<td><input id="00210" type="text" name="dataMap['00210']" style="border:0px" size="3px" value="${dataMap['00210']}">
								</td>
								<td><input id="00211" type="text" name="dataMap['00211']" style="border:0px" size="3px" value="${dataMap['00211']}">
								</td>
							</tr>
							<tr align="center">
								<td colspan="3">其中女生数量</td>
								<td>003</td>
								<td><input id="0031" type="text" name="dataMap['0031']" style="border:0px" size="3px" value="${dataMap['0031']}">
								</td>
								<td><input id="0032" type="text" name="dataMap['0032']" style="border:0px" size="3px" value="${dataMap['0032']}">
								</td>
								<td><input id="0033" type="text" name="dataMap['0033']" style="border:0px" size="3px" value="${dataMap['0033']}">
								</td>
								<td><input id="0034" type="text" name="dataMap['0034']" style="border:0px" size="3px" value="${dataMap['0034']}">
								</td>
								<td><input id="0035" type="text" name="dataMap['0035']" style="border:0px" size="3px" value="${dataMap['0035']}">
								</td>
								<td><input id="0036" type="text" name="dataMap['0036']" style="border:0px" size="3px" value="${dataMap['0036']}">
								</td>
								<td><input id="0037" type="text" name="dataMap['0037']" style="border:0px" size="3px" value="${dataMap['0037']}">
								</td>
								<td><input id="0038" type="text" name="dataMap['0038']" style="border:0px" size="3px" value="${dataMap['0038']}">
								</td>
								<td><input id="0039" type="text" name="dataMap['0039']" style="border:0px" size="3px" value="${dataMap['0039']}">
								</td>
								<td><input id="00310" type="text" name="dataMap['00310']" style="border:0px" size="3px" value="${dataMap['00310']}">
								</td>
								<td><input id="00311" type="text" name="dataMap['00311']" style="border:0px" size="3px" value="${dataMap['00311']}">
								</td>
							</tr>
							<tr align="center">
								<td rowspan="9">合计</td>
								<td rowspan="3">研究生</td>
								<td>小计</td>
								<td>004</td>
								<td><input id="0041" type="text" name="dataMap['0041']" style="border:0px" size="3px" value="${dataMap['0041']}">
								</td>
								<td><input id="0042" type="text" name="dataMap['0042']" style="border:0px" size="3px" value="${dataMap['0042']}">
								</td>
								<td><input id="0043" type="text" name="dataMap['0043']" style="border:0px" size="3px" value="${dataMap['0043']}">
								</td>
								<td><input id="0044" type="text" name="dataMap['0044']" style="border:0px" size="3px" value="${dataMap['0044']}">
								</td>
								<td><input id="0045" type="text" name="dataMap['0045']" style="border:0px" size="3px" value="${dataMap['0045']}">
								</td>
								<td><input id="0046" type="text" name="dataMap['0046']" style="border:0px" size="3px" value="${dataMap['0046']}">
								</td>
								<td><input id="0047" type="text" name="dataMap['0047']" style="border:0px" size="3px" value="${dataMap['0047']}">
								</td>
								<td><input id="0048" type="text" name="dataMap['0048']" style="border:0px" size="3px" value="${dataMap['0048']}">
								</td>
								<td><input id="0049" type="text" name="dataMap['0049']" style="border:0px" size="3px" value="${dataMap['0049']}">
								</td>
								<td><input id="00410" type="text" name="dataMap['00410']" style="border:0px" size="3px" value="${dataMap['00410']}">
								</td>
								<td><input id="00411" type="text" name="dataMap['00411']" style="border:0px" size="3px" value="${dataMap['00411']}">
								</td>
							</tr>
							<tr align="center">
								<td>博士</td>
								<td>005</td>
								<td><input id="0051" type="text" name="dataMap['0051']" style="border:0px" size="3px" value="${dataMap['0051']}">
								</td>
								<td><input id="0052" type="text" name="dataMap['0052']" style="border:0px" size="3px" value="${dataMap['0052']}">
								</td>
								<td><input id="0053" type="text" name="dataMap['0053']" style="border:0px" size="3px" value="${dataMap['0053']}">
								</td>
								<td><input id="0054" type="text" name="dataMap['0054']" style="border:0px" size="3px" value="${dataMap['0054']}">
								</td>
								<td><input id="0055" type="text" name="dataMap['0055']" style="border:0px" size="3px" value="${dataMap['0055']}">
								</td>
								<td><input id="0056" type="text" name="dataMap['0056']" style="border:0px" size="3px" value="${dataMap['0056']}">
								</td>
								<td><input id="0057" type="text" name="dataMap['0057']" style="border:0px" size="3px" value="${dataMap['0057']}">
								</td>
								<td><input id="0058" type="text" name="dataMap['0058']" style="border:0px" size="3px" value="${dataMap['0058']}">
								</td>
								<td><input id="0059" type="text" name="dataMap['0059']" style="border:0px" size="3px" value="${dataMap['0059']}">
								</td>
								<td><input id="00510" type="text" name="dataMap['00510']" style="border:0px" size="3px" value="${dataMap['00510']}">
								</td>
								<td><input id="00511" type="text" name="dataMap['00511']" style="border:0px" size="3px" value="${dataMap['00511']}">
								</td>
							</tr>
							<tr align="center">
								<td>硕士</td>
								<td>006</td>
								<td><input id="0061" type="text" name="dataMap['0061']" style="border:0px" size="3px" value="${dataMap['0061']}">
								</td>
								<td><input id="0062" type="text" name="dataMap['0062']" style="border:0px" size="3px" value="${dataMap['0062']}">
								</td>
								<td><input id="0063" type="text" name="dataMap['0063']" style="border:0px" size="3px" value="${dataMap['0063']}">
								</td>
								<td><input id="0064" type="text" name="dataMap['0064']" style="border:0px" size="3px" value="${dataMap['0064']}">
								</td>
								<td><input id="0065" type="text" name="dataMap['0065']" style="border:0px" size="3px" value="${dataMap['0065']}">
								</td>
								<td><input id="0066" type="text" name="dataMap['0066']" style="border:0px" size="3px" value="${dataMap['0066']}">
								</td>
								<td><input id="0067" type="text" name="dataMap['0067']" style="border:0px" size="3px" value="${dataMap['0067']}">
								</td>
								<td><input id="0068" type="text" name="dataMap['0068']" style="border:0px" size="3px" value="${dataMap['0068']}">
								</td>
								<td><input id="0069" type="text" name="dataMap['0069']" style="border:0px" size="3px" value="${dataMap['0069']}">
								</td>
								<td><input id="00610" type="text" name="dataMap['00610']" style="border:0px" size="3px" value="${dataMap['00610']}">
								</td>
								<td><input id="00611" type="text" name="dataMap['00611']" style="border:0px" size="3px" value="${dataMap['00611']}">
								</td>
							</tr>
							<tr align="center">
								<td rowspan="3">普通高校本专科</td>
								<td>小计</td>
								<td>007</td>
								<td><input id="0071" type="text" name="dataMap['0071']" style="border:0px" size="3px" value="${dataMap['0071']}">
								</td>
								<td><input id="0072" type="text" name="dataMap['0072']" style="border:0px" size="3px" value="${dataMap['0072']}">
								</td>
								<td><input id="0073" type="text" name="dataMap['0073']" style="border:0px" size="3px" value="${dataMap['0073']}">
								</td>
								<td><input id="0074" type="text" name="dataMap['0074']" style="border:0px" size="3px" value="${dataMap['0074']}">
								</td>
								<td><input id="0075" type="text" name="dataMap['0075']" style="border:0px" size="3px" value="${dataMap['0075']}">
								</td>
								<td><input id="0076" type="text" name="dataMap['0076']" style="border:0px" size="3px" value="${dataMap['0076']}">
								</td>
								<td><input id="0077" type="text" name="dataMap['0077']" style="border:0px" size="3px" value="${dataMap['0077']}">
								</td>
								<td><input id="0078" type="text" name="dataMap['0078']" style="border:0px" size="3px" value="${dataMap['0078']}">
								</td>
								<td><input id="0079" type="text" name="dataMap['0079']" style="border:0px" size="3px" value="${dataMap['0079']}">
								</td>
								<td><input id="00710" type="text" name="dataMap['00710']" style="border:0px" size="3px" value="${dataMap['00710']}">
								</td>
								<td><input id="00711" type="text" name="dataMap['00711']" style="border:0px" size="3px" value="${dataMap['00711']}">
								</td>
							</tr>
							<tr align="center">
								<td>本科</td>
								<td>008</td>
								<td><input id="0081" type="text" name="dataMap['0081']" style="border:0px" size="3px" value="${dataMap['0081']}">
								</td>
								<td><input id="0082" type="text" name="dataMap['0082']" style="border:0px" size="3px" value="${dataMap['0082']}">
								</td>
								<td><input id="0083" type="text" name="dataMap['0083']" style="border:0px" size="3px" value="${dataMap['0083']}">
								</td>
								<td><input id="0084" type="text" name="dataMap['0084']" style="border:0px" size="3px" value="${dataMap['0084']}">
								</td>
								<td><input id="0085" type="text" name="dataMap['0085']" style="border:0px" size="3px" value="${dataMap['0085']}">
								</td>
								<td><input id="0086" type="text" name="dataMap['0086']" style="border:0px" size="3px" value="${dataMap['0086']}">
								</td>
								<td><input id="0087" type="text" name="dataMap['0087']" style="border:0px" size="3px" value="${dataMap['0087']}">
								</td>
								<td><input id="0088" type="text" name="dataMap['0088']" style="border:0px" size="3px" value="${dataMap['0088']}">
								</td>
								<td><input id="0089" type="text" name="dataMap['0089']" style="border:0px" size="3px" value="${dataMap['0089']}">
								</td>
								<td><input id="00810" type="text" name="dataMap['00810']" style="border:0px" size="3px" value="${dataMap['00810']}">
								</td>
								<td><input id="00811" type="text" name="dataMap['00811']" style="border:0px" size="3px" value="${dataMap['00811']}">
								</td>
							</tr>
							<tr align="center">
								<td>专科</td>
								<td>009</td>
					            <td><input id="0091" type="text" name="dataMap['0091']" style="border:0px" size="3px" value="${dataMap['0091']}">
								</td>
								<td><input id="0092" type="text" name="dataMap['0092']" style="border:0px" size="3px" value="${dataMap['0092']}">
								</td>
								<td><input id="0093" type="text" name="dataMap['0093']" style="border:0px" size="3px" value="${dataMap['0093']}">
								</td>
								<td><input id="0094" type="text" name="dataMap['0094']" style="border:0px" size="3px" value="${dataMap['0094']}">
								</td>
								<td><input id="0095" type="text" name="dataMap['0095']" style="border:0px" size="3px" value="${dataMap['0095']}">
								</td>
								<td><input id="0096" type="text" name="dataMap['0096']" style="border:0px" size="3px" value="${dataMap['0096']}">
								</td>
								<td><input id="0097" type="text" name="dataMap['0097']" style="border:0px" size="3px" value="${dataMap['0097']}">
								</td>
								<td><input id="0098" type="text" name="dataMap['0098']" style="border:0px" size="3px" value="${dataMap['0098']}">
								</td>
								<td><input id="0099" type="text" name="dataMap['0099']" style="border:0px" size="3px" value="${dataMap['0099']}">
								</td>
								<td><input id="00910" type="text" name="dataMap['00910']" style="border:0px" size="3px" value="${dataMap['00910']}">
								</td>
								<td><input id="00911" type="text" name="dataMap['00911']" style="border:0px" size="3px" value="${dataMap['00911']}">
								</td>
							</tr>
							<tr align="center"0>
								<td rowspan="3">民办高校（含独立院校本专科）</td>
								<td>小计</td>
								<td>010</td>
					            <td><input id="0101" type="text" name="dataMap['0101']" style="border:0px" size="3px" value="${dataMap['0101']}">
								</td>
								<td><input id="0102" type="text" name="dataMap['0102']" style="border:0px" size="3px" value="${dataMap['0102']}">
								</td>
								<td><input id="0103" type="text" name="dataMap['0103']" style="border:0px" size="3px" value="${dataMap['0103']}">
								</td>
								<td><input id="0104" type="text" name="dataMap['0104']" style="border:0px" size="3px" value="${dataMap['0104']}">
								</td>
								<td><input id="0105" type="text" name="dataMap['0105']" style="border:0px" size="3px" value="${dataMap['0105']}">
								</td>
								<td><input id="0106" type="text" name="dataMap['0106']" style="border:0px" size="3px" value="${dataMap['0106']}">
								</td>
								<td><input id="0107" type="text" name="dataMap['0107']" style="border:0px" size="3px" value="${dataMap['0107']}">
								</td>
								<td><input id="0108" type="text" name="dataMap['0108']" style="border:0px" size="3px" value="${dataMap['0108']}">
								</td>
								<td><input id="0109" type="text" name="dataMap['0109']" style="border:0px" size="3px" value="${dataMap['0109']}">
								</td>
								<td><input id="01010" type="text" name="dataMap['01010']" style="border:0px" size="3px" value="${dataMap['01010']}">
								</td>
								<td><input id="01011" type="text" name="dataMap['01011']" style="border:0px" size="3px" value="${dataMap['01011']}">
								</td>
							</tr>
							<tr align="center">
								<td>本科</td>
								<td>011</td>
						        <td><input id="0111" type="text" name="dataMap['0111']" style="border:0px" size="3px" value="${dataMap['0111']}">
								</td>
								<td><input id="0112" type="text" name="dataMap['0112']" style="border:0px" size="3px" value="${dataMap['0112']}">
								</td>
								<td><input id="0113" type="text" name="dataMap['0113']" style="border:0px" size="3px" value="${dataMap['0113']}">
								</td>
								<td><input id="0114" type="text" name="dataMap['0114']" style="border:0px" size="3px" value="${dataMap['0114']}">
								</td>
								<td><input id="0115" type="text" name="dataMap['0115']" style="border:0px" size="3px" value="${dataMap['0115']}">
								</td>
								<td><input id="0116" type="text" name="dataMap['0116']" style="border:0px" size="3px" value="${dataMap['0116']}">
								</td>
								<td><input id="0117" type="text" name="dataMap['0117']" style="border:0px" size="3px" value="${dataMap['0117']}">
								</td>
								<td><input id="0118" type="text" name="dataMap['0118']" style="border:0px" size="3px" value="${dataMap['0118']}">
								</td>
								<td><input id="0119" type="text" name="dataMap['0119']" style="border:0px" size="3px" value="${dataMap['0119']}">
								</td>
								<td><input id="01110" type="text" name="dataMap['01110']" style="border:0px" size="3px" value="${dataMap['01110']}">
								</td>
								<td><input id="01111" type="text" name="dataMap['01111']" style="border:0px" size="3px" value="${dataMap['01111']}">
								</td>
							</tr>
							<tr align="center">
								<td>专科</td>
								<td>012</td>
					            <td><input id="0121" type="text" name="dataMap['0121']" style="border:0px" size="3px" value="${dataMap['0121']}">
								</td>
								<td><input id="0122" type="text" name="dataMap['0122']" style="border:0px" size="3px" value="${dataMap['0122']}">
								</td>
								<td><input id="0123" type="text" name="dataMap['0123']" style="border:0px" size="3px" value="${dataMap['0123']}">
								</td>
								<td><input id="0124" type="text" name="dataMap['0124']" style="border:0px" size="3px" value="${dataMap['0124']}">
								</td>
								<td><input id="0125" type="text" name="dataMap['0125']" style="border:0px" size="3px" value="${dataMap['0125']}">
								</td>
								<td><input id="0126" type="text" name="dataMap['0126']" style="border:0px" size="3px" value="${dataMap['0126']}">
								</td>
								<td><input id="0127" type="text" name="dataMap['0127']" style="border:0px" size="3px" value="${dataMap['0127']}">
								</td>
								<td><input id="0128" type="text" name="dataMap['0128']" style="border:0px" size="3px" value="${dataMap['0128']}">
								</td>
								<td><input id="0129" type="text" name="dataMap['0129']" style="border:0px" size="3px" value="${dataMap['0129']}">
								</td>
								<td><input id="01210" type="text" name="dataMap['01210']" style="border:0px" size="3px" value="${dataMap['01210']}">
								</td>
								<td><input id="01211" type="text" name="dataMap['01211']" style="border:0px" size="3px" value="${dataMap['01211']}">
								</td>
							</tr>
							<tr>
								<td align="center">说明</td>
								<td align="left" colspan="14">1.本表行列关系如下：如，列关系：001=004+007+010，行关系：1=2+7；2=3+4;</td>
							</tr>
							<tr>
								<td></td>
								<td colspan="14">2.统计数据截至2017年6月30日。</td>
							</tr>
						</table>
					</div>
				</div>
			</div>
		</div>
	</form>

</body>
</html>