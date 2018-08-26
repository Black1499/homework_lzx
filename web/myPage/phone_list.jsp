<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书信息</title>
</head>
<body>
<div class="container">
    <form method="post" action="../deletePhone">
        <table class="table">
            <thead class="thead-dark">
            <tr>
                <th>多选</th>
                <th>编号</th>
                <th>品牌</th>
                <th>名称</th>
                <th>价格</th>
                <th>产生日期</th>
                <th>库存</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody></tbody>
        </table>
        <input type="submit" class="btn btn-danger" id="btnDel" value="删除"/>
    </form>
    <%@include file="phone_modal.jsp"%>
</div>
<script>
    var phoneOperate = {
        blindTable:function(data){
            $("tbody").empty();
            $.each(data, function (i, obj) {
                var tr = $("<tr/>");
                var ckd = $("<input type='checkbox' name='id' value='" + obj.id + "'>");
                $("<td/>").html(ckd).appendTo(tr);
                $("<td/>").html(obj.id).appendTo(tr);
                $("<td/>").html(obj.brand).appendTo(tr);
                $("<td/>").html(obj.name).appendTo(tr);
                $("<td/>").html(obj.price).appendTo(tr);
                $("<td/>").html(obj.date).appendTo(tr);
                $("<td/>").html(obj.stock).appendTo(tr);
                var del = $("<button type='button' class='del'>删除</button>").data("phoneId", obj.id);
                var upd = $("<button type='button' data-toggle=\"modal\" data-target=\"#myModal\" class='upd'>修改</button>").data("phone", obj);
                $("<td/>").html(del).append("&emsp;").append(upd).appendTo(tr);
                $("tbody").append(tr);
            });
        },
        phoneList: function () {
            $.post("../phoneList", {}, function (data) {
               phoneOperate.blindTable(data);
            })
        },
        delOne: function () {
            $("table").on("click", ".del", function () {
                if (confirm("是否确定删除该信息？")) {
                    $.get("../deletePhone", {id: $(this).data("phoneId")}, function (data) {
                        alert(data.msg);
                        phoneOperate.phoneList();
                    });
                }
            });
        },
        delPart: function () {
            $("#btnDel").click(function () {
                if (confirm("是否确定删除你选中的信息？") == false) {
                    return;
                }
            });
        },
        modalShow:function(){
            $("#myModal").on("show.bs.modal", function (e) {
                var button=event.target;
                var phone=$(button).data("phone");
                $("#id").val(phone.id);
                $("#brand").val(phone.brand);
                $("#name").val(phone.name);
                $("#price").val(phone.price);
                $("#date").val(phone.date);
                $("#stock").val(phone.stock);
            });
        },
        updPhone:function(){
            $("#btnUpd").click(function () {
                $.post("../updPhone",$("form").serialize(),function (data) {
                    if(data.msg=="修改成功"){
                        window.location.href="phone_list.jsp";
                    }else {
                        alert(data.msg);
                    }
                })
            });
        },
        findByName:function(){
            $("#btnFind").click(function () {
                $.get("../findByName",{name:$("input[type=search]").val()},function (data) {
                    phoneOperate.blindTable(data);
                })
            });
        },
        init: function () {
            phoneOperate.phoneList();
            phoneOperate.delOne();
            phoneOperate.delPart();
            phoneOperate.modalShow();
            phoneOperate.updPhone();
            phoneOperate.findByName();
        }
    }
    phoneOperate.init();
</script>
</body>
</html>
