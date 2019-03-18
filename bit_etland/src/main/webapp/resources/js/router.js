"use strict";
function Session(x){
	sessionStorage.setItem('ctx',x);
	sessionStorage.setItem('js',x+'/resources/js');
	sessionStorage.setItem('img',x+'/resources/img');
	sessionStorage.setItem('css',x+'/resources/css');
	return{
		ctx : ()=>{return sessionStorage.getItem('ctx');},
		js  : ()=>{return sessionStorage.getItem('js');},
		img : ()=>{return sessionStorage.getItem('img');},
		css : ()=>{return sessionStorage.getItem('css');}
	}
}