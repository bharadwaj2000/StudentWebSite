var queryString = new Array();
var name;
window.onload = function () {
    if (queryString.length == 0) {
        if (window.location.search.split('?').length > 1) {
            var params = window.location.search.split('?')[1].split('&');
            for (var i = 0; i < params.length; i++) {
                var key = params[i].split('=')[0];
                var value = decodeURIComponent(params[i].split('=')[1]);
                queryString[key] = value;
            }
        }
    }
    if (queryString["name"] != null) {
        name = this.queryString["name"]
        fetch("http://localhost:8080/staffdetails/"+name)
        .then(res=>res.json())
        .then((res,req)=>{
            console.log(res)
            document.getElementById("name").innerHTML = "Name : "+res.staffname;
            document.getElementById("pin").innerHTML = "Pin : "+res.pin;
            document.getElementById("section").innerHTML = "Section : "+res.section ;
        })
        .catch((err)=>{
            console.log(err)
        })
    }else{
        window.location = "stafflogin.html"
    }
};

function goto(url){
    window.location = url+"?name="+name
}