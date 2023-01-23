
let f;
let filt = [];
let div;
document.getElementById("statusdiv").style.display = "none";
f = document.getElementById("hv").value;
console.log(f);
if (f == "patient") {
  
    document.getElementById("doctor2").style.display = "none";

} else {
   
    console.log("he was a doctor");
    document.getElementById("patient").style.display = "none";

}

function showdoct() {
    
    $.ajax({
        url: "http://localhost:8080/pickdoctor",        
        dataType: "json",
        success: function (data) {
            console.log(data);
            
             displaydoctor(data);
            data.forEach(e=>{
                console.log(e);
            })
        },
        error: function (error) {
            console.log(`Error ${error}`);

        },
    });
    // alert();
    // window.location = "https://stackoverflow.com/questions/8622892/how-to-redirect-a-page-to-another-page-when-refresh-at-second-attempt";
}
function displaydoctor(d_data) {

    $(".docdetail").remove();
    document.getElementById("statusdiv").style.display = "none";
    d_data.forEach(element => {
        console.log(element.d_name);
        div = document.createElement("div");
        div.className = "alldoc";
        div.className = "docdetail";
        div.style.width = "15%";
        div.style.height = "40%";
        div.style.background = "#002b80";
        div.style.color = "white";
        div.style.fontFamily = "Arial, Helvetica, sans-serif";
        div.style.borderRadius = "10px";
        div.innerHTML = "<p>Doctor</p><br><br><br><br><br> " + element.D_NAME + "<br><br><br><br><br>" + element.special;
        div.style.float = "left";
        div.style.marginLeft = "8%";
        div.style.marginBottom = "4%";
        div.style.display = "flex";
        div.style.justifyContent = "center";
        // div.style.alignItems="center";
        div.style.boxShadow = "4px 3px 10px #9494949c";
        document.body.appendChild(div);
    });

}
function status() {
    $.ajax({
        url: "http://localhost:8080/showstatus",
        type: "GET",
        dataType: "json",
        success: function (data) {
            $(".alldoc").remove();
            console.log(data);
            displayItems(data);
           
        },
        error: function (error) {
            console.log(`Error ${error}`);
        },
    });
}
function displayItems(data) {
    console.log(data);
    
    const xu = document.getElementById("statusdiv");
    if (xu.style.display === "none") {
        xu.style.display = "block";
        console.log("iam none");
    } else {
        console.log("iam block");
        xu.style.display = "none";
    }
    // document.getElementById("statusdiv").style.display = "block";
    $(".hidere").remove();
    $(".hidere2").remove();
    document.createElement("statustbl");
    tBody = document.getElementById("statustbl");
    th = tBody.insertRow();
    th.className = "hidere2";
    let th11 = th.insertCell(0);
    th11.innerHTML = "APPLICATION ID";
    let th22 = th.insertCell(1);
    th22.innerHTML = "PATIENT ID";
    let th33 = th.insertCell(2);
    th33.innerHTML = "USER NAME";
    let th44 = th.insertCell(3);
    th44.innerHTML = "APPOIMENT DATE";
    let th55 = th.insertCell(4);
    th55.innerHTML = "DOCTOR ID";
    let th66 = th.insertCell(5);
    th66.innerHTML = "kOSPITAL ID";
    let th67 = th.insertCell(6);
    th67.style.background = "green";
    th67.innerHTML = "STATUS";
    data.forEach(ele => {

       
            th = tBody.insertRow();
            let th1 = th.insertCell(0);
            th1.innerHTML = ele.appid;
            let th2 = th.insertCell(1);
            th2.innerHTML = ele.patientid;
            let th3 = th.insertCell(2);
            th3.innerHTML = '-';
            let th4 = th.insertCell(3);
            th4.innerHTML = ele.APPDATE;
            let th5 = th.insertCell(4);
            th5.innerHTML = ele.DID;
            let th6 = th.insertCell(5);
            th6.innerHTML = ele.HID;
            let th7 = th.insertCell(6);
            if (ele.status == 1) {
                th7.style.background = "#abf0ab";
                th7.innerHTML = "Appoiment Confirmed";
            } else {
                th7.style.background = "#e49836";
                th7.innerHTML = "waiting list";
            }

            th.className = "hidere";
        
    });

}
function datewice() {
  
    $.ajax({
        url: "http://localhost:8080/docappoimentapi ",
        type: "GET",
        dataType: "json",
        success: function (data) {

            go(data);
            console.log(data);
            // window.location.reload();


        },
        error: function (error) {
            console.log(`Error ${error}`);
        },
    });
}

function go(data) {
    
    const button = document.createElement("button");
    tBody = document.getElementById("astatus");
    tBody.className = "stable";
    data.forEach(ele => {
        
            button.className = "statusbutton";
            button.style.background = "orange";
            if (ele.status == 1) {
                button.style.background = "green";

            }
            button.style.height = "30px";
            button.style.border = "none";
            button.style.padding = "10px";
            button.style.borderRadius = "7px";
            button.style.color = "white";
            let editButton = button.cloneNode(false);
            editButton.innerText = "Accept Appoiment ";
            editButton.setAttribute("onclick", `editItem(${ele.appid})`);
            th = tBody.insertRow();
            th.style.background = "white";
            th.style.height = "80px";
            th.style.marginLeft = '50px';
            let th11 = th.insertCell(0);
            th11.innerHTML = ele.appid;
            let th22 = th.insertCell(1);
            th22.innerHTML = ele.Patientid;
            let th33 = th.insertCell(2);
            th33.innerHTML = ele.DID;
            let th44 = th.insertCell(3);
            th44.innerHTML = ele.APPDATE;
            let th55 = th.insertCell(4);
            th55.appendChild(editButton);
        


    });

}


function editItem(ana) {
    // alert(ana);
    // let senddata={
    //     app_id:ana,
    // }
    // $.ajax({
    //     url: "http://localhost:9090/makeapp",
    //     type: "GET",
    //     data: JSON.stringify(senddata),
    //     success: function (data) {
    //        console.log("go");
    //     },
    //     error: function (error) {
    //         console.log(`Error ${error}`);
    //     },
    // });

    window.location.reload();
    let dta = ana;
    $.ajax({
        url: "http://localhost:8080/makeapp",
        type: "GET",
        data: {
            message: dta,
        },                
        success: function (data) {
            
            // checkandprint(JSON.parse(data));
        },
        error: function (error) {
            console.log(error);
        },
    });
}



// function sendEmail()
//  { 
   

//      Email.send({
//         Host : "smtp.gmail.com",
//         Username : "frommailbox1@gmail.com",
//         Password : "6379808599",
//         To : 'sathyaforjob1.com',
//         From : "frommailbox1@gmail.com",
//         Subject : "Test email",
//         Body : "success"}).then( message => alert(message));
//      }






















// var image = new Image(); image.src ="back.jpg" ;
// const div3 = document.getElementById('slide1')
// const clone = div3.cloneNode(true);
// // clone.id = "slide1";
// clone.innerHTML="saaaaa";


// document.getElementById("maindiv").appendChild(clone);


function mycheckfun(){
    $.ajax({
        url: "http://localhost:8080/myapi",
        type: "GET",
                        
        success: function (data) {
console.log(data);        },
        error: function (error) {
            console.log(error);
        },
    });

}