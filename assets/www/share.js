


function exitAppPopup() {
navigator.notification.confirm(
  'Do you want to exit SelfCooking?'
, function(button) {
      if (button == 2) {
          navigator.app.exitApp();
      } 
  }
, 'Exit'
, 'No,Yes'
);  
return false;
}