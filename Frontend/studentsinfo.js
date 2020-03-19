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
        fetch("http://localhost:8080/studentdetails/staffauth/"+name)
        .then(res=>res.json())
        .then((res)=>{
            var table = document.querySelector(".table")
            for(i=0;i<res.length;i++){
                let tr = document.createElement("tr")
                let name = document.createElement("td")
                name.innerHTML = res[i].studentname
                let pin = document.createElement("td")
                pin.innerHTML = res[i].pin
                let section = document.createElement("td")
                section.innerHTML = res[i].section
                let cgpa = document.createElement("td")
                cgpa.innerHTML = res[i].cgpa
                let attendance = document.createElement("td")
                attendance.innerHTML = res[i].attendance
                tr.appendChild(pin)
                tr.appendChild(name)
                tr.appendChild(section)
                tr.appendChild(cgpa)
                tr.appendChild(attendance)
                table.appendChild(tr)
            }
        }).catch((err)=>{
            console.log(err)
        })
    }else{
        window.location = "stafflogin.html"
    }
};


function goto(url){
    window.location = url+"?name="+name
}