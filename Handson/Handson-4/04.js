$(function() {
  
        $('<a href="#top">back to top</a>').insertAfter('p:nth-child(n+4)');

        $('a').click(function () {
            $(this).after('<p>You were here.</p>');
        });

        $('div#f-author').click(function() {
            $(this).toggleClass('font');
        });

        
    
});