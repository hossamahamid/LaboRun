/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function emailvalidate(x) {



    var fieldData = document.getElementById(x).value;
    var re = /^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$/;
    if ((re.test(fieldData) == false)||(fieldData.length <3)) {
       
        document.getElementById("erroremail").innerHTML = "Required formate example@Gmail.com";
        return false;
    }

    else {
     
        return true;
}

}