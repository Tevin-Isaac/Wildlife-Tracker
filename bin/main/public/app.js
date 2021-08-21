$(document).ready(function(){
  // Animations init
  new WOW().init();
  

     var typed =new Typed(`#msg`,{
          strings:[" Your Animal has been saved ! "],
          backSpeed:70,
          typeSpeed:80,
          smartBackspace:true,
        })
  })
  
  
  function secondClick(){
  timer:4000
  Swal.fire(
    'View Animals?',
  )
  }
  
  function firstClick(){
  timer:4000
  Swal.fire(
    'Add endangered?',
  
  )
  }
  function thirdClick(){
  timer:4000
  Swal.fire(
    'Add Sighting?',
  
  )
  }
  
  
  
  
  
  
  
  // Animations init
  new WOW().init();


  $.fn.commentCards = function(){

    return this.each(function(){
  
      var $this = $(this),
          $cards = $this.find('.card'),
          $current = $cards.filter('.card--current'),
          $next;
  
      $cards.on('click',function(){
        if ( !$current.is(this) ) {
          $cards.removeClass('card--current card--out card--next');
          $current.addClass('card--out');
          $current = $(this).addClass('card--current');
          $next = $current.next();
          $next = $next.length ? $next : $cards.first();
          $next.addClass('card--next');
        }
      });
  
      if ( !$current.length ) {
        $current = $cards.last();
        $cards.first().trigger('click');
      }
  
      $this.addClass('cards--active');
  
    })
  
  };
  
  $('.cards').commentCards();


  $.fn.commentCards = function(){

    return this.each(function(){
  
      var $this = $(this),
          $cards = $this.find('.card'),
          $current = $cards.filter('.card--current'),
          $next;
  
      $cards.on('click',function(){
        if ( !$current.is(this) ) {
          $cards.removeClass('card--current card--out card--next');
          $current.addClass('card--out');
          $current = $(this).addClass('card--current');
          $next = $current.next();
          $next = $next.length ? $next : $cards.first();
          $next.addClass('card--next');
        }
      });
  
      if ( !$current.length ) {
        $current = $cards.last();
        $cards.first().trigger('click');
      }
  
      $this.addClass('cards--active');
  
    })
  
  };
  
  $('.cards').commentCards();