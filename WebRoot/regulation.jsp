<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
 <head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
	<style type="text/css">
		ul{
			list-style-type:none;
			font-family:"黑体";
		}
		#title{
			text-align:center;
			font-size:25px
		}
		.content{
			text-aligh:center;
		}
		#focus{
			color:red;
			font-size:5px;
		}
    </style>
</head>
<body>
	<div id="position">
        <ul>
            <li id="title" style="color: red">规则明细</li>
            <li class="content">
            	<h3 style="color: red">填写表格时不要填"0",没有数据则无需填写！！！【表格模板中有"0"也请根据情况修改或删除】</h3>
            </li>
            <li class="content">
            	<p>表一规则：01=02+03+04&nbsp;&nbsp;&nbsp;1=2+3+4+5</p>
            </li>
            <li class="content">
            	<p>表二规则：01=04+05+6&nbsp;&nbsp;&nbsp;3=5+9&nbsp;&nbsp;&nbsp;5=13+14+15=16+17+18</p>
            </li>
            <li class="content">
            	<p>表三规则：001=004+007+010&nbsp;&nbsp;&nbsp;1=2+7&nbsp;&nbsp;&nbsp;2=3+4</p>
            </li>
            <li class="content">
            	<p>表四规则：01=02+03+04+05&nbsp;&nbsp;&nbsp;1=2+3+4+5&nbsp;&nbsp;&nbsp;1=6+7+8+9+10+11</p>
            </li>
             <li class="content">
            	<p>表五规则：01=02+03+04+05</p>
            </li>
            <p id="focus">注：1.每张表底下都有填写规则，请用户按规则填写，否则不能提交！</br>
            				
            				&nbsp;&nbsp;&nbsp;&nbsp;2.如果用户没有模版，请点击"模版"按钮进行下载，在模版中填写数据后进行导入。
            </p>
            <hr>
            <center><li style="color: red"><h2>统计指标说明</h2></li></center>
            <li class="content">
            	<p>1．“民办高校”含独立设置的民办高等学校、独立学院和其他普通高校的民办二级学院。</p>
            </li>
            <li class="content">
            	<p>2. 各独立学院的数据单独上报进行统计，其举办高校不再上报，以免重复计算。</p>
            </li>
            <li class="content">
            	<p>3．“当年发展党员数”是指上一年7月1日（含当日）至当年6月30日（含当日）前这一时间段内发展党员的人数。</p>
            </li>
            <li class="content">
            	<p>4．“教职工总数”是指学校在职的教职工总数（本校附属医院、附中、附小、附幼的教职工不在统计之列）。</p>
            </li>
            <li class="content">
            	<p>5．“专任教师总数”是指学校在职的教职工中的专任教师总数（含以人事代理制聘任的教师，但不含聘任的外籍教师和未以人事代理制管理的外聘教师）。</p>
            </li>
            <li class="content">
            	<p>6．对在读博士、硕士研究生的统计，各地要把培养研究生的科研机构统计到位。</p>
            </li>
            <li class="content">
            	<p>7．为避免重复计算，在职攻读博（硕）士学位的教职工，党组织关系在原单位的，由原单位进行统计。</p>
            </li>
            <li class="content">
            	<p>8．各类网络本科、专科生、研究生课程进修班、在职人员攻读博士硕士学位、学历文凭考试、电大注册视听生、自考助学班、普通预科生、进修及培训、留学生等不计入本次统计。</p>
            </li>
            <li class="content">
            	<p>9．离退休教职工党支部计入本校基层党组织数，但人数不计入在职教职工总数内。</p>
            </li>
            <li class="content">
            	<p>10．“在校生总数”统计时间截至2017年6月30日（含2017届在此时间前离校的毕业生）。</p>
            </li>
            <li class="content">
            	<p>11．“党员总数”统计时间截至2017年6月30日（在此时间前毕业离校并转走组织关系的学生党员均要统计在学生党员总数内，在此时间前调离本校并转走组织关系的教职工党员不在教职工党员总数内）。</p>
            </li>
            <li class="content">
            	<p>12. 《2017年全国高校基层党组织建设情况统计表（表一）》9列（淡绿色）填写的是：教职工党总支数+含离退休党支部的教职工党支部数+直属党支部数。</p>
            </li>
            <li class="content">
            	<p>13.由教师和学生组成的党支部，若教师人数多，则按教师党支部统计，反之按学生党支部数统计，同理研究生、本科生、专科生组成的党支部，哪个人数多，就算哪个层面的党支部。</p>
            </li>
        </ul>
     </div>
</body>
</html>
