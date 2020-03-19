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
        fetch("http://localhost:8080/studentdetails/"+name)
        .then(res=>res.json())
        .then((res,req)=>{
            document.getElementById("name").innerHTML = "Name : "+res.studentname;
            document.getElementById("pin").innerHTML = "Pin : "+res.pin;
            document.getElementById("section").innerHTML = "Section : "+res.section ;
            document.getElementById("cgpa").innerHTML = "CGPA : "+res.cgpa;
            document.getElementById("attendance").innerHTML = "Attendance : "+res.attendance;
        })
        .catch((err)=>{
            console.log(err)
        })
    }else{
        window.location = "studentlogin.html"
    }
};

function logout(){
    window.location="index.html";
}