<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>用户管理</title>
<%@include file="/common/header.jsp"%>
<script type="text/javascript">
	//模版下载
	function doEmportExcel() {
		document.forms[0].action="{basePath}sheet/down_sheetTwo.action";
		document.forms[0].submit();
	}
	function doImportExcel() { 
		alert("请务必导入对应表格的数据");
		document.forms[0].action="{basePath}sheet/sheet_importTwoExcel.action";
		document.forms[0].submit();
	}
	//提交
	function doSubmit(){
		if(confirm("确认提交吗？")){
		document.forms[0].action="{basePath}sheet/sheet_doSubmitTwo.action";
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
	    var i_0114 = document.getElementById("0114").value;
	    var i_0115 = document.getElementById("0115").value;
	    var i_0116 = document.getElementById("0116").value;
	    var i_0117 = document.getElementById("0117").value;
	    var i_0118 = document.getElementById("0118").value;
	    var i_0119 = document.getElementById("0119").value;
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
	    var i_0214 = document.getElementById("0214").value;
	    var i_0215 = document.getElementById("0215").value;
	    var i_0216 = document.getElementById("0216").value;
	    var i_0217 = document.getElementById("0217").value;
	    var i_0218 = document.getElementById("0218").value;
	    var i_0219 = document.getElementById("0219").value;
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
	    var i_0314 = document.getElementById("0314").value;
	    var i_0315 = document.getElementById("0315").value;
	    var i_0316 = document.getElementById("0316").value;
	    var i_0317 = document.getElementById("0317").value;
	    var i_0318 = document.getElementById("0318").value;
	    var i_0319 = document.getElementById("0319").value;
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
	    var i_0414 = document.getElementById("0414").value;
	    var i_0415 = document.getElementById("0415").value;
	    var i_0416 = document.getElementById("0416").value;
	    var i_0417 = document.getElementById("0417").value;
	    var i_0418 = document.getElementById("0418").value;
	    var i_0419 = document.getElementById("0419").value;
	    var i_051 = document.getElementById("051").value;
	    var i_052 = document.getElementById("052").value;
	    var i_053 = document.getElementById("053").value;
	    var i_054 = document.getElementById("054").value;
	    var i_055 = document.getElementById("055").value;
	    var i_056 = document.getElementById("056").value;
	    var i_057 = document.getElementById("057").value;
	    var i_058 = document.getElementById("058").value;
	    var i_059 = document.getElementById("059").value;
	    var i_0510 = document.getElementById("0510").value;
	    var i_0511 = document.getElementById("0511").value;
	    var i_0512 = document.getElementById("0512").value;
	    var i_0513 = document.getElementById("0513").value;
	    var i_0514 = document.getElementById("0514").value;
	    var i_0515 = document.getElementById("0515").value;
	    var i_0516 = document.getElementById("0516").value;
	    var i_0517 = document.getElementById("0517").value;
	    var i_0518 = document.getElementById("0518").value;
	    var i_0519 = document.getElementById("0519").value;
	    var i_061 = document.getElementById("061").value;
	    var i_062 = document.getElementById("062").value;
	    var i_063 = document.getElementById("063").value;
	    var i_064 = document.getElementById("064").value;
	    var i_065 = document.getElementById("065").value;
	    var i_066 = document.getElementById("066").value;
	    var i_067 = document.getElementById("067").value;
	    var i_068 = document.getElementById("068").value;
	    var i_069 = document.getElementById("069").value;
	    var i_0610 = document.getElementById("0610").value;
	    var i_0611 = document.getElementById("0611").value;
	    var i_0612 = document.getElementById("0612").value;
	    var i_0613 = document.getElementById("0613").value;
	    var i_0614 = document.getElementById("0614").value;
	    var i_0615 = document.getElementById("0615").value;
	    var i_0616 = document.getElementById("0616").value;
	    var i_0617 = document.getElementById("0617").value;
	    var i_0618 = document.getElementById("0618").value;
	    var i_0619 = document.getElementById("0619").value;
		var reg = /^[0-9]+\.{0,1}[0-9]{0,2}$/;
		//验证数据格式
		if((i_011==""||reg.test(i_011))&&(i_012==""||reg.test(i_012))&&(i_013==""||reg.test(i_013))&&(i_014==""||reg.test(i_014))&&(i_015==""||reg.test(i_015))&&(i_016==""||reg.test(i_016))&&(i_017==""||reg.test(i_017))&&(i_018==""||reg.test(i_018))&&(i_019==""||reg.test(i_019))&&(i_0110==""||reg.test(i_0110))&&(i_0111==""||reg.test(i_0111))&&(i_0112==""||reg.test(i_0112))&&(i_0113==""||reg.test(i_0113))&&(i_0114==""||reg.test(i_0114))&&(i_0115==""||reg.test(i_0115))&&(i_0116==""||reg.test(i_0116))&&(i_0117==""||reg.test(i_0117))&&(i_0118==""||reg.test(i_0118))&&(i_0119==""||reg.test(i_0119))&&
           (i_021==""||reg.test(i_021))&&(i_022==""||reg.test(i_022))&&(i_023==""||reg.test(i_023))&&(i_024==""||reg.test(i_024))&&(i_025==""||reg.test(i_025))&&(i_026==""||reg.test(i_026))&&(i_027==""||reg.test(i_027))&&(i_028==""||reg.test(i_028))&&(i_029==""||reg.test(i_029))&&(i_0210==""||reg.test(i_0210))&&(i_0211==""||reg.test(i_0211))&&(i_0212==""||reg.test(i_0212))&&(i_0213==""||reg.test(i_0213))&&(i_0214==""||reg.test(i_0214))&&(i_0215==""||reg.test(i_0215))&&(i_0216==""||reg.test(i_0216))&&(i_0217==""||reg.test(i_0217))&&(i_0218==""||reg.test(i_0218))&&(i_0219==""||reg.test(i_0219))&&	
           (i_031==""||reg.test(i_031))&&(i_032==""||reg.test(i_032))&&(i_033==""||reg.test(i_033))&&(i_034==""||reg.test(i_034))&&(i_035==""||reg.test(i_035))&&(i_036==""||reg.test(i_036))&&(i_037==""||reg.test(i_037))&&(i_038==""||reg.test(i_038))&&(i_039==""||reg.test(i_039))&&(i_0310==""||reg.test(i_0310))&&(i_0311==""||reg.test(i_0311))&&(i_0312==""||reg.test(i_0312))&&(i_0313==""||reg.test(i_0313))&&(i_0314==""||reg.test(i_0314))&&(i_0315==""||reg.test(i_0315))&&(i_0316==""||reg.test(i_0316))&&(i_0317==""||reg.test(i_0317))&&(i_0318==""||reg.test(i_0318))&&(i_0319==""||reg.test(i_0319))&&	
           (i_041==""||reg.test(i_041))&&(i_042==""||reg.test(i_042))&&(i_043==""||reg.test(i_043))&&(i_044==""||reg.test(i_044))&&(i_045==""||reg.test(i_045))&&(i_046==""||reg.test(i_046))&&(i_047==""||reg.test(i_047))&&(i_048==""||reg.test(i_048))&&(i_049==""||reg.test(i_049))&&(i_0410==""||reg.test(i_0410))&&(i_0411==""||reg.test(i_0411))&&(i_0412==""||reg.test(i_0412))&&(i_0413==""||reg.test(i_0413))&&(i_0414==""||reg.test(i_0414))&&(i_0415==""||reg.test(i_0415))&&(i_0416==""||reg.test(i_0416))&&(i_0417==""||reg.test(i_0417))&&(i_0418==""||reg.test(i_0418))&&(i_0419==""||reg.test(i_0419))&&		
		   (i_051==""||reg.test(i_051))&&(i_052==""||reg.test(i_052))&&(i_053==""||reg.test(i_053))&&(i_054==""||reg.test(i_054))&&(i_055==""||reg.test(i_055))&&(i_056==""||reg.test(i_056))&&(i_057==""||reg.test(i_057))&&(i_058==""||reg.test(i_058))&&(i_059==""||reg.test(i_059))&&(i_0510==""||reg.test(i_0510))&&(i_0511==""||reg.test(i_0511))&&(i_0512==""||reg.test(i_0512))&&(i_0513==""||reg.test(i_0513))&&(i_0514==""||reg.test(i_0514))&&(i_0515==""||reg.test(i_0515))&&(i_0516==""||reg.test(i_0516))&&(i_0517==""||reg.test(i_0517))&&(i_0518==""||reg.test(i_0518))&&(i_0519==""||reg.test(i_0519))&&	
		   (i_061==""||reg.test(i_061))&&(i_062==""||reg.test(i_062))&&(i_063==""||reg.test(i_063))&&(i_064==""||reg.test(i_064))&&(i_065==""||reg.test(i_065))&&(i_066==""||reg.test(i_066))&&(i_067==""||reg.test(i_067))&&(i_068==""||reg.test(i_068))&&(i_069==""||reg.test(i_069))&&(i_0610==""||reg.test(i_0610))&&(i_0611==""||reg.test(i_0611))&&(i_0612==""||reg.test(i_0612))&&(i_0613==""||reg.test(i_0613))&&(i_0614==""||reg.test(i_0614))&&(i_0615==""||reg.test(i_0615))&&(i_0616==""||reg.test(i_0616))&&(i_0617==""||reg.test(i_0617))&&(i_0618==""||reg.test(i_0618))&&(i_0619==""||reg.test(i_0619))	
		){
				//验证数据范围（不可为0和负数）
			    if((i_011==""||i_011>0)&&(i_012==""||i_012>0)&&(i_013==""||i_013>0)&&(i_014==""||i_014>0)&&(i_015==""||i_015>0)&&(i_016==""||i_016>0)&&(i_017==""||i_017>0)&&(i_018==""||i_018>0)&&(i_019==""||i_019>0)&&(i_0110==""||i_0110>0)&&(i_0111==""||i_0111>0)&&(i_0112==""||i_0112>0)&&(i_0113==""||i_0113>0)&&(i_0114==""||i_0114>0)&&(i_0115==""||i_0115>0)&&(i_0116==""||i_0116>0)&&(i_0117==""||i_0117>0)&&(i_0118==""||i_0118>0)&&(i_0119==""||i_0119>0)&&
				   (i_021==""||i_021>0)&&(i_022==""||i_022>0)&&(i_023==""||i_023>0)&&(i_024==""||i_024>0)&&(i_025==""||i_025>0)&&(i_026==""||i_026>0)&&(i_027==""||i_027>0)&&(i_028==""||i_028>0)&&(i_029==""||i_029>0)&&(i_0210==""||i_0210>0)&&(i_0211==""||i_0211>0)&&(i_0212==""||i_0212>0)&&(i_0213==""||i_0213>0)&&(i_0214==""||i_0214>0)&&(i_0215==""||i_0215>0)&&(i_0216==""||i_0216>0)&&(i_0217==""||i_0217>0)&&(i_0218==""||i_0218>0)&&(i_0219==""||i_0219>0)&&
				   (i_031==""||i_031>0)&&(i_032==""||i_032>0)&&(i_033==""||i_033>0)&&(i_034==""||i_034>0)&&(i_035==""||i_035>0)&&(i_036==""||i_036>0)&&(i_037==""||i_037>0)&&(i_038==""||i_038>0)&&(i_039==""||i_039>0)&&(i_0310==""||i_0310>0)&&(i_0311==""||i_0311>0)&&(i_0312==""||i_0312>0)&&(i_0313==""||i_0313>0)&&(i_0314==""||i_0314>0)&&(i_0315==""||i_0315>0)&&(i_0316==""||i_0316>0)&&(i_0317==""||i_0317>0)&&(i_0318==""||i_0318>0)&&(i_0319==""||i_0319>0)&&
			       (i_041==""||i_041>0)&&(i_042==""||i_042>0)&&(i_043==""||i_043>0)&&(i_044==""||i_044>0)&&(i_045==""||i_045>0)&&(i_046==""||i_046>0)&&(i_047==""||i_047>0)&&(i_048==""||i_048>0)&&(i_049==""||i_049>0)&&(i_0410==""||i_0410>0)&&(i_0411==""||i_0411>0)&&(i_0412==""||i_0412>0)&&(i_0413==""||i_0413>0)&&(i_0414==""||i_0414>0)&&(i_0415==""||i_0415>0)&&(i_0416==""||i_0416>0)&&(i_0417==""||i_0417>0)&&(i_0418==""||i_0418>0)&&(i_0419==""||i_0419>0)&&
			       (i_051==""||i_051>0)&&(i_052==""||i_052>0)&&(i_053==""||i_053>0)&&(i_054==""||i_054>0)&&(i_055==""||i_055>0)&&(i_056==""||i_056>0)&&(i_057==""||i_057>0)&&(i_058==""||i_058>0)&&(i_059==""||i_059>0)&&(i_0510==""||i_0510>0)&&(i_0511==""||i_0511>0)&&(i_0512==""||i_0512>0)&&(i_0513==""||i_0513>0)&&(i_0514==""||i_0514>0)&&(i_0515==""||i_0515>0)&&(i_0516==""||i_0516>0)&&(i_0517==""||i_0517>0)&&(i_0518==""||i_0518>0)&&(i_0519==""||i_0519>0)&&
			       (i_061==""||i_061>0)&&(i_062==""||i_062>0)&&(i_063==""||i_063>0)&&(i_064==""||i_064>0)&&(i_065==""||i_065>0)&&(i_066==""||i_066>0)&&(i_067==""||i_067>0)&&(i_068==""||i_068>0)&&(i_069==""||i_069>0)&&(i_0610==""||i_0610>0)&&(i_0611==""||i_0611>0)&&(i_0612==""||i_0612>0)&&(i_0613==""||i_0613>0)&&(i_0614==""||i_0614>0)&&(i_0615==""||i_0615>0)&&(i_0616==""||i_0616>0)&&(i_0617==""||i_0617>0)&&(i_0618==""||i_0618>0)&&(i_0619==""||i_0619>0)
			       ){			             
				        //验证具体算法（相加相等）					   
					          //验证院校类型（三选一）列关系
					          //如果填写普通本科
					          if(i_011==i_041&&i_012==i_042&&i_013==i_043&&i_014==i_044&&i_015==i_045&&i_016==i_046&&i_017==i_047&&i_018==i_048&&i_019==i_049&&i_0110==i_0410&&i_0111==i_0411&&i_0112==i_0412&&i_0113==i_0413&&i_0114==i_0414&&i_0115==i_0415&&i_0116==i_0416&&i_0117==i_0417&&i_0118==i_0418&&i_0119==i_0419&&
					          i_051==""&&i_052==""&&i_053==""&&i_054==""&&i_055==""&&i_056==""&&i_057==""&&i_058==""&&i_059==""&&i_0510==""&&i_0511==""&&i_0512==""&&i_0513==""&&i_0514==""&&i_0515==""&&i_0516==""&&i_0517==""&&i_0518==""&&i_0519==""&&
					          i_061==""&&i_062==""&&i_063==""&&i_064==""&&i_065==""&&i_066==""&&i_067==""&&i_068==""&&i_069==""&&i_0610==""&&i_0611==""&&i_0612==""&&i_0613==""&&i_0614==""&&i_0615==""&&i_0616==""&&i_0617==""&&i_0618==""&&i_0619==""
					          ){		
					                 //必须相加后才能比较相等，且条件中不可以连等
					                 //Number()方法可将空值转化为0计算
					                 var a = Number(i_015)+Number(i_019);
                                     var b = Number(i_0113)+Number(i_0114)+Number(i_0115);
					                 var c = Number(i_0116)+Number(i_0117)+Number(i_0118);			                                                   
					                 //验证行关系
					                 if(i_013==a){
					                      if(i_015==b&&i_015==c){
							                      //进行提交					                    				                   
		 	 				                      doSubmit();
							                      return true;	
							               }else{
									               alert("校验失败，不符合规则：5列=13列+14列+15列=16列+17列+18列！");
								                   return false;
							               }
					                 }else{
						                  alert("校验失败，不符合规则：3列=5列+9列！");
						                  return false;
					                 }          	          
					          }
					          //如果填写普通专科
					          else if(i_011==i_051&&i_012==i_052&&i_013==i_053&&i_014==i_054&&i_015==i_055&&i_016==i_056&&i_017==i_057&&i_018==i_058&&i_019==i_059&&i_0110==i_0510&&i_0111==i_0511&&i_0112==i_0512&&i_0113==i_0513&&i_0114==i_0514&&i_0115==i_0515&&i_0116==i_0516&&i_0117==i_0517&&i_0118==i_0518&&i_0119==i_0519&&
					          i_041==""&&i_042==""&&i_043==""&&i_044==""&&i_045==""&&i_046==""&&i_047==""&&i_048==""&&i_049==""&&i_0410==""&&i_0411==""&&i_0412==""&&i_0413==""&&i_0414==""&&i_0415==""&&i_0416==""&&i_0417==""&&i_0418==""&&i_0419==""&&
					          i_061==""&&i_062==""&&i_063==""&&i_064==""&&i_065==""&&i_066==""&&i_067==""&&i_068==""&&i_069==""&&i_0610==""&&i_0611==""&&i_0612==""&&i_0613==""&&i_0614==""&&i_0615==""&&i_0616==""&&i_0617==""&&i_0618==""&&i_0619==""
					          ){
					                 //必须相加后才能比较相等，且条件中不可以连等
					                 //Number()方法可将空值转化为0计算
					                 var a = Number(i_015)+Number(i_019);
                                     var b = Number(i_0113)+Number(i_0114)+Number(i_0115);
					                 var c = Number(i_0116)+Number(i_0117)+Number(i_0118);                         
					                 //验证行关系
					               if(i_013==a){
					                      if(i_015==b&&i_015==c){
							                      //进行提交					                    				                   
		 	 				                      doSubmit();
							                      return true;	
							               }else{
									               alert("校验失败，不符合规则：5列=13列+14列+15列=16列+17列+18列！");
								                   return false;
							               }
					                 }else{
						                  alert("校验失败，不符合规则：3列=5列+9列！");
						                  return false;
					                 }			   		          
					          }
					          //如果填写民办高校
					          else if(i_011==i_061&&i_012==i_062&&i_013==i_063&&i_014==i_064&&i_015==i_065&&i_016==i_066&&i_017==i_067&&i_018==i_068&&i_019==i_069&&i_0110==i_0610&&i_0111==i_0611&&i_0112==i_0612&&i_0113==i_0613&&i_0114==i_0614&&i_0115==i_0615&&i_0116==i_0616&&i_0117==i_0617&&i_0118==i_0618&&i_0119==i_0619&&
					          i_041==""&&i_042==""&&i_043==""&&i_044==""&&i_045==""&&i_046==""&&i_047==""&&i_048==""&&i_049==""&&i_0410==""&&i_0411==""&&i_0412==""&&i_0413==""&&i_0414==""&&i_0415==""&&i_0416==""&&i_0417==""&&i_0418==""&&i_0419==""&&
					          i_051==""&&i_052==""&&i_053==""&&i_054==""&&i_055==""&&i_056==""&&i_057==""&&i_058==""&&i_059==""&&i_0510==""&&i_0511==""&&i_0512==""&&i_0513==""&&i_0514==""&&i_0515==""&&i_0516==""&&i_0517==""&&i_0518==""&&i_0519==""	          
					          ){
					                 //必须相加后才能比较相等，且条件中不可以连等
					                 //Number()方法可将空值转化为0计算
					                 var a = Number(i_015)+Number(i_019);
                                     var b = Number(i_0113)+Number(i_0114)+Number(i_0115);
					                 var c = Number(i_0116)+Number(i_0117)+Number(i_0118);                             
					                 //验证行关系
					                  if(i_013==a){
					                      if(i_015==b&&i_015==c){
							                      //进行提交					                    				                   
		 	 				                      doSubmit();
							                      return true;	
							               }else{
									               alert("校验失败，不符合规则：5列=13列+14列+15列=16列+17列+18列！");
								                   return false;
							               }
					                 }else{
						                    alert("校验失败，不符合规则：3列=5列+9列！");
						                    return false;
					                 }	   
					          }
					          else{
					             alert("校验失败，不符合规则：04、05、06行只能填写一行，同时01行与填写行对应数据相等！");
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
							<b></b><strong>填写表二</strong>
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
								<td colspan="22" align="center">2017年全国高校教职工党员队伍结构和党组织基本状况统计表</td>
							</tr>
							<tr>
								<td colspan="22">填报单位（盖章）：</td>
							</tr>
							<tr align="center">
								<td rowspan="3" colspan="2"></td>
								<td rowspan="3">列号</td>
								<td colspan="2">教职工数</td>
								<td colspan="16">专任教师党员队伍结构</td>
								<td rowspan="3">离退休人员党员总数</td>
							</tr>
							
							<tr align="center">
								<td rowspan="2">教职工总数</td>
								<td rowspan="2">其中：党员总数</td>
								<td rowspan="2">专任教师总数</td>
								<td rowspan="2">其中：35岁及以下青年教师数</td>
								<td colspan="4">专任教师党员数</td>
								<td colspan="4">非党教师申请入党情况</td>
								<td colspan="3">专任教师党员职称结构</td>
								<td colspan="3">专任教师党员学历结构</td>
							</tr>
							<tr align="center">
								<td>党员总数</td>
								<td>35岁及以下党员数</td>
								<td>当年发展党员数</td>
								<td>专任教师党员占专任教师比例％</td>
								<td>非党员数</td>
								<td>非党教师申请入党人员数</td>
								<td>入党积极分子数</td>
								<td>非党教师中申请入党人员比例％</td>
								<td>正高级</td>
								<td>副高级</td>
								<td>其他</td>
								<td>博士</td>
								<td>硕士</td>
								<td>其他</td>
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
								<td>14</td>
								<td>15</td>
								<td>16</td>
								<td>17</td>
								<td>18</td>
								<td>19</td>
							</tr>
							<tr align="center">
								<td colspan="2">总计</td>
								<td>01</td>
								<td><input id="011"　type="text" name="dataMap['011']" style="border:0px" size="1px" value="${dataMap['011']}">
								</td>
								<td><input id="012" type="text" name="dataMap['012']" style="border:0px" size="1px" value="${dataMap['012']}">
								</td>
								<td><input id="013" type="text" name="dataMap['013']" style="border:0px" size="1px" value="${dataMap['013']}">
								</td>
								<td><input id="014" type="text" name="dataMap['014']" style="border:0px" size="1px" value="${dataMap['014']}">
								</td>
								<td><input id="015" type="text" name="dataMap['015']" style="border:0px" size="1px" value="${dataMap['015']}">
								</td>
								<td><input id="016" type="text" name="dataMap['016']" style="border:0px" size="1px" value="${dataMap['016']}">
								</td>
								<td><input id="017" type="text" name="dataMap['017']" style="border:0px" size="1px" value="${dataMap['017']}">
								</td>
								<td><input id="018" type="text" name="dataMap['018']" style="border:0px" size="1px" value="${dataMap['018']}">
								</td>
								<td><input id="019" type="text" name="dataMap['019']" style="border:0px" size="1px" value="${dataMap['019']}">
								</td>
								<td><input id="0110" type="text" name="dataMap['0110']" style="border:0px" size="1px" value="${dataMap['0110']}">
								</td>
								<td><input id="0111" type="text" name="dataMap['0111']" style="border:0px" size="1px" value="${dataMap['0111']}">
								</td>
								<td><input id="0112" type="text" name="dataMap['0112']" style="border:0px" size="1px" value="${dataMap['0112']}">
								</td>
								<td><input id="0113" type="text" name="dataMap['0113']" style="border:0px" size="1px" value="${dataMap['0113']}">
								</td>
								<td><input id="0114" type="text" name="dataMap['0114']" style="border:0px" size="1px" value="${dataMap['0114']}">
								</td>
								<td><input id="0115" type="text" name="dataMap['0115']" style="border:0px" size="1px" value="${dataMap['0115']}">
								</td>
								<td><input id="0116" type="text" name="dataMap['0116']" style="border:0px" size="1px" value="${dataMap['0116']}">
								</td>
								<td><input id="0117" type="text" name="dataMap['0117']" style="border:0px" size="1px" value="${dataMap['0117']}">
								</td>
								<td><input id="0118" type="text" name="dataMap['0118']" style="border:0px" size="1px" value="${dataMap['0118']}">
								</td>
								<td><input id="0119" type="text" name="dataMap['0119']" style="border:0px" size="1px" value="${dataMap['0119']}">
								</td>
							</tr>
							<tr align="center">
								<td colspan="2">其中少数民族数量</td>
								<td>02</td>
								<td><input id="021" type="text" name="dataMap['021']" style="border:0px" size="1px" value="${dataMap['021']}">
								</td>
								<td><input id="022" type="text" name="dataMap['022']" style="border:0px" size="1px" value="${dataMap['022']}">
								</td>
								<td><input id="023" type="text" name="dataMap['023']" style="border:0px" size="1px" value="${dataMap['023']}">
								</td>
								<td><input id="024" type="text" name="dataMap['024']" style="border:0px" size="1px" value="${dataMap['024']}">
								</td>
								<td><input id="025" type="text" name="dataMap['025']" style="border:0px" size="1px" value="${dataMap['025']}">
								</td>
								<td><input id="026" type="text" name="dataMap['026']" style="border:0px" size="1px" value="${dataMap['026']}">
								</td>
								<td><input id="027" type="text" name="dataMap['027']" style="border:0px" size="1px" value="${dataMap['027']}">
								</td>
								<td><input id="028" type="text" name="dataMap['028']" style="border:0px" size="1px" value="${dataMap['028']}">
								</td>
								<td><input id="029" type="text" name="dataMap['029']" style="border:0px" size="1px" value="${dataMap['029']}">
								</td>
								<td><input id="0210" type="text" name="dataMap['0210']" style="border:0px" size="1px" value="${dataMap['0210']}">
								</td>
								<td><input id="0211" type="text" name="dataMap['0211']" style="border:0px" size="1px" value="${dataMap['0211']}">
								</td>
								<td><input id="0212" type="text" name="dataMap['0212']" style="border:0px" size="1px" value="${dataMap['0212']}">
								</td>
								<td><input id="0213" type="text" name="dataMap['0213']" style="border:0px" size="1px" value="${dataMap['0213']}">
								</td>
								<td><input id="0214" type="text" name="dataMap['0214']" style="border:0px" size="1px" value="${dataMap['0214']}">
								</td>
								<td><input id="0215" type="text" name="dataMap['0215']" style="border:0px" size="1px" value="${dataMap['0215']}">
								</td>
								<td><input id="0216" type="text" name="dataMap['0216']" style="border:0px" size="1px" value="${dataMap['0216']}">
								</td>
								<td><input id="0217" type="text" name="dataMap['0217']" style="border:0px" size="1px" value="${dataMap['0217']}">
								</td>
								<td><input id="0218" type="text" name="dataMap['0218']" style="border:0px" size="1px" value="${dataMap['0218']}">
								</td>
								<td><input id="0219" type="text" name="dataMap['0219']" style="border:0px" size="1px" value="${dataMap['0219']}">
								</td>
							</tr>
							<tr align="center">
								<td colspan="2">其中女性数量</td>
								<td>03</td>
								<td><input id="031" type="text" name="dataMap['031']" style="border:0px" size="1px" value="${dataMap['031']}">
								</td>
								<td><input id="032" type="text" name="dataMap['032']" style="border:0px" size="1px" value="${dataMap['032']}">
								</td>
								<td><input id="033" type="text" name="dataMap['033']" style="border:0px" size="1px" value="${dataMap['033']}">
								</td>
								<td><input id="034" type="text" name="dataMap['034']" style="border:0px" size="1px" value="${dataMap['034']}">
								</td>
								<td><input id="035" type="text" name="dataMap['035']" style="border:0px" size="1px" value="${dataMap['035']}">
								</td>
								<td><input id="036" type="text" name="dataMap['036']" style="border:0px" size="1px" value="${dataMap['036']}">
								</td>
								<td><input id="037" type="text" name="dataMap['037']" style="border:0px" size="1px" value="${dataMap['037']}">
								</td>
								<td><input id="038" type="text" name="dataMap['038']" style="border:0px" size="1px" value="${dataMap['038']}">
								</td>
								<td><input id="039" type="text" name="dataMap['039']" style="border:0px" size="1px" value="${dataMap['039']}">
								</td>
								<td><input id="0310" type="text" name="dataMap['0310']" style="border:0px" size="1px" value="${dataMap['0310']}">
								</td>
								<td><input id="0311" type="text" name="dataMap['0311']" style="border:0px" size="1px" value="${dataMap['0311']}">
								</td>
								<td><input id="0312" type="text" name="dataMap['0312']" style="border:0px" size="1px" value="${dataMap['0312']}">
								</td>
								<td><input id="0313" type="text" name="dataMap['0313']" style="border:0px" size="1px" value="${dataMap['0313']}">
								</td>
								<td><input id="0314" type="text" name="dataMap['0314']" style="border:0px" size="1px" value="${dataMap['0314']}">
								</td>
								<td><input id="0315" type="text" name="dataMap['0315']" style="border:0px" size="1px" value="${dataMap['0315']}">
								</td>
								<td><input id="0316" type="text" name="dataMap['0316']" style="border:0px" size="1px" value="${dataMap['0316']}">
								</td>
								<td><input id="0317" type="text" name="dataMap['0317']" style="border:0px" size="1px" value="${dataMap['0317']}">
								</td>
								<td><input id="0318" type="text" name="dataMap['0318']" style="border:0px" size="1px" value="${dataMap['0318']}">
								</td>
								<td><input id="0319" type="text" name="dataMap['0319']" style="border:0px" size="1px" value="${dataMap['0319']}">
								</td>
							</tr>
							<tr align="center">
								<td rowspan="3">合计</td>
								<td>普通本科院校</td>
								<td>04</td>
								<td><input id="041" type="text" name="dataMap['041']" style="border:0px" size="1px" value="${dataMap['041']}">
								</td>
								<td><input id="042" type="text" name="dataMap['042']" style="border:0px" size="1px" value="${dataMap['042']}">
								</td>
								<td><input id="043" type="text" name="dataMap['043']" style="border:0px" size="1px" value="${dataMap['043']}">
								</td>
								<td><input id="044" type="text" name="dataMap['044']" style="border:0px" size="1px" value="${dataMap['044']}">
								</td>
								<td><input id="045" type="text" name="dataMap['045']" style="border:0px" size="1px" value="${dataMap['045']}">
								</td>
								<td><input id="046" type="text" name="dataMap['046']" style="border:0px" size="1px" value="${dataMap['046']}">
								</td>
								<td><input id="047" type="text" name="dataMap['047']" style="border:0px" size="1px" value="${dataMap['047']}">
								</td>
								<td><input id="048" type="text" name="dataMap['048']" style="border:0px" size="1px" value="${dataMap['048']}">
								</td>
								<td><input id="049" type="text" name="dataMap['049']" style="border:0px" size="1px" value="${dataMap['049']}">
								</td>
								<td><input id="0410" type="text" name="dataMap['0410']" style="border:0px" size="1px" value="${dataMap['0410']}">
								</td>
								<td><input id="0411" type="text" name="dataMap['0411']" style="border:0px" size="1px" value="${dataMap['0411']}">
								</td>
								<td><input id="0412" type="text" name="dataMap['0412']" style="border:0px" size="1px" value="${dataMap['0412']}">
								</td>
								<td><input id="0413" type="text" name="dataMap['0413']" style="border:0px" size="1px" value="${dataMap['0413']}">
								</td>
								<td><input id="0414" type="text" name="dataMap['0414']" style="border:0px" size="1px" value="${dataMap['0414']}">
								</td>
								<td><input id="0415" type="text" name="dataMap['0415']" style="border:0px" size="1px" value="${dataMap['0415']}">
								</td>
								<td><input id="0416" type="text" name="dataMap['0416']" style="border:0px" size="1px" value="${dataMap['0416']}">
								</td>
								<td><input id="0417" type="text" name="dataMap['0417']" style="border:0px" size="1px" value="${dataMap['0417']}">
								</td>
								<td><input id="0418" type="text" name="dataMap['0418']" style="border:0px" size="1px" value="${dataMap['0418']}">
								</td>
								<td><input id="0419" type="text" name="dataMap['0419']" style="border:0px" size="1px" value="${dataMap['0419']}">
								</td>
							</tr>
							<tr align="center">
								<td>专科院校（含职业技术学院）</td>
								<td>05</td>
								<td><input id="051" type="text" name="dataMap['051']" style="border:0px" size="1px" value="${dataMap['051']}">
								</td>
								<td><input id="052" type="text" name="dataMap['052']" style="border:0px" size="1px" value="${dataMap['052']}">
								</td>
								<td><input id="053" type="text" name="dataMap['053']" style="border:0px" size="1px" value="${dataMap['053']}">
								</td>
								<td><input id="054" type="text" name="dataMap['054']" style="border:0px" size="1px" value="${dataMap['054']}">
								</td>
								<td><input id="055" type="text" name="dataMap['055']" style="border:0px" size="1px" value="${dataMap['055']}">
								</td>
								<td><input id="056" type="text" name="dataMap['056']" style="border:0px" size="1px" value="${dataMap['056']}">
								</td>
								<td><input id="057" type="text" name="dataMap['057']" style="border:0px" size="1px" value="${dataMap['057']}">
								</td>
								<td><input id="058" type="text" name="dataMap['058']" style="border:0px" size="1px" value="${dataMap['058']}">
								</td>
								<td><input id="059" type="text" name="dataMap['059']" style="border:0px" size="1px" value="${dataMap['059']}">
								</td>
								<td><input id="0510" type="text" name="dataMap['0510']" style="border:0px" size="1px" value="${dataMap['0510']}">
								</td>
								<td><input id="0511" type="text" name="dataMap['0511']" style="border:0px" size="1px" value="${dataMap['0511']}">
								</td>
								<td><input id="0512" type="text" name="dataMap['0512']" style="border:0px" size="1px" value="${dataMap['0512']}">
								</td>
								<td><input id="0513" type="text" name="dataMap['0513']" style="border:0px" size="1px" value="${dataMap['0513']}">
								</td>
								<td><input id="0514" type="text" name="dataMap['0514']" style="border:0px" size="1px" value="${dataMap['0514']}">
								</td>
								<td><input id="0515" type="text" name="dataMap['0515']" style="border:0px" size="1px" value="${dataMap['0515']}">
								</td>
								<td><input id="0516" type="text" name="dataMap['0516']" style="border:0px" size="1px" value="${dataMap['0516']}">
								</td>
								<td><input id="0517" type="text" name="dataMap['0517']" style="border:0px" size="1px" value="${dataMap['0517']}">
								</td>
								<td><input id="0518" type="text" name="dataMap['0518']" style="border:0px" size="1px" value="${dataMap['0518']}">
								</td>
								<td><input id="0519" type="text" name="dataMap['0519']" style="border:0px" size="1px" value="${dataMap['0519']}">
								</td>
							</tr>
							<tr align="center">
								<td>民办高校（含独立学院）</td>
								<td>06</td>
								<td><input id="061" type="text" name="dataMap['061']" style="border:0px" size="1px" value="${dataMap['061']}">
								</td>
								<td><input id="062" type="text" name="dataMap['062']" style="border:0px" size="1px" value="${dataMap['062']}">
								</td>
								<td><input id="063" type="text" name="dataMap['063']" style="border:0px" size="1px" value="${dataMap['063']}">
								</td>
								<td><input id="064" type="text" name="dataMap['064']" style="border:0px" size="1px" value="${dataMap['064']}">
								</td>
								<td><input id="065" type="text" name="dataMap['065']" style="border:0px" size="1px" value="${dataMap['065']}">
								</td>
								<td><input id="066" type="text" name="dataMap['066']" style="border:0px" size="1px" value="${dataMap['066']}">
								</td>
								<td><input id="067" type="text" name="dataMap['067']" style="border:0px" size="1px" value="${dataMap['067']}">
								</td>
								<td><input id="068" type="text" name="dataMap['068']" style="border:0px" size="1px" value="${dataMap['068']}">
								</td>
								<td><input id="069" type="text" name="dataMap['069']" style="border:0px" size="1px" value="${dataMap['069']}">
								</td>
								<td><input id="0610" type="text" name="dataMap['0610']" style="border:0px" size="1px" value="${dataMap['0610']}">
								</td>
								<td><input id="0611" type="text" name="dataMap['0611']" style="border:0px" size="1px" value="${dataMap['0611']}">
								</td>
								<td><input id="0612" type="text" name="dataMap['0612']" style="border:0px" size="1px" value="${dataMap['0612']}">
								</td>
								<td><input id="0613" type="text" name="dataMap['0613']" style="border:0px" size="1px" value="${dataMap['0613']}">
								</td>
								<td><input id="0614" type="text" name="dataMap['0614']" style="border:0px" size="1px" value="${dataMap['0614']}">
								</td>
								<td><input id="0615" type="text" name="dataMap['0615']" style="border:0px" size="1px" value="${dataMap['0615']}">
								</td>
								<td><input id="0616" type="text" name="dataMap['0616']" style="border:0px" size="1px" value="${dataMap['0616']}">
								</td>
								<td><input id="0617" type="text" name="dataMap['0617']" style="border:0px" size="1px" value="${dataMap['0617']}">
								</td>
								<td><input id="0618" type="text" name="dataMap['0618']" style="border:0px" size="1px" value="${dataMap['0618']}">
								</td>
								<td><input id="0619" type="text" name="dataMap['0619']" style="border:0px" size="1px" value="${dataMap['0619']}">
								</td>
							</tr>
							<tr>
								<td align="center">说明</td>
								<td align="left" colspan="21">1.本表行列关系如下：如，列关系：01=04+05+06，行关系：3=5+9；5=13+14+15=16+17+18；
								</td>
							</tr>
							<tr>
								<td></td>
								<td colspan="21">2.统计数据截至2017年6月30日。</td>
							</tr>
						</table>
					</div>
				</div>
			</div>
		</div>
	</form>

</body>
</html>