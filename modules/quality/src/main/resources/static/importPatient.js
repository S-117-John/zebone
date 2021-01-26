function importPatient(){
    $.ajax({
        url:'${ctx}/api/emr/emrHomePage/data',
        type: "POST",
        data: {patNo: $("#caseId").val()},
        success:function (data){
            window.location.href = "${ctx}/cesarean/qualityCesareanSection/form?id="+data;
        }
    });
}