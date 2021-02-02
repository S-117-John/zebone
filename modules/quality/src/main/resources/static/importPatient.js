function importPatient(url){
    $.ajax({
        url:'${ctx}/api/emr/emrHomePage/commonData',
        type: "POST",
        data: {patNo: $("#caseid").val()},
        success:function (data){
            var obj = JSON.parse(data);
            for(var key in obj){//遍历json对象的每个key/value对,p为key
                $("#"+key.toLowerCase()).val(obj[key])
            }
        }
    });
};