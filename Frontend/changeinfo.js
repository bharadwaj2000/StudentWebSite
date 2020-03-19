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

function getDetails(){
    let pin = document.querySelector("#searchpin").value
    console.log(pin)
    fetch("http://localhost:8080/studentdetails/"+pin)
    .then(res=>res.json())
    .then((res,req)=>{
        if(res == null){
            console.log(res)
            document.querySelector("#name").value = ""
            document.querySelector("#pin").value = ""
            document.querySelector("#cgpa").value = ""
            document.querySelector("#section").value = ""
            document.querySelector("#attendance").value = ""
            var d = document.createElement("div")
            d.setAttribute('class','alert alert-warning')
            d.innerHTML = "Username / Password incorrect."
            var node = document.querySelector("body")
            node.appendChild(d)
            setTimeout(()=>{
                d.remove();
            },5000)
        }else{
            document.querySelector("#name").value = res.studentname
            document.querySelector("#pin").value = res.pin
            document.querySelector("#cgpa").value = res.cgpa
            document.querySelector("#section").value = res.section
            document.querySelector("#attendance").value = res.attendance
        }
    })
    .catch((err)=>{
        console.log(err)
    })
}

function update(){
    const info = {
        "pin": document.getElementById("pin").value,
        "studentname": document.getElementById("name").value,
        "section": document.getElementById("section").value,
        "cgpa": document.getElementById("cgpa").value,
        "attendance": document.getElementById("attendance").value
    }
    fetch("http://localhost:8080/studentdetails/staffauth/update",{
        method:'POST',
        headers: {
            'Content-Type': 'application/json'
            // 'Content-Type': 'application/x-www-form-urlencoded',
        },
        body:JSON.stringify(info)
    })
    .then((res)=>{
        console.log(res)
            document.querySelector("#name").value = ""
            document.querySelector("#pin").value = ""
            document.querySelector("#cgpa").value = ""
            document.querySelector("#section").value = ""
            document.querySelector("#attendance").value = ""
            var d = document.createElement("div")
            d.setAttribute('class','alert alert-warning')
            d.innerHTML = "Updated Successfully"
            var node = document.querySelector("body")
            node.appendChild(d)
            setTimeout(()=>{
                d.remove();
            },5000)
    })
    .catch((err)=>{
        console.log(err)
    })
}