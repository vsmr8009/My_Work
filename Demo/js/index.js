//$(document).ready(function(){
//    $("p").addClass('add-color');
//});

//$(function(){
//    $("p").addClass('add-color');
//});

$(()=>{
    $('button').click(()=>{
        $("p").addClass('add-color');
    });

    $('#show').click(()=>{
        $("p").show();
    });

    $('#hide').click(()=>{
        $("p").hide();
    });

    $('button').click(()=>{
        $("p").toggle();
    });
    
});