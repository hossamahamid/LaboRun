/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function stringvalidate(x) {

    var fieldData = document.getElementById(x).value;

    if (fieldData.length <3 || fieldData == "" || fieldData.length > 30) {

        document.getElementById("errorstring").innerHTML = "Required length from to 10 character";
        return false;
        
        
    } else {

        return true;

    }

}


