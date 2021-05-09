$(function(){
    $('#selected-plays > li').addClass("horizontal");

    $('#selected-plays li:not(.horizontal)').addClass("sublevel");

    $('a[href^="mailto:"]').addClass("mailto");

    $('a[href$=".pdf"]').addClass("pdflink");

    $('a[href^="http"][href*="henry"').addClass("henrylink");
    
    $('tr:nth-child(odd)').addClass("alt");

    //$('td:contains(Henry)').addClass("highlight");

    $('a').filter((i, a)=>a.hostname && a.hostname!==location.hostname).addClass('external');

    //$('td:contains(Henry)').nextAll().addClass('highlight'); 

    //$('td:contains(Henry)').nextAll().addBack().addClass('highlight');

    $('td:contains(Henry)').parent().children().addClass('highlight');
});