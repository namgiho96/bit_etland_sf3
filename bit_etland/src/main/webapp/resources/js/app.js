var app = app || {};

app.path = (()=>{
	var init =x=>{
		app.session.init(x);
		alert(app.$.ctx());
		onCreate();
	};
	var onCreate = ()=>{
		
		setContentView();
		
	};
	var setContentView = ()=>{
		
	};
	return {init:init};
	
	
})();

app.session = (()=>{
	var init =x=>{
		onCreate(x);
	};
	var onCreate =x=>{
		sessionStorage.setItem('ctx',x);
		sessionStorage.setItem('img',x+'/resources/img');
		sessionStorage.setItem('js',x+'/resources/js');
		sessionStorage.setItem('ccs',x+'/resources/ccs');
		setContentView();
	};
	var setContentView =()=>{
		
	};
	
	return {init:init};
})();


app.$ = {
		ctx:()=> {return  sessionStorage.getItem('ctx')},
	  	img:()=>{return sessionStorage.getItem('img')},
	  	js:()=>{return sessionStorage.getItem('js')},
	  	css:()=>{return sessionStorage.getItem('css')}
 		};

























