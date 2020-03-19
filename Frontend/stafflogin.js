const check = async ()=>{
    var username = Number(document.getElementById("pin").value)
    var pass = document.getElementById("pass").value
    var opts = {pin:username,pass:pass}
    await fetch("http://localhost:8080/staffLogin/"+username)
    .then(res=>res.json())
    .then((res)=>{
      if(pass === res.pass){
        let url = "staffmainpage.html?name=" + encodeURIComponent(username)
        window.location = url
      }else{
        var d = document.createElement("div")
        d.setAttribute('class','alert alert-warning')
        d.innerHTML = "Username / Password incorrect."
        var node = document.querySelector(".main")
        node.appendChild(d)
      }
    })
}