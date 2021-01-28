function importPatient(url){
    $.ajax({
        url:'${ctx}/api/emr/emrHomePage/commonData',
        type: "POST",
        data: {patNo: $("#caseid").val()},
        success:function (data){
            window.location.href = "${ctx}/"+url+"/form?id="+data;
        }
    });
}