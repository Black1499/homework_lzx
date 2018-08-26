<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加手机</title>
</head>
<body>
    <%@include file="phone_form.jsp"%>
    <input type="button" value="提交" class="btn btn-primary"/>
<script>
    var phoneAdd={
        add:function () {
            $("input[type=button]").click(function () {
               $.post("../addPhone",$("form").serialize(),function (data) {
                   if(data.msg=="添加成功"){
                       window.location.href="phone_list.jsp";
                   }else {
                       alert(data.msg);
                   }
               })
            });
        }
    }
    phoneAdd.add();
</script>
</body>
</html>
