$(function(){
    $('#selected-plays').addClass("flex");

    $('#selected-plays > li').addClass("horizontal");

    $('li.horizontal').find('li').addClass('special');

    $('td:nth-child(3)').addClass('year');

    $('tr').children(':contains(Tragedy)').first().addClass('special');
  
});