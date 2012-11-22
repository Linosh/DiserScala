jQuery(document).ready(function ($) {
    $("#addLink").click(function () {
        var selectedServices = [];
        var selectedOperators = [];

        $("#tServices :selected").each(function () {
            selectedServices.push($(this).attr("label"));
        });

        if (selectedServices.length == 0) {
            alert("Please select Telecom Service");
            return false;
        }

        $("#operators :selected").each(function () {
            selectedOperators.push($(this).attr("label"));
        });

        var url = $("#addLink").attr("href") + "/" + selectedOperators[0] + "/"
        var separator = ","
        for (var i = 0; i < selectedServices.length; i++) {
            if (i == (selectedServices.length-1)){
                separator = ""
            }
            url += selectedServices[i] + separator
        }

        $(this).attr({href: url})
        return true;
    });
});
