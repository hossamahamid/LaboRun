/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function numbervalidate(x) {



    var fieldData = document.getElementById(x).value;
    var re =/^\d+$/;
    if ((re.test(fieldData) == false)||(fieldData.length >30)||(fieldData.length <3)) {
      
        document.getElementById("errornumber").innerHTML = "Required Number";
        return false;
    }

    else {
       
        return true;
    }


}